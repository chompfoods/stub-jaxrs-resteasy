package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.BrandedFoodObjectPackagingPhotosFront;
import io.swagger.model.BrandedFoodObjectPackagingPhotosIngredients;
import io.swagger.model.BrandedFoodObjectPackagingPhotosNutrition;
import io.swagger.v3.oas.annotations.media.Schema;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description="A object containing a collection of photos of this item's packaging")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2020-01-18T04:56:05.671Z[GMT]")public class BrandedFoodObjectPackagingPhotos   {
  private BrandedFoodObjectPackagingPhotosFront front = null;  private BrandedFoodObjectPackagingPhotosNutrition nutrition = null;  private BrandedFoodObjectPackagingPhotosIngredients ingredients = null;

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("front")
  public BrandedFoodObjectPackagingPhotosFront getFront() {
    return front;
  }
  public void setFront(BrandedFoodObjectPackagingPhotosFront front) {
    this.front = front;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("nutrition")
  public BrandedFoodObjectPackagingPhotosNutrition getNutrition() {
    return nutrition;
  }
  public void setNutrition(BrandedFoodObjectPackagingPhotosNutrition nutrition) {
    this.nutrition = nutrition;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("ingredients")
  public BrandedFoodObjectPackagingPhotosIngredients getIngredients() {
    return ingredients;
  }
  public void setIngredients(BrandedFoodObjectPackagingPhotosIngredients ingredients) {
    this.ingredients = ingredients;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandedFoodObjectPackagingPhotos brandedFoodObjectPackagingPhotos = (BrandedFoodObjectPackagingPhotos) o;
    return Objects.equals(front, brandedFoodObjectPackagingPhotos.front) &&
        Objects.equals(nutrition, brandedFoodObjectPackagingPhotos.nutrition) &&
        Objects.equals(ingredients, brandedFoodObjectPackagingPhotos.ingredients);
  }

  @Override
  public int hashCode() {
    return Objects.hash(front, nutrition, ingredients);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandedFoodObjectPackagingPhotos {\n");
    
    sb.append("    front: ").append(toIndentedString(front)).append("\n");
    sb.append("    nutrition: ").append(toIndentedString(nutrition)).append("\n");
    sb.append("    ingredients: ").append(toIndentedString(ingredients)).append("\n");
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
