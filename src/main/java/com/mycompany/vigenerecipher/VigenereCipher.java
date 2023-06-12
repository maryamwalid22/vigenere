/*
vigener
  */

package com.mycompany.vigenerecipher;

import java.util.Scanner;

 public class VigenereCipher

{

    public static String enc( String Plaintext )

    {
     String key ="LABLABLA";
        String res ="";

        Plaintext = Plaintext.toUpperCase();

        for (int i = 0; i < Plaintext.length(); i++)

        {

            char c = Plaintext.charAt(i);
            while(c==Plaintext.lastIndexOf("y"))

            if (c < 'A' && c > 'Z' )
              
              continue;
              
            for(int j = 0;j < Plaintext.length(); i++){
                //res+=c;

            res += (char) ((c + key.charAt(j) - 2 * 'A') % 26 + 'A');

            j = ++j % key.length();
            
            }

        }

        return res;

    }

 

    public static String dec(  String cipher)

    {
        
         String key ="LABLABLA";
        String res = "";

      cipher = cipher.toUpperCase();

        for (int i = 0, j = 0; i < cipher.length(); i++)

        {

            char c = cipher.charAt(i);

            if (c < 'A'&& c > 'Z')

                continue;

            res += (char) ((c - key.charAt(j) + 26) % 26 + 'A');

            j = ++j % key.length();

        }

        return res;

    }

 

    public static void main(String[] args){
     Scanner in = new Scanner(System.in);
     
        System.out.println("enter the key");
      // String key ="key";

        System.out.println("Enter The Plain Text ,please : ");
        String PlainText = "SECURITY";
        String cipher = enc(PlainText);
        System.out.println("The Chipher Text : " + enc(PlainText));
        dec(cipher);
        System.out.println("The Plain Text : " + dec(cipher));
        System.out.println(dec(cipher));

    }

}