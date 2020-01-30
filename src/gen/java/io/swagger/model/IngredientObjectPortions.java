package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description="An object containing information on a specific food portion found in this item")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2020-01-30T02:08:15.907Z[GMT]")public class IngredientObjectPortions   {
  private String measurementUnit = null;  private String description = null;  private String modifier = null;  private BigDecimal gramWeight = null;  private Integer dataPoints = null;  private String footnote = null;

  /**
   * The unit used for measure (e.g. if mesure is 3 tsp, the unit is tsp)
   **/
  
  @Schema(description = "The unit used for measure (e.g. if mesure is 3 tsp, the unit is tsp)")
  @JsonProperty("measurement_unit")
  public String getMeasurementUnit() {
    return measurementUnit;
  }
  public void setMeasurementUnit(String measurementUnit) {
    this.measurementUnit = measurementUnit;
  }

  /**
   * Comments that provide more specificity on the measure. For example, for a pizza measure the dissemination text might be 1 slice is 1/8th of a 14 inch pizza.
   **/
  
  @Schema(description = "Comments that provide more specificity on the measure. For example, for a pizza measure the dissemination text might be 1 slice is 1/8th of a 14 inch pizza.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Qualifier of the measure (e.g. related to food shape or form) (e.g. melted, crushed, diced)
   **/
  
  @Schema(description = "Qualifier of the measure (e.g. related to food shape or form) (e.g. melted, crushed, diced)")
  @JsonProperty("modifier")
  public String getModifier() {
    return modifier;
  }
  public void setModifier(String modifier) {
    this.modifier = modifier;
  }

  /**
   * The weight of the measure in grams
   **/
  
  @Schema(description = "The weight of the measure in grams")
  @JsonProperty("gram_weight")
  public BigDecimal getGramWeight() {
    return gramWeight;
  }
  public void setGramWeight(BigDecimal gramWeight) {
    this.gramWeight = gramWeight;
  }

  /**
   * The number of observations on which the measure is based
   **/
  
  @Schema(description = "The number of observations on which the measure is based")
  @JsonProperty("data_points")
  public Integer getDataPoints() {
    return dataPoints;
  }
  public void setDataPoints(Integer dataPoints) {
    this.dataPoints = dataPoints;
  }

  /**
   * Comments on any unusual aspects of the measure. Examples might includes caveats on the usage of a measure, or reasons why a measure gram weight is an unexpected value.
   **/
  
  @Schema(description = "Comments on any unusual aspects of the measure. Examples might includes caveats on the usage of a measure, or reasons why a measure gram weight is an unexpected value.")
  @JsonProperty("footnote")
  public String getFootnote() {
    return footnote;
  }
  public void setFootnote(String footnote) {
    this.footnote = footnote;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IngredientObjectPortions ingredientObjectPortions = (IngredientObjectPortions) o;
    return Objects.equals(measurementUnit, ingredientObjectPortions.measurementUnit) &&
        Objects.equals(description, ingredientObjectPortions.description) &&
        Objects.equals(modifier, ingredientObjectPortions.modifier) &&
        Objects.equals(gramWeight, ingredientObjectPortions.gramWeight) &&
        Objects.equals(dataPoints, ingredientObjectPortions.dataPoints) &&
        Objects.equals(footnote, ingredientObjectPortions.footnote);
  }

  @Override
  public int hashCode() {
    return Objects.hash(measurementUnit, description, modifier, gramWeight, dataPoints, footnote);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IngredientObjectPortions {\n");
    
    sb.append("    measurementUnit: ").append(toIndentedString(measurementUnit)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    modifier: ").append(toIndentedString(modifier)).append("\n");
    sb.append("    gramWeight: ").append(toIndentedString(gramWeight)).append("\n");
    sb.append("    dataPoints: ").append(toIndentedString(dataPoints)).append("\n");
    sb.append("    footnote: ").append(toIndentedString(footnote)).append("\n");
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
