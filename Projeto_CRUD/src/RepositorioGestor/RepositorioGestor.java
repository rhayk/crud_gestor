package RepositorioGestor;

import java.util.ArrayList;

import java.util.List;

import Entidade.Gestor;

import java.util.List;
public class RepositorioGestor {
	Gestor a = new Gestor();
	ArrayList<Gestor> listarGestor = new ArrayList<Gestor>();

	public boolean salvarGestor(Gestor gestor) {
		try {
			listarGestor.add(gestor);
		} catch (Exception e) {
			return true;
		}
		return true;
	}

	public boolean deletarGestor(long matricula) {

		// listarGestor.remove(matricula);
		return true;
	}

	public List<Gestor> listarGestor() {
		return null;
	}

	public boolean alterarGestor(Gestor gestor) {
		return true;
	}
	
	

}
