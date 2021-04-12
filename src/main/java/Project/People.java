package Project;

import java.io.*;
import java.net.URL;
import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class People {


    private static final int COUNT = 50;


    public static void main(String[] args) {

        Set<Person> treeSet = new TreeSet<>();
        List<Person> PersonDelet = new ArrayList<>();

//        Locale locale = new Locale("en", "EN");
//        ResourceBundle rb = ResourceBundle.getBundle("PersonFile", locale);
        printPerson(treeSet);
        addPerson(treeSet);
        printPerson(treeSet);
        deletPerson(treeSet, PersonDelet);
        System.out.println();
        printPerson(treeSet);


        File file = new File("person.txt");
        boolean isCreated = false;
        boolean isNotWrittenOrRead = false;

//        public static void selectLanguage () {
//            System.out.println("Введите язык");
//            Scanner scanner = new Scanner(System.in);
//            String language = scanner.nextLine();
//            if (language.equals("RU")) {
//                locale = new Locale("ru", "RU");
//                rb = ResourceBundle.getBundle("PersonFile_ru_RU", locale);
//            }
//            System.out.println(rb.getString("firstList"));
//        }

//        File file = new File("person.txt");


//        public static void writeToFile() {
//            try (ObjectOutputStream personStream = new ObjectOutputStream(new FileOutputStream(file))) {
//                isCreated = file.createNewFile();
//                personStream.writeObject(treeSet);
//            } catch (IOException e) {
//                isNotWrittenOrRead = true;
//            }
//        }

//        public static void readFromFile() {
//            try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file))) {
//                PersonDelet = (ArrayList<Person>) inputStream.readObject();
//            } catch (IOException | ClassNotFoundException e) {
//                isNotWrittenOrRead = true;
//            }
//        }

    }

    private static void addPerson(Set<Person> arrayList) {
        String[] names = new String[]{"Petya", "Vasya", "Nikita", "Egor", "Dmitriy"};
        String[] surnames = new String[]{"Petrov", "Ivanov", "Bykov", "Titov"};

        for (int i = 0; i < COUNT; i++) {
            arrayList.add(new Person(names[i % 5], surnames[i % 4]));
        }
    }

    private static void deletPerson(Set<Person> treeSet, List<Person> PersonDelet) {
        Iterator<Person> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            Person p = iterator.next();
            if (p.getAge() < 21) {
                PersonDelet.add(p);
            }
        }
        treeSet.removeAll(PersonDelet);
    }

    private static void printPerson(Collection<Person> arrayList) {
        for (Person p : arrayList) {
            System.out.println(p);
        }
    }
}