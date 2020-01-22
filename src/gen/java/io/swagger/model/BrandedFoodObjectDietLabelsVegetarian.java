package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description="An object containing information on this item's compatibility with Vegetarian diets")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2020-01-22T13:02:22.260Z[GMT]")public class BrandedFoodObjectDietLabelsVegetarian   {
  private String name = null;  private Boolean isCompatible = null;  private Integer compatibilityLevel = null;  private Integer confidence = null;  private String confidenceDescription = null;

  /**
   * Diet name
   **/
  
  @Schema(description = "Diet name")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Boolean describing if this item is compatible with this diet
   **/
  
  @Schema(description = "Boolean describing if this item is compatible with this diet")
  @JsonProperty("is_compatible")
  public Boolean isIsCompatible() {
    return isCompatible;
  }
  public void setIsCompatible(Boolean isCompatible) {
    this.isCompatible = isCompatible;
  }

  /**
   * Numeric representation of how compatible this item is with this diet. Higher values indicate more compatibility
   **/
  
  @Schema(description = "Numeric representation of how compatible this item is with this diet. Higher values indicate more compatibility")
  @JsonProperty("compatibility_level")
  public Integer getCompatibilityLevel() {
    return compatibilityLevel;
  }
  public void setCompatibilityLevel(Integer compatibilityLevel) {
    this.compatibilityLevel = compatibilityLevel;
  }

  /**
   * Boolean that indicates if we are confident in how this item is graded for this diet
   **/
  
  @Schema(description = "Boolean that indicates if we are confident in how this item is graded for this diet")
  @JsonProperty("confidence")
  public Integer getConfidence() {
    return confidence;
  }
  public void setConfidence(Integer confidence) {
    this.confidence = confidence;
  }

  /**
   * Description of our confidence that this item was graded correctly
   **/
  
  @Schema(description = "Description of our confidence that this item was graded correctly")
  @JsonProperty("confidence_description")
  public String getConfidenceDescription() {
    return confidenceDescription;
  }
  public void setConfidenceDescription(String confidenceDescription) {
    this.confidenceDescription = confidenceDescription;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandedFoodObjectDietLabelsVegetarian brandedFoodObjectDietLabelsVegetarian = (BrandedFoodObjectDietLabelsVegetarian) o;
    return Objects.equals(name, brandedFoodObjectDietLabelsVegetarian.name) &&
        Objects.equals(isCompatible, brandedFoodObjectDietLabelsVegetarian.isCompatible) &&
        Objects.equals(compatibilityLevel, brandedFoodObjectDietLabelsVegetarian.compatibilityLevel) &&
        Objects.equals(confidence, brandedFoodObjectDietLabelsVegetarian.confidence) &&
        Objects.equals(confidenceDescription, brandedFoodObjectDietLabelsVegetarian.confidenceDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, isCompatible, compatibilityLevel, confidence, confidenceDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandedFoodObjectDietLabelsVegetarian {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isCompatible: ").append(toIndentedString(isCompatible)).append("\n");
    sb.append("    compatibilityLevel: ").append(toIndentedString(compatibilityLevel)).append("\n");
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
    sb.append("    confidenceDescription: ").append(toIndentedString(confidenceDescription)).append("\n");
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
