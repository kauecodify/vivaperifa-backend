package br.com.vivaperifa.vivaperifa_backend.models;

public class Data {
    private String diaSemana;
    private String dia;
    private String mes;
    private String ano;

    public Data(){

    }

    public Data(String dia, String mes, String ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    } 

    public Data(String diaSemana, String dia, String mes, String ano){
        this(dia,mes,ano);
        this.diaSemana = diaSemana;
    }

    public String getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    @Override
    public String toString(){
        return dia + "/" + mes + "/" + ano;
    }

}
