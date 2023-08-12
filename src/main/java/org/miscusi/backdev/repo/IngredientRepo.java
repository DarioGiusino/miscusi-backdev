package org.miscusi.backdev.repo;

import org.miscusi.backdev.pojo.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientRepo extends JpaRepository<Ingredient, Integer> {

}
