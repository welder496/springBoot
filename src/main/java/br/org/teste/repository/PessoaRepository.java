package br.org.teste.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.teste.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {

}
