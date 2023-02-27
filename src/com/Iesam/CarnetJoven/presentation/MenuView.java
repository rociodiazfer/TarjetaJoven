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


    private void createPromociones(){
      NewPromocionForm newPromocionForm = new NewPromocionForm();
      newPromocionForm.createNewPromocion();
    }

    private void showPromociones(){
        PrintPromocionesView printPromocionesView = new PrintPromocionesView();
        printPromocionesView.print();
    }

    private void createEmpresa(){
        NewEmpresaForm newEmpresaForm = new NewEmpresaForm();
        newEmpresaForm.createNewEmpresa();
    }
    private void showEmpresas(){
    PrintEmpresasView printEmpresasView = new PrintEmpresasView();
    printEmpresasView.print();
    }

    private void createCompras(){
        NewCompraForm newCompraForm = new NewCompraForm();
        newCompraForm.createNewCompra();
    }
    private void showCompras(){
        PrintComprasView printComprasView = new PrintComprasView();
        printComprasView.print();
    }

}
