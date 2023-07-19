# ElectricityBillingSystem
This Java code creates a simple Electricity Billing System GUI application using Swing. The application allows the user to enter customer information. It then calculates the total amount of the electricity bill and displays the result to the user. The application also includes a "Refresh" button to clear the input fields.


# Electricity Billing System GUI Application

This Java application implements a simple Electricity Billing System with a graphical user interface (GUI) using Swing components. The application allows users to input customer information and calculate the total electricity bill based on the provided data.

## Overview

The Electricity Billing System GUI Application is designed to assist users in calculating the total amount to be billed for electricity usage. It offers an easy-to-use graphical interface that allows users to enter customer details and electricity consumption data. The application then processes this information and presents the calculated bill amount.

## Features

1. **Customer Information Input:** The application provides fields to enter the customer's ID, name, previous electricity reading, current electricity reading, and the unit rate ($ per unit).

2. **Calculate Bill:** Once the user enters the required information, they can click the "Calculate Bill" button. The application then validates the input and calculates the total amount to be billed based on the provided data.

3. **Error Handling:** The application ensures that all required fields are filled before performing the calculation. If any of the required fields are empty, the application displays an appropriate error message.

4. **Refresh Information:** The application includes a "Refresh Information" button, which allows the user to clear all input fields, making it convenient for them to enter new data.

## How to Use

1. Launch the application by running the `Main` class.

2. The application window titled "Electricity Billing System" will appear.

3. Enter the customer's ID, name, previous and current electricity readings, and the unit rate in the corresponding fields.

4. Click the "Calculate Bill" button to see the total amount to be billed. If any required field is empty, the application will display an error message prompting the user to fill in all necessary information.

5. To enter new data or reset the form, click the "Refresh Information" button.

## Dependencies

This application relies on the Java Standard Edition (SE) libraries, specifically `javax.swing` and `java.awt` for creating the graphical user interface.

