/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tubespbo;

/**
 *
 * @author Fadhilah Muhammad F
 */
public abstract class UserAccount extends AccountManager{
    
       
    private String id;
    private String Name;
    private int status;

    public UserAccount() {
        super();
        this.status = 0;      
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return Name;
    }
    public int status(){
        return status;
    }
}
