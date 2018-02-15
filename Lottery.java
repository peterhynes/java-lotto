/*
Lottery.java
@ Peter hynes
4 th Dec 2017
*/

public class Lottery{
	//vars - setting up private data members/variables
	private int line1[]; //setting up int arrays for the user input
	private int line2[];
	private int line3[];
	private int winningNumbers[]; // setting up int array for the randomly generated numbers
	private int correctLine1; //setting up variables for the counter to count the matching numbers on each line when compared to the random generated numbers
	private int correctLine2;
	private int correctLine3;
	private int winningsLine1; //setting up variables for the amount of winnings for each line
	private int winningsLine2;
	private int winningsLine3;


	//constructor - creating the Lottery constructor
	public Lottery(){
		line1 = new int[6]; //assigning lines as 6 digit arrays
		line2 = new int[6];
		line3 = new int[6];
		winningNumbers = new int[6]; //assigning the randomly generated winning numbers as a 6 digit array
		correctLine1 = 0; // setting the counter to 0 for matching numbers between the user input and the randomly generated numbers
		correctLine2 = 0;
		correctLine3 = 0;
		winningsLine1 = 0; //setting the winnings from each line to 0
		winningsLine2 = 0;
		winningsLine3 = 0;
	}

	//setters x 3 for user input - 3 lines of input = 3 setters
	public void setLine1(int line1[]){
		this.line1 = line1;
	}

	public void setLine2(int line2[]){
			this.line2 = line2;
	}

	public void setLine3(int line3[]){
			this.line3 = line3;
	}


	//compute - doing all tha calculations
	public void compute(){
		for(int i=0;i<winningNumbers.length;i++){// setting up loop to generate 6 rnandom numbers between 1 and 40
			winningNumbers[i]=(int)(Math.random()*40)+1;// +1 tell math.random to start at 1 instead of 0
			for(int j=0;j<i;j++){// inner loop to check for repitition and ensure the numbers are unique
				if(winningNumbers[i]==winningNumbers[j]){// checking if the next number genrated = the number already in the array
					i--; //removes the number if it is already in the array
				}
			}
		}


		//counter to check if users numbers match the 6 random numbers, if they do add 1 to counters
		for(int i=0;i<line1.length;i++){//setting up loop to iterate through line 1
			for(int j=0;j<winningNumbers.length;j++){//setting up loop to iterate through 6 random numbers
				if(line1[i]==winningNumbers[j]){ //check if the numbers in the arrays match
					correctLine1++; //add 1 to the counter if they do match
					if(correctLine1 == 3){ // if there are 3 matching numbers
						winningsLine1 = 9; //the winnings from that line are 9 euro
					}
					else if(correctLine1 == 4){ // if there are 4 matching numbers
						winningsLine1 = 54; //the winnings from that line are 54 euro
					}
					else if(correctLine1 == 5){ // if there are 5 matching numbers
						winningsLine1 = 1000; //the winnings from that line are 1000 euro
					}
					else if(correctLine1 == 6){ // if there are 6 matching numbers
						winningsLine1 = -1; // variable is set to -1, this is used in the app class to print "you won the lotto"
					}
					else
					{
						winningsLine1 = 0; // if matching numbers = anything else, you win nothing
					}

				}
			}
		}//close loop for line 1

		//Same code as above except for line 2 check if users numbers match the 6 random numbers, if they do add 1 to counters
		for(int i=0;i<line2.length;i++){//setting up loop to iterate through line 2
			for(int j=0;j<winningNumbers.length;j++){//setting up loop to iterate through 6 random numbers
				if(line2[i]==winningNumbers[j]){//check if the numbers in the arrays match
					correctLine2++; //add 1 to the counter if they do match
					if(correctLine2 == 3){ // if there are 3 matching numbers
						winningsLine2 = 9; //the winnings from that line are 9 euro
					}
					else if(correctLine2 == 4){ // if there are 4 matching numbers
						winningsLine2 = 54; //the winnings from that line are 54 euro
					}
					else if(correctLine2 == 5){ // if there are 5 matching numbers
						winningsLine2 = 1000; //the winnings from that line are 1000 euro
					}
					else if(correctLine2 == 6){ // if there are 6 matching numbers
						winningsLine2 = -1; // variable is set to -1, this is used in the app class to print "you won the lotto"
					}
					else
					{
						winningsLine2 = 0; // if matching numbers = anything else, you win nothing
					}
				}
			}
		}//close loop for line 2


		//Same code as above except for line 2 check if users numbers match the 6 random numbers, if they do add 1 to counters
		for(int i=0;i<line3.length;i++){ //setting up loop to iterate through line 3
			for(int j=0;j<winningNumbers.length;j++){ //setting up loop to iterate through 6 random numbers
				if(line3[i]==winningNumbers[j]){ //check if the numbers in the arrays match
					correctLine3++; //add 1 to the counter if they do match
					if(correctLine3 == 3){ // if there are 3 matching numbers
						winningsLine3 = 9; //the winnings from that line are 9 euro
					}
					else if(correctLine3 == 4){ // if there are 4 matching numbers
						winningsLine3 = 54; //the winnings from that line are 54 euro
					}
					else if(correctLine3 == 5){ // if there are 5 matching numbers
						winningsLine3 = 1000; //the winnings from that line are 1000 euro
					}
					else if(correctLine3 == 6){ // if there are 6 matching numbers
						winningsLine3 = -1; // variable is set to -1, this is used in the app class to print "you won the lotto"
					}
					else
					{
						winningsLine3 = 0; // if matching numbers = anything else, you win nothing
					}
				}
			}
		}//close loop for line 3

	}//close compute


	//getters - to send info back to the app
		public int[] getWinningNumbers(){
			return winningNumbers; //returns the 6 random numbers to the app
		}

		public int[] getLine1(){
			return line1; //returns the users numbers for line 1
		}

		public int[] getLine2(){
			return line2; //returns the users numbers for line 2
		}

		public int[] getLine3(){
			return line3; //returns the users numbers for line 3
		}

		public int getCorrectLine1(){
			return correctLine1; //returns the amount of matching number on line 1
		}

		public int getCorrectLine2(){
			return correctLine2; //returns the amount of matching number on line 2
		}

		public int getCorrectLine3(){
			return correctLine3; //returns the amount of matching number on line 3
		}

		public int getWinningsLine1(){
			return winningsLine1; //returns the amount of money won on line 1
		}

		public int getWinningsLine2(){
			return winningsLine2; //returns the amount of money won on line 2
		}

		public int getWinningsLine3(){
			return winningsLine3; //returns the amount of money won on line 3
		}


} //close class
