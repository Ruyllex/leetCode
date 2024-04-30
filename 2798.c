#include <stdio.h>
#include <stdlib.h>

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