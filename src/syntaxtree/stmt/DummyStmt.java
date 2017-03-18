package syntaxtree.stmt;

import syntaxtree.Stmt;
import syntaxtree.StringUtils;

/**
 * Created by pjurasek on 28.02.17.
 */
public class DummyStmt extends Stmt {

    @Override
    public String printAst(int depth) {
        return StringUtils.repeat('\t', depth) + "(DUMMY_STMT)\n";
    }

}
