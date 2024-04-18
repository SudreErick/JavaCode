package br.com.fiap.challenge;

import java.time.LocalDate;
import java.time.Year;

public class Pessoa {
    //atributos
    private String nome;
    private String cpf;
    private String rg;
    private LocalDate anoNasc;
    private Endereco endereco;
    public Pessoa(){

    }
    public Pessoa(String nome, String cpf, String rg, LocalDate anoNasc, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.anoNasc = anoNasc;
        this.endereco = endereco;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public LocalDate getAnoNasc() {
        return anoNasc;
    }

    public void setAnoNasc(LocalDate anoNasc) {
        var minimo = Year.now().minusYears( 120 ).getValue();
        var anoInformado = anoNasc.getYear();

        if (anoNasc == null || anoNasc.isAfter( LocalDate.now() ) ||  (anoInformado<= minimo) ) {
            throw new RuntimeException("Data inválida");
        }
        this.anoNasc = anoNasc;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}