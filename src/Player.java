public class Player {
    private String name;
    private int numberOfPoints;

    public Player(String name){
        this.name=name;
        this.numberOfPoints=0;
    }

    public void setName(String name){
        this.name=name;
    }

    public void addPoint(int point){
        ++this.numberOfPoints;
    }

    public String getName(){
        return name;
    }

    public int getNumberOfPoints(){return numberOfPoints;}
}
