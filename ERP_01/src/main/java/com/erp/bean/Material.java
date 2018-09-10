package com.erp.bean;

import javax.validation.constraints.Size;

public class Material {

    @Size(max=40, message="物料信息编号长度不能长于40")
    private String materialId;

    @Size(max=100, message="物料类型的长度限制在100个字符之内")
    private String materialType;

    @Size(max=100, message = "物料状态长度限制在100字符之内")
    private String status;

    @Size
    private Integer remaining;
    @Size(max = 2000, message = "物料备注长度限制在2000字符之内")
    private String note;

    public Material() {}

    public Material(String materialId,
                    String materialType,
                    String status, Integer remaining,
                    String note) {
        this.materialId = materialId;
        this.materialType = materialType;
        this.status = status;
        this.remaining = remaining;
        this.note = note;
    }

    public String getMaterialId() {
        return materialId;
    }

    public void setMaterialId(String materialId) {
        this.materialId = materialId == null ? null : materialId.trim();
    }

    public String getMaterialType() {
        return materialType;
    }

    public void setMaterialType(String materialType) {
        this.materialType = materialType == null ? null : materialType.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Integer getRemaining() {
        return remaining;
    }

    public void setRemaining(Integer remaining) {
        this.remaining = remaining;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    @Override
    public String toString() {
        return "Material{" +
                "materialId='" + materialId + '\'' +
                ", materialType='" + materialType + '\'' +
                ", status='" + status + '\'' +
                ", remaining=" + remaining +
                ", note='" + note + '\'' +
                '}';
    }

}