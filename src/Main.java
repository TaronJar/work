public class Main {
    public static void main(String[] args) {
       /* TVController[] controllers = new TVController[]{
                new SmartSpeaker(),
                new RemoteController(),
        };

        for (TVController controller : controllers) {
            controller.turnOnFirstChannel();
        }
        //- - - - - - - -- - - - - - - - - -- - - - -
        SmartSpeaker smartSpeaker = new SmartSpeaker();
        RemoteController remoteController = new RemoteController();
        smartSpeaker.turnOnFirstChannel();
        remoteController.turnOnFirstChannel();
        //- - - - - - - -- - - - - - - - - -- - - - -

        PolarBear polarBear = new PolarBear();
        FurSeal furSeal = new FurSeal();

        Swimmable bear = new PolarBear();
        Swimmable morskoikotik = new FurSeal();
        addToPool(polarBear);
        addToPool(bear);
        addToPool(furSeal);
        addToPool(morskoikotik);
*/
        String name = "Тарон";
        String surname = "Джарагян";
        hello(name);
        hello(name, surname);
    }

    public static void addToPool(Swimmable animal) {
        animal.swim();

    }

    public static void hello(String name) {
        System.out.println("Привет: " + name );
    }

    public static void hello(String name, String surname) {
        System.out.println("Привет:" + name + " " + surname + "!");
    }
}
