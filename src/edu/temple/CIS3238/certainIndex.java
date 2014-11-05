/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.temple.CIS3238;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ali
 */
public class certainIndex {

    public String beforeAndAfterLabel(ArrayList<String> s, int from, int to) {

       
        
        String prints = null;
        List<String> A = new ArrayList<String>();
        for (int i = from; i <= to; i++) {
            A = s.subList(from, to);
            
            
        }

        prints = A.toString().replace(",", " ").replace("[", "").replace("]", "");

        return prints;
    }

}
