package ru;

public class Refeicao {
    private String dia;
    private String turno;
    private String pratoPrincipal;
    private String acompanhamento;
    private String salada;

    // Construtor
    public Refeicao(String dia, String turno, String pratoPrincipal, String acompanhamento, String salada) {
        this.dia = dia;
        this.turno = turno;
        this.pratoPrincipal = pratoPrincipal;
        this.acompanhamento = acompanhamento;
        this.salada = salada;
    }

    // Getters
    public String getDia() {
        return dia;
    }

    public String getTurno() {
        return turno;
    }

    public String getPratoPrincipal() {
        return pratoPrincipal;
    }

    public String getAcompanhamento() {
        return acompanhamento;
    }

    public String getSalada() {
        return salada;
    }

    @Override
    public String toString() {
        return "Dia: " + dia + ", Turno: " + turno + ", Prato Principal: " + pratoPrincipal + ", Acompanhamento: " + acompanhamento + ", Salada: " + salada;
    }
}
