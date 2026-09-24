package com.fyber.inneractive.sdk.mraid;

import com.fyber.inneractive.sdk.web.EnumC9221c0;
import java.util.Locale;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.mraid.b0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8321b0 extends AbstractC8349y {

    /* JADX INFO: renamed from: a */
    public final EnumC9221c0 f18589a;

    public C8321b0(EnumC9221c0 enumC9221c0) {
        this.f18589a = enumC9221c0;
    }

    @Override // com.fyber.inneractive.sdk.mraid.AbstractC8349y
    /* JADX INFO: renamed from: a */
    public final String mo20716a() {
        return "placementType: '" + this.f18589a.toString().toLowerCase(Locale.US) + "'";
    }
}
