package syntaxtree.expr;

import syntaxtree.StringUtils;
import syntaxtree.Type;

/**
 * Created by pjurasek on 28.02.17.
 */
public class NullLiteral extends LiteralExpr {

	public NullLiteral (){
	
	}

    @Override
    protected String getAstName() {
        return "NULL_LITERAL";
    }

}
