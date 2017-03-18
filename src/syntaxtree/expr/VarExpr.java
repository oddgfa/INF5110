package syntaxtree.expr;

import syntaxtree.Expr;

/**
 * Created by pjurasek on 28.02.17.
 */
public class VarExpr extends UnaryExpr {

    String name;

    Expr expr;

    public VarExpr(String name) {
        this.name = name;
    }

    public VarExpr(String name, Expr expr) {
        this.name = name;
        this.expr = expr;
    }

    protected VarExpr() {
    }

    @Override
    public String printAst(int depth) {
        if (expr != null) {
            return "( . "+ expr.printAst(depth+1) +" (NAME "+ name +"))";
        } else {
            return "(NAME "+ name +")";
        }
    }
}
