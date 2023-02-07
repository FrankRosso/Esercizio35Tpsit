package com.mycompany.es35;

import com.google.gson.annotations.SerializedName;

public class Gara {

    @SerializedName("campo")
    private String campo;

    @SerializedName("giudice")
    private String giudice;

    @SerializedName("squadra")
    private String squadra;

    @SerializedName("ora")
    private String ora;

    @SerializedName("punteggio_percorso")
    private int punteggioPercorso;

    @SerializedName("punteggio_difficoltà")
    private int punteggioDifficolta;

    @SerializedName("tempo")
    private int tempo;

    public String getCampo() {
        return campo;
    }

    public void setCampo(String campo) {
        this.campo = campo;
    }

    public String getGiudice() {
        return giudice;
    }

    public void setGiudice(String giudice) {
        this.giudice = giudice;
    }

    public String getSquadra() {
        return squadra;
    }

    public void setSquadra(String squadra) {
        this.squadra = squadra;
    }

    public String getOra() {
        return ora;
    }

    public void setOra(String ora) {
        this.ora = ora;
    }

    public int getPunteggioPercorso() {
        return punteggioPercorso;
    }

    public void setPunteggioPercorso(int punteggioPercorso) {
        this.punteggioPercorso = punteggioPercorso;
    }

    public int getPunteggioDifficolta() {
        return punteggioDifficolta;
    }

    public void setPunteggioDifficolta(int punteggioDifficolta) {
        this.punteggioDifficolta = punteggioDifficolta;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }
}
