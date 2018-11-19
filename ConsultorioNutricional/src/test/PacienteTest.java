package test;

import org.junit.Test;

import business.PacienteBusiness;
import dto.Paciente;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Assert;

public class PacienteTest {
	
	PacienteBusiness PacienteBusiness= new PacienteBusiness();

	@Test
	public void consultarPacientePorNomeSucesso() {
		String nomePesquisado = "ace";
		
		List<Paciente> esperado = new ArrayList<Paciente>();
		esperado.add(new Paciente("Walace", "Rua Qualquer Tamb�m", "31988888888", "walace@gmail.com", new Date()));
		
		List<Paciente> resultado = PacienteBusiness.pesquisarPacientePorNome(nomePesquisado);
		
		Assert.assertEquals(esperado.toArray()[0].getClass().getName(), resultado.toArray()[0].getClass().getName());
	}
	
	@Test
	public void cadastrarPacienteSucesso() {
		Paciente novoPaciente = new Paciente("Joaquina", "Rua Qualquer Tamb�m", "31988888888", "walace@gmail.com", new Date());
		
		Assert.assertTrue(PacienteBusiness.cadastrarPaciente(novoPaciente));
	}
	
	@Test
	public void cadastrarPacienteFalha() {
		Paciente novoPaciente = new Paciente("Walace", "Rua Qualquer Tamb�m", "31988888888", "walace@gmail.com", new Date());
		
		Assert.assertFalse(PacienteBusiness.cadastrarPaciente(novoPaciente));
	}
	
	@Test
	public void verificarExistePacienteSucesso() {		
		Assert.assertTrue(PacienteBusiness.verificarExistePaciente("Walace"));
	}
	
	@Test
	public void verificarExistePacienteFalha() {		
		Assert.assertFalse(PacienteBusiness.verificarExistePaciente("Maria"));
	}
	
	@Test
	public void removerPacienteSucesso() {
		Paciente novoPaciente = new Paciente("Walace", "Rua Qualquer Tamb�m", "31988888888", "walace@gmail.com", new Date());

		Assert.assertTrue(PacienteBusiness.removerPaciente(novoPaciente));
	}
	
	@Test
	public void removerPacienteFalha() {
		Paciente novoPaciente = new Paciente("Joao", "Rua Qualquer Tamb�m", "31988888888", "walace@gmail.com", new Date());

		Assert.assertFalse(PacienteBusiness.removerPaciente(novoPaciente));
	}
	
}
