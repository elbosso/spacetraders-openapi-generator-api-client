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
import de.elbosso.spacetraders.client.model.ContractDeliverGood;
import de.elbosso.spacetraders.client.model.ContractPayment;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ContractTerms
 */
@JsonPropertyOrder({
  ContractTerms.JSON_PROPERTY_DEADLINE,
  ContractTerms.JSON_PROPERTY_PAYMENT,
  ContractTerms.JSON_PROPERTY_DELIVER
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-05T09:25:51.979579Z[Etc/UTC]")
public class ContractTerms {
  public static final String JSON_PROPERTY_DEADLINE = "deadline";
  private OffsetDateTime deadline;

  public static final String JSON_PROPERTY_PAYMENT = "payment";
  private ContractPayment payment;

  public static final String JSON_PROPERTY_DELIVER = "deliver";
  private List<ContractDeliverGood> deliver;

  public ContractTerms() {
  }

  public ContractTerms deadline(OffsetDateTime deadline) {
    
    this.deadline = deadline;
    return this;
  }

   /**
   * The deadline for the contract.
   * @return deadline
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DEADLINE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getDeadline() {
    return deadline;
  }


  @JsonProperty(JSON_PROPERTY_DEADLINE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDeadline(OffsetDateTime deadline) {
    this.deadline = deadline;
  }


  public ContractTerms payment(ContractPayment payment) {
    
    this.payment = payment;
    return this;
  }

   /**
   * Get payment
   * @return payment
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PAYMENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ContractPayment getPayment() {
    return payment;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPayment(ContractPayment payment) {
    this.payment = payment;
  }


  public ContractTerms deliver(List<ContractDeliverGood> deliver) {
    
    this.deliver = deliver;
    return this;
  }

  public ContractTerms addDeliverItem(ContractDeliverGood deliverItem) {
    if (this.deliver == null) {
      this.deliver = new ArrayList<>();
    }
    this.deliver.add(deliverItem);
    return this;
  }

   /**
   * Get deliver
   * @return deliver
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DELIVER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ContractDeliverGood> getDeliver() {
    return deliver;
  }


  @JsonProperty(JSON_PROPERTY_DELIVER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeliver(List<ContractDeliverGood> deliver) {
    this.deliver = deliver;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContractTerms contractTerms = (ContractTerms) o;
    return Objects.equals(this.deadline, contractTerms.deadline) &&
        Objects.equals(this.payment, contractTerms.payment) &&
        Objects.equals(this.deliver, contractTerms.deliver);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deadline, payment, deliver);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContractTerms {\n");
    sb.append("    deadline: ").append(toIndentedString(deadline)).append("\n");
    sb.append("    payment: ").append(toIndentedString(payment)).append("\n");
    sb.append("    deliver: ").append(toIndentedString(deliver)).append("\n");
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
