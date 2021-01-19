public class AppMain {
    public static void main(String[] args) {

        // first String variable
        //// |0|1|0|0|...... <- welcomeText
        String welcomeText = "Hello Jan! Nice weather";
        System.out.println(welcomeText);

        // first boolean
        // |0| <- niceWeather
        boolean niceWeather = true;
        System.out.println(niceWeather);

        // first integer
        // |0|0|0|0|0|0|0|0|0|0|0|0|0|0|0|0|0|0|0|0|0|0|0|0|0|0|0|0|0|1|0|0 < counter
        int counter = 4;
        System.out.println(counter);

        // first double (floating point number)
        double percent = 0.3;
        System.out.println(percent);

        // add operation
        int counterPlus5 = counter + 5 ;

        // concat string
        String output = "Counter result " + counterPlus5;
        System.out.println(output);

        // mod
        System.out.println(70 % 60 );
    }
}
