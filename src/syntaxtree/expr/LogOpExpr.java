package syntaxtree.expr;

import syntaxtree.Expr;

/**
 * Created by pjurasek on 28.02.17.
 */
class LogOpExpr extends BinaryExpr {

    public LogOpExpr(Expr left, String op, Expr right) {
        super(left, op, right);
    }

    @Override
    protected String getAstName() {
        return "LOG_OP";
    }
}
