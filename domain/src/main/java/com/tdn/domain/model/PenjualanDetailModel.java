package com.tdn.domain.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.tdn.domain.object.PenjualanDetailObject;

public class PenjualanDetailModel extends BaseModel {
    @SerializedName("detail_id")
    @Expose
    private String detailId;
    @SerializedName("detail_id_transaksi")
    @Expose
    private String detailIdTransaksi;
    @SerializedName("detail_obat_id")
    @Expose
    private String detailObatId;
    @SerializedName("detail_obat")
    @Expose
    private String detailObat;
    @SerializedName("detail_jumlah")
    @Expose
    private String detailJumlah;
    @SerializedName("detail_harga")
    @Expose
    private String detailHarga;

    public String getDetailId() {
        return detailId;
    }

    public void setDetailId(String detailId) {
        this.detailId = detailId;
    }

    public String getDetailIdTransaksi() {
        return detailIdTransaksi;
    }

    public void setDetailIdTransaksi(String detailIdTransaksi) {
        this.detailIdTransaksi = detailIdTransaksi;
    }

    public String getDetailObatId() {
        return detailObatId;
    }

    public void setDetailObatId(String detailObatId) {
        this.detailObatId = detailObatId;
    }

    public String getDetailObat() {
        return detailObat;
    }

    public void setDetailObat(String detailObat) {
        this.detailObat = detailObat;
    }

    public String getDetailJumlah() {
        return detailJumlah;
    }

    public void setDetailJumlah(String detailJumlah) {
        this.detailJumlah = detailJumlah;
    }

    public String getDetailHarga() {
        return detailHarga;
    }

    public void setDetailHarga(String detailHarga) {
        this.detailHarga = detailHarga;
    }

    @Override
    public String toString() {
        return "PenjualanDetailModel{" +
                "detailId='" + detailId + '\'' +
                ", detailIdTransaksi='" + detailIdTransaksi + '\'' +
                ", detailObatId='" + detailObatId + '\'' +
                ", detailObat='" + detailObat + '\'' +
                ", detailJumlah='" + detailJumlah + '\'' +
                ", detailHarga='" + detailHarga + '\'' +
                '}';
    }

    @Override
    public Object ToObject() {
        PenjualanDetailObject o = new PenjualanDetailObject();
        o.setDetailHarga(detailHarga);
        o.setDetailId(detailId);
        o.setDetailIdTransaksi(detailIdTransaksi);
        o.setDetailJumlah(detailJumlah);
        o.setDetailObat(detailObat);
        o.setDetailObatId(detailObatId);
        return o;
    }

}