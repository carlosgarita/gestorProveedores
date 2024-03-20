/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestorproveedores;

/**
 *
 * @author HP
 */
public class Proveedor {
    private int idProveedor;
    private String descripcion;
    private Juego juegos[] = new Juego[50];;
    
    @Override
    public String toString() {
        return "ID: " + idProveedor + ", Descripción: " + descripcion;
    }
    
    // Métodos get y set para idProveedor
    
    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }
    
    // Métodos get y set para descripcion
    
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    // Métodos get y set para juego[]
    public Juego[] getJuegos() {
        return juegos;
    }

    public void setJuegos(Juego[] juegos) {
        this.juegos = juegos;
    }
}
