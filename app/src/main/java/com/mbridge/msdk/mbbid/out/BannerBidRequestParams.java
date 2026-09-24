package com.mbridge.msdk.mbbid.out;

/* JADX INFO: loaded from: classes6.dex */
public class BannerBidRequestParams extends CommonBidRequestParams {

    /* JADX INFO: renamed from: d */
    private int f36808d;

    /* JADX INFO: renamed from: e */
    private int f36809e;

    public BannerBidRequestParams(String str, String str2, int i, int i2) {
        super(str, str2);
        this.f36808d = i2;
        this.f36809e = i;
    }

    public int getHeight() {
        return this.f36808d;
    }

    public int getWidth() {
        return this.f36809e;
    }

    public void setHeight(int i) {
        this.f36808d = i;
    }

    public void setWidth(int i) {
        this.f36809e = i;
    }

    public BannerBidRequestParams(String str, String str2, String str3, int i, int i2) {
        super(str, str2, str3);
        this.f36808d = i2;
        this.f36809e = i;
    }
}
