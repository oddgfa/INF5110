package syntaxtree.decl;

import syntaxtree.Decl;
import syntaxtree.Stmt;
import syntaxtree.StringUtils;
import syntaxtree.Type;

import java.util.LinkedList;
import java.util.List;

public class ProcDecl extends Decl {

    private final List<ParamDecl> params;
    private final List<Decl> decls;
    private final List<Stmt> stmts;
    private Type returnType;

    public ProcDecl(String name) {
        super(name);
        params = new LinkedList<ParamDecl>();
        decls = new LinkedList<Decl>();
        stmts = new LinkedList<Stmt>();
    }

    public ProcDecl(String name, List<ParamDecl> params) {
        super(name);
        this.params = params;
        decls = new LinkedList<Decl>();
        stmts = new LinkedList<Stmt>();
    }

    public ProcDecl(String name, List<ParamDecl> params, List<Decl> decls) {
        super(name);
        this.params = params;
        this.decls = decls;
        stmts = new LinkedList<Stmt>();
    }

    public ProcDecl(String name, List<ParamDecl> params, List<Decl> decls, List<Stmt> stmts) {
        super(name);
        this.params = params;
        this.decls = decls;
        this.stmts = stmts;
    }

    public ProcDecl(String name, List<ParamDecl> params, List<Decl> decls, List<Stmt> stmts, Type returnType) {
        super(name);
        this.params = params;
        this.decls = decls;
        this.stmts = stmts;
        this.returnType = returnType;
    }

    public String printAst(int depth) {
        StringBuilder sb = new StringBuilder();

        if (depth > 1) { // nested procedure
            sb.append(StringUtils.repeat('\t', depth));
        }
        sb.append("(PROC_DECL ");

        if (returnType != null) {
            sb.append(returnType.printAst(depth+1));
            sb.append(" ");
        }

        sb.append("(NAME ");
        sb.append(this.name);
        sb.append(")\n");

        if (params.size() > 0) {
            for (ParamDecl param : params) {
                sb.append(param.printAst(depth+1));
                sb.append("\n");
            }
            sb.append("\n");
        }

        if (decls.size() > 0) {
            for (Decl decl : decls) {
                sb.append(decl.printAst(depth+1));
                sb.append("\n");
            }
            sb.append("\n");
        }

        if (stmts.size() > 0) {
            for (Stmt stmt : stmts) {
                sb.append(stmt.printAst(depth+1));
                sb.append("\n");
            }
        }

        sb.append(StringUtils.repeat('\t', depth));
        sb.append(")");

        return sb.toString();
    }
}
