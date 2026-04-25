package es.masanz.ut7.pokemonfx.model.pokemons;

import es.masanz.ut7.pokemonfx.model.base.Ataque;
import es.masanz.ut7.pokemonfx.model.base.Pokemon;
import es.masanz.ut7.pokemonfx.model.enums.Tipo;
import es.masanz.ut7.pokemonfx.model.type.Fuego;
import es.masanz.ut7.pokemonfx.model.type.Volador;

public class Charizard extends Pokemon implements Fuego, Volador {
    public Charizard(int nivel) {
        super(nivel);
    }

    @Override
    protected void asignarAtaques() {
        Ataque llamarada = new Ataque("Llamarada", 110, 85, Tipo.FUEGO, true, 5);
        asignarAtaque(llamarada.getNombre(), llamarada);

        Ataque garraDragon = new Ataque("Garra Dragon", 80, 100, Tipo.DRAGON, false, 15);
        asignarAtaque(garraDragon.getNombre(), garraDragon);

        Ataque punioTrueno = new Ataque("Puño Trueno", 75, 100, Tipo.ELECTRICO, false, 15);
        asignarAtaque(punioTrueno.getNombre(), punioTrueno);

        Ataque rayoSolar = new Ataque("Rayo Solar", 120, 100, Tipo.PLANTA, true, 10);
        asignarAtaque(rayoSolar.getNombre(), rayoSolar);
    }

    @Override
    public int nivelEvolucion() {
        return 0;
    }

    @Override
    public Pokemon pokemonAEvolucionar() {
        return null;
    }

    @Override
    public Pokemon clone() {
        Pokemon pokemon = new Charizard(this.nivel);
        return pokemon;
    }
}
