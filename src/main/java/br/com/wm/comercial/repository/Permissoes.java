package br.com.wm.comercial.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.wm.comercial.model.Grupo;
import br.com.wm.comercial.model.Permissao;

public interface Permissoes extends JpaRepository<Permissao, Long> {
	
	List<Permissao> findByGruposIn(Grupo grupo);

}
