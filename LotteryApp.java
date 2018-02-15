/*
LotteryApp.java
@ Peter hynes
4 th Dec 2017
*/
import java.util.*; //import java util package to allow the use of Scanner
import javax.swing.JOptionPane; //imports JOptionPane to allow message boxs for input and output
 public class LotteryApp{ //creates the LotterApp class
	 public static void main(String args[]){ //set the entry point to the app

		 JOptionPane.showMessageDialog(null,"Welcome to the LotteryApp, we will play 3 lines. Press ok to continue"); //Shows message box to start the interaction with user

		 String playAgain = ""; // set variable, the contents of this variable decides if the app loops/plays again
		 do{ //start of do while loop which enables the play again option


		 //vars - setting up data members/variables
		 int line1[] = new int [6]; //assigning lines as 6 digit arrays
		 int line2[] = new int [6];
		 int line3[] = new int [6];
		 int winningNumbers[] = new int [6]; //assigning the randomly generated winning numbers as a 6 digit array
		 int correctLine1 = 0; // setting the counter to 0 for matching numbers between the user input and the randomly generated numbers
		 int correctLine2 = 0;
		 int correctLine3 = 0;
		 int winningsLine1 = 0; //setting the winnings from each line to 0
		 int winningsLine2 = 0;
		 int winningsLine3 = 0;


		//declare objects
		 Scanner keyboard; //using the scanner class of java.util and creating the keyboard option
		 keyboard=new Scanner(System.in); //creating a new scanner class called keyboard which will take user input
		 Lottery myLottery = new Lottery(); //pulling in the lottery class


		//input - getting user input
		 for(int i=0;i<line1.length;i++){ //setting up loop to take input of 6 numbers
			 line1[i] = Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter your number "+(i+1)+ " for line1")); //using JOptionPane to take array input for 6 numbers
			 if(line1[i]<1||line1[i]>40){ //checking if numbers being input are between 1 and 40
				 i--; //if number is not between 1 and 40 remove it from array
				 JOptionPane.showMessageDialog(null, "Number not valid, pick a number between 1 and 40"); //tell user number is not valid and ask for another
			 }
			 for(int j=0;j<i;j++){ //setting up loop to check if numbers are unique for this line
				 if(line1[i]==line1[j]){ //looping through the array and checking if number entered is already in the array
					 i--; //remove number if it is already in the array
					 JOptionPane.showMessageDialog(null, "Number already picked, try another number"); //asks user to pick another number if the one entered is not valid
				 }
			 }
		 } //close line 1 input loop
		 myLottery.setLine1(line1); //sets the Line1 array numbers for the Lottery class


		// same code as above but taking input for line 2 this time
		 for(int i=0;i<line2.length;i++){ //setting up loop to take input of 6 numbers
			 line2[i] = Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter your number "+(i+1)+ " for line2")); //using JOptionPane to take array input for 6 numbers
			 if(line2[i]<1||line2[i]>40){ //checking if numbers being input are between 1 and 40
				 i--; //if number is not between 1 and 40 remove it from array
				 JOptionPane.showMessageDialog(null, "Number not valid, pick a number between 1 and 40"); //tell user number is not valid and ask for another
			 }
			 for(int j=0;j<i;j++){ //setting up loop to check if numbers are unique for this line
				 if(line2[i]==line2[j]){ //looping through the array and checking if number entered is already in the array
					 i--; //remove number if it is already in the array
					 JOptionPane.showMessageDialog(null, "Number already picked, try another number"); //asks user to pick another number if the one entered is not valid
				 }
			 }
		 } //close line 2 input loop
		 myLottery.setLine2(line2); //sets the Line2 array numbers for the Lottery class



		// same code as above but taking input for line 3 this time
		 for(int i=0;i<line3.length;i++){ //setting up loop to take input of 6 numbers
			 line3[i] = Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter your number "+(i+1)+ " for line3")); //using JOptionPane to take array input for 6 numbers
			 if(line3[i]<0||line3[i]>40){ //checking if numbers being input are between 1 and 40
				 i--; //if number is not between 1 and 40 remove it from array
				 JOptionPane.showMessageDialog(null, "Number not valid, pick a number between 1 and 40"); //tell user number is not valid and ask for another
			 }
			 for(int j=0;j<i;j++){ //setting up loop to check if numbers are unique for this line
				 if(line3[i]==line3[j]){ //looping through the array and checking if number entered is already in the array
					 i--; //remove number if it is already in the array
					 JOptionPane.showMessageDialog(null,"Number already picked, try another number"); //asks user to pick another number if the one entered is not valid
				 }
			 }
		 }// close line 3 input loop
		 myLottery.setLine3(line3); //sets the Line3 array numbers for the Lottery class



		//process
		 myLottery.compute(); //pulls in the compute process from the Lottery class

		//getters - gets the info from the Lottery class
		 line1 = myLottery.getLine1(); //pulls in line 1 figures from the Lottery class
		 line2 = myLottery.getLine2(); //pulls in line 2 figures from the Lottery class
		 line3 = myLottery.getLine3(); //pulls in line 3 figures from the Lottery class
		 winningNumbers = myLottery.getWinningNumbers(); //pulls in winning numbers from the Lottery class
		 correctLine1 = myLottery.getCorrectLine1(); //pulls in amount of matching numbers in line 1 from the Lottery class
		 correctLine2 = myLottery.getCorrectLine2(); //pulls in amount of matching numbers in line 2 from the Lottery class
		 correctLine3 = myLottery.getCorrectLine3(); //pulls in amount of matching numbers in line 3 from the Lottery class
		 winningsLine1 = myLottery.getWinningsLine1(); //pulls in amount of money won in line 1 from the Lottery class
		 winningsLine2 = myLottery.getWinningsLine2(); //pulls in amount of money won in line 2 from the Lottery class
		 winningsLine3 = myLottery.getWinningsLine3(); //pulls in amount of money won in line 3 from the Lottery class


		//start of output after all numbers have been entered
		System.out.println("The winning numbers are " +Arrays.toString(winningNumbers));//Prints the winning numbers in a line using to.String to get the required info from the array
		System.out.println("Line 1 numbers are " +Arrays.toString(line1)); //Prints the line1 numbers in a line using to.String to get the required info from the array
		System.out.println("Line 2 numbers are " +Arrays.toString(line2)); //Prints the line2 numbers in a line using to.String to get the required info from the array
		System.out.println("Line 3 numbers are " +Arrays.toString(line3)); //Prints the line3 numbers in a line using to.String to get the required info from the array
		System.out.println("Matchng numbers on line 1: " +correctLine1); //Prints the amount of matching numbers between line 1 and the random generated numbers
		System.out.println("Matchng numbers on line 2: " +correctLine2); //Prints the amount of matching numbers between line 2 and the random generated numbers
		System.out.println("Matchng numbers on line 3: " +correctLine3); //Prints the amount of matching numbers between line 3 and the random generated numbers

		//prints the winnings including if the lotto was won
		if(winningsLine1 == -1){ //if statement, will print "You won the Lotto" if winningsLine1 returns -1 which is what is returned if all 6 numbers in the line match the random 6 numbers
			System.out.println("You won the Lotto");
		}
		else{ //if winningsLine1 returns anything other than -1 then the content of the variable winningsLine1 is printed
			System.out.println("Winnings from Line 1 are: " +winningsLine1);
		}

		if(winningsLine2 == -1){ //if statement, will print "You won the Lotto" if winningsLine2 returns -1 which is what is returned if all 6 numbers in the line match the random 6 numbers
			System.out.println("You won the Lotto");
		}
		else{ //if winningsLine2 returns anything other than -1 then the content of the variable winningsLine2 is printed
			System.out.println("Winnings from Line 2 are: " +winningsLine2);
		}

		if(winningsLine3 == -1){ //if statement, will print "You won the Lotto" if winningsLine3 returns -1 which is what is returned if all 6 numbers in the line match the random 6 numbers
			System.out.println("You won the Lotto");
		}
		else{ //if winningsLine3 returns anything other than -1 then the content of the variable winningsLine3 is printed
			System.out.println("Winnings from Line 3 are: " +winningsLine3);
		}


		//print total winnings - adds all the winnings and prints the output
		if(winningsLine1 == -1){ // if the lotto is won on lne 1 it will print You won the Lotto and + the winning from the other lines
			System.out.println("You won the Lotto and "+(winningsLine2+winningsLine3)+" euro");
		}
		else if(winningsLine2 == -1){ // if the lotto is won on lne 2 it will print You won the Lotto and + the winning from the other lines
			System.out.println("You won the Lotto and "+(winningsLine1+winningsLine3)+" euro");
		}
		else if(winningsLine3 == -1){ // if the lotto is won on lne 3 it will print You won the Lotto and + the winning from the other lines
			System.out.println("You won the Lotto and "+(winningsLine1+winningsLine2)+" euro");
		}
		else{ // if the lotto is not won it will print the winning from the 3 lines
			System.out.println("Your total winnings are "+(winningsLine1+winningsLine2+winningsLine3)+" euro");
		}


		//Continuation of do while loop started at the top
		System.out.println("Would you like to play again	Y/N?"); //Asks user do they want to play again
		playAgain=keyboard.nextLine(); //takes user input ant puts it in a variable playAgain
		}while(playAgain.equalsIgnoreCase("Y")); //as long as playAgain is Y then the app will start again, any other answer and it will end


	}

}

