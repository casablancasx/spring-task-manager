package br.com.danilo.springtaskmanager.repository;

import br.com.danilo.springtaskmanager.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, UUID> {

    UserDetails loadUserByEmail(String email);
}
