package syntaxtree.decl;

import syntaxtree.Decl;

import java.util.LinkedList;
import java.util.List;

public class ClassDecl extends Decl {

    private final List<VarDecl> vars;

    public ClassDecl(String name, List<VarDecl> vars) {
        super(name);
        this.vars = vars;
    }

    public ClassDecl(String name) {
        this(name, new LinkedList<VarDecl>());
    }

    public String printAst() {
        StringBuilder sb = new StringBuilder();
        sb.append("(CLASS_DECL ");
        sb.append("(NAME ");
        sb.append(this.name);
        sb.append(")");
        for (VarDecl var: vars) {
            sb.append("\n\t").append(var.printAst());
        }
        sb.append(")");
        return sb.toString();
    }
}
