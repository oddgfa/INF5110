package syntaxtree.expr;

/**
 * Created by pjurasek on 28.02.17.
 */
public class RefExpr extends UnaryExpr {

    VarExpr var;

    public RefExpr(VarExpr var) {
        this.var = var;
    }

    @Override
    public String printAst() {
        return "(REF "+ var.name +")";
    }
}
