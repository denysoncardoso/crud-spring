package com.teste.crudspring.Users;

public enum UserTipo {

    ADMIN("ADMIN"),
    USER("USER");

    private final String tipo;

    UserTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
}
