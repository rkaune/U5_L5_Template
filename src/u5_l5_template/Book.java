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
  
  //Default Constructor
  public Book()
  {
    title = "Generic Title";
    author = "Generic Author";
    year = 1900;
  }
  //Constructor
  public Book(String t, String a, int y)
  {
    //new Book();
    title = t;
    author = a;
    year = y;
  }
  
  /**
   * 
   * @return This returns the title of the book
   */
  public String getTitle(){
      return this.title;
  }
  
  /**
   * 
   * @param t This is the title of the Book.
   */
  public void setTitle(String t){
      this.title = t;
  }
  
  /**
   * 
   * @return This returns the author of the book
   */
  public String getAuthor(){
      return this.author;
  }
  
  public void setAuthor(String a){
      this.author = a;
  }
  
  public int getYear(){
      return this.year;
  }
  
  public void setYear(int d){
      this.year = d;
  }
  public String toString(){
      String bookListing = this.getTitle()+this.getAuthor()+this.getYear();
      return bookListing;
      
  }
}
