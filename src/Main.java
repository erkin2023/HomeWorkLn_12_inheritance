// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        daughter daughter = new daughter();
//        daughter.setMother("mother is anara");
//        daughter.setFather("father is talay");
//        daughter.setName("daughter is name Leyla");
//        daughter.setAge(19);
//
//        Son son = new Son();
//        son.setMother(" mother is anara");
//        son.setFather("father talay");
//        son.setNameSon("Son is name Erkin");
//        son.setYearsOfBirth(2002);
//
//        System.out.println("Дочь");
//        System.out.println(daughter.getAge());
//        System.out.println(daughter.getName());
//
//        System.out.println(daughter.getFather());
//        System.out.println(daughter.getMother());
//        System.out.println("Son");
//        System.out.println(son.getYearsOfBirth());
//        System.out.println(son.getNameSon());
//
//        System.out.println(son.getFather());
//        System.out.println(son.getMother());
        // Class Programmer
        Programmer programmer = new Programmer("MiroCastSystem ",
                "They are studying how Artificial intelligence can program based on the data they have been given",
                "hey are going to ensure that Artificial Intelligence begins to walk",
    "To the company, all employees adhere to healthy food during working hours ");
        System.out.println(programmer.toString()+programmer.coding());

        //Class Dancer
        Dancer dancer = new Dancer("Jaddawockeez","They study the types of dances ",
                "if you count how many steps they take every day, it will be more than 10,000 steps ","they eat healthy food ");
        System.out.println(dancer.toString());

        //Class Singer
        Singer singer = new Singer("The Beatles ","\"The Beatles\" стали пионерами в различных направлениях музыки,\n" +
                " таких как рок, поп, психоделический рок и другие стили.\n" +
                " Их музыкальные и творческие эксперименты сделали их одной из наиболее влиятельных групп 20-го века.",
                "они тренировали  тембр своего голоса, сочетая это с ходьбой, чтобы развить свои голоса ","Со временем, когда " +
                "\"The Beatles\" стали всемирно известными и начали выступать на стадионах и аренах,\n" +
                " их условия стали более комфортными, и они могли позволить себе более разнообразное и качественное питание.");
        System.out.println(singer);





    }
}