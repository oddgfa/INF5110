package syntaxtree.decl;

import syntaxtree.Decl;
import syntaxtree.StringUtils;

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

    public String printAst(int depth) {
        StringBuilder sb = new StringBuilder();
        sb.append("(CLASS_DECL ");
        sb.append("(NAME ");
        sb.append(this.name);
        sb.append(")");
        for (VarDecl var: vars) {
            sb.append("\n");
            sb.append(var.printAst(depth+1));
        }

        if (vars.size() > 0) {
            sb.append("\n");
            sb.append(StringUtils.repeat('\t', depth));
        }

        sb.append(")");
        return sb.toString();
    }
}
