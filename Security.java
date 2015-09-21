/**
 * Aug 27, 2015  Security.java  pevi18

 */
package Utilities;
import java.util.*;
import javax.swing.*;

import java.security.MessageDigest;
import java.text.*;
import Reference.*;
import Utilities.*;
@SuppressWarnings("all")

public class Security {
	
		public static String sha512(String input) {
		    try{
		        MessageDigest digest = MessageDigest.getInstance("SHA-512");//gets Sha-512 Encoder
		        byte[] hash = digest.digest(input.getBytes("UTF-16"));//Changes the input to UTF, uses the bytes of UTF-16 which has more characters than basic Ascii
		        StringBuffer hexString = new StringBuffer();// initiates a empty stringbuffer with 16 as initial size

		        for (int i = 0; i < hash.length; i++) {// for each length of UTF,
		            String hex = Integer.toHexString(0xff & hash[i]);//Changes to string of Hexadecimal from ascii
		            if(hex.length() == 1) hexString.append('0');//Checks to make sure the hexlength is correct or else return 0
		            hexString.append(hex);// inputs to the number into the string
		        }

		        return hexString.toString();//returns the hashed number into a string
		    } catch(Exception ex){
		       throw new RuntimeException(ex);
		    }
		}
}
