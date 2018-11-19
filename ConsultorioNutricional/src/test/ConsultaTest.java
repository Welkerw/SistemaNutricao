package test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import business.ConsultaBusiness;
import dto.Consulta;
import dto.Paciente;

public class ConsultaTest {
	
	ConsultaBusiness consultaBusiness = new ConsultaBusiness();
	
	@Test
	public void cadastrarConsultaSucesso() {
		Consulta novaConsulta = new Consulta("Walace", new Date(), "16h", Double.valueOf(80), Double.valueOf(15), "nada consta", "Sem restri��o");
		
		Assert.assertTrue(consultaBusiness.cadastrarConsulta(novaConsulta));
	}
	
	@Test
	public void cadastrarConsultaFalha() {
		Consulta novaConsulta = new Consulta("Pedro", new Date(), "16h", Double.valueOf(80), Double.valueOf(15), "nada consta", "Sem restri��o");
		
		Assert.assertFalse(consultaBusiness.cadastrarConsulta(novaConsulta));
	}
	
	@Test
	public void verificarExisteConsultaFalha() {
		Consulta novaConsulta = new Consulta("Pedro", new Date(), "16h", Double.valueOf(80), Double.valueOf(15), "nada consta", "Sem restri��o");

		Assert.assertFalse(consultaBusiness.verificarExisteConsulta(novaConsulta));
	}
	
	@Test
	public void verificarExisteConsultaSucesso() {
		Consulta novaConsulta = new Consulta("Welker", new Date(), "16h", Double.valueOf(80), Double.valueOf(15), "nada consta", "Sem restri��o");

		Assert.assertTrue(consultaBusiness.verificarExisteConsulta(novaConsulta));
	}
	
	@Test
	public void removerConsultaSucesso() {
		Consulta novaConsulta = new Consulta("Welker", new Date(), "16h", Double.valueOf(80), Double.valueOf(15), "nada consta", "Sem restri��o");
		
		Assert.assertTrue(consultaBusiness.removerConsulta(novaConsulta));
	}
	
	@Test
	public void removerConsultaFalha() {
		Consulta novaConsulta = new Consulta("Pedro", new Date(), "16h", Double.valueOf(80), Double.valueOf(15), "nada consta", "Sem restri��o");
		
		Assert.assertFalse(consultaBusiness.removerConsulta(novaConsulta));
	}
	@Test
	public void listaConsultasPaciente() {
		Paciente paciente = new Paciente("Welker", "Rua Qualquer", "31999999999", "welker@gmail.com", new Date());
		List<Consulta> resultado = consultaBusiness.listarConsultasPaciente(paciente);
		List<Consulta> esperado = new ArrayList<Consulta>();
		esperado.add(new Consulta("Welker", new Date(), "16h", Double.valueOf(80), Double.valueOf(15), "nada consta", "Sem restri��o"));
		
		Assert.assertEquals(esperado.size(), resultado.size());
		Assert.assertEquals(esperado.get(0).getNomePaciente(), resultado.get(0).getNomePaciente());
		Assert.assertEquals(esperado.get(0).getDataConsulta(), resultado.get(0).getDataConsulta());
		Assert.assertEquals(esperado.get(0).getHorario(), resultado.get(0).getHorario());
	}
	
}
