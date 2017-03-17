package syntaxtree.stmt;

import syntaxtree.Expr;
import syntaxtree.Stmt;
import syntaxtree.StringUtils;

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
    public String printAst(int depth) {
        StringBuilder sb = new StringBuilder();
        sb.append(StringUtils.repeat('\t', depth));
        sb.append("(IF_STMT\n");
        sb.append(expr.printAst(depth+1));
        for (Stmt stmt: thenStmts) {
            sb.append("\t").append(stmt.printAst(depth+1));
            sb.append("\n");
        }

        for (Stmt stmt: elseStmts) {
            sb.append("\t").append(stmt.printAst(depth+1));
            sb.append("\n");
        }
        sb.append("\n");
        sb.append(StringUtils.repeat('\t', depth));
        sb.append(")\n");
        return sb.toString();

    }

}
