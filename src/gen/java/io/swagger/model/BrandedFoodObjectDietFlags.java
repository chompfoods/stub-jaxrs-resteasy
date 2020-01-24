package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description="An object containing information on an individual ingredient that was flagged as potentially not being compatible with a certain diet")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2020-01-24T14:21:11.582Z[GMT]")public class BrandedFoodObjectDietFlags   {
  private String ingredient = null;  private String ingredientDescription = null;  private String dietLabel = null;  private String isCompatible = null;  private Integer compatibilityLevel = null;  private String compatibilityDescription = null;  private Boolean isAllergen = null;

  /**
   * Ingredient name
   **/
  
  @Schema(description = "Ingredient name")
  @JsonProperty("ingredient")
  public String getIngredient() {
    return ingredient;
  }
  public void setIngredient(String ingredient) {
    this.ingredient = ingredient;
  }

  /**
   * Description of the ingredient
   **/
  
  @Schema(description = "Description of the ingredient")
  @JsonProperty("ingredient_description")
  public String getIngredientDescription() {
    return ingredientDescription;
  }
  public void setIngredientDescription(String ingredientDescription) {
    this.ingredientDescription = ingredientDescription;
  }

  /**
   * Name of the diet with which this ingredient may not be compatible
   **/
  
  @Schema(description = "Name of the diet with which this ingredient may not be compatible")
  @JsonProperty("diet_label")
  public String getDietLabel() {
    return dietLabel;
  }
  public void setDietLabel(String dietLabel) {
    this.dietLabel = dietLabel;
  }

  /**
   * A description of if we believe this ingredient is compatible with the diet
   **/
  
  @Schema(description = "A description of if we believe this ingredient is compatible with the diet")
  @JsonProperty("is_compatible")
  public String getIsCompatible() {
    return isCompatible;
  }
  public void setIsCompatible(String isCompatible) {
    this.isCompatible = isCompatible;
  }

  /**
   * A numeric representation of if we believe this ingredient is compatible with the diet. Higher values indicate more compatibility
   **/
  
  @Schema(description = "A numeric representation of if we believe this ingredient is compatible with the diet. Higher values indicate more compatibility")
  @JsonProperty("compatibility_level")
  public Integer getCompatibilityLevel() {
    return compatibilityLevel;
  }
  public void setCompatibilityLevel(Integer compatibilityLevel) {
    this.compatibilityLevel = compatibilityLevel;
  }

  /**
   * A description of how we graded this ingredient for compatibility with the diet
   **/
  
  @Schema(description = "A description of how we graded this ingredient for compatibility with the diet")
  @JsonProperty("compatibility_description")
  public String getCompatibilityDescription() {
    return compatibilityDescription;
  }
  public void setCompatibilityDescription(String compatibilityDescription) {
    this.compatibilityDescription = compatibilityDescription;
  }

  /**
   * Boolean representing if the ingredient is a known allergen
   **/
  
  @Schema(description = "Boolean representing if the ingredient is a known allergen")
  @JsonProperty("is_allergen")
  public Boolean isIsAllergen() {
    return isAllergen;
  }
  public void setIsAllergen(Boolean isAllergen) {
    this.isAllergen = isAllergen;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandedFoodObjectDietFlags brandedFoodObjectDietFlags = (BrandedFoodObjectDietFlags) o;
    return Objects.equals(ingredient, brandedFoodObjectDietFlags.ingredient) &&
        Objects.equals(ingredientDescription, brandedFoodObjectDietFlags.ingredientDescription) &&
        Objects.equals(dietLabel, brandedFoodObjectDietFlags.dietLabel) &&
        Objects.equals(isCompatible, brandedFoodObjectDietFlags.isCompatible) &&
        Objects.equals(compatibilityLevel, brandedFoodObjectDietFlags.compatibilityLevel) &&
        Objects.equals(compatibilityDescription, brandedFoodObjectDietFlags.compatibilityDescription) &&
        Objects.equals(isAllergen, brandedFoodObjectDietFlags.isAllergen);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ingredient, ingredientDescription, dietLabel, isCompatible, compatibilityLevel, compatibilityDescription, isAllergen);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandedFoodObjectDietFlags {\n");
    
    sb.append("    ingredient: ").append(toIndentedString(ingredient)).append("\n");
    sb.append("    ingredientDescription: ").append(toIndentedString(ingredientDescription)).append("\n");
    sb.append("    dietLabel: ").append(toIndentedString(dietLabel)).append("\n");
    sb.append("    isCompatible: ").append(toIndentedString(isCompatible)).append("\n");
    sb.append("    compatibilityLevel: ").append(toIndentedString(compatibilityLevel)).append("\n");
    sb.append("    compatibilityDescription: ").append(toIndentedString(compatibilityDescription)).append("\n");
    sb.append("    isAllergen: ").append(toIndentedString(isAllergen)).append("\n");
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
