package syntaxtree;

/**
 * Created by pjurasek on 28.02.17.
 */
public class RefType extends Type {

    private Type type;

    public RefType(Type type) {
        this.type = type;
    }

    @Override
    public String get() {
        return "(REF " + this.type.get() + ")\n";
    }

    @Override
    public String printAst(int depth) {
        return StringUtils.repeat('\t', depth) + this.type.get();
    }
}
