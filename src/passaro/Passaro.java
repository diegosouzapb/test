package passaro;

public class Passaro {
    // implementacao
    public void voar() {
        // voa
    }

}

/*
 *  Galinha is not a Passaro because it has different behavior.
 *  To use polymorphism I suggest using interfaces for specific
 *  behaviors (Voador, Botador, Chocador, etc),
 *
 *  allowing you to create specific interfaces by extending others,
 *  as: interface PassaroQueVoaEBota extends Voador, Botador
 *
 *  class Galinha implements Botador {...}
 *  class Aguia implements PassaroQueVoaEBota {...}
 */
class Galinha extends Passaro {
}

class Aguia extends Passaro {
}