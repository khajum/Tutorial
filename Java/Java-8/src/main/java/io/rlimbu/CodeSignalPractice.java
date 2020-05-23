
package io.rlimbu;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Ram Limbu
 * @version 1.0
 * @since 2020-05-17
 */
public class CodeSignalPractice {

    public static void main(String[] args) {
        
        CodeSignalPractice practice = new CodeSignalPractice();
        
        int[] elements = { 4, 3, 3, 5, 6, 2, 5, 4, 6};
        
        System.out.println("Array elements - "+Arrays.toString(elements));
        System.out.println("Solution 1 - First duplicate in elements - "+practice.firstDuplicate(elements));
        System.out.println("Solution 2 - First duplicate in elements - "+practice.firstDuplicate(elements));
        System.out.println("Solution 3 - First duplicate in elements - "+practice.firstDuplicate(elements));
        
        
    }
    
    
    //firstDuplicate - solution 1
    public int firstDuplicate(int[] numbers) {
        int duplicateElement = -1;
        int duplicateIndex = numbers.length;

        for (int i = 0; i < numbers.length - 1; i++) {

            int element = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                if (element == numbers[j] && j < duplicateIndex) {
                    duplicateElement = element;
                    duplicateIndex = j;
                }
            }
        }
        return duplicateElement;
    }
    
    //firstDuplicate - solution 2
    public int firstDuplicateSolution2(int[] numbers) {
        
        for (int i = 0; i<numbers.length; i++) {
            final int element = numbers[i];
            if (Arrays.asList(numbers).indexOf(element) != i) return element;
        }
        
        return -1;
    }
    
    public int firstDuplicateSolution3 (int[] numbers) {
        int[] indices = {};
        for (int i = 0; i<numbers.length; i++) {
            final int element = numbers[i];
            if (Arrays.asList(numbers).indexOf(element) != i) return element;
            indices[i] = i;
        }
        
        return -1;
    }

}
