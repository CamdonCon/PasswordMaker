import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(generatePassword());
    }

    public static String generatePassword(){
        Random rando = new Random();
        String password = "";

        // Best practice recommends a minimum password length of 12
        int password_length = rando.nextInt(12, 16);

        // The for loop will generate the password by adding either number, letter, or character
        // at every index of password length
        for(int x = 0; x<password_length; x++){
            //Randomly determine whether a character will be a number, letter, or special character
            int character = rando.nextInt(3);

            if(character == 0){ //NUMBER
                int c = rando.nextInt(10);
                password = password + c;
                
            } else if(character == 1){ //LETTER
                // Converts randomized numbers into their ASCII corresponding letter
                char c = (char)(rando.nextInt(26) + 'a');
                //Randomize whether the letter is upper or lower case
                boolean upperCase = rando.nextBoolean();
                if(upperCase){
                    password = password + Character.toUpperCase(c);
                }
                password = password + c;
                
            } else if(character == 2){ //SPECIAL CHARACTER
                // Converts randomized numbers into their ASCII corresponding special characters 
                char c = (char)(rando.nextInt(33, 48));
                password = password + c;

            }
        }

        // Returns the fully constructed password
        return password;
    }

}


