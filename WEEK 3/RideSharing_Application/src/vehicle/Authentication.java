package vehicle;

public class Authentication {
private static Authentication instance;
    
    private Authentication() { }
    
    public static Authentication getInstance() {
        if(instance == null) {
            instance = new Authentication();
        }
        return instance;
    }
    
    public boolean authenticateUser(String username, String password) {
        return true; 
    }
}
