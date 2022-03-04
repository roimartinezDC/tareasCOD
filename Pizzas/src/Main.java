

public class Main {
    public static void main(String[] args) {
        Pizza creadaConBuilder = new BuilderPizza().build();
        Pizza sintaxisEncadenada = new BuilderPizza()
        
                .setCebolla(true)
                .setSize(Pizza.BIG)
                .build();

        System.out.println(creadaConBuilder.toString());


        BuilderPizza miBuilder= new BuilderPizza();
        BuilderPizza miBuilder2= miBuilder.setTipoMasa(1)
                .setSinGluten(true)
                .setSize(2)
                .setSize(3);

        Pizza creadaConBuilder4 =miBuilder.build();




         Pizza _miPizza=miBuilder.build();
        System.out.println(_miPizza.toString());
    }


}




