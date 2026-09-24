package com.bytedance.sdk.component.p145fi.p146lr.p147ik.p149ri.p150lr;

import android.graphics.Bitmap;
import android.support.v4.media.session.PlaybackStateCompat;
import com.bytedance.sdk.component.p145fi.InterfaceC2591bu;
import com.bytedance.sdk.component.p145fi.p146lr.p147ik.p149ri.C2606ik;

/* JADX INFO: renamed from: com.bytedance.sdk.component.fi.lr.ik.ri.lr.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C2610ri implements InterfaceC2591bu {

    /* JADX INFO: renamed from: ik */
    private int f7362ik;

    /* JADX INFO: renamed from: ka */
    private C2606ik<String, Bitmap> f7363ka;

    /* JADX INFO: renamed from: lr */
    private int f7364lr;

    /* JADX INFO: renamed from: ri */
    private long f7365ri = PlaybackStateCompat.ACTION_SET_PLAYBACK_SPEED;

    public C2610ri(int i, int i2) {
        this.f7364lr = i2;
        this.f7362ik = i;
        this.f7363ka = new C2606ik<>(this.f7364lr);
    }

    /* JADX INFO: renamed from: ri */
    public static int m9706ri(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getAllocationByteCount();
    }

    @Override // com.bytedance.sdk.component.p145fi.InterfaceC2625ri
    /* JADX INFO: renamed from: lr, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public boolean mo9703lr(String str) {
        try {
            return this.f7363ka.m9698ri(str) != null;
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.sdk.component.p145fi.InterfaceC2625ri
    /* JADX INFO: renamed from: ri, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public Bitmap mo9704ri(String str) {
        try {
            return this.f7363ka.m9698ri(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.component.p145fi.InterfaceC2625ri
    /* JADX INFO: renamed from: ri, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public boolean mo9705ri(String str, Bitmap bitmap) {
        if (str != null && bitmap != null) {
            try {
                int iM9706ri = m9706ri(bitmap);
                if (iM9706ri <= this.f7365ri && iM9706ri != 0) {
                    this.f7363ka.m9700ri(str, bitmap);
                    return true;
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }
}
