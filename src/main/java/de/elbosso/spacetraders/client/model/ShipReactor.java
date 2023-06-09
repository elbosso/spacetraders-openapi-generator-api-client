/*
 * SpaceTraders API
 * SpaceTraders is an open-universe game and learning platform that offers a set of HTTP endpoints to control a fleet of ships and explore a multiplayer universe.  The API is documented using [OpenAPI](https://github.com/SpaceTradersAPI/api-docs). You can send your first request right here in your browser to check the status of the game server.  ```json http {   \"method\": \"GET\",   \"url\": \"https://api.spacetraders.io/v2\", } ```  Unlike a traditional game, SpaceTraders does not have a first-party client or app to play the game. Instead, you can use the API to build your own client, write a script to automate your ships, or try an app built by the community.  We have a [Discord channel](https://discord.com/invite/jh6zurdWk5) where you can share your projects, ask questions, and get help from other players.   
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: joel@spacetraders.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package de.elbosso.spacetraders.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import de.elbosso.spacetraders.client.model.ShipRequirements;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The reactor of the ship. The reactor is responsible for powering the ship&#39;s systems and weapons.
 */
@JsonPropertyOrder({
  ShipReactor.JSON_PROPERTY_SYMBOL,
  ShipReactor.JSON_PROPERTY_NAME,
  ShipReactor.JSON_PROPERTY_DESCRIPTION,
  ShipReactor.JSON_PROPERTY_CONDITION,
  ShipReactor.JSON_PROPERTY_POWER_OUTPUT,
  ShipReactor.JSON_PROPERTY_REQUIREMENTS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-05T09:25:51.979579Z[Etc/UTC]")
public class ShipReactor {
  /**
   * Gets or Sets symbol
   */
  public enum SymbolEnum {
    SOLAR_I("REACTOR_SOLAR_I"),
    
    FUSION_I("REACTOR_FUSION_I"),
    
    FISSION_I("REACTOR_FISSION_I"),
    
    CHEMICAL_I("REACTOR_CHEMICAL_I"),
    
    ANTIMATTER_I("REACTOR_ANTIMATTER_I");

    private String value;

    SymbolEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SymbolEnum fromValue(String value) {
      for (SymbolEnum b : SymbolEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_SYMBOL = "symbol";
  private SymbolEnum symbol;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_CONDITION = "condition";
  private Integer condition;

  public static final String JSON_PROPERTY_POWER_OUTPUT = "powerOutput";
  private Integer powerOutput;

  public static final String JSON_PROPERTY_REQUIREMENTS = "requirements";
  private ShipRequirements requirements;

  public ShipReactor() {
  }

  public ShipReactor symbol(SymbolEnum symbol) {
    
    this.symbol = symbol;
    return this;
  }

   /**
   * Get symbol
   * @return symbol
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SYMBOL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public SymbolEnum getSymbol() {
    return symbol;
  }


  @JsonProperty(JSON_PROPERTY_SYMBOL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSymbol(SymbolEnum symbol) {
    this.symbol = symbol;
  }


  public ShipReactor name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public ShipReactor description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDescription(String description) {
    this.description = description;
  }


  public ShipReactor condition(Integer condition) {
    
    this.condition = condition;
    return this;
  }

   /**
   * Condition is a range of 0 to 100 where 0 is completely worn out and 100 is brand new.
   * minimum: 0
   * maximum: 100
   * @return condition
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONDITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCondition() {
    return condition;
  }


  @JsonProperty(JSON_PROPERTY_CONDITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCondition(Integer condition) {
    this.condition = condition;
  }


  public ShipReactor powerOutput(Integer powerOutput) {
    
    this.powerOutput = powerOutput;
    return this;
  }

   /**
   * Get powerOutput
   * minimum: 1
   * @return powerOutput
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_POWER_OUTPUT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getPowerOutput() {
    return powerOutput;
  }


  @JsonProperty(JSON_PROPERTY_POWER_OUTPUT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPowerOutput(Integer powerOutput) {
    this.powerOutput = powerOutput;
  }


  public ShipReactor requirements(ShipRequirements requirements) {
    
    this.requirements = requirements;
    return this;
  }

   /**
   * Get requirements
   * @return requirements
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_REQUIREMENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ShipRequirements getRequirements() {
    return requirements;
  }


  @JsonProperty(JSON_PROPERTY_REQUIREMENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRequirements(ShipRequirements requirements) {
    this.requirements = requirements;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShipReactor shipReactor = (ShipReactor) o;
    return Objects.equals(this.symbol, shipReactor.symbol) &&
        Objects.equals(this.name, shipReactor.name) &&
        Objects.equals(this.description, shipReactor.description) &&
        Objects.equals(this.condition, shipReactor.condition) &&
        Objects.equals(this.powerOutput, shipReactor.powerOutput) &&
        Objects.equals(this.requirements, shipReactor.requirements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(symbol, name, description, condition, powerOutput, requirements);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShipReactor {\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    powerOutput: ").append(toIndentedString(powerOutput)).append("\n");
    sb.append("    requirements: ").append(toIndentedString(requirements)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

