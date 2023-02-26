package com.duffy.nfinance.api.quotes.stock;

import java.math.BigDecimal;

public class StockStatus {

    private String symbolCode;

    private Long accumulatedTradingVolume;  // 거래량
    private BigDecimal accumulatedTradingPrice;  // 거래대금
    private BigDecimal marketPrice; // 시총
    private Double foreignRate; // 외인소진율

    private BigDecimal highPriceOf52Weeks;
    private BigDecimal lowPriceOf52Weeks;

    private Double per;
    private Double pbr;
    private BigDecimal eps;
    private BigDecimal bps;
}
