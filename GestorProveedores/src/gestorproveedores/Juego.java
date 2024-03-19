/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestorproveedores;

import java.util.UUID;

/**
 *
 * @author HP
 */
public class Juego {
    
    private UUID codigoGUID;
    private String nombre;
    private String categoriaInteraccion;
    private String categoriaAccesorios;
    private String mecanica;
    private String numeroParticipantes;
    private int edadMinima;
    
    // Métodos get y set para codigoGUID
    public UUID getCodigoGUID() {
        return codigoGUID;
    }

    public void setCodigoGUID(UUID codigoGUID) {
        this.codigoGUID = codigoGUID;
    }

    // Métodos get y set para nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Métodos get y set para categoriaInteraccion
    public String getCategoriaInteraccion() {
        return categoriaInteraccion;
    }

    public void setCategoriaInteraccion(String categoriaInteraccion) {
        this.categoriaInteraccion = categoriaInteraccion;
    }

    // Métodos get y set para categoriaAccesorios
    public String getCategoriaAccesorios() {
        return categoriaAccesorios;
    }

    public void setCategoriaAccesorios(String categoriaAccesorios) {
        this.categoriaAccesorios = categoriaAccesorios;
    }

    // Métodos get y set para mecanica
    public String getMecanica() {
        return mecanica;
    }

    public void setMecanica(String mecanica) {
        this.mecanica = mecanica;
    }

    // Métodos get y set para numeroParticipantes
    public String getNumeroParticipantes() {
        return numeroParticipantes;
    }

    public void setNumeroParticipantes(String numeroParticipantes) {
        this.numeroParticipantes = numeroParticipantes;
    }

    // Métodos get y set para edadMinima
    public int getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }
}
