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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        mostrarMenuPrincipal();
        colaProveedores = new QueueArray();
        pilaJuegos = new StackArray();
        idProveedor = 1;
        
        ventanaJuegos = new GUI_RegistroJuegos();
        ventanaProveedores = new GUI_RegistroProveedores();
    }
    
    public static int idProveedor;
    
    public static QueueArray colaProveedores;
    public static StackArray pilaJuegos;
    
    public static GUI_MenuPrincipal ventanaPrincipal = new GUI_MenuPrincipal();
    public static GUI_RegistroJuegos ventanaJuegos;
    public static GUI_RegistroProveedores ventanaProveedores;
    
    //Mostrar
    public static void mostrarMenuPrincipal() {
        ventanaPrincipal.setVisible(true);
    }
    
    public static void mostrarRegistroJuegos() {
        ventanaJuegos.setVisible(true);
    }
    
    public static void mostrarRegistroProveedores() {
        ventanaProveedores.setVisible(true);
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
    
}
