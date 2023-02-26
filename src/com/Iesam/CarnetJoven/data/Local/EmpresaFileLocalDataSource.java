package com.Iesam.CarnetJoven.data.Local;


import com.Iesam.CarnetJoven.domain.Empresa;
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

public class EmpresaFileLocalDataSource {
    private static EmpresaFileLocalDataSource instance = null;

    private Gson gson = new Gson();

    private final Type typeList = new TypeToken<ArrayList<Empresa>>() {
    }.getType();

    private EmpresaFileLocalDataSource() {
    }

    public void save(Empresa model) {
        List<Empresa> models = findAll();
        models.add(model);
        saveToFile(models);
    }

    public void saveList(List<Empresa> models){

        saveToFile(models);
    }
    private void saveToFile(List<Empresa> empresas) {
        try {
            FileWriter myWriter = new FileWriter("empresas.txt");
            myWriter.write(gson.toJson(empresas));
            myWriter.close();
            System.out.println("Empresa guardado correctamente");
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error");
            e.printStackTrace();
        }
    }


    public Empresa findById(String id) {
        List<Empresa> models = findAll();
        for (Empresa model : models) {
            if (Objects.equals(model.getIdEmpresa(), id)) {
                return model;
            }
        }
        return null;
    }

    public List<Empresa> findAll() {
        try {
            File myObj = new File("empresas.txt");
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
        return new ArrayList<Empresa>();
    }

    public static EmpresaFileLocalDataSource getInstance() {
        if (instance == null) {
            instance = new EmpresaFileLocalDataSource();
        }
        return instance;
    }
}
