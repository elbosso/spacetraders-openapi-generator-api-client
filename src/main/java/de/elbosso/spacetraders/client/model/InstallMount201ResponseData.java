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
import de.elbosso.spacetraders.client.model.Agent;
import de.elbosso.spacetraders.client.model.InstallMount201ResponseDataTransaction;
import de.elbosso.spacetraders.client.model.ShipCargo;
import de.elbosso.spacetraders.client.model.ShipMount;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * InstallMount201ResponseData
 */
@JsonPropertyOrder({
  InstallMount201ResponseData.JSON_PROPERTY_AGENT,
  InstallMount201ResponseData.JSON_PROPERTY_MOUNTS,
  InstallMount201ResponseData.JSON_PROPERTY_CARGO,
  InstallMount201ResponseData.JSON_PROPERTY_TRANSACTION
})
@JsonTypeName("Install_Mount_201_Response_data")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-05T09:25:51.979579Z[Etc/UTC]")
public class InstallMount201ResponseData {
  public static final String JSON_PROPERTY_AGENT = "agent";
  private Agent agent;

  public static final String JSON_PROPERTY_MOUNTS = "mounts";
  private List<ShipMount> mounts = new ArrayList<>();

  public static final String JSON_PROPERTY_CARGO = "cargo";
  private ShipCargo cargo;

  public static final String JSON_PROPERTY_TRANSACTION = "transaction";
  private InstallMount201ResponseDataTransaction transaction;

  public InstallMount201ResponseData() {
  }

  public InstallMount201ResponseData agent(Agent agent) {
    
    this.agent = agent;
    return this;
  }

   /**
   * Get agent
   * @return agent
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_AGENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Agent getAgent() {
    return agent;
  }


  @JsonProperty(JSON_PROPERTY_AGENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAgent(Agent agent) {
    this.agent = agent;
  }


  public InstallMount201ResponseData mounts(List<ShipMount> mounts) {
    
    this.mounts = mounts;
    return this;
  }

  public InstallMount201ResponseData addMountsItem(ShipMount mountsItem) {
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


  public InstallMount201ResponseData cargo(ShipCargo cargo) {
    
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


  public InstallMount201ResponseData transaction(InstallMount201ResponseDataTransaction transaction) {
    
    this.transaction = transaction;
    return this;
  }

   /**
   * Get transaction
   * @return transaction
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TRANSACTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public InstallMount201ResponseDataTransaction getTransaction() {
    return transaction;
  }


  @JsonProperty(JSON_PROPERTY_TRANSACTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTransaction(InstallMount201ResponseDataTransaction transaction) {
    this.transaction = transaction;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstallMount201ResponseData installMount201ResponseData = (InstallMount201ResponseData) o;
    return Objects.equals(this.agent, installMount201ResponseData.agent) &&
        Objects.equals(this.mounts, installMount201ResponseData.mounts) &&
        Objects.equals(this.cargo, installMount201ResponseData.cargo) &&
        Objects.equals(this.transaction, installMount201ResponseData.transaction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agent, mounts, cargo, transaction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstallMount201ResponseData {\n");
    sb.append("    agent: ").append(toIndentedString(agent)).append("\n");
    sb.append("    mounts: ").append(toIndentedString(mounts)).append("\n");
    sb.append("    cargo: ").append(toIndentedString(cargo)).append("\n");
    sb.append("    transaction: ").append(toIndentedString(transaction)).append("\n");
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

