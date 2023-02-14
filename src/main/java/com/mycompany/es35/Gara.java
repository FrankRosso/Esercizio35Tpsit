
package com.mycompany.es35;

/**
 *
 * @author FRANCESCODELROSSO
 */
public class Gara {
    
    private String campo;
    private String giudice;
    private String squadra;
    private String ora;
    private int punteggio_percorso;
    private int punteggio_difficolta;
    private int tempo;

    @Override
    public String toString() {
        return "Gara{" + "campo=" + campo + ", giudice=" + giudice + ", squadra=" + squadra + ", ora=" + ora + ", punteggio_percorso=" + punteggio_percorso + ", punteggio_difficolta=" + punteggio_difficolta + ", tempo=" + tempo + '}';
    }

    
    
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

    public int getPunteggio_percorso() {
        return punteggio_percorso;
    }

    public void setPunteggio_percorso(int punteggio_percorso) {
        this.punteggio_percorso = punteggio_percorso;
    }

    public int getPunteggio_difficolta() {
        return punteggio_difficolta;
    }

    public void setPunteggio_difficolta(int punteggio_difficolta) {
        this.punteggio_difficolta = punteggio_difficolta;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }
    
    
    
}