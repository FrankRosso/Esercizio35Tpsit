/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.es35;

import com.google.gson.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 *
 * @author FRANCESCODELROSSO
 */
public class Es35 {

    public static void main(String[] args) throws IOException {
        
        
        Gara gara = parseJSON("C:\\Users\\FRANCESCODELROSSO\\OneDrive - IIS Marco Polo\\Documenti\\NetBeansProjects\\Es35\\src\\main\\java\\com\\mycompany\\es35\\Gare.json");
        System.out.println("Campo: " + gara.getCampo());
        System.out.println("Giudice: " + gara.getGiudice());
        System.out.println("Squadra: " + gara.getSquadra());

    }

    private static Gara parseJSON(String filepath) throws IOException {
        byte[] content = Files.readAllBytes(Paths.get(filepath));
        String jsonString = new String(content);
        Gson gson = new Gson();
        return gson.fromJson(jsonString, Gara.class);
    }

}
