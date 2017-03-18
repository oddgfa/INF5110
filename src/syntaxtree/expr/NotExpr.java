package syntaxtree.expr;

import syntaxtree.Expr;
import syntaxtree.StringUtils;

/**
 * Created by pjurasek on 28.02.17.
 */
public class NotExpr extends UnaryExpr {

    Expr expr;

    public NotExpr(Expr expr) {
        this.expr = expr;
    }

    @Override
    public String printAst(int depth) {
        StringBuilder sb = new StringBuilder();
        sb.append(StringUtils.repeat('\t', depth));
        sb.append("(NOT \n");
        sb.append(expr.printAst(depth+1));
        sb.append("\n");
        sb.append(StringUtils.repeat('\t', depth));
        sb.append(")");

        return sb.toString();
    }
}
