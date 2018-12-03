package test;

import business.AlimentoBusiness;
import business.DietaBusiness;
import dto.Dieta;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class DietaTest {

    @Test
    public void sugereDietaAte287Calorias(){
        int qtdMaximaCalorias = 287;

        DietaBusiness dieta = new DietaBusiness();
        AlimentoBusiness possiveisAlimentos = new AlimentoBusiness();

        List<Dieta> dietaEsperada = new ArrayList<>();
        Dieta dieta1 = new Dieta();
        dieta1.setValorMaximoCalorias(287);
        dieta1.getAlimentos().add(possiveisAlimentos.getAlimentos().get(0));
        dieta1.getAlimentos().add(possiveisAlimentos.getAlimentos().get(4));
        dieta1.getAlimentos().add(possiveisAlimentos.getAlimentos().get(6));
        dieta1.setValorTotalCaloria(287);
        dietaEsperada.add(dieta1);

        List<Dieta> dietaResultado = dieta.montarDietaPorCalorias(qtdMaximaCalorias);

        Assert.assertEquals(dietaEsperada.toArray()[0].getClass().getName(), dietaResultado.toArray()[0].getClass().getName());
        Assert.assertEquals(dietaEsperada.get(0).getNomePaciente(), dietaResultado.get(0).getNomePaciente());
        Assert.assertEquals(dietaEsperada.get(0).getAlimentos().get(0).getNome(), dietaResultado.get(0).getAlimentos().get(0).getNome());
        Assert.assertEquals(dietaEsperada.get(0).getAlimentos().get(1).getNome(), dietaResultado.get(0).getAlimentos().get(1).getNome());
        Assert.assertEquals(dietaEsperada.get(0).getAlimentos().get(2).getNome(), dietaResultado.get(0).getAlimentos().get(2).getNome());
    }
}
