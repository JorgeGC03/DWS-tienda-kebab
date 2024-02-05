package com.fpmislata.KebabJorge.domain.entity;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor

public class Proveedor {

    private int proveedorId;
    private String nombre, contacto, direccion, gmail;


    public Proveedor(String nombre, String contacto, String direccion, String gmail) {
        this.nombre = nombre;
        this.contacto = contacto;
        this.direccion = direccion;
        this.gmail = gmail;
    }

}
