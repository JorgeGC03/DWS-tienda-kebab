package com.fpmislata.KebabJorge.domain.entity;
import com.fpmislata.KebabJorge.validaciones.ValidEmail;
import com.fpmislata.KebabJorge.validaciones.ValidName;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor

public class Proveedor {

    private int proveedorId;
    @ValidName
    @NotBlank(message = "El nombre no puede estar en blanco")
    private String nombre;
    private String contacto;
    private String direccion;
    @ValidEmail
    @NotBlank(message = "El correo electrónico no puede estar en blanco")
    private String gmail;


    public Proveedor(String nombre, String contacto, String direccion, String gmail) {
        this.nombre = nombre;
        this.contacto = contacto;
        this.direccion = direccion;
        this.gmail = gmail;
    }

}
