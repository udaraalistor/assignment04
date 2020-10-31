package lk.ijse.assignment.data;

import java.util.Date;

public class Mesaage {
    private String sender;
    private String messaage;
    private Date sentTime;


    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getMessaage() {
        return messaage;
    }

    public void setMessaage(String messaage) {
        this.messaage = messaage;
    }

    public Date getSentTime(Date date) {
        return sentTime;
    }

    public void setSentTime(Date sentTime) {
        this.sentTime = sentTime;
    }
}
