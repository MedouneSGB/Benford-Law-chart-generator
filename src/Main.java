package src;

public class Main extends TestCase{
    public static void main(String[] args) {

        //Get Data from TestCase
        TestCase tc = new TestCase();
        String[] data = tc.data;

        //Start BenfordLaw with data
        BenfordLaw bl = new BenfordLaw(data);
    }
}
