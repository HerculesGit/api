package br.com.software.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.software.api.model.User;


//serve para criar nossa persistencia, sem usar DAO, Persistence...
//Ele contem vários métodos prontos para a gente, precisamos apenas criar uma instancia
//JpaRepository<ENTIDADE, TIPO_ID>
public interface UserRepository extends JpaRepository<User, Long> {
	
	User findById(long id);
}
