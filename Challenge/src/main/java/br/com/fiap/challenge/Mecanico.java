package br.com.fiap.challenge;

import java.time.LocalDate;

public class Mecanico extends Pessoa{
    private String especialidade;

    public Mecanico(){

    }

    public Mecanico(String nome, String cpf, String rg, LocalDate anoNasc, Endereco endereco, String especialidade) {
        super(nome, cpf, rg, anoNasc, endereco);
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        especialidade = especialidade;
    }

    public String AvaliacaoMecanico(){
        return "";
    }
}
