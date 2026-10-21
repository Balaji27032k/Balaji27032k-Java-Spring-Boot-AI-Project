package com.udemy;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        StringBuffer sb = new StringBuffer("New ");
        System.out.println( "String Buffer Capacity Before:" + sb.capacity() );
        sb.append("Balaji And Sundaresan");
        System.out.println( "String Buffer Capacity After:" + sb.capacity() );
        String str = sb.toString();
        System.out.println(str);
    }

}
