import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        List<pokemon> pokemons = new ArrayList<>();
        dodrio dodrio = new dodrio(1, "Dodrio");
        oricorio oricorio = new oricorio(2, "Oricorio");
        pelipper pelipper = new pelipper(3, "Pelipper");
        
        pokemons.add(dodrio);
        pokemons.add(oricorio);
        pokemons.add(pelipper);

        for (pokemon pokemon : pokemons) {
            iniciarBatalha(pokemon);
        }

        for (pokemon pokemon : pokemons) {
            iniciarBatalha(pokemon);
        }
        
        pokemon selectPokemon = pokemons.get(1);
        System.out.println("O pokemon escolhido foi: " + selectPokemon.getNome());
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Exelente escolha, agora dê um novo nome para o seu pokemon!!!");
        String novoNome = scanner.nextLine();

        if (!novoNome.isEmpty()){
            selectPokemon.setNome(novoNome);
        }

        System.out.println("E o nome escolhido foi: " + selectPokemon.getNome());
        
        
    }

    public static void iniciarBatalha(pokemon pokemon) {
        pokemon.atacar();
    }
}

