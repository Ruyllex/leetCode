#include <stdio.h>
#include <stdlib.h>

/*
Number of Employees Who Met the Target

There are n employees in a company, numbered from 0 to n - 1. Each employee i has worked for hours[i] hours in the company.
The company requires each employee to work for at least target hours.
You are given a 0-indexed array of non-negative integers hours of length n and a non-negative integer target.
Return the integer denoting the number of employees who worked at least target hours.
*/


int numberOfEmployeesWhoMetTarget(int* hours, int hoursSize, int target){
    int ans = 0;
    for(int i = 0; i != hoursSize; i++){
        if(hours[i] >= target){
            ans++;
        }
    }
    return ans;

}

int main(){
    int hour[5] = {0,1,2,3,4};
    int target = 2;
    int hourSize = 5;
    printf("There are %i employees who met the target.",numberOfEmployeesWhoMetTarget(hour,hourSize,target));
    return 0;
}