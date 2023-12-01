/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trystream;

import java.util.Optional;
import java.util.stream.Stream;

/**
 *
 * @author riyaj
 */
public class TryStream {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stream.of("Gujarat","Goa")
        .findFirst()
        .ifPresent(System.out::println);
        
    }
}
