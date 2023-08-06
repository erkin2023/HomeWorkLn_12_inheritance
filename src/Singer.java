public class Singer extends Person{
    private String bandName;

    public Singer(String bandName ,String learn, String walk, String eat ) {
        super(learn, walk, eat);
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
        return "Singer : " +
                "bandName = " + bandName+"\n " +"Person :\n " +
                "learn = " + learn + '\n' +
                "walk = " + walk + '\n' +
                "eat = " + eat + '\n' +singing() +"\n "+ playGitar();
    }
}
