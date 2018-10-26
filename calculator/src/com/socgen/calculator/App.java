package com.socgen.calculator;
/**
 * 
 * @author DreamTeam : Anne-So, Alex, Louis, Jojo, Pat
 *
 */

public class App {

    public static void main(String[] args) {
  
        String str = args[0];
        String[] tab = new String[2];
        
        double resultat;
        
        if (str.indexOf("-") >= 0) {
            tab = str.split("-");
            Double op1 = Double.valueOf(tab[0]);
            Double op2 = Double.valueOf(tab[1]);
            resultat = Operator.SUBTRACT.operation(op1, op2);
        }
        else if (str.indexOf("/") > 0) {
            tab = str.split("/");
            Double op1 = Double.valueOf(tab[0]);
            Double op2 = Double.valueOf(tab[1]);
            resultat = Operator.DIVIDE.operation(op1, op2);
        }
        else if (str.indexOf("+") > 0) {
            tab = str.split("\\+");
            Double op1 = Double.valueOf(tab[0]);
            Double op2 = Double.valueOf(tab[1]);
            resultat = Operator.ADD.operation(op1, op2);
        }
        else if (str.indexOf("%") > 0) {
            tab = str.split("%");
            Double op1 = Double.valueOf(tab[0]);
            Double op2 = Double.valueOf(tab[1]);
            resultat = Operator.MODULO.operation(op1, op2);
        }
        else {
            tab = str.split("\\*");
            Double op1 = Double.valueOf(tab[0]);
            Double op2 = Double.valueOf(tab[1]);
            resultat = Operator.MULTIPLY.operation(op1, op2);
        }
        
        System.out.println(resultat);
        
    }   
}