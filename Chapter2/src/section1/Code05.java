package section1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code05 {
	
	static MyRectangle1 [] rects = new MyRectangle1[100];
	static int n = 0; // 사각형의 개수

	public static void main(String[] args) {
		try {
			Scanner in = new Scanner(new File("data.txt"));
			while(in.hasNext()) {
				int x = in.nextInt();
				int y = in.nextInt();
				int w = in.nextInt();
				int h = in.nextInt();
				
				rects[n] = new MyRectangle1();
				// lu 역시 primitive type이 아니야
				// **************************
				rects[n].lu = new MyPoint1();
				// ***************************
				rects[n].lu.x = x;
				rects[n].lu.y = y;
				rects[n].width = w;
				rects[n].height = h;
				n++;
				
			}
			
			
			
			in.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("No data file.");
			System.exit(1);
		}
		bubbleSort();
		
		for(int i=0; i<n; i++) {
			System.out.println(rects[i].lu.x + " " + rects[i].lu.y + " " + rects[i].width + " " + rects[i].height);
		}
		
		
	}
	
	private static void bubbleSort() {
		for(int i=n-1; i>0; i--) {
			for(int j=0; j<i; j++) {
				if (calcArea(rects[j]) > calcArea(rects[i])) {
					MyRectangle1 tmp = rects[i];
					rects[i] = rects[j];
					rects[j] = tmp;
					
				}
			}
		}
	}
	
	private static int calcArea(MyRectangle1 r) {
		return r.width * r.height;
		
	}

}
