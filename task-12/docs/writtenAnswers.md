Exercise 12.1

| Size / complexity |     log n     |       n       |    n log n    |  n<sup>2</sup>   |  n<sup>3</sup>   |   2<sup>n</sup>  |      n!          |
|-------------------|---------------|---------------|---------------|------------------|------------------|------------------|------------------|
| 1                 | 0             | 1             | 0             | 1                | 1                | 2                | 1                |
| 10                | 3.32          | 10            | 33            | 100              | 1e3              | 1024             | 3628800          |
| 100               | 6.64          | 100           | 664           | 1e4              | 1e6              | 1.27e30          | 9.33e157         |
| 1000              | 9.97          | 1000          | 9966          | 1e6              | 1e9              | 1e301            | 4e2567           |
| 10000             | 13.29         | 10000         | 132877        | 1e8              | 1e12             | 2e3010           | 2.85e35659       |
| 100000            | 16.61         | 100000        | 1.66e6        | 1e10             | 1e15             | 10e30102         | 2.83e456573      |
| 1000000           | 19.93         | 1000000       | 1.99e7        | 1e12             | 1e18             | 9.9e301029       | 8.3e5565708      |

Exercise 12.2

| T(n)          | 1 second | 1 minute |  1 hour  |  1 day   |  1 year  |
| --------------|----------|----------|----------|----------|----------|
| log n         |  2^e9    | 2^(e9*60)| &#x221e; |  inf     |  inf     |
| n             |  1e^9    | 6e^9     | 3.6e12   | 8.64e13  | 3.2e16   |
| n log n       |  3.9e7   | 1.94e9   | 9.8e10   | 2.1e12   | 6.4e14   |
| n<sup>2</sup> |  31 623  | 244 949  | 1.8e6    | 9.3e6    | 17.75e7  |
| n<sup>3</sup> |  1000    | 3914     | 15326    | 44208    | 315 938  |
| 2<sup>n</sup> |  30      | 36       | 41       | 46       |  54      |
| n!            |  12.3    | 13.9     | 15       | 16.5     |  18.5    |

Exercise 12.3.1

f4(n) = n + 100
f3(n) = n log n
f1(n) = n^1.5
f5(n) = 2^n
f2(n) = 10^n

Exercise 12.3.2

|f(n)          |  O(g(n)) |  True/False  |
|--------------|----------|--------------|
|n (n + 1) / 2 |  O(n3)   |    True      |
|              |          |              |
|n (n + 1) / 2 |  O(n2)   |    True      |
|              |          |              |
|n (n + 1) / 2 |  Θ(n3)   |   False      |
|              |          |              |
|n (n + 1) / 2 |  Ω(n)    |    True      |


Exercise 12.4

|Algoritm   |  svar  |
|-----------|--------|
|Algoritm 1 | Θ(n)   |
|Algoritm 2 | Θ(n)   |
|Algoritm 3 | Θ(n^2) |
|Algoritm 4 | Θ(n^2) |
|Algoritm 5 | Θ(n^4) |

Exercise 12.5

För att O(n^3) ska gälla för funktionen (n+1)^3 så måste olikheten (n+1)^3 <= C * n^3 gälla för alla n >= n0
Om vi utvecklar uttrycket (n+1)^3 får vi n^3 + 3n^2 + 3n + 1 <= C*n^3 där högsta termen är n^3.

Om vi sätter n = 1 i vänsterledet får vi f(1) = 8 och alltså ska C*n^3 vara mindre eller lika med 8. n^3 är 1 alltså ska C vara minst 7.
Om vi sätter n= 2 i vänsterledet får vi f(2) = 27, C*n^3 => 27 där n^3 är 8 och C = 7 ger 56.

Kollar vi på graferna för respektive funktion så växer de i samma takt och då kan vi alltså lägga till en konstant C till O(n^3)
vilket uppgfyller olikheten (n+1)^3 <= C*n^3 för alla n >= n0

Exercise 12.6.1

What is the basic operation for this algorithm?
 for j = i down to 1

 Describe the time complexity of this algorithm
 O(n^2)

 Exercise 12.7

In a sorted collection Insertion sort will assert that if the first number is smaller or bigger to the next one. If it is smaller it will
leave the object in place and move on to the next one checking if the secound numbers is smaller then the third. In best case secenario Insertion sort
is O(n). The average and the worst case of Insertion sort is O(n^2)

Selection Sort in a sorted collection will check all the numbers to see which one is the smallest. Then it will iterate over the whole list again
and check for the secound smallest and so on. Whick makes it in best case scenario still O(n^2)

In a mostly sorted case Insertion sort might take a few less operations but in average it is O(n^2) the same as Selection sort.

Which one is preferred depends on the situation, in general the both algoritms is best suited for sorting small lists, I would prefer
Insertion sort because its best case scenario is better then selection sort and its worst case scenario is the same.


