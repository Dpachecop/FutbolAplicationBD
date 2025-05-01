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

public class EstadisticaEquipo {
    private int pases_completados;
    private BigDecimal posesion;
    private int goles;
    private int remates;
    private int faltas;
    private int tiros;
    private int atajadas;

    public EstadisticaEquipo() {}

    public EstadisticaEquipo(int pases_completados, BigDecimal posesion, int goles, int remates,
                             int faltas, int tiros, int atajadas) {
        this.pases_completados = pases_completados;
        this.posesion = posesion;
        this.goles = goles;
        this.remates = remates;
        this.faltas = faltas;
        this.tiros = tiros;
        this.atajadas = atajadas;
    }
}
