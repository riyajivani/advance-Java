/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pkgtry;

public interface Vehical 
{
     default void drive()
    {
        System.out.println("Drive me I'M a vehical!");
    }
    
    static void blow()
    {
        System.out.println("Blow horn!");
    }
}
