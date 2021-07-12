package javaapplication4;

import java.util.Arrays;

public class ProcessMarks {
    
    /* function definition for the max function which takes the array of marks
    as input and checks each mark individually and assigns the maximum value
    to the max variable. The maximum mark is then returned*/
    
    private static int max(int [] marksArr){
        int max = marksArr[0];
            for (int i:marksArr){

                //If current mark in the array is more than maximum mark, assign
                //the current mark to max variable

                if(i>max) max=i;
            }
        return max;
    }
    
    /* function definition for the min function which takes the array of marks
    as input and checks each mark individually and assigns the minimum value
    to the min variable. The minimum mark is then returned*/
    
    private static int min(int [] marksArr){
        int min = marksArr[0];
            for (int i:marksArr){

                //If current mark in the array is less than minimum mark, assign
                //the current mark to min variable

                if(i<min) min=i;
            }
        return min;
    }
    
    /* function definition for the range function which calls the max and min
    functions, gets maximum and minimum values of the array passed as arguemnt
    , and returns their
    difference*/
    
    private static int range(int [] marksArr){
        return max(marksArr)-min(marksArr);
    }
    
    
    /* function definition for the mean function which returns the mean of
    the array passed as argument, i.e. sum/length of array*/
    
    private static float mean(int [] marksArr){
        float sum=0;
            for(int i:marksArr){
                sum=sum+i;
            }
        return (sum/marksArr.length);
    }
    
    /* function definition for the median function which returns the median value
    of the array passed as argument*/
    
    private static float median(int [] marksArr){
        int[] testArr = new int[marksArr.length];
        
            //copying the content of the passed array to another test array
            //to prevent changing the content of the original array
            for(int i=0; i<marksArr.length; i++){ 
                testArr[i]=marksArr[i];
            }
        
        //sorting the test array using the Arrays class provided by
        //java
        
        Arrays.sort(testArr);
        
        //median value is the middle if array length is odd, and falls
        //between the middle two values if array length is even, so checking
        //if array length is odd or even, and returning median depending on that
        
        if((testArr.length%2)!=0) return(testArr[(testArr.length-1)/2]);
        else return ((testArr[testArr.length/2]+testArr[(testArr.length/2)-1])/2);
    }
    
    /* function definition for the mode function which returns the most
    occuring value in the array passed as argument*/
    
    private static int mode(int [] marksArra){
        
        int mode = 0,maxCount=0;
        int[] marksArr = new int [marksArra.length];
        
        //copying the content of the passed array to another marksArr array
        //to prevent changing the content of the original array
        
        for(int i=0; i<marksArra.length; i++){ 
            marksArr[i]=marksArra[i];
        }
        
        //sorting the test array using the Arrays class provided by
        //java
        
        Arrays.sort(marksArr);
        
        for(int i=0; i<marksArr.length;i++){
            int count=0;
            for (int j=0;j<marksArr.length; j++){
              
              //counting the number of times the ith value of the array 
              //repeats in the entire array
              
              if(marksArr[i]==marksArr[j]){
                  count++;
              }
              
            }
          
          //if ith value repeats more times in the array than the maximum 
          //count then assign the count of the ith value to the maxCount variable
          //and the corresponding ith value as the mode value
          
            if(count>maxCount){
              maxCount=count;
              mode=marksArr[i];
            }
          
        }
        return mode;
    }
    
    /* function definition for the grades function which returns the array 
    of the grades of the marks passed as an argument into the system*/
    
    private static char [] grades (int[] marksArr){
        
        char [] grading={'A','B','C','D','E','F'};
        int[] gradesBound={90,75,60,50,45};
        char [] grades=new char[marksArr.length];
        
        /* assigning 1-5th value of grading to the ith value of grades array
        if the ith value of marksArr matches 1-5th value of the gradesBound array
        */
        
        for(int i=0; i<marksArr.length; i++){
            if(marksArr[i]>=gradesBound[0]) grades[i]=grading[0];
            else if (marksArr[i]>=gradesBound[1] && marksArr[i]<gradesBound[0]) grades[i]=grading[1];
            else if (marksArr[i]>=gradesBound[2] && marksArr[i]<gradesBound[1]) grades[i]=grading[2];
            else if (marksArr[i]>=gradesBound[3] && marksArr[i]<gradesBound[2]) grades[i]=grading[3];
            else if (marksArr[i]>=gradesBound[4] && marksArr[i]<gradesBound[3]) grades[i]=grading[4];
            else grades[i]=grading[5];
        }
        
        return grades;
    }
    
    /* function definition for the gradeDistn function which calls the grades
    method to obtain the grades of the array, counts the number of times each
    grade appears in the array and returns the distribution of grades in the array passed as an argument*/
    
    private static int [] gradeDistn (int[] marksArr){
        char[] grade=grades(marksArr);
        char [] grading={'A','B','C','D','E','F'};
        int[] gradeDistn=new int [grading.length];
        
        //counting the number of times a grading appears in the grade array
        
        for (int i=0; i<grade.length; i++){
            if(grade[i]==grading[0]) gradeDistn[0]++;
            else if(grade[i]==grading[1]) gradeDistn[1]++;
            else if(grade[i]==grading[2]) gradeDistn[2]++;
            else if(grade[i]==grading[3]) gradeDistn[3]++;
            else if(grade[i]==grading[4]) gradeDistn[4]++;
            else gradeDistn[5]++;
        }
        
        return gradeDistn;
    }
    
    /* function definition for the main function of the class*/
    
    public static void main(String[] args) {
        
        // calling all the functions for testing purposes
        
        int [] marksArray = Marks.getMarks();
        char [] grade = grades(marksArray);
        int [] gradeDist=gradeDistn(marksArray);
        char [] grading={'A','B','C','D','E','F'};
        
        System.out.println("\nThe maximum mark is: " + max(marksArray));
        System.out.println("\nThe minimum mark is: " + min(marksArray));
        System.out.println("\nThe range of the marks is: " + range(marksArray));
        System.out.println("\nThe mean mark is: " + mean(marksArray));
        System.out.println("\nThe median mark is: " + median(marksArray));
        System.out.println("\nThe mode mark is: " + mode(marksArray));
        System.out.println("\nThe grades for the corresponding marks is: ");
        
        //displaying  grades 30 per line with speace separator
        
        for (int i=0; i<marksArray.length; i++){
            if((i%30)==0) System.out.println("\n");
            System.out.print(grade[i]+ " ");
        }
        
        System.out.println(" \n\nThe grade distribution for the corresponding marks is: ");

        
        for (int i=0; i<grading.length; i++){
            System.out.println(grading[i] + ": "+ gradeDist[i]);
        }
         
    }
    
}
