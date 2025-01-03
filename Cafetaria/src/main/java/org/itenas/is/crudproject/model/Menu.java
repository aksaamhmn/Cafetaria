package org.itenas.is.crudproject.model;

public class Menu {
    private int idMenu;
    private String namaMenu;
    private int hargaMenu;

    public Menu() {
    }

    public Menu(int idMenu, String namaMenu, int hargaMenu) {
        this.idMenu = idMenu;
        this.namaMenu = namaMenu;
        this.hargaMenu = hargaMenu;
    }

    public int getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(int idMenu) {
        this.idMenu = idMenu;
    }

    public String getNamaMenu() {
        return namaMenu;
    }

    public void setNamaMenu(String namaMenu) {
        this.namaMenu = namaMenu;
    }

    public int getHargaMenu() {
        return hargaMenu;
    }

    public void setHargaMenu(int hargaMenu) {
        this.hargaMenu = hargaMenu;
    }

    

    
}