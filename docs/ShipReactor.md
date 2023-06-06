

# ShipReactor

The reactor of the ship. The reactor is responsible for powering the ship's systems and weapons.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**symbol** | [**SymbolEnum**](#SymbolEnum) |  |  |
|**name** | **String** |  |  |
|**description** | **String** |  |  |
|**condition** | **Integer** | Condition is a range of 0 to 100 where 0 is completely worn out and 100 is brand new. |  [optional] |
|**powerOutput** | **Integer** |  |  |
|**requirements** | [**ShipRequirements**](ShipRequirements.md) |  |  |



## Enum: SymbolEnum

| Name | Value |
|---- | -----|
| SOLAR_I | &quot;REACTOR_SOLAR_I&quot; |
| FUSION_I | &quot;REACTOR_FUSION_I&quot; |
| FISSION_I | &quot;REACTOR_FISSION_I&quot; |
| CHEMICAL_I | &quot;REACTOR_CHEMICAL_I&quot; |
| ANTIMATTER_I | &quot;REACTOR_ANTIMATTER_I&quot; |



