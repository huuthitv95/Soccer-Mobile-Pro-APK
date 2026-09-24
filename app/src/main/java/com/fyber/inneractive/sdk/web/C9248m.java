package com.fyber.inneractive.sdk.web;

import android.graphics.Rect;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.util.AbstractC9183r;
import com.fyber.inneractive.sdk.util.C9152g1;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.web.m */
/* JADX INFO: loaded from: classes4.dex */
public class C9248m extends WebView {

    /* JADX INFO: renamed from: a */
    public boolean f21640a;

    /* JADX INFO: renamed from: b */
    public boolean f21641b;

    /* JADX INFO: renamed from: c */
    public InterfaceC9246l f21642c;

    /* JADX INFO: renamed from: d */
    public ViewOnTouchListenerC9276y0 f21643d;

    /* JADX INFO: renamed from: e */
    public final C9152g1 f21644e;

    /* JADX INFO: renamed from: f */
    public int f21645f;

    /* JADX INFO: renamed from: g */
    public int f21646g;

    public C9248m() {
        super(IAConfigManager.f17654M.f17689u.m20436a());
        this.f21640a = false;
        this.f21644e = new C9152g1();
    }

    /* JADX INFO: renamed from: a */
    public final void m22084a() {
        if (IAConfigManager.f17654M.f17688t.f17862b.m20446a(false, "update_v_mth")) {
            AbstractC9183r.f21478b.post(new RunnableC9244k(this));
        } else {
            m22087b();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m22085a(String str) {
        IAlog.m21945a("injecting JS: %s", str);
        if (str != null) {
            try {
                loadUrl("javascript:".concat(str));
            } catch (Throwable th) {
                IAlog.m21944a("Failed to inject JS", th, new Object[0]);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m22086a(boolean z) {
        if (z) {
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                Rect rect = new Rect();
                viewGroup.getHitRect(rect);
                if (!getLocalVisibleRect(rect) && getWindowToken() == getApplicationWindowToken()) {
                    IAlog.m21949e("updateVisibility - Cannot find local visible rect. Scrolled out?", new Object[0]);
                    z = false;
                }
            } else {
                IAlog.m21949e("updateVisibility - No parent available", new Object[0]);
            }
        }
        if (this.f21641b != z) {
            this.f21641b = z;
            InterfaceC9246l interfaceC9246l = this.f21642c;
            if (interfaceC9246l != null) {
                interfaceC9246l.mo21933a(z);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m22087b() {
        boolean z = false;
        IAlog.m21949e("updateVisibility called - is = %s hwf = %s atw = %swinToken - %s app token - %s", Boolean.valueOf(isShown()), Boolean.valueOf(hasWindowFocus()), Boolean.valueOf(this.f21640a), getWindowToken(), getApplicationWindowToken());
        if (getWindowToken() != getApplicationWindowToken()) {
            if (getWindowVisibility() != 8 && isShown() && this.f21640a) {
                z = true;
            }
            m22086a(z);
            return;
        }
        boolean z2 = isShown() && this.f21640a;
        if (IAConfigManager.f17654M.f17688t.f17862b.m20446a(false, "ignore_w_f")) {
            z = z2;
        } else if (z2 && hasWindowFocus()) {
            z = true;
        }
        m22086a(z);
    }

    @Override // android.webkit.WebView
    public void destroy() {
        try {
            super.destroy();
        } catch (Throwable unused) {
        }
        this.f21642c = null;
    }

    public int getHeightDp() {
        return this.f21646g;
    }

    public boolean getIsVisible() {
        return this.f21641b;
    }

    public C9152g1 getLastClickedLocation() {
        return this.f21644e;
    }

    public int getWidthDp() {
        return this.f21645f;
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f21640a) {
            return;
        }
        this.f21640a = true;
        InterfaceC9246l interfaceC9246l = this.f21642c;
        if (interfaceC9246l != null) {
            interfaceC9246l.mo22046b();
        }
        m22084a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f21641b = false;
        if (this.f21640a) {
            this.f21640a = false;
            InterfaceC9246l interfaceC9246l = this.f21642c;
            if (interfaceC9246l != null) {
                interfaceC9246l.mo22047c();
            }
            m22084a();
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        m22084a();
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 1 && motionEvent.getEventTime() - motionEvent.getDownTime() >= ViewConfiguration.getLongPressTimeout()) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 0, x, y, 0));
            dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 1, x, y, 0));
        }
        ViewOnTouchListenerC9276y0 viewOnTouchListenerC9276y0 = this.f21643d;
        if (viewOnTouchListenerC9276y0 != null) {
            viewOnTouchListenerC9276y0.onTouch(this, motionEvent);
        }
        if (motionEvent.getAction() == 0) {
            C9152g1 c9152g1 = this.f21644e;
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            c9152g1.f21450a = x2;
            c9152g1.f21451b = y2;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        m22084a();
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        IAlog.m21949e("onWindowFocusChanged with: %s", Boolean.valueOf(z));
        m22084a();
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (i == 8) {
            m22086a(false);
        } else {
            m22084a();
        }
    }

    public void setHeightDp(int i) {
        this.f21646g = i;
    }

    public void setListener(InterfaceC9246l interfaceC9246l) {
        this.f21642c = interfaceC9246l;
    }

    public void setTapListener(InterfaceC9274x0 interfaceC9274x0) {
        this.f21643d = new ViewOnTouchListenerC9276y0(interfaceC9274x0, IAConfigManager.f17654M.f17689u.m20436a());
    }

    public void setWidthDp(int i) {
        this.f21645f = i;
    }
}
