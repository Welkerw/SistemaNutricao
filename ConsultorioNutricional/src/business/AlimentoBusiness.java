package business;

import dto.Alimento;

import java.util.ArrayList;
import java.util.List;

public class AlimentoBusiness {
    public List<Alimento> getAlimentos() {
        return alimentos;
    }

    List<Alimento> alimentos;

    public AlimentoBusiness(){
        alimentos = new ArrayList<Alimento>();
        alimentos.add(new Alimento("Batata doce", "Carboidratos", 100));
        alimentos.add(new Alimento("Arroz integral", "Carboidratos", 150));
        alimentos.add(new Alimento("Inhame", "Carboidratos", 200));

        alimentos.add(new Alimento("Ovo cozido", "Proteína", 150));
        alimentos.add(new Alimento("Frango Grelhado", "Proteína", 100));
        alimentos.add(new Alimento("Carne cozida", "Proteína", 150));

        alimentos.add(new Alimento("Banana", "Frutas", 87));
        alimentos.add(new Alimento("Maçã", "Frutas", 48));
        alimentos.add(new Alimento("Abacaxi", "Frutas", 90));
    }


}
