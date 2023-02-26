package com.duffy.nfinance.api.quotes.stock;

import java.math.BigDecimal;

public class StockQuote {

    private String symbolCode;

    private BigDecimal currentPrice;

    private BigDecimal previousClosePrice;
    private BigDecimal openPrice;
    private BigDecimal highPrice;
    private BigDecimal lowPrice;
}
