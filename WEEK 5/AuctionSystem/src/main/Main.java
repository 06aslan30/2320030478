package main;
import observer.*;
import templater.*;

import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
        Auctioneer auctioneer = new Auctioneer();

        // Create bidders
        Bidder bidder1 = new Concrete("Alice");
        Bidder bidder2 = new Concrete("Bob");
        Bidder bidder3 = new Concrete("Charlie");

        // Subscribe bidders to auctioneer
        auctioneer.subscribe(bidder1);
        auctioneer.subscribe(bidder2);
        auctioneer.subscribe(bidder3);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose the auction type:");
        System.out.println("1. Standard Auction");
        System.out.println("2. Reserve Auction");

        int choice = scanner.nextInt();

        AuctionTemplate auction;

        if (choice == 1) {
            auction = new Standard(auctioneer);
        } else if (choice == 2) {
            System.out.print("Enter the reserve price: ");
            double reservePrice = scanner.nextDouble();
            auction = new Reserve(auctioneer, reservePrice);
        } else {
            System.out.println("Invalid choice. Exiting...");
            scanner.close();
            return;
        }

        // Conduct the auction
        auction.conductAuction();

        scanner.close();
    }

}
