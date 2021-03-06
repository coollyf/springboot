package com.busy.model;

import java.io.Serializable;

public class DjangoContentType implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column django_content_type.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column django_content_type.app_label
     *
     * @mbg.generated
     */
    private String appLabel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column django_content_type.model
     *
     * @mbg.generated
     */
    private String model;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table django_content_type
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column django_content_type.id
     *
     * @return the value of django_content_type.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column django_content_type.id
     *
     * @param id the value for django_content_type.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column django_content_type.app_label
     *
     * @return the value of django_content_type.app_label
     *
     * @mbg.generated
     */
    public String getAppLabel() {
        return appLabel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column django_content_type.app_label
     *
     * @param appLabel the value for django_content_type.app_label
     *
     * @mbg.generated
     */
    public void setAppLabel(String appLabel) {
        this.appLabel = appLabel == null ? null : appLabel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column django_content_type.model
     *
     * @return the value of django_content_type.model
     *
     * @mbg.generated
     */
    public String getModel() {
        return model;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column django_content_type.model
     *
     * @param model the value for django_content_type.model
     *
     * @mbg.generated
     */
    public void setModel(String model) {
        this.model = model == null ? null : model.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table django_content_type
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", appLabel=").append(appLabel);
        sb.append(", model=").append(model);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}