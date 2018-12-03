package business;

import dto.Alimento;
import dto.Dieta;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

        Map<String, List<Alimento>> mapItens = agruparAlimentosPorGrupo(alimentos.getAlimentos());

        for (Alimento alimento : (mapItens.get(alimentos.GRUPOA))) {
            somatorio = alimento.getCaloria();
            for (Alimento alimentoGrupo2 : (mapItens.get(alimentos.GRUPOB))){
                if(somatorio + alimentoGrupo2.getCaloria() <= qtdMaximaCalorias){
                    for (Alimento alimentoGrupo3 : (mapItens.get(alimentos.GRUPOC))){
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
  
   
	public Map<String, List<Alimento>> agruparAlimentosPorGrupo(List<Alimento> alimentos) {
		Map<String, List<Alimento>> map = new HashMap<String, List<Alimento>>();

		for (Alimento item : alimentos) {
			String nomeGrupo = item.getGrupo();

			if (!map.keySet().contains(nomeGrupo)) {
				map.put(nomeGrupo, new ArrayList<Alimento>());
			}

			map.get(nomeGrupo).add(item);
		}

		return map;
	}
}
