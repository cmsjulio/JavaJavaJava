package chapter1.Riddle;

public class Main {

    public static void main(String[] args) {
        Riddle riddle2 = new Riddle();

        Riddle riddle = new Riddle("Quem te comeu?", "Ninguém!");
        System.out.println(Riddle.getCreatedRiddles());

        Riddle riddle1 = new Riddle("Oi?", "Boi!");
        System.out.println(Riddle.getCreatedRiddles());

        System.out.println(riddle.getAnswer().length());


    }
}
