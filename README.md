# Conversor de Monedas

Este proyecto es una aplicación simple de conversión de divisas desarrollada como parte de un **Challenge - Alura Latam**. Utiliza la API [ExchangeRate-API](https://www.exchangerate-api.com) para obtener los tipos de cambio actuales entre varias monedas. Los usuarios pueden convertir montos entre diferentes pares de divisas, como dólares a euros, euros a yenes, soles peruanos a dólares, entre otros.

## Características

- Conversión entre diferentes monedas: USD, EUR, JPY, PEN.
- Acceso en tiempo real a las tasas de cambio a través de la API de ExchangeRate.
- Interfaz basada en consola para una interacción simple.
- Validación de entradas del usuario para asegurar datos correctos.

## Requisitos Previos

- [Java 23+](https://jdk.java.net/23/)
- Una cuenta gratuita en [ExchangeRate-API](https://www.exchangerate-api.com) para obtener tu clave de API.

## Instalación

1. Clona este repositorio en tu máquina local:

    ```bash
    git clone https://github.com/S4vi0r17/conversor-moneda.git
    ```

2. Navega a la carpeta del proyecto:

    ```bash
    cd conversor-de-monedas
    ```

3. Actualiza la clave de API en la clase `ApiClient.java` con tu propia clave de la API ExchangeRate. Busca la siguiente línea y reemplaza `tu-api-key` por la clave que obtuviste en tu cuenta de ExchangeRate.

    ```java
    private final String apiKey = "tu-api-key";
    ```

## Uso

1. Compila el proyecto
   
2. Ejecuta la aplicación:

3. En el menú de la aplicación, selecciona la opción de conversión que deseas realizar introduciendo el número correspondiente. Por ejemplo:

    ```
    1. Convert Dollars to Euros
    2. Convert Euros to Dollars
    3. Convert Dollars to Yen
    4. Convert Yen to Dollars
    5. Convert Soles to Dollars
    6. Convert Dollars to Soles
    7. Exit
    Choose an option: 1
    ```

    Luego, ingresa la cantidad que deseas convertir.

4. La aplicación te mostrará el monto convertido con base en las tasas de cambio actuales obtenidas de la API.
