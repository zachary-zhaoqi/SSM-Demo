package pers.zhaoqi.dto;

import pers.zhaoqi.entity.Appointment;
import pers.zhaoqi.enums.AppointStateEnum;

public class AppointExecution {
    private long bookId;
    private int status;
    private String stateInfo;
    private Appointment appointment;

    public AppointExecution() {
    }

    public AppointExecution(long bookId, AppointStateEnum stateEnum) {
        this.bookId = bookId;
        this.status = stateEnum.getState();
        this.stateInfo = stateEnum.getStateInfo();
    }

    public AppointExecution(long bookId, AppointStateEnum stateEnum, Appointment appointment) {
        this.bookId = bookId;
        this.status = stateEnum.getState();
        this.stateInfo = stateEnum.getStateInfo();
        this.appointment = appointment;
    }

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public void setStateInfo(String stateInfo) {
        this.stateInfo = stateInfo;
    }

    public Appointment getAppointment() {
        return appointment;
    }

    public void setAppointment(Appointment appointment) {
        this.appointment = appointment;
    }


}
