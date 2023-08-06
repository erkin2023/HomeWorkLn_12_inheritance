public class Person {
    protected String learn;
    protected String walk ;
    protected String eat ;

    public Person(String learn, String walk, String eat) {
        this.learn = learn;
        this.walk = walk;
        this.eat = eat;
    }

    public String getLearn() {
        return learn;
    }

    public void setLearn(String learn) {
        this.learn = learn;
    }

    public String getWalk() {
        return walk;
    }

    public void setWalk(String walk) {
        this.walk = walk;
    }

    public String getEat() {
        return eat;
    }

    public void setEat(String eat) {
        this.eat = eat;
    }

    @Override
    public String toString() {
        return "Person{" +
                "learn='" + learn + '\'' +
                ", walk='" + walk + '\'' +
                ", eat='" + eat + '\'' +
                '}';
    }
}
