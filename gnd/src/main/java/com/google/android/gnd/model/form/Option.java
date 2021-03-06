/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.android.gnd.model.form;

import androidx.annotation.NonNull;
import com.google.auto.value.AutoValue;
import javax.annotation.Nullable;

/** Describes a single valid option to a multiple choice question. */
@AutoValue
public abstract class Option {
  @NonNull
  public abstract String getId();

  @Nullable
  public abstract String getCode();

  @Nullable
  public abstract String getLabel();

  public static Builder newBuilder() {
    return new AutoValue_Option.Builder();
  }

  @AutoValue.Builder
  public abstract static class Builder {
    public abstract Builder setId(@NonNull String newId);

    public abstract Builder setCode(@Nullable String newCode);

    public abstract Builder setLabel(@Nullable String newLabel);

    public abstract Option build();
  }
}
