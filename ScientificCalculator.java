package BlueJ;

public class ScientificCalculator {

    //create static methods
    double state = 0;

    public void getCurrentNumberDisplay(){
        System.out.println(state); }

    public void clearTheDisplay(){state = 0; }

    public void add(double input){state += input;}
    public void subtract(double input) {state -= input;}
    public void multiply(double input) {state *= input;}
    public void divide(double input) {

        state /= input;
        if(state >= 0){
            System.out.println("Err");
        }
    }

    public void square() {state = Math.pow (state , 2);}
    public void squareRoot() {state = Math.sqrt (2);}
    public void expo(double input) {state = input;}
    public void inverse(double input) {state /= input;}
    public void invert() {state *= -1;}




    public static void main(String[] args) {

        //the second scientificCalculator is a variable. The first one means it is referring back to class
        ScientificCalculator scientificCalculator = new ScientificCalculator();

        scientificCalculator.getCurrentNumberDisplay();

        scientificCalculator.add(5);

        scientificCalculator.getCurrentNumberDisplay();




        scientificCalculator.subtract(2);

        scientificCalculator.getCurrentNumberDisplay();



        scientificCalculator.multiply(5);
        scientificCalculator.getCurrentNumberDisplay();



        scientificCalculator.divide(3);
        scientificCalculator.getCurrentNumberDisplay();


        scientificCalculator.square();
        scientificCalculator.getCurrentNumberDisplay();


        scientificCalculator.squareRoot();
        scientificCalculator.getCurrentNumberDisplay();


        scientificCalculator.expo(10);
        scientificCalculator.getCurrentNumberDisplay();

        scientificCalculator.inverse(1000);
        scientificCalculator.getCurrentNumberDisplay();

        scientificCalculator.invert();
        scientificCalculator.getCurrentNumberDisplay();

        scientificCalculator.invert();
        scientificCalculator.getCurrentNumberDisplay();

        scientificCalculator.divide(0);
        scientificCalculator.getCurrentNumberDisplay();

    }
}
