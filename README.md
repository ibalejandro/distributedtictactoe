#Distributed Tic-tac-toe

Tic-tac-toe is a *Java* game that uses GlassFish server, the game is peer-to-peer mixed with Web Services and Remote Method Invocation. Players can interact in different machines through the server.

The project was mainly developed using the [NetBeans IDE] version 8.0.1 and [GlassFish server] version 4.1.

The application is composed by two projects: **TriquiServer** and **TriquiClient**, both developed in *Java*.
The core logic, consisting in dealing with the game rooms and players, was implemented in the server project, wich also deals every single match and receives requests from users who want to play (make a move). In the client project the current game is visualized and allows to make a move only when the turn is the appropiate. Also, before a match room there is a lobby room, where the client can see a list of players online and rooms available to play.

The game offers a pretty and simple graphic interface, which allows the client to play softly and not falling in any confusion.

# Compile and Run the project
In order to compile and run the project you must have installed NetBeans IDE 8.0.1 and GlassFish server 4.1, then, download the project package.

## Compiling

* Execute NetBeans IDE 8.0.1 or any compatible version that runs with GlassFish Server 4.1.
* Open the project **TriquiServer** which is included in the package.
* Open the project **TriquiClient** which is included in the package.
* Deploy the project **TriquiServer**, in order to do that you should hit right click in the project and select de 'Deploy' option.
* Wait for a the correct deployment of the project.

## Playing
* Once the server is deployed, execute the client project, making right click over it and select the 'Run' option.
* A window will popup. There you can see a list of players and rooms available at the moment.
* You can execute multiple instances of that client project as specified. The multiple windows will emule remote players.
* When opening the game, a nickname should be selected, writing it in the little window that pops up after run.
* The game window offers 'Create match', 'Enter match' and 'Quit' options. *Create match* allows the player to create a new game room. *Enter match* allows the player to join to an already created room that has an empty slot. *Quit* allows the player to exit the game.
* When joining a game room, a game board and the general information of the match can be seen. To make a move the player needs to click the desired box, and if it is a valid move will be executed.
* In any moment of the match the player can leave the room.
* Once the game is over, both players will be notified about the final result of the match. Besides, there will be two options, 'Play again' or 'Quit'.

[Netbeans IDE]:https://netbeans.org/
[GlassFish server]:https://glassfish.java.net/
