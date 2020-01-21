package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description="An object containing serving information for this item")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2020-01-21T23:19:12.726Z[GMT]")public class BrandedFoodObjectServing   {
  private Integer size = null;  private String measurementUnit = null;  private String sizeFulltext = null;  private Integer total = null;

  /**
   * Serving size
   **/
  
  @Schema(description = "Serving size")
  @JsonProperty("size")
  public Integer getSize() {
    return size;
  }
  public void setSize(Integer size) {
    this.size = size;
  }

  /**
   * Serving measurement unit (e.g. if measure is 3 tsp, the unit is tsp)
   **/
  
  @Schema(description = "Serving measurement unit (e.g. if measure is 3 tsp, the unit is tsp)")
  @JsonProperty("measurement_unit")
  public String getMeasurementUnit() {
    return measurementUnit;
  }
  public void setMeasurementUnit(String measurementUnit) {
    this.measurementUnit = measurementUnit;
  }

  /**
   * Serving size description
   **/
  
  @Schema(description = "Serving size description")
  @JsonProperty("size_fulltext")
  public String getSizeFulltext() {
    return sizeFulltext;
  }
  public void setSizeFulltext(String sizeFulltext) {
    this.sizeFulltext = sizeFulltext;
  }

  /**
   * Total servings
   **/
  
  @Schema(description = "Total servings")
  @JsonProperty("total")
  public Integer getTotal() {
    return total;
  }
  public void setTotal(Integer total) {
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
    BrandedFoodObjectServing brandedFoodObjectServing = (BrandedFoodObjectServing) o;
    return Objects.equals(size, brandedFoodObjectServing.size) &&
        Objects.equals(measurementUnit, brandedFoodObjectServing.measurementUnit) &&
        Objects.equals(sizeFulltext, brandedFoodObjectServing.sizeFulltext) &&
        Objects.equals(total, brandedFoodObjectServing.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(size, measurementUnit, sizeFulltext, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandedFoodObjectServing {\n");
    
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    measurementUnit: ").append(toIndentedString(measurementUnit)).append("\n");
    sb.append("    sizeFulltext: ").append(toIndentedString(sizeFulltext)).append("\n");
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
