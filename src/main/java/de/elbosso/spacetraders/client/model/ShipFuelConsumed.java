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
 * ShipFuelConsumed
 */
@JsonPropertyOrder({
  ShipFuelConsumed.JSON_PROPERTY_AMOUNT,
  ShipFuelConsumed.JSON_PROPERTY_TIMESTAMP
})
@JsonTypeName("ShipFuel_consumed")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-05T09:25:51.979579Z[Etc/UTC]")
public class ShipFuelConsumed {
  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private Integer amount;

  public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
  private OffsetDateTime timestamp;

  public ShipFuelConsumed() {
  }

  public ShipFuelConsumed amount(Integer amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * The amount of fuel consumed by the most recent transit or action.
   * minimum: 0
   * @return amount
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getAmount() {
    return amount;
  }


  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAmount(Integer amount) {
    this.amount = amount;
  }


  public ShipFuelConsumed timestamp(OffsetDateTime timestamp) {
    
    this.timestamp = timestamp;
    return this;
  }

   /**
   * The time at which the fuel was consumed.
   * @return timestamp
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getTimestamp() {
    return timestamp;
  }


  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShipFuelConsumed shipFuelConsumed = (ShipFuelConsumed) o;
    return Objects.equals(this.amount, shipFuelConsumed.amount) &&
        Objects.equals(this.timestamp, shipFuelConsumed.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, timestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShipFuelConsumed {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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

