package syntaxtree.expr;

public class NullLiteral extends LiteralExpr {

	public NullLiteral() {

	}

    @Override
    protected String getAstName() {
        return "NULL_LITERAL";
    }

    @Override
    public String getType() {
        return "null";
    }

}
