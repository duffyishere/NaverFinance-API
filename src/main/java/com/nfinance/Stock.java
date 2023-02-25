package com.nfinance;

import com.nfinance.quotes.StockDividend;
import com.nfinance.quotes.StockQuote;
import com.nfinance.quotes.StockStatus;

import java.time.LocalDateTime;

public class Stock {

    private String symbolCode;
    private String name;
    private String currency;
    private String marketStatus;

    private StockQuote quote;
    private StockStatus status;
    private StockDividend dividend;

    private LocalDateTime lastUpdated;
}
