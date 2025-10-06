package br.com.loginGui.LoginIA.repository;

import br.com.loginGui.LoginIA.models.users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface usersRepository extends JpaRepository<users,Long> {
}
