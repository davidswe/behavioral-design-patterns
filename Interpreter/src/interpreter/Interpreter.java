/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interpreter;

/**
 *
 * @author bsjoe
 */
public class Interpreter {

     public static Expression getMaleExpression() {
          Expression robert = new TerminalExpression("Robert");
          Expression john = new TerminalExpression("John");
          return new OrExpression(robert, john);
        }
 
     public static Expression getMarriedWomanExpression() {
          Expression julie = new TerminalExpression("Julie");
          Expression married = new TerminalExpression("Married");
          return new AndExpression(julie, married);
        }

     
     
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();
        
        System.out.println("John is male? " + isMale.interpret("John"));
        System.out.println("Julie is a married woman? " + isMarriedWoman.interpret("Julie Married"));
        
    }
    
}
