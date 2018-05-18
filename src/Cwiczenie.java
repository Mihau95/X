public class Cwiczenie {
    public static void main(String[] args) {
        int number1 = 3;
        int number2 = 5;

        int dodawanie = number1 + number2;
        int odejmowanie = number1 - number2;
        double dzielenie = number1 / number2;
        int mnozenie = number1 * number2;

        System.out.println((double)number1+"+"+(double)number2+"="+dodawanie);
        System.out.println((double)number1+"-"+(double)number2+"="+odejmowanie);
        System.out.println((double)number1+"/"+(double)number2+"="+dzielenie);
        System.out.println((double)number1+"*"+(double)number2+"="+mnozenie);




        boolean porownanie1 = number1>0; //true
        boolean porownanie2 = dodawanie%2==0;
        boolean porownanie3 = (number1>100) || (number2>100);
        boolean porownanie4 = (number1>100) && (number2>100);

        System.out.println("Czy pierwsza liczba jest wieksza od 0" + porownanie1);
        System.out.println("Czy suma jest liczba parzysta" + porownanie2);
        System.out.println("Czy pierwsza lub druga liczba jest weksza od 100" + porownanie3);
        System.out.println("Czy pierwsza i druga liczba jest wieksza od 100" + porownanie4);




    }
}