package com.cf.data.model.poloniex;

import com.google.gson.Gson;
import java.math.BigDecimal;

/**
 *
 * @author David
 */
public class PoloniexTicker
{
    public final BigDecimal last;
    public final BigDecimal lowestAsk;
    public final BigDecimal highestBid;
    public final BigDecimal percentChange;
    public final BigDecimal baseVolume;
    public final BigDecimal quoteVolume;
    public final BigDecimal isFrozen;
    public final BigDecimal high24hr;
    public final BigDecimal low24hr;

    public PoloniexTicker(BigDecimal last, BigDecimal lowestAsk, BigDecimal highestBid, BigDecimal percentChange, BigDecimal baseVolume, BigDecimal quoteVolume, BigDecimal isFrozen, BigDecimal high24hr, BigDecimal low24hr)
    {
        this.last = last;
        this.lowestAsk = lowestAsk;
        this.highestBid = highestBid;
        this.percentChange = percentChange;
        this.baseVolume = baseVolume;
        this.quoteVolume = quoteVolume;
        this.isFrozen = isFrozen;
        this.high24hr = high24hr;
        this.low24hr = low24hr;
    }

    @Override
    public String toString()
    {
        return new Gson().toJson(this);
    }
}
