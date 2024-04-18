package br.com.fiap.challenge;

import java.time.LocalDate;

public class PessoaJuridica extends Pessoa {
    private String cnpj;

    public PessoaJuridica() {

    }

    public PessoaJuridica(String nome, String cpf, String rg, LocalDate anoNasc, Endereco endereco, String cnpj) {
        super(nome, cpf, rg, anoNasc, endereco);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
