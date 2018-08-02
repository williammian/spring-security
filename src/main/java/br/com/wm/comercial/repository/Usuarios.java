package br.com.wm.comercial.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.wm.comercial.model.Usuario;

public interface Usuarios extends JpaRepository<Usuario, Long> {

	Usuario findByLogin(String login);
	
}
