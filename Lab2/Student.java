package lab2;

class Student extends Human {
    private int course;
    private String group;
    private String faculty;

    // контруктор по умолчанию
    public Student(){
        super();
        this.course = 1;
        this.group = "";
        this.faculty = ""; 
    }

    // конструктор с параметрами
    public Student (String name, String gender, int birthDate, int course, String group, String faculty){
        super(name, gender, birthDate);
        this.course = course;
        this.group = group;
        this.faculty = faculty;
    }

    // геттеры и сеттеры
        public int getCourse() {
        return course;
    }
    
    public void setCourse(int course) {
        if (course >= 1 && course <= 6) {
            this.course = course;
        }
    }
    
    public String getGroup() {
        return group;
    }
    
    public void setGroup(String group) {
        this.group = group;
    }
    
    public String getFaculty() {
        return faculty;
    }
    
    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    // методы
    @Override
    public String getRole() {
        return "Student";
    }

    public void getGraduate() {
        if (this.course < 6) {
            this.course += 1;
        }
    }

    public void getInfo(){
        super.getInfo();
        System.out.println("Course: " + course + "\nGroup: " + group + "\nFaculty: " + faculty);
        System.out.println("Role: " + getRole()+ "\n");
    }
    
}
