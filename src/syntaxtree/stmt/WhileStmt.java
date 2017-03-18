package syntaxtree.stmt;

import syntaxtree.Expr;
import syntaxtree.Stmt;
import syntaxtree.StringUtils;

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
    public String printAst(int depth) {
        StringBuilder sb = new StringBuilder();
        sb.append(StringUtils.repeat('\t', depth));
        sb.append("(WHILE_STMT\n");
        sb.append(expr.printAst(depth+1));
        for (Stmt stmt: stmts) {
            sb.append("\t").append(stmt.printAst(depth+1));
            sb.append("\n");
        }
        sb.append("\n");
        sb.append(StringUtils.repeat('\t', depth));
        sb.append(")\n");
        return sb.toString();

    }

}
