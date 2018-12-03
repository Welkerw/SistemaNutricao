package dto;

public class Alimento {

	String GRUPOA = "Carboidrato";
	String GRUPOB = "Proteína";
	String GRUPOC = "Fruta";
	
    public Alimento(String nome, String grupo, float caloria) {
        this.nome = nome;
        this.grupo = grupo;
        this.caloria = caloria;
    }
    String nome;
    String grupo;
    float caloria;

    public float getCaloria() {
        return caloria;
    }

    public void setCaloria(float caloria) {
        this.caloria = caloria;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
