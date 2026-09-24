package com.facebook.ads.redexgen.core;

import com.facebook.ads.androidx.media3.exoplayer.drm.DrmSessionEventListener;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.A1 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C4892A1 {
    public final int A00;
    public final C7320no A01;
    public final CopyOnWriteArrayList<DrmSessionEventListener.EventDispatcher.ListenerAndHandler> A02;

    public C4892A1() {
        this(new CopyOnWriteArrayList(), 0, null);
    }

    public C4892A1(CopyOnWriteArrayList<DrmSessionEventListener.EventDispatcher.ListenerAndHandler> listenerAndHandlers, int i, C7320no c7320no) {
        this.A02 = listenerAndHandlers;
        this.A00 = i;
        this.A01 = c7320no;
    }

    public final C4892A1 A00(int i, C7320no c7320no) {
        return new C4892A1(this.A02, i, c7320no);
    }
}
