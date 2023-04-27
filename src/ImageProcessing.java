package src;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.imageio.ImageIO;
import java.awt.Desktop;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * src.ImageProcessing using JFreeChart
 * JFreeChart (http://www.jfree.org/jfreechart/
 */

public class ImageProcessing {
    public ImageProcessing(double[] observedProportions, double[] expectedProportions) {

        String outputPath = "output/chart"; // Default output path
        int counter = 0; // Initialize counter
        File file; // Declare file object

        //Add information to a dataset
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (int i = 1; i < 10; i++) {
            dataset.addValue(observedProportions[i], "observed", Integer.toString(i));
            dataset.addValue(expectedProportions[i], "expected", Integer.toString(i));
        }

        //Chart generation
        JFreeChart chart = ChartFactory.createBarChart("Benford", "First Digit", "Proportion", dataset);
        //Convert chart to BufferedImage
        BufferedImage image = chart.createBufferedImage(800, 600);

        //Check duplication
        do {
            // Create file object with the desired output path
            file = new File(outputPath + counter + ".png");
            // Increment counter to avoid overwriting existing files
            counter++;

        } while (file.exists()); // Loop while file exists

        // Save the image to a file
        try {
            //Create destination folder if it doesn't exist
            File directory = new File("./output/");
            directory.mkdirs();

            //Generate image
            ImageIO.write(image, "png", file);

            //Print image location
            System.out.println("");
            System.out.println("Image saved to " + file.getAbsolutePath());

            // open the file using the default system application
            Desktop.getDesktop().open(directory);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    }

