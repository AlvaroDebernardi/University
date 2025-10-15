#include <stdio.h>

int sumOfDivisors(int);

int main() {
    int number;

    printf("Give me a number: ");
    scanf("%d", &number);
    printf("the number is: %d\n", number);

    printf("the sum of divisors is: %d", sumOfDivisors(number));

    return 0;
}

int sumOfDivisors(int number) {
    int result = 0;

    for (int i = 1; i < number; i++) {
        if (number % i == 0)
            result += i;
    }
    return result;
}

