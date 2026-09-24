package com.fyber.inneractive.sdk.config.global.features;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.model.vast.C8291a;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.config.global.features.d */
/* JADX INFO: loaded from: classes4.dex */
public final class C7976d extends AbstractC7981i {

    /* JADX INFO: renamed from: e */
    public C8291a f17756e;

    public C7976d() {
        super("cta_locale");
    }

    @Override // com.fyber.inneractive.sdk.config.global.features.AbstractC7981i
    /* JADX INFO: renamed from: b */
    public final AbstractC7981i mo20413b() {
        C7976d c7976d = new C7976d();
        m20418a(c7976d);
        return c7976d;
    }

    /* JADX INFO: renamed from: d */
    public final void m20415d(String str) {
        if (TextUtils.isEmpty(str) || this.f17756e != null) {
            return;
        }
        this.f17756e = new C8291a(mo20417a("install_" + str, null), mo20417a("skip_ad_" + str, null), mo20417a("skip_in_" + str, null));
    }
}
