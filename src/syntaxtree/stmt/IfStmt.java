package syntaxtree.stmt;

import syntaxtree.Expr;
import syntaxtree.Stmt;

import java.util.List;

/**
 * Created by pjurasek on 28.02.17.
 */
public class IfStmt extends Stmt {

    Expr expr;
    private final List<Stmt> thenStmts;
    private final List<Stmt> elseStmts;

    public IfStmt(Expr expr, List<Stmt> thenStmts, List<Stmt> elseStmts) {
        this.expr = expr;
        this.thenStmts = thenStmts;
        this.elseStmts = elseStmts;
    }

    @Override
    public String printAst() {
        StringBuilder sb = new StringBuilder();
        sb.append("(IF_STMT ");
        sb.append(expr.printAst());
        sb.append(")\n");
        for (Stmt stmt: thenStmts) {
            sb.append("\t").append(stmt.printAst());
            sb.append("\n");
        }
        sb.append(")\n");

        for (Stmt stmt: elseStmts) {
            sb.append("\t").append(stmt.printAst());
            sb.append("\n");
        }
        sb.append(")");
        return sb.toString();

    }

}
