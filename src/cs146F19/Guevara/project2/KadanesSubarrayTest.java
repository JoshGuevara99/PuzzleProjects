package cs146F19.Guevara.project2;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

class KadanesSubarrayTest {

	@Test
	public void test() throws FileNotFoundException {
		
		BufferedReader input = new BufferedReader(new FileReader("/Users/joshuaguevara/eclipse-workspace/JavaPractice/JavaWorkspace/PuzzleProjects/src/cs146F19/Guevara/project2/maxSumtest (1).txt"));
		Scanner outReader = new Scanner(input);
		int[] elements = new int[100];
		int[] theAnswers = new int[3];
		
		for(int i = 0; i <= 9; i++)
		{
			for(int j = 0; j <= 99; j++) 
			{
				elements[j] = outReader.nextInt();
			}
			for(int k = 0; k < 3; k++)
			{
				theAnswers[k] = outReader.nextInt();
			}
		}
		
		KadanesSubarray test = new KadanesSubarray(elements);
		test.KadaneFind();
		
		assertEquals(theAnswers[0], test.KadaneFind());
		assertEquals(theAnswers[1], test.getStart());
		assertEquals(theAnswers[2], test.getFinish());
		
	}


}
