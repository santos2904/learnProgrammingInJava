/** Challenge Activity 1 - Product Catalog Demo II
 * 
 * In this activity, we will extend the product catalog demo example to include
 * a new product:
 * 
 * 1. Movie.java with:
 *    - Constructor
 *    - getRunlength() / setRunlength() methods
 *    - override the getType() method
 * 2. And adjust the main() method to include the movie 
 *    "Terminator" for 14.95, run length 180 minutes in the product catalog. 
 * 
 * SAMPLE RUN w/OUTPUT:
 
NAME      	     PRICE	TYPE      
Moby Dick 	   19.99	Book      
Cool Jeans	   59.99	Pants     
Lead Pencil	    1.99	Product   
Terminator	   14.95	Movie     
 
*/
package productcatalogdemo;

/**
 *
 * @author SantosHTPC
 */
public class Movie extends Product {
    private int length;
    
    public Movie(String name, double price, int length) {
        super (name, price);
        this.length = length;
    }
    
    public int getLength() {
        return this.length;
    }
    
    public int setLength(int length) {
        return (this.length = length);
    }
    
    @Override
    public String getType () {
        return "Movie";
    }
    
}
