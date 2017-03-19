package syntaxtree.stmt;

import syntaxtree.Expr;
import syntaxtree.Stmt;
import syntaxtree.StringUtils;
import syntaxtree.expr.VarExpr;

/**
 * Created by pjurasek on 28.02.17.
 */
public class AssignStmt extends Stmt {

    VarExpr var;

    Expr expr;

    public AssignStmt(VarExpr var, Expr expr) {
        this.var = var;
        this.expr = expr;
    }

    @Override
    public String printAst(int depth) {
        StringBuilder sb = new StringBuilder();
        sb.append(StringUtils.repeat('\t', depth));
        sb.append("(ASSIGN_STMT\n");
        sb.append(StringUtils.repeat('\t', depth+1));
        sb.append(var.printAst(depth+1));
        sb.append("\n");
        sb.append(StringUtils.repeat('\t', depth+1));
        sb.append(expr.printAst(depth+1));
        sb.append("\n");
        sb.append(StringUtils.repeat('\t', depth));
        sb.append(")");

        return sb.toString();
    }

}
