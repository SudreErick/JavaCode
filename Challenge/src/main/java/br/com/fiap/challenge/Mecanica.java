package br.com.fiap.challenge;
import java.time.LocalDate;

public class Mecanica extends PessoaJuridica{
    private Endereco endereco;
    private String telefone;
    private String funcionarios;

    public Mecanica(){

    }

    public Mecanica(String nome, String cpf, String rg, LocalDate anoNasc, Endereco endereco, String cnpj, Endereco endereco1, String telefone, String funcionarios) {
        super(nome, cpf, rg, anoNasc, endereco, cnpj);
        this.endereco = endereco;
        this.telefone = telefone;
        this.funcionarios = funcionarios;
    }

    @Override
    public Endereco getEndereco() {
        return endereco;
    }

    @Override
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(String funcionarios) {
        this.funcionarios = funcionarios;
    }

    public String Agendamento(){
       return "";
    }

    public String Avaliacoes(){
        return "";
    }

    public String Relatorios(){
        return "";
    }


}
