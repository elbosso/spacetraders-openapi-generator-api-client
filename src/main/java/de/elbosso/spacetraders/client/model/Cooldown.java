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
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A cooldown is a period of time in which a ship cannot perform certain actions.
 */
@JsonPropertyOrder({
  Cooldown.JSON_PROPERTY_SHIP_SYMBOL,
  Cooldown.JSON_PROPERTY_TOTAL_SECONDS,
  Cooldown.JSON_PROPERTY_REMAINING_SECONDS,
  Cooldown.JSON_PROPERTY_EXPIRATION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-05T09:25:51.979579Z[Etc/UTC]")
public class Cooldown {
  public static final String JSON_PROPERTY_SHIP_SYMBOL = "shipSymbol";
  private String shipSymbol;

  public static final String JSON_PROPERTY_TOTAL_SECONDS = "totalSeconds";
  private Integer totalSeconds;

  public static final String JSON_PROPERTY_REMAINING_SECONDS = "remainingSeconds";
  private Integer remainingSeconds;

  public static final String JSON_PROPERTY_EXPIRATION = "expiration";
  private OffsetDateTime expiration;

  public Cooldown() {
  }

  public Cooldown shipSymbol(String shipSymbol) {
    
    this.shipSymbol = shipSymbol;
    return this;
  }

   /**
   * The symbol of the ship that is on cooldown
   * @return shipSymbol
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SHIP_SYMBOL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getShipSymbol() {
    return shipSymbol;
  }


  @JsonProperty(JSON_PROPERTY_SHIP_SYMBOL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setShipSymbol(String shipSymbol) {
    this.shipSymbol = shipSymbol;
  }


  public Cooldown totalSeconds(Integer totalSeconds) {
    
    this.totalSeconds = totalSeconds;
    return this;
  }

   /**
   * The total duration of the cooldown in seconds
   * minimum: 0
   * @return totalSeconds
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TOTAL_SECONDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getTotalSeconds() {
    return totalSeconds;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_SECONDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTotalSeconds(Integer totalSeconds) {
    this.totalSeconds = totalSeconds;
  }


  public Cooldown remainingSeconds(Integer remainingSeconds) {
    
    this.remainingSeconds = remainingSeconds;
    return this;
  }

   /**
   * The remaining duration of the cooldown in seconds
   * minimum: 0
   * @return remainingSeconds
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_REMAINING_SECONDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getRemainingSeconds() {
    return remainingSeconds;
  }


  @JsonProperty(JSON_PROPERTY_REMAINING_SECONDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRemainingSeconds(Integer remainingSeconds) {
    this.remainingSeconds = remainingSeconds;
  }


  public Cooldown expiration(OffsetDateTime expiration) {
    
    this.expiration = expiration;
    return this;
  }

   /**
   * The date and time when the cooldown expires in ISO 8601 format
   * @return expiration
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPIRATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getExpiration() {
    return expiration;
  }


  @JsonProperty(JSON_PROPERTY_EXPIRATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpiration(OffsetDateTime expiration) {
    this.expiration = expiration;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cooldown cooldown = (Cooldown) o;
    return Objects.equals(this.shipSymbol, cooldown.shipSymbol) &&
        Objects.equals(this.totalSeconds, cooldown.totalSeconds) &&
        Objects.equals(this.remainingSeconds, cooldown.remainingSeconds) &&
        Objects.equals(this.expiration, cooldown.expiration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shipSymbol, totalSeconds, remainingSeconds, expiration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cooldown {\n");
    sb.append("    shipSymbol: ").append(toIndentedString(shipSymbol)).append("\n");
    sb.append("    totalSeconds: ").append(toIndentedString(totalSeconds)).append("\n");
    sb.append("    remainingSeconds: ").append(toIndentedString(remainingSeconds)).append("\n");
    sb.append("    expiration: ").append(toIndentedString(expiration)).append("\n");
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

