# Gaffe: Error Handling for Functional Interfaces

> **Gaffe** *noun*, /ɡaf/: an unintentional act or remark causing embarrassment to its originator; a blunder.<br>
> **Gaffe** *noun*, /ɡaf/: from French, literally ‘boat hook’

Gaffe is a library that simplifies exception handling for functional interfaces in Java libraries. 
It fixes the issue that none of the functional interfaces in the Java Runtime (or other libraries) by default is allowed to throw checked exceptions.

This library is a continuation and expansion of the project [Faux Pas](https://github.com/zalando/faux-pas), which introduced exception pattern.
For those not familiar, many functional interfaces to do not (rightfully) throw checked exceptions.
However, implementations often contain code that throw checked exceptions (such as I/O).
There are two solutions traditionally employed:
a try-catch clause is wrapped around the code, or a separate private function is created.
The former does not read or format well, especially when multiple exceptions need to be handled.
The latter is harder to understand because of the unnecessary redirection.
Both result in more code.

This library creates functional interfaces with exceptional signatures, using lombok to throw the original exception.
A static function is provided for each of these functions that can be used to wrap the exceptional lambda.

## Example
```java
interface Client {
    User read(final String name) throws IOException;
}

// Faux Pas
Function<String, User> readUser = throwingFunction(client::read);
readUser.apply("Bob"); // may throw IOException directly

// Gaffe
Function<String, User> readUser = *throwing*(client::read);
readUser.apply("Bob"); // may throw IOException directly
```

Gaffe offers several improvements over the original Faux Pas library:

1. Most of the code is automatically generated (see [JavaPoet](https://github.com/square/javapoet), [Classgraph](https://github.com/classgraph/classgraph)).
2. It will encompass libraries outside of the JDK.
3. It is low-cost to update existing new libraries.

**_Note_**: This library currently only handles checked exceptions for functional interfaces.