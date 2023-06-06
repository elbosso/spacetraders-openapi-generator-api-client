

# MarketTransaction


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**waypointSymbol** | **String** | The symbol of the waypoint where the transaction took place. |  |
|**shipSymbol** | **String** | The symbol of the ship that made the transaction. |  |
|**tradeSymbol** | **String** | The symbol of the trade good. |  |
|**type** | [**TypeEnum**](#TypeEnum) | The type of transaction. |  |
|**units** | **Integer** | The number of units of the transaction. |  |
|**pricePerUnit** | **Integer** | The price per unit of the transaction. |  |
|**totalPrice** | **Integer** | The total price of the transaction. |  |
|**timestamp** | **OffsetDateTime** | The timestamp of the transaction. |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| PURCHASE | &quot;PURCHASE&quot; |
| SELL | &quot;SELL&quot; |



