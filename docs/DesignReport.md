# Design Report 

#### Team Jertep
The members of team Jertep are:

	- Eíríkur Hákon Friðriksson
	- Elías Ingi Elíasson
	- Jón Sigurðsson
	- Pétur Stefánsson
	- Rakel Rós Geisdóttir
	- Tumi Guðmundsson

####Introduction
This is a design report for an assignment in Hugbúnaðarfræði. The assignment is to implement a TickTackToe game using Test driven development. We will use Github, Travis, og fleira ......

####Design

The initial plan is to create a functional console game but with the option to implement a web app if there is time. 

Everyone in the team knows how the game works so it wasn't hard to figure out the basic logic and decide how to design it. At first there will only be one class but in the finished product each functionality will be stored in separate  class eg. the game, the player and the board.
The board is a 3x3 square stored in two-dimensional array and is initialized as followed:

	1 2 3
	4 5 6
	7 8 9
	
The players are two , X and O. If Player O starts and inputs 5 then the updated board will be:

	1 2 3
	4 O 6
	7 8 9
	
if there is X or O in the array the game returns a error message.

####Implementation and testing
We will split the functions between ourselves and each team member is responsible to write the testing code along the game code. After each implementation, the member will add, commit and push his or her code to the repository. Travis is connected to our repository and will be built there. If the build on Travis is without error we continue, else we fix the code.
We will create a Heroku web app when the console game is ready.

####Class diagram
helstu klasaritin koma hér 


####Code coverage
We will use Gradle to go over the code coverage. (er það ekki)

hvernig erum við að covera kóðann, hvaða tól notum við.....

####Code inspection


####The delivery
The plan is to deliver the project in a web based app in Heroku. 
hvernig ætlum við að skila verkefninu af okkur, verður það console eða komumst við í vef app
