package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import io.swagger.model.IngredientObject;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2020-01-18T16:45:46.978Z[GMT]")public interface IngredientApiService {
      Response ingredientSearchPhpGet(Integer find,Boolean list,Boolean raw,Integer limit,SecurityContext securityContext)
      throws NotFoundException;
}
