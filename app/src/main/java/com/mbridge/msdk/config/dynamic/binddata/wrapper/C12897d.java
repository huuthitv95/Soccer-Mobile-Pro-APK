package com.mbridge.msdk.config.dynamic.binddata.wrapper;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import com.mbridge.msdk.config.dynamic.baseview.inter.InterfaceC12875a;
import com.mbridge.msdk.config.dynamic.utils.C12899a;
import com.mbridge.msdk.config.dynamic.utils.EnumC12901c;
import com.mbridge.msdk.foundation.tools.C13219q0;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.mbridge.msdk.config.dynamic.binddata.wrapper.d */
/* JADX INFO: compiled from: ViewObserverImpl.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12897d implements InterfaceC12895b<String> {

    /* JADX INFO: renamed from: a */
    private String f34698a;

    /* JADX INFO: renamed from: b */
    private String f34699b;

    /* JADX INFO: renamed from: c */
    private View f34700c;

    /* JADX INFO: renamed from: d */
    private int f34701d;

    /* JADX INFO: renamed from: e */
    private AtomicBoolean f34702e = new AtomicBoolean(false);

    public C12897d(String str, String str2, View view, int i) {
        this.f34700c = view;
        this.f34698a = str;
        this.f34699b = str2;
        this.f34701d = i;
    }

    /* JADX INFO: renamed from: b */
    private boolean m36064b(String str) {
        if (TextUtils.isEmpty(str) || str.startsWith("mbridge_")) {
            return false;
        }
        try {
            EnumC12901c.valueOf(str);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public View m36065a() {
        return this.f34700c;
    }

    @Override // com.mbridge.msdk.config.dynamic.binddata.wrapper.InterfaceC12895b
    /* JADX INFO: renamed from: a */
    public void mo36061a(String str, Object obj) {
        if (m36064b(this.f34698a)) {
            m36062a(String.valueOf(obj));
        } else {
            m36063b(str, obj);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m36062a(String str) {
        View view;
        if (this.f34702e.get() || (view = this.f34700c) == null) {
            return;
        }
        try {
            C12899a.m36082a(view, this.f34698a, this.f34699b, str);
        } catch (Exception e) {
            C13219q0.m37816b("ViewObserverImpl", e.getMessage());
        }
    }

    /* JADX INFO: renamed from: b */
    private void m36063b(String str, Object obj) {
        KeyEvent.Callback callback = this.f34700c;
        if (callback instanceof InterfaceC12875a) {
            ((InterfaceC12875a) callback).updateBindData(str, obj);
        }
    }
}
