package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2020-01-18T16:52:26.635Z[GMT]")public class BrandedFoodObjectNutrientsChomp   {
  private String name = null;  private String measurementUnit = null;  private BigDecimal per100g = null;  private BigDecimal perServing = null;  private BigDecimal total = null;

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
   * Nutrient value per serving
   **/
  
  @Schema(description = "Nutrient value per serving")
  @JsonProperty("per_serving")
  public BigDecimal getPerServing() {
    return perServing;
  }
  public void setPerServing(BigDecimal perServing) {
    this.perServing = perServing;
  }

  /**
   * Total nutrient value
   **/
  
  @Schema(description = "Total nutrient value")
  @JsonProperty("total")
  public BigDecimal getTotal() {
    return total;
  }
  public void setTotal(BigDecimal total) {
    this.total = total;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandedFoodObjectNutrientsChomp brandedFoodObjectNutrientsChomp = (BrandedFoodObjectNutrientsChomp) o;
    return Objects.equals(name, brandedFoodObjectNutrientsChomp.name) &&
        Objects.equals(measurementUnit, brandedFoodObjectNutrientsChomp.measurementUnit) &&
        Objects.equals(per100g, brandedFoodObjectNutrientsChomp.per100g) &&
        Objects.equals(perServing, brandedFoodObjectNutrientsChomp.perServing) &&
        Objects.equals(total, brandedFoodObjectNutrientsChomp.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, measurementUnit, per100g, perServing, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandedFoodObjectNutrientsChomp {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    measurementUnit: ").append(toIndentedString(measurementUnit)).append("\n");
    sb.append("    per100g: ").append(toIndentedString(per100g)).append("\n");
    sb.append("    perServing: ").append(toIndentedString(perServing)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
