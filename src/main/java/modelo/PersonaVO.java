/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.time.LocalDate;

/**
 *
 * @author enrique
 */
public class PersonaVO {
    private int pk;
    private String nombre;
    private LocalDate fechaNacimiento; 

    public PersonaVO(int pk, String nombre, LocalDate fechaNacimiento) {
        this.pk = pk;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public PersonaVO(){
        
    }
    
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getPk() {
        return pk;
    }

    public void setPk(int pk) {
        this.pk = pk;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        // Recordar LocalDate: yyyy-(año)-MM(mes)-dd(día)
        return "PersonaVO{" + "pk=" + pk + ", nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + '}';
    }
}
