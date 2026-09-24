package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: renamed from: com.ironsource.Z4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11779Z4 {

    /* JADX INFO: renamed from: a */
    public static final C11779Z4 f26690a = new C11779Z4();

    private C11779Z4() {
    }

    /* JADX INFO: renamed from: a */
    public final boolean m28059a(IronSourceError ironSourceError) {
        if (ironSourceError == null) {
            return false;
        }
        int errorCode = ironSourceError.getErrorCode();
        return errorCode == 524 || errorCode == 530;
    }
}
