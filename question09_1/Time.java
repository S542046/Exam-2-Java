/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question09_1;

/**
 *
 * @author S542046
 */
public interface Time {

    String timetaken();

    default String myst(String name) {
        String str = name.substring(3);
        return str;
    }

}
