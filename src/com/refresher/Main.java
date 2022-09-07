package com.refresher;

import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.regex.Pattern;

public class Main {
    final static String pattern = "[0-255]\\.[0-255]\\.[0-255]\\.[0-255]";

    public static void main(String[] args) {
checkN(0);
        System.out.println(findDay(8 ,05 ,2015));
    }

    private static void checkPriorityquee(){
        {
            // write your code here
            Pattern compile = Pattern.compile(pattern);
            System.out.println(Pattern.matches("[0-255]", "200"));

            List<String> events = new ArrayList<String>();
            events.add("ENTER John 3.75 50");
            events.add("ENTER Mark 3.8 24");
            events.add("ENTER Shafaet 3.7 35");
            events.add("SERVED");
            events.add("  SERVED");
            events.add("ENTER Samiha 3.85 36");
            events.add("SERVED");
            events.add("ENTER Ashley 3.9 42");
            events.add("ENTER Maria 3.6 46");
            events.add("ENTER Anik 3.95 49");
            events.add("ENTER Dan 3.95 50");
            events.add("SERVED");
            List<Student> students = new Priorities().getStudents(events);
            for (int i = 0; i < students.size(); i++) {
                System.out.println(students.get(i).name);
            }

            events = new ArrayList<String>();
            events.add("ENTER Bidhan 3.75 50");
            events.add("ENTER Rijul 3.8 24");
            events.add("ENTER Shafaet 3.7 35");
            events.add(" SERVED");
            events.add("    SERVED");
            events.add(" ENTER Samiha 3.85 36");
            events.add("SERVED");
            events.add("ENTER Ratul 3.9 42");
            events.add(" ENTER Tanvir 3.6 46");
            events.add("ENTER Anik 3.95 49");
            events.add("  ENTER Nisha 3.95 50");
            events.add(" SERVED");
            events.add("       SERVED");
            events.add(" SERVED");
            events.add("       SERVED");
            events.add(" SERVED");
            events.add("SERVED");
            events.add("  SERVED");
            events.add("   SERVED");
            events.add(" SERVED");
            events.add(" SERVED");
            students = new Priorities().getStudents(events);
            for (int i = 0; i < students.size(); i++) {
                System.out.println(students.get(i).name);
            }
        }
    }

    private static void checkN(int n){

        String output="Weird";
        if(n%2==0){
            //it is even
            if(n>=6 && n <=20){
                output="Weird";
            }else {
                output="Not Weird";

            }
        }
        System.out.println(output);
    }

    public static String findDay(int month, int day, int year) {
        Calendar cal = new GregorianCalendar(year,month,day);
        DayOfWeek dayOfWeek = DayOfWeek.of(cal.get(Calendar.DAY_OF_WEEK));
        return dayOfWeek.name();
//        return cal.get(Calendar.DAY_OF_WEEK);
    }

}
