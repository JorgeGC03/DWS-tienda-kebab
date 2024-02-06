package com.fpmislata.KebabJorge.domain.service.impl;

import com.fpmislata.KebabJorge.domain.entity.Ingredientes;
import com.fpmislata.KebabJorge.domain.entity.Kebab;
import com.fpmislata.KebabJorge.domain.entity.Proveedor;
import com.fpmislata.KebabJorge.domain.repository.IngredientesRepository;
import com.fpmislata.KebabJorge.domain.repository.KebabRepository;
import com.fpmislata.KebabJorge.domain.repository.ProveedorRepository;
import com.fpmislata.KebabJorge.domain.service.IngredientesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IngredientesServiceImpl implements IngredientesService {

    @Autowired
    IngredientesRepository ingredientesRepository;
    @Autowired
    ProveedorRepository proveedorRepository;


    @Override
    public List<Ingredientes> getAll() {
        return ingredientesRepository.getAll();
    }

    @Override
    public Ingredientes findById(int ingredientesId) {
        return ingredientesRepository.findById(ingredientesId);
    }

    @Override
    public Ingredientes insertIngrediente(Ingredientes ingredientes, int proveedorId) {
        Proveedor proveedor = proveedorRepository.findById(proveedorId);
        ingredientes.setProveedor(proveedor);
        return ingredientesRepository.insertIngrediente(ingredientes);
    }

}
