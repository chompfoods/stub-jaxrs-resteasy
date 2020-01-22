package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description="An object containing this item's ingredients in order of highest value to least")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2020-01-22T14:07:34.207Z[GMT]")public class BrandedFoodObjectIngredients   {
  private String chomp = null;  private String usda = null;

  /**
   * Ingredients for this item from Chomp&#x27;s internal database
   **/
  
  @Schema(description = "Ingredients for this item from Chomp's internal database")
  @JsonProperty("chomp")
  public String getChomp() {
    return chomp;
  }
  public void setChomp(String chomp) {
    this.chomp = chomp;
  }

  /**
   * This branded food item&#x27;s ingredients according to the USDA
   **/
  
  @Schema(description = "This branded food item's ingredients according to the USDA")
  @JsonProperty("usda")
  public String getUsda() {
    return usda;
  }
  public void setUsda(String usda) {
    this.usda = usda;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandedFoodObjectIngredients brandedFoodObjectIngredients = (BrandedFoodObjectIngredients) o;
    return Objects.equals(chomp, brandedFoodObjectIngredients.chomp) &&
        Objects.equals(usda, brandedFoodObjectIngredients.usda);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chomp, usda);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandedFoodObjectIngredients {\n");
    
    sb.append("    chomp: ").append(toIndentedString(chomp)).append("\n");
    sb.append("    usda: ").append(toIndentedString(usda)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
