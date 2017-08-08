package qwe.asd.recipe.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import qwe.asd.recipe.domains.Recipe;
import qwe.asd.recipe.repositories.RecipeRepo;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Slf4j
@Service
public class RecipeServiceImpl implements RecipeService {

    @Autowired
    private RecipeRepo recipeRepo;

    @Override
    public Set<Recipe> getAllRecipes() {
        log.debug("executing recipe service impl");
        Set<Recipe> recipes = new HashSet<>();
        recipeRepo.findAll().forEach(recipes::add);
        return recipes;
    }
}
