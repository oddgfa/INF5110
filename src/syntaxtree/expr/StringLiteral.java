package syntaxtree.expr;

public class StringLiteral extends LiteralExpr {

	private String name;

	public StringLiteral (String name){
		this.name = name;
	}

	@Override
	protected String getAstName() {
		return "STRING_LITERAL \"" + name +"\"";
	}

	@Override
	public String getType() {
		return "string";
	}

}
