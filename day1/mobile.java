package Week1.day1;

public class mobile {
 short noOfmobilepiece= 1;
 long mobileNumber = 9876543210L;
 char mobileLogo = 'Q';
 int modelNumber = 43435267;
 float mobilePrice = 15523.156f;
 boolean isDamaged = false;
 String brandName = "IQOO NEO 6 ";
public static void main(String[] args) {
 mobile phone = new mobile();
 System.out.println("MobileName - "+ phone.brandName);
 System.out.println(phone.noOfmobilepiece);
 System.out.println(phone.mobileNumber);
 System.out.println(phone.mobileLogo);
 System.out.println(phone.modelNumber);
 System.out.println(phone.mobilePrice);
 System.out.println(phone.isDamaged); 
}
}
