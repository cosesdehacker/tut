package exerciciSobrecarregaMetodes;

public class SobrecarregaMetodes {

    int numero;
    String gust;
    String color;

    public SobrecarregaMetodes(String color) { //mètode constructor 1

        //els constructors 1, 2 i 3 són diferents perquè estan parametritzats diferent

        this.color=color;

    }

    public SobrecarregaMetodes(int numero, String color, String gust) { //mètode constructor 2

        this.numero=numero;
        this.color=color;
        this.gust=gust;

    }

    public SobrecarregaMetodes(){ //mètode constructor 3

    }

    public void fruita(){ //mètode 1

        //els metodes 1 i 2 són diferents perquè estan parametritzats diferent
        System.out.println("Avui he berenat "+numero+" de llimones. Les llimones tenien un gust" +
                gust+". M'agraden les fruites de color "+color);

    }

    public void fruita(double pes){ //mètode 2

        System.out.println("He comprat "+pes+" kg de pomes de color "+color);
    }
}
