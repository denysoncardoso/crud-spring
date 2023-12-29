package com.teste.crudspring.DTO;

import com.teste.crudspring.Users.UserTipo;

public record RegisterDTO(String login, String password, UserTipo tipo) {
}
