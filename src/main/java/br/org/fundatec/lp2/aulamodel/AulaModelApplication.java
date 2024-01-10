package br.org.fundatec.lp2.aulamodel;

import br.org.fundatec.lp2.aulamodel.model.Endereco;
import br.org.fundatec.lp2.aulamodel.model.Pessoa;
import br.org.fundatec.lp2.aulamodel.model.PessoaFisica;
import br.org.fundatec.lp2.aulamodel.model.PessoaJuridica;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AulaModelApplication {

	public static void main(String[] args) {
//		Pessoa pessoa = new PessoaFisica();
//
//		pessoa.getNome();
//
//		pessoa = new PessoaJuridica();
//
////		PessoaJuridica pessoaJuridica = pessoa;
//
//		PessoaJuridica pessoaJuridica1 = new PessoaJuridica();

		SpringApplication.run(AulaModelApplication.class, args);
	}

}
