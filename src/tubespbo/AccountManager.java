/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tubespbo;

/**
 *
 * @author Fadhilah Muhammad F
 */
public class AccountManager {
    private String id;
    private String Name;
  
    private String Emaill;
   

    public AccountManager() {
        this.id = SessionManager.getInstance().getUserId();
        this.Name = SessionManager.getInstance().getUserName();
        this.Emaill =SessionManager.getInstance().getEmail();
        
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return Name;
    }

    public String getEmaill() {
        return Emaill;
    }

    public void setEmaill(String Emaill) {
        this.Emaill = Emaill;
    }
    
    
    
    
    
}