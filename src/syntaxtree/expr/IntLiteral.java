package syntaxtree.expr;

import syntaxtree.StringUtils;
import syntaxtree.Type;

/**
 * Created by pjurasek on 28.02.17.
 */
public class IntLiteral extends LiteralExpr {

	Integer name;

	public IntLiteral (Integer name){
		this.name = name;
	}

	@Override
	protected String getAstName() {
		return "INT_LITERAL " + name;
	}

}
