package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2021-03-09T22:27:23.118Z[GMT]")public class RecipeObjectNutrientsCalories   {
  private String title = null;  private String value = null;  private String percent = null;

  /**
   * Nutrient name
   **/
  
  @Schema(description = "Nutrient name")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * The amount of this nutrient in this recipe
   **/
  
  @Schema(description = "The amount of this nutrient in this recipe")
  @JsonProperty("value")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }

  /**
   * The daily recommended percent total for this nutrient
   **/
  
  @Schema(description = "The daily recommended percent total for this nutrient")
  @JsonProperty("percent")
  public String getPercent() {
    return percent;
  }
  public void setPercent(String percent) {
    this.percent = percent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecipeObjectNutrientsCalories recipeObjectNutrientsCalories = (RecipeObjectNutrientsCalories) o;
    return Objects.equals(title, recipeObjectNutrientsCalories.title) &&
        Objects.equals(value, recipeObjectNutrientsCalories.value) &&
        Objects.equals(percent, recipeObjectNutrientsCalories.percent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, value, percent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecipeObjectNutrientsCalories {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    percent: ").append(toIndentedString(percent)).append("\n");
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
