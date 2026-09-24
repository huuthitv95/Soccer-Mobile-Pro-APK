package com.bytedance.sdk.component.adexpress.p122fi;

import android.webkit.JavascriptInterface;
import com.bytedance.sdk.component.p168ri.C2689ac;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.fi.ka */
/* JADX INFO: loaded from: classes3.dex */
public class C2485ka {

    /* JADX INFO: renamed from: ri */
    private WeakReference<C2689ac> f6856ri;

    public C2485ka(C2689ac c2689ac) {
        this.f6856ri = new WeakReference<>(c2689ac);
    }

    @JavascriptInterface
    public void invokeMethod(String str) {
        WeakReference<C2689ac> weakReference = this.f6856ri;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f6856ri.get().invokeMethod(str);
    }

    /* JADX INFO: renamed from: ri */
    public void m8779ri(C2689ac c2689ac) {
        this.f6856ri = new WeakReference<>(c2689ac);
    }
}
