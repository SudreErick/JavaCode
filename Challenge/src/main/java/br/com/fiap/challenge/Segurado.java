package br.com.fiap.challenge;

import java.time.LocalDate;

public class Segurado extends Pessoa{
    private String cnh;
    public Segurado(){

    }
    public Segurado(String nome, String cpf, String rg, LocalDate anoNasc, Endereco endereco, String cnh){
        super(nome, cpf, rg, anoNasc, endereco);
        this.cnh = cnh;
    }
    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public float CalcularPremio(){
        return 0;
    }

    public String VerificarElegibilidade(){
        return "Elegivel";
    }

    @Override
    public String toString() {
        return "Segurado{" +
                "cnh='" + cnh + '\'' +
                '}';
    }
}
