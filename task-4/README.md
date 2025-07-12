# Looping

A very important reason for why computers are useful is that they can repeat the same operation time and
time again without error or complaint. If I asked you to count up to 10 000, you might easily get bored or skip a number,
but a computer will do so flawlessly every time. We call this concept _"iteration"_ or _"looping"_, and 
this week we will be looking at a couple of different ways of accomplishing this in Java.

### 💀 Deadline
<!-- TODO: Set correct date -->
This work should be completed before the exercise on **Fri 30th September**.

### 👩‍🏫 Instructions
For instructions on how to do and submit the assignment, please see the
[assignments section of the course instructions](https://gits-15.sys.kth.se/inda-22/course-instructions#assignments).

### 📝 Preparation
You must read and answer the questions in the OLI material.

- Read [Module 6: Iteration](https://kth.oli.cmu.edu/jcourse/workbook/activity/page?context=f5e5a833ac1f088806a6236c39b5d8fc).
- Note, you only have to read about `while` and for `loops`, we cover iterators later!
- If you have not done so, goto https://kth.oli.cmu.edu/, signup and register for the course key `dd1337-ht22`

### ✅ Learning Goals
This week's learning goals include:

* `boolean` expressions and operators
* `while` loops
* `for` loops 
* Using JShell to test your Java program
* Function overloading


### 🚨 Troubleshooting Guide
If you have any questions or problems, follow this procedure: <br/>

1. Look at this week's [posted issues](https://gits-15.sys.kth.se/inda-22/help/issues). Are other students asking about your problem?
2. If not, post a question yourself by creating a [New Issue](https://gits-15.sys.kth.se/inda-22/help/issues/new). Add a descriptive title, beginning with "Task *x*: *summary of problem here*"
3. Ask a TA in person during the [weekly lab](https://queue.csc.kth.se/Queue/INDA). Check your schedule to see when the next lab is.

We encourage you to discuss with your course friends, but **do not share answers**!

### 🏛 Assignment

Before we look at how to write loops, we must be able to specify when the program should stop repeating the same thing over and over again. 
This is usually when a certain condition is met, such as when we have performed _n_ loops. In order to specify this
we use _boolean expressions_, which you have already encountered when you wrote `if` statements in the previous task.
The next couple of exercises will help you understand more complex boolean expressions.

<details>
<summary> 📚 Boolean values, expressions and operators </summary>
<! -- requires a blank space -->

A [boolean value](https://en.wikipedia.org/wiki/Boolean_data_type) is a value that is either true or false. Similiarly, a [boolean expression](https://en.wikipedia.org/wiki/Boolean_expression) is a statement that when evaluated results in either true or false. You might claim that "The capital of Mozambique is Maputo", and this expression is either true or false, either it is the capital or it isn't. Similarly, you might consider a mathematical expression such as _2 = 5_ as either pure nonsense, or as a boolean expression that evaluates to false.

In Java, `boolean` is one of the 8 [primitive types](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html), and can have the value `true` or `false` such as in
```java
theCapitalOfMozambiqueIsMaputo = true;
twoEqualsFive = false;
```

Three fundamental boolean operators are the ["and"](https://en.wikipedia.org/wiki/Logical_conjunction), ["or"](https://en.wikipedia.org/wiki/Logical_disjunction) and ["not"](https://en.wikipedia.org/wiki/Negation) operators. In Java we write `&&` for "and", `||` for "or" and `!` for "not".

Just like with ordinary arithmetic operators, we can use parentheses to change the order in which the operations are evaluated. In the same way that _3 - (2 - 3)_ does not evaluate to the same value as  _(3 - 2) - 3_, the boolean expression `true || (true && false)` will evaluate to `true`, while `(true || true) && false` will evaluate to `false`.

</details>

#### Exercise 4.1.1 (docs) -- Boolean expressions

In [`docs/README.md`](docs/README.md) you will find a copy of the table below. Fill in the boolean value that each expression evaluates to:

| Boolean expression | Value   |
|--------------------|---------|
| `2 == 5`           | `false` |
| `2 > 5`            |         |
| `11 == 11`         |         |
| `7 <= 9`           |         |
| `42 >= 7`          |         |
| `false == true`    |         |

#### Exercise 4.1.2 (docs) -- Boolean operators
In [`docs/README.md`](docs/README.md) you will find a copy of the table below. Fill in the boolean value that each expression evaluates to:

| Boolean expression     | Value |
|------------------------|-------|
| `2 == 3 && 2 == 2`     |       |
| `2 == 3 \|\| 2 == 2`   |       |
| `!true`                |       |
| `!false`               |       |

#### Exercise 4.1.3 (docs) -- Combining boolean operators
In [`docs/README.md`](docs/README.md) you will find a copy of the table below. Fill in the boolean value that each expression evaluates to:

| Boolean expression             | Value  |
|--------------------------------|--------|
| `true \|\| (true && false)`    | `true` |
| `false \|\| (false \|\| true)` |        |
| `!(false && true) == true`     |        |
| `!true && false`               |        |
| `!(true && false)`             |        |

> **Assistant's tip:** If you have a Java expression that you want to evaluate,
> but you don't want two write a whole new class with main method and all,
> consider using [JShell](https://docs.oracle.com/javase/9/jshell/introduction-jshell.htm).
> JShell enables you to enter a java expression such as `2 == 5` and immediately
> get the response that this evaluates to `false`.

#### Exercise 4.2.1 -- The while-loop

Begin this exercise by creating a file called `Loops.java` in your `src` folder. Add a method with the header
```java
public void `multiplesOfSeven()`
```
This method should use a while-loop to print all the multiples of seven between 0 and 100.

<details>
<summary> 📚 The while loop </summary>
<! -- requires a blank space -->

The [while-loop](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/while.html) is the most basic form of 
loop in Java, and every other form of loop can be seen as a variation of the while-loop.

As the name suggests, a while loop just keeps doing something _while_ some expression is true, so the loop
```java
int count = 0;
while (count < 5) {
    count += 1;
}
```
will keep adding `1` to the variable `count` while `count` is less then `5` (what will be the value of `count` when the loop ends?).

</details>

#### Exercise 4.2.2 -- Summing with a while loop
Add a method with the header
```java
public int sumUpTo(int max)
```
to your `Loops.java` file. This method should use a while loop to sum all integers between `0` and `max` and return this value. The upper bound should be _inclusive_, so that `sumUpTo(3)` should return `6` (_0 + 1 + 2 + 3_). If `max` is less than zero, the value `0` should be returned.

#### Exercise 4.2.3 -- For-loops and summing a range

Add a new method to your `Loops.java` file. This method should have the header
```java
public int sumBetween(int min, int max)
```
It should and use a for-loop to calculate and return the sum of all integers between `min` and `max` (inclusive). As an example, `sumBetween(10, 12)` should return `33` (_10 + 11 + 12_). If `min` is greater than `max`, the value `0` should be returned. If `min == max`, the value of `min` (or `max`) should be returned.

<details>
<summary> 📚 The for loop </summary>
<! -- requires a blank space -->

The while loop is very useful, but another type of loop that is even more common is the [for-loop](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/for.html). In addition to a boolean expression that tells the loop when to stop, the for-loop also let's you declare an _index variable_ and describe how this variable should change after each iteration. This means that instead of the while loop
```java
int i = 0;
while (i < 10) {
    System.out.println(i);
    i += 1;
}
```
you can get the same result using the more compact for-loop form:
```java
for (int i = 0; i += 1; i < 10) {
    System.out.println(i);
}
```
</details>


#### Exercise 4.2.4 -- Loops and summation notation
The summation, represented by the capital Greek letter sigma (Σ), is the mathematician's shorthand for iteration, 
and can be implemented using for (or while) loops. The table below lists a few summations alongside Java method headers. 
You have already implemented the `sumUpTo` and `sumBetween` methods. Create two new methods called `sumSquares` 
and `sumReciprocals` based on the summations in the table.

| Method header                             | Summation                                               |
|-------------------------------------------|---------------------------------------------------------|
| `public int sumUpTo(int max)`             | <img src='img/summation-sum-up-to.png' width=80>        |
| `public int sumBetween(int min, int max)` | <img src='img/summation-sum-between.png' width=80>      |
| `public int sumSquares(int max)`          | <img src='img/summation-sum-squares.png' width=80>      |
| `public double sumReciprocals(int max)`   | <img src='img/summation-sum-reciprocals.png' width=80>  | 

#### Exercise 4.3.1 -- A basic clock
Now it's time to put what we've learned together and create a simple Java class representing a 12-hour clock. Start by creating a new class called `Clock.java` in your [`src`](/src) folder. You will need to keep track of _hours_, _minutes_ and _seconds_, so add fields for these values. Think about what the best data type for these fields is, and whether they should be `public` or `private`. Make sure to add `public` getter methods for all your fields.

> **Assistant's tip:** If you're not completely sure that a field should be `public`, it's a good idea to keep it `private`. You can always change it later if you need to.

#### Exercise 4.3.2 -- Validating input
Add three new `public` setter-methods to your `Clock.java` class. These should be called `setHours`, `setMinutes` and `setSeconds`, and each should take an `int` as a parameter. As opposed to setter methods that you may have written previously, it is important that you _validate_ the input to these methods. This simply means that you should ensure that the value you are trying to set is sensible (so between 1 and 12 for the hours, 0 and 59 for the minutes and seconds). If the method is called with an incorrect input value, you shouldn't change the time on the clock at all, so if the `hours` is currently set to `11`, and a user calls the method `setHours(-3)` the value of `hours` should still be set to `11`.

#### Exercise 4.3.3 -- Constructing constructors
Add two constructors to your `Clock.java` class. The first one should have the header
```java
public Clock()
```
and simply set the `hours` to `12` and `minutes` and `seconds` to `0`.
The second constructor should have the header
```java
public Clock(int hours, int minutes, int seconds)
```
this constructor should set the time to the values provided by the user, but only if they are valid. First set the fields as in the first constructor, then use the setter methods that you created in the previous task to update the fields with the parameters provided to the constructor. If the user tries to create a `Clock` with the call
```java
Clock clock = new Clock(51, 1, 23);
```
the result should be a clock with the time set to `12:01:23`, since the hours does not have a valid value.

> **Assistant's note:** How can two methods have the same name? 🤔 The concept is called [function overloading](https://en.wikipedia.org/wiki/Function_overloading) (or *Ad hoc polymorphism*). Since the methods have different *number of input parameters* (or *arity*), it is fine to give them the same name. It is also possible to have the same number of parameters, but of different types, such as `add(int n)` and `add(double n)`.

#### Exercise 4.3.4 -- Presenting the time
Now that your clock can keep track of the time, it's time to create a method to display this time. By default, every Java object has a `toString` method that creates a `String` representing the object that can be printed to the terminal. However, the current `toString` method for your `Clock` class is not very informative. You can see this by  navigating to the folder where your `Clock.java` file is and typing the following in your terminal:
```bash
jshell Clock.java
Clock myClock = new Clock();
myClock.toString();
```
This tells JShell to load your `Clock` class, create a new `Clock` object called `myClock` and call the `toString` method on `myClock`. You should get an output of something like `"Clock@312b1dae"`. This string tells you that `myClock` is a `Clock` object and the stuff after the `@` will be different for every `Clock` object.

Let's try to improve the `toString` method of the `Clock` class. Add a new method with the header
 ```java
 public String toString()
 ```
 to `Clock.java`. This method should return a string describing the current clock time with the format `HH:MM:SS`, that is hours, minutes and seconds separated by `:` and padded with zeroes so that there are always two digits for each time unit. This means that five minutes and seven seconds past one o'clock should be presented as `01:05:07` and _not_ `1:5:7`. Test your method using `JShell` to make sure you get the correct result.

> **Assistant's tip:** There are many different ways of solving this exercise. The most straight forward way is to use several different if-statements, but if you want to try something more advanced you can read about how to use the [`String.format` method](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/String.html#format(java.lang.String,java.lang.Object...)). The syntax used for formatting strings can be a bit complex, but very useful once you get the hang of it.

#### Exercise 4.3.5 -- Making it tick
A clock is not much use if it doesn't tick, so it's time to add a `tick`-method to your `Clock.java` file. This method should have the header
```java
public void tick()
```
When called, the method should increment the seconds by one, and increment the minutes and seconds as needed. If the time is `02:13:59` and `tick` is called, the time should go to `02:14:00`. The convention for a 12 hour clock is that the minutes and seconds go from `00` to `59`, but the hours go from `01` to `12`, so make sure to take this into consideration.

> **Assistant's tip:** You could solve this exercise using if statements, but your code will be much simpler if you use the remainder (`%`) operator. This binary operator gives you the remainder of the first argument after integer division with the second argument, so `15 % 4` gives you `3`, since _15 = 4*3 + 3_. Similarly, `16 % 4` gives you `0`, since _16_ is divisible by _4_.

#### Exercise 4.3.6 -- Tick tock
Let's add a final method to the `Clock` class. This method should have the header
```java
public void tick(int seconds)
```
and should use a loop (you can choose if you want to use for loop or a while loop) to call `tick()` repeatedly. As an example, if the time is currently `08:37:14` and the call `tick(57)` is made, the time should go to `08:38:11`.
Add a call to `System.out.println` that prints the current time after each time the seconds are incremented.

> **Assistant's note:** this is yet another example of _method (or function) overloading_, and you will see many more as you continue your Java adventures. 

### 🐞 Bugs and errors?
If you find any inconsistencies or errors in this exercise, please open a [New Issue](https://gits-15.sys.kth.se/inda-22/help/issues/new) with the title "Task *x* Error: *summary of error here*". Found bugs will be rewarded by mentions in the acknowledgment section.

### 🙏 Acknowledgment
This task was designed by                <br>
[Linus Östlund](mailto:linusost@kth.se)  <br>
[Sofia Bobadilla](mailto:sofbob@kth.se)  <br>
[Gabriel Skoglund](mailto:gabsko@kth.se) <br>
[Arvid Siberov](mailto:asiberov@kth.se)  <br>