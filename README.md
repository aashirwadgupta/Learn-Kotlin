# Learn-Kotlin
A self-learning repository for programs made using Kotlin programming language

### JetBrains Hyperskill Portal - [Kotlin Core](https://hyperskill.org/tracks/18)
### [Computer Science - Kotlin](https://hyperskill.org/knowledge-map/209?track=18)


#### `val - var`

The difference between a `var` variable and a `val` variable is that 
- we cannot modify the value of a `val` variable once assigned.
- If a val variable is used before it is assigned a value, the compiler will also produce an error
- The value of a `val` variable can be reassigned to a `var` variable without any restrictions and 
- The value of a `var` variable can be changed as many times as needed
- A good practice is to use `val` variables by default.
- **NOTE:** 
  - It is always possible to change the internal state of a val variable: 
  - while it is prohibited to reassign the variable, its content can be modified in some other ways.
  - ```kotlin
    // list creation
    val myMutableList = mutableListOf(1, 2, 3, 4, 5)
    // adding a new element
    myMutableList.add(6)   // it works
    // printing the list
    println(myMutableList) // [1, 2, 3, 4, 5, 6]
    ```

#### Const variables

In Kotlin, there is also a const modifier, which is used before the `val` keyword to declare a compile-time constant.
The value of a const variable is known at compile time and won't be changed at runtime:

`const val MY_STRING = "This is a constant string"`

The following code will give you an error, since the value is unknown before the program execution 
and it is not a constant:

`const val MY_STRING = readln() // not a constant String!!!`

There are some restrictions on when the const modifier can be applied. 

- First, it can only be used with a `String` or a primitive type variable:
  - ```
    const val CONST_INT = 127
    const val CONST_DOUBLE = 3.14
    const val CONST_CHAR = 'c'
    const val CONST_STRING = "I am constant"
    const val CONST_ARRAY = arrayOf(1, 2, 3) // error: only primitives and strings are allowed
    ```
- Second, `const` variables need to be declared on top level, outside of any functions.

#### Naming conventions
- For `val` variables use the **camelCase** format. 
- `const` variables are compile-time constants. Since they represent static, unchangeable values, their names should be in **uppercase letters, with underscores separating words.**

#### Code Conventions

Let's learn a few code conventions for Kotlin:

1. Use 4 spaces for indentation instead of one tab. Depending on the operating system and different IDEs, one tab does not always correspond to four spaces; 
2. Omit semicolon ( ; ). Kotlin doesn't need that; 
3. Put opening curly brace at the end of the line; 
4. Put closing curly brace at the beginning of the next line.

#### Naming Variables
Naming rules
- Names are case-sensitive (`number` is not the same as `Number`); 
- Each name can include only letters, digits, and underscores; 
- A name cannot start with a digit; 
- A name cannot be a keyword (for example, `val`, `var`, `fun` are illegal).
- no whitespaces are allowed in a variable's name.
- If a variable name includes multiple words, put them in `lowerCamelCase`
- Do not start variables with an underscore `_`
- The name of a constant should be meaningful, and when naming constants, we use the `SCREAMING_SNAKE_CASE` style.