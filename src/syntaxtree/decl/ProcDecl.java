package syntaxtree.decl;

import syntaxtree.Decl;
import syntaxtree.Stmt;
import syntaxtree.Type;

import java.util.List;

public class ProcDecl extends Decl {

    private final List<ParamDecl> params;
    private final List<Stmt> stmts;
    Type returnType;

    public ProcDecl(String name, List<ParamDecl> params, List<Stmt> stmts) {
        super(name);
        this.params = params;
        this.stmts = stmts;
    }

    public ProcDecl(String name, List<ParamDecl> params, List<Stmt> stmts, Type returnType) {
        super(name);
        this.params = params;
        this.stmts = stmts;
        this.returnType = returnType;
    }

    public String printAst() {
        StringBuilder sb = new StringBuilder();
        sb.append("(PROC_DECL ");

        if (returnType != null) {
            sb.append(returnType.printAst());
            sb.append(" ");
        }

        sb.append("(NAME ");
        sb.append(this.name);
        sb.append(")\n");

        for (ParamDecl param: params) {
            sb.append("\t").append(param.printAst());
            sb.append("\n");
        }
        sb.append(")");

        for (Stmt stmt: stmts) {
            sb.append("\t").append(stmt.printAst());
            sb.append("\n");
        }
        sb.append(")");

        return sb.toString();
    }
}
