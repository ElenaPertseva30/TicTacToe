package geekbrains.animal;

public abstract class Animal {

    private String type;
    private String name;
    private float maxJump;
    private float maxRun;
    private float maxSwim;


    Animal(String type, String name, float maxJump, float maxRun, float maxSwim) {
        this.type = type;
        this.name = name;
        this.maxJump = maxJump;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
    }

    String getType(){
        return this.type;
    }

    String getName(){
        return this.name;
    }

    float getMaxJump(){
        return this.maxJump;
    }

    float getMaxRun(){
        return this.maxRun;
    }

    float getMaxSwim(){
        return this.maxSwim;
    }
}
