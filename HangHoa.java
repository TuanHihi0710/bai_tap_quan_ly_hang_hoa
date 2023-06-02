
public class HangHoa {
    private String maHangHoa;
    private String tenHang;
    private int soLuongTonKho;

    public String getMaHangHoa(){
        return maHangHoa;
    }
    public String getTenHang(){
        return tenHang;
    }
    public int getSoLuongTonKho(){
        return soLuongTonKho;
    }

    public void setMaHangHoa(String inputMaHangHoa) {
        maHangHoa = inputMaHangHoa;
    }
    public void setTenHang(String inputTenHang){
        tenHang=inputTenHang;
    }
    public void setSoLuongTonKho(int inputSoLuongTonKho){
        soLuongTonKho=inputSoLuongTonKho;
    }

    public HangHoa() {
    }

    public HangHoa(String inputMaHangHoa, String inputTenHang, int inputSoLuongTonKho) {
        maHangHoa = inputMaHangHoa;
        tenHang = inputTenHang;
        soLuongTonKho = inputSoLuongTonKho;
    }
    public String danhSachHangHoa() {
        System.out.println("Ma hang hoa: " + maHangHoa);
        System.out.println("Ten hang hoa: " + tenHang);
        System.out.println("So luong ton kho: " + soLuongTonKho);
        return "==========";
    }
}

