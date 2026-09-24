package com.fyber.inneractive.sdk.config.global.features;

import java.util.Locale;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.config.global.features.r */
/* JADX INFO: loaded from: classes4.dex */
public final class C7990r extends AbstractC7981i {
    public C7990r() {
        super("store_webpage");
    }

    @Override // com.fyber.inneractive.sdk.config.global.features.AbstractC7981i
    /* JADX INFO: renamed from: b */
    public final AbstractC7981i mo20413b() {
        C7990r c7990r = new C7990r();
        m20418a(c7990r);
        return c7990r;
    }

    /* JADX INFO: renamed from: c */
    public final EnumC7989q m20426c() {
        String strMo20417a = mo20417a("presentation_mode", null);
        if (strMo20417a != null) {
            for (EnumC7989q enumC7989q : EnumC7989q.values()) {
                Locale locale = Locale.US;
                if (strMo20417a.toLowerCase(locale).equals(enumC7989q.value.toLowerCase(locale))) {
                    return enumC7989q;
                }
            }
        }
        return EnumC7989q.FullScreen;
    }
}
