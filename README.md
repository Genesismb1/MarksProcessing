# MarksProcessing
Processing Marks

You will create a class containing a number of static methods for processing an array of marks, which are scores in a test. Each mark is an integer in the range 0 to 100 inclusive. On the Interact site for this subject, you will be provided with a class Marks, which has a method getMarks that returns an array of marks for you to use in testing.
The class ProcessMarks that you create will have the methods specified below. Most will accept an array of marks as an argument; one will accept an array of characters. The return type should be appropriate for the returned value.

The max, min and range methods will return the maximum mark, the minimum mark and the difference between the maximum and minimum marks respectively.
The mean methods will return the mean of the set of marks.
 The median method will return the median value of the set of marks. The median value is the middle one when the values are placed in order. To obtain an ordered version of the marks you may use an appropriate sort method of the Java API’s Arrays class. Be careful not to destroy the original array of marks. If there is an even number of marks, the middle value is taken as the average of the two values that are nearest to the middle.
The mode method will return the mode of the set of marks, which is the most commonly occurring mark. To find the mode, use an ordered version of the set of marks, as used for finding the median. If there is more than one value that is most common, any one of the most common values will do for the mode.
The grades method will return an array of characters, which are the grades corresponding to the integer marks in the array of marks. The grades are to be assigned using the following lower boundaries for the corresponding marks: for grade A, the lower boundary is 90; for grade B, it is 75; for grade C, it is 60; for grade D, it is 50; for grade E, it is 45; and F is the grade for all other marks. A best solution for this method would not have the values for the lower boundaries hardcoded but would use an array for these values, which would allow the grade boundaries to be altered.
The gradeDistn method will accept an array of characters, which are the grades assigned for the array of marks, such as returned by the grades method. The gradeDistn method will return an array of integer values containing the distribution of grades, which is the number of occurrences of each grade in the assigned grades. The characters used for grades are fixed. The returned array should provide the distribution in order from grade A to grade F.
 
The following points should be taken into account in the design of your program:

None of your code should change the contents of the original array of marks.
You should not make any assumption that client code, that would use your methods, should call them in any particular order. That is, you should not assume that a client that calls the range method will have previously called the max and min methods.
Test your ProcessMarks class, either by providing test code in a main method within that class or in a separate class. The test code will use an array of marks obtained from the getMarks method of the Marks class provided on the Interact site. Test each one of the methods described above, displaying the results appropriately. The grades should be displayed 30 per line with a space separator between grades. The grade distribution should be displayed in the form:
 
A: 10
B: 30
C: 105
D: 75
E: 35
F: 10