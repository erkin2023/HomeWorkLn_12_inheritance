public class Programmer extends Person {
    private String companyName ;
    public  Programmer ( String companyName,String learn, String walk ,String eat ) {
        super(learn,walk,eat );
        this.companyName = companyName;
    }

    public String coding(){
     return "coding : C++ and Java ";
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName( String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "Programmer : " +
                "companyName = " + companyName +"\n " +"Person : \n" +
                "learn = " + learn + '\n' +
                "walk = " + walk + '\n' +
                "eat = " + eat + '\n' + coding();
    }
}
