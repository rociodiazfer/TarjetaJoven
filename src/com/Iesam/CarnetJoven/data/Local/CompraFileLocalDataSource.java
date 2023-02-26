package com.Iesam.CarnetJoven.data.Local;


import com.Iesam.CarnetJoven.domain.Compra;
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

public class CompraFileLocalDataSource {

    private static CompraFileLocalDataSource instance = null;

    private Gson gson = new Gson();

    private final Type typeList = new TypeToken<ArrayList<Compra>>() {
    }.getType();

    private CompraFileLocalDataSource() {
    }

    public void save(Compra model) {
        List<Compra> models = findAll();
        models.add(model);
        saveToFile(models);
    }

    public void saveList(List<Compra> models){

        saveToFile(models);
    }
    private void saveToFile(List<Compra> compras) {
        try {
            FileWriter myWriter = new FileWriter("compras.txt");
            myWriter.write(gson.toJson(compras));
            myWriter.close();
            System.out.println("Compra guardada correctamente");
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error");
            e.printStackTrace();
        }
    }


    public Compra findById(String id) {
        List<Compra> models = findAll();
        for (Compra model : models) {
            if (Objects.equals(model.getIdCompra(), id)) {
                return model;
            }
        }
        return null;
    }

    public List<Compra> findAll() {
        try {
            File myObj = new File("compras.txt");
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
        return new ArrayList<Compra>();
    }

    public static CompraFileLocalDataSource getInstance() {
        if (instance == null) {
            instance = new CompraFileLocalDataSource();
        }
        return instance;
    }
}
