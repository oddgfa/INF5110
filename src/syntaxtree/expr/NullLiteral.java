package syntaxtree.expr;

import syntaxtree.Type;

/**
 * Created by pjurasek on 28.02.17.
 */
public class NullLiteral extends LiteralExpr {

	public NullLiteral (){
	
	}
    @Override
    public String printAst() {
	return "( NULL_LITERAL )";
    }
}
