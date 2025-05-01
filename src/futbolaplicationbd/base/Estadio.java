/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package futbolaplicationbd.base;

/**
 *
 * @author Danie
 */
public class Estadio {
    private String nombre;
    private String calle;
    private String numero;
    private String ciudad;
    private String pais;
    private int capacidad_maxima;
    private String estado;

    public Estadio() {}

    public Estadio(String nombre, String calle, String numero, String ciudad, String pais, int capacidad_maxima, String estado) {
        this.nombre = nombre;
        this.calle = calle;
        this.numero = numero;
        this.ciudad = ciudad;
        this.pais = pais;
        this.capacidad_maxima = capacidad_maxima;
        this.estado = estado;
    }
}
