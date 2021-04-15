package Test0414;

public class Test1 {
	public static void main(String[] args) {
		if( args.length == 0 ) {
			System.out.println("데이터를 입력하세요.");
			System.exit(0);
		}
		System.out.println(args.length);
		for(int i=1; i<args.length; i++) {
			System.out.println(args[i]);
		}
	}
}

