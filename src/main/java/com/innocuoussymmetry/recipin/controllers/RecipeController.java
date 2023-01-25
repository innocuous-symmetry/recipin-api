package com.innocuoussymmetry.recipin.controllers;

import com.innocuoussymmetry.recipin.models.Recipe;
import com.innocuoussymmetry.recipin.repositories.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/recipe")
public class RecipeController {
    private final RecipeRepository recipeRepository;

    @Autowired
    public RecipeController(RecipeRepository repository) {
        this.recipeRepository = repository;
    }

    @GetMapping()
    public Iterable<Recipe> getAllRecipes() {
        return this.recipeRepository.findAll();
    }

    @GetMapping("/{id}")
    public Recipe getRecipeById(@PathVariable Integer id) {
        Optional<Recipe> recipe = this.recipeRepository.findById(id);
        return recipe.orElse(null);
    }

    @PostMapping()
    public Recipe addNewRecipe(@RequestBody Recipe recipe) {
        return this.recipeRepository.save(recipe);
    }
}
