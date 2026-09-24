package com.ironsource;

import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: com.ironsource.Ha */
/* JADX INFO: loaded from: classes6.dex */
public final class C11472Ha {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final String m26006b(InterfaceC12285kb<LevelPlayAdInfo> interfaceC12285kb) {
        if (interfaceC12285kb instanceof InterfaceC12285kb.b) {
            return "success";
        }
        if (interfaceC12285kb instanceof InterfaceC12285kb.a) {
            return "failure";
        }
        throw new NoWhenBranchMatchedException();
    }
}
