package syntaxtree.expr;

import syntaxtree.StringUtils;
import syntaxtree.Type;

/**
 * Created by pjurasek on 28.02.17.
 */
public abstract class LiteralExpr extends UnaryExpr {

    abstract protected String getAstName();

    @Override
    public String printAst(int depth) {
        return "("+getAstName()+")";
    }

}
