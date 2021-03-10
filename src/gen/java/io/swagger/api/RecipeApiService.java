package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import io.swagger.model.RecipeObject;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2021-03-09T22:27:23.118Z[GMT]")public interface RecipeApiService {
      Response recipeIdPhpGet(String id,String userId,SecurityContext securityContext)
      throws NotFoundException;
      Response recipeIngredientPhpGet(String list,Integer limit,Integer page,String userId,SecurityContext securityContext)
      throws NotFoundException;
      Response recipeRandomPhpGet(Integer limit,String userId,SecurityContext securityContext)
      throws NotFoundException;
      Response recipeSearchPhpGet(String title,String excludedCuisine,String includedCuisine,String excludedIngredient,String includedIngredient,Integer nutrientsRequired,Integer limit,Integer page,String userId,SecurityContext securityContext)
      throws NotFoundException;
}
