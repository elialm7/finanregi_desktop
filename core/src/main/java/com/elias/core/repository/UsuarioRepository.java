package com.elias.core.repository;

import com.elias.core.Exceptions.UsuarioNoValidoException;
import com.elias.core.dto.UsuarioValidadoDTO;
import com.elias.core.dto.UsuarioValidarDTO;
import com.elias.core.model.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class UsuarioRepository {

    private EntityManager entityManager;

   public UsuarioRepository(EntityManager entityManager) {
       Objects.requireNonNull(entityManager, "EntityManager no puede ser nulo");
       this.entityManager = entityManager;
   }


    public Optional<Usuario> findUsuario(UsuarioValidarDTO usuarioValidaDTO) {

        try{

            TypedQuery<Usuario> query =  this.entityManager.createQuery("SELECT u FROM Usuario u WHERE u.username = :username", Usuario.class);
            query.setParameter("username", usuarioValidaDTO.username());

            List<Usuario> usuarios = query.getResultList();

            if(usuarios.isEmpty()){
                return Optional.empty();
            }

            Usuario usuario = usuarios.get(0);

            return Optional.of(usuario);

        }catch (Exception e){
            if(this.entityManager.getTransaction().isActive()) {
                this.entityManager.getTransaction().rollback();
            }
        }
        return Optional.empty();
    }


}
