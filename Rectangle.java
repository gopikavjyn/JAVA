/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangle;

/**
 *
 * @author sjcet
 */
public class Rectangle {
    int l,b,ar,p;
    Rectangle()
    {
        l=20;
        b=10;
        
    }
    public void perimeter()
    {
        p=2*(l+b);
        System.out.println("perimeter of rectangle is="+p);
    }
    public void area()
    {
        ar=l*b;
        System.out.println("Area of rectangle is="+ar);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        {
            Rectangle r=new Rectangle();
        r.perimeter();
        r.area();
    }
        // TODO code application logic here
    }
    
}
