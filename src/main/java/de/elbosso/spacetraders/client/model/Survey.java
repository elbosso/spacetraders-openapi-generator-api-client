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
import de.elbosso.spacetraders.client.model.SurveyDeposit;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A resource survey of a waypoint, detailing a specific extraction location and the types of resources that can be found there.
 */
@JsonPropertyOrder({
  Survey.JSON_PROPERTY_SIGNATURE,
  Survey.JSON_PROPERTY_SYMBOL,
  Survey.JSON_PROPERTY_DEPOSITS,
  Survey.JSON_PROPERTY_EXPIRATION,
  Survey.JSON_PROPERTY_SIZE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-05T09:25:51.979579Z[Etc/UTC]")
public class Survey {
  public static final String JSON_PROPERTY_SIGNATURE = "signature";
  private String signature;

  public static final String JSON_PROPERTY_SYMBOL = "symbol";
  private String symbol;

  public static final String JSON_PROPERTY_DEPOSITS = "deposits";
  private List<SurveyDeposit> deposits = new ArrayList<>();

  public static final String JSON_PROPERTY_EXPIRATION = "expiration";
  private OffsetDateTime expiration;

  /**
   * The size of the deposit. This value indicates how much can be extracted from the survey before it is exhausted.
   */
  public enum SizeEnum {
    SMALL("SMALL"),
    
    MODERATE("MODERATE"),
    
    LARGE("LARGE");

    private String value;

    SizeEnum(String value) {
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
    public static SizeEnum fromValue(String value) {
      for (SizeEnum b : SizeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_SIZE = "size";
  private SizeEnum size;

  public Survey() {
  }

  public Survey signature(String signature) {
    
    this.signature = signature;
    return this;
  }

   /**
   * A unique signature for the location of this survey. This signature is verified when attempting an extraction using this survey.
   * @return signature
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SIGNATURE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSignature() {
    return signature;
  }


  @JsonProperty(JSON_PROPERTY_SIGNATURE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSignature(String signature) {
    this.signature = signature;
  }


  public Survey symbol(String symbol) {
    
    this.symbol = symbol;
    return this;
  }

   /**
   * The symbol of the waypoint that this survey is for.
   * @return symbol
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SYMBOL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSymbol() {
    return symbol;
  }


  @JsonProperty(JSON_PROPERTY_SYMBOL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }


  public Survey deposits(List<SurveyDeposit> deposits) {
    
    this.deposits = deposits;
    return this;
  }

  public Survey addDepositsItem(SurveyDeposit depositsItem) {
    if (this.deposits == null) {
      this.deposits = new ArrayList<>();
    }
    this.deposits.add(depositsItem);
    return this;
  }

   /**
   * A list of deposits that can be found at this location.
   * @return deposits
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DEPOSITS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<SurveyDeposit> getDeposits() {
    return deposits;
  }


  @JsonProperty(JSON_PROPERTY_DEPOSITS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDeposits(List<SurveyDeposit> deposits) {
    this.deposits = deposits;
  }


  public Survey expiration(OffsetDateTime expiration) {
    
    this.expiration = expiration;
    return this;
  }

   /**
   * The date and time when the survey expires. After this date and time, the survey will no longer be available for extraction.
   * @return expiration
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EXPIRATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getExpiration() {
    return expiration;
  }


  @JsonProperty(JSON_PROPERTY_EXPIRATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setExpiration(OffsetDateTime expiration) {
    this.expiration = expiration;
  }


  public Survey size(SizeEnum size) {
    
    this.size = size;
    return this;
  }

   /**
   * The size of the deposit. This value indicates how much can be extracted from the survey before it is exhausted.
   * @return size
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public SizeEnum getSize() {
    return size;
  }


  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSize(SizeEnum size) {
    this.size = size;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Survey survey = (Survey) o;
    return Objects.equals(this.signature, survey.signature) &&
        Objects.equals(this.symbol, survey.symbol) &&
        Objects.equals(this.deposits, survey.deposits) &&
        Objects.equals(this.expiration, survey.expiration) &&
        Objects.equals(this.size, survey.size);
  }

  @Override
  public int hashCode() {
    return Objects.hash(signature, symbol, deposits, expiration, size);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Survey {\n");
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    deposits: ").append(toIndentedString(deposits)).append("\n");
    sb.append("    expiration: ").append(toIndentedString(expiration)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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

