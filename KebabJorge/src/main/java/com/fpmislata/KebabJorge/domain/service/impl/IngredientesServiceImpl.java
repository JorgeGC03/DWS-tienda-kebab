package com.fpmislata.KebabJorge.domain.service.impl;

import com.fpmislata.KebabJorge.domain.entity.Ingredientes;
import com.fpmislata.KebabJorge.domain.entity.Kebab;
import com.fpmislata.KebabJorge.domain.repository.IngredientesRepository;
import com.fpmislata.KebabJorge.domain.repository.KebabRepository;
import com.fpmislata.KebabJorge.domain.service.IngredientesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IngredientesServiceImpl implements IngredientesService {

    @Autowired
    IngredientesRepository ingredientesRepository;
    @Autowired
    KebabRepository kebabRepository;


    @Override
    public List<Ingredientes> getAll() {
        return ingredientesRepository.getAll();
    }

    @Override
    public Ingredientes findById(int ingredientesId) {
        return ingredientesRepository.findById(ingredientesId);
    }

}
