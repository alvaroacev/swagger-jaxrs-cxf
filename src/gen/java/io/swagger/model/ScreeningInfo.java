package io.swagger.model;

import io.swagger.annotations.ApiModelProperty;

public class ScreeningInfo  {
  
  @ApiModelProperty(example = "null", value = "")
  private String label = null;
  @ApiModelProperty(example = "null", value = "")
  private String data = null;

 /**
   * Get label
   * @return label
  **/
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public ScreeningInfo label(String label) {
    this.label = label;
    return this;
  }

 /**
   * Get data
   * @return data
  **/
  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public ScreeningInfo data(String data) {
    this.data = data;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScreeningInfo {\n");
    
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

