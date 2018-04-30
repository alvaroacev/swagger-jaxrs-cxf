package com.io.swagger.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import io.swagger.annotations.ApiModelProperty;

public class CanonicalScreenMessage  {
  
  @ApiModelProperty(example = "null", value = "Unique message identifer")
  private String businessMessageId = null;
  @ApiModelProperty(example = "null", value = "")
  private Date creationDate = null;
  @ApiModelProperty(example = "null", value = "")
  private String senderBIC8 = null;
  @ApiModelProperty(example = "null", value = "")
  private String receiverBIC8 = null;
  @ApiModelProperty(example = "null", value = "")
  private List<ScreeningInfo> screeningInfo = new ArrayList<ScreeningInfo>();

 /**
   * Unique message identifer
   * @return businessMessageId
  **/
  public String getBusinessMessageId() {
    return businessMessageId;
  }

  public void setBusinessMessageId(String businessMessageId) {
    this.businessMessageId = businessMessageId;
  }

  public CanonicalScreenMessage businessMessageId(String businessMessageId) {
    this.businessMessageId = businessMessageId;
    return this;
  }

 /**
   * Get creationDate
   * @return creationDate
  **/
  public Date getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(Date creationDate) {
    this.creationDate = creationDate;
  }

  public CanonicalScreenMessage creationDate(Date creationDate) {
    this.creationDate = creationDate;
    return this;
  }

 /**
   * Get senderBIC8
   * @return senderBIC8
  **/
  public String getSenderBIC8() {
    return senderBIC8;
  }

  public void setSenderBIC8(String senderBIC8) {
    this.senderBIC8 = senderBIC8;
  }

  public CanonicalScreenMessage senderBIC8(String senderBIC8) {
    this.senderBIC8 = senderBIC8;
    return this;
  }

 /**
   * Get receiverBIC8
   * @return receiverBIC8
  **/
  public String getReceiverBIC8() {
    return receiverBIC8;
  }

  public void setReceiverBIC8(String receiverBIC8) {
    this.receiverBIC8 = receiverBIC8;
  }

  public CanonicalScreenMessage receiverBIC8(String receiverBIC8) {
    this.receiverBIC8 = receiverBIC8;
    return this;
  }

 /**
   * Get screeningInfo
   * @return screeningInfo
  **/
  public List<ScreeningInfo> getScreeningInfo() {
    return screeningInfo;
  }

  public void setScreeningInfo(List<ScreeningInfo> screeningInfo) {
    this.screeningInfo = screeningInfo;
  }

  public CanonicalScreenMessage screeningInfo(List<ScreeningInfo> screeningInfo) {
    this.screeningInfo = screeningInfo;
    return this;
  }

  public CanonicalScreenMessage addScreeningInfoItem(ScreeningInfo screeningInfoItem) {
    this.screeningInfo.add(screeningInfoItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CanonicalScreenMessage {\n");
    
    sb.append("    businessMessageId: ").append(toIndentedString(businessMessageId)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    senderBIC8: ").append(toIndentedString(senderBIC8)).append("\n");
    sb.append("    receiverBIC8: ").append(toIndentedString(receiverBIC8)).append("\n");
    sb.append("    screeningInfo: ").append(toIndentedString(screeningInfo)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

