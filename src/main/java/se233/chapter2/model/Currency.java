package se233.chapter2.model;

import java.util.List;

public class Currency {
    public String getShortCode() {
        return shortCode;
    }

    public CurrencyEntity getCurrent() {
        return current;
    }

    public void setCurrent(CurrencyEntity current) {
        this.current = current;
    }

    public List<CurrencyEntity> getHistorical() {
        return historical;
    }

    public void setHistorical(List<CurrencyEntity> historical) {
        this.historical = historical;
    }

    public Boolean getWatch() {
        return isWatch;
    }

    public Double getWatchRate() {
        return watchRate;
    }


    public void setWatch(Boolean watch) {
        isWatch = watch;
    }

    public void setWatchRate(Double watchRate) {
        this.watchRate = watchRate;
    }

    private final String shortCode;
    private CurrencyEntity current;
    private List<CurrencyEntity> historical;
    private Boolean isWatch;
    private Double watchRate;
    public Currency(String shortCode) {
        this.shortCode = shortCode;
        this.isWatch = false;
        this.watchRate = 0.0;
    }

}
