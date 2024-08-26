import java.util.Random;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static final int MAX_ATTACK = 255;

    public static void main(String[] args) {
        int[] attack = new int[5];
        String[] pokeNames = {"thunderMouse", "plantBulb", "fireLizard", "waterMemory", "Pikachu"};
        Random rng = new Random();

        for (int i = 0; i < attack.length; i++) {
            attack[i] = rng.nextInt(MAX_ATTACK);
        }

        for (int i = 0; i < attack.length; i++) {
            System.out.println(pokeNames[i] + ": " + attack[i] + " attack value.");
        }

//        for (int each: attack) {
//            System.out.println("This pokemon's attack is: " + each);
//        }
    }
}
