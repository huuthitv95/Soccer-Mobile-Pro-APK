package com.fyber.inneractive.sdk.p278ui;

import android.view.View;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.ui.b */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnLayoutChangeListenerC9121b implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ FyberAdIdentifierLocal f21415a;

    public ViewOnLayoutChangeListenerC9121b(FyberAdIdentifierLocal fyberAdIdentifierLocal) {
        this.f21415a = fyberAdIdentifierLocal;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        FyberAdIdentifierLocal fyberAdIdentifierLocal = this.f21415a;
        fyberAdIdentifierLocal.f21394q = this.f21415a.f21391n.getWidth() + fyberAdIdentifierLocal.f21391n.getWidth();
        FyberAdIdentifierLocal fyberAdIdentifierLocal2 = this.f21415a;
        IFyberAdIdentifier.Corner corner = fyberAdIdentifierLocal2.f21412k;
        if (corner == IFyberAdIdentifier.Corner.TOP_LEFT || corner == IFyberAdIdentifier.Corner.BOTTOM_LEFT) {
            fyberAdIdentifierLocal2.f21394q *= -1.0f;
        }
        fyberAdIdentifierLocal2.f21391n.setTranslationX(fyberAdIdentifierLocal2.f21394q);
        FyberAdIdentifierLocal fyberAdIdentifierLocal3 = this.f21415a;
        if (fyberAdIdentifierLocal3.f21392o) {
            fyberAdIdentifierLocal3.m21931a();
        }
    }
}
