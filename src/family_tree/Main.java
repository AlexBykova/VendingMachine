package family_tree;

import family_tree.human.Gender;
import family_tree.human.Human;
import family_tree.tree.Tree;
import family_tree.writer.FileHandler;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Tree familyTree = new Tree();
        Tree familyTree1 = new Tree();



        Human human1 = new Human(769375, "Максим Р", Gender.Male, "04.11.1995", null);
        Human human2 = new Human(869476, "Мария Р", Gender.Female, "16.12.1997", null);
        Human human3 = new Human(316431, "Василиса Р.", Gender.Female, "12.05.2017", null);
        Human human8 = new Human(455123, "Петр Р.", Gender.Male, "11.09.2023", null);

        Human human4 = new Human(531469, "Михаил Р.", Gender.Male, "05.07.1975", null);
        Human human5 = new Human(562564, "Алефтина Р.", Gender.Female, "06.01.1975", null);

        Human human6 = new Human(756478, "Евдакия М.", Gender.Female, "03.03.1978", null);
        Human human7 = new Human(851346, "Артем М.", Gender.Male, "29.04.1976", null);

        familyTree.addPeople(human1);
        familyTree.addPeople(human2);
        familyTree.addPeople(human3);
        familyTree.addPeople(human4);
        familyTree.addPeople(human5);
        familyTree.addPeople(human6);
        familyTree.addPeople(human7);
        familyTree.addPeople(human8);


        List items = Arrays.asList(human3, human8);
        human1.setChildren(items);
        human2.setChildren(items);

        List items1 = Arrays.asList(human1);
        human4.setChildren(items1);
        human5.setChildren(items1);

        List items2 = Arrays.asList(human2);
        human6.setChildren(items2);
        human7.setChildren(items2);


        human3.setParents(human1, human2);
        human1.setParents(human4, human5);
        human2.setParents(human6, human7);
        human8.setParents(human1, human2);


//        System.out.println(human1);
//
//        System.out.println(human6.getInfo());
//        System.out.println("----------------");
//        System.out.println(human1.getSnils());
//        System.out.println("----------------");
//
//
//        System.out.println(familyTree.getPeopleListInfo());
//
//
//        System.out.println("============");
//        System.out.println(familyTree.getPeopleBySnils(769375F));
        System.out.println("~~~~~~~~~~~~~~");
        save(familyTree);
        familyTree1 = load();
        System.out.println(familyTree1.getPeopleListInfo());

    }

    private static void save(Tree familyTree) {
        FileHandler fileHandler = new FileHandler();
        String filePath = "src/family_tree/writer/tree.txt";
        fileHandler.save(familyTree, filePath);
    }
    private static Tree load (){
        FileHandler fileHandler = new FileHandler();
        String filePath = "src/family_tree/writer/tree.txt";
        return (Tree) (fileHandler.read(filePath));
    }
}

