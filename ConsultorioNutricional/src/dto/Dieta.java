package dto;

import java.util.List;
import java.util.ArrayList;

public class Dieta {

    List<Alimento> alimentos = new ArrayList<Alimento>();
    String nomePaciente;
    float valorMaximoCalorias;
    private float valorTotalCaloria;

    public List<Alimento> getAlimentos() {
        return alimentos;
    }

    public void setAlimentos(List<Alimento> alimentos) {
        this.alimentos = alimentos;
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public float getValorMaximoCalorias() {
        return valorMaximoCalorias;
    }

    public void setValorMaximoCalorias(float valorMaximoCalorias) {
        this.valorMaximoCalorias = valorMaximoCalorias;
    }

    public float getValorTotalCaloria() {
        return valorTotalCaloria;
    }

    public void setValorTotalCaloria(float valorTotalCaloria) {
        this.valorTotalCaloria = valorTotalCaloria;
    }
}
