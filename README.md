# Multiple Choice Cheatsheet
## 1 Method Basics
```java
// Method structure
public returnType methodName(paramType paramName, ...) {
    // method body
    return value;
}
// Example
public int add(int x, int y) {
    return x + y;
}
```
- Method signature = method name + parameter list
- Return type vs void
---
## 2 Variable Scope
```java
// Class-level → instance variable (field) → accessible in all methods
// Method-level → local variable → accessible only inside that method/block
```
- Local variable dies after method ends
---
## 3 If / Else Basics
```java
if (condition) {
    // code
} else if (condition) {
    // code
} else {
    // code
}

// Short-circuit logic
if (x > 5 && y < 10) { }
if (x > 5 || y < 10) { }
```
---
## 4 For Loop Basics
```java
for (int i = 0; i < n; i++) {
    // code
}
```
- `i = 0; i < n; i++` → stops at n-1
- `i = 1; i <= n; i++` → includes n
---
## 5 While Loop Basics
```java
while (condition) {
    // code
}
```
- Runs **zero or more times** → if false at start, loop won’t run.
---
## 6 Do / While Loop
```java
do {
    // code
} while (condition);
```
- Always runs **at least once**.
---
## 7 Arrays
```java
int[] myArray = new int[10];
myArray[0] = 5;
System.out.println(myArray[0]);
```
- Array index starts at 0
- `myArray.length`
---
## 8 Modulus Operator %
```java
int x = 7 % 3;  // x == 1
```
- % gives remainder after division
---
## 9 Class Basics
```java
class MyClass {
    private int value;
    public MyClass(int value) { this.value = value; }
    public int getValue() { return value; }
}
```
- Constructor
- Getters / Setters
- `getValue()` returns the instance variable.
---
## 10 String Basics
```java
String s = "Hello";
s.length();
s.substring(0, 3);  // "Hel"
s.equals("Hello");  // true
```
- `==` vs `.equals()` → use `.equals()` for Strings
- `.length()` → returns length
- `.substring(start, end)` → end index is exclusive
---
## 11 Final Variables
```java
final int LIMIT = 100;
// Final = cannot be changed after initialisation.
```
## 12 Array References
```java
int[] arr1 = {1, 2, 3};
int[] arr2 = arr1;
arr1 == arr2 → true → same reference, not content comparison.
```
## 13 Multi-dimensional Arrays
```java
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
matrix[2][0] → 7
// First index = row, second index = column (both start at 0).
```
## 14 Abstract Methods
```java
abstract class MyClass {
    abstract void myMethod();  // no body
}
// Abstract method has no body, must be implemented in subclass.
```
## 15 Interfaces 
```java
interface MyInterface {
    void doSomething();
}
// Class that implements interface must provide definitions for all interface methods.
```
## 16 instanceof Operator
```java
if (obj instanceof MyClass) { }
// instanceof checks if object is of given type.
```
## 17 Exception Handling
```java
try {
    // code
} finally {
    // always runs
}
// If no catch block → exception is thrown → finally block still executes.
```
## Encapsulation
- Encapsulation = hiding internal details of a class (fields) and providing controlled access via public methods (getters/setters).
- Fields are usually private, accessed through public getters/setters.
## Method Overriding
- Subclass redefines a method from superclass with the same signature.
- Allows dynamic (runtime) polymorphism.
- @Override annotation is used to indicate overriding.
Example:
@Override
public void myMethod() {
    // new behavior
}
## Method Overloading
- Same method name, different parameter list (different number/types of parameters).
- Resolved at compile time.
## Inheritance
- Class can inherit from another class using extends.
- Subclass gets all public/protected members of superclass.
- Constructors are not inherited.
## Polymorphism
- Object can take many forms.
- Reference of superclass can refer to object of subclass.
- Actual method called is based on object type (not reference type).
Example:
Superclass ref = new Subclass();
ref.someMethod(); // Calls overridden method in Subclass if exists.
## Static Fields & Methods
- static fields/methods belong to the class, not instances.
- Access via ClassName.methodName() or ClassName.fieldName.
- Static methods cannot access instance fields/methods directly (no this).
## Final Class/Method
- final class → cannot be extended.
- final method → cannot be overridden.
Example:
final class MyClass { }
final void myMethod() { }
## Access Modifiers
- public → accessible everywhere.
- protected → accessible in same package + subclasses.
- default (no modifier) → accessible in same package.
- private → accessible only within the class.
## Common MCQ Traps (OO Concepts)
- Private fields require getters/setters for access → encapsulation.
- Overridden methods must match method signature exactly.
- Overloading is compile time, overriding is runtime.
- Static methods belong to class, not object.
- super vs this → super for parent, this for current object.
- Polymorphism → method that runs depends on object type, not reference type.
## Switch Statement
switch (variable) {
    case VALUE1:
        // code;
        break;
    case VALUE2:
        // code;
        break;
    default:
        // code if no case matches;
}
- switch compares variable to case values.
- case labels must be constant values (no ranges).
- break prevents fall-through.
- default is optional, runs if no case matches.
## public static void main(String[] args)
- public → visible to all other classes (any class can call this method).
- static → belongs to the class, not an instance (can run without creating an object of the class).
- void → method does not return a value.
- main → name of the method that is the entry point of any Java application.
- String[] args → array of Strings (command-line arguments).
## public
- Access modifier.
- Public members (fields, methods, classes) can be accessed from anywhere.
## private
- Access modifier.
- Private members can only be accessed within the class they are defined in (encapsulation).
## protected
- Access modifier.
- Protected members can be accessed within the same package and by subclasses.
## static
- Belongs to the class, not instances.
- Shared across all objects of the class.
- Static methods cannot use this or access instance variables directly.
## void
- Return type indicating the method does not return a value.
## final
- final variable → cannot be changed after assignment.
- final method → cannot be overridden.
- final class → cannot be extended (no subclasses).
## abstract
- abstract class → cannot be instantiated, can contain abstract and non-abstract methods.
- abstract method → declared without implementation, must be implemented by subclasses.
## this
- Refers to the current object instance.
- Used to access instance variables/methods, or pass the current object as parameter.
## super
- Refers to superclass version of method or constructor.
- Used to call superclass constructor or superclass method.
## 10-Second MCQ Mental Checklist
- Modulus % → remainder, not division result.
- continue → skips loop body → does not run count++.
- Array.length → number of elements, not max index.
- String == → compares reference; use .equals() to compare content.
- Switch → fall-through by omitting break, not using if.
- Overloading → same method name, different params → all versions count.
- Overriding → actual method run depends on object type, not reference type.
- Protected → accessible in package + subclasses outside package.
- Break → exits loop immediately → check where break occurs.
- 2D array → matrix[row][column], both start at 0.