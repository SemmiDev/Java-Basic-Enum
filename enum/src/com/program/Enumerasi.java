
package com.program;

public enum Enumerasi {
Oppo(8.8),Xiaomi(9.8),Vivo(6.7),Honor(4.5),Huawei(8.7),Iphone(7.6),Advan(4.4),Realme(5.5),Redmi(4.5),Asus(6.6);
// kita juga bisa membuat constructor, tapi untuk runnya tidak buat objek, tapi langsung kita buat rates di enum

    // constructor
    double Rates;
    Enumerasi(double Rates) {
            this.Rates = Rates;
    }

    double getRating() {
            return Rates;
    }


    String tipe;

    void setTipe(String tipe) {
            this.tipe = tipe;
    }

    String getTipe() {
            return tipe;
    }

    public static void main(String[] args) {
            Enumerasi.Oppo.setTipe("Oppo Reno ten times zoom");
            Enumerasi.Xiaomi.setTipe("Xiaomi MI 9");
            Enumerasi.Vivo.setTipe("Vivo Z1 Pro");
            Enumerasi.Huawei.setTipe("Huawei mate 30 Pro");
            Enumerasi.Iphone.setTipe("Iphone 11 pro max");


            for(Enumerasi a : Enumerasi.values()) {
                    System.out.println("Brand yg ke-" + (a.ordinal() + 1) + " => \t" + a + ", dengan tipe smartphone \t => " + a.getTipe() + ". Dengan rating brand(" + a.getRating() + ")");
            }

            System.out.println(Enumerasi.Oppo.getRating());
    }
}
