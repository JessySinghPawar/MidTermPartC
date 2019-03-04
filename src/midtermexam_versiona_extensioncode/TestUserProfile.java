
package midtermexam_versiona_extensioncode;

import java.util.Scanner;

public class TestUserProfile {
    
    public static void main(String[]args){
            
        Scanner UserInput = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String UserID = UserInput.nextLine();
        System.out.println("");
        
        System.out.println("1.FPS\n2.Adventure\n3.Action\n4.Fantasy\n5.Strategy\n6.Unlisted");
        System.out.println("choose your favourite genre: ");
        
        String genre = UserInput.nextLine();
        
        UserProfile testUser = new UserProfile(UserID,genre);
        System.out.println("Your user profile has been created!");
        
        
        
    }

}
