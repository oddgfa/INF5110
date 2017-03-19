package syntaxtree.expr;

import syntaxtree.Type;

/**
 * Created by pjurasek on 28.02.17.
 */
public class NewExpr extends UnaryExpr {

    Type type;

    public NewExpr(Type type) {
        this.type = type;
    }

    @Override
    public String printAst(int depth) {
        return "(NEW "+ type.printAst(depth+1) +")";
    }
}
