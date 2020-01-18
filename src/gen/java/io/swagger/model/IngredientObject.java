package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.IngredientObjectItems;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.List;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description="Please read the description of each field in this API response object example. By default, the value of each field is __null__. This indicates an unknown state or that no data exists.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2020-01-18T16:53:38.152Z[GMT]")public class IngredientObject   {
  private List<IngredientObjectItems> items = new ArrayList<IngredientObjectItems>();

  /**
   * An array containing an object for each individual item returned by your API call.
   **/
  
  @Schema(description = "An array containing an object for each individual item returned by your API call.")
  @JsonProperty("items")
  public List<IngredientObjectItems> getItems() {
    return items;
  }
  public void setItems(List<IngredientObjectItems> items) {
    this.items = items;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IngredientObject ingredientObject = (IngredientObject) o;
    return Objects.equals(items, ingredientObject.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IngredientObject {\n");
    
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
