package tubespbo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Fadhilah Muhammad F
 */
public class AdminAccount extends AccountManager{

  
    private int status;
    private static AdminAccount adc;

    
    

    public AdminAccount() {
        super();
        this.status = 1; 
        
    }
    public static synchronized AdminAccount getAdmin() {
        if (adc == null) {
            adc = new AdminAccount();
        }
        return adc;
    }

  
    public int getStatus() {
        return status;
    }


   
}