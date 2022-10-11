package Week1.day2;

public class mobile {
 public void sendMessage() {
	 System.out.println("sendMessage");
 }
 public void shareDocument() {
	 System.out.println("shareDocument");
 }
 public void call() {
	 System.out.println("call");
 }
public static void main(String[] args) {
	mobile myMobile = new mobile();
	myMobile.sendMessage();
	myMobile.shareDocument();
	myMobile.call();
}
}
