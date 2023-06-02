import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Kho kho = new Kho();
        int nhap = 0;
        do {
            System.out.println("MENU==================");
            System.out.println("Nhap vao mot so tu 1 den 6 de chon Menu:");
            System.out.println("1. Them mot loai hang moi\n2. Xoa mot loai hang trong kho\n3. Nhap vao hang trong kho\n"+
                "4. Xuat hang khoi kho\n5. Thong ke\n6. In danh sach hang hoa\n7. In danh sach tat ca cac mat hang trung ten" +
                    "\n8. Thoat");
            Scanner scMa = new Scanner(System.in);
            Scanner scTen = new Scanner(System.in);
            Scanner scSoLuong = new Scanner(System.in);
            Scanner sc = new Scanner(System.in);
            nhap= sc.nextInt();
            if (nhap < 0 || nhap > 8) {
                System.out.println("Nhap sai gia tri vui long nhap lai:");
            } else if (nhap == 1) {
                Scanner sc1 = new Scanner(System.in);
                System.out.println("Them mot loai hang moi");
                System.out.println("Nhap vao ma hang hoa: ");
                String maHangHoa = scMa.next();
                System.out.println("Nhap vao ten hang hoa: ");
                String tenHang = scTen.next();
                System.out.println("Nhap vao so luong hang hoa lon hon 0 va nho hon 11");
                int soLuongHangHoa = sc1.nextInt();
                kho.ThemMotLoaiHangMoi(maHangHoa, tenHang, soLuongHangHoa);
            } else if (nhap == 2) {
                Scanner sc2 = new Scanner(System.in);
                System.out.println("Xoa mot loai hang trong kho");
                System.out.println("Nhap ma hang hoa: ");
                String inputMaHangHoa = scMa.next();
                kho.XoaMotHangKhoiKho(inputMaHangHoa);
            } else if (nhap == 3) {
                Scanner sc3 = new Scanner(System.in);
                System.out.println("Nhap hang vao kho");
                System.out.println("Nhap ma hang hoa");
                String inputMaHangHoa = scMa.next();
                System.out.println("Nhap so luong hang cong them");
                int inputHangNhapThem = scSoLuong.nextInt();
                kho.NhapHangVaoKho(inputMaHangHoa, inputHangNhapThem);
            } else if (nhap == 4) {
                Scanner sc4 = new Scanner(System.in);
                System.out.println("Xuat hang khoi kho");
                System.out.println("Nhap ma hang hoa");
                String inputMaHangHoa = scMa.next();
                System.out.println("Nhap so luong hang cong them");
                int inputSoLuongXuat = scSoLuong.nextInt();
                kho.XuatHangKhoiKho(inputMaHangHoa,inputSoLuongXuat);
            } else if (nhap == 5) {
                Scanner sc5 = new Scanner(System.in);
                System.out.println("Thong ke");
                System.out.println("1. Thong ke nhung mat hang co so luong ton kho >0\n2. Thong ke nhung mat hang co so luong ton kho = 0\n" +
                        "3. Tim kiem");
                int chonGiaTri = sc5.nextInt();
                if (chonGiaTri<0 || chonGiaTri>3){
                    System.out.println("Nhap sai gia tri vui long nhap lai:");
                } else if (chonGiaTri==1) {
                    System.out.println("Thong ke nhung mat hang co so luong ton kho >0");
                    kho.ThongKeTonKhoLonHon0();
                } else if (chonGiaTri==2) {
                    System.out.println("Thong ke nhung mat hang co so luong ton kho = 0");
                    kho.ThongKeTonKhoBang0();
                } else if (chonGiaTri==3) {
                    System.out.println("Tim kiem hang hoa dua tren ma hang hoa:");
                    System.out.println("Nhap vao ma hang hoa: ");
                    String inputMaHangHoa = scMa.next();
                    kho.TimKiem(inputMaHangHoa);
                }
            } else if (nhap==6) {
                System.out.println("Hien thi danh sach hang hoa: ");
                kho.inDanhSach();
            } else if (nhap==7) {
                Scanner sc7 = new Scanner(System.in);
                System.out.println("Hien thi danh sach tat ca cac mat hang co cung ten: ");
                System.out.println("Nhap vao ten hang hoa: ");
                String inputTenHang = scTen.next();
                kho.HienThiHangHoaCoCungTen(inputTenHang);
            }
        } while (nhap!=8);
    }
}
