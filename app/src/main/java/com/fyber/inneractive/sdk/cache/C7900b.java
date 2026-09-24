package com.fyber.inneractive.sdk.cache;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.util.AbstractC9174o;
import com.fyber.inneractive.sdk.util.AbstractC9202w0;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.cache.b */
/* JADX INFO: loaded from: classes4.dex */
public final class C7900b implements InterfaceC7899a {

    /* JADX INFO: renamed from: a */
    public final String f17568a;

    public C7900b(String str) {
        this.f17568a = str;
    }

    @Override // com.fyber.inneractive.sdk.cache.InterfaceC7899a
    /* JADX INFO: renamed from: a */
    public final Object mo20349a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return AbstractC9202w0.m22037a(str);
    }

    @Override // com.fyber.inneractive.sdk.cache.InterfaceC7899a
    /* JADX INFO: renamed from: a */
    public final String mo20350a() {
        return this.f17568a;
    }

    @Override // com.fyber.inneractive.sdk.cache.InterfaceC7899a
    /* JADX INFO: renamed from: a */
    public final void mo20351a(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            AbstractC9174o.f21470a.getSharedPreferences("IAConfigurationPreferences", 0).edit().putString("dt.dynamic.icon.data", AbstractC9202w0.m22038a(bitmap)).apply();
        }
    }

    @Override // com.fyber.inneractive.sdk.cache.InterfaceC7899a
    /* JADX INFO: renamed from: b */
    public final String mo20352b() {
        return "dt.dynamic.icon.last.modified";
    }

    @Override // com.fyber.inneractive.sdk.cache.InterfaceC7899a
    /* JADX INFO: renamed from: c */
    public final String mo20353c() {
        return String.valueOf(("dt.dynamic.icon_" + this.f17568a).hashCode());
    }

    @Override // com.fyber.inneractive.sdk.cache.InterfaceC7899a
    /* JADX INFO: renamed from: d */
    public final boolean mo20354d() {
        return true;
    }
}
