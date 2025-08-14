# Java Learning Plan for Undergraduate CS Students

## Table of Contents

| Week | Topic                        | Hands-on Example             |
|------|------------------------------|------------------------------|
| 1    | Introduction to Java         | Hello World Program          |
| 2    | Data Types & Variables       | Simple Calculator            |
| 3    | Operators & Expressions      | Arithmetic Operations        |
| 4    | Control Flow (if, switch)    | Grade Calculator             |
| 5    | Loops (for, while, do-while) | Print Prime Numbers          |
| 6    | Methods & Functions          | Factorial Calculation        |
| 7    | Arrays                       | Array Sorting                |
| 8    | Object-Oriented Concepts     | Bank Account Class           |
| 9    | Inheritance & Polymorphism   | Animal Hierarchy Example     |
| 10   | Exception Handling           | Divide by Zero Exception     |
| 11   | Collections (List, Set, Map) | Student Names List           |
| 12   | File I/O                     | Read/Write Text File         |
| 13   | GUI Basics (Swing)           | Simple Calculator GUI        |
| 14   | Threads & Concurrency        | Counter with Threads         |
| 15   | Project & Revision           | Mini Project: Library System |

***

## How to Approach the Learning Plan

1. **Follow Weekly Schedule:** Dedicate focused time (3-5 hours/week) for study and practice.
2. **Understand the Concept:** Read theory from textbooks or online resources (Oracle Java Tutorials recommended).
3. **Hands-on Practice:** Write code examples for each topic. Try variations to deepen understanding.
4. **Ask Questions:** Seek help from peers and online forums (StackOverflow, GeeksforGeeks).
5. **Mini Project:** Apply all concepts in a single project to reinforce learning.
6. **Revise Regularly:** Go back to previous topics and improve based on feedback or errors found.

***

## Step-by-Step Instructions with Hands-On Examples

### Week 1: Introduction to Java

**Objective:** Learn basics of Java syntax, IDE setup.

** *Steps:* **
- Install Java (JDK) and IntelliJ IDEA or Eclipse.
- Write your first program.

**Example:**  
```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```
*Try changing the output message.*

***

### Week 2: Data Types & Variables

**Objective:** Understand primitive types and variable declarations.

**Steps:**
- Learn about `int`, `double`, `char`, `boolean`, and `String`.
- Declare and initialize variables.

**Example:**  
```java
int age = 20;
double score = 86.5;
char grade = 'A';
boolean passed = true;
String name = "Alice";
```
*Write a program to input your name and age, and print them.*

***

### Week 3: Operators & Expressions

**Objective:** Explore arithmetic, comparison, and logical operators.

**Steps:**
- Perform calculations using different operators.
- Combine expressions and print results.

**Example:**  
```java
int a = 5, b = 3;
int sum = a + b;
int product = a * b;
boolean isGreater = a > b;
System.out.println("Sum: " + sum);
System.out.println("Product: " + product);
System.out.println("A > B? " + isGreater);
```
*Try to compute the area of a rectangle.*

***

### Week 4: Control Flow (if, switch)

**Objective:** Use conditional statements to make decisions.

**Steps:**
- Write programs using `if`, `else if`, `else`.
- Use `switch` for multiple choices.

**Example:**  
```java
int marks = 75;
if (marks >= 90) {
    System.out.println("Grade: A");
} else if (marks >= 80) {
    System.out.println("Grade: B");
} else {
    System.out.println("Grade: C");
}

// Switch example
char choice = 'A';
switch(choice) {
    case 'A': System.out.println("Option A"); break;
    case 'B': System.out.println("Option B"); break;
    default: System.out.println("Invalid option");
}
```
*Modify to read user input for marks.*

***

### Week 5: Loops (for, while, do-while)

**Objective:** Master repetition in code.

**Steps:**
- Print numbers from 1 to 10 using different loops.
- Find prime numbers less than 100.

**Example:**  
```java
for (int i = 1; i  0) {
    System.out.println(n);
    n--;
}
```
*Implement a program to find the factorial of a number.*

***

### Week 6: Methods & Functions

**Objective:** Break code into reusable blocks.

**Steps:**
- Write methods for simple calculations.
- Call methods with parameters and return values.

**Example:**  
```java
public static int factorial(int n) {
    int result = 1;
    for(int i = 1; i  names = new ArrayList<>();
names.add("Alice");
names.add("Bob");
Map studentMap = new HashMap<>();
studentMap.put(1, "Alice");
studentMap.put(2, "Bob");
```
*Create a map that stores grades for students.*

***

### Week 12: File I/O

**Objective:** Read and write data from files.

**Steps:**
- Write a program that writes to a text file.
- Read data back from the file.

**Example:**  
```java
BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
writer.write("Hello, file!");
writer.close();

BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
System.out.println(reader.readLine());
reader.close();
```
*Log user input to a file and print previous entries.*

***

### Week 13: GUI Basics (Swing)

**Objective:** Build simple graphical user interface.

**Steps:**
- Create a window with buttons and text fields.

**Example:**  
```java
JFrame frame = new JFrame("Calculator");
JButton button = new JButton("Click Me");
frame.add(button);
frame.setSize(300, 200);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setVisible(true);
```
*Expand to a basic calculator with two text fields and a button.*

***

### Week 14: Threads & Concurrency

**Objective:** Run parallel tasks in Java.

**Steps:**
- Create a thread to print numbers.

**Example:**  
```java
class Counter extends Thread {
    public void run() {
        for(int i=0; i<5; i++) {
            System.out.println(i);
        }
    }
}
new Counter().start();
```
*Write threads that count up and down at the same time.*

***

### Week 15: Mini Project

**Objective:** Integrate all concepts in a project.

**Project Example: Library System**

- **Features:** Add, search, and borrow books; store data in files; use GUI.
- *Work in small teams to design and build the project.*

***

This structured plan ensures concept mastery through both explanation and hands-on practice. Adjust the pace to fit your needs, repeat exercises for deeper understanding, and continually build bigger projects as you advance. Good luck learning Java!