# 1.6.2.2: Java Generic Methods with Varargs Exercise

## Description

This project demonstrates the use of generic methods in Java with variable-length arguments (varargs). It includes two classes: `Person` and `GenericMethod`. The `GenericMethod` class contains a method that accepts a variable number of arguments of different types.

## Classes

### Person

The `Person` class represents a person with the following attributes:
- `name` (first name)
- `surename` (last name)
- `age` (age)

#### Constructor
- `Persona(String name, String surename, int age)`

#### Methods
- `String toString()`: Returns a string representation of the `Person` object.

### GenericMethods

The `GenericMethods` class contains:
- `public void printGenericArgs(T ... args)`: 
  - Accepts a variable number of arguments of generic type `T`.
  - Prints the received arguments to the console.

## Main Class

The `Main` class contains the `main` method:
1. Creates an instance of the `Person` class.
2. Calls the `metodeGeneric` method with different types of parameters.

## How to Run

Copy this repositori: https://github.com/ToniR90/1.6-Generics-Nivell2.2.git

## Output

The program prints the received arguments, showcasing the use of generic and non-generic parameters. 
