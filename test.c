#include <stdlib.h>
#include <stdio.h>

char* special(int i) {
    char c = '*';
    char *ans = malloc(i + 1); 
    if (ans == NULL) {
        printf("Error: No se pudo asignar memoria\n");
        exit(1);
    }
    for(int j = 0; j < i; j++) {
        ans[j] = c;
    }
    ans[i] = '\0';
    return ans;
}

int main() {
    for(int i = 1; i <= 6; i++) { // Cambiar de i != 6 a i <= 6 para que incluya 6 asteriscos
        char *result = special(i);
        printf("%s\n", result);
        free(result); 
    }
    return 0;
}

