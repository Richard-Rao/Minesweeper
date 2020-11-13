# Minesweeper Using Java
<span stype="color blue">**Inspiration:**</span>
This game was primarily created due to my own enjoyment of the Minesweeper.
<span stype="color blue">**About the code:**</span>
The entire game is coded using Java and is meant to be played on an IDE.
The game takes user input on what action they wish to perform and where. The 
field of the game is maintained using nested arrays and updates to the field are 
performed either through specified points or through recursion(if a revealed cell
reveals multiple other cells). 
<span stype="color blue">**Game:**</span>
The victory condition is achieved only when the 
total amount of revealed cells is equal to the number of cells minus the amount
of mines. Revealing a position containing a mine causes a loss.

<span style="color:blue">**Example(lined up in game)**</span>
  
 X 0 1 2 3 4 5 6 7 8 9                                                                                                      
 0 _ _ _ _ _ _ _ _ _ _                                                                                                       
 1 _ _ _ _ _ _ _ _ _ _                                                                                                       
 2 _ _ _ _ _ _ _ _ _ _                                                                                                       
 3 _ _ _ _ _ _ _ _ _ _                                                                                                       
 4 _ _ _ _ _ _ _ _ _ _                                                                                                       
 5 _ _ _ _ _ _ _ _ _ _                                                                                                       
 6 _ _ _ _ _ _ _ _ _ _                                                                                                       
 7 _ _ _ _ _ _ _ _ _ _                                                                                                       
 8 _ _ _ _ _ _ _ _ _ _                                                                                                       
 9 _ _ _ _ _ _ _ _ _ _                                                                                                       
There are 10 mine(s) left                                                                                                      
Would you Like to flag a cell or reveal a cell?                                                                                                      
Enter 'f' or 'r' >                                                                                                       

###Contributions 💡
If you wish to contribute or have a good idea, pull requests are very welcome.
