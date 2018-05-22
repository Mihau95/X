class People {
    public static void main(String[] args) {


        Person person1 = new Person("Jan", "Kowalski", 25, "Wroclaw");


        Person person2 = new Person("Basia", "Wilk", 23, "Poznan");

        TimeMachine timeMachine = new TimeMachine();
        timeMachine.backInTime(person1);
        person1.showInfo();
        timeMachine.timeTravel(person1,5);
        person1.showInfo();

        TimeMachine timeMachine1 = new TimeMachine();
        timeMachine.backInTime(person2);
        person2.showInfo();
        timeMachine.timeTravel(person2, 5);
        person2.showInfo();
    }
}
