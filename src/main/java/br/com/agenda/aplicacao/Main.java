package br.com.agenda.aplicacao;

import java.util.Date;

import br.com.agenda.dao.ContatoDAO;
import br.com.agenda.model.Contato;

public class Main {

	public static void main(String[] args) {
		
		ContatoDAO contatoDao = new ContatoDAO();
		
		Contato contato = new Contato();
		contato.setNome("Julia Mafagafos");
		contato.setIdade(27);
		contato.setDataCadastro(new Date());
		
		//contatoDao.save(contato);
		
		//Atualizar cadastro de um contato
		Contato c1 = new Contato();
		c1.setNome("Luiz Ricardo");
		c1.setIdade(33);
		c1.setDataCadastro(new Date());
		c1.setId(3);
		
		//contatoDao.update(c1);
		
		//Remover cadastro através do ID
		//contatoDao.deleteByID(5);
		
		//Visualizar todos registros do banco
		
		for(Contato c : contatoDao.getContatos()) {
			System.out.println("Contato: "+c.getNome());
		}
	}

}
