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


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2020-01-18T04:56:05.671Z[GMT]")public class FoodApi  {

    @Inject FoodApiService service;

    @GET
    @Path("/branded/barcode.php")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get a branded food item using a barcode", description = "# Get data for a branded food using the food's UPC/EAN barcode.  __Example:__ ```https://chompthis.com/api/v2/food/branded/barcode.php?api_key=API_KEY&code=CODE``` ", security = {
        @SecurityRequirement(name = "ApiKeyAuth")
    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "__Valid__ - Will return an object containing any matching foods.", content = @Content(schema = @Schema(implementation = BrandedFoodObject.class))),
        
        @ApiResponse(responseCode = "400", description = "__Validation error__ - Invalid parameters or request."),
        
        @ApiResponse(responseCode = "401", description = "__Unauthorized__ - Invalid API key or usage limits exceeded. _[More information](https://desk.zoho.com/portal/chompthis/kb/articles/what-is-a-rate-limit)_"),
        
        @ApiResponse(responseCode = "403", description = "__Forbidden__ - Disallowed entity."),
        
        @ApiResponse(responseCode = "404", description = "__Not found__ - No food items exist that match your query parameters."),
        
        @ApiResponse(responseCode = "500", description = "__Server error__ - Internal server error, request failed, or base error. _[Contact us](https://chompthis.com/api/ticket-new.php) if you see this._") })
    public Response foodBrandedBarcodePhpGet( @NotNull  @QueryParam("code") String code,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.foodBrandedBarcodePhpGet(code,securityContext);
    }
    @GET
    @Path("/branded/id.php")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get a branded food item using an ID number", description = "# Get data for a branded food using Chomp's internal ID number.  _Alternatively, set the \"source\" parameter to \"USDA\" and use the food's FDC ID._  __Example:__ ```https://chompthis.com/api/v2/food/branded/id.php?api_key=API_KEY&id=ID``` ", security = {
        @SecurityRequirement(name = "ApiKeyAuth")
    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "__Valid__ - Will return an object containing any matching foods.", content = @Content(schema = @Schema(implementation = BrandedFoodObject.class))),
        
        @ApiResponse(responseCode = "400", description = "__Validation error__ - Invalid parameters or request."),
        
        @ApiResponse(responseCode = "401", description = "__Unauthorized__ - Invalid API key or usage limits exceeded. _[More information](https://desk.zoho.com/portal/chompthis/kb/articles/what-is-a-rate-limit)_"),
        
        @ApiResponse(responseCode = "403", description = "__Forbidden__ - Disallowed entity."),
        
        @ApiResponse(responseCode = "404", description = "__Not found__ - No food items exist that match your query parameters."),
        
        @ApiResponse(responseCode = "500", description = "__Server error__ - Internal server error, request failed, or base error. _[Contact us](https://chompthis.com/api/ticket-new.php) if you see this._") })
    public Response foodBrandedIdPhpGet( @NotNull  @QueryParam("id") Integer id,  @QueryParam("source") String source,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.foodBrandedIdPhpGet(id,source,securityContext);
    }
    @GET
    @Path("/branded/name.php")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get a branded food item by name", description = "# Search for branded food items by name.  __Example:__ ```https://chompthis.com/api/v2/food/branded/name.php?api_key=API_KEY&name=NAME``` ", security = {
        @SecurityRequirement(name = "ApiKeyAuth")
    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "__Valid__ - Will return an object containing any matching foods.", content = @Content(schema = @Schema(implementation = BrandedFoodObject.class))),
        
        @ApiResponse(responseCode = "400", description = "__Validation error__ - Invalid parameters or request."),
        
        @ApiResponse(responseCode = "401", description = "__Unauthorized__ - Invalid API key or usage limits exceeded. _[More information](https://desk.zoho.com/portal/chompthis/kb/articles/what-is-a-rate-limit)_"),
        
        @ApiResponse(responseCode = "403", description = "__Forbidden__ - Disallowed entity."),
        
        @ApiResponse(responseCode = "404", description = "__Not found__ - No food items exist that match your query parameters."),
        
        @ApiResponse(responseCode = "500", description = "__Server error__ - Internal server error, request failed, or base error. _[Contact us](https://chompthis.com/api/ticket-new.php) if you see this._") })
    public Response foodBrandedNamePhpGet( @NotNull  @QueryParam("name") String name,  @QueryParam("limit") Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.foodBrandedNamePhpGet(name,limit,securityContext);
    }
    @GET
    @Path("/branded/search.php")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get data for branded food items using various search parameters", description = "# Search for branded food items using various parameters.  __Example:__ ```https://chompthis.com/api/v2/food/branded/search.php?api_key=API_KEY&brand=BRAND&country=COUNTRY&page=1```  ___Tip:__ Get started by using the [Query Builder](https://chompthis.com/api/build.php)._ ", security = {
        @SecurityRequirement(name = "ApiKeyAuth")
    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "__Valid__ - Will return an object containing any matching foods.", content = @Content(schema = @Schema(implementation = BrandedFoodObject.class))),
        
        @ApiResponse(responseCode = "400", description = "__Validation error__ - Invalid parameters or request."),
        
        @ApiResponse(responseCode = "401", description = "__Unauthorized__ - Invalid API key or usage limits exceeded. _[More information](https://desk.zoho.com/portal/chompthis/kb/articles/what-is-a-rate-limit)_"),
        
        @ApiResponse(responseCode = "403", description = "__Forbidden__ - Disallowed entity."),
        
        @ApiResponse(responseCode = "404", description = "__Not found__ - No food items exist that match your query parameters."),
        
        @ApiResponse(responseCode = "500", description = "__Server error__ - Internal server error, request failed, or base error. _[Contact us](https://chompthis.com/api/ticket-new.php) if you see this._") })
    public Response foodBrandedSearchPhpGet(  @QueryParam("allergen") String allergen,  @QueryParam("brand") String brand,  @QueryParam("category") String category,  @QueryParam("country") String country,  @QueryParam("diet") String diet,  @QueryParam("ingredient") String ingredient,  @QueryParam("keyword") String keyword,  @QueryParam("mineral") String mineral,  @QueryParam("nutrient") String nutrient,  @QueryParam("palm_oil") String palmOil,  @QueryParam("trace") String trace,  @QueryParam("vitamin") String vitamin,  @QueryParam("limit") Integer limit,  @QueryParam("page") Integer page,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.foodBrandedSearchPhpGet(allergen,brand,category,country,diet,ingredient,keyword,mineral,nutrient,palmOil,trace,vitamin,limit,page,securityContext);
    }
}
