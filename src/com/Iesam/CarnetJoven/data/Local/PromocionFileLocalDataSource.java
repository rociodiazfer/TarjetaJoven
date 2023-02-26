package com.Iesam.CarnetJoven.data.Local;

import com.Iesam.CarnetJoven.domain.Promocion;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class PromocionFileLocalDataSource {
    private static PromocionFileLocalDataSource instance = null;

    private Gson gson = new Gson();

    private final Type typeList = new TypeToken<ArrayList<Promocion>>() {
    }.getType();

    private PromocionFileLocalDataSource() {
    }

    public void save(Promocion model) {
        List<Promocion> models = findAll();
        models.add(model);
        saveToFile(models);
    }

    public void saveList(List<Promocion> models){

        saveToFile(models);
    }
    private void saveToFile(List<Promocion> promociones) {
        try {
            FileWriter myWriter = new FileWriter("promociones.txt");
            myWriter.write(gson.toJson(promociones));
            myWriter.close();
            System.out.println("Usuario guardado correctamente");
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error");
            e.printStackTrace();
        }
    }


    public Promocion findById(String id) {
        List<Promocion> models = findAll();
        for (Promocion model : models) {
            if (Objects.equals(model.getIdPromociones(), id)) {
                return model;
            }
        }
        return null;
    }

    public List<Promocion> findAll() {
        try {
            File myObj = new File("promociones.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                myReader.close();
                return gson.fromJson(data, typeList);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return new ArrayList<Promocion>();
    }

    public static PromocionFileLocalDataSource getInstance() {
        if (instance == null) {
            instance = new PromocionFileLocalDataSource();
        }
        return instance;
    }


}
