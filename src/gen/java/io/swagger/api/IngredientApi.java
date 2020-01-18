package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.IngredientApiService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

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
@Path("/ingredient")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2020-01-18T16:42:41.986Z[GMT]")public class IngredientApi  {

    @Inject IngredientApiService service;

    @GET
    @Path("/search.php")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get raw/generic food ingredient item(s)", description = "# Get data for a specific ingredient or a specific set of ingredients.  __Example:__ ```https://chompthis.com/api/v2/ingredient/search.php?api_key=API_KEY&find=STRING/LIST&list=BOOLEAN&raw=BOOLEAN``` ", security = {
        @SecurityRequirement(name = "ApiKeyAuth")
    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "__Valid__ - Will return an object containing any matching ingredient foods.", content = @Content(schema = @Schema(implementation = IngredientObject.class))),
        
        @ApiResponse(responseCode = "400", description = "__Validation error__ - Invalid parameters or request."),
        
        @ApiResponse(responseCode = "401", description = "__Unauthorized__ - Invalid API key or usage limits exceeded. _[More information](https://desk.zoho.com/portal/chompthis/kb/articles/what-is-a-rate-limit)_"),
        
        @ApiResponse(responseCode = "403", description = "__Forbidden__ - Disallowed entity."),
        
        @ApiResponse(responseCode = "404", description = "__Not found__ - No food items exist that match your query parameters."),
        
        @ApiResponse(responseCode = "500", description = "__Server error__ - Internal server error, request failed, or base error. _[Contact us](https://chompthis.com/api/ticket-new.php) if you see this._") })
    public Response ingredientSearchPhpGet( @NotNull  @QueryParam("find") Integer find, @NotNull  @QueryParam("list") Boolean list,  @QueryParam("raw") Boolean raw,  @QueryParam("limit") Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.ingredientSearchPhpGet(find,list,raw,limit,securityContext);
    }
}
