package com.fpmislata.KebabJorge.domain.entity;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor


public class Ingredientes {

    private int ingredientesId;
    private String nombreIngrediente, descripcion;
    private Proveedor proveedor;


    public Ingredientes(int ingredientesId, String nombreIngrediente, String descripcion) {
        this.ingredientesId = ingredientesId;
        this.nombreIngrediente = nombreIngrediente;
        this.descripcion = descripcion;
    }


    public Ingredientes(String nombreIngrediente, String descripcion) {
        this.nombreIngrediente = nombreIngrediente;
        this.descripcion = descripcion;
    }

}
