/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package futbolaplicationbd.base;

/**
 *
 * @author Danie
 */
public class EventoPartido {
    private TipoEventoEnum tipo_evento;
    private int minuto;
    private String detalle_extra;
    private String tipo_gol;
    private int consultas_var;
    private String zona;

    public EventoPartido() {}

    public EventoPartido(TipoEventoEnum tipo_evento, int minuto, String detalle_extra,
                         String tipo_gol, int consultas_var, String zona) {
        this.tipo_evento = tipo_evento;
        this.minuto = minuto;
        this.detalle_extra = detalle_extra;
        this.tipo_gol = tipo_gol;
        this.consultas_var = consultas_var;
        this.zona = zona;
    }
}

