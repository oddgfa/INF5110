package syntaxtree.stmt;

import syntaxtree.Expr;
import syntaxtree.Stmt;

import java.util.List;

/**
 * Created by pjurasek on 28.02.17.
 */
public class CallStmt extends Stmt {

    String name;
    private final List<Expr> exprs;

    public CallStmt(String name, List<Expr> exprs) {
        this.name = name;
        this.exprs = exprs;
    }

    @Override
    public String printAst() {
        StringBuilder sb = new StringBuilder();
        sb.append("(CALL_STMT ");
        sb.append(name);
        sb.append(" ");
        for (Expr expr: exprs) {
            sb.append("\t").append(expr.printAst());
            sb.append("\n");
        }
        sb.append(")\n");
        return sb.toString();

    }

}
