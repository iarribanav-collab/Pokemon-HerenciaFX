package es.masanz.ut7.pokemonfx.model.pokemons;

import es.masanz.ut7.pokemonfx.model.base.Ataque;
import es.masanz.ut7.pokemonfx.model.base.Pokemon;
import es.masanz.ut7.pokemonfx.model.enums.Tipo;
import es.masanz.ut7.pokemonfx.model.type.Normal;

public class Lopunny extends Pokemon implements Normal {
    public Lopunny(int nivel) {super(nivel);}

    @Override
    protected void asignarAtaques() {
        Ataque bote = new Ataque("Bote", 85, 85, Tipo.VOLADOR, false, 5);
        asignarAtaque(bote.getNombre(), bote);

        Ataque rayoHielo = new Ataque("Rayo Hielo", 90, 100, Tipo.HIELO, true, 10);
        asignarAtaque(rayoHielo.getNombre(), rayoHielo);

        Ataque punioDrenaje = new Ataque("Puño Drenaje", 75, 100, Tipo.LUCHA, false, 10);
        asignarAtaque(punioDrenaje.getNombre(), punioDrenaje);

        Ataque excavar = new Ataque("Excavar", 80, 100, Tipo.TIERRA, false, 10);
        asignarAtaque(excavar.getNombre(), excavar);

    }

    @Override
    public int nivelEvolucion() {return 0;}

    @Override
    public Pokemon pokemonAEvolucionar() {return null;}

    @Override
    public Pokemon clone() {
        Pokemon pokemon = new Lopunny(this.nivel);
        return pokemon;
    }
}
