#include <iostream>
#include <vector>
#include <algorithm>
#include <map>
using namespace std;

/*
Best Time to Buy and Sell Stock
You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

*/

class Solution {
public:
    int maxProfit(vector<int>& prices) {
    vector<int> copyPrices = prices;
    sort(copyPrices.begin(),copyPrices.end());
    int lowestPrice = copyPrices[0];
    int largePrices = prices.size();
    int maxProfit = 0;
    int lowestPriceIndex = -1;
    for(int i = 0; i != largePrices; i++){
        if(prices[i] == lowestPrice){
            lowestPriceIndex = i;
            }
        }
    for(int j = lowestPriceIndex; j != largePrices;j++){
        int diferencia = prices[j] - lowestPrice;
        if(diferencia > maxProfit){
            maxProfit = diferencia;
            }
        }
    return maxProfit;
    }
};

int main() {
Solution solution; 
vector<int> prices = {7,1,5,3,6,4};
int answer = solution.maxProfit(prices);
cout << "output: " << answer << endl; 
vector<int> prices1 = {7,6,4,3,1};
int answer1 = solution.maxProfit(prices1);
cout << "output: " << answer1;
}