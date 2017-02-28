package syntaxtree;

/**
 * Created by pjurasek on 28.02.17.
 */
public class Type extends Node {

    private Name name;

    private String stringName;


    public Type(String name) {
        stringName = name;
    }

    public Type(Name name) {
        this.name = name;
    }

    Type() {
    }

    public String get() {
        if (name != null) {
            return name.value;
        }

        return stringName;
    }

    @Override
    public String printAst() {
        return "(TYPE " + this.get() + ")";
    }
}
