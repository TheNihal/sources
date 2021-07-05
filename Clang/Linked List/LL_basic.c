/* Project Name   - LL_basic.c */
/* Created On     - 07/02/21, 10:39:39 PM */
/* Author Name    - MD. Fahim Abrar Saikat */
/* Author E-mail  - saikat.cucse.52@gmail.com */
/* Author Github  - https://github.com/FA-Saikat */


#include <stdio.h>

typedef struct Node node;
struct Node{
    int value;
    struct Node *next;
};

void address(node *temp);
void value(node temp);

int main()
{
    node a, b, c, d;
    node *head = NULL;

    head = &a;
    a.value = 1;
    a.next = &b;

    b.value = 2;
    b.next = &c;

    c.value = 3;
    c.next = &d;

    d.value = 4;
    d.next = NULL;

    printf("%d = %d => %d\n", &a, a.value, a.next);
    printf("%d = %d => %d\n", &b, b.value, b.next);
    printf("%d = %d => %d\n", &c, c.value, c.next);
    printf("%d = %d => %d\n", &d, d.value, d.next);
    printf("\n");
    address(&a);
    address(&b);
    address(&c);
    address(&d);
    printf("\n");
    value(a);
    value(b);
    value(c);
    value(d);
    return 0;
}


/* Passing memory address let's us to work the nodes from main function */
void
address(node *temp)
{
    printf("%d = %d => %d\n", temp, temp->value, temp->next);
}

/* Passing value prints the memory adderss of the local variable */
void
value(node temp)
{
    printf("%d = %d => %d\n", &temp, temp.value, &temp.next);
}
