# Perimeter Assignment: Part One
## Introduction
In this assignment, you will complete the PerimeterAssignmentRunner class to calculate lots of interesting facts about shapes. 
This class has been started for you in the BlueJ project called PerimeterAssignmentRunner 
(this is the same project file that we were looking at in the previous reading, so feel free to open the one you downloaded for the last reading).
This project also contains several data files. 
In addition, you will need to look at the documentation for the Shape class and the Point class, which we went over in the last reading.

Our goals for this exercise are to: 

- 1a. Complete writing the method getNumPoints that has one parameter s that is of type Shape. This method returns an integer that is the number of points in Shape s. 

- 1b. Add code in the method testPerimeter to call getNumPoints and to print the result.

- 2a. Complete writing the method getAverageLength that has one parameter s that is of type Shape. This method returns a number of type double that is the calculated average of all the sides’ lengths in the Shape S.

- 2b. Add code in the method testPerimeter to call the method getAverageLength and to print out the result. 

## Discussion
Complete the method getNumPoints
For this section, we need to complete the code for the method getNumPoints. We are instructed that the method has one parameter, s, 
that is a Shape-type object. This makes sense with the other code we’ve seen in this project, as the only shape-type object we’ve created is,
in fact, named s. To understand how to show what parameter a method has, check out the code review we did in the last reading.
(Hint: the getPerimeter method also has a parameter named s that is of type shape, 
but the getPerimeter method returns a double-type variable, whereas we want getNumPoints to return an int-type variable).

After passing the parameter along, we’ll need to write some language that will allow for this method to return an int that is the number of points in Shape s. 
This immediately tells us that at some point, we will need to declare an int-type variable to return at the end of this method 
(review the video about variables and types if you’re having trouble with variable declaration). This variable will be a counter for the number 
of points within a given shape, s, which means that it will need to be increased for each point in the shape, s. 
This tells us quite a bit about how we might translate that action into java syntax, namely that we’ll be using some sort of loop. 
For more information about writing code that iterates over an entire object, 
see the video “Seven Steps in Action: Translating to Code” and look into the code review for this exercise
(Hint: the getPerimeter method has both a for each loop, and a variable that updates after each iteration).

- Add Code in the Method testPerimeter to output the result
In this case, we’re simply looking to write some code that will output the result of the getNumPoints method.
This tells us that within the testPerimeter method we’ll need to add a variable to correspond to the output of the getNumPoints method.
The prompt told us that this method is supposed to output an int-type variable, which means that whatever variable we declare here will also need to be int-type. 
We’ll then need to initialize it to the output of the getNumPoints method for the shape s. 
After initialization, we’ll just need to add some code that will cause the system to output some text and our variable
(Hint: the testPerimeter method already has examples of all of these processes).

At this point, it’s worth compiling your code and running it on some of the example text files included with the BlueJ project file. For the sake of this example, we’ll only use the example1.txt. When you run your program on example1.txt, it should tell you that the shape has four points. And if we open the text file itself, we can see that the shape does indeed have four points, so that checks out. You should run it on the other text files as well, to verify that it does check for the number of points in the shape, and does not just always output 4 points.

- Complete the method getAverageLength
Before we can think about what code we would need to write to figure out the average side length for the shape s, we need to understand exactly what we’re trying to calculate, and then translate that to java syntax. In this case, a couple of things that help us, we know that the way to calculate the average side length is the (sum of all sides lengths) / (number of sides). Additionally, we know that the number of sides is equal to the number of points in a two dimensional shape. We already know how to code a method that can calculate the perimeter of a shape, and we know how to code a method that can count the number of points in a shape, so now it’s just a matter of writing a method that can do both and return a double-type variable that is the quotient of those two quantities.

One thing to keep in mind, however, is types. It’s important to remember that when you’ll be doing operations on more than one variable, you may need to make sure they’re the same type, or that you’re casting your variables correctly for the operation you’re attempting. For more information on types and casting, see the “Types” video. For example, the getPerimeter method uses double-type variables, and the getNumPoints method uses int-type variables.

Add Code to testPerim to output the result of getAverageLength
You’ll do this almost exactly the same you did for the getNumPoints method. 

At this point, it’s worth testing your program again, and when you compile and run it on example1.txt, it should tell you that “the average length of a side in your shape is 4.0”.

This is where we’ll leave off with this exercise, but you’ll want to make sure you save all of your project files, as we’ll be using the exact same project files for the next few activities.


# Perimeter Assignment: Part Two
## Introduction
In this assignment, you will complete the PerimeterAssignmentRunner class to calculate lots of interesting facts about shapes. This class has been started for you in the BlueJ project called PerimeterAssignmentRunner (this is the same project file that you were using in the last exercise, so feel free to open it up again and continue working). The goals for this exercise are as follows:

- 1a. Complete writing the method getLargestSide that has one parameter s that is of type Shape. This method returns a number of type double that is the longest side in the Shape S.
 
- 1b. Add code in the method testPerimeter to call the method getLargestSide and to print out the result.

- 2a. Complete writing the method getLargestX that has one parameter s that is of type Shape. This method returns a number of type double that is the largest x value over all the points in the Shape s.

- 2b. Add code in the method testPerimeter to call the method getLargestX and to print out the result. Note if you were to select the file example1.txt, then the largest x value should be 4.0.

## Discussion
Complete the getLargestSide method and output the results
For this section, we’ve got to complete the getLargestSide method, which we know has a parameter s, of type shape. We learned in the last assignment and readings about how to show what kinds of parameters a method has, so make sure to reference that if you’re having trouble remembering how to get started. On paper, we’re simply trying to compare the length of all of the sides of shape s, and report the largest side. This tells us that we’ll need to be able to find the length of a side of a shape, but thankfully we already know how to do that from the other methods we’ve written and the Shape Class documentation (Hint: the length of a side of a shape is the distance between two points of the shape). 

Additionally, we know that we need to compare all of the sides of the shape, which implies we will need to iterate through each side of the shape to find its length. An important thing to remember when you’re thinking about programming, is what your objective requirements are. In this case, we’re only trying to find what the longest side is, so we only need to know if any given side is the longest side. We know how to calculate the length of a side, we know how to iterate through each point in a shape, we know how to keep a running tally while iterating, and we know how to compare values (if this is giving you trouble, revisit the video on conditionals). From here, it’s simply putting it all together.  

As always, when you’re done writing your code in the getLargestSide method, remember to add the code to call the getLargestSide method in the testPerimeter method and add the code to have the system print the output (the same way we did in the last exercise). As always, this is a great time to compile and test your code, and if you run this code using example1.txt as your shape file, then the longest side should be 5.0.

Complete the getLargestX method and output the results
Once again, for this section we know how to show what type of parameter a method has, and in this case we know that the getLargestX method will be outputting a double-type variable, so that’s a great place to start. From here, we know we’ll need to find the largest X value of any given point in shape S, so we’ll need to iterate through the points of the shape s and compare their x components (Hint: If you’re having trouble finding the x component of a point, make sure to check the Point class documentation in the course site). From here out, we know how to iterate through all the points in a shape, compare their values, and keep track of the largest value. 

As always in these activities, call your getLargestX method in the testPerimeter method, and have the system output the results. If you run this section of code with example1.txt, the Largest X will be 4.0. 

This is where we’ll leave off with this exercise, but you’ll want to make sure you save all of your project files, as we’ll be using the exact same project files for the next few activities.


