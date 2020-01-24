package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.BrandedFoodObjectDietLabelsGlutenFree;
import io.swagger.model.BrandedFoodObjectDietLabelsVegan;
import io.swagger.model.BrandedFoodObjectDietLabelsVegetarian;
import io.swagger.v3.oas.annotations.media.Schema;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description="An object containing this item's compatibility grades for each supported diet")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2020-01-24T13:22:21.935Z[GMT]")public class BrandedFoodObjectDietLabels   {
  private BrandedFoodObjectDietLabelsVegan vegan = null;  private BrandedFoodObjectDietLabelsVegetarian vegetarian = null;  private BrandedFoodObjectDietLabelsGlutenFree glutenFree = null;

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("vegan")
  public BrandedFoodObjectDietLabelsVegan getVegan() {
    return vegan;
  }
  public void setVegan(BrandedFoodObjectDietLabelsVegan vegan) {
    this.vegan = vegan;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("vegetarian")
  public BrandedFoodObjectDietLabelsVegetarian getVegetarian() {
    return vegetarian;
  }
  public void setVegetarian(BrandedFoodObjectDietLabelsVegetarian vegetarian) {
    this.vegetarian = vegetarian;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("gluten_free")
  public BrandedFoodObjectDietLabelsGlutenFree getGlutenFree() {
    return glutenFree;
  }
  public void setGlutenFree(BrandedFoodObjectDietLabelsGlutenFree glutenFree) {
    this.glutenFree = glutenFree;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandedFoodObjectDietLabels brandedFoodObjectDietLabels = (BrandedFoodObjectDietLabels) o;
    return Objects.equals(vegan, brandedFoodObjectDietLabels.vegan) &&
        Objects.equals(vegetarian, brandedFoodObjectDietLabels.vegetarian) &&
        Objects.equals(glutenFree, brandedFoodObjectDietLabels.glutenFree);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vegan, vegetarian, glutenFree);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandedFoodObjectDietLabels {\n");
    
    sb.append("    vegan: ").append(toIndentedString(vegan)).append("\n");
    sb.append("    vegetarian: ").append(toIndentedString(vegetarian)).append("\n");
    sb.append("    glutenFree: ").append(toIndentedString(glutenFree)).append("\n");
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
