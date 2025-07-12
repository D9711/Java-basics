# Collections

This week introdocudes Java collections - `Array` and `ArrayList` - as a way of organising groups of objects.

### 💀 Deadline
This work should be completed before the exercise on **Friday 6th October**.

### 👩‍🏫 Instructions
For instructions on how to do and submit the assignment, please see the
[assignments section of the course instructions](https://gits-15.sys.kth.se/inda-22/course-instructions#assignments).

### 📝 Preperation

- Read [Module 5: Grouping Objects](https://kth.oli.cmu.edu/jcourse/webui/syllabus/module.do?context=f5e5a822ac1f08882389669893d2a3d7).
- If you have not done so, goto https://kth.oli.cmu.edu/, signup and register for the course key `dd1337-ht22`

### ✅ Learning Goals
This week's learning goals include:

* Working with `Arrays`
* Understanding the `static` keyword
* Working with `ArrayLists`
* Combining loops and collections

### 🚨 Troubleshooting Guide
If you have any questions or problems, follow this procedure: <br/>

1. Look at this week's [posted issues](https://gits-15.sys.kth.se/inda-22/help/issues). Are other students asking about your problem?
2. If not, post a question yourself by creating a [New Issue](https://gits-15.sys.kth.se/inda-22/help/issues/new). Add a descriptive title, beginning with "Task *x*: *summary of problem here*"
3. Ask a TA in person during the [weekly lab](https://queue.csc.kth.se/Queue/INDA). Check your schedule to see when the next lab is.

We encourage you to discuss with your course friends, but **do not share answers**!

### 🏛 Assignment
Most programming languages have several _data structures_ as a part of the language. These allow the programmer to store and operate on data in various ways, with different characteristics and strengths. In Java, the most simple data structure is the *array* (svensk översättning: *samling*), as explained in [Oracle's Offical Java Tutorial](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html).

<details>
  <summary> 📚 A summary of Java's arrays </summary>

 The following code shows various ways to create arrays. Most programming languages are *0-indexed*, so in order to access the first element of an array, you have to start from zero:

```
array: | a | b | c | d |
index:   0   1   2   3
```

Arrays have a special syntax in Java:

```java
public class Arrays {
   public static void main(String[] args) {
    // Create an array called 'array'
    int[] array;

    // Allocate memory for 4 integers
    array = new int[4];

    // Assign values by accesing their index
    array[0] = 1; // This is the first element
    array[1] = 3; // This is the second element
    array[2] = 3; // and so forth
    array[3] = 7;
   }
}
```

To help remember this fact, think of the index as how many elements you skip over. That is, `a[0]` gives us the first element in `a`, since we skip over 0 elements.
Java allows you to create arrays using curly brackets (`{}`) too:

```java
public class Arrays {
  public static void main(String[] args){
    // Create an array and assign four values
    int[] array = {0, 1, 2, 3};
  }
}
```

The `for` loop is useful in combination with arrays:

```java
public class Arrays {
  public static void main(String[] args){
    // Create an array and assign five strings
    String[] array = {"Never", "Gonna", "Give", "You", "Up"};

    // Print each element
    for(int i = 0; i < array.length; i++){
      System.out.println(array[i]);
    }
  }
}
```

Methods can take arrays as parameters, and have arrays as return types:

```java
public class Arrays {

  /**
   * A method to calculate the sum of an integer array
   */
  public double sum(int[] input){
    double sum = 0;
    for(int i = 0; i < input.length; i++){
      sum += input[i];
    }
    return sum;
  }

  /**
   * Returns an array with three zeros, as an example of methods returning arrays.
   */
  public int[] zeroArray() {
    // Create an array with space for three elements.
    int[] zeroArray = new int[3];
    // Fill it with zeros
    zeroArray[0] = 0;
    zeroArray[1] = 0;
    zeroArray[2] = 0;
    // Return it
    return zeroArray;
  }
}
```
---
</details>

<details>
<summary> 📚 The foreach loop</summary>

Java have a special loop called the `foreach` loop. It is also known as *the enhanced for loop*.
The `foreach` loop offers you a convinient way to itereate each member of
a collection, in order:

```java
for (TYPE name : COLLECTION) {
    // Do something with object 'name'
}
```
The loop reads as _"for each object *name* of type *TYPE* in *COLLECTION*..."_. 
Assuming that `myArray` is an array of `Double`, the above example can be rewritten as:

```java
for (Double element : myArray) { // For each "element" of type "double" in "myArray"...
    doSomething(element);
}
```

The the `COLLECTION` may be an array, but could also be some other Java class that supports iteration,
such as `ArrayList`, which you will learn more about later in this task. 
You can read more about the different types of for-statements in the official
[Oracle tutorial](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/for.html).
---
</details>

<details>
  <summary> 📚 The static keyword</summary>

You will notice that all method headers that you are asked to add to your
`Arrays.java` file have the `static` keyword between the access modifier
and the return type. You may also have seen this keyword in the header of the
main method and wondered what it means. `static` means that a field or
method is particular to the _class_ rather than any specific _object_
(remember that a _class_ can be used as a "template" to create many
different _objects_). For instance, if you created a `Clock` class,
and added the field `private static int hours`, this value would be
shared between every `Clock` object you create, so that they all are
set to the same hour.

A `static` method is a method that will behave the same for every
object of a class. This means that instead of creating an object we can
call the method directly on the class, so instead of writing
```java
Arrays arraysInstance = new Arrays();
int averageOfSomeArray = arraysInstance.average(someArray);
```
we can write
```java
int averageOfSomeArray = Arrays.average(someArray);
```
You may have already seen this way of calling a method when using methods
from the `Math` library. A `static` method can _only_ use fields and
call other method that are also `static`, but makes your code simpler
and more efficient. Since all the methods we will be adding to the
`Arrays` class don't need to access any fields at all it makes sense
to keep them `static`.

You can read more about the `static` keyword in the
[Official Java Tutorial](https://docs.oracle.com/javase/tutorial/java/javaOO/classvars.html).

---
</details>

#### Exercise 5.0 -- The Arrays class
Begin by creating a new class where you will enter your solutions for the coming exercises. 
This class should be called `Arrays` and be in a file called `Arrays.java` in the [src](src) folder.

#### Exercise 5.1 -- Average of an array

Write a method that returns the average of an array with the following header:

```java
public static int average(int[] array)
```

> **Assistant's Note:** Remember that integer division *rounds down*, so the average of `{1, 2, 3, 4}` is *2*.

#### Exercise 5.2 -- Average of an array... again?
Write another method that return the average of an array, this time with the header:

```java
public static double average(double[] array)
```

> **Assistant's note:** Once again we use [function overloading](https://en.wikipedia.org/wiki/Function_overloading). Since the parameters differ between the methods, it is fine for them to have the same name. In this case, the parameters differ in their type -- `int[]` vs. `double[]` -- so it is okay for them to share the same name.


#### Exercise 5.3 -- Smallest element of an array
Write a method that returns the smallest element of an array. It must have the following header:

```java
public static int smallestElement(int[] array)
```

> **Assistant's note:** By _smallest_, we mean the one closest to -∞.

#### Exercise 5.4 -- Reverse
Write a method that takes an `int` array and returns a copy of this 
array with the elements in _reverse order_. It should have the following header:
```java
public static int[] reverse(int[] array)
```

Here is an example of how it should work:
```java
int[] array = {1, 2, 3};
int[] reversed = reverse(array);
// The reversed array should be {3, 2, 1}
```
Make sure to not modify the original array. Your method should 
create a new array.

#### Exercise 5.5 -- Return all even numbers in an array
Create a method that returns all *even* numbers in an array. It should have the following header:

```java
public static int[] evenNumbers(int[] array)
```
This method should _not_ modify the original array that's provided as a parameter. It should simply create a new 
array containing all the even numbers (in the same order) from the original array.

> **Assistant's note:** One approach is to use two `for` loops - first, one to count the number of even numbers in order to create a new array with the right size, and then one loop to copy all even numbers. A number *n* is even if *n ≡ 0 (mod 2)*. You should use the [remainder operator](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/op1.html) for this purpose.

### Set Theory

Arrays are very useful for storing a specific number of elements of the same type,
but what if you don't know ahead of time how many objects you need to store?
In order to handle this, the Java standard library includes the class
[`ArrayList`](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/ArrayList.html)
which is quite similar to an array, but lets you grow the number of
elements stored as needed.

 Your task at hand is now to model mathematical sets with `ArrayLists`. A set is defined as having *unique* elements. For example, *{1, 2, 2, 3}* is **not** a set, whereas *{1, 2, 3}* is a set. It is up to your implementations to guarantee this assumption. In this assignment we refer to the *universe* by the following definition:

<img src="images/universe.png" alt="universe" width="200"/>


That is, the universe is the set of all integers from 0 to 99.

> **Assistant's note:** In programming, there are other data structures that should be used in place of `ArrayLists` when modelling sets, for example [HashSets](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/HashSet.html). But for the purpose of this exercise, you have to *suspend reality*.


<details>
  <summary> 📚 Algebra of sets </summary>

  The wikipedia article on [Algebra of sets](https://en.wikipedia.org/wiki/Algebra_of_sets) can serve as a reminder on the fundamental properties of set algebra. This is also covered in SF1671, which you have in parallell to DD1337. To pass the assignment, make sure you test the following cases:

<img src="images/algebra-of-sets.png" alt="algebra of sets" width="150"/>


  The *cardinality* of a set is the number of element it contains.

<img src="images/cardinality-of-union.png" alt="The cardinality of a union of two sets" width="400"/>

---
</details>

<details>
<summary> 📚 A summary of Java's ArrayLists</summary>

In order to use an `ArrayList` you must first _include_ it in your class file.
You do this by adding the line
```java
import java.util.ArrayList;
```
at the top of the file. This tells the Java compiler to look for the
class called `ArrayList` in the `util` (utilities) package.

Creating an `ArrayList` looks slightly different from creating an array.
To create an `ArrayList` containing `Integer`s, the syntax is
```java
ArrayList<Integer> integerList = new ArrayList<>();
```
`ArrayList` is a class like any other, so we use the
`new ClassName();` syntax. However, you might be wondering what is going
on with the `<>` symbols. The `<Integer>` after
the class name tells Java that this `ArrayList` will contain `Integer`
objects, just like you could create an array of type `Integer[]`.
The word in `<>` could of course be the name of any class, but _not_
a generic type (such as `int`). If you try something like
```
ArrayList<int> intList = new ArrayList<>();
```
you will get a compile error (try it!). This concept of specifying that a class 
will contain or otherwise use a particular type of object is called `generic` types in Java.
You don't need to understand it fully right now, but you can read more about it in the
[Oracle Java tutorial](https://docs.oracle.com/javase/tutorial/java/generics/types.html).

You can add new elements to your `ArrayList` with the `add` method,
and change the value of an element with the `set` method:
```java
integerList.add(5);
integerList.set(0, 11); // First element will now be 11
```

You can get elements at a specific index with the `get` method:
```java
int firstValue = integerList.get(0);
```
note that `ArrayLists` are 0-indexed just like arrays.
You might remember that `integerList` contains `Integer`s, but
in this example we store the return value as an `int`. In general,
Java can automatically convert between
[primitive types](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html)
and the corresponding [wrapper classes](https://en.wikipedia.org/wiki/Primitive_wrapper_class_in_Java).

You can remove an object from your `ArrayList` using the `remove` method.
You can also remove _all_ the elements with the `clear` method.
```java
integerList.remove(0); // Will remove the first element
integerList.clear(); // Will remove everything that's left in the list
```

You can check how many elements are in a `ArrayList` using the `size` method.
This can be useful when you want to use a for-loop to iterate over your list.
```java
// Increase the value of every element by 1:
for (int i = 0; i < integerList.size(); i++) {
    int currentElement = integerList.get(i);
    currentElement += 1;
    integerList.set(i, currentElement);
}
```
----
</details>

<details>
  <summary> 📚 Importing libraries and API </summary>

The Java SDK includes a vast amount of *libraries*, which are predefined classes you may use in your programs. Each library has an *Application Programming Interface* (API). The API is all the public methods in the class that you, as an outside programmer, can use to interact with the library. If you want to use an `ArrayList` in your program, you must first *import* the library:

  ```java
  import java.util.ArrayList; // Use the keyword 'import' to be able to use the ArrayList class
  
  public class Example {
    // Add some code using an ArrayList here
  }
  ```

The API of `ArrayList` consists of all the methods it contains that are available for you to use.
For example, `add()`, `get()`, and `isEmpty()`, are all a part of the ArrayList API. The rest of the API can be found in Oracle's [ArrayList documentation](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/ArrayList.html). The fastest way to find the documentation of any Java Class is to use Google Search: "<*library*> documentation", although they are all listed [here](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/module-summary.html).

---
</details>

#### Exercise 5.6 -- `SetTheory.java` and `generateSet`
Begin by creating a file called `SetTheory.java` in the [`src`](/src) folder. 
All remaining methods for this task should be placed in this file.

Create a method with the header
```java
public static ArrayList<Integer> generateSet(int min, int max)
```

This method should return an `ArrayList` with all elements between `[min, max)` (including min and excluding max). 
Remember that a *set* consists only of *unique* elements! If `min ≥ max`, return an empty list. 
If `max > 100`, you should create a set containing all integers between `min` and 99.
Similarly, if `min < 0` return the set containing values between `0` and `max`.
We provide you with an example of a main method that could be added to `SetTheory.java`
and help you make sure that your code works as specified. Alternatively you can
use [JShell](https://docs.oracle.com/javase/9/jshell/introduction-jshell.htm)
to run your code without a main method.

<details>
  <summary> 🛠 Example main method</summary>
  
```Java
// Example call
public static void main(String[] args){
  // call the "generateSet" method on the SetTheory object
  ArrayList<Integer> exampleSet = generateSet(10, 15);

  // if implemented correctly, "exampleSet" should be an ArrayList of the five integers between `[10, 14]`
  // [10, 11, 12, 13, 14]
  System.out.println(exampleSet);
}
```
</details>


#### Exercise 5.7 -- union
Implement a method called `union` that finds the union of two sets. It must have the following header:

```java
  public static ArrayList<Integer> union(ArrayList<Integer> a, ArrayList<Integer> b)
```

It should return a new `ArrayList` containing the elements from the union of lists `a` and `b`. 
Use your implementation of `generateSet` to test your solution. 
Make sure that the returned `ArrayList` is a *set*, that is, it only contains *unique* elements.

> **Assistant's note:** Consider the edge case mentioned under "Algebra of sets". Make sure you understand and handle those cases correctly. You can check if an `ArrayList` contains an element by invoking the `contains` method. Other useful methods are explained in the [official documentation of the ArrayList class](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/ArrayList.html).

#### Exercise 5.8 -- intersection
Implement a method called `intersection` that finds the intersection of two lists. It should return a new `ArrayList` with the intersection of the input. It must have the following method header:

```java
public static ArrayList<Integer> intersection(ArrayList<Integer> a, ArrayList<Integer> b)
```

> **Assistant's note:** Consider the edge case mentioned under "Algebra of sets". Make sure you understand and handle those cases correctly.

#### Exercise 5.9 -- complement

Make a method called `complement`, that returns the complement of input set, that is, it returns an `ArrayList` of all integers between `0` and `99` *not* included in the provided set. It must have the following header:
  
```java
public static ArrayList<Integer> complement(ArrayList<Integer> a)
```

#### Exercise 5.10 -- cardinality
Make a method called `cardinality`, that returns the *cardinality* of a set. It must have the following method header:

```java
public static int cardinality(ArrayList<Integer> a)
```

We provide you with an example of how the `main` method could look when testing your solution:

<details>
  <summary> 🛠 Example main method </summary>

```java
public static void main(String[] args) {
  // make two sets
  ArrayList<Integer> a = generateSet(0, 5)

  // call the "cardinality" method of the "SetTheory" object and store the result in an integer
  int cardinality = cardinality(a);

  // should print "5" to the terminal
  System.out.println(cardinality)

}
```
</details>


#### Exercise 5.11 -- cardinality of union
Make another method called `cardinalityOfUnion`, that returns the *cardinality* of the union of two sets, *A* and *B*, that is, |*A* U *B*|. It must have the following method header:

```java
public static int cardinalityOfUnion(ArrayList<Integer> a, ArrayList<Integer> b)
```


> **Assistant's note:** Once again we are going to use [function overloading](https://en.wikipedia.org/wiki/Function_overloading) (or *Ad hoc polymorphism*). This time, the methods have different *number of arguments* (or *[arity](https://en.wikipedia.org/wiki/Arity)*), so it is fine for them to have the same name.


### 🐞 Bugs and errors?
If you find any inconsistencies or errors in this exercise, please open a [New Issue](https://gits-15.sys.kth.se/inda-22/help/issues/new) with the title "Task *x* Error: *summary of error here*". Found bugs will be rewarded by mentions in the acknowledgment section.

### 🙏 Acknowledgment
This task was designed by                <br>
[Linus Östlund](mailto:linusost@kth.se)  <br>
[Sofia Bobadilla](mailto:sofbob@kth.se)  <br>
[Gabriel Skoglund](mailto:gabsko@kth.se) <br>
[Arvid Siberov](mailto:asiberov@kth.se)  <br>