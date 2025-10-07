package lab2;

class Teacher extends Human {
    protected int workExperience;
    protected String subject;
    private int hoursPerWeek;

    // контруктор по умолчанию
    public Teacher(){
    this.workExperience = 0;
    this.subject = "";
    this.hoursPerWeek = 0;
    }

    public Teacher(String name, String gender, int birthDate, int workExperience, String subject, int hoursPerWeek){
        super(name, gender, birthDate);
        this.workExperience = workExperience;
        this.subject = subject;
        this.hoursPerWeek = hoursPerWeek;

    }
    
    // геттеры и сеттеры
    public int getWorkExperience() {
        return workExperience;
    }
    
    public void setWorkExperience(int workExperience) {
        this.workExperience = workExperience;
    }
    
    public String getSubject() {
        return subject;
    }
    
    public void setSubject(String subject) {
        this.subject = subject;
    }

        public int getHoursPerWeek() {
        return hoursPerWeek;
    }
    
    public void setHoursPerWeek(int hoursPerWeek) {
        if (hoursPerWeek >= 0 && hoursPerWeek <= 40) {
            this.hoursPerWeek = hoursPerWeek;
        }
    }  

    // методы
    @Override
    public String getRole() {
        return "Teacher";
    }

    public void workExpUp(){
        this.workExperience+=1;
    }
    
    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Work Experience: " + workExperience + " years");
        System.out.println("Subject: " + subject);
        System.out.println("Hours per week: " + hoursPerWeek);
        System.out.println("Role: " + getRole() + "\n");
    }
}

