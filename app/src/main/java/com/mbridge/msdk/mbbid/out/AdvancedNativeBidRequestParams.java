package com.mbridge.msdk.mbbid.out;

/* JADX INFO: loaded from: classes6.dex */
public class AdvancedNativeBidRequestParams extends CommonBidRequestParams {

    /* JADX INFO: renamed from: d */
    private int f36806d;

    /* JADX INFO: renamed from: e */
    private int f36807e;

    public AdvancedNativeBidRequestParams(String str, String str2, int i, int i2) {
        super(str, str2);
        this.f36806d = i2;
        this.f36807e = i;
    }

    public int getHeight() {
        return this.f36806d;
    }

    public int getWidth() {
        return this.f36807e;
    }

    public void setHeight(int i) {
        this.f36806d = i;
    }

    public void setWidth(int i) {
        this.f36807e = i;
    }

    public AdvancedNativeBidRequestParams(String str, String str2, String str3, int i, int i2) {
        super(str, str2, str3);
        this.f36806d = i2;
        this.f36807e = i;
    }
}
