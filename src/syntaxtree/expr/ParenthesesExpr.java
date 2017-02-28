package syntaxtree.expr;

import syntaxtree.Expr;

/**
 * Created by pjurasek on 28.02.17.
 */
public class ParenthesesExpr extends UnaryExpr {

    Expr expr;

    public ParenthesesExpr(Expr expr) {
        this.expr = expr;
    }

    @Override
    public String printAst() {
        return "(PARENTHESES "+ expr.printAst() +")";
    }
}
