# JUnit 4.12 in INDA
In both DD1337 and DD1338, we use Junit 4.12 (_not_ JUnit 5). Running JUnit
from the command line can be a bit tricky, so here's a guide on how to do it.

## Downloading the required libraries
First, we need two external libraries. They can be downloaded from Maven
Central with the commands listed below (assuming you have `wget` installed).

```bash
curl -L https://search.maven.org/remotecontent?filepath=junit/junit/4.12/junit-4.12.jar -o junit-4.12.jar
curl -L https://search.maven.org/remotecontent?filepath=org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar -o hamcrest-core-1.3.jar
```

If you don't have `wget` installed (for example, if you're on Windows), just
copy the links and paste them into your web browser, and the downloads should
start.

## Compiling and running with external libraries on the classpath
Let's assume we have a class and a test class called `Sieve.java` and
`SieveTest.java` in the current directory. Assuming that the `.jar` files are
now in the current directory, we can compile all files in the current directory
like this:

`javac -cp ".:hamcrest-core-1.3.jar:junit-4.12.jar" *.java`

> **Important for Windows users:** If you are using Windows (and _not_ running
> any Linux emulation terminal or WSL), all `:` characters in the classpath
> should be replaced with `;`.

We can then run it with the following command:

`java -cp ".:hamcrest-core-1.3.jar:junit-4.12.jar" org.junit.runner.JUnitCore SieveTest`

Just to be clear, we are putting three things on the classpath: The current
working directory (`.`) and the two `jar` files, as these are the three places
where we expect to find the class files needed to run the test.
`org.junit.runner.JUnitCore` is the _test runner_, and `SieveTest` is the test class
that we want to run.

> **Asistant's note:** The `-cp` option lets us specify the classpath directly
> on the command line. If you want to avoid having to specify the classpath all
> the freaking time, you can set the `CLASSPATH` environment variable with
> paths to all Java libraries that you use regularly.
