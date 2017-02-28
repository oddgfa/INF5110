package syntaxtree.expr;

import syntaxtree.Expr;

/**
 * Created by pjurasek on 28.02.17.
 */
abstract class BinaryExpr extends Expr {

    Expr left;
    String op;
    Expr right;

    public BinaryExpr(Expr left, String op, Expr right) {

        this.left = left;
        this.op = op;
        this.right = right;
    }

    abstract protected String getAstName();

    @Override
    public String printAst() {
        return "("+ getAstName() +" "+ op +"\n"+ left.printAst() +" "+ right.printAst();
    }
}
