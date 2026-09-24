package com.facebook.ads.redexgen.core;

import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.f6 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C6802f6 implements AudioManager.OnAudioFocusChangeListener {
    public final /* synthetic */ C45283r A00;

    public C6802f6(C45283r c45283r) {
        this.A00 = c45283r;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        new Handler(Looper.getMainLooper()).post(new C5122Dl(this, i));
    }
}
