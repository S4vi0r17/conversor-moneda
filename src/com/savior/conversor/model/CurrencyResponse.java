package com.savior.conversor.model;

import java.util.Map;
import com.google.gson.annotations.SerializedName;

public record CurrencyResponse(
        @SerializedName("base_code") String baseCode,
        @SerializedName("conversion_rates") Map<String, Double> conversionRates
) { }
