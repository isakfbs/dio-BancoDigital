package src;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    List<Conta> contas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
