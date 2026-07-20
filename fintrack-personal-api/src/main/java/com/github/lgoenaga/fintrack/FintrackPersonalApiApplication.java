package com.github.lgoenaga.fintrack;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Aplicación principal de FinTrack Personal API.
 */
@SpringBootApplication
public class FintrackPersonalApiApplication {

    public static void main(String[] args) {
        // Cargar variables del archivo .env ANTES de iniciar Spring
        Dotenv dotenv = Dotenv.configure()
                .directory("./")
                .ignoreIfMissing()
                .load();

        // Registrar las variables del .env como propiedades del sistema
        dotenv.entries().forEach(entry ->
                System.setProperty(entry.getKey(), entry.getValue())
        );

        // Iniciar Spring Boot
        SpringApplication.run(FintrackPersonalApiApplication.class, args);

        System.out.println("\n✅ " + System.getProperty("APP_NAME") + " iniciada correctamente\n");
    }
}
