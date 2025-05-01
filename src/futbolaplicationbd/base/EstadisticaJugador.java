/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package futbolaplicationbd.base;

/**
 *
 * @author Danie
 */
import java.math.BigDecimal;

public class EstadisticaJugador {
    private int goles;
    private int asistencias;
    private int tarjetas_amarillas;
    private int tarjetas_rojas;
    private int remates;
    private int regates;
    private BigDecimal posesion;
    private int remates_fuera;
    private int remates_atajados;
    private int tiros_bloqueados;

    public EstadisticaJugador() {}

    public EstadisticaJugador(int goles, int asistencias, int tarjetas_amarillas, int tarjetas_rojas,
                               int remates, int regates, BigDecimal posesion, int remates_fuera,
                               int remates_atajados, int tiros_bloqueados) {
        this.goles = goles;
        this.asistencias = asistencias;
        this.tarjetas_amarillas = tarjetas_amarillas;
        this.tarjetas_rojas = tarjetas_rojas;
        this.remates = remates;
        this.regates = regates;
        this.posesion = posesion;
        this.remates_fuera = remates_fuera;
        this.remates_atajados = remates_atajados;
        this.tiros_bloqueados = tiros_bloqueados;
    }
}

