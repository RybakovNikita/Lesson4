package Project;

import java.util.Comparator;

public class SurnameComparator  implements Comparator<Person>{
    @Override
    public int compare (Person o1, Person o2){
        return o1.getSurname().compareTo(o2.getSurname());
    }
}
