package lab4.Throwable;
public class CustomAgeException extends Exception{

    public CustomAgeException(){
        super("Неподходящий возраст");
    }
    
    public CustomAgeException(String message) {
        super(message);
    }
    
    // Конструктор с сообщением и причиной
    public CustomAgeException(String message, Throwable cause) {
        super(message, cause);
        
    } 
}
