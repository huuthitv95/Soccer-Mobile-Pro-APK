package com.mbridge.msdk.video.dynview.error;

/* JADX INFO: renamed from: com.mbridge.msdk.video.dynview.error.a */
/* JADX INFO: compiled from: EnumError.java */
/* JADX INFO: loaded from: classes7.dex */
public enum EnumC13946a {
    NOT_FOUND_VIEWOPTION(-1, "ViewOption is null"),
    NOT_FOUND_CONTEXT(-2, "Context is null"),
    NOT_FOUND_LAYOUTNAME(-3, "layout xml name is null"),
    CAMPAIGNEX_IS_NULL(-4, "Campaign size only one"),
    VIEW_CREATE_ERROR(-5, "view create error"),
    NOT_FOUND_ROOTVIEW(-6, "rootview is null");


    /* JADX INFO: renamed from: a */
    private int f39992a;

    /* JADX INFO: renamed from: b */
    private String f39993b;

    EnumC13946a(int i, String str) {
        this.f39992a = i;
        this.f39993b = str;
    }

    /* JADX INFO: renamed from: g */
    public int m41771g() {
        return this.f39992a;
    }

    /* JADX INFO: renamed from: h */
    public String m41772h() {
        return this.f39993b;
    }
}
