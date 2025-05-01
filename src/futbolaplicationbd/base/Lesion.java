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

public class Lesion {
    private String tipo_lesion;
    private LocalDate fecha;

    public Lesion() {}

    public Lesion(String tipo_lesion, LocalDate fecha) {
        this.tipo_lesion = tipo_lesion;
        this.fecha = fecha;
    }
}

