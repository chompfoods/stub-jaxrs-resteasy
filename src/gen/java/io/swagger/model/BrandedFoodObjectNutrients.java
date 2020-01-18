package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.BrandedFoodObjectNutrientsChomp;
import io.swagger.model.BrandedFoodObjectNutrientsUsda;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.List;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description="An object containing nutrient information from multiple sources")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2020-01-18T16:52:26.635Z[GMT]")public class BrandedFoodObjectNutrients   {
  private List<BrandedFoodObjectNutrientsChomp> chomp = new ArrayList<BrandedFoodObjectNutrientsChomp>();  private List<BrandedFoodObjectNutrientsUsda> usda = new ArrayList<BrandedFoodObjectNutrientsUsda>();

  /**
   * An array containing an object for each nutrient data point
   **/
  
  @Schema(description = "An array containing an object for each nutrient data point")
  @JsonProperty("chomp")
  public List<BrandedFoodObjectNutrientsChomp> getChomp() {
    return chomp;
  }
  public void setChomp(List<BrandedFoodObjectNutrientsChomp> chomp) {
    this.chomp = chomp;
  }

  /**
   * An array containing an object for each nutrient data point as found in the USDA database
   **/
  
  @Schema(description = "An array containing an object for each nutrient data point as found in the USDA database")
  @JsonProperty("usda")
  public List<BrandedFoodObjectNutrientsUsda> getUsda() {
    return usda;
  }
  public void setUsda(List<BrandedFoodObjectNutrientsUsda> usda) {
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
    BrandedFoodObjectNutrients brandedFoodObjectNutrients = (BrandedFoodObjectNutrients) o;
    return Objects.equals(chomp, brandedFoodObjectNutrients.chomp) &&
        Objects.equals(usda, brandedFoodObjectNutrients.usda);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chomp, usda);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandedFoodObjectNutrients {\n");
    
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
