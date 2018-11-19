package business;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import dto.Paciente;

public class PacienteBusiness {

	static List<Paciente> pacientes = new ArrayList<Paciente>();
	
	public PacienteBusiness(){
		pacientes.add(new Paciente("Welker", "Rua Qualquer", "31999999999", "welker@gmail.com", new Date()));
		pacientes.add(new Paciente("Walace", "Rua Qualquer Também", "31988888888", "walace@gmail.com", new Date()));
	}
	
	public List<Paciente> pesquisarPacientePorNome(String nome){
		List<Paciente> retorno = new ArrayList<Paciente>();
		for (Paciente paciente : pacientes) {
			if(paciente.getNome().contains(nome))
				retorno.add(paciente);
		}
		return retorno;
	}
	
	public boolean cadastrarPaciente(Paciente novopaciente) {
		if(!verificarExistePaciente(novopaciente.getNome())) {
			pacientes.add(novopaciente);
			return true;
		}
		return false;
	}
	
	public boolean verificarExistePaciente(String nome) {
		for (Paciente paciente : pacientes) {
			if(paciente.getNome().equals(nome)){
				return true;
			}
		}
		return false;
	}
	
	public boolean removerPaciente(Paciente pacienteRemover) {
		if(verificarExistePaciente(pacienteRemover.getNome())) {
			pacientes.remove(pacienteRemover);
			return true;
		}
		return false;
	}
}
