class Person {
    String firstName;
    String lastName;
    int age;
    String city;

    Person(String fn, String ln, int a, String c) {
        firstName = fn;
        lastName = ln;
        age = a;
        city = c;

    }

    void showInfo() {
        System.out.println(firstName + " " + lastName + " " + age + " " + city + " ");
    }


    void increaseAge() {
        age++;
    }

    void changeAge(int change) {
        age = age + change;
    }
}