package src.main.java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SeparadorPorSexo {
    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(new Pessoa("Ana", 28, "F"));
        pessoas.add(new Pessoa("Carlos", 34, "M"));
        pessoas.add(new Pessoa("Beatriz", 22, "F"));
        pessoas.add(new Pessoa("Daniel", 30, "M"));

        String sexoDesejado = "F";
        List<Pessoa> grupoSelecionado = pessoas.stream()
                .filter(p -> {
                    if (p.getSexo().equalsIgnoreCase(sexoDesejado)) {
                        return true;
                    } else {
                        return false;
                    }
                })
                .collect(Collectors.toList());

        System.out.println("Pessoas do sexo " + sexoDesejado + ":");
        grupoSelecionado.forEach(System.out::println);
    }
}
