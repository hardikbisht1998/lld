package prototype;

public class Bird implements Cloneable<Bird>{
    private int weight;
    private String color;
    private String name;

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Bird(){

    }

    public Bird(Bird old){
        this.name=old.name;
        this.color=old.color;
        this.weight=old.weight;
    }
    @Override
    public Bird clone() {
//        work only when it is base class
//        Bird b=new Bird();
//        b.name=this.name;
//        b.color=this.color;
//        b.weight=this.weight;
//        return b;

        return new Bird(this);
    }
}
