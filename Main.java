class Animal {
    private String nome ;
    private int idade;
    private String tipo;

    public Animal(String nome, int idade, String tipo) {
        this.nome = nome;
        this.idade = 1;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String toString() {
        return "Animal [nome=" + nome + ", idade=" + idade + ", tipo=" + tipo + "]";
    }
}

class Peixe extends Animal {
    private String caracteristica;

    public Peixe(String nome, int idade, String tipo, String caracteristica) {
        super(nome, idade, tipo);
        this.caracteristica = caracteristica;
    }

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    public String toString() {
        return "Peixe [nome=" + getNome() + ", idade=" + getIdade() + ", tipo=" + getTipo() + ", caracteristica=" + caracteristica + "]";
    }
}

public class Main {
    public static void main(String[] args) {
        Peixe peixe = new Peixe("Dourado", 2, "Aquático", "Barbatanas longas");
        System.out.println(peixe.toString());
    }
}
