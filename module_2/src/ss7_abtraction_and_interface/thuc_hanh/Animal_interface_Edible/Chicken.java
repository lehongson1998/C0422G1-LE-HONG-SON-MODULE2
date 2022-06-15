package ss7_abtraction_and_interface.thuc_hanh.Animal_interface_Edible;

public class Chicken extends Animal implements Edible{
    @Override
    public String makeSoul(){
        return "éc éc con bạch tuộc kêu!!!";
    }
    @Override
    public String howToEat(){
        return "could be fried";
    }
}
