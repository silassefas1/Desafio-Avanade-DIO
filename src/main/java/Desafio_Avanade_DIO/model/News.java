package Desafio_Avanade_DIO.model;

import java.math.BigDecimal;

public class News {

    private Long id;
    private String numbaer;
    private String agency;
    private BigDecimal balance;
    private BigDecimal limit;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumbaer() {
        return numbaer;
    }

    public void setNumbaer(String numbaer) {
        this.numbaer = numbaer;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getLimit() {
        return limit;
    }

    public void setLimit(BigDecimal limit) {
        this.limit = limit;
    }
}
