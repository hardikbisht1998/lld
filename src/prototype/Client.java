package prototype;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static  void main(String[] args){

        Bird bird1=new Bird();
        bird1.setColor("BLue");
        bird1.setName("Hardik");
        bird1.setWeight(81);


        Sparrow s1=new Sparrow();
        s1.setLegSize("jlk");

        Crow c1=new Crow();
        c1.setName("qwwqw");
        c1.setColor("Black");


        List<Bird> birds=List.of(
                bird1,c1,s1
        );

        List<Bird> children=new ArrayList<>();
        for(Bird parent:birds){
            children.add(parent.clone());
        }
        System.out.println("done");


        Sparrow longSparrow=new Sparrow();
        longSparrow.setLegSize("100");

        Crow sweetCrow =new Crow();
        sweetCrow.setSound("Kookoo");


        BirdRegistery birdRegistery=new BirdRegistery();
        birdRegistery.registerBird("SweetCrowbird",sweetCrow);
        birdRegistery.registerBird("longSparrow",longSparrow);
        birdRegistery.registerBird("sparrow",s1);
        List<String> getBirdOfType=List.of("SweetCrowbird","longSparrow","sparrow");

        List<Bird> requestedBird=new ArrayList<>();

        for(String s:getBirdOfType){
            requestedBird.add(birdRegistery.getBird(s));
        }

        System.out.println(requestedBird);





    }
}
