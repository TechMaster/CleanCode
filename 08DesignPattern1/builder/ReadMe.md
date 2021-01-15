## Lesson 08 - Design Pattern 01
### Builder Pattern demo

#### Demo 1: House

- [Builder Pattern - House before 1](src/main/java/house/before1): Idea 1 - Create subclasses

- [Builder Pattern - House before 2](src/main/java/house/before2): Idea 2 - Create all arguments constructors

- [Builder Pattern - House before 3](src/main/java/house/before3): Idea 3 - Create a constructor corresponding to each case

- [Builder Pattern - House after 1](src/main/java/house/after1): Solution 1 - Create `Builder` class into `House` class and initialize `House` object into `build()` method of `Builder` class

- [Builder Pattern - House after 2](src/main/java/house/after2): Solution 2 - Create `Builder` class into `House` class and initialize `House` object into a private constructor of `House` class with `Builder` object as a parameter

- [Builder Pattern - House after 3](src/main/java/house/after3): Solution 3 - Use `@Builder` of Lombok

- [Builder Pattern - House after 4](src/main/java/house/after4): Solution 4 - Create separated `Builder` class

#### Demo 2: Address

- [Builder Pattern - Address](src/main/java/address)
