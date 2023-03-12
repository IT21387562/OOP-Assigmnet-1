//IT21387562
//E.M.A.M.Ekanayake
//Assignment
//Question 1

import java.util.Scanner;

public class Main
  {
    public static void main(String[] args)
      {
        int choice = 1;

        //fixed prices
        int deluxDoubleFixed = 5000;
        int standardFamilyFixed = 3000;
        int standardSingleFixed = 2000;

        //prices of other facilities
        int balconyPrice = 500;
        int parkingPrice = 200;
        int tvPrice = 200;
        int kitchenDeluxDoublePrice = 1000;
        int wifiPrice = 100;
        int kitchenStandardFamilyPrice = 500;
        int gardenPrice = 200;
        int acPrice = 500;

        int total = 0;
        int total1 = 0;
        int total2 = 0;

        //boolean variables for get 'true' and 'false'
        boolean balcony, parking, tv, kitchenDelux, wifi, kitchenStandard, garden, ac;

        //objects
        RoomChargeCalculator room1 = new RoomChargeCalculator();
        RoomChargeCalculator room2 = new RoomChargeCalculator();
        RoomChargeCalculator room3 = new RoomChargeCalculator();

        //in this question we have 'Quiz' option then we are using while
        while(choice!=4)
          {
            System.out.println("\n\nWelcome to ABCD Hotel!!!\n");
            System.out.println("Room Charge Calculator");
            System.out.println("\t 1. Delux-Double");
            System.out.println("\t 2. Standard-Family");
            System.out.println("\t 3. Standard-Single");
            System.out.println("\t 4. Quit\n");

            Scanner myScanner = new Scanner(System.in);  
    
            //getting user inputs
            System.out.print("Enter your choice (1-4) : ");
            choice = myScanner.nextInt();

            switch(choice)
              {
                //if user selects dulex-double
                case 1:

                System.out.println("\nYou are Selected Delux-Double package!!\n");
                //Display fixed price
                System.out.println("Fixed value : " +deluxDoubleFixed );

                System.out.println("\nIf you want to use below facilities please enter 'true' and you don't want use use please enter 'false'.\n");
                //Display price of facilities
                System.out.println("\tFor Balcony : " +balconyPrice);
                System.out.println("\tFor Parking : " +parkingPrice);
                System.out.println("\tFor TV      : " +tvPrice);
                System.out.println("\tFor Kitchen : " +kitchenDeluxDoublePrice);
                System.out.println("\tFor Wifi    : " +wifiPrice);

                System.out.print("\n");

                Scanner choice1 = new Scanner(System.in);
                //user select the facilities that she/he want
                System.out.print("Balcony : ");
                balcony = choice1.nextBoolean();
                System.out.print("Parking : ");
                parking = choice1.nextBoolean();
                System.out.print("TV      : ");
                tv = choice1.nextBoolean();
                System.out.print("Kitchen : ");
                kitchenDelux = choice1.nextBoolean();
                System.out.print("Wifi    : ");
                wifi = choice1.nextBoolean();

                System.out.println("\n");

                //getting total
                total+= room1.getChargeDeluxDouble(balcony, parking, tv, kitchenDelux, wifi);

                //Display total of dulex-double
                System.out.println("Your sub Total : "+total);
          
                break;
                  
                //if the user selects Standard-Family
                case 2:
         
                System.out.println("\nYou are Selected Standard-Family  package!!\n");
               //Display fixed value
               System.out.println("Fixed value : " +standardFamilyFixed);
    
               System.out.println("\nIf you want to use below facilities please enter 'true' and you don't want use use please enter 'false'.\n");
               //display price of other facilities
               System.out.println("\tFor Parking : " +parkingPrice);
               System.out.println("\tFor Kitchen : " +kitchenStandardFamilyPrice);
               System.out.println("\tFor Garden  : " +gardenPrice);

               System.out.print("\n");

               Scanner choice2 = new Scanner(System.in);
               //user selects facilities that she/he wants
               System.out.print("Parking : ");
               parking = choice2.nextBoolean();
               System.out.print("Kitchen : ");
               kitchenStandard = choice2.nextBoolean();
               System.out.print("Garden  : ");
               garden = choice2.nextBoolean();

              //getting total
              total1+= room2.getChargeStandardFamily(parking,kitchenStandard,garden);

              //Display total of Standard Family
              System.out.println("Your sub Total : "+total1);
                  
               break;
          
               case 3:
         
               System.out.println("\nYou are Selected Standard-Single package!!\n");
               //display fixed price
               System.out.println("Fixed value : " +standardSingleFixed);

               System.out.println("\nIf you want to use below facilities please enter 'true' and you don't want use use please enter 'false'.\n");
               //display price of ther facilities
               System.out.println("\tFor Parking : " +parkingPrice);
               System.out.println("\tFor Ac      : " +acPrice);
               System.out.println("\tFor Wifi    : " +wifiPrice);

               System.out.print("\n");

               Scanner choice3 = new Scanner(System.in);
               //user selects facilities that she/he wants
               System.out.print("Parking : ");
               parking = choice3.nextBoolean();
               System.out.print("AC      : ");
               ac = choice3.nextBoolean();
               System.out.print("wifi    : ");
               wifi = choice3.nextBoolean();

              //Getting total
              total2+= room3.getChargeStandardSingle(parking,ac,wifi);

              //Display total of Standard-Single
              System.out.println("Your sub Total : "+total2);

               break;
          
               case 4:
                //Quit option
               System.out.println("Thank you for choosing ABCD Hotels");
               break;
          
               default:
                //If user enter invalid number
               System.out.println("Invalid Number!! Please choose numbers between 1 to 4");
               break;  
              }
          }
          
      }
  }