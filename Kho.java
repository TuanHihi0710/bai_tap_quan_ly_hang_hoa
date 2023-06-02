public class Kho {
    HangHoa[] hh;
    public int soLuongMatHang;

    public Kho() {
        hh = new HangHoa[5];
    }

    public Kho(int tongSoLuongMatHang) {
        soLuongMatHang = tongSoLuongMatHang;
        hh = new HangHoa[5];
    }

    public void ThemMotLoaiHangMoi(String maHangHoa, String tenHang, int soLuongTonKho) {
        HangHoa hhMoi = new HangHoa(maHangHoa, tenHang, soLuongTonKho);
        for (int i = 0; i < hh.length; i++) {
            if (hh[i] == null) {
                if(soLuongTonKho>0&&soLuongTonKho<=10){
                hh[i] = hhMoi;
                soLuongMatHang++;
                break;
            }else {
                    System.out.println("So luong ton kho vuot qua quy dinh: ");
                    break;
                }
            }
            if(soLuongMatHang == 5){
                System.out.println("So luong mat hang da qua tai:");
            }
        }
    }

    public void inDanhSach() {
        for (HangHoa item : hh) {
            if (item!= null) {
                System.out.println(item.danhSachHangHoa());
            }
        }
    }

    public void XoaMotHangKhoiKho(String inputMaHangHoa) {
        for (int i = 0; i < hh.length; i++) {
            if(hh[i] != null){
                if (hh[i].getMaHangHoa().equals(inputMaHangHoa)) {
                    hh[i] = null;
                    soLuongMatHang--;
                    break;
                }
            }
        }
    }

    public void NhapHangVaoKho(String inputMaHangHoa, int inputHangNhapThem) {
        for (int i = 0; i < hh.length; i++) {
            if (hh[i].getMaHangHoa().equals(inputMaHangHoa)) {
                if (inputHangNhapThem<= 10-hh[i].getSoLuongTonKho()) {
                    hh[i].setSoLuongTonKho(hh[i].getSoLuongTonKho() + inputHangNhapThem);
                    System.out.println(hh[i].danhSachHangHoa());
                }else {
                    System.out.println("So luong hang hoa qua tai:");
                }
                break;
            }
        }
    }

    public void XuatHangKhoiKho(String inputMaHangHoa, int inputSoLuongXuat) {
        for (int i = 0; i < hh.length; i++) {
            if (hh[i].getMaHangHoa().equals(inputMaHangHoa)) {
                if (hh[i].getSoLuongTonKho()>= inputSoLuongXuat) {
                    hh[i].setSoLuongTonKho(hh[i].getSoLuongTonKho() - inputSoLuongXuat);
                    System.out.println(hh[i].danhSachHangHoa());
                }else {
                    System.out.println("Hang hoa trong kho da het <>");
                }
                break;
            }
        }
    }
    public void ThongKeTonKhoLonHon0() {
        for (int i = 0; i < hh.length; i++) {
            if(hh[i] != null){
                if(hh[i].getSoLuongTonKho() > 0) {
                    System.out.println(hh[i].danhSachHangHoa());
                }
            }
        }
    }
    public void ThongKeTonKhoBang0() {
        for (int i = 0; i < hh.length; i++) {
            if(hh[i] != null){
                if(hh[i].getSoLuongTonKho() == 0) {
                    System.out.println(hh[i].danhSachHangHoa());
                }
            }
        }
    }
    public void TimKiem(String inputMaHangHoa){
        for (int i = 0; i < hh.length; i++) {
            if (hh[i].getMaHangHoa().equals(inputMaHangHoa)) {
                System.out.println(hh[i].danhSachHangHoa());
                break;
            }
        }
    }
    public void HienThiHangHoaCoCungTen(String inputTenHang){
        for (int i = 0; i < hh.length; i++) {
            if (hh[i] != null){
                if(hh[i].getTenHang().contains(inputTenHang)) {
                    System.out.println(hh[i].danhSachHangHoa());
                }
            }
        }
    }
}
