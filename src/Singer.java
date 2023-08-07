public class Singer extends Person{
    private String bandName;

    @Override
    public String learn() {
        return super.learn();
    }

    @Override
    public String walk() {
        return super.walk();
    }

    @Override
    public String eat() {
        return super.eat();
    }

    public Singer(String bandName, String learn, String walk, String eat) {
        super(learn,walk,eat);
        this.bandName=bandName;
    }

    public String singing (){
     return "Singing : Джорджа Харрисона и Ринго Старра ";
    }
    public String playGitar(){
        return "play gitar : Макартини и Джони Леннон";
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    @Override
    public String toString() {
        return "Singer :  '\n'" +
                "bandName = " + bandName+"\n " +
                "learn = " + learn() + '\n' +
                "walk = " + walk() + '\n' +
                "eat = " + eat() + '\n'
                +singing()+"\n "
                +playGitar()+ '\n';
    }
}
