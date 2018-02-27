package vip.ckbiz.vo;

import java.io.Serializable;

public class USERVO implements Serializable {

    private int ID;
    private String WEIXIN_OPEN_ID;
    private String USERNAME;
    private String PASSWORD;
    private String EMAIL;
    private String PHONE;
    private String QUESTION;
    private String ANSWER;
    private String ROLE;
    private String CREATETIME;
    private String UPDATETIME;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getWEIXIN_OPEN_ID() {
        return WEIXIN_OPEN_ID;
    }

    public void setWEIXIN_OPEN_ID(String WEIXIN_OPEN_ID) {
        this.WEIXIN_OPEN_ID = WEIXIN_OPEN_ID;
    }

    public String getUSERNAME() {
        return USERNAME;
    }

    public void setUSERNAME(String USERNAME) {
        this.USERNAME = USERNAME;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }

    public void setPASSWORD(String PASSWORD) {
        this.PASSWORD = PASSWORD;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public String getPHONE() {
        return PHONE;
    }

    public void setPHONE(String PHONE) {
        this.PHONE = PHONE;
    }

    public String getQUESTION() {
        return QUESTION;
    }

    public void setQUESTION(String QUESTION) {
        this.QUESTION = QUESTION;
    }

    public String getANSWER() {
        return ANSWER;
    }

    public void setANSWER(String ANSWER) {
        this.ANSWER = ANSWER;
    }

    public String getROLE() {
        return ROLE;
    }

    public void setROLE(String ROLE) {
        this.ROLE = ROLE;
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
        return "USERVO{" +
                "ID=" + ID +
                ", WEIXIN_OPEN_ID='" + WEIXIN_OPEN_ID + '\'' +
                ", USERNAME='" + USERNAME + '\'' +
                ", PASSWORD='" + PASSWORD + '\'' +
                ", EMAIL='" + EMAIL + '\'' +
                ", PHONE='" + PHONE + '\'' +
                ", QUESTION='" + QUESTION + '\'' +
                ", ANSWER='" + ANSWER + '\'' +
                ", ROLE='" + ROLE + '\'' +
                ", CREATETIME='" + CREATETIME + '\'' +
                ", UPDATETIME='" + UPDATETIME + '\'' +
                '}';
    }
}
