# Benford-Law-chart-generator

This project is a Java program that checks the distribution of the first digits of a set of data against Benford's Law. Benford's Law is an observation that in many naturally occurring datasets, the first digit of each number is more likely to be small (e.g. 1, 2, or 3) than large (e.g. 8 or 9). This law has been used to detect financial fraud and other irregularities.

The program takes an array of data as input, calculates the distribution of the first digits of the data, and generates a bar chart comparing this distribution to the expected distribution according to Benford's Law. The resulting chart is saved as a PNG image in the `output` folder.

## Requirements

- Java Development Kit (JDK) version 8 or higher
- JFreeChart library version 1.0.19 or higher

## Installation

1. Clone this repository to your local machine
2. Install the JDK if you haven't already done so
3. Download the JFreeChart library and add the JAR file to the classpath of your Java project
4. Compile the `Main.java` file in the `src` folder using `javac`
5. Run the compiled `Main` class using `java Main`

## Usage

To use this program, you can modify the `data` array in the `TestCase` class to contain your own data. The data must be represented as an array of strings, with each string containing a single number.

Once you have set up the data, run the program by running the `Main` class. The resulting bar chart will be saved as a PNG image in the `output` folder.

## Example

An example `data` array has been provided in the `TestCase` class. It contains the multiplication results of the numbers 1 to 10. When the `Main` class is run with this data, the resulting bar chart shows that the distribution of the first digits of the multiplication results closely follows Benford's Law.

![chart0](https://user-images.githubusercontent.com/40875400/234796595-7ccb045f-2b9a-4290-af24-e49c6da7ddc4.png)

## Credits

This program was Ultra🔥created by [MSGB](https://github.com/MedouneSGB)  
I wanna thanks `ChatGPT` for generating this Readme,  
Also my copilot `GithubCopilot` for their help.

[![Made-In-Senegal](https://github.com/GalsenDev221/made.in.senegal/blob/master/assets/badge.svg)](https://github.com/GalsenDev221/made.in.senegal)  
