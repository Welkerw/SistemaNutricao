package business;

import dto.Alimento;
import dto.Dieta;

import java.util.ArrayList;
import java.util.List;

public class DietaBusiness {

    List<Dieta> dietas;
    AlimentoBusiness alimentos;

    public DietaBusiness(){
        this.dietas = new ArrayList<Dieta>();
        this.alimentos = new AlimentoBusiness();
    }

    public List<Dieta> montarDietaPorCalorias(float qtdMaximaCalorias){
        float somatorio = 0;
        List<Dieta> dietasSugeridas = new ArrayList<Dieta>();
        int contDieta = 0;
        List<String> gruposSelecionados = new ArrayList<String>();

        String grupo = "";
        for (Alimento alimento : (this.alimentos.getAlimentos()).subList(0,3)) {
            somatorio = alimento.getCaloria();
            for (Alimento alimentoGrupo2 : this.alimentos.getAlimentos().subList(3,6)){
                if(somatorio + alimentoGrupo2.getCaloria() <= qtdMaximaCalorias){
                    for (Alimento alimentoGrupo3 : this.alimentos.getAlimentos().subList(6,9)){
                        if(somatorio + alimentoGrupo3.getCaloria() + alimentoGrupo2.getCaloria() <= qtdMaximaCalorias) {
                            somatorio += alimentoGrupo3.getCaloria() + alimentoGrupo2.getCaloria();
                            Dieta dieta = new Dieta();
                            dieta.getAlimentos().add(alimento);
                            dieta.getAlimentos().add(alimentoGrupo2);
                            dieta.getAlimentos().add(alimentoGrupo3);
                            dieta.setValorMaximoCalorias(qtdMaximaCalorias);
                            dieta.setValorTotalCaloria(somatorio);
                            dietasSugeridas.add(dieta);
                            somatorio = alimento.getCaloria();
                        }
                    }

                }
            }

        }
        return dietasSugeridas;

    }
}
