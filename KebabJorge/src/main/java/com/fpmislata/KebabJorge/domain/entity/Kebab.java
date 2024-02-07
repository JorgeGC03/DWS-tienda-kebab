package com.fpmislata.KebabJorge.domain.entity;

import java.util.List;

import com.fpmislata.KebabJorge.validaciones.ValidPrice;
import jakarta.annotation.Nullable;
import jakarta.validation.constraints.Min;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor


public class Kebab {

    private int kebabId;
    private String nombre;
    private String descripcion;
    @ValidPrice
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
