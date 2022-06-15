package ss7_abtraction_and_interface.thuc_hanh.Animal_interface_Edible;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] anima = new Animal[2];
        anima[0] = new Chicken();
        anima[1] = new Tiger();
        for (Animal animal: anima) {
            System.out.println(animal.makeSoul());

            if (animal instanceof Chicken){
                Edible ed = (Edible) animal;
                System.out.println(ed.howToEat());
            }
        }
    }
}
