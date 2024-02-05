package com.fpmislata.KebabJorge.domain.entity;

import java.util.List;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor


public class Kebab {

    private int kebabId;
    private String nombre;
    private String descripcion;
    private double precio;
    private List<Ingredientes> Ingredientes;


     public Kebab(int kebabId, String nombre, String descripcion, double precio) {
        this.kebabId = kebabId;
        this.nombre = nombre;
        this.descripcion = descripcion;
         this.precio = precio;
     }


    public Kebab(String nombre, String descripcion, double precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    

}
