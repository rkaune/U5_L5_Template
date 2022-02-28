/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u5_l5_template;
import java.io.*;
import static java.lang.System.*;

import java.util.Scanner;
/**
 *
 * @author rkaune
 */
class U5_L5_Template{
    public static void main (String str[]){

        Book b = new Book("I am Malala", "Malala Yousafzai", 2013);
        System.out.println(b);
        b.setTitle("The End of the world!");
        System.out.println(b.getTitle());

    }
}
