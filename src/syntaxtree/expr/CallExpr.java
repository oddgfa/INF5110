package syntaxtree.expr;

import syntaxtree.Expr;
import syntaxtree.stmt.CallStmt;

public class CallExpr extends UnaryExpr {

    CallStmt callStmt;

    public CallExpr(CallStmt callStmt) {
        this.callStmt = callStmt;
    }

    @Override
    public String printAst(int depth) {
        return callStmt.printAst(depth);
    }
}
