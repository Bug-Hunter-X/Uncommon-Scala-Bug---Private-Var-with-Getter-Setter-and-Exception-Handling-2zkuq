# Uncommon Scala Bug: Private Var with Getter/Setter and Exception Handling

This repository demonstrates a subtle bug that can occur in Scala when using a private variable with a public getter and setter.  While seemingly harmless, this approach can create problems if the setter logic isn't designed to handle all potential scenarios. In this example, the age setter is designed to prevent negative values; however, improper handling of exceptions can lead to unexpected behavior. 

## Bug Description
The `MyClass` attempts to enforce a constraint (age must be non-negative).  While this is a common use case, the exception thrown during an invalid assignment might not always be handled properly or its implication fully considered.

## Solution
The solution demonstrates how to improve the exception handling for better control over error situations.