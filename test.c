#include <stdlib.h>
#include <stdio.h>

int main() {
    int* edad = malloc(2);
    printf("%p\n",(void*)edad);
    //free(edad);
}