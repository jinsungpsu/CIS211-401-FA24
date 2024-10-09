import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> spanishDictionary = new HashMap<>();
        // insert requires both key/value
        spanishDictionary.put("Hello", "Hola");
        spanishDictionary.put("Bye", "Adios");
        spanishDictionary.put("One", "Uno");

        // search - trying to find a value based on the key
        // I don't know how to say hello in spanish
        // hello is a known value (aka key)

        System.out.println("Hello in spanish is: " + spanishDictionary.get("Hello"));

        spanishDictionary.remove("Hello");

        System.out.println("Hello in spanish is: " + spanishDictionary.get("Hello"));

        Map<String, Pokemon> pokedex = new HashMap<>();
        pokedex.put("Pikachu", new Pokemon("Pikachu", 55));
        pokedex.put("Mega Charizard", new Pokemon("Mega Charizard", 410));
        pokedex.put("Bulbasaur", new Pokemon("Bulbasaur", 180));


        System.out.println(pokedex.get("Pikachu").getAttack());


        Set<String> pokemonNames = pokedex.keySet();

        String[] pokemonNamesArr = (String[])pokemonNames.toArray();
        // useful!

        for (String each: pokemonNames) {
            System.out.println("Key is: " + each);
            System.out.println("Value is: " + pokedex.get(each));
        }

    }


}

class Pokemon {
    String name;

    int attack;
    public Pokemon(String name, int attack) {
        this.name = name;
        this.attack = attack;
    }

    public String getName() {
        return name;
    }

    public int getAttack() {
        return attack;
    }
}
