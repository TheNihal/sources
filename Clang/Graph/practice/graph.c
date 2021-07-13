/* Project Name   - graph.c */
/* Created On     - 07/13/21, 10:49:29 PM */
/* Author Name    - MD. Fahim Abrar Saikat */
/* Author E-mail  - saikat.cucse.52@gmail.com */
/* Author Github  - https://github.com/FA-Saikat */


#include <stdio.h>

void print(int arr[10][10], int vertex);
void assign(int arr[10][10], int vertex);
void input(int arr[10][10], int vertex);
void edgeList(int arr[10][10], int vertex);

int main()
{
    int row, col;
    int graph[10][10];
    int vertex = 8;

    assign(graph, 10);
    print(graph, vertex);

    input(graph, 11);
    printf("After inserting:\n");
    print(graph, vertex);

    edgeList(graph, vertex);
    /* print(graph, vertex); */

    return 0;
}


void assign(int arr[10][10], int vertex)
{
    int i, j;

    for (i = 0; i < vertex; i++) {
        for (j = 0; j < vertex; j++) {
            arr[i][j] = 0;
        }
    }
}


void print(int arr[10][10], int vertex)
{
    int i, j;

    for (i = 0; i < vertex; i++) {
        for (j = 0; j < vertex; j++) {
            printf("%d ", arr[i][j]);
        }
        printf("\n");
    }
}


void input(int arr[10][10], int edge)
{
    int i;
    int row, col;

    for (i = 0; i < edge; i++) {
        scanf("%d %d", &row, &col);
        arr[row][col] = 1;
        arr[col][row] = 1;
    }
}


void edgeList(int arr[10][10], int vertex)
{
    int i, j;

    for (i = 0; i < vertex; i++) {
        for (j = 0; j < vertex; j++) {
            if (arr[i][j] == 1)
            printf("%d %d\n", i, j);
        }
    }
}
