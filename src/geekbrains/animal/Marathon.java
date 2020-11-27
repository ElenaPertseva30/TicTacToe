package geekbrains.animal;

public class Marathon {
    public static void main(String[] args) {
        Cat cat = new Cat("Smoke", 0.6f, 400, 15);
        Dog dog = new Dog("Tore", 0.4f,500, 10);
        System.out.println("\nЗабег животных начинается! \n Участвуют :" + cat.getName() + " and " + dog.getName());

        Animal[] animals = {dog, cat};
         float toJump = 1.5f;
         float toRun = 300;
         float toSwim = 20;

         System.out.println("Первое испытыние : забег " + toRun);

         for (int i = 0; i < animals.length; i++){
            String name = animals[i].getType() + " " + animals[i].getName()+ " " + "прошeл";
            String Result = String.format("Итоги забега : " + " " + animals[i].getMaxRun());
            System.out.println(Result + name);
        }

        System.out.println("Второе испытыние : прыжки " + toJump);
        for (int i = 0; i < animals.length; i++){
            String animalName = animals[i].getType() + " " + animals[i].getName() + " " + " прошел";
            String animalResult = String.format("Итоги забега : " + " " + animals[i].getMaxJump());
            System.out.println(animalResult + animalName);

        }

        System.out.println("Третье испытыние : плавание " + toSwim);
        for (int i = 0; i < animals.length; i++) {
            String animalsName = animals[i].getType()+ " " + " " + animals[i].getName() + " " + " прошел";
            String animalsResult = String.format("Итоги  : " + " " + animals[i].getMaxSwim());
            System.out.println(animalsResult + animalsName);
        }

    }
}

