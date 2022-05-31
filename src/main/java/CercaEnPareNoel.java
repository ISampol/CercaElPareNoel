import java.util.Scanner;

public class CercaEnPareNoel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] elements = new String[]{"hola", "adeu", "hola2"};
        int comptador = 0;

        System.out.println("Digues un text");
        String text = sc.nextLine();

        for (int i = 0; i < text.length(); i++) {
            if (text.contains(elements[i])){
                comptador++;
            }
        }

        System.out.println(comptador);

        sc.close();
    }
}
