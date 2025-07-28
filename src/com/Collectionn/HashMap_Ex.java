package com.Collectionn;

import java.util.HashMap;
import java.util.Map;

public class HashMap_Ex {
    public static void main(String[]args){
        Map<Character, String> students = new HashMap<>();

        students.put('A',"Reshma");
        students.put('Z',"Sowmiya");
        students.put('H',"Punitha");
        students.put('a',"Reshma");
        students.put('E',"Reshma");
        students.put('H',"Charu");
        System.out.println(students);

        System.out.println(students.remove('a'));
        System.out.println(students.remove('H', "Charul"));
        System.out.println(students.get('A'));
        System.out.println(students.containsKey('E'));
        System.out.println(students.containsValue("Sowmiya"));
        System.out.println(students.replace('E',"Reshma", "Anitha"));
    }
}
