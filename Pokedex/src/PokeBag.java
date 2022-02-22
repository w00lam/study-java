import java.util.ArrayList;
import java.util.HashMap;

public class PokeBag {
    private final HashMap<String, ArrayList<Pokemon>> pokemons = new HashMap<>();

    public ArrayList<Pokemon> getPokemons(String name) {
        return pokemons.get(name);
    }

    public void add(Pokemon pokemon) {
        String name = pokemon.name;

        if(getPokemons(name) == null){
            pokemons.put(name, new ArrayList<Pokemon>());
        }
        getPokemons(name).add(pokemon);
    }

    public Pokemon getStrongest(String name) {
        ArrayList<Pokemon> pokemonList = getPokemons(name);
        Pokemon strongest = null;

        try{
            for(Pokemon pokemon:pokemonList){
                if(strongest == null || pokemon.cp > strongest.cp){
                    strongest = pokemon;
                }
            }
            return strongest;
        }catch (NullPointerException e){
            return null;
        }
    }

    public Pokemon getStrongest() {
        Pokemon strongest = null;
        try{
            for (String key : pokemons.keySet()) {
                if (strongest == null || getStrongest(key).cp > strongest.cp) {
                    strongest = getStrongest(key);
                }
            }
            return strongest;
        }catch (NullPointerException e){
            return null;
        }
    }
}