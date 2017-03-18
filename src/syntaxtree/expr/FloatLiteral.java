package syntaxtree.expr;

import syntaxtree.StringUtils;
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
    public String printAst(int depth) {
		return StringUtils.repeat('\t', depth) + "(FLOAT_LITERAL "+ name +")";
    }
}
