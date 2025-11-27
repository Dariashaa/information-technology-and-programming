package lab4.Throwable;

public class Task3 {
    public static void checkAge(int age) throws CustomAgeException{
        if (age < 0 ){
            throw new CustomAgeException("Возраст ниже допустимого");
        } else if (age > 120){
            throw new CustomAgeException("Возраст выше допустипого");
        } else {
            System.out.println("Ведён корректный возраст");
        }

    }

    public static void main(String[] args) {
        try {
            checkAge(121);
        } catch (CustomAgeException e) {
            System.err.println("Ошибка: " + e.getMessage());
            Logger.logException(e);
        }
    }
}
