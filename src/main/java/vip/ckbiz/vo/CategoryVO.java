package vip.ckbiz.vo;

import java.util.Date;

public class CategoryVO {

    private int ID;
    private int PARENT_ID;
    private String CATEGORYNAME;
    private int STATUS;
    private int USE_FLAG;
    private int SORT_ORDER;
    private Date CREATETIME;
    private Date UPDATETIME;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getPARENT_ID() {
        return PARENT_ID;
    }

    public void setPARENT_ID(int PARENT_ID) {
        this.PARENT_ID = PARENT_ID;
    }

    public String getCATEGORYNAME() {
        return CATEGORYNAME;
    }

    public void setCATEGORYNAME(String CATEGORYNAME) {
        this.CATEGORYNAME = CATEGORYNAME;
    }

    public int getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(int STATUS) {
        this.STATUS = STATUS;
    }

    public int getUSE_FLAG() {
        return USE_FLAG;
    }

    public void setUSE_FLAG(int USE_FLAG) {
        this.USE_FLAG = USE_FLAG;
    }

    public int getSORT_ORDER() {
        return SORT_ORDER;
    }

    public void setSORT_ORDER(int SORT_ORDER) {
        this.SORT_ORDER = SORT_ORDER;
    }

    public Date getCREATETIME() {
        return CREATETIME;
    }

    public void setCREATETIME(Date CREATETIME) {
        this.CREATETIME = CREATETIME;
    }

    public Date getUPDATETIME() {
        return UPDATETIME;
    }

    public void setUPDATETIME(Date UPDATETIME) {
        this.UPDATETIME = UPDATETIME;
    }

    @Override
    public String toString() {
        return "CategoryVO{" +
                "ID=" + ID +
                ", PARENT_ID=" + PARENT_ID +
                ", CATEGORYNAME='" + CATEGORYNAME + '\'' +
                ", STATUS=" + STATUS +
                ", USE_FLAG=" + USE_FLAG +
                ", SORT_ORDER=" + SORT_ORDER +
                ", CREATETIME=" + CREATETIME +
                ", UPDATETIME=" + UPDATETIME +
                '}';
    }
}
