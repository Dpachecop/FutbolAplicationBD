/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package futbolaplicationbd.base;

/**
 *
 * @author Danie
 */
import java.util.List;

public class Jugador {
    private String nombre;
    private int numero;
    private String posicion;
    private String nacionalidad;
    private String estado;
    private Equipo equipo;
    private List<Lesion> lesiones;
    private List<Premio> premios;
    private EstadisticaJugador estadisticaJugador;
    private List<EventoPartido> eventos;

    public Jugador() {}

    public Jugador(String nombre, int numero, String posicion, String nacionalidad, String estado, Equipo equipo,
                   List<Lesion> lesiones, List<Premio> premios, EstadisticaJugador estadisticaJugador, List<EventoPartido> eventos) {
        this.nombre = nombre;
        this.numero = numero;
        this.posicion = posicion;
        this.nacionalidad = nacionalidad;
        this.estado = estado;
        this.equipo = equipo;
        this.lesiones = lesiones;
        this.premios = premios;
        this.estadisticaJugador = estadisticaJugador;
        this.eventos = eventos;
    }
}
