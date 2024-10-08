package com.savior.conversor.service;

import com.savior.conversor.api.ApiClient;

import java.util.Scanner;

public class CurrencyConverterService {
    static Scanner scanner = new Scanner(System.in);

    public static void convert(ApiClient apiClient, String from, String to ) {
        
        try {
            System.out.print("Enter the amount in " + from + ": ");
            double amount = scanner.nextDouble();
            System.out.println("Converting " + from + " to " + to + "...");
            String rate = apiClient.getExchangeRate().conversionRates().get(to).toString();
            System.out.println("The amount in " + to + " is: " + amount * Double.parseDouble(rate));
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid number.");
            scanner.next();
        }
    }
}
