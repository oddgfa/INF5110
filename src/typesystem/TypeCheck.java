package typesystem;

import syntaxtree.decl.ProcDecl;

import java.util.Hashtable;

public interface TypeCheck {

    void typeCheck(Hashtable<String, String> types, Hashtable<String, ProcDecl> procedures) throws TypeError;

}
