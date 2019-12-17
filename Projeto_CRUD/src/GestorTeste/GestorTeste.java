package GestorTeste;

import java.util.ArrayList;
import java.util.List;

import Entidade.Gestor;
import RepositorioGestor.RepositorioGestor;

public class GestorTeste {

	static RepositorioGestor gestor = new RepositorioGestor();
	public static void main(String[] args) {

		popularArray();
		listarGestor();

	}
	public static void popularArray() {		
		
		Gestor gestor1 = new Gestor();
		gestor1.setNome("joao Felipe");
		gestor1.setMatricula(1);
		gestor1.setData_nascimento(null);
		gestor1.setSetor("Nucleo da Informática");
		gestor.salvarGestor(gestor1);

		Gestor gestor2 = new Gestor();
		gestor2.setNome("Daniel Freitas");
		gestor2.setMatricula(2);
		gestor2.setData_nascimento(null);
		gestor2.setSetor("Ouvidoria");
		gestor.salvarGestor(gestor2);

		Gestor gestor3 = new Gestor();
		gestor3.setNome("Pedro Gonçalves");
		gestor3.setMatricula(3);
		gestor3.setData_nascimento(null);
		gestor3.setSetor("Setor de Segurança");
		gestor.salvarGestor(gestor3);
	}

	public static void listarGestor() {

		List<Gestor> lista = new ArrayList<Gestor>();

	 lista = gestor.listarGestor();

		for (int i = 0; i < lista.size(); i++) {
			System.out.println("Nome: "+lista.get(i));
//			System.out.println("Matricula: "+gest.getMatricula());
//			System.out.println("Data de Nascimento: " +gest.getData_nascimento());
//			System.out.println("Setor: "+gest.getSetor());
		}

	}

}

//		
//	System.out.println("=================Cadastrar Gestores=================");
//		salvo = gestor.salvarGestor(gestor1);
//	
//		if(salvo == true) {
//			System.out.println("Nome: "+gestor1.getNome());
//			System.out.println("Matricula: "+ gestor1.getMatricula());
//			System.out.println("Data: " +gestor1.getData_nascimento());
//			System.out.println("Setor: " +gestor1.getSetor()+"\nSalvo com sucesso!!!");
//			System.out.println("===============================================");
//		}
//		salvo = gestor.salvarGestor(gestor2);
//		
//		if(salvo == true) {
//			System.out.println("Nome: "+gestor2.getNome());
//			System.out.println("Matricula: "+ gestor2.getMatricula());
//			System.out.println("Data: " +gestor2.getData_nascimento());
//			System.out.println("Setor: " +gestor2.getSetor()+"\nSalvo com sucesso!!!");
//			System.out.println("===============================================");
//		}
//		
//		salvo = gestor.salvarGestor(gestor3);
//		if(salvo == true) {
//			System.out.println("Nome: "+gestor3.getNome());
//			System.out.println("Matricula: "+ gestor3.getMatricula());
//			System.out.println("Data: " +gestor3.getData_nascimento());
//			System.out.println("Setor: " +gestor3.getSetor()+"\nSalvo com sucesso!!!");
//			System.out.println("===============================================");
//		}
