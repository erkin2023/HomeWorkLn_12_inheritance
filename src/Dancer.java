public class Dancer extends Person {

    private String groupName;
    public String dancing (){
        return "band members:\n" +
                "Kevin KB Brewer\n" +
                "Joe  Punkee Larot\n" +
                "Phil  Swagger Boy Tayag\n" +
                "Jeff  Phi Nguyen\n" +
                "Rynan  Kid Rainen Paguio\n" +
                "Eddie  Eddie Styles Gutierrez\n" +
                "Chris  Cristyle Gatdula\n" +
                "Saso  Saso Fresh Jimenez";
    }
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Dancer(String groupName, String learn, String walk, String eat) {
        super(learn, walk, eat);
        this.groupName = groupName;
    }

    // You can add additional methods specific to the Dancer class here.

    @Override
    public String toString() {
        return "Dancer : " +
                "groupName='" + groupName +"\n " +"Person :\n " +
                "learn = " + learn + '\n' +
                "walk = " + walk + '\n' +
                "eat = " + eat + '\n' +  dancing();
    }
}