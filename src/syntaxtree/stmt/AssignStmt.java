package syntaxtree.stmt;

import syntaxtree.Expr;
import syntaxtree.Stmt;
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
    public String printAst() {
        return "(ASSIGN_STMT "+ var.printAst() +"\n"+ expr.printAst() +")\n";
    }

}
