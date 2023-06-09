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
import de.elbosso.spacetraders.client.model.ShipEngine;
import de.elbosso.spacetraders.client.model.ShipFrame;
import de.elbosso.spacetraders.client.model.ShipModule;
import de.elbosso.spacetraders.client.model.ShipMount;
import de.elbosso.spacetraders.client.model.ShipReactor;
import de.elbosso.spacetraders.client.model.ShipType;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Model tests for ShipyardShip
 */
public class ShipyardShipTest {
    private final ShipyardShip model = new ShipyardShip();

    /**
     * Model tests for ShipyardShip
     */
    @Test
    public void testShipyardShip() {
        // TODO: test ShipyardShip
    }

    /**
     * Test the property 'type'
     */
    @Test
    public void typeTest() {
        // TODO: test type
    }

    /**
     * Test the property 'name'
     */
    @Test
    public void nameTest() {
        // TODO: test name
    }

    /**
     * Test the property 'description'
     */
    @Test
    public void descriptionTest() {
        // TODO: test description
    }

    /**
     * Test the property 'purchasePrice'
     */
    @Test
    public void purchasePriceTest() {
        // TODO: test purchasePrice
    }

    /**
     * Test the property 'frame'
     */
    @Test
    public void frameTest() {
        // TODO: test frame
    }

    /**
     * Test the property 'reactor'
     */
    @Test
    public void reactorTest() {
        // TODO: test reactor
    }

    /**
     * Test the property 'engine'
     */
    @Test
    public void engineTest() {
        // TODO: test engine
    }

    /**
     * Test the property 'modules'
     */
    @Test
    public void modulesTest() {
        // TODO: test modules
    }

    /**
     * Test the property 'mounts'
     */
    @Test
    public void mountsTest() {
        // TODO: test mounts
    }

}
