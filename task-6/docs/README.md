Suppose you have made a new `Random` object called `random`:

1. How many possible outcomes does `random.nextInt()` have?      
2. How many possible outcomes does `random.nextInt(256)` have?
3. What is the probablity that `random.nextFloat()` generates a number above or equal to 0.8?
4. What is the probablity that `int value = random.nextFloat() < 0.2 ? random.nextInt(2) : 1 + random.nextInt(4)` is assigned to `1`?
5. What is the probability of `random.nextInt(random.nextInt(3))` producing `0`?

> **Assistant's note:** What happens when `nextInt(0)` is called? 🤔

You may answer with a fraction (`a/b`), an expression of the form c*x^y, percentage or a decimal number. 
Please enter your answers in the following table:


| Question | Answer |
| -------- | ------ |
|    1.    |  2^32  |
|    2.    |  0-255 |
|    3.    |  20%   |
|    4.    | dont really understand this one, is it multiple questions? if it is intended as 3 different then:
19%, 1/3 and 1/4    |
|    5.    |nextInt(3) can be 0,1,2 (1/3) if nextInt(3) = 0 will throw exception, 1 it is 100% = 0 and if 2 50% = 0   |
