package br.com.fiap.challenge;

import javax.swing.plaf.PanelUI;

public class Cobertura {
    String tipoDeCobertura, franquia, limitesCobertura;

    public Cobertura() {
    }

    public Cobertura(String tipoDeCobertura, String franquia, String limitesCobertura) {
        this.tipoDeCobertura = tipoDeCobertura;
        this.franquia = franquia;
        this.limitesCobertura = limitesCobertura;
    }

    public String VerificarCobertura(){
        return "Verificado";
    }
    public float CalcularPremioCobertura(){
        return 0;
    }

}
