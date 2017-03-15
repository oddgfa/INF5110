package syntaxtree.expr;

import syntaxtree.Type;

/**
 * Created by pjurasek on 28.02.17.
 */
public class FloatLiteral extends LiteralExpr {

	Float name;

	public FloatLiteral (Float name){
		this.name = name;
	}

    @Override
    public String printAst() {
	return "( FLOAT_LITERAL "+ name +")";
    }
}
