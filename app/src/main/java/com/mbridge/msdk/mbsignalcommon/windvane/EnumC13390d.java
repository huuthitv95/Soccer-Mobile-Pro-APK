package com.mbridge.msdk.mbsignalcommon.windvane;

import androidx.media3.common.MimeTypes;

/* JADX INFO: renamed from: com.mbridge.msdk.mbsignalcommon.windvane.d */
/* JADX INFO: compiled from: MimeTypeEnum.java */
/* JADX INFO: loaded from: classes6.dex */
public enum EnumC13390d {
    JS("js", "application/x-javascript"),
    CSS("css", "text/css"),
    JPG("jpg", "image/jpeg"),
    JPEG("jpep", "image/jpeg"),
    PNG("png", MimeTypes.IMAGE_PNG),
    WEBP("webp", MimeTypes.IMAGE_WEBP),
    GIF("gif", "image/gif"),
    HTM("htm", "text/html"),
    HTML("html", "text/html");


    /* JADX INFO: renamed from: a */
    private String f37172a;

    /* JADX INFO: renamed from: b */
    private String f37173b;

    EnumC13390d(String str, String str2) {
        this.f37172a = str;
        this.f37173b = str2;
    }

    /* JADX INFO: renamed from: g */
    public String m38718g() {
        return this.f37173b;
    }

    /* JADX INFO: renamed from: h */
    public String m38719h() {
        return this.f37172a;
    }
}
