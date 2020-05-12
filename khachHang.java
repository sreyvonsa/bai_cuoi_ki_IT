import java.util.Scanner;

public class khachHang {
	
	public static void main(String[] args) {
     String Ma;
	String HoTen;
	 String DiaChi;
	 String Sdt;
	 int Csm;
	 int Csc;
	
	 Scanner sc = new Scanner(System.in);
		
	    System.out.println("Nhap Ma khach  hang :");
	    Ma = sc.nextLine();
	    System.out.println("Nhap ho va ten");
		HoTen = sc.nextLine();
		System.out.println("Nhap dia chi");
		DiaChi = sc.nextLine();
		System.out.println("Nhap so dien thoai");
		Sdt = sc.nextLine();
		System.out.println("Nhap chi so moi");
		Csm = sc.nextInt();
		System.out.println("Nhap chi so cu");
		Csc = sc.nextInt();
		
		System.out.println("Ma khach hangla: " +Ma);
	    System.out.println("Ho ten khach hang la: " +HoTen);
		System.out.println("Dia chi khach hang la : "+DiaChi);
		System.out.println("So dien thoai khach hang la: "+Sdt);
	 
		
	
	
	
	  int tt = Csm - Csc;
	  int Muc1= 30;
	  int Muc2= 50;
	  int Muc3= 100;
	  int Muc4= 150;
	   
	    float tientam ;
		float tongtien = 0 ;
		float tongtien1 =0;
		float tongtien2 = 0;
		float tongtien3 = 0;
		double thanhtoan;
		double thanhtoan1;
	//Dinh muc 1
		if (tt<=Muc1) {
		tientam = tt * 1500;
		System.out.println("Tong dien tieu thu: = Dinh muc I.");
	     System.out.print("Tong tien thanh toan la:= "+ tientam);
	// Dinh muc 2
	}
	else if(tt <= Muc2) {
		tientam = tt* 1800;
		System.out.println("Tong dien tieu thu: = Dinh muc II.");
	     System.out.print("Tong tien thanh toan la:= "+ tientam);
		// Dinh muc 3
	}
	else if (tt <= Muc3) {
		tientam = tt* 2000;
		System.out.println("Tong dien tieu thu: = Dinh muc III.");
	     System.out.print("Tong tien thanh toan la:= "+ tientam);
		// Dinh muc 4
	}
	else if (tt <= Muc4) {
		tientam = tt* 2500;
		tongtien = tientam * 3/10;
		thanhtoan = tientam + tongtien;
		if (tientam > 300000) {
			System.out.println("Tong dien tieu thu: =IV.");
	         System.out.println("Tien dien thang nay:= "+ tientam +"+ phu phi " + tongtien );
	         System.out.println(" Tong tien thanh toan la:" +thanhtoan );
	         
	         }
		else {
   	     System.out.println("Tong dien tieu thu: =IV.");
   	     System.out.print("Tong tien thanh toan la:= "+ tientam);
   	     }
		}
	//Dinh muc 5 
	else {
		tientam = tt * 3500;
	tongtien2 = tientam * 8/10;
	tongtien3 = tientam * 11/10;
	thanhtoan = tientam + tongtien3;
	thanhtoan1 = tientam + tongtien2;
	if (tientam > 1000000) {
		System.out.println("Tong dien tieu thu: = V.");
        System.out.println("Tien dien thang nay:= "+tientam + "+phu thu " + tongtien3);
        System.out.println("Tong tien thanh toan la: " +thanhtoan);
        
        }
	else {
		
  	     System.out.println("Tong dien tieu thu: =V.");
  	     System.out.println("Tien dien thang nay:= "+ tientam + "phu thu " +tongtien2);
  	     System.out.println("Tong tien thanh toan la :" +thanhtoan1);
	}
	}
	}
}
	
	


	
	
	
	

	
	

