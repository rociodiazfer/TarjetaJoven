package com.Iesam.CarnetJoven.presentation;

public class MenuView {

    public void init(){

    }
    private void createNewUsuarioForm(){

        NewUsuarioForm newUsuarioForm = new NewUsuarioForm();
        newUsuarioForm.createNewUsuario();
    }

    private void showUsuarios(){
    PrintUsuariosView printUsuariosView = new PrintUsuariosView();
    printUsuariosView.print();
    }


}
