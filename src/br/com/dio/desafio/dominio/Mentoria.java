package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{

    private LocalDate data;

    // Constructor
    public Mentoria() {
    }

    // Methods Getters and Setters
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }
    
    @Override
    public String toString() {
        return "Mentoria [data=" + data + ", descricao=" + descricao + ", titulo=" + titulo + "]";
    } 
}
