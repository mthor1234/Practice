package hashtable;

import java.awt.List;

public class HashTable {
	
	int[] data = new int[30];
	
	int[] numset = {18, 17, 14, 5, 7, 1, 5, 27, 13, 23, 12, 19, 10, 6, 7, 11,
			24, 15, 8, 15, 9, 12, 21, 25, 26, 3};
	
	
	public HashTable(){
		for(int number: numset){
			data[hashFunction(number)] = number;
		}
		
	}
	
	
	public int hashFunction(int val){
		int hash = val % (data.length - 1);
		
		return hash;
		
	}
	
	public void printHashTable(){
		int i = 0;
		for(int numbers: data){
			
			System.out.println("Index: " + i + " Number: " + numbers);
			i++;
		}
	}
	
	

}
