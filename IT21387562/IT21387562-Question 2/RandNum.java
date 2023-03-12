//IT21387562
//E.M.A.M.Ekanayake
//Assignment 1
//Question 2

package opp;

import java.util.Random;

//create RandNum class
public class RandNum
{
  //create constructor
  Random random = new Random();

  //create an array
  int randArray[][] = new int[5][5];

  //other variables
  double average;
  int maximum = 1;
  int minimum = 1000;
  int sum = 0;

  //RandNum method
  public RandNum()
  {
    //rows
    for(int i = 0; i<5; i++)
      {
        //columns
        for(int j = 0; j<5; j++)
          {
            //generate a random number in the range of 1 to 100
            randArray[i][j] = random.nextInt(100);

            //for ignore 0
            randArray[i][j]++;
          }
      }
  }

  //creating method for calculate maximum, minimum number of the array and calculate average
  public void calc()
  {
    //check rows
    for(int i = 0; i<5;i++)
      {
        //check columns
        for(int j = 0; j<5; j++)
          {
            //check maximum number
            if(randArray[i][j]>maximum)
            {
              maximum = randArray[i][j];
            }
            //check minimum number
            if(randArray[i][j]<minimum)
            {
              minimum = randArray[i][j];
            }
            //calculate sum
            sum += randArray[i][j];
          }
      }
    //calculate average
    average = (double) sum/25.0; 
  }

  //method fpr display randomly create array and minimum,maximum values and average
  public void display()
  {
    //rows
    for(int i = 0; i<5 ; i++)
      {
        //columns
        for(int j =0 ; j<5; j++)
          {
            //display array
            System.out.print(randArray[i][j]+"\t");
          }
        System.out.println();
      }

    //display maximum,minimum number and average

    System.out.println("Maximum value : "+maximum);
    System.out.println("Minimum value : "+minimum);
    System.out.println("Average       : "+average);
  }
  
}

