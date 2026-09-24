package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.applovin.impl.C1538e2;

/* JADX INFO: renamed from: com.applovin.impl.adview.k */
/* JADX INFO: loaded from: classes3.dex */
public class C1502k extends View {

    /* JADX INFO: renamed from: a */
    private final C1538e2 f1122a;

    /* JADX INFO: renamed from: b */
    private boolean f1123b;

    /* JADX INFO: renamed from: com.applovin.impl.adview.k$a */
    interface a {
        /* JADX INFO: renamed from: a */
        void mo1979a();

        /* JADX INFO: renamed from: b */
        void mo1980b();
    }

    public C1502k(C1538e2 c1538e2, Context context) {
        super(context);
        this.f1122a = c1538e2;
        setClickable(false);
        setFocusable(false);
    }

    /* JADX INFO: renamed from: a */
    public void m2035a(a aVar) {
        if (this.f1123b) {
            if (aVar != null) {
                aVar.mo1979a();
                return;
            }
            return;
        }
        Drawable drawableM2462a = this.f1122a.m2462a();
        if (drawableM2462a == null) {
            if (aVar != null) {
                aVar.mo1980b();
            }
        } else {
            setBackground(drawableM2462a);
            this.f1123b = true;
            if (aVar != null) {
                aVar.mo1979a();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m2036a() {
        return this.f1123b;
    }

    /* JADX INFO: renamed from: b */
    public void m2037b() {
        m2035a(null);
    }

    public String getIdentifier() {
        return this.f1122a.m2463b();
    }
}
