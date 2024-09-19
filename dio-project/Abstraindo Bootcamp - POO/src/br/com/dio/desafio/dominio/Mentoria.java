package br.com.dio.desafio.dominio;

import java.time.LocalDate; //uma das classes do JAVA que permite trabalhar com datas

public class Mentoria extends Conteudo{
    //atributos
    private LocalDate data;

    @Override
    public double calcularXp(){
        return XP_PADRAO + 20;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }
}
