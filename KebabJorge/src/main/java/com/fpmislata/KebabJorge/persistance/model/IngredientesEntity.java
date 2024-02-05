package com.fpmislata.KebabJorge.persistance.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.*;
import org.mapstruct.Mapping;

@Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor

@Data
@Entity
@Table(name = "ingredientes")

public class IngredientesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ingredientesId;
    private String nombreIngrediente, descripcion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "proveedorId")
    private ProveedorEntity proveedorEntity;



}