package syntaxtree.decl;

import syntaxtree.Decl;
import syntaxtree.Type;

public class ParamDecl extends Decl {

    private Type type;

    public ParamDecl(String name, Type type) {
        super(name);
        this.type = type;
    }

    public String printAst() {
        return "(PARAM_DECL "+ type.printAst() +" (NAME " + name + "))";
    }
}
