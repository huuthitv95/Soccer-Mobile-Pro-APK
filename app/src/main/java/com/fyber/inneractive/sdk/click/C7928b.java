package com.fyber.inneractive.sdk.click;

import java.util.ArrayList;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.click.b */
/* JADX INFO: loaded from: classes4.dex */
public final class C7928b {

    /* JADX INFO: renamed from: a */
    public final EnumC7943q f17607a;

    /* JADX INFO: renamed from: b */
    public final Throwable f17608b;

    /* JADX INFO: renamed from: c */
    public final String f17609c;

    /* JADX INFO: renamed from: d */
    public final String f17610d;

    /* JADX INFO: renamed from: e */
    public long f17611e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f17612f = new ArrayList();

    public C7928b(String str, EnumC7943q enumC7943q, String str2, Exception exc) {
        this.f17610d = str;
        this.f17607a = enumC7943q;
        this.f17609c = str2;
        this.f17608b = exc;
    }

    public final String toString() {
        EnumC7943q enumC7943q = this.f17607a;
        if (enumC7943q == EnumC7943q.FAILED) {
            Throwable th = this.f17608b;
            return "Open result: Failed! error: " + (th != null ? th.getMessage() : "none");
        }
        return "Open result: Success! target: " + enumC7943q + " method: " + this.f17609c;
    }
}
