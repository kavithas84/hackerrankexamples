package com.refresher;

import java.util.Comparator;

public class StudentComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Student s1=(Student) o1;
        Student s2=(Student) o2;
        if(s1.cgpa>s2.cgpa){
            return -1;
        }if(s1.cgpa==s2.cgpa){
            int nameComparison = s1.name.compareTo(s2.name);
            if(nameComparison==0){
                if(s1.id<s2.id){
                    return -1;
                }
                return -1;
            }else return nameComparison;
        }
        return 1;
    }
}
