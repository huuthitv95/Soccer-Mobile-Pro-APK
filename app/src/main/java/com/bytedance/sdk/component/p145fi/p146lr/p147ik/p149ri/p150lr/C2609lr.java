package com.bytedance.sdk.component.p145fi.p146lr.p147ik.p149ri.p150lr;

import android.support.v4.media.session.PlaybackStateCompat;
import com.bytedance.sdk.component.p145fi.InterfaceC2623nr;
import com.bytedance.sdk.component.p145fi.p146lr.p147ik.p149ri.C2606ik;

/* JADX INFO: renamed from: com.bytedance.sdk.component.fi.lr.ik.ri.lr.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C2609lr implements InterfaceC2623nr {

    /* JADX INFO: renamed from: ik */
    private int f7358ik;

    /* JADX INFO: renamed from: ka */
    private C2606ik<String, byte[]> f7359ka;

    /* JADX INFO: renamed from: lr */
    private int f7360lr;

    /* JADX INFO: renamed from: ri */
    private long f7361ri = PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;

    public C2609lr(int i, int i2) {
        this.f7358ik = i;
        this.f7360lr = i2;
        this.f7359ka = new C2606ik<>(this.f7360lr);
    }

    @Override // com.bytedance.sdk.component.p145fi.InterfaceC2625ri
    /* JADX INFO: renamed from: lr, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public boolean mo9703lr(String str) {
        try {
            return this.f7359ka.m9698ri(str) != null;
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.sdk.component.p145fi.InterfaceC2625ri
    /* JADX INFO: renamed from: ri, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public boolean mo9705ri(String str, byte[] bArr) {
        if (str != null && bArr != null) {
            try {
                if (bArr.length > this.f7361ri) {
                    return false;
                }
                this.f7359ka.m9700ri(str, bArr);
                return true;
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    @Override // com.bytedance.sdk.component.p145fi.InterfaceC2625ri
    /* JADX INFO: renamed from: ri, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public byte[] mo9704ri(String str) {
        try {
            return this.f7359ka.m9698ri(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
