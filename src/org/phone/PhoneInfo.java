package org.phone;

public class PhoneInfo {
	
private void phoneInformation(String name,int id) {
	System.out.println("phonename is  "+name+"\n"+"id is  "+id);
}
private void phoneInformation(long miei,int storage) {
	System.out.println("Miei num is  "+miei+"\n"+"storage is  "+storage);
}
private void phoneInformation(int camera,String os) {
	System.out.println("camera is "+camera+"\n"+"OS is  "+os);
}

public static void main(String[]args) {
	PhoneInfo a=new PhoneInfo();
	a.phoneInformation("Oneplus", 3456);
	a.phoneInformation(2345654324545l,256);
	a.phoneInformation(64,"Android");
}
}
