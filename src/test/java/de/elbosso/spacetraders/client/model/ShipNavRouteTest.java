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

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import de.elbosso.spacetraders.client.model.ShipNavRouteWaypoint;
import java.time.OffsetDateTime;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Model tests for ShipNavRoute
 */
public class ShipNavRouteTest {
    private final ShipNavRoute model = new ShipNavRoute();

    /**
     * Model tests for ShipNavRoute
     */
    @Test
    public void testShipNavRoute() {
        // TODO: test ShipNavRoute
    }

    /**
     * Test the property 'destination'
     */
    @Test
    public void destinationTest() {
        // TODO: test destination
    }

    /**
     * Test the property 'departure'
     */
    @Test
    public void departureTest() {
        // TODO: test departure
    }

    /**
     * Test the property 'departureTime'
     */
    @Test
    public void departureTimeTest() {
        // TODO: test departureTime
    }

    /**
     * Test the property 'arrival'
     */
    @Test
    public void arrivalTest() {
        // TODO: test arrival
    }

}
