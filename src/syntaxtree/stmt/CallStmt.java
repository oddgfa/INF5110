package syntaxtree.stmt;

import syntaxtree.Expr;
import syntaxtree.Stmt;
import syntaxtree.StringUtils;
import syntaxtree.expr.CallExpr;

import java.util.List;

/**
 * Created by pjurasek on 28.02.17.
 */
public class CallStmt extends Stmt {

    String name;
    private final List<Expr> exprs;

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

}
