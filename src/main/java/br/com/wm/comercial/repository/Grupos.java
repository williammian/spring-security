package br.com.wm.comercial.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.wm.comercial.model.Grupo;
import br.com.wm.comercial.model.Usuario;

public interface Grupos extends JpaRepository<Grupo, Long> {
	
	List<Grupo> findByUsuariosIn(Usuario usuario);

}
