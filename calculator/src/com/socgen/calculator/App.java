package com.socgen.calculator;
/**
 * 
 * @author DreamTeam : Anne-So, Alex, Louis, Jojo, Pat
 *
 */

public class App {

    public static void main(String[] args) {
  
        String str = args[0];
        double[] tab = new double[2];
        String[] tab2 = new String[2];
        String ope;
        double resultat;

        if (str.indexOf("-") >= 0) {
            tab2 = str.split("-");
            ope = "-";
        }
        else if (str.indexOf("/") > 0) {
            tab2 = str.split("/");
            ope = "/";
        }
        else if (str.indexOf("+") > 0) {
            tab2 = str.split("\\+");
            ope = "+";
        }
        else if (str.indexOf("%") > 0) {
            tab2 = str.split("%");
            ope = "%";
        }
        else {
            tab2 = str.split("\\*");
            ope = "*";
        }

            tab[0] = Double.parseDouble(tab2[0]);
            tab[1] = Double.parseDouble(tab2[1]);
            
            double x =  tab[0];
            double y =  tab[1];
            
        if (ope == "+") {
        	resultat = Operator.ADD.operation(x, y);
        	 System.out.println(resultat);
        }
        else if (ope == "-") {
        	resultat = Operator.SUBTRACT.operation(x, y);
       	 System.out.println(resultat);
        }
        else if (ope == "*") {
        	resultat = Operator.MULTIPLY.operation(x, y);
       	 System.out.println(resultat);
        }
        else if (ope == "/") {
        	resultat = Operator.DIVIDE.operation(x, y);
       	 System.out.println(resultat);
        }
        else {
        	resultat = Operator.MODULO.operation(x, y);
       	 System.out.println(resultat);
        }
    }   
}