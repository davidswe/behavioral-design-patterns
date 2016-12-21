/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

/**
 *
 * @author bsjoe
 */
public class StrategyMain {
    
    public static void main(String[] args)
    {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10,5));
        
        context = new Context(new OperationSubtract());
        System.out.println("10 - 5 = " + context.executeStrategy(10,5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10,5));

        
    }
    
}
