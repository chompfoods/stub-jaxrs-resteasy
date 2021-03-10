package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.RecipeObjectAttributes;
import io.swagger.model.RecipeObjectIngredients;
import io.swagger.model.RecipeObjectMeta;
import io.swagger.model.RecipeObjectNutrients;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.List;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description="An object containing information for this specific item.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2021-03-09T22:27:23.118Z[GMT]")public class RecipeObjectItems   {
  private String id = null;  private String title = null;  private RecipeObjectMeta meta = null;  private List<String> categories = new ArrayList<String>();  private String author = null;  private List<String> keywords = new ArrayList<String>();  private List<String> topics = new ArrayList<String>();  private RecipeObjectAttributes attributes = null;  private List<RecipeObjectIngredients> ingredients = new ArrayList<RecipeObjectIngredients>();  private List<String> baseIngredients = new ArrayList<String>();  private RecipeObjectNutrients nutrients = null;  private List<String> diabeticExchanges = new ArrayList<String>();

  /**
   * Unique recipe ID
   **/
  
  @Schema(description = "Unique recipe ID")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Recipe title
   **/
  
  @Schema(description = "Recipe title")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("meta")
  public RecipeObjectMeta getMeta() {
    return meta;
  }
  public void setMeta(RecipeObjectMeta meta) {
    this.meta = meta;
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
   * The author of this recipe. You must attribute this author when displaying this recipe.
   **/
  
  @Schema(description = "The author of this recipe. You must attribute this author when displaying this recipe.")
  @JsonProperty("author")
  public String getAuthor() {
    return author;
  }
  public void setAuthor(String author) {
    this.author = author;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("keywords")
  public List<String> getKeywords() {
    return keywords;
  }
  public void setKeywords(List<String> keywords) {
    this.keywords = keywords;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("topics")
  public List<String> getTopics() {
    return topics;
  }
  public void setTopics(List<String> topics) {
    this.topics = topics;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("attributes")
  public RecipeObjectAttributes getAttributes() {
    return attributes;
  }
  public void setAttributes(RecipeObjectAttributes attributes) {
    this.attributes = attributes;
  }

  /**
   * An array containing this recipe&#x27;s ingredients
   **/
  
  @Schema(description = "An array containing this recipe's ingredients")
  @JsonProperty("ingredients")
  public List<RecipeObjectIngredients> getIngredients() {
    return ingredients;
  }
  public void setIngredients(List<RecipeObjectIngredients> ingredients) {
    this.ingredients = ingredients;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("base_ingredients")
  public List<String> getBaseIngredients() {
    return baseIngredients;
  }
  public void setBaseIngredients(List<String> baseIngredients) {
    this.baseIngredients = baseIngredients;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("nutrients")
  public RecipeObjectNutrients getNutrients() {
    return nutrients;
  }
  public void setNutrients(RecipeObjectNutrients nutrients) {
    this.nutrients = nutrients;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("diabetic_exchanges")
  public List<String> getDiabeticExchanges() {
    return diabeticExchanges;
  }
  public void setDiabeticExchanges(List<String> diabeticExchanges) {
    this.diabeticExchanges = diabeticExchanges;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecipeObjectItems recipeObjectItems = (RecipeObjectItems) o;
    return Objects.equals(id, recipeObjectItems.id) &&
        Objects.equals(title, recipeObjectItems.title) &&
        Objects.equals(meta, recipeObjectItems.meta) &&
        Objects.equals(categories, recipeObjectItems.categories) &&
        Objects.equals(author, recipeObjectItems.author) &&
        Objects.equals(keywords, recipeObjectItems.keywords) &&
        Objects.equals(topics, recipeObjectItems.topics) &&
        Objects.equals(attributes, recipeObjectItems.attributes) &&
        Objects.equals(ingredients, recipeObjectItems.ingredients) &&
        Objects.equals(baseIngredients, recipeObjectItems.baseIngredients) &&
        Objects.equals(nutrients, recipeObjectItems.nutrients) &&
        Objects.equals(diabeticExchanges, recipeObjectItems.diabeticExchanges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, meta, categories, author, keywords, topics, attributes, ingredients, baseIngredients, nutrients, diabeticExchanges);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecipeObjectItems {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    topics: ").append(toIndentedString(topics)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    ingredients: ").append(toIndentedString(ingredients)).append("\n");
    sb.append("    baseIngredients: ").append(toIndentedString(baseIngredients)).append("\n");
    sb.append("    nutrients: ").append(toIndentedString(nutrients)).append("\n");
    sb.append("    diabeticExchanges: ").append(toIndentedString(diabeticExchanges)).append("\n");
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
