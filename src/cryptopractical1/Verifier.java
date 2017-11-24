/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cryptopractical1;

/**
 *
 * @author Jake
 */
public class Verifier {
    public static boolean verifyISBN(String isbn)
    {
        int toCheck = 0;
        for(int i = 1; i < 11; i++) //loop through the characters in the string
        {
            if(isbn.charAt(i - 1) != 'X' || isbn.charAt(i - 1) != 'x')        
                toCheck += Character.getNumericValue(isbn.charAt(i - 1)) * i; //add the value of the character
            else                                                              //multiplied by the index
                toCheck += 10 * i;//replace any X characters in the string with the value 10
        }
        return toCheck % 11 == 0; //return whether the isbn is valid by applying mod 11 to it
    }
    
    public static boolean verifyCC(String cc)
    {
        int toCheck = 0;
        for(int i = 0; i < 16; i++) //loop through characters in the string
        {
            if(i % 2 == 0 || i == 0)
            {
                if(Character.getNumericValue(cc.charAt(i)) * 2 >= 10)
                {
                    toCheck += Character.getNumericValue(cc.charAt(i)) * 2 - 9; //if the value is 10 > remove 9
                }
                else
                {
                    toCheck += Character.getNumericValue(cc.charAt(i)) * 2; //add double of every other character
                }
            }
            else
            {
                toCheck += Character.getNumericValue(cc.charAt(i)); //add every other character
            }
        }
        return toCheck % 10 == 0;//return whether the cc number is valid by applying mod 1 to it
    }
}
//