package br.com.gabryelbele.todolist.repository;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import br.com.gabryelbele.todolist.models.UserModel;

public interface IUserRepository extends JpaRepository<UserModel, UUID>{
   UserModel findByUsername(String username);
}
