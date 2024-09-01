package prototype;

import java.util.HashMap;
import java.util.Map;

public class BirdRegistery {
    private Map<String,Bird> birds=new HashMap<>();
    public void registerBird(String name,Bird bird){
        birds.put(name,bird);
    }

    public Bird getBird(String name){
        return birds.get(name);
    }


}
