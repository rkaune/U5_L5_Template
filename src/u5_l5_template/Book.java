/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u5_l5_template;

/**
 *
 * @author rkaune
 */
public class Book
  
{
  //Fields
  private String title;
  private String author;
  private int year;
  
  //Constructor
  public Book(String t, String a, int y)
  {
    title = t;
    author = a;
    year = y;
  }
  
  public String getTitle(){
      return this.title;
  }
  
  public void setTitle(String t){
      this.title = t;
  }
  
  public String toString(){
     return this.getTitle();
      //System.out.println("");
      //System.out.println("");
  }
}
