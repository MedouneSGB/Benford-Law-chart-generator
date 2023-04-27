package src;

import java.util.*;

public class BenfordLaw{
    public BenfordLaw(String[] data) {


        // Calculate the frequency of appearance of the first digit in the data
        int[] counts = new int[10];
        for (int i = 0; i < data.length; i++) {
            String number = data[i];
            int firstDigit = Integer.parseInt(Character.toString(number.charAt(0)));
            counts[firstDigit]++;
        }

        // Calculation of the expected proportion for each digit according to Benford's law
        double[] expectedProportions = new double[10];
        for (int i = 1; i < 10; i++) {
            expectedProportions[i] = Math.log10(1 + 1.0/i);
        }

        // Calculation of the observed proportion for each digit in the data
        double[] observedProportions = new double[10];
        int totalCount = data.length;
        for (int i = 1; i < 10; i++) {
            observedProportions[i] = (double) counts[i] / totalCount;
        }

        //Launch ImageProcessing
        ImageProcessing ip = new ImageProcessing(observedProportions,expectedProportions);

    }
}
