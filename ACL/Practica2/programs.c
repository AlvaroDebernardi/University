#include <stdio.h>

typedef struct {
    char* name;
    int edad;
} Person;

typedef struct {
    char* surname;
    int largo;
} Surname;

typedef Person Persona;

int main() {
    // Try of exercise 4
    
    void* cad = "hello world";
    int x = 4 + *(int*) cad;
    printf("%d",x);


    // Exercise 5
    Person persona = { "hola", 4 };
    Surname surname = { "hola", 4 };

    Persona a = persona;
    //a = surname;

    // Exercise 6
    int r = 3;

    char* sss = "como";
    char** s = &sss;
    char* ss =  *s + r;
    printf("%s",ss);

    return 0;
}
