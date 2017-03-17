package syntaxtree.expr;

import syntaxtree.Expr;
import syntaxtree.StringUtils;

/**
 * Created by pjurasek on 28.02.17.
 */
public abstract class BinaryExpr extends Expr {

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
    public String printAst(int depth) {
        StringBuilder sb = new StringBuilder();
        sb.append(StringUtils.repeat('\t', depth));
        sb.append("("+ getAstName() +" "+ op +"\n");
        sb.append(left.printAst(depth+1));
        sb.append("\n");
        sb.append(right.printAst(depth+1));
        sb.append("\n");
        sb.append(StringUtils.repeat('\t', depth));
        sb.append(")");

        return sb.toString();
    }
}
