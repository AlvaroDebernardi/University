#include <stdio.h>

int calculator(char caracter, int n1, int n2);

int main() {
    int v=5;
    int* p1 = &v;
    int *p2 = p1;
    (*p1)++;

    printf("p1: %d\n",*p1);
    printf("p1: %p\n",p1);
    printf("p2: %p\n",p2);


    char caracter;
    int n1, n2;
    printf("insert a caracter: ");
    scanf("%s %d %d", &caracter, &n1, &n2);

    printf("the caracter is: %c\n", caracter);
    printf("the first number is: %d\n", n1);
    printf("the second number is: %d\n", n2);

    int result = calculator(caracter, n1, n2);
    printf("The result is: %d", result);

    return 0;
}

int calculator(char caracter, int n1, int n2) {
    switch (caracter) {
        case '+':
            return n1+n2;
        case '-':
            return n1-n2;
        case '*':
            return n1*n2;
        case '/':
            if (n2 == 0) {
                fprintf(stderr, "for division the second operand can't be 0");
                break;
            }
            return n1/n2;
        default:
            fprintf(stderr, "The caracter is not a integer operand");
    }
}
