/* ***********************************************************************
* Catherine Kim
* Assignment 2 - Bowling
* Computer Science 30 IB Block 10
* 2020-12-08
* This program is my own work - CK   */

package com.company;
import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
       //instantiation of bowling
       Bowling bowling = new Bowling();
       //the scanner is set for input
       Scanner input = new Scanner(System.in);
       String choice = "", next;
       //int for the score and highscore
       int highscore = 0;
       int score;
       // boolean for quitting the program
       boolean quit = false;
       //introduction
       System.out.println("Hello and welcome to Catherine's Bowling Arena! My name is Bo Wling and I will be your assistant for today! What is your name?");
       String name = input.nextLine();
       System.out.println("Nice to meet you, " + name + " :)!");
       System.out.println("Today, you will be playing a bowling game in which you throw the ball to knock down 10 pins twice each round, with 10 rounds in total!");
       while (!quit) {
           //choosing the mode of the bowling game
           System.out.println("What mode would you like to play in? Easy mode (1), medium mode (2), hard mode(any other key)");
           bowling.mode = input.next();
           while (bowling.round < 11) {
               System.out.println("-------------------------------");
               bowling.display();
               System.out.println("Press any key to throw the ball, " + name + "!");
               next = input.next();
               //a secret easter egg to get extra points
               if (next.equals("points")) {
                   System.out.println("\nYou found the easter egg!" + " Good job, " + name + "!" + " Get 3 more points!\n");
                   bowling.pointSum += 3;
               }
               //calling the methods from the object
               bowling.score1 = bowling.bowl();
               //a strike
               if (bowling.score1 == 10) {
                   bowling.pointTotal += 20;
                   bowling.pointSum += 20;
                   bowling.pin1 = true;
                   bowling.pin2 = true;
                   bowling.pin3 = true;
                   bowling.pin4 = true;
                   bowling.pin5 = true;
                   bowling.pin6 = true;
                   bowling.pin7 = true;
                   bowling.pin8 = true;
                   bowling.pin9 = true;
                   bowling.pin10 = true;
                   System.out.println("STRIKE!!");
                   bowling.showScore();
                   bowling.display();
               } else {
                   //assign points and change the diagram
                   switch (bowling.score1) {
                       case 0:
                           System.out.println("GUTTER!");
                           break;
                       case 1:
                           bowling.pin1 = true;
                           break;
                       case 2:
                           bowling.pin1 = true;
                           bowling.pin2 = true;
                           break;
                       case 3:
                           bowling.pin1 = true;
                           bowling.pin2 = true;
                           bowling.pin5 = true;
                           break;
                       case 4:
                           bowling.pin1 = true;
                           bowling.pin2 = true;
                           bowling.pin5 = true;
                           bowling.pin8 = true;
                           break;
                       case 5:
                           bowling.pin1 = true;
                           bowling.pin2 = true;
                           bowling.pin8 = true;
                           bowling.pin10 = true;
                           bowling.pin5 = true;
                           break;
                       case 6:
                           bowling.pin1 = true;
                           bowling.pin2 = true;
                           bowling.pin8 = true;
                           bowling.pin10 = true;
                           bowling.pin5 = true;
                           bowling.pin6 = true;
                           break;
                       case 7:
                           bowling.pin1 = true;
                           bowling.pin2 = true;
                           bowling.pin8 = true;
                           bowling.pin10 = true;
                           bowling.pin5 = true;
                           bowling.pin6 = true;
                           bowling.pin9 = true;
                           break;
                       case 8:
                           bowling.pin1 = true;
                           bowling.pin2 = true;
                           bowling.pin3 = true;
                           bowling.pin10 = true;
                           bowling.pin5 = true;
                           bowling.pin6 = true;
                           bowling.pin9 = true;
                           bowling.pin8 = true;
                           break;
                       case 9:
                           bowling.pin1 = true;
                           bowling.pin2 = true;
                           bowling.pin3 = true;
                           bowling.pin10 = true;
                           bowling.pin5 = true;
                           bowling.pin6 = true;
                           bowling.pin7 = true;
                           bowling.pin8 = true;
                           bowling.pin9 = true;
                           break;
                   }
                   //assign points and display points
                   bowling.pointTotal += bowling.score1;
                   bowling.pointSum += bowling.score1;
                   bowling.showScore();
                   bowling.display();
                   System.out.println("Press any key to throw the ball again, " + name + "!");
                   next = input.next();
                   //a secret easter egg to get extra points
                   if (next.equals("points")) {
                       System.out.println("\nYou found the easter egg!" + " Good job, " + name + "!" + " Get 3 more points!\n");
                       bowling.pointSum += 3;
                   }
                   bowling.score2 = bowling.bowl();
                   bowling.pointSum -= bowling.score1;
                   bowling.pointTotal -= bowling.score1;
                   score = bowling.score1 + bowling.score2;
                   //the second frame with combined score
                   switch (score) {
                       case 0:
                           System.out.println("GUTTER!");
                           break;
                       case 1:
                           bowling.pin1 = true;
                           break;
                       case 2:
                           bowling.pin1 = true;
                           bowling.pin2 = true;
                           break;
                       case 3:
                           bowling.pin1 = true;
                           bowling.pin2 = true;
                           bowling.pin5 = true;
                           break;
                       case 4:
                           bowling.pin1 = true;
                           bowling.pin2 = true;
                           bowling.pin5 = true;
                           bowling.pin8 = true;
                           break;
                       case 5:
                           bowling.pin1 = true;
                           bowling.pin2 = true;
                           bowling.pin8 = true;
                           bowling.pin10 = true;
                           bowling.pin5 = true;
                           break;
                       case 6:
                           bowling.pin1 = true;
                           bowling.pin2 = true;
                           bowling.pin8 = true;
                           bowling.pin10 = true;
                           bowling.pin5 = true;
                           bowling.pin6 = true;
                           break;
                       case 7:
                           bowling.pin1 = true;
                           bowling.pin2 = true;
                           bowling.pin8 = true;
                           bowling.pin10 = true;
                           bowling.pin5 = true;
                           bowling.pin6 = true;
                           bowling.pin9 = true;
                           break;
                       case 8:
                           bowling.pin1 = true;
                           bowling.pin2 = true;
                           bowling.pin3 = true;
                           bowling.pin10 = true;
                           bowling.pin5 = true;
                           bowling.pin6 = true;
                           bowling.pin9 = true;
                           bowling.pin8 = true;
                           break;
                       case 9:
                           bowling.pin1 = true;
                           bowling.pin2 = true;
                           bowling.pin3 = true;
                           bowling.pin10 = true;
                           bowling.pin5 = true;
                           bowling.pin6 = true;
                           bowling.pin7 = true;
                           bowling.pin8 = true;
                           bowling.pin9 = true;
                           break;
                           //a spare
                       default:
                           bowling.pointTotal = 15;
                           bowling.score2 = 10 - bowling.score1;
                           bowling.pin1 = true;
                           bowling.pin2 = true;
                           bowling.pin3 = true;
                           bowling.pin4 = true;
                           bowling.pin5 = true;
                           bowling.pin6 = true;
                           bowling.pin7 = true;
                           bowling.pin8 = true;
                           bowling.pin9 = true;
                           bowling.pin10 = true;
                           System.out.println("SPARE!");
                   }
                   //assigning points
                   bowling.pointSum += score;
                   bowling.pointTotal += score;
                   bowling.showScore();
                   bowling.display();
               }
               //resetting each turn
               bowling.reset();
               bowling.round++;
           }
           //setting high scores
           if (bowling.pointSum > highscore) {
               highscore = bowling.pointSum;
               System.out.println("\nCongratulations, " + name + "! You beat the highscore with a score of " + highscore + "!");
           } else {
               System.out.println("\nSo close, " + name + ". You were " + (highscore - bowling.pointSum) + " points away from beating the highscore.");
           }
           //playing again
           System.out.println("Do you want to play again? Type 'quit' to quit or any key to continue!");
           choice = input.next();
           choice.toLowerCase();
           if (choice.equals("quit")) {
               System.out.println("Goodbye, " + name + "!");
               quit = true;
           } else {
               System.out.println("Playing another game, " + name + "!");
               bowling.pointSum = 0;
               bowling.round = 1;
               bowling.reset();
           }
       }
   }
   }


