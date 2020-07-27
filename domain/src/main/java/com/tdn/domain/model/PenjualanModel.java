package com.tdn.domain.model;

import com.tdn.domain.object.PenjualanObject;

public class PenjualanModel extends BaseModel {
    private String penjualanTanggal;
    private String penjualanIdTransaksi;
    private String penjualanSubtotal;
    private String penjualanId;

    public void setPenjualanTanggal(String penjualanTanggal) {
        this.penjualanTanggal = penjualanTanggal;
    }

    public String getPenjualanTanggal() {
        return penjualanTanggal;
    }

    public void setPenjualanIdTransaksi(String penjualanIdTransaksi) {
        this.penjualanIdTransaksi = penjualanIdTransaksi;
    }

    public String getPenjualanIdTransaksi() {
        return penjualanIdTransaksi;
    }

    public void setPenjualanSubtotal(String penjualanSubtotal) {
        this.penjualanSubtotal = penjualanSubtotal;
    }

    public String getPenjualanSubtotal() {
        return penjualanSubtotal;
    }

    public void setPenjualanId(String penjualanId) {
        this.penjualanId = penjualanId;
    }

    public String getPenjualanId() {
        return penjualanId;
    }

    @Override
    public String toString() {
        return
                "PenjualanModel{" +
                        "penjualan_tanggal = '" + penjualanTanggal + '\'' +
                        ",penjualan_id_transaksi = '" + penjualanIdTransaksi + '\'' +
                        ",penjualan_subtotal = '" + penjualanSubtotal + '\'' +
                        ",penjualan_id = '" + penjualanId + '\'' +
                        "}";
    }

    @Override
    public Object ToObject() {
        PenjualanObject o = new PenjualanObject();
        o.setPenjualanId(penjualanId);
        o.setPenjualanIdTransaksi(penjualanIdTransaksi);
        o.setPenjualanSubtotal(penjualanSubtotal);
        o.setPenjualanTanggal(penjualanTanggal);
        return o;
    }
}
