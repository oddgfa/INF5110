package syntaxtree.expr;

import syntaxtree.StringUtils;

/**
 * Created by pjurasek on 28.02.17.
 */
public class DerefVarExpr extends UnaryExpr {

    VarExpr expr;

    public DerefVarExpr(VarExpr expr) {
        this.expr = expr;
    }

    @Override
    public String printAst(int depth) {
        return StringUtils.repeat('\t', depth) + "(DEREF "+ expr.printAst(depth+1) +")";
    }
}
