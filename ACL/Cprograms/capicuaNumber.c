#include <stdio.h>
#include <stdlib.h>

typedef struct Node {
    int value;
    struct Node* next;
} Node;

typedef struct LinkedList {
    int cant;
    Node* head;
} LinkedList;

LinkedList digits(int);
void printLinkedList(LinkedList);

int main() {

    int number;
    printf("Give me a number: ");
    scanf("%d", &number);

    LinkedList listDigits = digits(number);
    printLinkedList(listDigits);

    return 0;
}

LinkedList digits(int number){
    LinkedList result = {0,NULL};

    Node* actualNode = (Node*) malloc(sizeof(Node));
    result.head = actualNode;

    while(number > 0) {
        Node* newNode = (Node*) malloc(sizeof(Node));

        newNode->value = number%10;
        newNode->next = NULL;

        result.cant++;

        number /= 10;
        actualNode->next = newNode;
        actualNode = actualNode->next;
    }

    return result;
}

void printLinkedList(LinkedList list) {
    Node* node;

    for (node = list.head; node != NULL; node = node->next) {
        printf("%d ", node->value);
    }
}
