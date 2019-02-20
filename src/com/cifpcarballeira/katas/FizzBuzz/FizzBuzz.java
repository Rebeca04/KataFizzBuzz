/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cifpcarballeira.katas.FizzBuzz;

/**
 *
 * @author dam204
 */
public class FizzBuzz {
 
    public String getFizzBuzz(int i) {
        String num = i+"";
        //FizzBuzz
        if ((i%5 == 0 || num.contains("5")) && (i%3 == 0 || num.contains("3"))) {
            return "FizzBuzz";
        }
        else if (i%3 == 0 || num.contains("3")) {
            return "Fizz";
        }
        else if (i%5 == 0 || num.contains("5")) {
            return "Buzz";
        }
        else {
            return i+"";
        }
        
    }
    
}
