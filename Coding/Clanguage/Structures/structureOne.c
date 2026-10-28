#include<stdio.h>
#include<string.h>

struct Student{
    int rollNo;
    char name[30];
    float marks;
    char grade;
};

int main(int argc, char const *argv[])
{
    struct Student s1;
    struct Student s2;

    s1.rollNo = 101;
    strcpy(s1.name, "Ajay");
    s1.marks = 89.6f;
    s1.grade = 'A';

    
    s2.rollNo = 102;
    strcpy(s2.name, "Vijay");
    s2.marks = 79.6f;
    s2.grade = 'B';

    printf("\nStudent Information\n");
    printf("Roll number: %d\n", s1.rollNo);
    printf("Name: %s\n", s1.name);
    printf("Marks: %f\n", s1.marks);
    printf("Grade: %c\n", s1.grade);

    printf("\nStudent Information\n");
    printf("Roll number: %d\n", s2.rollNo);
    printf("Name: %s\n", s2.name);
    printf("Marks: %f\n", s2.marks);
    printf("Grade: %c\n", s2.grade);

    struct Student s3 = {103, "Rahul", 81.5, 'B'};
    printf("\nStudent Information\n");
    printf("Roll number: %d\n", s3.rollNo);
    printf("Name: %s\n", s3.name);
    printf("Marks: %f\n", s3.marks);
    printf("Grade: %c\n", s3.grade);

    struct Student s4;
    printf("Enter roll number: ");
    scanf("%d", &s4.rollNo);
    getchar();
    printf("Enter name: ");
    fgets(s4.name, 30, stdin);
    printf("Enter marks: ");
    scanf("%f", &s4.marks);
    getchar();
    printf("Enter grade: ");
    scanf("%c", &s4.grade);
    printf("\nStudent Information\n");
    printf("Roll number: %d\n", s4.rollNo);
    printf("Name: %s", s4.name);
    printf("Marks: %f\n", s4.marks);
    printf("Grade: %c\n", s4.grade);

    return 0;
}
