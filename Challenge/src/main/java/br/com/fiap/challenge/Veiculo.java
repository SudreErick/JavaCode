package br.com.fiap.challenge;
import java.time.LocalDate;

public class Veiculo {
    private String modelo;
    private String marca;
    private String placa;
    private LocalDate anoFabricacao;
    private int valorPago;

    public Veiculo() {
    }

    public Veiculo(String modelo, String marca, String placa, LocalDate anoFabricacao, int valorPago) {
        this.modelo = modelo;
        this.marca = marca;
        this.placa = placa;
        this.valorPago = valorPago;
        this.anoFabricacao = anoFabricacao;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        try {
            if (modelo.equals("Highline") || modelo.equals("Sportline") || modelo.equals("Baseline")) {
                this.modelo = modelo;
            }else {
                throw new Exception("Modelo Invalido!!!");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        try {
            if (marca.equals("Chevrolet") || marca.equals("Hyundai") || marca.equals("Fiat")) {
                this.marca = marca;
            }else {
                throw new Exception("Marca Inválida!!!");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public int getValorPago() {
        return valorPago;
    }

    public void setValorPago(int valorPago) {
        this.valorPago = valorPago;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public LocalDate getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(LocalDate anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public float CalcularDepreciacao(){
        return 0;
    }
    public float ObterValorAtual(){
        return 0;
    }

}