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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * MarketTradeGood
 */
@JsonPropertyOrder({
  MarketTradeGood.JSON_PROPERTY_SYMBOL,
  MarketTradeGood.JSON_PROPERTY_TRADE_VOLUME,
  MarketTradeGood.JSON_PROPERTY_SUPPLY,
  MarketTradeGood.JSON_PROPERTY_PURCHASE_PRICE,
  MarketTradeGood.JSON_PROPERTY_SELL_PRICE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-05T09:25:51.979579Z[Etc/UTC]")
public class MarketTradeGood {
  public static final String JSON_PROPERTY_SYMBOL = "symbol";
  private String symbol;

  public static final String JSON_PROPERTY_TRADE_VOLUME = "tradeVolume";
  private Integer tradeVolume;

  /**
   * A rough estimate of the total supply of this good in the marketplace.
   */
  public enum SupplyEnum {
    SCARCE("SCARCE"),
    
    LIMITED("LIMITED"),
    
    MODERATE("MODERATE"),
    
    ABUNDANT("ABUNDANT");

    private String value;

    SupplyEnum(String value) {
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
    public static SupplyEnum fromValue(String value) {
      for (SupplyEnum b : SupplyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_SUPPLY = "supply";
  private SupplyEnum supply;

  public static final String JSON_PROPERTY_PURCHASE_PRICE = "purchasePrice";
  private Integer purchasePrice;

  public static final String JSON_PROPERTY_SELL_PRICE = "sellPrice";
  private Integer sellPrice;

  public MarketTradeGood() {
  }

  public MarketTradeGood symbol(String symbol) {
    
    this.symbol = symbol;
    return this;
  }

   /**
   * The symbol of the trade good.
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


  public MarketTradeGood tradeVolume(Integer tradeVolume) {
    
    this.tradeVolume = tradeVolume;
    return this;
  }

   /**
   * The typical volume flowing through the market for this type of good. The larger the trade volume, the more stable prices will be.
   * minimum: 1
   * @return tradeVolume
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TRADE_VOLUME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getTradeVolume() {
    return tradeVolume;
  }


  @JsonProperty(JSON_PROPERTY_TRADE_VOLUME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTradeVolume(Integer tradeVolume) {
    this.tradeVolume = tradeVolume;
  }


  public MarketTradeGood supply(SupplyEnum supply) {
    
    this.supply = supply;
    return this;
  }

   /**
   * A rough estimate of the total supply of this good in the marketplace.
   * @return supply
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SUPPLY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public SupplyEnum getSupply() {
    return supply;
  }


  @JsonProperty(JSON_PROPERTY_SUPPLY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSupply(SupplyEnum supply) {
    this.supply = supply;
  }


  public MarketTradeGood purchasePrice(Integer purchasePrice) {
    
    this.purchasePrice = purchasePrice;
    return this;
  }

   /**
   * The price at which this good can be purchased from the market.
   * minimum: 0
   * @return purchasePrice
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PURCHASE_PRICE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getPurchasePrice() {
    return purchasePrice;
  }


  @JsonProperty(JSON_PROPERTY_PURCHASE_PRICE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPurchasePrice(Integer purchasePrice) {
    this.purchasePrice = purchasePrice;
  }


  public MarketTradeGood sellPrice(Integer sellPrice) {
    
    this.sellPrice = sellPrice;
    return this;
  }

   /**
   * The price at which this good can be sold to the market.
   * minimum: 0
   * @return sellPrice
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SELL_PRICE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getSellPrice() {
    return sellPrice;
  }


  @JsonProperty(JSON_PROPERTY_SELL_PRICE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSellPrice(Integer sellPrice) {
    this.sellPrice = sellPrice;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MarketTradeGood marketTradeGood = (MarketTradeGood) o;
    return Objects.equals(this.symbol, marketTradeGood.symbol) &&
        Objects.equals(this.tradeVolume, marketTradeGood.tradeVolume) &&
        Objects.equals(this.supply, marketTradeGood.supply) &&
        Objects.equals(this.purchasePrice, marketTradeGood.purchasePrice) &&
        Objects.equals(this.sellPrice, marketTradeGood.sellPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(symbol, tradeVolume, supply, purchasePrice, sellPrice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MarketTradeGood {\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    tradeVolume: ").append(toIndentedString(tradeVolume)).append("\n");
    sb.append("    supply: ").append(toIndentedString(supply)).append("\n");
    sb.append("    purchasePrice: ").append(toIndentedString(purchasePrice)).append("\n");
    sb.append("    sellPrice: ").append(toIndentedString(sellPrice)).append("\n");
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
