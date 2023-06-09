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
 * GetStatus200ResponseLeaderboardsMostSubmittedChartsInner
 */
@JsonPropertyOrder({
  GetStatus200ResponseLeaderboardsMostSubmittedChartsInner.JSON_PROPERTY_AGENT_SYMBOL,
  GetStatus200ResponseLeaderboardsMostSubmittedChartsInner.JSON_PROPERTY_CHART_COUNT
})
@JsonTypeName("get_status_200_response_leaderboards_mostSubmittedCharts_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-05T09:25:51.979579Z[Etc/UTC]")
public class GetStatus200ResponseLeaderboardsMostSubmittedChartsInner {
  public static final String JSON_PROPERTY_AGENT_SYMBOL = "agentSymbol";
  private String agentSymbol;

  public static final String JSON_PROPERTY_CHART_COUNT = "chartCount";
  private Integer chartCount;

  public GetStatus200ResponseLeaderboardsMostSubmittedChartsInner() {
  }

  public GetStatus200ResponseLeaderboardsMostSubmittedChartsInner agentSymbol(String agentSymbol) {
    
    this.agentSymbol = agentSymbol;
    return this;
  }

   /**
   * Get agentSymbol
   * @return agentSymbol
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_AGENT_SYMBOL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAgentSymbol() {
    return agentSymbol;
  }


  @JsonProperty(JSON_PROPERTY_AGENT_SYMBOL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAgentSymbol(String agentSymbol) {
    this.agentSymbol = agentSymbol;
  }


  public GetStatus200ResponseLeaderboardsMostSubmittedChartsInner chartCount(Integer chartCount) {
    
    this.chartCount = chartCount;
    return this;
  }

   /**
   * Get chartCount
   * @return chartCount
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CHART_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getChartCount() {
    return chartCount;
  }


  @JsonProperty(JSON_PROPERTY_CHART_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setChartCount(Integer chartCount) {
    this.chartCount = chartCount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetStatus200ResponseLeaderboardsMostSubmittedChartsInner getStatus200ResponseLeaderboardsMostSubmittedChartsInner = (GetStatus200ResponseLeaderboardsMostSubmittedChartsInner) o;
    return Objects.equals(this.agentSymbol, getStatus200ResponseLeaderboardsMostSubmittedChartsInner.agentSymbol) &&
        Objects.equals(this.chartCount, getStatus200ResponseLeaderboardsMostSubmittedChartsInner.chartCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentSymbol, chartCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetStatus200ResponseLeaderboardsMostSubmittedChartsInner {\n");
    sb.append("    agentSymbol: ").append(toIndentedString(agentSymbol)).append("\n");
    sb.append("    chartCount: ").append(toIndentedString(chartCount)).append("\n");
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

