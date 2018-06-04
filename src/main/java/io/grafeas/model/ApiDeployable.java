/*
 * Grafeas API
 * An API to insert and retrieve annotations on cloud artifacts.
 *
 * OpenAPI spec version: v1alpha1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.grafeas.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * An artifact that can be deployed in some runtime.
 */
@ApiModel(description = "An artifact that can be deployed in some runtime.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-04T13:20:14.121-07:00")
public class ApiDeployable {
  @SerializedName("resource_uri")
  private List<String> resourceUri = null;

  public ApiDeployable resourceUri(List<String> resourceUri) {
    this.resourceUri = resourceUri;
    return this;
  }

  public ApiDeployable addResourceUriItem(String resourceUriItem) {
    if (this.resourceUri == null) {
      this.resourceUri = new ArrayList<String>();
    }
    this.resourceUri.add(resourceUriItem);
    return this;
  }

   /**
   * Resource URI for the artifact being deployed.
   * @return resourceUri
  **/
  @ApiModelProperty(value = "Resource URI for the artifact being deployed.")
  public List<String> getResourceUri() {
    return resourceUri;
  }

  public void setResourceUri(List<String> resourceUri) {
    this.resourceUri = resourceUri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiDeployable apiDeployable = (ApiDeployable) o;
    return Objects.equals(this.resourceUri, apiDeployable.resourceUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceUri);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiDeployable {\n");
    
    sb.append("    resourceUri: ").append(toIndentedString(resourceUri)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
