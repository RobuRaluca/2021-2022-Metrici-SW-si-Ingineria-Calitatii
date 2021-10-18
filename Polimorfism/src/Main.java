import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

        Mammal mamifer = null;
        Felime felina = null;
        Canina canina = null;
        Animal animal = null;

        StringBuilder sb = new StringBuilder();

        String input = bfr.readLine();
        while (!"Sfarsit".equals(input)) {
            String[] animalTokens = input.split("\\s+");

            String[] foodTokens = bfr.readLine().split("\\s+");
            Food mancare = null;
            switch (foodTokens[0]) {
                case "legume":
                    mancare = new Vegetable(Integer.parseInt(foodTokens[1]));
                    break;
                case "carne":
                    mancare = new Meat(Integer.parseInt(foodTokens[1]));
                    break;

            }
            switch (animalTokens[0]) {
	            case "broascaTestoasa":
	                animal = new BroascaTestoasa(animalTokens[1], "broascaTestoasa", Double.parseDouble(animalTokens[2]), animalTokens[3]);
	                animal.sunetProdus();
	                if (foodTokens[0].equals("legume")) {
	                    animal.mananca(mancare);
	                } else {
	                    System.out.println("Broasca testoasa nu mananca acest tip de mancare mancare!");
	                }
	                break;
	                
                case "soarece":
                    mamifer = new Mouse(animalTokens[1], "soarece", Double.parseDouble(animalTokens[2]), animalTokens[3]);
                    mamifer.sunetProdus();
                    if (foodTokens[0].equals("legume")) {
                        mamifer.mananca(mancare);
                    } else {
                        System.out.println("Soarecele nu consuma acest tip de mancare!");
                    }

                    sb.append(mamifer.toString()).append(System.lineSeparator());
                    break;

                case "zebra":
                    mamifer = new Zebra(animalTokens[1], "zebra", Double.parseDouble(animalTokens[2]), animalTokens[3]);
                    mamifer.sunetProdus();
                    if (foodTokens[0].equals("legume")) {
                        mamifer.mananca(mancare);
                    } else {
                        System.out.println("Zebrele nu mananca acest tip de mancare!");
                    }

                    sb.append(mamifer.toString()).append(System.lineSeparator());
                    break;

                case "pisica":
                    felina = new Cat(animalTokens[1], "pisica", Double.parseDouble(animalTokens[2]), animalTokens[3], animalTokens[4]);
                    felina.sunetProdus();
                    felina.mananca(mancare);

                    sb.append(felina.toString()).append(System.lineSeparator());
                    break;
                    
                case "caine":
                    canina = new Caine(animalTokens[1], "caine", Double.parseDouble(animalTokens[2]), animalTokens[3], animalTokens[4]);
                    canina.sunetProdus();
                    canina.mananca(mancare);

                    sb.append(canina.toString()).append(System.lineSeparator());
                    break;
                    
                case "lup":
                    canina = new Lup(animalTokens[1], "lup", Double.parseDouble(animalTokens[2]), animalTokens[3], animalTokens[4]);
                    canina.sunetProdus();
                    canina.mananca(mancare);

                    sb.append(canina.toString()).append(System.lineSeparator());
                    break;

                case "tigru":
                    felina = new Tiger(animalTokens[1], "tigru", Double.parseDouble(animalTokens[2]), animalTokens[3]);
                    felina.sunetProdus();
                    if (foodTokens[0].equals("carne")) {
                        felina.mananca(mancare);
                    } else {
                        System.out.println("Tigrii nu mananca acest tip de mancare!");
                    }
                    sb.append(felina.toString()).append(System.lineSeparator());
                    break;
            }
            input = bfr.readLine();
        }
        System.out.println(sb.toString().trim());
    }
}

