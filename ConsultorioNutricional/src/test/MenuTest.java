package test;

import org.junit.Assert;
import org.junit.Test;

import business.MenuBusiness;

public class MenuTest {

	MenuBusiness menuBusiness = new MenuBusiness();
	
	@Test
	public void listarOpcoes() {
		String[] opcoesTeste = new String[7];
		opcoesTeste[0] = "Cadastrar Paciente";
		opcoesTeste[1] = "Pesquisar Paciente";
		opcoesTeste[2] = "Remover Paciente";
		opcoesTeste[3] = "Cadastrar Consulta";
		opcoesTeste[4] = "Pesquisar Consulta";
		opcoesTeste[5] = "Remover Consulta";
		opcoesTeste[6] = "Sugerir Dieta";
		
		Assert.assertArrayEquals(opcoesTeste, menuBusiness.listarOpcoes());
	}
}
