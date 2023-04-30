package org.example;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Config {
    // membrii privati ai clasei
    private static Config instance = null;
    private String color;
    private int weight;


    // constructorul este privat pentru a preveni crearea de instanțe
    private Config() {
        try {
            JSONParser parser = new JSONParser();
            File configFile = new File("src/main/java/org/example/config.json");//adresa fisierului de configurare
            String absolutePath = configFile.getAbsolutePath();
            Object obj = parser.parse(new FileReader(absolutePath));
            JSONObject jsonObject = (JSONObject) obj;
            color = (String) jsonObject.get("color");
            weight = ((Long) jsonObject.get("weight")).intValue();
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }

// metoda statică care returnează instanța singleton-ului
    public static Config getInstance() {
        if (instance == null) {
            instance = new Config();
        }
        return instance;
    }
// metode publice pentru accesarea datelor din fișierul de configurare "config.json"
    public String getColor() {
        return color;
    }

    public int getWeight() {

        return weight;
    }
}

