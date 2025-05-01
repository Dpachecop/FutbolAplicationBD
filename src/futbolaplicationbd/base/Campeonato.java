package futbolaplicationbd.base;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Danie
 */
import java.util.List;

public class Campeonato {
    private String nombre;
    private String liga;
    private String formato_torneo;
    private String temporada;
    private List<Equipo> equipos;

    public Campeonato() {}

    public Campeonato(String nombre, String liga, String formato_torneo, String temporada, List<Equipo> equipos) {
        this.nombre = nombre;
        this.liga = liga;
        this.formato_torneo = formato_torneo;
        this.temporada = temporada;
        this.equipos = equipos;
    }
}
