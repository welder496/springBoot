package br.org.teste;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.org.teste.model.Pessoa;
import br.org.teste.repository.PessoaRepository;

@SpringBootApplication
public class HelloJpaApplication implements CommandLineRunner {

	@Autowired
	private PessoaRepository pessoaRepository; 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(HelloJpaApplication.class,args);	

	}

	@Override
	@Transactional
	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setNome("Welder Maurício de Souza");
				
		pessoaRepository.save(pessoa1);

		Pessoa pessoa2 = new Pessoa();
		pessoa2.setNome("Geovanni Henrique Carvalho de Souza");
				
		pessoaRepository.save(pessoa2);
		
		Pessoa pessoa3 = new Pessoa();
		pessoa3.setNome("Marcia Azeredo e Silva");
				
		pessoaRepository.save(pessoa3);

		
	}
	

}
