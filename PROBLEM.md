## Problem Statement: Super class method computes the product of two integers and Subclass overrides the method to compute the power of two integers 

This exercise should be completed using Test Driven Development Technique

  - Write Test classes in TDD approach 
  - Functionality of methods should be completed, such that all the test cases pass 
  - Some requirements/hints are mentioned below


    In this problem, Super class method computes the product of two integers and Subclass overrides the method to compute the power of two integers

      - Should return product result when super type method is called using lambda expression created using method reference
      - Should return power result when sub type method is called using lambda expression created using method reference
   ```
  Class CalculatorUtility must be implemented using TDD for the following method
        
        + compute(): double
  
  Class NewCalculatorUtility must be implemented using TDD for the following methods

    - This method creates a lambda expression which uses compute method of the sub class NewCalculatorUtility 
      Syntax used for method reference : this::instanceMethod

        + getPowerResult(): double

    - This method creates a lambda expression which uses compute method of the super class CalculatorUtility
      Syntax used for method reference : ClassName.super::instanceMethod  
  
        + getProductResult(): double

        @Override
             + compute(): double
                return the power of given two integers

```
**Note: use BiFunction functional interface, Method reference using super keyword**  
   
## Instructions
- Avoid printing unnecessary values other than expected output as given in sample
- Take care of whitespace/trailing whitespace
- Do not change the provided class/method names unless instructed
- Follow best practices while coding
