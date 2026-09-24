package com.bytedance.sdk.openadsdk.p172ac.p173ri;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.component.utils.C2721ka;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.ac.ri.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C2754lr {

    /* JADX INFO: renamed from: fi */
    private Bitmap f7944fi;

    /* JADX INFO: renamed from: ik */
    private byte[] f7945ik;

    /* JADX INFO: renamed from: ka */
    private Bitmap f7946ka;

    /* JADX INFO: renamed from: lr */
    private Drawable f7947lr;

    /* JADX INFO: renamed from: ri */
    int f7948ri;

    public C2754lr(Bitmap bitmap, Bitmap bitmap2, int i) {
        this.f7947lr = null;
        this.f7945ik = null;
        this.f7944fi = bitmap2;
        this.f7946ka = bitmap;
        this.f7948ri = i;
    }

    public C2754lr(Drawable drawable, int i) {
        this.f7945ik = null;
        this.f7946ka = null;
        this.f7944fi = null;
        this.f7947lr = drawable;
        this.f7948ri = i;
    }

    public C2754lr(byte[] bArr, int i) {
        this.f7947lr = null;
        this.f7946ka = null;
        this.f7944fi = null;
        this.f7945ik = bArr;
        this.f7948ri = i;
    }

    /* JADX INFO: renamed from: fi */
    public boolean m10475fi() {
        if (this.f7946ka != null || this.f7947lr != null) {
            return true;
        }
        byte[] bArr = this.f7945ik;
        return bArr != null && bArr.length > 0;
    }

    /* JADX INFO: renamed from: ik */
    public byte[] m10476ik() {
        try {
            if (this.f7945ik == null) {
                this.f7945ik = C2721ka.m10237ri(this.f7946ka);
            }
        } catch (OutOfMemoryError e) {
            C2707ac.m10196ik("GifRequestResult", e.getMessage());
        }
        return this.f7945ik;
    }

    /* JADX INFO: renamed from: ka */
    public Drawable m10477ka() {
        return this.f7947lr;
    }

    /* JADX INFO: renamed from: lr */
    public Bitmap m10478lr() {
        return this.f7944fi;
    }

    /* JADX INFO: renamed from: ri */
    public Bitmap m10479ri() {
        return this.f7946ka;
    }
}
