package syntaxtree.decl;

import syntaxtree.Decl;
import syntaxtree.StringUtils;
import syntaxtree.Type;

public class ParamDecl extends Decl {

    private Type type;

    public ParamDecl(String name, Type type) {
        super(name);
        this.type = type;
    }

    public String printAst(int depth) {
        return StringUtils.repeat('\t', depth) + "(PARAM_DECL "+ type.printAst(depth+1) +" (NAME " + name + "))";
    }
}
