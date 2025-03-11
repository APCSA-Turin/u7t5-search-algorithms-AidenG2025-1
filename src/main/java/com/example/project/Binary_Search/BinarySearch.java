package com.example.project.Binary_Search;

public class BinarySearch 
{

    public static int binarySearch(int[] elements, int target) 
    {
        int loopCounter = 0; 
        int leftIdx = 0;
        int rightIdx = elements.length - 1;

        while (leftIdx <= rightIdx) 
        {
            loopCounter++; 
            System.out.print(loopCounter + " "); 
            
            int middleIdx = leftIdx + (rightIdx - leftIdx) / 2; 
            
            if (elements[middleIdx] == target) 
            {
                return middleIdx; 
            } 
            else if (elements[middleIdx] < target) 
            {
                leftIdx = middleIdx + 1; 
            } 
            else 
            {
                rightIdx = middleIdx - 1;
            }
        }
        return -1; 
    }
}