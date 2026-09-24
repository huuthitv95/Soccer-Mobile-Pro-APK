package com.fyber.inneractive.sdk.mraid;

import java.util.Locale;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.mraid.d0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8325d0 extends AbstractC8349y {

    /* JADX INFO: renamed from: a */
    public final EnumC8329f0 f18594a;

    public C8325d0(EnumC8329f0 enumC8329f0) {
        this.f18594a = enumC8329f0;
    }

    @Override // com.fyber.inneractive.sdk.mraid.AbstractC8349y
    /* JADX INFO: renamed from: a */
    public final String mo20716a() {
        return "state: '" + this.f18594a.toString().toLowerCase(Locale.US) + "'";
    }
}
