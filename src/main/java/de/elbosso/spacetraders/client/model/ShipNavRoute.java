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
import de.elbosso.spacetraders.client.model.ShipNavRouteWaypoint;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The routing information for the ship&#39;s most recent transit or current location.
 */
@JsonPropertyOrder({
  ShipNavRoute.JSON_PROPERTY_DESTINATION,
  ShipNavRoute.JSON_PROPERTY_DEPARTURE,
  ShipNavRoute.JSON_PROPERTY_DEPARTURE_TIME,
  ShipNavRoute.JSON_PROPERTY_ARRIVAL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-05T09:25:51.979579Z[Etc/UTC]")
public class ShipNavRoute {
  public static final String JSON_PROPERTY_DESTINATION = "destination";
  private ShipNavRouteWaypoint destination;

  public static final String JSON_PROPERTY_DEPARTURE = "departure";
  private ShipNavRouteWaypoint departure;

  public static final String JSON_PROPERTY_DEPARTURE_TIME = "departureTime";
  private OffsetDateTime departureTime;

  public static final String JSON_PROPERTY_ARRIVAL = "arrival";
  private OffsetDateTime arrival;

  public ShipNavRoute() {
  }

  public ShipNavRoute destination(ShipNavRouteWaypoint destination) {
    
    this.destination = destination;
    return this;
  }

   /**
   * Get destination
   * @return destination
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DESTINATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ShipNavRouteWaypoint getDestination() {
    return destination;
  }


  @JsonProperty(JSON_PROPERTY_DESTINATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDestination(ShipNavRouteWaypoint destination) {
    this.destination = destination;
  }


  public ShipNavRoute departure(ShipNavRouteWaypoint departure) {
    
    this.departure = departure;
    return this;
  }

   /**
   * Get departure
   * @return departure
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DEPARTURE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ShipNavRouteWaypoint getDeparture() {
    return departure;
  }


  @JsonProperty(JSON_PROPERTY_DEPARTURE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDeparture(ShipNavRouteWaypoint departure) {
    this.departure = departure;
  }


  public ShipNavRoute departureTime(OffsetDateTime departureTime) {
    
    this.departureTime = departureTime;
    return this;
  }

   /**
   * The date time of the ship&#39;s departure.
   * @return departureTime
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DEPARTURE_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getDepartureTime() {
    return departureTime;
  }


  @JsonProperty(JSON_PROPERTY_DEPARTURE_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDepartureTime(OffsetDateTime departureTime) {
    this.departureTime = departureTime;
  }


  public ShipNavRoute arrival(OffsetDateTime arrival) {
    
    this.arrival = arrival;
    return this;
  }

   /**
   * The date time of the ship&#39;s arrival. If the ship is in-transit, this is the expected time of arrival.
   * @return arrival
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ARRIVAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getArrival() {
    return arrival;
  }


  @JsonProperty(JSON_PROPERTY_ARRIVAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setArrival(OffsetDateTime arrival) {
    this.arrival = arrival;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShipNavRoute shipNavRoute = (ShipNavRoute) o;
    return Objects.equals(this.destination, shipNavRoute.destination) &&
        Objects.equals(this.departure, shipNavRoute.departure) &&
        Objects.equals(this.departureTime, shipNavRoute.departureTime) &&
        Objects.equals(this.arrival, shipNavRoute.arrival);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destination, departure, departureTime, arrival);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShipNavRoute {\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    departure: ").append(toIndentedString(departure)).append("\n");
    sb.append("    departureTime: ").append(toIndentedString(departureTime)).append("\n");
    sb.append("    arrival: ").append(toIndentedString(arrival)).append("\n");
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

