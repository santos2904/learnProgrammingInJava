package subclassmania;

public class Cat extends Animal {

    public boolean hasFur() {
        return true;
    }

    @Override
    public String MakeNoise() {
        return "Purr";
    }

    @Override
    public String Type() {
        return "Cat";
    }
}
