package com.Iesam.CarnetJoven.data.Local;

import com.Iesam.CarnetJoven.domain.Usuario;
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

public class UsuarioFileLocalDataSource {
    private static UsuarioFileLocalDataSource instance = null;

    private Gson gson = new Gson();

    private final Type typeList = new TypeToken<ArrayList<Usuario>>() {
    }.getType();

    private UsuarioFileLocalDataSource() {
    }

    public void save(Usuario model) {
        List<Usuario> models = findAll();
        models.add(model);
        saveToFile(models);
    }

    public void saveList(List<Usuario> models){

        saveToFile(models);
    }
    private void saveToFile(List<Usuario> usuarios) {
        try {
            FileWriter myWriter = new FileWriter("usuarios.txt");
            myWriter.write(gson.toJson(usuarios));
            myWriter.close();
            System.out.println("Usuario guardado correctamente");
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error");
            e.printStackTrace();
        }
    }


    public Usuario findById(String id) {
        List<Usuario> models = findAll();
        for (Usuario model : models) {
            if (Objects.equals(model.getNif(), id)) {
                return model;
            }
        }
        return null;
    }

    public List<Usuario> findAll() {
        try {
            File myObj = new File("usuarios.txt");
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
        return new ArrayList<Usuario>();
    }

    public static UsuarioFileLocalDataSource getInstance() {
        if (instance == null) {
            instance = new UsuarioFileLocalDataSource();
        }
        return instance;
    }
}


