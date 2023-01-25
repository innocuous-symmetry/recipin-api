package com.innocuoussymmetry.recipin.repositories;

import com.innocuoussymmetry.recipin.models.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Integer> { }
