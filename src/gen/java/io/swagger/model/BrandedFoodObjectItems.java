package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.BrandedFoodObjectCountryDetails;
import io.swagger.model.BrandedFoodObjectDietFlags;
import io.swagger.model.BrandedFoodObjectDietLabels;
import io.swagger.model.BrandedFoodObjectNutrients;
import io.swagger.model.BrandedFoodObjectPackage;
import io.swagger.model.BrandedFoodObjectPackagingPhotos;
import io.swagger.model.BrandedFoodObjectServing;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.List;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description="An object containing information for this specific item.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2020-01-27T21:16:22.725Z[GMT]")public class BrandedFoodObjectItems   {
  private String barcode = null;  private String name = null;  private String brand = null;  private String ingredients = null;  private BrandedFoodObjectPackage _package = null;  private BrandedFoodObjectServing serving = null;  private List<String> categories = new ArrayList<String>();  private List<BrandedFoodObjectNutrients> nutrients = new ArrayList<BrandedFoodObjectNutrients>();  private BrandedFoodObjectDietLabels dietLabels = null;  private List<BrandedFoodObjectDietFlags> dietFlags = new ArrayList<BrandedFoodObjectDietFlags>();  private BrandedFoodObjectPackagingPhotos packagingPhotos = null;  private List<String> allergens = new ArrayList<String>();  private List<String> brandList = new ArrayList<String>();  private List<String> countries = new ArrayList<String>();  private BrandedFoodObjectCountryDetails countryDetails = null;  private List<String> palmOilIngredients = new ArrayList<String>();  private List<String> ingredientList = new ArrayList<String>();  private Boolean hasEnglishIngredients = null;  private List<String> minerals = new ArrayList<String>();  private List<String> traces = new ArrayList<String>();  private List<String> vitamins = new ArrayList<String>();  private String description = null;  private List<String> keywords = new ArrayList<String>();

  /**
   * EAN/UPC barcode
   **/
  
  @Schema(description = "EAN/UPC barcode")
  @JsonProperty("barcode")
  public String getBarcode() {
    return barcode;
  }
  public void setBarcode(String barcode) {
    this.barcode = barcode;
  }

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
   * The brand name that owns this item
   **/
  
  @Schema(description = "The brand name that owns this item")
  @JsonProperty("brand")
  public String getBrand() {
    return brand;
  }
  public void setBrand(String brand) {
    this.brand = brand;
  }

  /**
   * This food item&#x27;s ingredients from greatest quantity to least
   **/
  
  @Schema(description = "This food item's ingredients from greatest quantity to least")
  @JsonProperty("ingredients")
  public String getIngredients() {
    return ingredients;
  }
  public void setIngredients(String ingredients) {
    this.ingredients = ingredients;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("package")
  public BrandedFoodObjectPackage getPackage() {
    return _package;
  }
  public void setPackage(BrandedFoodObjectPackage _package) {
    this._package = _package;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("serving")
  public BrandedFoodObjectServing getServing() {
    return serving;
  }
  public void setServing(BrandedFoodObjectServing serving) {
    this.serving = serving;
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
   * An array containing nutrient informatio objects for this food item
   **/
  
  @Schema(description = "An array containing nutrient informatio objects for this food item")
  @JsonProperty("nutrients")
  public List<BrandedFoodObjectNutrients> getNutrients() {
    return nutrients;
  }
  public void setNutrients(List<BrandedFoodObjectNutrients> nutrients) {
    this.nutrients = nutrients;
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
   * An array of ingredient objects that were flagged while grading this item for compatibility with each diet
   **/
  
  @Schema(description = "An array of ingredient objects that were flagged while grading this item for compatibility with each diet")
  @JsonProperty("diet_flags")
  public List<BrandedFoodObjectDietFlags> getDietFlags() {
    return dietFlags;
  }
  public void setDietFlags(List<BrandedFoodObjectDietFlags> dietFlags) {
    this.dietFlags = dietFlags;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("packaging_photos")
  public BrandedFoodObjectPackagingPhotos getPackagingPhotos() {
    return packagingPhotos;
  }
  public void setPackagingPhotos(BrandedFoodObjectPackagingPhotos packagingPhotos) {
    this.packagingPhotos = packagingPhotos;
  }

  /**
   * An array of ingredients in this item that may cause allergic reactions in people
   **/
  
  @Schema(description = "An array of ingredients in this item that may cause allergic reactions in people")
  @JsonProperty("allergens")
  public List<String> getAllergens() {
    return allergens;
  }
  public void setAllergens(List<String> allergens) {
    this.allergens = allergens;
  }

  /**
   * An array of brands we have associated with this item. Some items are sold by more than 1 brand.
   **/
  
  @Schema(description = "An array of brands we have associated with this item. Some items are sold by more than 1 brand.")
  @JsonProperty("brand_list")
  public List<String> getBrandList() {
    return brandList;
  }
  public void setBrandList(List<String> brandList) {
    this.brandList = brandList;
  }

  /**
   * An array of countries where this item is sold
   **/
  
  @Schema(description = "An array of countries where this item is sold")
  @JsonProperty("countries")
  public List<String> getCountries() {
    return countries;
  }
  public void setCountries(List<String> countries) {
    this.countries = countries;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("country_details")
  public BrandedFoodObjectCountryDetails getCountryDetails() {
    return countryDetails;
  }
  public void setCountryDetails(BrandedFoodObjectCountryDetails countryDetails) {
    this.countryDetails = countryDetails;
  }

  /**
   * An array of ingredients made from palm oil
   **/
  
  @Schema(description = "An array of ingredients made from palm oil")
  @JsonProperty("palm_oil_ingredients")
  public List<String> getPalmOilIngredients() {
    return palmOilIngredients;
  }
  public void setPalmOilIngredients(List<String> palmOilIngredients) {
    this.palmOilIngredients = palmOilIngredients;
  }

  /**
   * An array of this item&#x27;s ingredients
   **/
  
  @Schema(description = "An array of this item's ingredients")
  @JsonProperty("ingredient_list")
  public List<String> getIngredientList() {
    return ingredientList;
  }
  public void setIngredientList(List<String> ingredientList) {
    this.ingredientList = ingredientList;
  }

  /**
   * A boolean indicating if we have English ingredients for this item
   **/
  
  @Schema(description = "A boolean indicating if we have English ingredients for this item")
  @JsonProperty("has_english_ingredients")
  public Boolean isHasEnglishIngredients() {
    return hasEnglishIngredients;
  }
  public void setHasEnglishIngredients(Boolean hasEnglishIngredients) {
    this.hasEnglishIngredients = hasEnglishIngredients;
  }

  /**
   * An array of minerals that this item contains
   **/
  
  @Schema(description = "An array of minerals that this item contains")
  @JsonProperty("minerals")
  public List<String> getMinerals() {
    return minerals;
  }
  public void setMinerals(List<String> minerals) {
    this.minerals = minerals;
  }

  /**
   * An array of trace ingredients that may be found in this item
   **/
  
  @Schema(description = "An array of trace ingredients that may be found in this item")
  @JsonProperty("traces")
  public List<String> getTraces() {
    return traces;
  }
  public void setTraces(List<String> traces) {
    this.traces = traces;
  }

  /**
   * An array of vitamins that are found in this item
   **/
  
  @Schema(description = "An array of vitamins that are found in this item")
  @JsonProperty("vitamins")
  public List<String> getVitamins() {
    return vitamins;
  }
  public void setVitamins(List<String> vitamins) {
    this.vitamins = vitamins;
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
   * An array of keywords that can be used to describe this item
   **/
  
  @Schema(description = "An array of keywords that can be used to describe this item")
  @JsonProperty("keywords")
  public List<String> getKeywords() {
    return keywords;
  }
  public void setKeywords(List<String> keywords) {
    this.keywords = keywords;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandedFoodObjectItems brandedFoodObjectItems = (BrandedFoodObjectItems) o;
    return Objects.equals(barcode, brandedFoodObjectItems.barcode) &&
        Objects.equals(name, brandedFoodObjectItems.name) &&
        Objects.equals(brand, brandedFoodObjectItems.brand) &&
        Objects.equals(ingredients, brandedFoodObjectItems.ingredients) &&
        Objects.equals(_package, brandedFoodObjectItems._package) &&
        Objects.equals(serving, brandedFoodObjectItems.serving) &&
        Objects.equals(categories, brandedFoodObjectItems.categories) &&
        Objects.equals(nutrients, brandedFoodObjectItems.nutrients) &&
        Objects.equals(dietLabels, brandedFoodObjectItems.dietLabels) &&
        Objects.equals(dietFlags, brandedFoodObjectItems.dietFlags) &&
        Objects.equals(packagingPhotos, brandedFoodObjectItems.packagingPhotos) &&
        Objects.equals(allergens, brandedFoodObjectItems.allergens) &&
        Objects.equals(brandList, brandedFoodObjectItems.brandList) &&
        Objects.equals(countries, brandedFoodObjectItems.countries) &&
        Objects.equals(countryDetails, brandedFoodObjectItems.countryDetails) &&
        Objects.equals(palmOilIngredients, brandedFoodObjectItems.palmOilIngredients) &&
        Objects.equals(ingredientList, brandedFoodObjectItems.ingredientList) &&
        Objects.equals(hasEnglishIngredients, brandedFoodObjectItems.hasEnglishIngredients) &&
        Objects.equals(minerals, brandedFoodObjectItems.minerals) &&
        Objects.equals(traces, brandedFoodObjectItems.traces) &&
        Objects.equals(vitamins, brandedFoodObjectItems.vitamins) &&
        Objects.equals(description, brandedFoodObjectItems.description) &&
        Objects.equals(keywords, brandedFoodObjectItems.keywords);
  }

  @Override
  public int hashCode() {
    return Objects.hash(barcode, name, brand, ingredients, _package, serving, categories, nutrients, dietLabels, dietFlags, packagingPhotos, allergens, brandList, countries, countryDetails, palmOilIngredients, ingredientList, hasEnglishIngredients, minerals, traces, vitamins, description, keywords);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandedFoodObjectItems {\n");
    
    sb.append("    barcode: ").append(toIndentedString(barcode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    ingredients: ").append(toIndentedString(ingredients)).append("\n");
    sb.append("    _package: ").append(toIndentedString(_package)).append("\n");
    sb.append("    serving: ").append(toIndentedString(serving)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    nutrients: ").append(toIndentedString(nutrients)).append("\n");
    sb.append("    dietLabels: ").append(toIndentedString(dietLabels)).append("\n");
    sb.append("    dietFlags: ").append(toIndentedString(dietFlags)).append("\n");
    sb.append("    packagingPhotos: ").append(toIndentedString(packagingPhotos)).append("\n");
    sb.append("    allergens: ").append(toIndentedString(allergens)).append("\n");
    sb.append("    brandList: ").append(toIndentedString(brandList)).append("\n");
    sb.append("    countries: ").append(toIndentedString(countries)).append("\n");
    sb.append("    countryDetails: ").append(toIndentedString(countryDetails)).append("\n");
    sb.append("    palmOilIngredients: ").append(toIndentedString(palmOilIngredients)).append("\n");
    sb.append("    ingredientList: ").append(toIndentedString(ingredientList)).append("\n");
    sb.append("    hasEnglishIngredients: ").append(toIndentedString(hasEnglishIngredients)).append("\n");
    sb.append("    minerals: ").append(toIndentedString(minerals)).append("\n");
    sb.append("    traces: ").append(toIndentedString(traces)).append("\n");
    sb.append("    vitamins: ").append(toIndentedString(vitamins)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
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
