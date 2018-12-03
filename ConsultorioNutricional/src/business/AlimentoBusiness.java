package business;

import dto.Alimento;

import java.util.ArrayList;
import java.util.List;

public class AlimentoBusiness {
	
	public static final String GRUPOA = "Carboidrato";
	public static final String GRUPOB = "Proteína";
	public static final String GRUPOC = "Fruta";
	
	
    public List<Alimento> getAlimentos() {
        return alimentos;
    }

    List<Alimento> alimentos;

    public AlimentoBusiness(){
        alimentos = new ArrayList<Alimento>();
        alimentos.add(new Alimento("Batata doce", "Carboidrato", 100));
        alimentos.add(new Alimento("Arroz integral", "Carboidrato", 150));
        alimentos.add(new Alimento("Inhame", "Carboidrato", 200));

        alimentos.add(new Alimento("Ovo cozido", "Proteína", 150));
        alimentos.add(new Alimento("Frango Grelhado", "Proteína", 100));
        alimentos.add(new Alimento("Carne cozida", "Proteína", 150));

        alimentos.add(new Alimento("Banana", "Fruta", 87));
        alimentos.add(new Alimento("Maçã", "Fruta", 48));
        alimentos.add(new Alimento("Abacaxi", "Fruta", 90));
    }


}
