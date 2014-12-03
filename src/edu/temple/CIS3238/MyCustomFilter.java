/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.temple.CIS3238;

import java.io.File;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author David
 */
public class MyCustomFilter extends FileFilter {
        @Override
        public boolean accept(File file) {
            
            if(file.isDirectory()) {
                return true;
            }
            
            String extension = Utils.getExtension(file);
            if(extension != null) {
                if(extension.equals(Utils.doc) ||
                        extension.equals(Utils.txt)) {
                    return true;
                } else {
                    return false;
                }
            }
            
            return false;
        }
        @Override
        public String getDescription() {
            
            return "txt, doc";
        }
    }
