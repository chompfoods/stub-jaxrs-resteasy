package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description="An object containing this recipe's image URLs")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2021-03-09T22:27:23.118Z[GMT]")public class RecipeObjectMetaImages   {
  private String extraLarge = null;  private String large = null;  private String standard = null;  private String gridView = null;  private String small = null;  private String thumbnail = null;  private String extraSmall = null;

  /**
   * Extra large recipe image
   **/
  
  @Schema(description = "Extra large recipe image")
  @JsonProperty("extra_large")
  public String getExtraLarge() {
    return extraLarge;
  }
  public void setExtraLarge(String extraLarge) {
    this.extraLarge = extraLarge;
  }

  /**
   * Large recipe image
   **/
  
  @Schema(description = "Large recipe image")
  @JsonProperty("large")
  public String getLarge() {
    return large;
  }
  public void setLarge(String large) {
    this.large = large;
  }

  /**
   * Standard recipe image
   **/
  
  @Schema(description = "Standard recipe image")
  @JsonProperty("standard")
  public String getStandard() {
    return standard;
  }
  public void setStandard(String standard) {
    this.standard = standard;
  }

  /**
   * Grid view recipe image
   **/
  
  @Schema(description = "Grid view recipe image")
  @JsonProperty("grid_view")
  public String getGridView() {
    return gridView;
  }
  public void setGridView(String gridView) {
    this.gridView = gridView;
  }

  /**
   * Small recipe image
   **/
  
  @Schema(description = "Small recipe image")
  @JsonProperty("small")
  public String getSmall() {
    return small;
  }
  public void setSmall(String small) {
    this.small = small;
  }

  /**
   * Thumbnail recipe image
   **/
  
  @Schema(description = "Thumbnail recipe image")
  @JsonProperty("thumbnail")
  public String getThumbnail() {
    return thumbnail;
  }
  public void setThumbnail(String thumbnail) {
    this.thumbnail = thumbnail;
  }

  /**
   * Extra small recipe image
   **/
  
  @Schema(description = "Extra small recipe image")
  @JsonProperty("extra_small")
  public String getExtraSmall() {
    return extraSmall;
  }
  public void setExtraSmall(String extraSmall) {
    this.extraSmall = extraSmall;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecipeObjectMetaImages recipeObjectMetaImages = (RecipeObjectMetaImages) o;
    return Objects.equals(extraLarge, recipeObjectMetaImages.extraLarge) &&
        Objects.equals(large, recipeObjectMetaImages.large) &&
        Objects.equals(standard, recipeObjectMetaImages.standard) &&
        Objects.equals(gridView, recipeObjectMetaImages.gridView) &&
        Objects.equals(small, recipeObjectMetaImages.small) &&
        Objects.equals(thumbnail, recipeObjectMetaImages.thumbnail) &&
        Objects.equals(extraSmall, recipeObjectMetaImages.extraSmall);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extraLarge, large, standard, gridView, small, thumbnail, extraSmall);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecipeObjectMetaImages {\n");
    
    sb.append("    extraLarge: ").append(toIndentedString(extraLarge)).append("\n");
    sb.append("    large: ").append(toIndentedString(large)).append("\n");
    sb.append("    standard: ").append(toIndentedString(standard)).append("\n");
    sb.append("    gridView: ").append(toIndentedString(gridView)).append("\n");
    sb.append("    small: ").append(toIndentedString(small)).append("\n");
    sb.append("    thumbnail: ").append(toIndentedString(thumbnail)).append("\n");
    sb.append("    extraSmall: ").append(toIndentedString(extraSmall)).append("\n");
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
