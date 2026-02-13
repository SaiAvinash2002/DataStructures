fun bestTimeToBuyAndSellStock(prices: IntArray): Int {
// Just like in normal world try to buy stock at MINIMUM price and sell at MAXIMUM price.
        var maxProfit = 0
        var minStockPrice = Integer.MAX_VALUE

        for(i in prices){
            if(i<minStockPrice){
                minStockPrice = i   // Buying Stock
            }
            if((i-minStockPrice)>maxProfit){ // Checking when is best to sell Stock.
                maxProfit = i-minStockPrice  // Selling the Stock. But here we also know the future prices as well lol.
            }
        }
        return maxProfit
    }
