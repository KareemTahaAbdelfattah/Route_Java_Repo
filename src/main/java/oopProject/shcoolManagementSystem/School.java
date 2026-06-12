package oopProject.shcoolManagementSystem;

public class School {
    public static void main(String[] args) {
        /** ========================================**
         ** @Author: Kareem Taha Abd El-Fattah
         ** @Category: Route Assessment
         ** @brief: Every Session Java Code Assessment
        /** ========================================**/

        Person teacher = new Teacher("Mr. Sasa", "Math");
        Person student = new StudentPerson("Yara", 10);

        teacher.introduce();
        student.introduce();
    }
}