package syntaxtree.expr;

import syntaxtree.StringUtils;
import syntaxtree.Type;

/**
 * Created by pjurasek on 28.02.17.
 */
public class LiteralExpr extends UnaryExpr {

    @Override
    public String printAst(int depth) {
        return StringUtils.repeat('\t', depth) + "(LITERAL TODO)";
    }
}
