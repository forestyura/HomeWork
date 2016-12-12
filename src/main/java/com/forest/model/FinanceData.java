package com.forest.model;


public class FinanceData {
    //Денежные стредства
    private double cash;

    //Краткосрочные инвестиции
    private double shortTermInvestments;

    //Текущие обязательства
    private double currentResponsibility;

    //Долгосрочные обязательства
    private double longTermResponsibility;

    //Суммарные обязательства
    private double totalResponsibility;

    //Текущие активы
    private double currentAssets;

    //Суммарный актив
    private double totalAssets;

    //Собственный капитал
    private double equity;

    //Суммарный акционерный капитал
    private double totalShareCapital;

    //Внеоборотные средства
    private double noncirculatingFunds;

    public FinanceData() {
    }

    public FinanceData(double cash, double shortTermInvestments, double currentResponsibility, double longTermResponsibility, double totalResponsibility, double currentAssets, double totalAssets, double equity, double totalShareCapital, double noncirculatingFunds) {
        this.cash = cash;
        this.shortTermInvestments = shortTermInvestments;
        this.currentResponsibility = currentResponsibility;
        this.longTermResponsibility = longTermResponsibility;
        this.totalResponsibility = totalResponsibility;
        this.currentAssets = currentAssets;
        this.totalAssets = totalAssets;
        this.equity = equity;
        this.totalShareCapital = totalShareCapital;
        this.noncirculatingFunds = noncirculatingFunds;
    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    public double getShortTermInvestments() {
        return shortTermInvestments;
    }

    public void setShortTermInvestments(double shortTermInvestments) {
        this.shortTermInvestments = shortTermInvestments;
    }

    public double getCurrentResponsibility() {
        return currentResponsibility;
    }

    public void setCurrentResponsibility(double currentResponsibility) {
        this.currentResponsibility = currentResponsibility;
    }

    public double getLongTermResponsibility() {
        return longTermResponsibility;
    }

    public void setLongTermResponsibility(double longTermResponsibility) {
        this.longTermResponsibility = longTermResponsibility;
    }

    public double getTotalResponsibility() {
        return totalResponsibility;
    }

    public void setTotalResponsibility(double totalResponsibility) {
        this.totalResponsibility = totalResponsibility;
    }

    public double getCurrentAssets() {
        return currentAssets;
    }

    public void setCurrentAssets(double currentAssets) {
        this.currentAssets = currentAssets;
    }

    public double getTotalAssets() {
        return totalAssets;
    }

    public void setTotalAssets(double totalAssets) {
        this.totalAssets = totalAssets;
    }

    public double getEquity() {
        return equity;
    }

    public void setEquity(double equity) {
        this.equity = equity;
    }

    public double getTotalShareCapital() {
        return totalShareCapital;
    }

    public void setTotalShareCapital(double totalShareCapital) {
        this.totalShareCapital = totalShareCapital;
    }

    public double getNoncirculatingFunds() {
        return noncirculatingFunds;
    }

    public void setNoncirculatingFunds(double noncirculatingFunds) {
        this.noncirculatingFunds = noncirculatingFunds;
    }
}
