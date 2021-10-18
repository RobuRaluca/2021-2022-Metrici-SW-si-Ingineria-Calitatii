import java.text.DecimalFormat;

public class Caine extends Canina {
	
	private String rasa;

    public Caine(String numeAnimal, String tipAnimal, Double greutateAnimal, String habitat, String rasa) {
        super(numeAnimal, tipAnimal, greutateAnimal, habitat);
        this.rasa = rasa;
    }


    public String obtineRasa() {
        return rasa;
    }

    public void seteazaRasa(String rasa) {
        this.rasa = rasa;
    }

    @Override
    protected void sunetProdus() {
        System.out.println("Hamm");
    }

    @Override
    protected void mananca(Food mancare) {
        this.seteazaAlimentatiaAnimalului(this.obtineAlimentatiaAnimalului() + mancare.obtineCantitatea());
    }

    @Override
    public String toString() {
        DecimalFormat format = new DecimalFormat("#.##");
        return String.format("%s[%s, %s, %s, %s, %d]", this.obtineTipulAnimalului(), this.obtineNumeleAnimalului(), this.obtineRasa(), format.format(this.obtineGreutateaAnimalului()), this.obtineHabitatul(), this.obtineAlimentatiaAnimalului());
    }
}
