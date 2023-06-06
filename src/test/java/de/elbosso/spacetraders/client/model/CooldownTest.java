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
import java.time.OffsetDateTime;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Model tests for Cooldown
 */
public class CooldownTest {
    private final Cooldown model = new Cooldown();

    /**
     * Model tests for Cooldown
     */
    @Test
    public void testCooldown() {
        // TODO: test Cooldown
    }

    /**
     * Test the property 'shipSymbol'
     */
    @Test
    public void shipSymbolTest() {
        // TODO: test shipSymbol
    }

    /**
     * Test the property 'totalSeconds'
     */
    @Test
    public void totalSecondsTest() {
        // TODO: test totalSeconds
    }

    /**
     * Test the property 'remainingSeconds'
     */
    @Test
    public void remainingSecondsTest() {
        // TODO: test remainingSeconds
    }

    /**
     * Test the property 'expiration'
     */
    @Test
    public void expirationTest() {
        // TODO: test expiration
    }

}
