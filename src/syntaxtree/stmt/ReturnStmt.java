package syntaxtree.stmt;

import syntaxtree.Expr;
import syntaxtree.Stmt;

/**
 * Created by pjurasek on 28.02.17.
 */
public class ReturnStmt extends Stmt {

    Expr expr;

    public ReturnStmt(Expr expr) {
        this.expr = expr;
    }

    public ReturnStmt() {

    }

    @Override
    public String printAst() {
        if (expr != null) {
            return "(RETURN "+ expr.printAst() +")\n";
        }

        return "(RETURN)\n";
    }

}
