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

    @Override
    public String printAst() {
        if (expr != null) {
            return "( . "+ expr.printAst() +" (NAME "+ name +"))";
        } else {
            return "(NAME "+ name +")";
        }
    }
}
