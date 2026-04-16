package es.masanz.ut7.pokemonfx.model.enums;

public enum Stats {

    // TODO 08: Incluir nuevos pokemon. Cuidado, el nombre correcto es muy IMPORTANTE
    BULBASAUR("001", 45, 49, 49, 45, 65, 65, 64),
    CHARMANDER("004", 39, 52, 43, 65, 60, 50, 65),
    CHARMELEON("005", 58, 64, 58, 80, 80, 65, 70),
    CHARIZARD("006", 78, 84, 78, 100, 109, 85, 80),
    SQUIRTLE("007", 44, 48, 65, 43, 50, 64, 66),
    WARTORTLE("008", 59, 63, 80, 58, 65, 80, 74),
    BLASTOISE("009", 79, 83, 100, 78, 85, 105, 82),
    BUNEARY("427", 55, 66, 44, 85, 44, 56, 64),
    LOPUNNY("428", 65, 76, 84, 105, 54, 96, 70),
    LITWICK("607", 50, 30, 55, 20, 65, 55, 50),
    LAMPENT("608", 60, 40, 60, 55, 95, 60, 70),
    CHANDELURE("609", 60, 55, 90, 80, 145, 90, 80);

    public final String numPokedex;
    public final int hp, ataque, defensa, velocidad, ataqueEspecial, defensaEspecial, expBase;

    Stats(String numPokedex, int hp, int ataque, int defensa, int velocidad, int ataqueEspecial, int defensaEspecial, int expBase) {
        this.numPokedex = numPokedex;
        this.hp = hp;
        this.ataque = ataque;
        this.defensa = defensa;
        this.velocidad = velocidad;
        this.ataqueEspecial = ataqueEspecial;
        this.defensaEspecial = defensaEspecial;
        this.expBase = expBase;
    }
}
