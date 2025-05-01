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

public class Equipo {
    private String nombre;
    private String pais;
    private List<Jugador> jugadores;
    private List<PersonalLogistico> personalLogistico;
    private List<CambioTactico> cambiosTacticos;
    private DirectorTec directorTecnico;
    private EstadisticaEquipo estadisticaEquipo;

    public Equipo() {}

    public Equipo(String nombre, String pais, List<Jugador> jugadores, List<PersonalLogistico> personalLogistico,
                  List<CambioTactico> cambiosTacticos, DirectorTec directorTecnico, EstadisticaEquipo estadisticaEquipo) {
        this.nombre = nombre;
        this.pais = pais;
        this.jugadores = jugadores;
        this.personalLogistico = personalLogistico;
        this.cambiosTacticos = cambiosTacticos;
        this.directorTecnico = directorTecnico;
        this.estadisticaEquipo = estadisticaEquipo;
    }
}

