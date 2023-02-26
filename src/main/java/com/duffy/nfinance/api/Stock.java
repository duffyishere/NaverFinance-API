package com.duffy.nfinance.api;

import com.duffy.nfinance.api.quotes.stock.StockDividend;
import com.duffy.nfinance.api.quotes.stock.StockQuote;
import com.duffy.nfinance.api.quotes.stock.StockStatus;

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
