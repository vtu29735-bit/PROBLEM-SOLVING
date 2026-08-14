# WEEK3:JAVA SORT

import java.util.\*;



class Student {

&#x20;   private int id;

&#x20;   private String name;

&#x20;   private double cgpa;



&#x20;   public Student(int id, String name, double cgpa) {

&#x20;       this.id = id;

&#x20;       this.name = name;

&#x20;       this.cgpa = cgpa;

&#x20;   }



&#x20;   public int getId() {

&#x20;       return id;

&#x20;   }



&#x20;   public String getName() {

&#x20;       return name;

&#x20;   }



&#x20;   public double getCgpa() {

&#x20;       return cgpa;

&#x20;   }

}



public class Solution {

&#x20;   public static void main(String\[] args) {

&#x20;       Scanner sc = new Scanner(System.in);



&#x20;       int n = sc.nextInt();

&#x20;       List<Student> students = new ArrayList<>();



&#x20;       for (int i = 0; i < n; i++) {

&#x20;           int id = sc.nextInt();

&#x20;           String name = sc.next();

&#x20;           double cgpa = sc.nextDouble();



&#x20;           students.add(new Student(id, name, cgpa));

&#x20;       }



&#x20;       Collections.sort(students, new Comparator<Student>() {

&#x20;           @Override

&#x20;           public int compare(Student s1, Student s2) {



&#x20;               // 1. CGPA - decreasing

&#x20;               if (s1.getCgpa() != s2.getCgpa()) {

&#x20;                   return Double.compare(s2.getCgpa(), s1.getCgpa());

&#x20;               }



&#x20;               // 2. Name - alphabetical

&#x20;               int nameCompare = s1.getName().compareTo(s2.getName());



&#x20;               if (nameCompare != 0) {

&#x20;                   return nameCompare;

&#x20;               }



&#x20;               // 3. ID - increasing

&#x20;               return Integer.compare(s1.getId(), s2.getId());

&#x20;           }

&#x20;       });



&#x20;       for (Student s : students) {

&#x20;           System.out.println(s.getName());

&#x20;       }



&#x20;       sc.close();

&#x20;   }

}

## OUTPUT:

Input (stdin)

5

33 Rumpa 3.68

85 Ashis 3.85

56 Samiha 3.75

19 Samara 3.75

22 Fahim 3.76

Your Output (stdout)

Ashis

Fahim

Samara

Samiha

Rumpa

Expected Output

Ashis

Fahim

Samara

Samiha

Rumpa







