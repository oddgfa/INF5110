package syntaxtree.stmt;

import syntaxtree.Expr;
import syntaxtree.Stmt;
import syntaxtree.StringUtils;
import syntaxtree.decl.ProcDecl;
import syntaxtree.expr.VarExpr;
import typesystem.TypeChecker;
import typesystem.TypeError;
import java.util.Hashtable;

public class AssignStmt extends Stmt {

    private VarExpr var;

    private Expr expr;

    public AssignStmt(VarExpr var, Expr expr) {
        this.var = var;
        this.expr = expr;
    }

    @Override
    public String printAst(int depth) {
        StringBuilder sb = new StringBuilder();
        sb.append(StringUtils.repeat('\t', depth));
        sb.append("(ASSIGN_STMT\n");
        sb.append(StringUtils.repeat('\t', depth+1));
        sb.append(var.printAst(depth+1));
        sb.append("\n");
        sb.append(StringUtils.repeat('\t', depth+1));
        sb.append(expr.printAst(depth+1));
        sb.append("\n");
        sb.append(StringUtils.repeat('\t', depth));
        sb.append(")");

        return sb.toString();
    }

    @Override
    public void typeCheck(Hashtable<String, String> types, Hashtable<String, ProcDecl> procedures) throws TypeError {
        var.setType(types);
        expr.setType(types);

        if (!TypeChecker.isValid(var.getType(), expr.getType())) {
            throw new TypeError(expr.getType() +" cannot be assigned to "+ var.getType());
        }
    }

    @Override
    public String getType() {
        return var.getType();
    }

}