//==================================================================

//Bowling.java

package com.company;
import java.util.Random;

public class Bowling {

   // instance variables (private)
   private Random throwBall;
   public boolean pin1, pin2, pin3, pin4, pin5, pin6, pin7, pin8, pin9, pin10;
   public int round = 1, score1 = 0, score2 = 0, pointTotal = 0, pointSum = 0, result;
   public String mode;

   // constructor (the name needs to match the class (java file))

   public Bowling (){
       throwBall = new Random();
   }

   // method that bowls with multiple modes
   public int bowl(){
       //easy mode, no chance of gutter
       if (mode.equals("1")) {
           result = throwBall.nextInt(10) + 1;
       }
       //medium mode
       if (mode.equals("2")){
           result = throwBall.nextInt(11);
       }
       //harder mode, like dice
       else{
           result = ((throwBall.nextInt(7) + 1) + (throwBall.nextInt(7)) -2);
       }
       return result;
   }
//method for showing the diagram of the bowling
   public void display(){
       if (pin1 == true){
           System.out.print("[X]");
       }
       else{
           System.out.print("[0]");
       }
       if (pin2 == true){
           System.out.print("     [X]");
       }
       else{
           System.out.print("     [0]");
       }
       if (pin3 == true){
           System.out.print("     [X]");
       }
       else{
           System.out.print("     [0]");
       }
       if (pin4 == true){
           System.out.print("     [X]");
       }
       else {
           System.out.print("     [0]");
       }
       if (pin5 == true){
           System.out.print("\n    [X]");
       }
       else{
           System.out.print("\n    [0]");
       }
       if (pin6 == true){
           System.out.print("     [X]");
       }
       else{
           System.out.print("     [0]");
       }
       if (pin7 == true){
           System.out.print("     [X]");
       }
       else{
           System.out.print("     [0]");
       }
       if (pin8 == true){
           System.out.print("\n        [X]");
       }
       else{
           System.out.print("\n        [0]");
       }
       if (pin9 == true){
           System.out.print("     [X]");
       }
       else{
           System.out.print("     [0]");
       }
       if (pin10 == true){
           System.out.println("\n            [X]");
       }
       else{
           System.out.println("\n            [0]");
       }
   }
   //method for displaying the score
   public void showScore(){
       System.out.println("Round "+ round +"\nScore of first throw: "+score1 +"\nScore of second throw: " + score2+"\nRound points: " + pointTotal+"\nTotal points: " + pointSum);
       System.out.println();
       System.out.println();
   }
   //method for resetting the score
   public void reset(){
       pointTotal = 0;
       score1 = 0;
       score2 = 0;
       pin1 = false;
       pin2 = false;
       pin3 = false;
       pin4 = false;
       pin5 = false;
       pin6 = false;
       pin7 = false;
       pin8 = false;
       pin9 = false;
       pin10 = false;
   }


}


