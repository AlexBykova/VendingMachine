package family_tree.human;

import java.util.List;

public class Human {

    private float snils; // Здесь были заглавные т.к. это аббревиатура. И она была написана так чисто на автомате
    private String name;
    private Gender gender;
    private String birthday;
    private String deathday;
    private Human parent1;
    private Human parent2;
    private List<Human> children;



    public Human(float snils, String name, Gender gender, String birthday, String deathday) {
        this.snils = snils;
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        this.deathday = deathday;
    }


    public void setParents(Human parent1, Human parent2) {
        this.parent1 = parent1;
        this.parent2 = parent2;
    }

    public void setChildren(List<Human> children) {
        this.children = children;
    }

    public float getSnils(){
        return snils;
    }

    @Override
    public String toString() {
        return "Имя: " + name + ", СНИЛС: " + snils;
    }

    public String getInfo(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append ("Имя: " + name + "\n");
        stringBuilder.append ("Пол: " + gender + "\n");
        if (deathday != null) {
            stringBuilder.append ("Дата рождения: " + birthday + ". Дата смерти: " + deathday +"\n");
        }
            else{
            stringBuilder.append ("Дата рождения: " + birthday + "\n");
            }
        stringBuilder.append ("Родители: " + parent1 + " и " + parent2 + "\n");
        if (children != null) {
            stringBuilder.append ("Дети: " + children + "\n");
        }
            return stringBuilder.toString();
    }
}