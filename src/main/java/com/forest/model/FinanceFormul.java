package com.forest.model;

public class FinanceFormul {
    //Коэффициент абсолютной ликвидности
    private double absoluteLiquidityRatio;

    //Коэффициент текущей ликвидности
    private double currentRatio;

    //Чистый оборотный капитал
    private double pureWorkingCapital;

    //Коэффициент финансовой независимости
    private double financialIndependence;

    //Суммарные обязательства к активам
    private double totalLiabilitiesAssets;

    //Суммарные обязательства к собственному капиталу
    private double totalLiabilitiesEquity;

    //Долгосрочные обязательства к активам
    private double longTermDebtTotalAssets;

    //Долгосрочные обязательства к необоротным активам
    private double longTermDebtFixedAssets;

    private FinanceData financeData;

    public FinanceFormul() {
    }

    public FinanceFormul(FinanceData financeData) {
        this.financeData = financeData;
        absoluteLiquidityRatio = (financeData.getCash() + financeData.getShortTermInvestments()) / financeData.getCurrentResponsibility();
        currentRatio = financeData.getCurrentAssets() / financeData.getCurrentResponsibility();
        pureWorkingCapital = financeData.getCurrentAssets() - financeData.getCurrentResponsibility();
        financialIndependence = financeData.getEquity() / financeData.getTotalAssets();
        totalLiabilitiesAssets = (financeData.getLongTermResponsibility() + financeData.getCurrentResponsibility()) / financeData.getTotalAssets();
        totalLiabilitiesEquity = financeData.getTotalResponsibility() / financeData.getTotalShareCapital();
        longTermDebtTotalAssets = financeData.getLongTermResponsibility() / financeData.getTotalAssets();
        longTermDebtFixedAssets = financeData.getLongTermResponsibility() / financeData.getNoncirculatingFunds();
    }

    public FinanceFormul(double absoluteLiquidityRatio, double currentRatio, double pureWorkingCapital, double financialIndependence, double totalLiabilitiesAssets, double totalLiabilitiesEquity, double longTermDebtTotalAssets, double longTermDebtFixedAssets, FinanceData financeData) {
        this.absoluteLiquidityRatio = absoluteLiquidityRatio;
        this.currentRatio = currentRatio;
        this.pureWorkingCapital = pureWorkingCapital;
        this.financialIndependence = financialIndependence;
        this.totalLiabilitiesAssets = totalLiabilitiesAssets;
        this.totalLiabilitiesEquity = totalLiabilitiesEquity;
        this.longTermDebtTotalAssets = longTermDebtTotalAssets;
        this.longTermDebtFixedAssets = longTermDebtFixedAssets;
        this.financeData = financeData;
    }

    public double getAbsoluteLiquidityRatio() {
        return absoluteLiquidityRatio;
    }

    public void setAbsoluteLiquidityRatio(double absoluteLiquidityRatio) {
        this.absoluteLiquidityRatio = absoluteLiquidityRatio;
    }

    public double getCurrentRatio() {
        return currentRatio;
    }

    public void setCurrentRatio(double currentRatio) {
        this.currentRatio = currentRatio;
    }

    public double getPureWorkingCapital() {
        return pureWorkingCapital;
    }

    public void setPureWorkingCapital(double pureWorkingCapital) {
        this.pureWorkingCapital = pureWorkingCapital;
    }

    public double getFinancialIndependence() {
        return financialIndependence;
    }

    public void setFinancialIndependence(double financialIndependence) {
        this.financialIndependence = financialIndependence;
    }

    public double getTotalLiabilitiesAssets() {
        return totalLiabilitiesAssets;
    }

    public void setTotalLiabilitiesAssets(double totalLiabilitiesAssets) {
        this.totalLiabilitiesAssets = totalLiabilitiesAssets;
    }

    public double getTotalLiabilitiesEquity() {
        return totalLiabilitiesEquity;
    }

    public void setTotalLiabilitiesEquity(double totalLiabilitiesEquity) {
        this.totalLiabilitiesEquity = totalLiabilitiesEquity;
    }

    public double getLongTermDebtTotalAssets() {
        return longTermDebtTotalAssets;
    }

    public void setLongTermDebtTotalAssets(double longTermDebtTotalAssets) {
        this.longTermDebtTotalAssets = longTermDebtTotalAssets;
    }

    public double getLongTermDebtFixedAssets() {
        return longTermDebtFixedAssets;
    }

    public void setLongTermDebtFixedAssets(double longTermDebtFixedAssets) {
        this.longTermDebtFixedAssets = longTermDebtFixedAssets;
    }
}
