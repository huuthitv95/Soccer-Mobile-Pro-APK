package com.google.android.datatransport.cct.internal;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ExternalPRequestContext {

    public static abstract class Builder {
        public abstract ExternalPRequestContext build();

        public abstract Builder setOriginAssociatedProductId(Integer num);
    }

    public static Builder builder() {
        return new AutoValue_ExternalPRequestContext.Builder();
    }

    public abstract Integer getOriginAssociatedProductId();
}
