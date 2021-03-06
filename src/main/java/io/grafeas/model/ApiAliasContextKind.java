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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * The type of an alias.   - KIND_UNSPECIFIED: Unknown.  - FIXED: Git tag.  - MOVABLE: Git branch.  - OTHER: Used to specify non-standard aliases. For example, if a Git repo has a ref named \&quot;refs/foo/bar\&quot;.
 */
@JsonAdapter(ApiAliasContextKind.Adapter.class)
public enum ApiAliasContextKind {
  
  KIND_UNSPECIFIED("KIND_UNSPECIFIED"),
  
  FIXED("FIXED"),
  
  MOVABLE("MOVABLE"),
  
  OTHER("OTHER");

  private String value;

  ApiAliasContextKind(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ApiAliasContextKind fromValue(String text) {
    for (ApiAliasContextKind b : ApiAliasContextKind.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ApiAliasContextKind> {
    @Override
    public void write(final JsonWriter jsonWriter, final ApiAliasContextKind enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ApiAliasContextKind read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ApiAliasContextKind.fromValue(String.valueOf(value));
    }
  }
}

