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
 * 
 */
@JsonPropertyOrder({
  Agent.JSON_PROPERTY_ACCOUNT_ID,
  Agent.JSON_PROPERTY_SYMBOL,
  Agent.JSON_PROPERTY_HEADQUARTERS,
  Agent.JSON_PROPERTY_CREDITS,
  Agent.JSON_PROPERTY_STARTING_FACTION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-05T09:25:51.979579Z[Etc/UTC]")
public class Agent {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private String accountId;

  public static final String JSON_PROPERTY_SYMBOL = "symbol";
  private String symbol;

  public static final String JSON_PROPERTY_HEADQUARTERS = "headquarters";
  private String headquarters;

  public static final String JSON_PROPERTY_CREDITS = "credits";
  private Long credits;

  public static final String JSON_PROPERTY_STARTING_FACTION = "startingFaction";
  private String startingFaction;

  public Agent() {
  }

  public Agent accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAccountId() {
    return accountId;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public Agent symbol(String symbol) {
    
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

  public String getSymbol() {
    return symbol;
  }


  @JsonProperty(JSON_PROPERTY_SYMBOL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }


  public Agent headquarters(String headquarters) {
    
    this.headquarters = headquarters;
    return this;
  }

   /**
   * The headquarters of the agent.
   * @return headquarters
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_HEADQUARTERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getHeadquarters() {
    return headquarters;
  }


  @JsonProperty(JSON_PROPERTY_HEADQUARTERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHeadquarters(String headquarters) {
    this.headquarters = headquarters;
  }


  public Agent credits(Long credits) {
    
    this.credits = credits;
    return this;
  }

   /**
   * The number of credits the agent has available. Credits can be negative if funds have been overdrawn.
   * @return credits
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CREDITS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getCredits() {
    return credits;
  }


  @JsonProperty(JSON_PROPERTY_CREDITS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCredits(Long credits) {
    this.credits = credits;
  }


  public Agent startingFaction(String startingFaction) {
    
    this.startingFaction = startingFaction;
    return this;
  }

   /**
   * The faction the agent started with.
   * @return startingFaction
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_STARTING_FACTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getStartingFaction() {
    return startingFaction;
  }


  @JsonProperty(JSON_PROPERTY_STARTING_FACTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStartingFaction(String startingFaction) {
    this.startingFaction = startingFaction;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Agent agent = (Agent) o;
    return Objects.equals(this.accountId, agent.accountId) &&
        Objects.equals(this.symbol, agent.symbol) &&
        Objects.equals(this.headquarters, agent.headquarters) &&
        Objects.equals(this.credits, agent.credits) &&
        Objects.equals(this.startingFaction, agent.startingFaction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, symbol, headquarters, credits, startingFaction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Agent {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    headquarters: ").append(toIndentedString(headquarters)).append("\n");
    sb.append("    credits: ").append(toIndentedString(credits)).append("\n");
    sb.append("    startingFaction: ").append(toIndentedString(startingFaction)).append("\n");
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

