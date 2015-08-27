/**
 * Aug 12, 2015  GUI.java  Poon

 */
package Utilities;

import java.util.*;

import javax.swing.*;

import java.text.*;



@SuppressWarnings("all")
public class GUI {
//This covers the basic GUI commands to make programs more interesting.s
// popup uses two strings the first being the message and the second being the title of the popup	
//	inputstring requires one input being the message to give to the user for the input
//	inputinteger and inputdecimal converts the string into integer and double respectively
//
	public static void popup(String a, String b) {
		JOptionPane.showMessageDialog(null, a, b, JOptionPane.PLAIN_MESSAGE);
	}

	public static String inputstring(String b) {
		String a = JOptionPane.showInputDialog(b);
		return a;
	}

	public static int inputinteger(String b) {
		String a = JOptionPane.showInputDialog(b);
		int c = Integer.parseInt(a);
		return c;
	}

	public static double inputdecimal(String b) {
		String a = JOptionPane.showInputDialog(b);

		double c = Double.parseDouble(a);
		return c;
	}

}
