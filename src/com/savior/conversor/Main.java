package com.savior.conversor;

import com.savior.conversor.api.ApiClient;
import com.savior.conversor.service.CurrencyConverterService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            var menu = """
                    1. Convert Dollars to Euros
                    2. Convert Euros to Dollars
                    3. Convert Dollars to Yen
                    4. Convert Yen to Dollars
                    5. Convert Soles to Dollars
                    6. Convert Dollars to Soles
                    7. Exit
                    """;
            System.out.println(menu);
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            switch (option) {
                case 1 -> CurrencyConverterService.convert(new ApiClient("EUR"), "USD", "EUR");
                case 2 -> CurrencyConverterService.convert(new ApiClient("USD"), "EUR", "USD");
                case 3 -> CurrencyConverterService.convert(new ApiClient("JPY"), "USD", "JPY");
                case 4 -> CurrencyConverterService.convert(new ApiClient("USD"), "JPY", "USD");
                case 5 -> CurrencyConverterService.convert(new ApiClient("PEN"), "USD", "PEN");
                case 6 -> CurrencyConverterService.convert(new ApiClient("USD"), "USD", "PEN");
                case 7 -> {
                    System.out.println("Exiting...");
                    System.exit(0);
                }
                default -> System.out.println("Invalid option");
            }
        } while (true);
    }
}
