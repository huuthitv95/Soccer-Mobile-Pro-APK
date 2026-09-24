package com.fyber.inneractive.sdk.player.p277ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.RelativeLayout;
import com.fyber.inneractive.sdk.config.C8028r0;
import com.fyber.inneractive.sdk.config.InterfaceC8041s0;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.util.AbstractC9174o;
import com.fyber.inneractive.sdk.util.AbstractC9183r;
import com.fyber.inneractive.sdk.util.C9152g1;
import com.fyber.inneractive.sdk.util.C9155h1;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.ui.e */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8881e extends RelativeLayout implements InterfaceC8889m {

    /* JADX INFO: renamed from: a */
    public final C9152g1 f20876a;

    /* JADX INFO: renamed from: b */
    public final int f20877b;

    /* JADX INFO: renamed from: c */
    public InterfaceC8041s0 f20878c;

    /* JADX INFO: renamed from: d */
    public UnitDisplayType f20879d;

    /* JADX INFO: renamed from: e */
    public boolean f20880e;

    /* JADX INFO: renamed from: f */
    public boolean f20881f;

    /* JADX INFO: renamed from: g */
    public InterfaceC8890n f20882g;

    /* JADX INFO: renamed from: h */
    public boolean f20883h;

    /* JADX INFO: renamed from: i */
    public View f20884i;

    public AbstractC8881e(Context context) {
        super(context, null, 0);
        this.f20876a = new C9152g1();
        this.f20877b = 0;
        this.f20880e = false;
        this.f20881f = false;
        this.f20883h = false;
        this.f20877b = Math.min(AbstractC9174o.m22004e(), AbstractC9174o.m22002d());
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo21426a(C9155h1 c9155h1, int i, int i2);

    @Override // com.fyber.inneractive.sdk.player.p277ui.InterfaceC8889m
    /* JADX INFO: renamed from: b */
    public boolean mo21427b() {
        return false;
    }

    /* JADX INFO: renamed from: d */
    public void mo21428d() {
        this.f20883h = true;
    }

    /* JADX INFO: renamed from: e */
    public void mo21429e() {
        this.f20883h = false;
    }

    /* JADX INFO: renamed from: f */
    public final void m21430f() {
        boolean globalVisibleRect = isShown() && hasWindowFocus() && this.f20881f && !this.f20883h;
        if (globalVisibleRect) {
            globalVisibleRect = getGlobalVisibleRect(new Rect());
        }
        if (globalVisibleRect == this.f20880e || this.f20882g == null) {
            return;
        }
        IAlog.m21945a("%supdateVisibility changing to %s", IAlog.m21943a(this), Boolean.valueOf(globalVisibleRect));
        this.f20880e = globalVisibleRect;
        this.f20882g.mo20876a(globalVisibleRect);
    }

    public View getWatermarkView() {
        return this.f20884i;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        IAlog.m21945a("%sGot onAttachedToWindow: mIsAttached = %s", IAlog.m21943a(this), Boolean.valueOf(this.f20881f));
        this.f20881f = true;
        InterfaceC8890n interfaceC8890n = this.f20882g;
        if (interfaceC8890n != null) {
            interfaceC8890n.mo20875a();
        }
        m21430f();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        IAlog.m21945a("%sGot onDetachedFromWindow: mIsAttached = %s", IAlog.m21943a(this), Boolean.valueOf(this.f20881f));
        this.f20881f = false;
        InterfaceC8890n interfaceC8890n = this.f20882g;
        if (interfaceC8890n != null) {
            interfaceC8890n.mo20939c();
        }
        m21430f();
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (equals(view)) {
            IAlog.m21945a("%sgot onVisibilityChanged with %d", IAlog.m21943a(this), Integer.valueOf(i));
            m21430f();
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        IAlog.m21945a("%sgot onWindowFocusChanged with: %s", IAlog.m21943a(this), Boolean.valueOf(z));
        AbstractC9183r.f21478b.postDelayed(new RunnableC8880d(this, z), 500L);
    }

    public void setListener(InterfaceC8890n interfaceC8890n) {
        this.f20882g = interfaceC8890n;
    }

    public void setUnitConfig(InterfaceC8041s0 interfaceC8041s0) {
        this.f20878c = interfaceC8041s0;
        C8028r0 c8028r0 = (C8028r0) interfaceC8041s0;
        this.f20879d = c8028r0.f17815e == null ? c8028r0.f17816f.f17876j : UnitDisplayType.DEFAULT;
    }

    public void setWatermarkView(View view) {
        this.f20884i = view;
    }
}
