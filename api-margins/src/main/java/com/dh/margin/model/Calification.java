package com.dh.margin.model;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
public class Calification {

    private String documentType;
    private String documentValue;
    private BigDecimal totalMargin;
    private BigDecimal totalMarginAdditional;
    private EconomicActivity economicActivity;
    private RiskLevel riskLevel;
    private CustomerCategory customerCategory;
    private List<Sublimit> sublimits;
    @Getter
    @Setter
    public static class Sublimit{
        private Concept concept;
        private BigDecimal totalMargin;
    }
}
