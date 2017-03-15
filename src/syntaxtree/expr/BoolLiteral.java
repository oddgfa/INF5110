package syntaxtree.expr;

import syntaxtree.Type;

/**
 * Created by pjurasek on 28.02.17.
 */
public class BoolLiteral extends LiteralExpr {

	Boolean name;
	
	public BoolLiteral (Boolean name){
		this.name = name;	
	}

    @Override
    public String printAst() {
	return "( BOOL_LITERAL "+ name.printAst() +")";
    }
}
