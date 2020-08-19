import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Test {
	
	final static int HEAP_SIZE = 25;

	public static void main(String[] args) throws IOException {
		
		// TODO Auto-generated method stub
		

		
		
		 BufferedReader br = new BufferedReader(new FileReader("src/in.csv"));
	     String row;
	     row = br.readLine();
	     String[] data = null ;
	     long[][] abcd = new long[25][1000];
	     int jj=0;
	     for(int i = 0; i < HEAP_SIZE; i++) {
			 while((row = br.readLine()) != null)
			 {
				 data = row.split(",");
			 }
			 
	     }
		 System.out.println(data[9999]);
		 
		 System.out.println(br.toString());
//		
//		long startTime = System.nanoTime(); 
//		long totalTime = 0;
//		
//		long a[][] = new long[25][10000];
//		
//		KeyVal kv[] = new KeyVal[25];
//
//		
//		Scanner s = new Scanner(new File("src/in.csv"));
//		s.useDelimiter(",");
//		
//		System.out.println(s.nextLong());
//	
//		for (int i = 0; i < HEAP_SIZE; i++) {
//			for (int j = 0; j < 10000; j++) {
//				if(s.hasNextLong()) a[i][j] = s.nextLong();
//				
////				System.out.println(s.hasNextLong());
//			}
//			kv[i] = new KeyVal(a[i][0], i);
//				s.nextLine();
//		}
		
//		System.out.println(s.nextLong());
//		System.out.println(a[24][9999]);
		
		
//		System.out.println(kv[01].getKey());
		
//		
//		startTime = System.nanoTime();
//
//		MyBinaryHeap h = new MyBinaryHeap(HEAP_SIZE);
//		
//		for (int i = 0; i < HEAP_SIZE; i++) {
//			h.insert(kv[i]);
//			h.insert(a[i][0]);
//		}
//		
//		
//		ArrayList<Long> temporary = new ArrayList<>();
//		
//		KeyVal lp = h.deleteMin();
//		temporary.add(lp.getKey());
//
//
//		for (int i = 1; i < 250000-25; i++) {
////			
////			System.out.println("i: " + i);
//			
//			lp = new KeyVal(a[i%25][i/25], i%25);
//			h.insert(lp);
////			
//			lp = h.deleteMin();
//			temporary.add(lp.getKey());
//			
////			System.out.println(a[i%25][i/25]);
//			System.out.println(temporary.get(i));
//			
////			totalTime+= (System.nanoTime()-startTime);
////			System.out.println(i + ", " + totalTime);
//		}
//		
//
//		startTime = System.nanoTime();
//		
//		PriorityQueue<KeyVal> q = new PriorityQueue<>(HEAP_SIZE);
//		
//		for (int i = 0; i < HEAP_SIZE; i++) {
//			q.add(kv[i]);
//		}
//		
//		
//		
//		ArrayList<Long> temporary = new ArrayList<>();
//		
//		KeyVal lp = q.poll();
//		temporary.add(q.poll().getKey());
		
//		for (int i = 0; i < 24; i++) {
//			System.out.println(q.poll().getKey());
//		}

//		for (int i = 1; i < 250000-25; i++) {
//			
////			lp = new KeyVal(a[i%25][i/25], i/10000);
//			temporary.add(q.poll().getKey());
//
//			q.add(new KeyVal(a[i%25][i/25], i/10000));
//			
//			
////			totalTime+= (System.nanoTime()-startTime);
////			System.out.println(i + ", " + totalTime);
//		}
//		for (int i = 0; i < 250000-50; i++) {
//			System.out.println(temporary.get(i));
//
//		}
		
		
		
		
	}

}
