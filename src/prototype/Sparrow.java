package prototype;

public class Sparrow extends Bird {
    private String legSize;

    public void setLegSize(String legSize) {
        this.legSize = legSize;
    }

    public Sparrow(){
    }
    public Sparrow(Sparrow old){
        super(old);
        this.legSize= old.legSize;
    }

    @Override
    public Sparrow clone() {
        return new Sparrow(this);
    }

}
