# Specific instructions for DD1338

### DD1338 - Algorithms and Data Structures
As the name implies, DD1338 is a course about algorithms (recipes on how to do
things) and data structures (ways to store information on a computer). To be
more precise, we will mostly be studying and implementing data structures, and
algorithms that operate on these data structures. For example, the `LinkedList`
in the Java standard library is an implementation of the linked list data
structure, for which algorithms for searching and sorting are useful tools.

* **VERY IMPORTANT NOTE:** As this is a course on _implementing_ algorithms and
  data structures, you are _not_ allowed to use library classes that already
  implement them and call it a day. For example, if you are asked to implement
  _binary search on arrays_, you are not allowed to use `Arrays.binarySearch`
  for the assignment. The same goes for data structures, importing
  `java.util.LinkedList` and using its methods for the linked list assignment
  is not okay. That is not to say that you are not allowed to use any library
  classes at all, but use your own judgement to figure out when a library class
  does a bit too much of the exercise for you.

### Testing in DD1338
Testing is an important part of DD1338, and a valuable skill to have as a
programmer. In DD1338, we are only concerned with _unit testing_. For each
assignment (except for week 13), you will be provided with a test skeleton.
For most assignments, a large portion of the test class(es) will already be
implemented, and your task will be to study the implemented parts, and also
implement a few select test methods yourselves. Most test classes also come with
helper methods defined at the very bottom of the class that perform some
utilitary functions (for example, filling lists), so make sure to read through
the test class to see what is available before you start working on your test
implementations.

* **IMPORTANT NOTE:** For unit testing in DD1338, we use **Junit4**. The reason
  we do not use the newly released **Junit5** is just beacuse it _is_ newly
  released, and reached GA (General Availability) after work on this year's
  assignments had begun. But don't fret, the particular testing framework does
  not matter much, it is the concepts that are important!
* **ALSO IMPORTANT NOTE:** When it comes to testing, you may use anything and
  everything that you find in the Java standard library!

#### Learning goals
We hope that you will (start to) learn and get a feel for the following:

1. How to write unit tests.
2. How to name unit tests.
3. What to test.
4. Why unit testing is useful.

#### About the tests themselves
In most cases, the intention of each test provided in the test classes should be
unambiguous going by the name. **If you have any questions about what any of the
test cases should do, ask your assistant, as he/she has access to a reference
implementation of each test class!**

##### Naming pattern - _someResultWhenSomething_
The tests generally follow the naming pattern _someResultWhenSomething_.
_someResult_ usually includes the name of the method being tested (if
applicable), and _whenSomething_ usually provides the context.  For example, a
test on a list data structure named `getLastIsNullWhenListIsEmpty` should
assert that the method `getLast` returns `null` when the list is empty. In the
cases where test names are deemed ambiguous, becase we failed miserably with
the naming, a comment gives extra context.

**Note:** Sometimes, this convention is slightly deviated from. For example,
the _when_ may not alway be _when_, but can also be e.g. _after_.

##### AAA - Arrange, Act, Assert
The test methods are built around the _Arrange, Act, Assert_ pattern. The three steps
are explained below:

1. **Arrange:** The pre-conditions for the test are set up. This includes any
   fixture (i.e. the `setUp`-esque methods) and initialized fields, as well as
   any additional setup required in the test method itself. Note that not every
   test method _must_ have an **Arrange** phase, as this can sometimes be
   covered completely by the test fixture.
2. **Act:** When everything has been set up, the method(s) required to test the
   behavior should be executed, and any results required to verify the behavior
   we wish to verify should be collected. Every test method should include the
   **Act** phase.
3. **Assert:** The final step is to assert the results from step 2. Every test
   method should include the **Assert** phase. However, it may not be
   explicitly _in_ the method, for example when using the
   `@Test(expected=SomeException.class)` syntax.

Following this pattern leads to clean and readable test methods. The whole
point is to **not mix the steps**, so you never **Arrange** after you **Act**,
and never **Act** after you **Assert**. The different phases are clearly
marked in the test methods that have already been implemented in each
test class. Do note that this also causes many test classes to be a frightful
amount of lines long, even if there aren't all too many tests in there.

##### Test one concept/behavior per test
Each test should test _one_ concept or behavior. This is not the same as having
only one assert per test, or one method call per test, there are many cases
where it makes sense to have several to test a single behavior. However, you
should not assert different qualities (for example, the `size` of a collection
and what the first element is) in the same test, _even if both the Arrange and
Act steps are identical_. Consequently, a unit test should be _small_, and in
this course you should rarely have to exceed 10 lines of code per test.

#### The TDD approach
In DD1338, most of the tasks you are to do involve clearly defined APIs and
behaviors that you are to implement. As such, _Test Driven Development (TDD)_ (i.e.
writing tests first and implementing behavior later) is well suited for these
tasks, and done right, will help you write better code. We encourage (but do
not enforce) you to try TDD as much as you feel comfortable with, and where you
feel it makes sense. Often, the test skeleton will have its tests ordered by
method, which will make it easy for you to find the relevant tests, implement them,
and then implement the method itself. It is therefore most often beneficial to
have a look at the _Testing_ section of the repo before starting with the
coding assignments, even though it is located at the bottom. As large portions
of the test classes will be implemented beforehand, this is essentially TDD with
training wheels, so go ahead and try it out!

#### Reference tests - our versions that your code should pass!
So, what is your incentive to even make an effort with this whole unit testing
business? Apart from the fact that **you must do the work**,each test class has
a reference implementation that your code should pass in order for it to be
deemed _good enough_. Unit testing is not exhaustive, so your code may still
have issues, but that's on us. If your code passes the reference test class, it
is good enough in terms of functionality (things such as style issues and code
duplication may still be cause for komplettering). Sometimes, your assistant can
determine that your code is good enough even if it fails a test or two, but the
general goal is to pass all tests. As such, it is in your best interests to take
the time to do the testing properly, as this will greatly increase your chances
of receiving a straight pass. In other words, the test skeleton will let you
know _exactly_ what behavior your assistant will be looking at.

**The reference test classes for each assignment will be made available to
students after the assignment deadline has passed in
[this repo](https://gits-15.sys.kth.se/inda-20/testing)**

#### There is no _one right way_ to test
This cannot be stressed enough. Just as with coding style, the details of
unit testing are often a matter of preference. There is no one right way to
name tests: you are sure to find a bunch of awkwardly named tests in the
DD1338 test classes due to the author stubbornly sticking to the naming
convention. There is no one right way to structure tests: some wille tell you
that fixtures obfuscate your tests and should be avoided, while others tell
you they reduce code duplication and make for easier maintenance. With the
testing in DD1338, we are showing you _one_ way to unit, and not _the_ one way.

#### Test code is graded leniently
Finally, it is only fair to let you know that your test code is graded
leniently. That is to say, failing with the implementation of a few tests will
not lead to failing the assignment as long as your production code passes the
reference tests. The important thing is that you _attempt_ to do the testing.
However, testing is part of the course, so consistently making a poor effort on
the testing may lead to receiving komplettering and/or fail.
