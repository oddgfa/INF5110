package syntaxtree.expr;

import syntaxtree.StringUtils;

/**
 * Created by pjurasek on 28.02.17.
 */
public class RefExpr extends UnaryExpr {

    VarExpr var;

    public RefExpr(VarExpr var) {
        this.var = var;
    }

    @Override
    public String printAst(int depth) {
        return StringUtils.repeat('\t', depth) + "(REF "+ var.name +")";
    }
}
