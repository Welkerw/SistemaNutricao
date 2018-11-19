package dto;

import java.util.Date;

public class Consulta {
	
	public Consulta (String nomePaciente, Date dataConsulta, String horario, Double peso,
			Double percentGorduraCorporal, String sensacaoFisica, String restricoesAlimentares) {
		this.nomePaciente = nomePaciente;
		this.dataConsulta = dataConsulta;
		this.horario = horario;
		this.peso = peso;
		this.percentGorduraCorporal = percentGorduraCorporal;
		this.sensacaoFisica = sensacaoFisica;
		this.restricoesAlimentares = restricoesAlimentares;
	}
	
	String nomePaciente;
	Date dataConsulta;
	String horario;
	Double peso;
	Double percentGorduraCorporal;
	String sensacaoFisica;
	String restricoesAlimentares;
	
	
	public Date getDataConsulta() {
		return dataConsulta;
	}
	public void setDataConsulta(Date dataConsulta) {
		this.dataConsulta = dataConsulta;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	public Double getPercentGorduraCorporal() {
		return percentGorduraCorporal;
	}
	public void setPercentGorduraCorporal(Double percentGorduraCorporal) {
		this.percentGorduraCorporal = percentGorduraCorporal;
	}
	public String getSensacaoFisica() {
		return sensacaoFisica;
	}
	public void setSensacaoFisica(String sensacaoFisica) {
		this.sensacaoFisica = sensacaoFisica;
	}
	public String getRestricoesAlimentares() {
		return restricoesAlimentares;
	}
	public void setRestricoesAlimentares(String restricoesAlimentares) {
		this.restricoesAlimentares = restricoesAlimentares;
	}
	public String getNomePaciente() {
		return nomePaciente;
	}
	public void setNomeCliente(String nomePaciente) {
		this.nomePaciente = nomePaciente;
	}
}
