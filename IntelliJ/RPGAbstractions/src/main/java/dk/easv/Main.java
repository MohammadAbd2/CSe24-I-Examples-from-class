package dk.easv;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world of RPG!");
        Human peter = new Human("Peter the gruesome");
        Human ben = new Human("Ben the slayer of dark demons");

        System.out.println(peter);
        System.out.println(ben);

        System.out.println("Peter attacks Ben, what a bastard");
        peter.attack(ben);

        peter.setName("Pettter the nice one");
        System.out.println(peter);
        System.out.println(ben);

        System.out.println("A wild Orc appears");
        Orc schitchy = new Orc("Schirtxzt");
        schitchy.attack(ben);
        ben.attack(schitchy);

        Wizard merlin = new Wizard("Merlin");

        Player sterlin = new Player("Sterlin");

        merlin.doMagicDamage(sterlin);

    }
}