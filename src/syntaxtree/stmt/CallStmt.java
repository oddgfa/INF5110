package syntaxtree.stmt;

import syntaxtree.Expr;
import syntaxtree.Stmt;
import syntaxtree.StringUtils;
import syntaxtree.decl.ParamDecl;
import syntaxtree.decl.ProcDecl;
import syntaxtree.expr.CallExpr;
import typesystem.TypeChecker;
import typesystem.TypeError;
import java.util.Hashtable;
import java.util.List;

public class CallStmt extends Stmt {

    private String name;
    private final List<Expr> exprs;
    private String type;

    public CallStmt(String name, List<Expr> exprs) {
        this.name = name;
        this.exprs = exprs;
    }

    @Override
    public String printAst(int depth) {
        StringBuilder sb = new StringBuilder();
        sb.append(StringUtils.repeat('\t', depth));
        sb.append("(CALL_STMT (NAME ");
        sb.append(name);
        sb.append(") ");
        for (Expr expr: exprs) {
            sb.append("\n");

            if (!(expr instanceof CallExpr)) {
                sb.append(StringUtils.repeat('\t', depth+1));
            }

            sb.append(expr.printAst(depth+1));
        }
        sb.append("\n");
        sb.append(StringUtils.repeat('\t', depth));
        sb.append(")\n");
        return sb.toString();

    }

    @Override
    public void typeCheck(Hashtable<String, String> types, Hashtable<String, ProcDecl> procedures) throws TypeError {
//        System.out.println("calling "+ this.name);
//        System.out.println(types);

        if (!procedures.containsKey(this.name)) {
            throw new TypeError("Call to an undefined procedure " + this.name);
        }

        ProcDecl procedure = procedures.get(this.name);

        List<ParamDecl> params = procedure.getParams();

        int i = 0;
        for (Expr expr : exprs) {
            expr.setType(types);

            if (expr instanceof CallExpr) {
                ((CallExpr) expr).getCallStmt().typeCheck(types, procedures);
            }

            if (!TypeChecker.isValid(params.get(i).getType(), expr.getType())) {
                throw new TypeError(this.name +": Parameter "+ (i+1) +" must be of type "+ params.get(i).getType() +", "+ expr.getType() +" given.");
            }

            i++;
        }

        this.type = types.get(this.name);


    }

    @Override
    public String getType() {
        return this.type;
    }

}
