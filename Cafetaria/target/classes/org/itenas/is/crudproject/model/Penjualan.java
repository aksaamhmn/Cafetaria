package org.itenas.is.crudproject.model;

public class Penjualan {
    private String noFaktur;
    private String tanggal;
    private String item;
    private String qty;
    private String harga;
    private String jumlah;

    public Penjualan() {
    }

    public Penjualan(String noFaktur, String tanggal, String item, String qty, String harga, String jumlah) {
        this.noFaktur = noFaktur;
        this.tanggal = tanggal;
        this.item = item;
        this.qty = qty;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    public String getNoFaktur() {
        return noFaktur;
    }

    public void setNoFaktur(String noFaktur) {
        this.noFaktur = noFaktur;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getJumlah() {
        return jumlah;
    }

    public void setJumlah(String jumlah) {
        this.jumlah = jumlah;
    } 
}