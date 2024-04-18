package br.com.fiap.challenge;
public class Seguradora {
    private String nome;
    private String listaDeClientes;
    private String listaDeApolices;
    private Endereco endereco;

    public Seguradora() {
    }

    public Seguradora(String nome, String listaDeClientes, String listaDeApolices, Endereco endereco) {
        this.nome = nome;
        this.listaDeClientes = listaDeClientes;
        this.listaDeApolices = listaDeApolices;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getListaDeClientes() {
        return listaDeClientes;
    }

    public void setListaDeClientes(String listaDeClientes) {
        this.listaDeClientes = listaDeClientes;
    }

    public String getListaDeApolices() {
        return listaDeApolices;
    }

    public void setListaDeApolices(String listaDeApolices) {
        this.listaDeApolices = listaDeApolices;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public float CalcularPremio(){
        return 0;
    }

    public String RenovarApolice(){
        return "Apólice renovada";
    }

    public String CancelarApolice(){
        return "Apólice cancelada";
    }
}