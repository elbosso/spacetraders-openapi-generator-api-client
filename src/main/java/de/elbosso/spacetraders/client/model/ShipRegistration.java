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
import de.elbosso.spacetraders.client.model.ShipRole;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The public registration information of the ship
 */
@JsonPropertyOrder({
  ShipRegistration.JSON_PROPERTY_NAME,
  ShipRegistration.JSON_PROPERTY_FACTION_SYMBOL,
  ShipRegistration.JSON_PROPERTY_ROLE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-05T09:25:51.979579Z[Etc/UTC]")
public class ShipRegistration {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_FACTION_SYMBOL = "factionSymbol";
  private String factionSymbol;

  public static final String JSON_PROPERTY_ROLE = "role";
  private ShipRole role;

  public ShipRegistration() {
  }

  public ShipRegistration name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The agent&#39;s registered name of the ship
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


  public ShipRegistration factionSymbol(String factionSymbol) {
    
    this.factionSymbol = factionSymbol;
    return this;
  }

   /**
   * The symbol of the faction the ship is registered with
   * @return factionSymbol
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FACTION_SYMBOL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getFactionSymbol() {
    return factionSymbol;
  }


  @JsonProperty(JSON_PROPERTY_FACTION_SYMBOL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFactionSymbol(String factionSymbol) {
    this.factionSymbol = factionSymbol;
  }


  public ShipRegistration role(ShipRole role) {
    
    this.role = role;
    return this;
  }

   /**
   * Get role
   * @return role
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ROLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ShipRole getRole() {
    return role;
  }


  @JsonProperty(JSON_PROPERTY_ROLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRole(ShipRole role) {
    this.role = role;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShipRegistration shipRegistration = (ShipRegistration) o;
    return Objects.equals(this.name, shipRegistration.name) &&
        Objects.equals(this.factionSymbol, shipRegistration.factionSymbol) &&
        Objects.equals(this.role, shipRegistration.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, factionSymbol, role);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShipRegistration {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    factionSymbol: ").append(toIndentedString(factionSymbol)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
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

