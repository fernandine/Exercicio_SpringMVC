package Model.domain;

import java.io.Serializable;

public class Carro implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String modelo;
    private String marca;
    private Integer ano;

    public Carro()  {
    }

    public Carro(String modelo, String marca, Integer ano) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

}