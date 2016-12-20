/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsibility;

/**
 *
 * @author bsjoe
 */
public class ChainOfResponsibility {

private static AbstractLogger getChainOfLoggers(){

    AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
    AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
    AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
    

    errorLogger.setNextLogger(fileLogger);
    fileLogger.setNextLogger(consoleLogger);

   return errorLogger;    
}
    
    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        AbstractLogger loggerChain = getChainOfLoggers();
        loggerChain.logMessage(AbstractLogger.INFO, "This is an info.");
        loggerChain.logMessage(AbstractLogger.DEBUG, "This is an debug info.");
        loggerChain.logMessage(AbstractLogger.ERROR, "This is an error info.");
        
    }
    
}
