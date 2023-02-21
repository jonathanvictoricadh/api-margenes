package com.dh.margin.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;

@AllArgsConstructor
@Getter
public class Risk {

    private EconomicActivity economicActivity;
    private RiskLevel riskLevel;
    private BigDecimal margin;
}
