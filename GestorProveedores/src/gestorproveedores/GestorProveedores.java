/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestorproveedores;

/**
 *
 * @author HP
 */
public class GestorProveedores {

    public static int idProveedor = 1;
    
    public static QueueArray colaProveedores = new QueueArray();
    public static StackArray pilaJuegos = new StackArray();
    
    public static GUI_MenuPrincipal ventanaPrincipal = new GUI_MenuPrincipal();
    public static GUI_RegistroJuegos ventanaJuegos = new GUI_RegistroJuegos();
    public static GUI_RegistroProveedores ventanaProveedores = new GUI_RegistroProveedores();
    public static GUI_EliminarProveedor ventanaEliminarProveedor = new GUI_EliminarProveedor();
    public static GUI_EliminarJuego ventanaEliminarJuego = new GUI_EliminarJuego();
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        mostrarMenuPrincipal();
    }
    

    
    //Mostrar
    public static void mostrarMenuPrincipal() {
        ventanaPrincipal.setVisible(true);
    }
    
    public static void mostrarRegistroJuegos() {
        ventanaJuegos.setVisible(true);
        ventanaJuegos.mostrarDatosColaEnTabla();
        ventanaJuegos.listenerTabla();
    }
    
    public static void mostrarRegistroProveedores() {
        ventanaProveedores.setVisible(true);
        ventanaProveedores.mostrarDatosColaEnTabla();
    }
    
    public static void mostrarEliminarProveedor() {
        ventanaEliminarProveedor.setVisible(true);
    }
    
    public static void mostrarEliminarJuego() {
        ventanaEliminarJuego.setVisible(true);
        ventanaEliminarJuego.llenarComboBoxProveedores();
    }

    //Ocultar ventanas
    
    public static void ocultarMenuPrincipal() {
        ventanaPrincipal.setVisible(false);
    }
    
    public static void ocultarRegistroJuegos() {
        ventanaJuegos.setVisible(false);
    }
    
    public static void ocultarRegistroProveedores() {
        ventanaProveedores.setVisible(false);
    }
    
    public static void ocultarEliminarProveedor() {
        ventanaEliminarProveedor.setVisible(false);
    }
    
    public static void ocultarEliminarJuego() {
        ventanaEliminarJuego.setVisible(false);
    }
    
}
