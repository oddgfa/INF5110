package syntaxtree.expr;

import syntaxtree.StringUtils;

/**
 * Created by pjurasek on 28.02.17.
 */
public class BoolLiteral extends LiteralExpr {

	Boolean name;

	public BoolLiteral (Boolean name){
		this.name = name;
	}

	@Override
	protected String getAstName() {
		return "BOOL_LITERAL " + name;
	}

}
