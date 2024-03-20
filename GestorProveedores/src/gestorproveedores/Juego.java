/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestorproveedores;

import java.util.Objects;
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
    
    // Implementación del método equals()
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Juego juego = (Juego) obj;
        return Objects.equals(codigoGUID, juego.codigoGUID) &&
               Objects.equals(nombre, juego.nombre) &&
               Objects.equals(categoriaInteraccion, juego.categoriaInteraccion) &&
               Objects.equals(categoriaAccesorios, juego.categoriaAccesorios) &&
               Objects.equals(mecanica, juego.mecanica) &&
               Objects.equals(numeroParticipantes, juego.numeroParticipantes) &&
               edadMinima == juego.edadMinima;
    }
    
    // Implementación del método hashCode()
    @Override
    public int hashCode() {
        return Objects.hash(codigoGUID, nombre, categoriaInteraccion, categoriaAccesorios, mecanica, numeroParticipantes, edadMinima);
    }
}
