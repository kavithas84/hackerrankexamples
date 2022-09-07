package com.refresher;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Priorities {
    PriorityQueue<Student> pq = new PriorityQueue<>(new StudentComparator());

    List<Student> getStudents(List<String> events) {
        List<Student> studentList = new ArrayList<Student>();
        for (int i = 0; i < events.size(); i++) {
            String currentEventString = events.get(i);
            String[] event = currentEventString.split(" ");
            //if current event is enter, add items to PQ
            if (event[0].equals("ENTER")) {
                //John 3.75 50
                Student newStudent = new Student(Integer.valueOf(event[3]), event[1], Double.valueOf(event[2]));
                pq.add(newStudent);
                System.out.println("added" + newStudent);
            } else {
                //if current even is SERVED, remove items from PQ
                System.out.println("removing" + pq.peek());
                if (pq.peek() != null)
                pq.remove();

            }
        }
        Object[] objects = pq.toArray();
        for (int i = 0; i < objects.length; i++) {
            if (pq.peek() != null)
                studentList.add((Student) pq.remove());
        }
        return studentList;

    }



}
