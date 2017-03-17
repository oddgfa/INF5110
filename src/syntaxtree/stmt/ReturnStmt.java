package syntaxtree.stmt;

import syntaxtree.Expr;
import syntaxtree.Stmt;
import syntaxtree.StringUtils;

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
    public String printAst(int depth) {
        if (expr != null) {
            return StringUtils.repeat('\t', depth) + "(RETURN "+ expr.printAst(depth+1) +")\n";
        }

        return StringUtils.repeat('\t', depth) + "(RETURN)\n";
    }

}
