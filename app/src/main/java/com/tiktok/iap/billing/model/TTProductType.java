package com.tiktok.iap.billing.model;

/* JADX INFO: loaded from: classes7.dex */
public enum TTProductType {
    IN_APP("inapp"),
    SUBS("subs");

    private String type;

    TTProductType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    @Override // java.lang.Enum
    public String toString() {
        return String.valueOf(this.type);
    }
}
