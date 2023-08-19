# CS61b

**This is a self-study class notes for CS61b Spring 2019 from Hug.**

Starting Date for this course: July 23 2023

***All lecture Material are from: [CS61b_Hug](https://joshhug.gitbooks.io/hug61b/content/chap1/chap12.html)***


# Intro to Java 

## 1.1 Essential

### HelloWorld.java
1. All code in Java must be part of a class.
2. We delimit the beginning and end of segments of
    code using { and }
3. All statements in Java must end in a semi-colon.
4. For code to run we need public static void main (String[] args){}

### helloNumber.java
1. Before Java variables can be used. They must be declared.
2. Java variables must have a specific type.
3. Java variable types can never change.
4. Types are verified before the code even runs!!


### Large.java
1. Function must be declared as part of a class in Java. A function that is part of a class is called a "method". So in Java, all functions are methods.
2. To define a function in Java, we use "public static" We will see alternate ways of defining function later.
3. All parameters of a function must have a declared type, and the return value of the function must have a declared type.
4. function in java return only one value!
 

## 1.2 Object

# Static vs. Non-static
1. Static methods are invoked using the class name, e.g. Dog.makeNoise();
2. Instance methods are invoked using an instance name, e.g. Chihuahua.makeNoise();
3. Static methods can't access "my" instance variables, because there is no "me".
4. Static methods must access instance variables via a specific instance, e.g. d1 in Dog.java


# 4. Inheritance and Interfaces

## Overloading
Java allows multiple methods with same name, but different parameters.

