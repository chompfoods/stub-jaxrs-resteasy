package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.RecipeApiService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

import io.swagger.model.RecipeObject;

import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.inject.Inject;

import javax.validation.constraints.*;
@Path("/recipe")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2021-03-09T22:27:23.118Z[GMT]")public class RecipeApi  {

    @Inject RecipeApiService service;

    @GET
    @Path("/id.php")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get a recipe by ID", description = "## Get a specific recipe using an ID.  **You must have a Recipe API key to use this endpoint.** Get a [Recipe API key](https://chompthis.com/api/recipes/).  **Example** > ```https://chompthis.com/api/v2/recipe/id.php?api_key=API_KEY&id=RECIPE_ID``` ", security = {
        @SecurityRequirement(name = "ApiKeyAuth")
    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "**Valid** - Will return an object containing any matching recipes.  ", content = @Content(schema = @Schema(implementation = RecipeObject.class))),
        
        @ApiResponse(responseCode = "400", description = "**Validation error** - Invalid parameters or request. "),
        
        @ApiResponse(responseCode = "401", description = "**Unauthorized** - Invalid API key, unauthorized access, or usage limits exceeded. ***[More information &raquo;](https://desk.zoho.com/portal/chompthis/kb/articles/what-is-a-rate-limit)*** "),
        
        @ApiResponse(responseCode = "404", description = "**Not found** - No food items were found. "),
        
        @ApiResponse(responseCode = "500", description = "**Server error** - Internal server error, request failed, or base error. *Please **[contact us](https://chompthis.com/api/ticket-new.php)** if you see this.* ") })
    public Response recipeIdPhpGet( @NotNull  @QueryParam("id") String id,  @QueryParam("user_id") String userId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.recipeIdPhpGet(id,userId,securityContext);
    }
    @GET
    @Path("/ingredient.php")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get recipes using a list of ingredients", description = "## Get recipes that include all ingredients from a list.  **You must have a Recipe API key to use this endpoint.** Get a [Recipe API key](https://chompthis.com/api/recipes/).  **Example #1** > ```https://chompthis.com/api/v2/recipe/ingredient.php?api_key=API_KEY&list=INGREDIENT```  **Example #2** > ```https://chompthis.com/api/v2/recipe/ingredient.php?api_key=API_KEY&list=INGREDIENT,INGREDIENT,INGREDIENT``` ", security = {
        @SecurityRequirement(name = "ApiKeyAuth")
    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "**Valid** - Will return an object containing any matching recipes.  ", content = @Content(schema = @Schema(implementation = RecipeObject.class))),
        
        @ApiResponse(responseCode = "400", description = "**Validation error** - Invalid parameters or request. "),
        
        @ApiResponse(responseCode = "401", description = "**Unauthorized** - Invalid API key, unauthorized access, or usage limits exceeded. ***[More information &raquo;](https://desk.zoho.com/portal/chompthis/kb/articles/what-is-a-rate-limit)*** "),
        
        @ApiResponse(responseCode = "404", description = "**Not found** - No food items were found. "),
        
        @ApiResponse(responseCode = "500", description = "**Server error** - Internal server error, request failed, or base error. *Please **[contact us](https://chompthis.com/api/ticket-new.php)** if you see this.* ") })
    public Response recipeIngredientPhpGet( @NotNull  @QueryParam("list") String list,  @QueryParam("limit") Integer limit,  @QueryParam("page") Integer page,  @QueryParam("user_id") String userId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.recipeIngredientPhpGet(list,limit,page,userId,securityContext);
    }
    @GET
    @Path("/random.php")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get random popular recipes", description = "## Get random recipes that have instructions and nutrients  **You must have a Recipe API key to use this endpoint.** Get a [Recipe API key](https://chompthis.com/api/recipes/).  **Example** > ```https://chompthis.com/api/v2/recipe/random.php?api_key=API_KEY``` ", security = {
        @SecurityRequirement(name = "ApiKeyAuth")
    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "**Valid** - Will return an object containing any matching recipes.  ", content = @Content(schema = @Schema(implementation = RecipeObject.class))),
        
        @ApiResponse(responseCode = "400", description = "**Validation error** - Invalid parameters or request. "),
        
        @ApiResponse(responseCode = "401", description = "**Unauthorized** - Invalid API key, unauthorized access, or usage limits exceeded. ***[More information &raquo;](https://desk.zoho.com/portal/chompthis/kb/articles/what-is-a-rate-limit)*** "),
        
        @ApiResponse(responseCode = "404", description = "**Not found** - No food items were found. "),
        
        @ApiResponse(responseCode = "500", description = "**Server error** - Internal server error, request failed, or base error. *Please **[contact us](https://chompthis.com/api/ticket-new.php)** if you see this.* ") })
    public Response recipeRandomPhpGet(  @QueryParam("limit") Integer limit,  @QueryParam("user_id") String userId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.recipeRandomPhpGet(limit,userId,securityContext);
    }
    @GET
    @Path("/search.php")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get recipes using a title and optional filters", description = "## Get recipes using a title and optional filters.  **You must have a Recipe API key to use this endpoint.** Get a [Recipe API key](https://chompthis.com/api/recipes/).  **Example**  > ```https://chompthis.com/api/v2/recipe/search.php?api_key=API_KEY&title=TITLE``` ", security = {
        @SecurityRequirement(name = "ApiKeyAuth")
    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "**Valid** - Will return an object containing any matching recipes.  ", content = @Content(schema = @Schema(implementation = RecipeObject.class))),
        
        @ApiResponse(responseCode = "400", description = "**Validation error** - Invalid parameters or request. "),
        
        @ApiResponse(responseCode = "401", description = "**Unauthorized** - Invalid API key, unauthorized access, or usage limits exceeded. ***[More information &raquo;](https://desk.zoho.com/portal/chompthis/kb/articles/what-is-a-rate-limit)*** "),
        
        @ApiResponse(responseCode = "404", description = "**Not found** - No food items were found. "),
        
        @ApiResponse(responseCode = "500", description = "**Server error** - Internal server error, request failed, or base error. *Please **[contact us](https://chompthis.com/api/ticket-new.php)** if you see this.* ") })
    public Response recipeSearchPhpGet( @NotNull  @QueryParam("title") String title,  @QueryParam("excluded_cuisine") String excludedCuisine,  @QueryParam("included_cuisine") String includedCuisine,  @QueryParam("excluded_ingredient") String excludedIngredient,  @QueryParam("included_ingredient") String includedIngredient,  @QueryParam("nutrients_required") Integer nutrientsRequired,  @QueryParam("limit") Integer limit,  @QueryParam("page") Integer page,  @QueryParam("user_id") String userId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.recipeSearchPhpGet(title,excludedCuisine,includedCuisine,excludedIngredient,includedIngredient,nutrientsRequired,limit,page,userId,securityContext);
    }
}
