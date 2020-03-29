# Lord-212
Spring 2020 Java 212

Create a class called ClockNode which has fields for the data (a Clock) and next (ClockNode) instance variables. Include a one-argument constructor which takes a Clock as a parameter. (For hints, see the PowerPoint on "Static vs. Dynamic Structures”.) 
   public ClockNode (Clock c) {  . . } 
 The instance variables should have protected access. There will not be any get and set methods for the two instance variables. 
 
Create an abstract linked list class called ClockList.  This should be a linked list with head node as described in lecture. Modify it so that the data type in the nodes is Clock. The no-argument constructor should create an empty list with first and last pointing to an empty head node, and length equal to zero. Include an append method in this class. 
 
Create two more linked list classes that extend the abstract class ClockList: One called UnsortedClockList and one called SortedClockList, each with appropriate no-argument constructors. Each of these classes should have a method called add(Clock) that will add a new node to the list. In the case of the UnsortedClockList it will add it to the end of the list by calling the append method in the super class. In the case of the SortedClockList it will insert the node in the proper position to keep the list sorted. 
 
Instantiate two linked lists, and for every Clock read from the file, add it to the unsorted and sorted lists using the add method. You will end up with the first list having the Clocks from the input file in the order they were read, and in the second list the Clocks will be in sorted order. Display the unsorted and sorted Clocks in the GUI just as in project 1. 
