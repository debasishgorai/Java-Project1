package practicejavaALLPROGRAM;

public class Panagram2 {

	public static void main(String[] args) {
		System.out.println(panagram("awertyuiop ASDfghjkl zxcvbnmj"));

	}
	static boolean panagram(String s) {
		s=s.toLowerCase();
		for(char c='a';c<='z';c++) {
			if(!s.contains(c+""))return false;
		}
		return true;
	}

}
