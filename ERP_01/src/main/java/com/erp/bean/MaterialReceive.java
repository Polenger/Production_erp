package com.erp.bean;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class MaterialReceive {

    private String receiveId;

    private String materialId;

    private Integer amount;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date receiveDate;

    private String sender;

    private String receiver;

    private String note;

    private Material material;

    public String getReceiveId() {
        return receiveId;
    }

    public void setReceiveId(String receiveId) {
        this.receiveId = receiveId == null ? null : receiveId.trim();
    }

    public String getMaterialId() {
        return materialId;
    }

    public void setMaterialId(String materialId) {
        this.materialId = materialId == null ? null : materialId.trim();
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Date getReceiveDate() {
        return receiveDate;
    }

    public void setReceiveDate(Date receiveDate) {
        this.receiveDate = receiveDate;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender == null ? null : sender.trim();
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver == null ? null : receiver.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "MaterialReceive{" +
                "receiveId='" + receiveId + '\'' +
                ", materialId='" + materialId + '\'' +
                ", amount=" + amount +
                ", receiveDate=" + receiveDate +
                ", sender='" + sender + '\'' +
                ", receiver='" + receiver + '\'' +
                ", note='" + note + '\'' +
                ", material=" + material +
                '}';
    }
}