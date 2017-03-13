package syntaxtree.stmt;

import syntaxtree.Stmt;

/**
 * Created by pjurasek on 28.02.17.
 */
public class DummyStmt extends Stmt {

    @Override
    public String printAst() {
        return "(DUMMY_STMT)\n";
    }

}
