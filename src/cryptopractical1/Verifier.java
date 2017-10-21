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
        for(int i = 1; i < 11; i++)
            toCheck += Character.getNumericValue(isbn.charAt(i - 1)) * i;
        return toCheck % 11 == 0;
    }
    
    public static boolean verifyCC(String cc)
    {
        System.out.println("checking");
        int toCheck = 0;
        for(int i = 0; i < 16; i++)
            //toCheck += i % 2 == 0 ? Character.getNumericValue(cc.charAt(i) * 2 >= 10 ? Character.getNumericValue(cc.charAt(i)) * 2 - 9 : Character.getNumericValue(cc.charAt(i)) * 2) : Character.getNumericValue(cc.charAt(i));
        {
            if(i % 2 == 0 || i == 0)
            {
                if(Character.getNumericValue(cc.charAt(i)) * 2 >= 10)
                {
                    toCheck += Character.getNumericValue(cc.charAt(i)) * 2 - 9;
                }
                else
                {
                    toCheck += Character.getNumericValue(cc.charAt(i)) * 2;
                }
            }
            else
            {
                toCheck += Character.getNumericValue(cc.charAt(i));
            }
        }
        System.out.println(toCheck);
        return toCheck % 10 == 0;
    }
}
//