package vip.ckbiz.vo;

public class EVENT01VO {

    private int ID;
    private String PUBLISHER;
    private String TITLE;
    private String DESCRIPTION;
    private String PIC;
    private String EVENT_TYPE;
    private String ISSHOW;
    private String STARTTIME;
    private String ENDTIME;
    private String ADDRESS;
    private String LATITUDE;
    private String LONGITUDE;
    private String PEOPLENUM;
    private String CREATETIME;
    private String UPDATETIME;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getPUBLISHER() {
        return PUBLISHER;
    }

    public void setPUBLISHER(String PUBLISHER) {
        this.PUBLISHER = PUBLISHER;
    }

    public String getTITLE() {
        return TITLE;
    }

    public void setTITLE(String TITLE) {
        this.TITLE = TITLE;
    }

    public String getDESCRIPTION() {
        return DESCRIPTION;
    }

    public void setDESCRIPTION(String DESCRIPTION) {
        this.DESCRIPTION = DESCRIPTION;
    }

    public String getPIC() {
        return PIC;
    }

    public void setPIC(String PIC) {
        this.PIC = PIC;
    }

    public String getEVENT_TYPE() {
        return EVENT_TYPE;
    }

    public void setEVENT_TYPE(String EVENT_TYPE) {
        this.EVENT_TYPE = EVENT_TYPE;
    }

    public String getISSHOW() {
        return ISSHOW;
    }

    public void setISSHOW(String ISSHOW) {
        this.ISSHOW = ISSHOW;
    }

    public String getSTARTTIME() {
        return STARTTIME;
    }

    public void setSTARTTIME(String STARTTIME) {
        this.STARTTIME = STARTTIME;
    }

    public String getENDTIME() {
        return ENDTIME;
    }

    public void setENDTIME(String ENDTIME) {
        this.ENDTIME = ENDTIME;
    }

    public String getADDRESS() {
        return ADDRESS;
    }

    public void setADDRESS(String ADDRESS) {
        this.ADDRESS = ADDRESS;
    }

    public String getLATITUDE() {
        return LATITUDE;
    }

    public void setLATITUDE(String LATITUDE) {
        this.LATITUDE = LATITUDE;
    }

    public String getLONGITUDE() {
        return LONGITUDE;
    }

    public void setLONGITUDE(String LONGITUDE) {
        this.LONGITUDE = LONGITUDE;
    }

    public String getPEOPLENUM() {
        return PEOPLENUM;
    }

    public void setPEOPLENUM(String PEOPLENUM) {
        this.PEOPLENUM = PEOPLENUM;
    }

    public String getCREATETIME() {
        return CREATETIME;
    }

    public void setCREATETIME(String CREATETIME) {
        this.CREATETIME = CREATETIME;
    }

    public String getUPDATETIME() {
        return UPDATETIME;
    }

    public void setUPDATETIME(String UPDATETIME) {
        this.UPDATETIME = UPDATETIME;
    }

    @Override
    public String toString() {
        return "EVENT01VO{" +
                "ID=" + ID +
                ", PUBLISHER='" + PUBLISHER + '\'' +
                ", TITLE='" + TITLE + '\'' +
                ", DESCRIPTION='" + DESCRIPTION + '\'' +
                ", PIC='" + PIC + '\'' +
                ", EVENT_TYPE='" + EVENT_TYPE + '\'' +
                ", ISSHOW='" + ISSHOW + '\'' +
                ", STARTTIME='" + STARTTIME + '\'' +
                ", ENDTIME='" + ENDTIME + '\'' +
                ", ADDRESS='" + ADDRESS + '\'' +
                ", LATITUDE='" + LATITUDE + '\'' +
                ", LONGITUDE='" + LONGITUDE + '\'' +
                ", PEOPLENUM='" + PEOPLENUM + '\'' +
                ", CREATETIME='" + CREATETIME + '\'' +
                ", UPDATETIME='" + UPDATETIME + '\'' +
                '}';
    }
}
