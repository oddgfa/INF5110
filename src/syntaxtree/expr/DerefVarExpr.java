package syntaxtree.expr;

/**
 * Created by pjurasek on 28.02.17.
 */
public class DerefVarExpr extends UnaryExpr {

    VarExpr expr;

    public DerefVarExpr(VarExpr expr) {
        this.expr = expr;
    }

    @Override
    public String printAst() {
        return "( DEREF "+ expr.printAst() +")";
    }
}
