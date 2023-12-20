public class PolarBear extends Animal implements Swimmable {
    @Override
    public void swim() {
        System.out.println("Мишка плавает лапами ");

    }
    @Override
    public void animalEating() {
        System.out.println("Животное принимает пищу");
    }
    @Override
    public void animalSound() {
        System.out.println("Животное издаёт звук");
    }
}
