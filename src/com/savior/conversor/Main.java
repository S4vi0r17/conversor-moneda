package com.savior.conversor;

import com.savior.conversor.api.ApiClient;
import com.savior.conversor.service.CurrencyConverterService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ApiClient apiClient;
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
                case 1 -> {
                    apiClient = new ApiClient("EUR");
                    CurrencyConverterService.convert(apiClient, "USD", "EUR");
                }
                case 2 -> {
                    apiClient = new ApiClient("USD");
                    CurrencyConverterService.convert(apiClient, "EUR", "USD");
                }
                case 3 -> {
                    apiClient = new ApiClient("JPY");
                    CurrencyConverterService.convert(apiClient, "USD", "JPY");
                }
                case 4 -> {
                    apiClient = new ApiClient("USD");
                    CurrencyConverterService.convert(apiClient, "JPY", "USD");
                }
                case 5 -> {
                    apiClient = new ApiClient("PEN");
                    CurrencyConverterService.convert(apiClient, "USD", "PEN");
                }
                case 6 -> {
                    apiClient = new ApiClient("USD");
                    CurrencyConverterService.convert(apiClient, "USD", "PEN");
                }
                case 7 -> {
                    System.out.println("Exiting...");
                    System.exit(0);
                }
                default -> System.out.println("Invalid option");
            }
        } while (true);
    }
}
