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

        Assert.assertEquals(dietaEsperada, dietaResultado);

    }
}
