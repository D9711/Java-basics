Exercise 13.1.1 - Inheritance

a) 

1. Person p1 = new Student(); 
Svar: LEGAL då Student är en subclass av Person
2. Person p2 = new PhDStudent(); LEGAL
Svar: LEGAL då PhDStudent är en subclass av Student som i sin tur är en subclass av Person
3. PhDStudent phd1 = new Student(); 
Svar: ILEGAL då Student är inte en subclass av PhDStudent. Student kan alltså inte ärva av PhDStudent.
4. Teacher t1 = new Person(); 
Svar: ILEGAL då Person inte kan ärva från Teacher, Person är alltså inte subclass till Teacher.
5. Student s1 = new PhDStudent(); 
Svar: LEGAL då PhDStudent är en subclass till Student och kan då ärva.

b)

s1 = p1;
Svar: Legal, vi har skapat objekten s1 och p1 tidigare. Vi sätter objektet s1 lika med objektet p1. Eftersom s1 ärver från p1 är det okej.

s1 = p2;
Svar: Legal, samma som ovan fast objekt p2, p1 och p2 är två objekt från samma class.

p1 = s1;
Svar: ilegal därför vi försöker sätta objektet p1 lika med objektet s1 och då p1 inte ärver från s1 fungerar det inte.

t1 = s1;
Svar: ilegal, båda ojekten ärver från samma objekt men kan indivduellt ha egna variabler vilket gör att t1 inte kan vara lika med s1.

s1 = phd1;
Svar: ilegal, phd1 ärver från s1 men phd1 kan ha egna variabler som s1 inte har, alltså kan inte s1 vara lika med phd1.

phd1 = s1;
Svar: legal, då phd1 har ärvt alla s1:s variabler kan alltså phd1 vara lika med s1.

13.1.3
a) Ifall vi tar bort så EventPost inte längre ärver från Post så kommer EventPost inte åt de två variablerna author och timestamp. Utöver det kallar vi också på klassen Post metod display. Tar vi endast bort att EventPost ärver från Post får vi ett Exception. Då behöver vi också ändra EventPost constructor samt i displaymetoden för att det ska fungera igen men då utan de variabler och metoder som finns i Post.

b) Vi kommer få ett exception då ordet super syftar till att det är en annan klass variabel. Precis som this används för variabler inom klassen, tar vi bort super så hittas inte variabeln då den ligger i en annan klass och vi måste då skapa en lokal variabel.

c) Vi får en oändlig loop då EventPost kallar sin egna display metod inom display metoden, med ordet super så syftas metoden från klassen vi ärver från, alltså metoden display från klassen Post.

d) Det kallas "polymorphism" vi "Override" en metod med en annan.


13.3 (13.3.1 - 13.3.2)
Algoritm time complexity är O(n) därför att den utför n operationer när den kallas.

Correctness kan vi visa med Invariant som är ett statement om variabeln i algoritmen. I det här fallet double res. Statement ska vara sant före, under och efter utförandet. Vi kan göra en Invariant statement som en kommentar i koden.

//Invariant: Initalization: res = x^i = 1 och i = 0, vid varje iteration kommer res öka med x^1 alltså kommer res = x^i. Efter loopen är avslutad kommer res = x^i.

13.3.3


