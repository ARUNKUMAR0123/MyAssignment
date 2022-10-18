package Week2.day1;

public class RemoveDuplicates {
	public static void main(String[] args) {
		String text="we learn java basics as part of java session in week1";
		String[]sp=text.split(" ");
		for (int i = 0; i < sp.length; i++) {
			for (int j = 0; j < sp.length; j++) {
				if(sp[i].equals(sp[j])) {
					//System.out.println(" "+sp[j]);
					sp[j]="";
				}
					
			}
			System.out.println(" "+sp[i]);
		}
	}

}

