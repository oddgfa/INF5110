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
    public String printAst(int depth) {
	return StringUtils.repeat('\t', depth) + "(STRING_LITERAL "+ name +")";
    }
}
