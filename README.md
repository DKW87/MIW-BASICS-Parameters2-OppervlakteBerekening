# Programming –opdracht Methodeparameters 2 - Oppervlakteberekening

## Beschrijving
Schrijf een applicatie die van een cirkel, een rechthoek, een vierkant en een driehoek de oppervlakte uit kan rekenen. De applicatie vraagt aan de gebruiker van welke figuur de oppervlakte moet worden berekend en vraagt dan afhankelijk van de keuze om de juiste informatie (straal bij een cirkel, hoogte en breedte bij een rechthoek, zijde bij een vierkant, basis en hoogte bij een driehoek). De applicatie geeft de juiste oppervlakte terug. De gebruiker kan dan kiezen om nog een berekening te laten doen of te stoppen.

Hieronder een voorbeeld van input/output van deze applicatie. Input die de gebruiker invoert is schuin en onderstreept.

```
Van welke figuur wil je de oppervlakte uit laten rekenen?
(cirkel = 1; rechthoek = 2; vierkant = 3; driehoek = 4;
stoppen = 0): 2
Wat is de hoogte in centimeter? 12
Wat is de breedte in centimeter? 5
De oppervlakte van jouw rechthoek is 60 vierkante centimeter.

Van welke figuur wil je de oppervlakte uit laten rekenen?
(cirkel = 1; rechthoek = 2; vierkant = 3; driehoek = 4;
stoppen = 0): 3
Wat is de zijde in centimeter? 7
De oppervlakte van jouw vierkant is 49 vierkante centimeter.

Van welke figuur wil je de oppervlakte uit laten rekenen?
(cirkel = 1; rechthoek = 2; vierkant = 3; driehoek = 4;
stoppen = 0): 0
Het programma wordt nu gestopt.
```

## Stappenplan
1. Maak een Scanner aan voor het krijgen van invoer van de gebruiker. De Scanner moet een globale variabele zijn. Je kunt de Scanner dan in verschillende methodes gebruiken.
2. Declareer een globale variabele oppervlakteFiguur, die de berekende oppervlakte van een figuur vastlegt. Je kunt deze variabele in verschillende methodes gebruiken.
3. Gebruik een while-loop om het programma door te laten gaan zolang de gebruiker geen 0 intypt.
4. In de main methode gebruik je een switch-statement voor het afhandelen van de keuzes. Voor elke keuze maak je een methode, die je in de switch-statement aanroept. In zo'n methode vraag je voor de desbetreffende figuur om de juiste informatie en bereken je de oppervlakte. Zo schrijf je bijvoorbeeld een methode behandelCirkel() die om de straal vraagt. Je hebt vier van zulke methodes nodig.
5. Maak voor de oppervlakte berekeningen methodes aan. Je hebt dus vier methodes nodig.
6. Gebruik de constante Math.PI voor het getal π voor het berekenen van de oppervlakte van een cirkel.
7. Geef de oppervlakte als output weer op de console.
8. Zorg ervoor dat je input en output precies overeenkomt met het hierboven gegeven voorbeeld.

Tip: test steeds tussendoor of je programma werkt door het te runnen.

## Richtlijnen bij coderen (zie ook MIW code conventions)
- Zorg dat je naam en het doel van het programma bovenin staan (ICC #1).
- Gebruik de juiste inspringing (indentation) bij de lay-out (ICC #2).
- Let op juist gebruik hoofdletters en kleine letters (ICC #3).
- Gebruik goede namen (ICC #4).
- Voeg waar nodig commentaar toe dat inzicht geeft in je code (ICC#7).