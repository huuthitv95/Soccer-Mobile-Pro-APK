package com.chartboost.sdk.impl;

import android.content.Context;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.jk */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC3855jk {

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.jk$a */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m18299a(InterfaceC3855jk interfaceC3855jk, String str, int i, boolean z, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startDownloadIfPossible");
            }
            if ((i2 & 1) != 0) {
                str = null;
            }
            if ((i2 & 2) != 0) {
                i = 0;
            }
            if ((i2 & 4) != 0) {
                z = false;
            }
            interfaceC3855jk.mo18295a(str, i, z);
        }
    }

    /* JADX INFO: renamed from: a */
    int mo18293a(C4078tj c4078tj);

    /* JADX INFO: renamed from: a */
    void mo18294a(Context context);

    /* JADX INFO: renamed from: a */
    void mo18295a(String str, int i, boolean z);

    /* JADX INFO: renamed from: a */
    void mo18296a(String str, String str2, boolean z, InterfaceC4015r0 interfaceC4015r0);

    /* JADX INFO: renamed from: a */
    boolean mo18297a(String str);

    /* JADX INFO: renamed from: b */
    C4078tj mo18298b(String str);
}
