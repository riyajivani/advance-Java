
package riya;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Student {
    private final int rollNumber;
    private final String name;

    public Student(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }
}

class Group {
    private final String groupName;
    private final List<Student> members;

    public Group(String groupName) {
        this.groupName = groupName;
        this.members = new ArrayList<>();
    }

    public String getGroupName() {
        return groupName;
    }

    public List<Student> getMembers() {
        return members;
    }

    public void addMember(Student student) {
        members.add(student);
    }
}

public class StudentGroupApp {
    public static void main(String[] args) {
        // Create students
        Student student1 = new Student(1, "Alice");
        Student student2 = new Student(2, "Bob");
        Student student3 = new Student(3, "Charlie");
        Student student4 = new Student(4, "David");

        // Create groups and add members
        Group group1 = new Group("Group A");
        group1.addMember(student1);
        group1.addMember(student2);
        group1.addMember(student3);

        Group group2 = new Group("Group B");
        group2.addMember(student2);
        group2.addMember(student3);
        group2.addMember(student4);

        // Find unique members between two groups
        Set<Student> uniqueMembers = new HashSet<>();
        uniqueMembers.addAll(group1.getMembers());
        uniqueMembers.addAll(group2.getMembers());

        // Display unique member names
        System.out.println("Unique Members of Group A and Group B:");
        for (Student student : uniqueMembers) {
            System.out.println(student.getName());
        }
    }
}
