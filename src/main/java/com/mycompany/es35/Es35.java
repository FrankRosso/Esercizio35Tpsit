package com.mycompany.es35;

import com.google.gson.*;
import java.io.*;
import java.nio.file.*;
import java.util.*;

public class Es35 {

    public static void main(String[] args) throws IOException {
        Gson gson = new Gson();
        String json = readFile("C:\\Users\\FRANCESCODELROSSO\\OneDrive - IIS Marco Polo\\Desktop\\GITHUB\\Es35\\Esercizio35Tpsit\\src\\main\\java\\com\\mycompany\\es35\\Gare.json");
        Gara[] gare = gson.fromJson(json, Gara[].class);

        ArrayList<Team> Squadre = new ArrayList<>();
        boolean found = false;

        for (Gara gara : gare) {
            for (Team team : Squadre) {
                if (team.nome.equals(gara.getSquadra())) {
                    team.punteggio = team.punteggio + gara.getPunteggio_difficolta() + gara.getPunteggio_percorso();
                    team.tempo = team.tempo + gara.getTempo();
                    found = true;
                }
            }

            if (!found) {
                Squadre.add(new Team(gara.getSquadra(), gara.getPunteggio_difficolta() + gara.getPunteggio_percorso(), gara.getTempo()));
            }
        }

        for (Team team : Squadre) {
            System.out.println("Nome: " + team.nome);
            System.out.println("Punteggio: " + team.punteggio);
            System.out.println("Tempo: " + team.tempo);
        }
    }

    private static String readFile(String path) throws IOException {
        byte[] content = Files.readAllBytes(Paths.get(path));
        return new String(content);
    }
}
