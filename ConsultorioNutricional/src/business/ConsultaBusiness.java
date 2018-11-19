package business;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import dto.Consulta;
import dto.Paciente;

public class ConsultaBusiness {
	
	PacienteBusiness pacienteBusiness = new PacienteBusiness();
	
	static List<Consulta> consultas = new ArrayList<Consulta>();
	
	public ConsultaBusiness(){
		consultas.add(new Consulta("Welker", new Date(), "16h", Double.valueOf(80), Double.valueOf(15), "nada consta", "Sem restri��o"));
	}
	
	public boolean cadastrarConsulta(Consulta novaConsulta) {
		if(pacienteBusiness.verificarExistePaciente(novaConsulta.getNomePaciente())) {
			if(!verificarExisteConsulta(novaConsulta)) {
				consultas.add(novaConsulta);
				return true;
			}
		}
		return false;
	}
	
	public boolean verificarExisteConsulta(Consulta consultaPesquisar) {
		for (Consulta consulta : consultas) {
			if(consulta.getNomePaciente().equals(consultaPesquisar.getNomePaciente())
					&& consulta.getDataConsulta().getDate() == consultaPesquisar.getDataConsulta().getDate()
					&& consulta.getDataConsulta().getMonth() == consultaPesquisar.getDataConsulta().getMonth() &&
					   consulta.getDataConsulta().getYear() == consultaPesquisar.getDataConsulta().getYear()){
				return true;
			}
		}
		return false;
	}
	
	public boolean removerConsulta(Consulta consultaRemover) {
		if(verificarExisteConsulta(consultaRemover)) {
			consultas.remove(consultaRemover);
			return true;
		}
		return false;
	}
	
	public List<Consulta> listarConsultasPaciente(Paciente paciente){
		
		return listarConsultasPaciente(paciente.getNome());
	}
	
	public List<Consulta> listarConsultasPaciente(String nomePaciente){
		
		List<Consulta> retorno = new ArrayList<Consulta>();
		for (Consulta consulta : consultas) {
			if(consulta.getNomePaciente().equals(nomePaciente)){
				retorno.add(consulta);
			}
		}
		return retorno;
	}
}
