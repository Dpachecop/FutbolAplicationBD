/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package futbolaplicationbd.base;

/**
 *
 * @author Danie
 */
public class DirectorTec {
    private String nombre;
    private String nacionalidad;
    private int experiencia;
    private Equipo equipo;

    public DirectorTec() {}

    public DirectorTec(String nombre, String nacionalidad, int experiencia, Equipo equipo) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.experiencia = experiencia;
        this.equipo = equipo;
    }
}
