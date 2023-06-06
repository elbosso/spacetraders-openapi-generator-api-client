

# Survey

A resource survey of a waypoint, detailing a specific extraction location and the types of resources that can be found there.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**signature** | **String** | A unique signature for the location of this survey. This signature is verified when attempting an extraction using this survey. |  |
|**symbol** | **String** | The symbol of the waypoint that this survey is for. |  |
|**deposits** | [**List&lt;SurveyDeposit&gt;**](SurveyDeposit.md) | A list of deposits that can be found at this location. |  |
|**expiration** | **OffsetDateTime** | The date and time when the survey expires. After this date and time, the survey will no longer be available for extraction. |  |
|**size** | [**SizeEnum**](#SizeEnum) | The size of the deposit. This value indicates how much can be extracted from the survey before it is exhausted. |  |



## Enum: SizeEnum

| Name | Value |
|---- | -----|
| SMALL | &quot;SMALL&quot; |
| MODERATE | &quot;MODERATE&quot; |
| LARGE | &quot;LARGE&quot; |



