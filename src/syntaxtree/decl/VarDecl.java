package syntaxtree.decl;

import syntaxtree.Decl;
import syntaxtree.StringUtils;
import syntaxtree.Type;
import typesystem.TypeAware;
import typesystem.TypeError;

import java.util.Hashtable;

public class VarDecl extends Decl implements TypeAware {

    private Type type;

    public VarDecl(String name, Type type) {
        super(name);
        this.type = type;
    }

    public String printAst(int depth) {
        return StringUtils.repeat('\t', depth) + "(VAR_DECL "+ type.printAst(depth+1) +" (NAME " + name + "))";
    }

    @Override
    public String getType() {
        return type.get();
    }

    @Override
    public void typeCheck(Hashtable<String, String> types, Hashtable<String, ProcDecl> procedures) throws TypeError {
        // no need to check
        types.put(name, getType());
    }

}
