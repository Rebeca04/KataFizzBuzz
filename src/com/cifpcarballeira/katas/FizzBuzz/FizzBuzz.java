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
        //rama contiene 5
        if (i%5 == 0 && i%3 == 0) {
            return "FizzBuzz";
        }
        else if (i%3 == 0) {
            return "Fizz";
        }
        else if (i%5 == 0) {
            return "Buzz";
        }
        else {
            return i+"";
        }
        
    }
    
}
