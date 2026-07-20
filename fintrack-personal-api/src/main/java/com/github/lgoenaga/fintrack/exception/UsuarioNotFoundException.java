package com.github.lgoenaga.fintrack.exception;

/**
 * Excepción lanzada cuando no se encuentra un usuario.
 */
public class UsuarioNotFoundException extends RuntimeException {

    /**
     * Crea una excepción indicando que no se encontró un usuario.
     *
     * @param username nombre de usuario buscado
     */
    public UsuarioNotFoundException(String username) {
        super("No se encontró el usuario: " + username);
    }

}