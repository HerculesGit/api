package br.com.software.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.software.api.model.User;
import br.com.software.api.repository.UserRepository;

@RestController
@RequestMapping(value = "/api")
@CrossOrigin(origins = "*")
public class UserController {

	@Autowired
	UserRepository userRepository;

	@GetMapping("/users")
	public List<User> getUsers() {
		return userRepository.findAll();
	}

//	@GetMapping("/users/{id}")
//	public User listaProdutoUnico(@PathVariable(value = "id") long id) {
//		return userRepository.findById(id);
//	}

	@PostMapping("/users") // o que vamos mandar no corpo da requisicao
	public User addUser(@RequestBody User user) {
		return userRepository.save(user);
	}

//	@DeleteMapping("/users")
//	public void deletarProduto(@RequestBody User user) {
//		userRepository.delete(user);
//	}

//	@PutMapping("/users")
//	public User atualizarProduto(@RequestBody User user) {
//		return userRepository.save(user);
//	}

}
