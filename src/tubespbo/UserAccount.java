/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tubespbo;

/**
 *
 * @author Fadhilah Muhammad F
 */
public class UserAccount extends AccountManager{
    
       
    private static UserAccount usr;
    private int status;
        
    
    
    public UserAccount() {
        super();
        this.status = 0;      
    }
    
    public static synchronized UserAccount getuser(){
        if (usr == null) {
            usr = new UserAccount();
        }
        return usr;
    }

   
}