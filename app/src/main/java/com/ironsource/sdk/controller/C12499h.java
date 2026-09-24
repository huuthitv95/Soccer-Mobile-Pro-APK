package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ironsource.C11455Gb;
import com.ironsource.C11744X3;
import com.ironsource.C12317m4;
import com.ironsource.C12613y2;
import com.ironsource.InterfaceC11546Lc;
import com.ironsource.InterfaceC12582w7;

/* JADX INFO: renamed from: com.ironsource.sdk.controller.h */
/* JADX INFO: loaded from: classes6.dex */
public class C12499h extends FrameLayout implements InterfaceC11546Lc {

    /* JADX INFO: renamed from: a */
    private Context f32104a;

    /* JADX INFO: renamed from: b */
    private C12513v f32105b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC12582w7 f32106c;

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.h$a */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewGroup windowDecorViewGroup = C12499h.this.getWindowDecorViewGroup();
            if (windowDecorViewGroup != null) {
                windowDecorViewGroup.addView(C12499h.this);
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.h$b */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewGroup windowDecorViewGroup = C12499h.this.getWindowDecorViewGroup();
            if (windowDecorViewGroup != null) {
                windowDecorViewGroup.removeView(C12499h.this);
            }
        }
    }

    public C12499h(Context context) {
        super(context);
        this.f32106c = C11455Gb.m25891U().mo25842a();
        this.f32104a = context;
        setClickable(true);
    }

    /* JADX INFO: renamed from: b */
    private void m33455b() {
        ((Activity) this.f32104a).runOnUiThread(new b());
    }

    private int getNavigationBarPadding() {
        Activity activity = (Activity) this.f32104a;
        try {
            Rect rect = new Rect();
            activity.getWindow().getDecorView().getDrawingRect(rect);
            Rect rect2 = new Rect();
            activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect2);
            if (this.f32106c.mo27869A(activity) == 1) {
                int i = rect.bottom - rect2.bottom;
                if (i > 0) {
                    return i;
                }
                return 0;
            }
            int i2 = rect.right - rect2.right;
            if (i2 > 0) {
                return i2;
            }
            return 0;
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            return 0;
        }
    }

    private int getStatusBarHeight() {
        int identifier;
        try {
            Context context = this.f32104a;
            if (context == null || (identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android")) <= 0) {
                return 0;
            }
            return this.f32104a.getResources().getDimensionPixelSize(identifier);
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            return 0;
        }
    }

    private int getStatusBarPadding() {
        int statusBarHeight;
        if ((((Activity) this.f32104a).getWindow().getAttributes().flags & 1024) == 0 && (statusBarHeight = getStatusBarHeight()) > 0) {
            return statusBarHeight;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ViewGroup getWindowDecorViewGroup() {
        Activity activity = (Activity) this.f32104a;
        if (activity != null) {
            return (ViewGroup) activity.getWindow().getDecorView();
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public void m33456a(C12513v c12513v) {
        this.f32105b = c12513v;
        c12513v.m33553a(this);
        this.f32105b.m33548H();
        this.f32104a = this.f32105b.m33585q();
        m33454a(getStatusBarPadding(), getNavigationBarPadding());
        m33453a();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f32105b.m33549I();
        this.f32105b.m33572b(true, C11744X3.i.f26354Z);
    }

    @Override // com.ironsource.InterfaceC11546Lc
    public boolean onBackButtonPressed() {
        return C12613y2.m34201a().m34202a((Activity) this.f32104a);
    }

    @Override // com.ironsource.InterfaceC11546Lc
    public void onCloseRequested() {
        m33455b();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f32105b.m33545E();
        this.f32105b.m33572b(false, C11744X3.i.f26354Z);
        C12513v c12513v = this.f32105b;
        if (c12513v != null) {
            c12513v.m33563a(C12513v.v.Gone);
            this.f32105b.m33546F();
            this.f32105b.m33547G();
        }
        removeAllViews();
    }

    @Override // com.ironsource.InterfaceC11546Lc
    public void onOrientationChanged(String str, int i) {
    }

    /* JADX INFO: renamed from: a */
    private void m33453a() {
        ((Activity) this.f32104a).runOnUiThread(new a());
    }

    /* JADX INFO: renamed from: a */
    private void m33454a(int i, int i2) {
        try {
            Context context = this.f32104a;
            if (context != null) {
                int iMo27869A = this.f32106c.mo27869A(context);
                if (iMo27869A == 1) {
                    setPadding(0, i, 0, i2);
                } else if (iMo27869A == 2) {
                    setPadding(0, i, i2, 0);
                }
            }
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
        }
    }
}
