

# Contract



## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  |
|**factionSymbol** | **String** | The symbol of the faction that this contract is for. |  |
|**type** | [**TypeEnum**](#TypeEnum) |  |  |
|**terms** | [**ContractTerms**](ContractTerms.md) |  |  |
|**accepted** | **Boolean** | Whether the contract has been accepted by the agent |  |
|**fulfilled** | **Boolean** | Whether the contract has been fulfilled |  |
|**expiration** | **OffsetDateTime** | Deprecated in favor of deadlineToAccept |  |
|**deadlineToAccept** | **OffsetDateTime** | The time at which the contract is no longer available to be accepted |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| PROCUREMENT | &quot;PROCUREMENT&quot; |
| TRANSPORT | &quot;TRANSPORT&quot; |
| SHUTTLE | &quot;SHUTTLE&quot; |



