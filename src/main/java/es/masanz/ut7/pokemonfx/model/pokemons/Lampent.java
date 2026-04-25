package es.masanz.ut7.pokemonfx.model.pokemons;

import es.masanz.ut7.pokemonfx.model.base.Ataque;
import es.masanz.ut7.pokemonfx.model.base.Pokemon;
import es.masanz.ut7.pokemonfx.model.enums.Tipo;
import es.masanz.ut7.pokemonfx.model.type.Fantasma;
import es.masanz.ut7.pokemonfx.model.type.Fuego;

public class Lampent extends Pokemon implements Fuego, Fantasma {
    public Lampent(int nivel) {
        super(nivel);
    }

    @Override
    protected void asignarAtaques() {
        Ataque psiquico = new Ataque("Psiquico", 90, 100, Tipo.PSIQUICO, true, 10);
        asignarAtaque(psiquico.getNombre(), psiquico);

        Ataque llamaEmbrujada = new Ataque("Llama Embrujada", 75, 100, Tipo.FUEGO, true, 10);
        asignarAtaque(llamaEmbrujada.getNombre(), llamaEmbrujada);

        Ataque energibola = new Ataque("Energibola", 90, 100, Tipo.PLANTA, true, 10);
        asignarAtaque(energibola.getNombre(), energibola);

        Ataque ondaVoltio = new Ataque("Onda Voltio", 75, 95, Tipo.ELECTRICO, true, 20);
        asignarAtaque(ondaVoltio.getNombre(), ondaVoltio);



    }

    @Override
    public int nivelEvolucion() {
        return 41;
    }

    @Override
    public Pokemon pokemonAEvolucionar() {
        Pokemon pokemon = new Chandelure(this.nivel);
        return pokemon;
    }

    @Override
    public Pokemon clone() {
        Pokemon pokemon = new Lampent(this.nivel);
        return pokemon;
    }
}
