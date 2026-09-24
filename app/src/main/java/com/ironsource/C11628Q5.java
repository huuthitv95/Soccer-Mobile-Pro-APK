package com.ironsource;

import androidx.lifecycle.ProcessLifecycleOwner;

/* JADX INFO: renamed from: com.ironsource.Q5 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11628Q5 implements InterfaceC11397D7 {
    @Override // com.ironsource.InterfaceC11397D7
    /* JADX INFO: renamed from: a */
    public boolean mo25606a() {
        try {
            ProcessLifecycleOwner.INSTANCE.get();
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
