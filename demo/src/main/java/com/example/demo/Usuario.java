/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo;

/**
 *
 * @author kevin
 */
public class Usuario {
    private String nombre;
    private String correo;
    private String tipo;
    
     // Constructor
    public Usuario(String nombre, String correo, String tipo) {
        this.nombre = nombre;
        this.correo = correo;
        this.tipo = tipo;
    }

    public Usuario() {
        
    }

    // Métodos getter
    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public String getTipo() {
        return tipo;
    }

    // Métodos setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
