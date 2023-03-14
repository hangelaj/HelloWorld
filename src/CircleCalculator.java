public class CircleCalculator {
    public static void main(String[] args) {
        // declaring variable for four double data type
        double circleRadius = 12;
        double circleDiameter = circleRadius*2;
        double circleCircumference =  (2*3.14)*circleRadius;
        double circleArea = 3.14 * (circleRadius * circleRadius);
        // print out of the programing
        System.out.println("The circleRadius is:" + circleRadius + "cm");
        System.out.println("the circleDiameter is:" + circleDiameter + "cm");
        System.out.println("The circleCircumference is"+ circleCircumference + "cm");
        System.out.println(" The circleArea is" + circleArea + "cm^2");
    }
}
