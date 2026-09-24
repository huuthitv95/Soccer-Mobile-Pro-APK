package com.mbridge.msdk.foundation.same.image;

import android.content.Context;
import android.graphics.Bitmap;
import com.mbridge.msdk.foundation.tools.C13229v0;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.image.b */
/* JADX INFO: compiled from: CommonImageLoader.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13100b {

    /* JADX INFO: renamed from: a */
    private static C13100b f35929a;

    protected C13100b(Context context) {
    }

    /* JADX INFO: renamed from: a */
    public static C13100b m37152a(Context context) {
        if (f35929a == null) {
            f35929a = new C13100b(context);
        }
        return f35929a;
    }

    /* JADX INFO: renamed from: a */
    public void m37153a() {
    }

    /* JADX INFO: renamed from: a */
    public void m37154a(String str) {
    }

    /* JADX INFO: renamed from: b */
    public Bitmap m37156b(String str) {
        if (C13229v0.m37943k(str)) {
            return null;
        }
        return C13102d.m37163a().m37167c(str);
    }

    /* JADX INFO: renamed from: b */
    public void m37157b() {
    }

    /* JADX INFO: renamed from: c */
    public boolean m37158c(String str) {
        if (C13229v0.m37943k(str)) {
            return false;
        }
        return C13102d.m37163a().m37168d(str);
    }

    /* JADX INFO: renamed from: a */
    public void m37155a(String str, InterfaceC13101c interfaceC13101c) {
        C13102d.m37163a().m37166b(str, null, interfaceC13101c);
    }
}
