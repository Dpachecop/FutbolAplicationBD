/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package futbolaplicationbd.base;

/**
 *
 * @author Danie
 */
public class ArbitroPorPartido {
    private String nombre;
    private Partido partido;
    private String tipo;

    public ArbitroPorPartido() {}

    public ArbitroPorPartido(String nombre, Partido partido, String tipo) {
        this.nombre = nombre;
        this.partido = partido;
        this.tipo = tipo;
    }
}
