package business;

import dto.Alimento;

import java.util.ArrayList;
import java.util.List;

public class AlimentoBusiness {
	
	public static final String GRUPOA = "Carboidrato";
	public static final String GRUPOB = "Prote�na";
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

        alimentos.add(new Alimento("Ovo cozido", "Prote�na", 150));
        alimentos.add(new Alimento("Frango Grelhado", "Prote�na", 100));
        alimentos.add(new Alimento("Carne cozida", "Prote�na", 150));

        alimentos.add(new Alimento("Banana", "Fruta", 87));
        alimentos.add(new Alimento("Ma��", "Fruta", 48));
        alimentos.add(new Alimento("Abacaxi", "Fruta", 90));
    }


}
