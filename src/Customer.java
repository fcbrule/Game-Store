/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Customer {
    
    String username;
    String name;
    

    Customer()
    {
        
    }
    
    Customer(String username, String name)
    {
        this.username = username;
        this.name = name;
    }
    
    public static void main(String args[])
    {
        Login l = new Login();
        l.setVisible(true);
        l.pack();
        l.setLocationRelativeTo(null);
       
    }
    
  
}
