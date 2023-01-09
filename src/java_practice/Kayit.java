package java_practice;

public class Kayit {

     private String adSoyad="";
    private String kimlikNo="";
    private int yas=0;
    private int numara=0;
  private String sinif="";

    @Override
    public String toString() {
        return
                " ogrenci adSoyad :" + adSoyad +
                "\n ogrenci kimlikNo :" + kimlikNo +
                "\n ogrenci yas :" + yas +
                "\n ogrenci numara :" + numara +
                "\n ogrenci sinif :" + sinif  ;
    }


    public Kayit() {
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getKimlikNo() {
        return kimlikNo;
    }

    public void setKimlikNo(String kimlikNo) {
        this.kimlikNo = kimlikNo;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public int getNumara() {
        return numara;
    }

    public void setNumara(int numara) {
        this.numara = numara;
    }

    public String getSinif() {
        return sinif;
    }

    public void setSinif(String sinif) {
        this.sinif = sinif;
    }

    public Kayit(String adSoyad, String kimlikNo, int yas, int numara, String sinif){
        this.adSoyad=adSoyad;
        this.kimlikNo=kimlikNo;
        this.yas=yas;
        this.numara=numara;
        this.sinif=sinif;
    }
}
