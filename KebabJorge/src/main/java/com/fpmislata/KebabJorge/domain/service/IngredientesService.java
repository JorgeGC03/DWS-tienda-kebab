package com.fpmislata.KebabJorge.domain.service;

import com.fpmislata.KebabJorge.domain.entity.Ingredientes;

import java.util.List;

public interface IngredientesService {

    List<Ingredientes> getAll();
    public Ingredientes findById(int ingredientesId);
}