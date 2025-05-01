/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package futbolaplicationbd.base;

/**
 *
 * @author Danie
 */
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class Partido {
    private LocalDate fecha;
    private LocalTime hora;
    private String ronda;
    private String lado_cancha_local;
    private String lado_cancha_visitante;
    private List<Equipo> equipos;
    private List<EventoPartido> eventos;
    private List<ArbitroPorPartido> arbitros;
    private List<Lesion> lesiones;
    private List<EstadisticaJugador> estadisticasJugadores;
    private List<EstadisticaEquipo> estadisticasEquipos;
    private List<CambioTactico> cambiosTacticos;

    public Partido() {}

    public Partido(LocalDate fecha, LocalTime hora, String ronda, String lado_cancha_local, String lado_cancha_visitante,
                   List<Equipo> equipos, List<EventoPartido> eventos, List<ArbitroPorPartido> arbitros,
                   List<Lesion> lesiones, List<EstadisticaJugador> estadisticasJugadores,
                   List<EstadisticaEquipo> estadisticasEquipos, List<CambioTactico> cambiosTacticos) {
        this.fecha = fecha;
        this.hora = hora;
        this.ronda = ronda;
        this.lado_cancha_local = lado_cancha_local;
        this.lado_cancha_visitante = lado_cancha_visitante;
        this.equipos = equipos;
        this.eventos = eventos;
        this.arbitros = arbitros;
        this.lesiones = lesiones;
        this.estadisticasJugadores = estadisticasJugadores;
        this.estadisticasEquipos = estadisticasEquipos;
        this.cambiosTacticos = cambiosTacticos;
    }
}
