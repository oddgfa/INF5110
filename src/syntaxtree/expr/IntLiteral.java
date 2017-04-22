package syntaxtree.expr;

public class IntLiteral extends LiteralExpr {

	private Integer name;

	public IntLiteral (Integer name){
		this.name = name;
	}

	@Override
	protected String getAstName() {
		return "INT_LITERAL " + name;
	}

	@Override
	public String getType() {
		return "int";
	}

}
