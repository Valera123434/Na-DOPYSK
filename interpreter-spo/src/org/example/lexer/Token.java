package org.example.lexer;

public class Token {
    private String value;
    private Types type;

    public Token(String value, Types type) {
        this.value = value;
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public Types getType() {
        return type;
    }

    public void setType(Types type) {
        this.type = type;
    }
}
