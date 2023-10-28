package family_tree.tree;

import family_tree.human.Human;
import ru.gb.vending_machine.product.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tree {
    List<Human> peopleList;

    public Tree() {
        peopleList = new ArrayList<>();
    }

//    public Human getPeopleBySNILS (Float SNILS){
//        for (Human people: peopleList){
//            if (people.getSNILS().equals(SNILS)){
//                return people;
//            }
//        }
//        return null;
//    }

    public void addPeople(Human people) {
        peopleList.add(people);
    }

    public String getPeopleListInfo(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append ("Список членов семьи: \n");
        for (Human people: peopleList){
            stringBuilder.append(people);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
