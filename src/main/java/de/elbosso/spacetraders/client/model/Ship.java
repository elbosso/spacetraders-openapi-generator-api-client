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
import de.elbosso.spacetraders.client.model.ShipCargo;
import de.elbosso.spacetraders.client.model.ShipCrew;
import de.elbosso.spacetraders.client.model.ShipEngine;
import de.elbosso.spacetraders.client.model.ShipFrame;
import de.elbosso.spacetraders.client.model.ShipFuel;
import de.elbosso.spacetraders.client.model.ShipModule;
import de.elbosso.spacetraders.client.model.ShipMount;
import de.elbosso.spacetraders.client.model.ShipNav;
import de.elbosso.spacetraders.client.model.ShipReactor;
import de.elbosso.spacetraders.client.model.ShipRegistration;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A ship
 */
@JsonPropertyOrder({
  Ship.JSON_PROPERTY_SYMBOL,
  Ship.JSON_PROPERTY_REGISTRATION,
  Ship.JSON_PROPERTY_NAV,
  Ship.JSON_PROPERTY_CREW,
  Ship.JSON_PROPERTY_FRAME,
  Ship.JSON_PROPERTY_REACTOR,
  Ship.JSON_PROPERTY_ENGINE,
  Ship.JSON_PROPERTY_MODULES,
  Ship.JSON_PROPERTY_MOUNTS,
  Ship.JSON_PROPERTY_CARGO,
  Ship.JSON_PROPERTY_FUEL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-05T09:25:51.979579Z[Etc/UTC]")
public class Ship {
  public static final String JSON_PROPERTY_SYMBOL = "symbol";
  private String symbol;

  public static final String JSON_PROPERTY_REGISTRATION = "registration";
  private ShipRegistration registration;

  public static final String JSON_PROPERTY_NAV = "nav";
  private ShipNav nav;

  public static final String JSON_PROPERTY_CREW = "crew";
  private ShipCrew crew;

  public static final String JSON_PROPERTY_FRAME = "frame";
  private ShipFrame frame;

  public static final String JSON_PROPERTY_REACTOR = "reactor";
  private ShipReactor reactor;

  public static final String JSON_PROPERTY_ENGINE = "engine";
  private ShipEngine engine;

  public static final String JSON_PROPERTY_MODULES = "modules";
  private List<ShipModule> modules = new ArrayList<>();

  public static final String JSON_PROPERTY_MOUNTS = "mounts";
  private List<ShipMount> mounts = new ArrayList<>();

  public static final String JSON_PROPERTY_CARGO = "cargo";
  private ShipCargo cargo;

  public static final String JSON_PROPERTY_FUEL = "fuel";
  private ShipFuel fuel;

  public Ship() {
  }

  public Ship symbol(String symbol) {
    
    this.symbol = symbol;
    return this;
  }

   /**
   * The globally unique identifier of the ship in the following format: &#x60;[AGENT_SYMBOL]_[HEX_ID]&#x60;
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


  public Ship registration(ShipRegistration registration) {
    
    this.registration = registration;
    return this;
  }

   /**
   * Get registration
   * @return registration
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_REGISTRATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ShipRegistration getRegistration() {
    return registration;
  }


  @JsonProperty(JSON_PROPERTY_REGISTRATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRegistration(ShipRegistration registration) {
    this.registration = registration;
  }


  public Ship nav(ShipNav nav) {
    
    this.nav = nav;
    return this;
  }

   /**
   * Get nav
   * @return nav
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NAV)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ShipNav getNav() {
    return nav;
  }


  @JsonProperty(JSON_PROPERTY_NAV)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNav(ShipNav nav) {
    this.nav = nav;
  }


  public Ship crew(ShipCrew crew) {
    
    this.crew = crew;
    return this;
  }

   /**
   * Get crew
   * @return crew
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CREW)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ShipCrew getCrew() {
    return crew;
  }


  @JsonProperty(JSON_PROPERTY_CREW)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCrew(ShipCrew crew) {
    this.crew = crew;
  }


  public Ship frame(ShipFrame frame) {
    
    this.frame = frame;
    return this;
  }

   /**
   * Get frame
   * @return frame
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FRAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ShipFrame getFrame() {
    return frame;
  }


  @JsonProperty(JSON_PROPERTY_FRAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFrame(ShipFrame frame) {
    this.frame = frame;
  }


  public Ship reactor(ShipReactor reactor) {
    
    this.reactor = reactor;
    return this;
  }

   /**
   * Get reactor
   * @return reactor
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_REACTOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ShipReactor getReactor() {
    return reactor;
  }


  @JsonProperty(JSON_PROPERTY_REACTOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setReactor(ShipReactor reactor) {
    this.reactor = reactor;
  }


  public Ship engine(ShipEngine engine) {
    
    this.engine = engine;
    return this;
  }

   /**
   * Get engine
   * @return engine
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ENGINE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ShipEngine getEngine() {
    return engine;
  }


  @JsonProperty(JSON_PROPERTY_ENGINE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEngine(ShipEngine engine) {
    this.engine = engine;
  }


  public Ship modules(List<ShipModule> modules) {
    
    this.modules = modules;
    return this;
  }

  public Ship addModulesItem(ShipModule modulesItem) {
    if (this.modules == null) {
      this.modules = new ArrayList<>();
    }
    this.modules.add(modulesItem);
    return this;
  }

   /**
   * Get modules
   * @return modules
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MODULES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<ShipModule> getModules() {
    return modules;
  }


  @JsonProperty(JSON_PROPERTY_MODULES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setModules(List<ShipModule> modules) {
    this.modules = modules;
  }


  public Ship mounts(List<ShipMount> mounts) {
    
    this.mounts = mounts;
    return this;
  }

  public Ship addMountsItem(ShipMount mountsItem) {
    if (this.mounts == null) {
      this.mounts = new ArrayList<>();
    }
    this.mounts.add(mountsItem);
    return this;
  }

   /**
   * Get mounts
   * @return mounts
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MOUNTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<ShipMount> getMounts() {
    return mounts;
  }


  @JsonProperty(JSON_PROPERTY_MOUNTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMounts(List<ShipMount> mounts) {
    this.mounts = mounts;
  }


  public Ship cargo(ShipCargo cargo) {
    
    this.cargo = cargo;
    return this;
  }

   /**
   * Get cargo
   * @return cargo
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CARGO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ShipCargo getCargo() {
    return cargo;
  }


  @JsonProperty(JSON_PROPERTY_CARGO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCargo(ShipCargo cargo) {
    this.cargo = cargo;
  }


  public Ship fuel(ShipFuel fuel) {
    
    this.fuel = fuel;
    return this;
  }

   /**
   * Get fuel
   * @return fuel
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FUEL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ShipFuel getFuel() {
    return fuel;
  }


  @JsonProperty(JSON_PROPERTY_FUEL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFuel(ShipFuel fuel) {
    this.fuel = fuel;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ship ship = (Ship) o;
    return Objects.equals(this.symbol, ship.symbol) &&
        Objects.equals(this.registration, ship.registration) &&
        Objects.equals(this.nav, ship.nav) &&
        Objects.equals(this.crew, ship.crew) &&
        Objects.equals(this.frame, ship.frame) &&
        Objects.equals(this.reactor, ship.reactor) &&
        Objects.equals(this.engine, ship.engine) &&
        Objects.equals(this.modules, ship.modules) &&
        Objects.equals(this.mounts, ship.mounts) &&
        Objects.equals(this.cargo, ship.cargo) &&
        Objects.equals(this.fuel, ship.fuel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(symbol, registration, nav, crew, frame, reactor, engine, modules, mounts, cargo, fuel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ship {\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    registration: ").append(toIndentedString(registration)).append("\n");
    sb.append("    nav: ").append(toIndentedString(nav)).append("\n");
    sb.append("    crew: ").append(toIndentedString(crew)).append("\n");
    sb.append("    frame: ").append(toIndentedString(frame)).append("\n");
    sb.append("    reactor: ").append(toIndentedString(reactor)).append("\n");
    sb.append("    engine: ").append(toIndentedString(engine)).append("\n");
    sb.append("    modules: ").append(toIndentedString(modules)).append("\n");
    sb.append("    mounts: ").append(toIndentedString(mounts)).append("\n");
    sb.append("    cargo: ").append(toIndentedString(cargo)).append("\n");
    sb.append("    fuel: ").append(toIndentedString(fuel)).append("\n");
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

