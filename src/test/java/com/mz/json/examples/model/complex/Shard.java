package com.mz.json.examples.model.complex;

import com.google.gson.annotations.SerializedName;
import com.mz.json.validator.AbstractCheckableObject;
import com.mz.json.validator.CheckRule;

import static com.mz.json.validator.CheckType.*;

@SuppressWarnings({"InstanceVariableMayNotBeInitialized", "unused"})
public class Shard extends AbstractCheckableObject {
    @CheckRule(NON_NEGATIVE_INTEGER)
    @SerializedName("records-updated")
    public int recordsUpdated;

    @CheckRule(NOT_NULL)
    @SerializedName("commit-date")
    public String commitDate;

    @CheckRule(TRUE)
    @SerializedName("replicated")
    public boolean replicated;

    @CheckRule(FALSE)
    @SerializedName("failed")
    public boolean failed;

    @CheckRule(ANY)
    @SerializedName("mixed")
    public Object mixed;
}