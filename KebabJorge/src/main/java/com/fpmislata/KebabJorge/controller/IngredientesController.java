package com.fpmislata.KebabJorge.controller;

import com.fpmislata.KebabJorge.controller.model.ingredientes.IngredientesListWeb;
import com.fpmislata.KebabJorge.domain.entity.Ingredientes;
import com.fpmislata.KebabJorge.domain.service.IngredientesService;
import com.fpmislata.KebabJorge.http_response.Response;
import com.fpmislata.KebabJorge.mapper.IngredientesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(IngredientesController.INGREDIENTES)
@RestController
public class IngredientesController {

    public static final String INGREDIENTES = "/ingredientes";

    @Autowired
    IngredientesService ingredientesService;

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping("")
    public Response getAll() {
        List<Ingredientes> ingredientes = ingredientesService.getAll();
        List<IngredientesListWeb> ingredientesListWeb = ingredientes.stream()
                .map(IngredientesMapper.mapper::toIngredientesListWeb)
                .toList();

        Response response = Response.builder()
                .data(ingredientesListWeb)
                .build();
        return response;
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{ingredientesId}")
    public Response findById(@PathVariable("ingredientesId") int ingredientesId){
        return new Response( IngredientesMapper.mapper.toIngredientesDetailWeb(ingredientesService.findById(ingredientesId)));
    }

}
