package syntaxtree.decl;

import syntaxtree.Decl;
import syntaxtree.Type;

public class VarDecl extends Decl {

    private Type type;

    public VarDecl(String name, Type type) {
        super(name);
        this.type = type;
    }

    public String printAst() {
        return "(VAR_DECL "+ type.printAst() +" (NAME " + name + "))";
    }
}
