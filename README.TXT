------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all he/she needs to know. The comments should usually include at least:
------------------------------------------------------------------------

PROJECT TITLE: LCR_Game
PURPOSE OF PROJECT: Simulation of LCR game
VERSION or DATE: 20180211
HOW TO START THIS PROJECT: Run main method in LCRGameRunner.class
AUTHORS: Kristy Lee, Kory Yang
USER INSTRUCTIONS: 

The GameRecord Class serves as a starting point of sorts. As soon as the LCR Class is instantiated, the GameRecord Class populates an ArrayList with objects of the Player Class. The wins and losses of the players are all recorded within each Player object. Then, using a for loop, each player takes their turn, instantiating the “Dice” class. In the Dice class is a random number generator that returns an ArrayList of roll results (based on how many die a given player rolls). The methods for determining how many chips a user has at the end of each turn is in the “LCR” class. Using a while loop the game plays until the win condition is met. 

There are some deviations between the original UML diagram and the final working program. Firstly, there are numerous helper methods in the LCR Class (and several other classes as well). In addition, getter and setter methods that may or may not be present in the UML are present. Overall, the structure of the program is the same, but several helper methods were added. 
