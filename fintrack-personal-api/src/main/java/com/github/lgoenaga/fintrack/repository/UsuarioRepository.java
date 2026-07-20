package com.github.lgoenaga.fintrack.repository;

import com.github.lgoenaga.fintrack.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

/**
 * Repositorio encargado del acceso a datos de usuarios.
 */
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, UUID> {

    /**
     * Busca un usuario por nombre de usuario.
     *
     * @param username nombre de usuario
     * @return usuario encontrado
     */
    Optional<Usuario> findByUsername(String username);

}