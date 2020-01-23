package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.FoodApiService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

import io.swagger.model.BrandedFoodObject;
import io.swagger.model.IngredientObject;

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
@Path("/food")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2020-01-23T13:12:53.411Z[GMT]")public class FoodApi  {

    @Inject FoodApiService service;

    @GET
    @Path("/branded/barcode.php")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get a branded food item using a barcode", description = "## Get data for a branded food using the food's UPC/EAN barcode.  **Example**  > ```https://chompthis.com/api/v2/food/branded/barcode.php?api_key=API_KEY&code=CODE```  **Tips**   * Read our **[Knowledge Base article](https://desk.zoho.com/portal/chompthis/kb/articles/im-having-trouble-getting-matches-for-barcodes-what-can-id-do)** for helpful tips and tricks. ", security = {
        @SecurityRequirement(name = "ApiKeyAuth")
    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "**Valid** - Will return an object containing any matching foods.  ", content = @Content(schema = @Schema(implementation = BrandedFoodObject.class))),
        
        @ApiResponse(responseCode = "400", description = "**Validation error** - Invalid parameters or request. "),
        
        @ApiResponse(responseCode = "401", description = "**Unauthorized** - Invalid API key or usage limits exceeded. ***[More information &raquo;](https://desk.zoho.com/portal/chompthis/kb/articles/what-is-a-rate-limit)*** "),
        
        @ApiResponse(responseCode = "403", description = "**Forbidden** - Disallowed entity. "),
        
        @ApiResponse(responseCode = "404", description = "**Not found** - No food items exist that match your query parameters. "),
        
        @ApiResponse(responseCode = "500", description = "**Server error** - Internal server error, request failed, or base error. *Please **[contact us](https://chompthis.com/api/ticket-new.php)** if you see this.* ") })
    public Response foodBrandedBarcodePhpGet( @NotNull  @QueryParam("code") String code,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.foodBrandedBarcodePhpGet(code,securityContext);
    }
    @GET
    @Path("/branded/id.php")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get a branded food item using an ID number", description = "## Get data for a branded food using Chomp's internal ID number.  **Example** > ```https://chompthis.com/api/v2/food/branded/id.php?api_key=API_KEY&id=ID```  **Tips**   * Find a food's ID by using our **[food lookup tool](https://chompthis.com/api/lookup.php)**.   * Alternatively, set the \"source\" parameter to \"USDA\" and use the food's FDC ID. ", security = {
        @SecurityRequirement(name = "ApiKeyAuth")
    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "**Valid** - Will return an object containing any matching foods.  ", content = @Content(schema = @Schema(implementation = BrandedFoodObject.class))),
        
        @ApiResponse(responseCode = "400", description = "**Validation error** - Invalid parameters or request. "),
        
        @ApiResponse(responseCode = "401", description = "**Unauthorized** - Invalid API key or usage limits exceeded. ***[More information &raquo;](https://desk.zoho.com/portal/chompthis/kb/articles/what-is-a-rate-limit)*** "),
        
        @ApiResponse(responseCode = "403", description = "**Forbidden** - Disallowed entity. "),
        
        @ApiResponse(responseCode = "404", description = "**Not found** - No food items exist that match your query parameters. "),
        
        @ApiResponse(responseCode = "500", description = "**Server error** - Internal server error, request failed, or base error. *Please **[contact us](https://chompthis.com/api/ticket-new.php)** if you see this.* ") })
    public Response foodBrandedIdPhpGet( @NotNull  @QueryParam("id") Integer id,  @QueryParam("source") String source,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.foodBrandedIdPhpGet(id,source,securityContext);
    }
    @GET
    @Path("/branded/name.php")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get a branded food item by name", description = "## Search for branded food items by name.  **Example** > ```https://chompthis.com/api/v2/food/branded/name.php?api_key=API_KEY&name=NAME```  **Tips**   * Get started by using our **[food lookup tool](https://chompthis.com/api/lookup.php)**.  > This API endpoint is only available to Standard and Premium API subscribers. Please consider upgrading your subscription if you are subscribed to the Limited plan. **[Read this](https://desk.zoho.com/portal/chompthis/kb/articles/can-i-upgrade-downgrade-my-subscription)** if you aren't sure how to upgrade your subscription. ", security = {
        @SecurityRequirement(name = "ApiKeyAuth")
    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "**Valid** - Will return an object containing any matching foods.  ", content = @Content(schema = @Schema(implementation = BrandedFoodObject.class))),
        
        @ApiResponse(responseCode = "400", description = "**Validation error** - Invalid parameters or request. "),
        
        @ApiResponse(responseCode = "401", description = "**Unauthorized** - Invalid API key or usage limits exceeded. ***[More information &raquo;](https://desk.zoho.com/portal/chompthis/kb/articles/what-is-a-rate-limit)*** "),
        
        @ApiResponse(responseCode = "403", description = "**Forbidden** - Disallowed entity. "),
        
        @ApiResponse(responseCode = "404", description = "**Not found** - No food items exist that match your query parameters. "),
        
        @ApiResponse(responseCode = "500", description = "**Server error** - Internal server error, request failed, or base error. *Please **[contact us](https://chompthis.com/api/ticket-new.php)** if you see this.* ") })
    public Response foodBrandedNamePhpGet( @NotNull  @QueryParam("name") String name,  @QueryParam("limit") Integer limit,  @QueryParam("page") Integer page,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.foodBrandedNamePhpGet(name,limit,page,securityContext);
    }
    @GET
    @Path("/branded/search.php")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get data for branded food items using various search parameters", description = "## Search for branded food items using various parameters.  **Example** > ```https://chompthis.com/api/v2/food/branded/search.php?api_key=API_KEY&brand=BRAND&country=COUNTRY&page=1```  **Tips**    * Get started by using the **[Query Builder](https://chompthis.com/api/build.php)**.  > This API endpoint is only available to Standard and Premium API subscribers. Please consider upgrading your subscription if you are subscribed to the Limited plan. **[Read this](https://desk.zoho.com/portal/chompthis/kb/articles/can-i-upgrade-downgrade-my-subscription)** if you aren't sure how to upgrade your subscription. ", security = {
        @SecurityRequirement(name = "ApiKeyAuth")
    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "**Valid** - Will return an object containing any matching foods.  ", content = @Content(schema = @Schema(implementation = BrandedFoodObject.class))),
        
        @ApiResponse(responseCode = "400", description = "**Validation error** - Invalid parameters or request. "),
        
        @ApiResponse(responseCode = "401", description = "**Unauthorized** - Invalid API key or usage limits exceeded. ***[More information &raquo;](https://desk.zoho.com/portal/chompthis/kb/articles/what-is-a-rate-limit)*** "),
        
        @ApiResponse(responseCode = "403", description = "**Forbidden** - Disallowed entity. "),
        
        @ApiResponse(responseCode = "404", description = "**Not found** - No food items exist that match your query parameters. "),
        
        @ApiResponse(responseCode = "500", description = "**Server error** - Internal server error, request failed, or base error. *Please **[contact us](https://chompthis.com/api/ticket-new.php)** if you see this.* ") })
    public Response foodBrandedSearchPhpGet(  @QueryParam("allergen") String allergen,  @QueryParam("brand") String brand,  @QueryParam("category") String category,  @QueryParam("country") String country,  @QueryParam("diet") String diet,  @QueryParam("ingredient") String ingredient,  @QueryParam("keyword") String keyword,  @QueryParam("mineral") String mineral,  @QueryParam("nutrient") String nutrient,  @QueryParam("palm_oil") String palmOil,  @QueryParam("trace") String trace,  @QueryParam("vitamin") String vitamin,  @QueryParam("limit") Integer limit,  @QueryParam("page") Integer page,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.foodBrandedSearchPhpGet(allergen,brand,category,country,diet,ingredient,keyword,mineral,nutrient,palmOil,trace,vitamin,limit,page,securityContext);
    }
    @GET
    @Path("/ingredient/search.php")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get raw/generic food ingredient item(s)", description = "## Get data for a specific ingredient or a specific set of ingredients.  **Example #1: Single Ingredient** > ```https://chompthis.com/api/v2/ingredient/search.php?api_key=API_KEY&find=broccoli&raw=true```  **Example #2: Set of Ingredients** > ```https://chompthis.com/api/v2/ingredient/search.php?api_key=API_KEY&find=broccoli,cauliflower,spinach&list=true&raw=true```  **Tips**   * Expose ingredient endpoints by using our **[food lookup tool](https://chompthis.com/api/lookup.php)**.  > This API endpoint is only available to Standard and Premium API subscribers. Please consider upgrading your subscription if you are subscribed to the Limited plan. **[Read this](https://desk.zoho.com/portal/chompthis/kb/articles/can-i-upgrade-downgrade-my-subscription)** if you aren't sure how to upgrade your subscription. ", security = {
        @SecurityRequirement(name = "ApiKeyAuth")
    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "**Valid** - Will return an object containing any matching ingredient foods.  ", content = @Content(schema = @Schema(implementation = IngredientObject.class))),
        
        @ApiResponse(responseCode = "400", description = "**Validation error** - Invalid parameters or request. "),
        
        @ApiResponse(responseCode = "401", description = "**Unauthorized** - Invalid API key or usage limits exceeded. ***[More information &raquo;](https://desk.zoho.com/portal/chompthis/kb/articles/what-is-a-rate-limit)*** "),
        
        @ApiResponse(responseCode = "403", description = "**Forbidden** - Disallowed entity. "),
        
        @ApiResponse(responseCode = "404", description = "**Not found** - No food items exist that match your query parameters. "),
        
        @ApiResponse(responseCode = "500", description = "**Server error** - Internal server error, request failed, or base error. *Please **[contact us](https://chompthis.com/api/ticket-new.php)** if you see this.* ") })
    public Response foodIngredientSearchPhpGet( @NotNull  @QueryParam("find") Integer find, @NotNull  @QueryParam("list") Boolean list,  @QueryParam("raw") Boolean raw,  @QueryParam("limit") Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.foodIngredientSearchPhpGet(find,list,raw,limit,securityContext);
    }
}
