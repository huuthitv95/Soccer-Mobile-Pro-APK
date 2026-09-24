package com.mbridge.msdk.click.entity;

/* JADX INFO: renamed from: com.mbridge.msdk.click.entity.a */
/* JADX INFO: compiled from: ClickResponseHeader.java */
/* JADX INFO: loaded from: classes4.dex */
public class C12687a {

    /* JADX INFO: renamed from: a */
    public String f33659a;

    /* JADX INFO: renamed from: b */
    public String f33660b;

    /* JADX INFO: renamed from: c */
    public String f33661c;

    /* JADX INFO: renamed from: d */
    public String f33662d;

    /* JADX INFO: renamed from: e */
    public int f33663e;

    /* JADX INFO: renamed from: f */
    public int f33664f;

    /* JADX INFO: renamed from: g */
    public String f33665g;

    /* JADX INFO: renamed from: h */
    public String f33666h;

    /* JADX INFO: renamed from: a */
    public String m34666a() {
        return "statusCode=" + this.f33664f + ", location=" + this.f33659a + ", contentType=" + this.f33660b + ", contentLength=" + this.f33663e + ", contentEncoding=" + this.f33661c + ", referer=" + this.f33662d;
    }

    public String toString() {
        return "ClickResponseHeader{location='" + this.f33659a + "', contentType='" + this.f33660b + "', contentEncoding='" + this.f33661c + "', referer='" + this.f33662d + "', contentLength=" + this.f33663e + ", statusCode=" + this.f33664f + ", url='" + this.f33665g + "', exception='" + this.f33666h + "'}";
    }
}
