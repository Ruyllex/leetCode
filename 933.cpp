#include <iostream>
#include <vector>
#include <algorithm>
#include <string>
#include <map>
#include <cmath>

using namespace std;

/*
Number of Recent Calls

You have a RecentCounter class which counts the number of recent requests within a certain time frame.

Implement the RecentCounter class:

    RecentCounter() Initializes the counter with zero recent requests.
    int ping(int t) Adds a new request at time t, where t represents some time in milliseconds, 
    and returns the number of requests that has happened in the past 3000 milliseconds (including the new request). 
    Specifically, return the number of requests that have happened in the inclusive range [t - 3000, t].

It is guaranteed that every call to ping uses a strictly larger value of t than the previous call.
*/

class RecentCounter {
public:
    vector<int> request;
    RecentCounter() {
        request = {};
    } 
    int ping(int t) {
        int min = (t - 3000);

        if( min <= t ){
            request.push_back(t);
        }

        return request.size();
    }
};

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter* obj = new RecentCounter();
 * int param_1 = obj->ping(t);
 */

int main(){
    RecentCounter* recentCounter = new RecentCounter();
    cout << recentCounter->ping(1) << endl;
    cout << recentCounter->ping(100) << endl;
    cout << recentCounter->ping(3001) << endl;
    cout << recentCounter->ping(3002) << endl;
}