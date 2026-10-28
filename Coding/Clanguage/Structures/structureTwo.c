#include<stdio.h>


#define SIZE 3

struct Date
{
    int day, month, year;
};

struct Student{
    int rollNo;
    char name[30];
    float marks;
    char grade;
    struct Date dob;
};

int main(int argc, char const *argv[])
{
    struct Student sArr[SIZE];
    int i;
    for(i = 0; i < SIZE; i++){
        printf("Enter roll number: ");
        scanf("%d", &sArr[i].rollNo);
        getchar();
        printf("Enter name: ");
        fgets(sArr[i].name, 30, stdin);
        printf("Enter marks: ");
        scanf("%f", &sArr[i].marks);
        getchar();
        printf("Enter grade: ");
        scanf("%c", &sArr[i].grade);
        printf("Enter date of birth\n");
        printf("Enter Day: ");
        scanf("%d", &sArr[i].dob.day);
        printf("Enter Month: ");
        scanf("%d", &sArr[i].dob.month);
        printf("Enter Year: ");
        scanf("%d", &sArr[i].dob.year);
    }
    printf("\nStudent Information\n");
    for(i = 0; i < SIZE; i++){
        printf("Roll number: %d\n", sArr[i].rollNo);
        printf("Name: %s", sArr[i].name);
        printf("Marks: %f\n", sArr[i].marks);
        printf("Grade: %c\n", sArr[i].grade);
        printf("Date of birth: %d-%d-%d\n", sArr[i].dob.day, sArr[i].dob.month, sArr[i].dob.year);
    }

    return 0;
}
