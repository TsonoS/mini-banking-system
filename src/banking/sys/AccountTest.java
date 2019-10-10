/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking.sys;

import java.util.Scanner;

public class AccountTest {
     // main method begins execution of Java application
    public static void main( String args[] ) 
    {
        Account account1 = new Account( 50.00, 1 ); // create Account object
        Account account2 = new Account( -7.53, 2 ); // create Account object

        // display initial balance of each object
        account1.getBalance();
        account2.getBalance();

        // create Scanner to obtain input from command window
        Scanner input = new Scanner( System.in );
        double depositAmount; // deposit amount read from user

        System.out.print( "Enter deposit amount (in Pula) into your Account: " );
        depositAmount = input.nextDouble(); // obtain user input
        System.out.printf( "\nadding %.2f Pula to your Account balance\n", depositAmount );
        account2.credit( depositAmount ); // add amount to account1

        // display balances
        account1.getBalance();
        account2.getBalance();

        // create Scanner to obtain input from command window
        input = new Scanner( System.in );
        double withdrawalAmount; // withdrawal amount read from user

        System.out.print( "Enter withdrawal amount (in Pula): " ); 
        withdrawalAmount = input.nextDouble(); // obtain user input
        System.out.printf( "\nsubtracting %.2f Pula from your Account balance\n", withdrawalAmount );
        account1.debit( withdrawalAmount ); // subtract amount from account2
        
        // display balances
        account1.getBalance();
        account2.getBalance();
    } // end main
    
}
