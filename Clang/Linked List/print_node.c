/* Project Name   - print_node.c */
/* Created On     - 07/03/21, 10:12:09 AM */
/* Author Name    - MD. Fahim Abrar Saikat */
/* Author E-mail  - saikat.cucse.52@gmail.com */
/* Author Github  - https://github.com/FA-Saikat */

#include <stdio.h>

typedef struct Node node;
struct Node{
    int value;
    node *next;
};

void print_linked_list(node *temp);
void print_node(node *temp);
void print_value(node *temp);

int main()
{
    node a, b, c, d;
    node *head = NULL;
    head       = &a;
    node *anotherHead = NULL;

    a.value = 1;
    a.next  = &d;

    d.value = 2;
    d.next  = &b;

    b.value = 3;
    b.next  = &c;

    c.value = 4;
    c.next  = NULL;

    /* print_node(&a); */
    /* print_node(&d); */
    /* print_node(&b); */
    /* print_node(&c); */

    /* printf("Varify:\n"); */
    /* printf("Current: %d => Value => %d >> Next: %d\n", &a, a.value, a.next); */
    /* printf("Current: %d => Value => %d >> Next: %d\n", &d, d.value, d.next); */
    /* printf("Current: %d => Value => %d >> Next: %d\n", &b, b.value, b.next); */
    /* printf("Current: %d => Value => %d >> Next: %d\n", &c, c.value, c.next); */
    print_linked_list(head);
    print_linked_list(anotherHead);
    print_value(head);
    print_value(anotherHead);
    return 0;
}

void
print_linked_list(node *temp)
{
    if (temp == NULL) {
        printf("Linked list is Empty!\n");
    }
    while (temp != NULL) {
        printf("Current: %d => Value => %d >> Next: %d\n", temp, temp->value, temp->next);
        temp = temp->next;
    }
}

void
print_value(node *temp)
{
    if (temp == NULL) {
        printf("Linked list is Empty!\n");
    }
    while (temp != NULL) {
        printf("%d\n", temp->value);
        temp = temp->next;
    }
}

void
print_node(node *temp)
{
    printf("Current: %d => Value => %d >> Next: %d\n", temp, temp->value, temp->next);
}


