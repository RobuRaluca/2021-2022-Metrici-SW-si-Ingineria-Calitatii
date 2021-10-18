import java.text.DecimalFormat;

public abstract class Mammal extends Animal {
    private String habitat;

    protected Mammal(String numeAnimal, String tipAnimal, Double greutateAnimal, String habitat) {
        super(numeAnimal, tipAnimal, greutateAnimal);
        this.habitat = habitat;
    }

    protected String obtineHabitatul() {
        return habitat;
    }

    protected void seteazaHabitatul(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        DecimalFormat format = new DecimalFormat("#.##");
        return String.format("%s[%s, %s, %s, %d]", this.obtineTipulAnimalului(), this.obtineNumeleAnimalului(), format.format(this.obtineGreutateaAnimalului()), this.obtineHabitatul(), this.obtineAlimentatiaAnimalului());
    }
}
