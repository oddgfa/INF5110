package syntaxtree;

/**
 * Created by pjurasek on 28.02.17.
 */
abstract public class Decl extends Node {

    public String name;

    public Decl(String name) {
        this.name = name;
    }

}
