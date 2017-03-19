package syntaxtree.expr;

import syntaxtree.StringUtils;

/**
 * Created by pjurasek on 28.02.17.
 */
public class DerefVarExpr extends VarExpr {

    public DerefVarExpr(VarExpr var) {
        this.expr = var;
    }

    @Override
    public String printAst(int depth) {
        return "(DEREF "+ expr.printAst(depth+1) +")";
    }
}
