package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2020-01-21T23:19:12.726Z[GMT]")public class BrandedFoodObjectNutrientsUsda   {
  private Integer id = null;  private String name = null;  private BigDecimal per100g = null;  private String measurementUnit = null;  private BigDecimal min = null;  private BigDecimal max = null;  private BigDecimal median = null;  private Integer rank = null;  private Integer dataPoints = null;  private String footnote = null;  private String description = null;

  /**
   * Nutrient ID
   **/
  
  @Schema(description = "Nutrient ID")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * Nutrient name
   **/
  
  @Schema(description = "Nutrient name")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Amount of the nutrient per 100g of food
   **/
  
  @Schema(description = "Amount of the nutrient per 100g of food")
  @JsonProperty("per_100g")
  public BigDecimal getPer100g() {
    return per100g;
  }
  public void setPer100g(BigDecimal per100g) {
    this.per100g = per100g;
  }

  /**
   * The unit used for the measure of this nutrient
   **/
  
  @Schema(description = "The unit used for the measure of this nutrient")
  @JsonProperty("measurement_unit")
  public String getMeasurementUnit() {
    return measurementUnit;
  }
  public void setMeasurementUnit(String measurementUnit) {
    this.measurementUnit = measurementUnit;
  }

  /**
   * Minimum nutrient value
   **/
  
  @Schema(description = "Minimum nutrient value")
  @JsonProperty("min")
  public BigDecimal getMin() {
    return min;
  }
  public void setMin(BigDecimal min) {
    this.min = min;
  }

  /**
   * Maximum nutrient value
   **/
  
  @Schema(description = "Maximum nutrient value")
  @JsonProperty("max")
  public BigDecimal getMax() {
    return max;
  }
  public void setMax(BigDecimal max) {
    this.max = max;
  }

  /**
   * Median nutrient value
   **/
  
  @Schema(description = "Median nutrient value")
  @JsonProperty("median")
  public BigDecimal getMedian() {
    return median;
  }
  public void setMedian(BigDecimal median) {
    this.median = median;
  }

  /**
   * Nutrient rank
   **/
  
  @Schema(description = "Nutrient rank")
  @JsonProperty("rank")
  public Integer getRank() {
    return rank;
  }
  public void setRank(Integer rank) {
    this.rank = rank;
  }

  /**
   * Number of observations on which the value is based
   **/
  
  @Schema(description = "Number of observations on which the value is based")
  @JsonProperty("data_points")
  public Integer getDataPoints() {
    return dataPoints;
  }
  public void setDataPoints(Integer dataPoints) {
    this.dataPoints = dataPoints;
  }

  /**
   * Comments on any unusual aspect of the food nutrient. Examples might include why a nutrient value is different than typically expected.
   **/
  
  @Schema(description = "Comments on any unusual aspect of the food nutrient. Examples might include why a nutrient value is different than typically expected.")
  @JsonProperty("footnote")
  public String getFootnote() {
    return footnote;
  }
  public void setFootnote(String footnote) {
    this.footnote = footnote;
  }

  /**
   * Description of the nutrient source
   **/
  
  @Schema(description = "Description of the nutrient source")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandedFoodObjectNutrientsUsda brandedFoodObjectNutrientsUsda = (BrandedFoodObjectNutrientsUsda) o;
    return Objects.equals(id, brandedFoodObjectNutrientsUsda.id) &&
        Objects.equals(name, brandedFoodObjectNutrientsUsda.name) &&
        Objects.equals(per100g, brandedFoodObjectNutrientsUsda.per100g) &&
        Objects.equals(measurementUnit, brandedFoodObjectNutrientsUsda.measurementUnit) &&
        Objects.equals(min, brandedFoodObjectNutrientsUsda.min) &&
        Objects.equals(max, brandedFoodObjectNutrientsUsda.max) &&
        Objects.equals(median, brandedFoodObjectNutrientsUsda.median) &&
        Objects.equals(rank, brandedFoodObjectNutrientsUsda.rank) &&
        Objects.equals(dataPoints, brandedFoodObjectNutrientsUsda.dataPoints) &&
        Objects.equals(footnote, brandedFoodObjectNutrientsUsda.footnote) &&
        Objects.equals(description, brandedFoodObjectNutrientsUsda.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, per100g, measurementUnit, min, max, median, rank, dataPoints, footnote, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandedFoodObjectNutrientsUsda {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    per100g: ").append(toIndentedString(per100g)).append("\n");
    sb.append("    measurementUnit: ").append(toIndentedString(measurementUnit)).append("\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    median: ").append(toIndentedString(median)).append("\n");
    sb.append("    rank: ").append(toIndentedString(rank)).append("\n");
    sb.append("    dataPoints: ").append(toIndentedString(dataPoints)).append("\n");
    sb.append("    footnote: ").append(toIndentedString(footnote)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
