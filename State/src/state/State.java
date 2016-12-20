/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;


/**
 *
 * @author bsjoe
 */
public interface State {

    /**
     * @param args the command line arguments
     */
    public void doAction(Context context);
}
