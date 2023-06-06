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
import de.elbosso.spacetraders.client.model.ShipNavFlightMode;
import de.elbosso.spacetraders.client.model.ShipNavRoute;
import de.elbosso.spacetraders.client.model.ShipNavStatus;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The navigation information of the ship.
 */
@JsonPropertyOrder({
  ShipNav.JSON_PROPERTY_SYSTEM_SYMBOL,
  ShipNav.JSON_PROPERTY_WAYPOINT_SYMBOL,
  ShipNav.JSON_PROPERTY_ROUTE,
  ShipNav.JSON_PROPERTY_STATUS,
  ShipNav.JSON_PROPERTY_FLIGHT_MODE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-05T09:25:51.979579Z[Etc/UTC]")
public class ShipNav {
  public static final String JSON_PROPERTY_SYSTEM_SYMBOL = "systemSymbol";
  private String systemSymbol;

  public static final String JSON_PROPERTY_WAYPOINT_SYMBOL = "waypointSymbol";
  private String waypointSymbol;

  public static final String JSON_PROPERTY_ROUTE = "route";
  private ShipNavRoute route;

  public static final String JSON_PROPERTY_STATUS = "status";
  private ShipNavStatus status;

  public static final String JSON_PROPERTY_FLIGHT_MODE = "flightMode";
  private ShipNavFlightMode flightMode = ShipNavFlightMode.CRUISE;

  public ShipNav() {
  }

  public ShipNav systemSymbol(String systemSymbol) {
    
    this.systemSymbol = systemSymbol;
    return this;
  }

   /**
   * The system symbol of the ship&#39;s current location.
   * @return systemSymbol
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SYSTEM_SYMBOL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSystemSymbol() {
    return systemSymbol;
  }


  @JsonProperty(JSON_PROPERTY_SYSTEM_SYMBOL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSystemSymbol(String systemSymbol) {
    this.systemSymbol = systemSymbol;
  }


  public ShipNav waypointSymbol(String waypointSymbol) {
    
    this.waypointSymbol = waypointSymbol;
    return this;
  }

   /**
   * The waypoint symbol of the ship&#39;s current location, or if the ship is in-transit, the waypoint symbol of the ship&#39;s destination.
   * @return waypointSymbol
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_WAYPOINT_SYMBOL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getWaypointSymbol() {
    return waypointSymbol;
  }


  @JsonProperty(JSON_PROPERTY_WAYPOINT_SYMBOL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setWaypointSymbol(String waypointSymbol) {
    this.waypointSymbol = waypointSymbol;
  }


  public ShipNav route(ShipNavRoute route) {
    
    this.route = route;
    return this;
  }

   /**
   * Get route
   * @return route
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ROUTE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ShipNavRoute getRoute() {
    return route;
  }


  @JsonProperty(JSON_PROPERTY_ROUTE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRoute(ShipNavRoute route) {
    this.route = route;
  }


  public ShipNav status(ShipNavStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ShipNavStatus getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStatus(ShipNavStatus status) {
    this.status = status;
  }


  public ShipNav flightMode(ShipNavFlightMode flightMode) {
    
    this.flightMode = flightMode;
    return this;
  }

   /**
   * Get flightMode
   * @return flightMode
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FLIGHT_MODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ShipNavFlightMode getFlightMode() {
    return flightMode;
  }


  @JsonProperty(JSON_PROPERTY_FLIGHT_MODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFlightMode(ShipNavFlightMode flightMode) {
    this.flightMode = flightMode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShipNav shipNav = (ShipNav) o;
    return Objects.equals(this.systemSymbol, shipNav.systemSymbol) &&
        Objects.equals(this.waypointSymbol, shipNav.waypointSymbol) &&
        Objects.equals(this.route, shipNav.route) &&
        Objects.equals(this.status, shipNav.status) &&
        Objects.equals(this.flightMode, shipNav.flightMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(systemSymbol, waypointSymbol, route, status, flightMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShipNav {\n");
    sb.append("    systemSymbol: ").append(toIndentedString(systemSymbol)).append("\n");
    sb.append("    waypointSymbol: ").append(toIndentedString(waypointSymbol)).append("\n");
    sb.append("    route: ").append(toIndentedString(route)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    flightMode: ").append(toIndentedString(flightMode)).append("\n");
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
