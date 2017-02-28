package syntaxtree;

/**
 * Created by pjurasek on 28.02.17.
 */
public class Name implements PrintAst {

    String value;

    public Name(String value) {
        this.value = value;
    }

    @Override
    public String printAst() {
        return "(NAME"+ value +")";
    }
}
