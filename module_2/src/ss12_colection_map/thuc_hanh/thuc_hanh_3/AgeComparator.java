package ss12_colection_map.thuc_hanh.thuc_hanh_3;

import java.util.Comparator;

public class AgeComparator implements Comparator<Students> {
    @Override
    public int compare(Students o1, Students o2) {
        if(o1.getAge() > o2.getAge()){
            return 1;
        }else if(o1.getAge() == o2.getAge()){
            return 0;
        }else{
            return -1;
        }
    }
}
