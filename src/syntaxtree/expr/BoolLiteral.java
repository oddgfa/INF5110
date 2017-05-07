package syntaxtree.expr;

public class BoolLiteral extends LiteralExpr {

	private Boolean name;

	public BoolLiteral (Boolean name){
		this.name = name;
	}

	@Override
	protected String getAstName() {
		return "BOOL_LITERAL " + name;
	}

	@Override
	public String getType() {
		return "bool";
	}

}
