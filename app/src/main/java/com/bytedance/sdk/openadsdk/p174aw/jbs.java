package com.bytedance.sdk.openadsdk.p174aw;

import android.content.Context;
import android.media.AudioManager;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;

/* JADX INFO: loaded from: classes3.dex */
public class jbs {

    /* JADX INFO: renamed from: ri */
    private final AudioManager f8611ri;

    /* JADX INFO: renamed from: lr */
    private int f8610lr = -1;

    /* JADX INFO: renamed from: ik */
    private boolean f8609ik = false;

    public jbs(Context context) {
        this.f8611ri = (AudioManager) context.getApplicationContext().getSystemService("audio");
    }

    /* JADX INFO: renamed from: ri */
    private void m11089ri(int i, int i2, int i3) {
        try {
            this.f8611ri.setStreamVolume(i, i2, i3);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ri */
    public int m11090ri() {
        return this.f8610lr;
    }

    /* JADX INFO: renamed from: ri */
    public void m11091ri(boolean z) {
        m11092ri(z, false);
    }

    /* JADX INFO: renamed from: ri */
    public void m11092ri(boolean z, boolean z2) {
        if (this.f8611ri == null) {
            return;
        }
        int i = 0;
        if (z) {
            int iXha = DeviceUtils.xha();
            if (iXha != 0) {
                this.f8610lr = iXha;
            } else if (!z2) {
                return;
            }
            m11089ri(3, 0, 0);
            this.f8609ik = true;
            return;
        }
        int iJbs = this.f8610lr;
        if (iJbs != 0) {
            if (iJbs == -1) {
                if (!z2) {
                    return;
                } else {
                    iJbs = DeviceUtils.jbs() / 15;
                }
            }
            this.f8610lr = -1;
            m11089ri(3, iJbs, i);
            this.f8609ik = true;
        }
        iJbs = DeviceUtils.jbs() / 15;
        i = 1;
        this.f8610lr = -1;
        m11089ri(3, iJbs, i);
        this.f8609ik = true;
    }
}
