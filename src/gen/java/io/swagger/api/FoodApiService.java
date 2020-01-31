package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import io.swagger.model.BrandedFoodObject;
import io.swagger.model.IngredientObject;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2020-01-30T02:08:15.907Z[GMT]")public interface FoodApiService {
      Response foodBrandedBarcodePhpGet(String code,SecurityContext securityContext)
      throws NotFoundException;
      Response foodBrandedNamePhpGet(String name,Integer limit,Integer page,SecurityContext securityContext)
      throws NotFoundException;
      Response foodBrandedSearchPhpGet(String allergen,String brand,String category,String country,String diet,String ingredient,String keyword,String mineral,String nutrient,String palmOil,String trace,String vitamin,Integer limit,Integer page,SecurityContext securityContext)
      throws NotFoundException;
      Response foodIngredientSearchPhpGet(String find,Integer limit,SecurityContext securityContext)
      throws NotFoundException;
}
