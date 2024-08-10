package Pattern;

public class AbhishekPattern {
public static void main(String[] args) {
	int n=5;
	for(int []i:m(n)) {
		for(int e:i) {
			if(e!=0)
			System.out.print(e+"  ");
		}
		System.out.println();
	}
	//System.out.println(m);
}
	
	
 static int[][]m(int n) {
	 int [][]a=new int[n][n];
	int v=1;
	char dir='D';
	int r=0,c=0;
	while(c<=a.length-1) {

	switch(dir) {
	case 'D':{
	a[r][c]=v++;
	if(r==a.length-1) { c++;dir='U';
	
	}
	else {
	
			r++;
			
	}
	}
	break;
	case 'U':
		a[r][c]=v++;
	if(r==c) {
		
		dir='D';
		r++;
		c++;
	}
	else {
		
		r--;
	}
	}

	}
	return a;
}
}
