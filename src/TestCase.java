package src;

public class TestCase {

    //Initialize data to 100
    String[] data = new String[100];
    public TestCase(){

    // Generate multiplication list from 1 to 10
    int index = 0;
    for (int i = 1; i <= 10; i++) {
        for (int j = 1; j <= 10; j++) {
            int result = i * j;
            data[index] = String.valueOf(result);
            index++;
        }
    }

}
}
