

# ShipEngine

The engine determines how quickly a ship travels between waypoints.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**symbol** | [**SymbolEnum**](#SymbolEnum) |  |  |
|**name** | **String** |  |  |
|**description** | **String** |  |  |
|**condition** | **Integer** | Condition is a range of 0 to 100 where 0 is completely worn out and 100 is brand new. |  [optional] |
|**speed** | **Integer** |  |  |
|**requirements** | [**ShipRequirements**](ShipRequirements.md) |  |  |



## Enum: SymbolEnum

| Name | Value |
|---- | -----|
| IMPULSE_DRIVE_I | &quot;ENGINE_IMPULSE_DRIVE_I&quot; |
| ION_DRIVE_I | &quot;ENGINE_ION_DRIVE_I&quot; |
| ION_DRIVE_II | &quot;ENGINE_ION_DRIVE_II&quot; |
| HYPER_DRIVE_I | &quot;ENGINE_HYPER_DRIVE_I&quot; |



