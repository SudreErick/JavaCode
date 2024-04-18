package br.com.fiap.challenge;

import java.time.LocalDate;

public class Reclamacao {
    private String numReclamacao;
    private String descricaoDoAcidente;
    private String valorReclamacao;
    private LocalDate dataDoAcidente;

    public Reclamacao(){

    }

    public Reclamacao(String numReclamacao, String descricaoDoAcidente, String valorReclamacao, LocalDate dataDoAcidente) {
        this.setNumReclamacao(numReclamacao);
        this.setDescricaoDoAcidente(descricaoDoAcidente);
        this.setValorReclamacao(valorReclamacao);
        this.setDataDoAcidente(dataDoAcidente);
    }

    public String getNumReclamacao() {
        return numReclamacao;
    }

    public void setNumReclamacao(String numReclamacao) {
        this.numReclamacao = numReclamacao;
    }

    public String getDescricaoDoAcidente() {
        return descricaoDoAcidente;
    }

    public void setDescricaoDoAcidente(String descricaoDoAcidente) {
        this.descricaoDoAcidente = descricaoDoAcidente;
    }

    public String getValorReclamacao() {
        return valorReclamacao;
    }

    public void setValorReclamacao(String valorReclamacao) {
        this.valorReclamacao = valorReclamacao;
    }

    public LocalDate getDataDoAcidente() {
        return dataDoAcidente;
    }

    public void setDataDoAcidente(LocalDate dataDoAcidente) {
        this.dataDoAcidente = dataDoAcidente;
    }

    public String RegistrarReclamacao(){
        return "";
    }

    public String ProcessarReclamacao(){
        return "";
    }

    public String CalcularIndenizacao(){
        return "";
    }


}
