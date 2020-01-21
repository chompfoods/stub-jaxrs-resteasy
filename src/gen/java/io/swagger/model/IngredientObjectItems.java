package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.BrandedFoodObjectCalorieConversionFactor;
import io.swagger.model.BrandedFoodObjectComponents;
import io.swagger.model.BrandedFoodObjectDietLabels;
import io.swagger.model.BrandedFoodObjectPortions;
import io.swagger.model.IngredientObjectNutrients;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import java.util.List;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description="An object containing information for this specific item.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2020-01-21T23:19:12.726Z[GMT]")public class IngredientObjectItems   {
  private String name = null;  private List<String> categories = new ArrayList<String>();  private IngredientObjectNutrients nutrients = null;  private BrandedFoodObjectCalorieConversionFactor calorieConversionFactor = null;  private BigDecimal proteinConversionFactor = null;  private BrandedFoodObjectDietLabels dietLabels = null;  private List<BrandedFoodObjectComponents> components = new ArrayList<BrandedFoodObjectComponents>();  private List<BrandedFoodObjectPortions> portions = new ArrayList<BrandedFoodObjectPortions>();  private String commonName = null;  private String description = null;  private String footnote = null;

  /**
   * Item name as provided by brand owner or as shown on packaging
   **/
  
  @Schema(description = "Item name as provided by brand owner or as shown on packaging")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("categories")
  public List<String> getCategories() {
    return categories;
  }
  public void setCategories(List<String> categories) {
    this.categories = categories;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("nutrients")
  public IngredientObjectNutrients getNutrients() {
    return nutrients;
  }
  public void setNutrients(IngredientObjectNutrients nutrients) {
    this.nutrients = nutrients;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("calorie_conversion_factor")
  public BrandedFoodObjectCalorieConversionFactor getCalorieConversionFactor() {
    return calorieConversionFactor;
  }
  public void setCalorieConversionFactor(BrandedFoodObjectCalorieConversionFactor calorieConversionFactor) {
    this.calorieConversionFactor = calorieConversionFactor;
  }

  /**
   * The multiplication factor used to calculate protein from nitrogen
   **/
  
  @Schema(description = "The multiplication factor used to calculate protein from nitrogen")
  @JsonProperty("protein_conversion_factor")
  public BigDecimal getProteinConversionFactor() {
    return proteinConversionFactor;
  }
  public void setProteinConversionFactor(BigDecimal proteinConversionFactor) {
    this.proteinConversionFactor = proteinConversionFactor;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("diet_labels")
  public BrandedFoodObjectDietLabels getDietLabels() {
    return dietLabels;
  }
  public void setDietLabels(BrandedFoodObjectDietLabels dietLabels) {
    this.dietLabels = dietLabels;
  }

  /**
   * An array of objects containing the constituent parts of a food (e.g. bone is a component of meat)
   **/
  
  @Schema(description = "An array of objects containing the constituent parts of a food (e.g. bone is a component of meat)")
  @JsonProperty("components")
  public List<BrandedFoodObjectComponents> getComponents() {
    return components;
  }
  public void setComponents(List<BrandedFoodObjectComponents> components) {
    this.components = components;
  }

  /**
   * An array of objects containing information on discrete amounts of a food found in this item
   **/
  
  @Schema(description = "An array of objects containing information on discrete amounts of a food found in this item")
  @JsonProperty("portions")
  public List<BrandedFoodObjectPortions> getPortions() {
    return portions;
  }
  public void setPortions(List<BrandedFoodObjectPortions> portions) {
    this.portions = portions;
  }

  /**
   * Common names associated with this item. These generally clarify what the item is (e.g. when the brand name is \&quot;BRAND&#x27;s Spicy Enchilada\&quot; the common name may be \&quot;Chicken enchilada\&quot;)
   **/
  
  @Schema(description = "Common names associated with this item. These generally clarify what the item is (e.g. when the brand name is \"BRAND's Spicy Enchilada\" the common name may be \"Chicken enchilada\")")
  @JsonProperty("common_name")
  public String getCommonName() {
    return commonName;
  }
  public void setCommonName(String commonName) {
    this.commonName = commonName;
  }

  /**
   * A description of this item
   **/
  
  @Schema(description = "A description of this item")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Comments on any unusual aspects of this item. Examples might include unusual aspects of the food overall.
   **/
  
  @Schema(description = "Comments on any unusual aspects of this item. Examples might include unusual aspects of the food overall.")
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
    IngredientObjectItems ingredientObjectItems = (IngredientObjectItems) o;
    return Objects.equals(name, ingredientObjectItems.name) &&
        Objects.equals(categories, ingredientObjectItems.categories) &&
        Objects.equals(nutrients, ingredientObjectItems.nutrients) &&
        Objects.equals(calorieConversionFactor, ingredientObjectItems.calorieConversionFactor) &&
        Objects.equals(proteinConversionFactor, ingredientObjectItems.proteinConversionFactor) &&
        Objects.equals(dietLabels, ingredientObjectItems.dietLabels) &&
        Objects.equals(components, ingredientObjectItems.components) &&
        Objects.equals(portions, ingredientObjectItems.portions) &&
        Objects.equals(commonName, ingredientObjectItems.commonName) &&
        Objects.equals(description, ingredientObjectItems.description) &&
        Objects.equals(footnote, ingredientObjectItems.footnote);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, categories, nutrients, calorieConversionFactor, proteinConversionFactor, dietLabels, components, portions, commonName, description, footnote);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IngredientObjectItems {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    nutrients: ").append(toIndentedString(nutrients)).append("\n");
    sb.append("    calorieConversionFactor: ").append(toIndentedString(calorieConversionFactor)).append("\n");
    sb.append("    proteinConversionFactor: ").append(toIndentedString(proteinConversionFactor)).append("\n");
    sb.append("    dietLabels: ").append(toIndentedString(dietLabels)).append("\n");
    sb.append("    components: ").append(toIndentedString(components)).append("\n");
    sb.append("    portions: ").append(toIndentedString(portions)).append("\n");
    sb.append("    commonName: ").append(toIndentedString(commonName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
