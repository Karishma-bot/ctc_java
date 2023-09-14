package exception;

public class NestedTryCatch {
	public static void check() {
		String str="TNS";
		int length=str.length();
		System.out.println("string length:"+length);
		String a=null;
		int y=6;
		try {
			try {
				System.out.println(str.charAt(y));
			}
			catch(StringIndexOutOfBoundsException ex) {
				System.out.println("index out of bounds"+ex.getMessage());
			}
			
			catch(Exception es) {
				System.out.println("exception"+es.getMessage());
			}
			System.out.println("string length"+a);
		}
			catch(NullPointerException ep)
			{
				System.out.println("null value"+ep.getMessage());
			}
		}
	}

