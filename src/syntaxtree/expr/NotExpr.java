package syntaxtree.expr;

import syntaxtree.Expr;

/**
 * Created by pjurasek on 28.02.17.
 */
public class NotExpr extends UnaryExpr {

    Expr expr;

    public NotExpr(Expr expr) {
        this.expr = expr;
    }

    @Override
    public String printAst() {
        return "(NOT "+ expr.printAst() +")";
    }
}
