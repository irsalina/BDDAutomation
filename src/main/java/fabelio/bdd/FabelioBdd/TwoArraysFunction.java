package fabelio.bdd.FabelioBdd;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.apache.commons.lang3.ArrayUtils;

public class TwoArraysFunction {
    
    public int[] outputFromTwoArrays(int[] A, int[] B) {	
    	//Subtract each elements from array B to A:[B]-[A]
    	int[] arrayB_minus_A = new int[A.length];
    	for (int i=0; i<A.length; i++) {
    		arrayB_minus_A[i] = B[i] - A[i];
    	}
    	
    	//Find intersection between A and B: A ∩ B
    	Set<Integer> s1 = new HashSet<Integer>(Arrays.asList(ArrayUtils.toObject(A)));
    	Set<Integer> s2 = new HashSet<Integer>(Arrays.asList(ArrayUtils.toObject(B)));
    	s1.retainAll(s2);
    	Integer[] intersectionAB = s1.toArray(new Integer[s1.size()]);
    	
    	//Find intersection between "arrayB_minus_A" and "intersectionAB": "arrayB_minus_A" ∩ "intersectionAB"
    	Set<Integer> s3 = new HashSet<Integer>(Arrays.asList(ArrayUtils.toObject(arrayB_minus_A)));
    	Set<Integer> s4 = new HashSet<Integer>(Arrays.asList(intersectionAB));
    	s3.retainAll(s4);
    	Integer[] finalIntersection = s3.toArray(new Integer[s3.size()]);
    	
    	int[] finalOutput = ArrayUtils.toPrimitive(finalIntersection);
    	
    	for (int a : finalOutput) {
    		System.out.println(a);
    	}
    	
    	return finalOutput;
 }
}
