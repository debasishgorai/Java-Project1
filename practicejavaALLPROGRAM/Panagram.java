package practicejavaALLPROGRAM;

public class Panagram {

	public static void main(String[] args) {
		System.out.println(panagram("the quick brown fox jumps oover lazy dog"));

	}
	static boolean panagram( String s) {
		for(char c='a';c<='z';c++) {
		if(!s.contains(c+""))return false;	
		}
		return true;
	}

}
