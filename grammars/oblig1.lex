package oblig1parser;
import java_cup.runtime.*;
%%

%class Lexer
%unicode
%cup
%line
%column
%public
%{
 StringBuffer string = new StringBuffer();

  private Symbol symbol(int type) {
    return new Symbol(type, yyline, yycolumn);
  }
  private Symbol symbol(int type, Object value) {
    return new Symbol(type, yyline, yycolumn, value);
  }

%}
LineTerminator = \r|\n|\r\n
NonLineTerminator = [^\r\n]
WhiteSpace = {LineTerminator} | [ \t\f]
Comment = "//" {NonLineTerminator}* {LineTerminator}?
Identifier = [:jletter:] [:jletterdigit:]*

DecIntegerLiteral = 0 | [1-9][0-9]*
FloatLiteral = {DecIntegerLiteral} \. {DecIntegerLiteral}

SpecialCharacter = \n | \r | \f | \t

%state STRING

%%
<YYINITIAL>{
        {WhiteSpace}                    {}

        /* keywords */
        "program"                       { return symbol(sym.PROGRAM); }
        "class"                         { return symbol(sym.CLASS); }
        "begin"                         { return symbol(sym.BEGIN); }
        "end"                           { return symbol(sym.END); }
        "var"                           { return symbol(sym.VAR); }
        "proc"                          { return symbol(sym.PROCEDURE); }
        "return"                        { return symbol(sym.RETURN); }
        "ref"                           { return symbol(sym.REF); }
        "deref"                         { return symbol(sym.DEREF); }
        "if"                            { return symbol(sym.IF); }
        "then"                          { return symbol(sym.THEN); }
        "else"                          { return symbol(sym.ELSE); }
        "while"                         { return symbol(sym.WHILE); }
        "do"                            { return symbol(sym.DO); }

        /* types */
        "float"                         { return symbol(sym.TYPE_FLOAT); }
        "int"                           { return symbol(sym.TYPE_INT); }
        "string"                        { return symbol(sym.TYPE_STRING); }
        "bool"                          { return symbol(sym.TYPE_BOOL); }

        /* symbols */
        "("                             { return symbol(sym.LPAR); }
        ")"                             { return symbol(sym.RPAR); }
        ";"                             { return symbol(sym.SEMI); }
        ":"                             { return symbol(sym.COLON); }
        "."                             { return symbol(sym.DOT); }
        ","                             { return symbol(sym.COMMA); }

        ":="                            { return symbol(sym.ASSIGN); }

        "&&"                            { return symbol(sym.LOG_AND); }
        "||"                            { return symbol(sym.LOG_OR); }

        "<"                             { return symbol(sym.REL_LT); }
        "<="                            { return symbol(sym.REL_LTE); }
        ">"                             { return symbol(sym.REL_GT); }
        ">="                            { return symbol(sym.REL_GTE); }
        "="                             { return symbol(sym.REL_EQ); }
        "<>"                            { return symbol(sym.REL_NEQ); }

        "+"                             { return symbol(sym.ARIT_PLUS); }
        "-"                             { return symbol(sym.ARIT_MINUS); }
        "*"                             { return symbol(sym.ARIT_MUL); }
        "/"                             { return symbol(sym.ARIT_DIV); }
        "#"                             { return symbol(sym.ARIT_POW); }


        /* identifiers */
        {Identifier}                    { return symbol(sym.ID,yytext()); }

        /* literals */
        \"                              { string.setLength(0); yybegin(STRING); }
        {FloatLiteral}                  { return symbol(sym.FLOAT_LITERAL); } // todo: pass value
        {DecIntegerLiteral}             { return symbol(sym.INT_LITERAL); } // todo: pass value
        "true"                          { return symbol(sym.TRUE); } // todo: merge with false and create BOOL token with value?
        "false"                         { return symbol(sym.FALSE); }
        "null"                          { return symbol(sym.NULL); }
}

<STRING> {
        \"                             { yybegin(YYINITIAL); return symbol(sym.STRING_LITERAL, string.toString()); }

        [^\n\r\f\t\"\\]+               { string.append( yytext() ); }

        \\\"                           { string.append('\"'); }
        \\                             { string.append('\\'); }

        {SpecialCharacter}             { throw new Error("Illegal character '" + yytext() + "' in string literal at line " + yyline + ", column " + yycolumn + "."); }
}

.                           { throw new Error("Illegal character '" + yytext() + "' at line " + yyline + ", column " + yycolumn + "."); }
