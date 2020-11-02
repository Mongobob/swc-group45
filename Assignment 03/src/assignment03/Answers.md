The game has been implemented.
###To make it easier to grade and understand we:
- Added the UML Diagram ("assignment03.uml")
- used "GameMaster" as Iterator which implemented interface "Iterator" (1)
- used "Scoreboard" as Singleton (2)
- used "Board" as Observer which implemented "My Observer"
- used "MilitaryShip" which implemented "MyObservable"

###In Detail:
1.)  We defined the GameMaster Class as an Iterator that would keep
generating new Rounds with .next() to play as long as the game was
not finish. Or in other words the function .hasNext() did not return
a winner.

2.) It made sense to make the scoreboard a singleton since it is
imperative that both players agree on the current score aka both
have same scoreboard.

3.) That Boards as an Observer and the Ships on them as Observable
made sense to us in the way that if we didn't change anything on
the ships, the board and it's visual representation didn't need
to know about it. Since the only thing that influences Ships outside
of the setter methode was the method hit, which is invoked whenever
the player or the Ai shoot and hit a target, it made sense that the
hit method could access and use the .notify() method to keep the Board
up to date.

