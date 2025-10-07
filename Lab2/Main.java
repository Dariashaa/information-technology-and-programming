package lab2;
public class Main {
    public static void main(String[] args) {
        // Демонстрация работы
        
        // Создание объектов
        Student student1 = new Student("Dave", "m", 2006, 2, "CS-101", "Computer Science");
        Teacher teacher1 = new Teacher("John Smith", "m", 1980, 10, "Mathematics", 40);
        TeacherAssistant assistant1 = new TeacherAssistant("Anna Brown", "f",
         1990, 3, "Programming",15, "Dr. Smith", "primary school", true);
        
        // Вывод информации
        student1.getInfo();
        student1.getRole();
        
        teacher1.getInfo();
        teacher1.getRole();
        
        assistant1.getInfo();
        assistant1.getRole();
        
        // счетчик
        System.out.println("Total Human objects created: " + Human.getCount());
        
        // Демонстрация методов поведения
        student1.getGraduate();
        System.out.println("Student course after graduation: " + student1.getCourse());
        
        teacher1.workExpUp();
        System.out.println("Teacher experience after increase: " + teacher1.getWorkExperience());
        
        assistant1.nextLevel();
        // System.out.println("Grade level:" + assistant1.gradeLevel); ошибка не может взять значение так как инкапсуляция
        System.out.println("Grade level:" + assistant1.getGradeLevel());
    }
}
