import java.util.*;
import java.*;
public class Main {
    public static void main(String[] arg) {
        Random rand = new Random();

        ArrayList<String> rice = new ArrayList<>();
        rice.add("White Rice");
        rice.add("Brown rice");
        rice.add("no rice");
        rice.add("all rice");


        ArrayList<String> allrice = new ArrayList<>();
        allrice.add("White Rice");
        allrice.add("Brown rice");


        ArrayList<String> meat = new ArrayList<>();
        meat.add("steak");
        meat.add("chicken");
        meat.add("carnidas");
        meat.add("chorizo");
        meat.add("sofritas");
        meat.add("veggies");
        meat.add("no meat");
        meat.add("all meats");


        ArrayList<String> allmeat = new ArrayList<>();
        allmeat.add("steak");
        allmeat.add("chicken");
        allmeat.add("carnidas");
        allmeat.add("chorizo");
        allmeat.add("sofritas");
        allmeat.add("veggies");

        ArrayList<String> beans = new ArrayList<>();
        beans.add("Pinto bean");
        beans.add("Back bean");
        beans.add("no bean");
        beans.add("all beans");


        ArrayList<String> allbeans = new ArrayList<>();
        allbeans.add("Pinto bean");
        allbeans.add("Back bean");


        ArrayList<String> salsa = new ArrayList<>();
        salsa.add("mild salsa");
        salsa.add("midium salsa");
        salsa.add("hot salsa");
        salsa.add("no salsa");
        salsa.add("all salsa");


        ArrayList<String> allsalsa = new ArrayList<>();
        allsalsa.add("mild salsa");
        allsalsa.add("midium salsa");
        allsalsa.add("hot salsa");

        ArrayList<String> veggies = new ArrayList<>();
        veggies.add("letuce");
        veggies.add("fajita vaggies");
        veggies.add("no vaggies");
        veggies.add("all veggies");

        ArrayList<String> cheese = new ArrayList<>();
        cheese.add("cheese");
        cheese.add("no cheese");

        ArrayList<String> guac = new ArrayList<>();
        guac.add("guac");
        guac.add("no quac");


        ArrayList<String> queso = new ArrayList<>();
        queso.add("queso");
        queso.add("no queso");


        ArrayList<String> sourcream = new ArrayList<>();
        sourcream.add("sour cream");
        sourcream.add("no sour cream");


        ArrayList<String> allveggies = new ArrayList<>();
        allveggies.add("letuce");
        allveggies.add("fajita vaggies");


        ArrayList<String> ingriedents = new ArrayList<>();
        ingriedents.add("rice");
        ingriedents.add("meat");
        ingriedents.add("beans");
        ingriedents.add("salsa");
        ingriedents.add("veggies");
        ingriedents.add("cheese");
        ingriedents.add("guac");
        ingriedents.add("queso");
        ingriedents.add("queso");
        double price = 5.0;

        int min = 5;
        int max = 9;
        int randomguess = (int) (Math.random() * ((max - min) + 1)) + min;
        for (int i = 0; i <= 10; i++) {
            System.out.println("Burito " + i + ":");
            for (String ingredients : ingriedents) {
//                    String selected = ingriedents.get(rand.nextInt(randomguess));
//                    System.out.println(selected);
                String selected = ingriedents.get(rand.nextInt(9));
                System.out.println(selected);
            }


        }
    }
}
