package com.github.lgoenaga.fintrack.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Manejador global de excepciones de la aplicación.
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    /**
     * Maneja la excepción cuando un usuario no es encontrado.
     *
     * @param exception excepción lanzada
     * @return detalle del problema
     */
    @ExceptionHandler(UsuarioNotFoundException.class)
    public ProblemDetail handleUsuarioNotFoundException(
            UsuarioNotFoundException exception
    ) {

        ProblemDetail problemDetail =
                ProblemDetail.forStatus(HttpStatus.NOT_FOUND);

        problemDetail.setTitle("Usuario no encontrado");
        problemDetail.setDetail(exception.getMessage());

        return problemDetail;
    }

}