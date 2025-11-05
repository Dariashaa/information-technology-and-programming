package lab3;

public class Employee{
        private String name;
        private String position;
        private int salary;

        public Employee(){
            this.name = "untitled";
            this.position = "null";
            this.salary = 0;
        }
    
        public Employee(String name, String position, int salary){
            this.name = name;
            this.position = position;
            this.salary = salary;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;

            Employee other = (Employee) obj;
            return this.name.equals(other.name)
            && this.position.equals(other.position)
            && this.salary == other.salary;
        }

        @Override
            public int hashCode() {
            int result = name.hashCode();  
            result = 31 * result + position.hashCode();    
            result = 31 * result + salary;      
            return result;
        }

        public String getName() {
            return name;
        }

        public String getPosition() {
            return position;
        }

        public int getSalary() {
            return salary;
        }
        
        public void setName(String name) {
            this.name = name;
        }
        
        public void setPosition(String position) {
            this.position = position;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }
    }
