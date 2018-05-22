class TimeCalculatorTest {
    public static void main(String[] args) {
        TimeCalculator timeCalculator = new TimeCalculator();
        timeCalculator.dG(10);
        timeCalculator.dGms(10,20, 13, 40);
        timeCalculator.sM(30);

    System.out.println("Godziny: " + timeCalculator.dG(10));
    System.out.println("Sekundy: " + timeCalculator.dGms(10,20, 13, 40));
    System.out.println("Minuty: " + timeCalculator.sM(30));
    }

}
