package lessomsix;

import lessomsix.someclasses.Human;

public class AgainMain {
    public static void main(String[] args) {
      
        Human person = new Human(29, "white", "Homo sapiens");
        Human parent = new Human(29, "white", "Homo sapiens");
        Human anotherperson = new Human(31, "hairy", " Neanderthals");
        int hum = person.hashCode();
        int nean = anotherperson.hashCode();
        System.out.println(person + " Hascode = " + hum );
        System.out.println(anotherperson + " Hascode = " + nean );
        System.out.println(person.equals(anotherperson));
        System.out.println(person.equals(parent));
        }
    }

