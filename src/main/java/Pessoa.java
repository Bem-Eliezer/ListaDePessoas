package src.main.java;

class Pessoa {
    private String nome;
    private int idade;
    private String sexo; // "M" ou "F"

    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getSexo() {
        return sexo;
    }

    @Override
    public String toString() {
        return nome + " (" + idade + " anos, sexo: " + sexo + ")";
    }
}
