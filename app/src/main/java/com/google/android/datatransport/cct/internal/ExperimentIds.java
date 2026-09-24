package com.google.android.datatransport.cct.internal;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ExperimentIds {

    public static abstract class Builder {
        public abstract ExperimentIds build();

        public abstract Builder setClearBlob(byte[] bArr);

        public abstract Builder setEncryptedBlob(byte[] bArr);
    }

    public static Builder builder() {
        return new AutoValue_ExperimentIds.Builder();
    }

    public abstract byte[] getClearBlob();

    public abstract byte[] getEncryptedBlob();
}
