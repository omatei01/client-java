/**
 * Grafeas API
 * An API to insert and retrieve annotations on cloud artifacts.
 *
 * OpenAPI spec version: 0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.grafeas.client;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * RepoSource describes the location of the source in a Google Cloud Source Repository.
 */
@ApiModel(description = "RepoSource describes the location of the source in a Google Cloud Source Repository.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-08T14:44:14.136-04:00")
public class RepoSource   {
  @SerializedName("projectId")
  private String projectId = null;

  @SerializedName("repoName")
  private String repoName = null;

  @SerializedName("branchName")
  private String branchName = null;

  @SerializedName("tagName")
  private String tagName = null;

  @SerializedName("commitSha")
  private String commitSha = null;

  public RepoSource projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

   /**
   * ID of the project that owns the repo.
   * @return projectId
  **/
  @ApiModelProperty(example = "null", value = "ID of the project that owns the repo.")
  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

  public RepoSource repoName(String repoName) {
    this.repoName = repoName;
    return this;
  }

   /**
   * Name of the repo.
   * @return repoName
  **/
  @ApiModelProperty(example = "null", value = "Name of the repo.")
  public String getRepoName() {
    return repoName;
  }

  public void setRepoName(String repoName) {
    this.repoName = repoName;
  }

  public RepoSource branchName(String branchName) {
    this.branchName = branchName;
    return this;
  }

   /**
   * Name of the branch to build.
   * @return branchName
  **/
  @ApiModelProperty(example = "null", value = "Name of the branch to build.")
  public String getBranchName() {
    return branchName;
  }

  public void setBranchName(String branchName) {
    this.branchName = branchName;
  }

  public RepoSource tagName(String tagName) {
    this.tagName = tagName;
    return this;
  }

   /**
   * Name of the tag to build.
   * @return tagName
  **/
  @ApiModelProperty(example = "null", value = "Name of the tag to build.")
  public String getTagName() {
    return tagName;
  }

  public void setTagName(String tagName) {
    this.tagName = tagName;
  }

  public RepoSource commitSha(String commitSha) {
    this.commitSha = commitSha;
    return this;
  }

   /**
   * Explicit commit SHA to build.
   * @return commitSha
  **/
  @ApiModelProperty(example = "null", value = "Explicit commit SHA to build.")
  public String getCommitSha() {
    return commitSha;
  }

  public void setCommitSha(String commitSha) {
    this.commitSha = commitSha;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RepoSource repoSource = (RepoSource) o;
    return Objects.equals(this.projectId, repoSource.projectId) &&
        Objects.equals(this.repoName, repoSource.repoName) &&
        Objects.equals(this.branchName, repoSource.branchName) &&
        Objects.equals(this.tagName, repoSource.tagName) &&
        Objects.equals(this.commitSha, repoSource.commitSha);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectId, repoName, branchName, tagName, commitSha);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RepoSource {\n");
    
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    repoName: ").append(toIndentedString(repoName)).append("\n");
    sb.append("    branchName: ").append(toIndentedString(branchName)).append("\n");
    sb.append("    tagName: ").append(toIndentedString(tagName)).append("\n");
    sb.append("    commitSha: ").append(toIndentedString(commitSha)).append("\n");
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
