package syntaxtree;

import typesystem.TypeAware;
import typesystem.TypeCheck;

abstract public class Decl extends Node implements TypeAware, TypeCheck {

    public String name;

    public Decl(String name) {
        this.name = name;
    }

}
