package syntaxtree.expr;

import syntaxtree.StringUtils;
import syntaxtree.Type;

/**
 * Created by pjurasek on 28.02.17.
 */
public class StringLiteral extends LiteralExpr {

	String name;

	public StringLiteral (String name){
		this.name = name;
	}

	@Override
	protected String getAstName() {
		return "STRING_LITERAL \"" + name +"\"";
	}

}
