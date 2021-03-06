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
 * A set of properties that uniquely identify a given Docker image.
 */
@ApiModel(description = "A set of properties that uniquely identify a given Docker image.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-04T13:20:14.121-07:00")
public class DockerImageFingerprint {
  @SerializedName("v1_name")
  private String v1Name = null;

  @SerializedName("v2_blob")
  private List<String> v2Blob = null;

  @SerializedName("v2_name")
  private String v2Name = null;

  public DockerImageFingerprint v1Name(String v1Name) {
    this.v1Name = v1Name;
    return this;
  }

   /**
   * The layer-id of the final layer in the Docker image&#39;s v1 representation. This field can be used as a filter in list requests.
   * @return v1Name
  **/
  @ApiModelProperty(value = "The layer-id of the final layer in the Docker image's v1 representation. This field can be used as a filter in list requests.")
  public String getV1Name() {
    return v1Name;
  }

  public void setV1Name(String v1Name) {
    this.v1Name = v1Name;
  }

  public DockerImageFingerprint v2Blob(List<String> v2Blob) {
    this.v2Blob = v2Blob;
    return this;
  }

  public DockerImageFingerprint addV2BlobItem(String v2BlobItem) {
    if (this.v2Blob == null) {
      this.v2Blob = new ArrayList<String>();
    }
    this.v2Blob.add(v2BlobItem);
    return this;
  }

   /**
   * The ordered list of v2 blobs that represent a given image.
   * @return v2Blob
  **/
  @ApiModelProperty(value = "The ordered list of v2 blobs that represent a given image.")
  public List<String> getV2Blob() {
    return v2Blob;
  }

  public void setV2Blob(List<String> v2Blob) {
    this.v2Blob = v2Blob;
  }

  public DockerImageFingerprint v2Name(String v2Name) {
    this.v2Name = v2Name;
    return this;
  }

   /**
   * Output only. The name of the image&#39;s v2 blobs computed via:   [bottom] :&#x3D; v2_blob[bottom]   [N] :&#x3D; sha256(v2_blob[N] + \&quot; \&quot; + v2_name[N+1]) Only the name of the final blob is kept. This field can be used as a filter in list requests.
   * @return v2Name
  **/
  @ApiModelProperty(value = "Output only. The name of the image's v2 blobs computed via:   [bottom] := v2_blob[bottom]   [N] := sha256(v2_blob[N] + \" \" + v2_name[N+1]) Only the name of the final blob is kept. This field can be used as a filter in list requests.")
  public String getV2Name() {
    return v2Name;
  }

  public void setV2Name(String v2Name) {
    this.v2Name = v2Name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DockerImageFingerprint dockerImageFingerprint = (DockerImageFingerprint) o;
    return Objects.equals(this.v1Name, dockerImageFingerprint.v1Name) &&
        Objects.equals(this.v2Blob, dockerImageFingerprint.v2Blob) &&
        Objects.equals(this.v2Name, dockerImageFingerprint.v2Name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(v1Name, v2Blob, v2Name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DockerImageFingerprint {\n");
    
    sb.append("    v1Name: ").append(toIndentedString(v1Name)).append("\n");
    sb.append("    v2Blob: ").append(toIndentedString(v2Blob)).append("\n");
    sb.append("    v2Name: ").append(toIndentedString(v2Name)).append("\n");
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

