package syntaxtree.expr;

public class FloatLiteral extends LiteralExpr {

	private Float name;

	public FloatLiteral (Float name){
		this.name = name;
	}

	@Override
	protected String getAstName() {
		return "FLOAT_LITERAL " + name;
	}

	@Override
	public String getType() {
		return "float";
	}

}
