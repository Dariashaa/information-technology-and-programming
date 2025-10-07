package lab2;

class TeacherAssistant extends Teacher{
    private String superior;
    private String gradeLevel;
    private Boolean examPreperation;


    // контруктор по умолчанию
    public TeacherAssistant(){
        this.superior = "";
        this.gradeLevel = "";
        this.examPreperation = false;

    }

    public TeacherAssistant(String name, String gender, int birthDate, int workExperience, String subject, 
    int hoursPerWeek, String superior, String gradeLevel, boolean examPreperation){
        super(name, gender, birthDate, workExperience, subject, hoursPerWeek);
        this.superior = superior;
        this.gradeLevel = gradeLevel;
        this.examPreperation = examPreperation;
    }

    // геттеры и сеттеры
    public String getSuperior(){
        return this.superior;
    }

     public void setSuperior(String superior){
        this.superior = superior;
    } 

    public String getGradeLevel(){
        return this.gradeLevel;
    }

     public void setGradeLevel(String gradeLevel){
        this.gradeLevel = gradeLevel;
    } 

    public void setExamPreparation(boolean examPreperation){
        this.examPreperation = examPreperation;
    }

    // методы
    @Override
    public String getRole() {
        return "Teacher Assistant";
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Superior: " + superior);
        System.out.println("Grade level: " + gradeLevel);
        System.out.println("Exam preparation: " + examPreperation + "\n");;
    }

    public void nextLevel(){
        if ("primary school".equals(gradeLevel)){
            this.gradeLevel = "high school";
        }

    }
}
