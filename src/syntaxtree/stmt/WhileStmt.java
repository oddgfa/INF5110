package syntaxtree.stmt;

import syntaxtree.Expr;
import syntaxtree.Stmt;

import java.util.List;

/**
 * Created by pjurasek on 28.02.17.
 */
public class WhileStmt extends Stmt {

    Expr expr;
    private final List<Stmt> stmts;

    public WhileStmt(Expr expr, List<Stmt> stmts) {
        this.expr = expr;
        this.stmts = stmts;
    }

    @Override
    public String printAst() {
        StringBuilder sb = new StringBuilder();
        sb.append("(WHILE_STMT ");
        sb.append(expr.printAst());
        sb.append(")\n");
        for (Stmt stmt: stmts) {
            sb.append("\t").append(stmt.printAst());
            sb.append("\n");
        }
        sb.append(")");
        return sb.toString();

    }

}
