#Administration Manual

To play Tic Tac Toe on your computer, you have to do have the following programs installed on your computer:
 - Java jdk8
 - Git
 - Gradle

####Java

If you use windows, go to [Oracle](http://www.oracle.com/technetwork/java/javase/downloads/jre7u9-downloads-1859586.html) there are instructions on how to install it. 

If you use Mac or Linux go to [Homebrew](http://brew.sh) and copy the Url and run in the Terminal. 
You also need to do the following:
 - brew tap caskroom/cask
 - brew install brew-cask
 - brew cask install java

-
####Git

You can download git [HERE](http://git-scm.com/download/win "Download and install git")

####Gradle

If you use windows you download Gradle, unzip it and set it up. You can follow these [Instructions]( https://docs.gradle.org/current/userguide/installation.html "instructions for gradle"). 

- You have to be sure to:
    - Add GRADLE_HOME/bin to your PATH environment variable
    - Add a valid JDK to the environment variable JAVA_HOME.

If you are using Mac or Linux go to [Homebrew](http://brew.sh), copy the Url and run in the Terminal. 
You also need to do the following:
 - brew install gradle

-
####Play Tic Tac Toe on your computer.
Now you have to go to [GitHub](https://github.com/peturs15/Jertep) and download the project as .zip/.tar.gz

On Unix/Linux open the command prompt and go the location of the folder. Write the command *./bin/compile* to run the game

On Unix/Linux open the terminal and go to the location of the folder. Write the command *sh .\bin\deploy*

####.jar
After you run the game on your computer it saves a .jar file in a directory named jar on the root of your computer. Go to the jar directory and type the command *java -jar ticktacktoe.jar* to play the game as a console project.

####How to play Tic Tac Toe

Tic Tac Toe is a game between two players where they compete to get three consecutive symbols (x's or o's) on a 3x3 playing board. The board is marked with numbers from 1 to 9 and the players take turns choosing on which square they want to place their symbol. As soon as a player decides which square from 1 to 9 they want to place their symbol on, that square becomes marked with their symbol and can no longer be used, the other player then takes their turned following the same pattern of rules. The first player to get three consecutive symbols (across the table or diagonal) wins the game. If the board fills up with symbols and neither player has three consecutive ones, there is a tie.
