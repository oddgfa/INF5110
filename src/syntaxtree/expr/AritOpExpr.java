package syntaxtree.expr;

import syntaxtree.Expr;
import typesystem.TypeChecker;
import typesystem.TypeError;
import java.util.Hashtable;

public class AritOpExpr extends BinaryExpr {

    public AritOpExpr(Expr left, String op, Expr right) {
        super(left, op, right);
    }

    @Override
    protected String getAstName() {
        return "ARIT_OP";
    }

    @Override
    public String getType() {
        return left.getType();
    }

    @Override
    public void setType(String type) {

    }

    @Override
    public void setType(Hashtable<String, String> types) throws TypeError {
        left.setType(types);
        right.setType(types);

        if (!TypeChecker.isValid(left.getType(), right.getType())) {
            throw new TypeError("Invalid arithmetic operation arguments: "+ left.getType() +" and "+ right.getType());
        }
    }

}
