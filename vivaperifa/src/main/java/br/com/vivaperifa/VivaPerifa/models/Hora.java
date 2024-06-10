package br.com.vivaperifa.VivaPerifa.models;

public class Hora {
    private String hora;
    private String minuto;
    private String segundo;

    public Hora(){

    }
    
    public Hora(String hora, String minuto, String segundo){
        this.hora=hora;
        this.minuto=minuto;
        this.segundo=segundo;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getMinuto() {
        return minuto;
    }

    public void setMinuto(String minuto) {
        this.minuto = minuto;
    }

    public String getSegundo() {
        return segundo;
    }

    public void setSegundo(String segundo) {
        this.segundo = segundo;
    }

    @Override
    public String toString(){
        return hora + ":" + minuto + ":" + segundo;
    }
    
    
}
