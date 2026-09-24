package com.mbridge.msdk.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.OrientationEventListener;
import android.view.WindowInsets;
import android.view.WindowManager;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.config.activity.backdispatcher.C12706a;
import com.mbridge.msdk.config.activity.backdispatcher.InterfaceC12707b;
import com.mbridge.msdk.foundation.feedback.C13084b;
import com.mbridge.msdk.foundation.tools.C13197f1;
import com.mbridge.msdk.foundation.tools.C13219q0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class MBBaseActivity extends Activity {

    /* JADX INFO: renamed from: a */
    private Display f33368a;

    /* JADX INFO: renamed from: b */
    private OrientationEventListener f33369b;

    /* JADX INFO: renamed from: c */
    private int f33370c = -1;

    /* JADX INFO: renamed from: d */
    private volatile boolean f33371d = false;

    /* JADX INFO: renamed from: e */
    private Runnable f33372e;

    /* JADX INFO: renamed from: f */
    private C12706a f33373f;

    /* JADX INFO: renamed from: com.mbridge.msdk.activity.MBBaseActivity$a */
    class RunnableC12649a implements Runnable {
        RunnableC12649a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                MBBaseActivity.this.m34370b();
            } catch (Exception e) {
                C13219q0.m37816b("MBBaseActivity", e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.activity.MBBaseActivity$b */
    class C12650b extends OrientationEventListener {
        C12650b(Context context, int i) {
            super(context, i);
        }

        @Override // android.view.OrientationEventListener
        public void onOrientationChanged(int i) {
            int rotation = MBBaseActivity.this.f33368a != null ? MBBaseActivity.this.f33368a.getRotation() : 0;
            if (rotation == 1 && MBBaseActivity.this.f33370c != 1) {
                MBBaseActivity.this.f33370c = 1;
                MBBaseActivity.this.getNotchParams();
                C13219q0.m37816b("MBBaseActivity", "Orientation Left");
                return;
            }
            if (rotation == 3 && MBBaseActivity.this.f33370c != 2) {
                MBBaseActivity.this.f33370c = 2;
                MBBaseActivity.this.getNotchParams();
                C13219q0.m37816b("MBBaseActivity", "Orientation Right");
            } else if (rotation == 0 && MBBaseActivity.this.f33370c != 3) {
                MBBaseActivity.this.f33370c = 3;
                MBBaseActivity.this.getNotchParams();
                C13219q0.m37816b("MBBaseActivity", "Orientation Top");
            } else {
                if (rotation != 2 || MBBaseActivity.this.f33370c == 4) {
                    return;
                }
                MBBaseActivity.this.f33370c = 4;
                MBBaseActivity.this.getNotchParams();
                C13219q0.m37816b("MBBaseActivity", "Orientation Bottom");
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.activity.MBBaseActivity$c */
    class C12651c implements InterfaceC12707b {
        C12651c() {
        }

        @Override // com.mbridge.msdk.config.activity.backdispatcher.InterfaceC12707b
        /* JADX INFO: renamed from: a */
        public void mo34374a() {
            MBBaseActivity.this.onBackDispatched();
        }
    }

    /* JADX INFO: renamed from: a */
    private int m34366a() {
        if (this.f33368a == null) {
            if (Build.VERSION.SDK_INT >= 30) {
                this.f33368a = getDisplay();
            } else {
                this.f33368a = ((WindowManager) getSystemService("window")).getDefaultDisplay();
            }
        }
        Display display = this.f33368a;
        if (display != null) {
            return display.getRotation();
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m34370b() {
        int i;
        int safeInsetLeft;
        int i2;
        int i3;
        int safeInsetBottom;
        DisplayCutout displayCutout;
        int i4;
        int i5 = Build.VERSION.SDK_INT;
        if (this.f33371d) {
            return;
        }
        WindowInsets rootWindowInsets = getWindow().getDecorView().getRootWindowInsets();
        int i6 = -1;
        if (rootWindowInsets == null || i5 < 28 || (displayCutout = rootWindowInsets.getDisplayCutout()) == null) {
            this = this;
            i = -1;
            safeInsetLeft = 0;
            i2 = 0;
            i3 = 0;
            safeInsetBottom = 0;
        } else {
            safeInsetLeft = displayCutout.getSafeInsetLeft();
            int safeInsetRight = displayCutout.getSafeInsetRight();
            int safeInsetTop = displayCutout.getSafeInsetTop();
            safeInsetBottom = displayCutout.getSafeInsetBottom();
            Display display = this.f33368a;
            int rotation = display != null ? display.getRotation() : m34366a();
            if (this.f33370c == -1) {
                if (rotation == 0) {
                    i4 = 3;
                } else if (rotation == 1) {
                    i4 = 1;
                } else if (rotation == 2) {
                    i4 = 4;
                } else {
                    i4 = rotation == 3 ? 2 : -1;
                }
                this.f33370c = i4;
                C13219q0.m37816b("MBBaseActivity", this.f33370c + "");
            }
            if (rotation != 0) {
                if (rotation == 1) {
                    i6 = 90;
                } else if (rotation == 2) {
                    i6 = 180;
                } else if (rotation == 3) {
                    i6 = 270;
                }
                i = i6;
            } else {
                i = 0;
            }
            i2 = safeInsetRight;
            i3 = safeInsetTop;
        }
        this.setTopControllerPadding(i, safeInsetLeft, i2, i3, safeInsetBottom);
        if (this.f33369b == null) {
            m34373d();
        }
    }

    /* JADX INFO: renamed from: c */
    private void m34372c() {
        try {
            getWindow().addFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
            getWindow().getDecorView().setSystemUiVisibility(InputDeviceCompat.SOURCE_TOUCHSCREEN);
        } catch (Throwable th) {
            C13219q0.m37816b("MBBaseActivity", th.getMessage());
        }
    }

    /* JADX INFO: renamed from: d */
    private void m34373d() {
        C12650b c12650b = new C12650b(this, 1);
        this.f33369b = c12650b;
        if (c12650b.canDetectOrientation()) {
            this.f33369b.enable();
        } else {
            this.f33369b.disable();
            this.f33369b = null;
        }
    }

    public void getNotchParams() {
        if (this.f33371d) {
            return;
        }
        this.f33372e = new RunnableC12649a();
        getWindow().getDecorView().postDelayed(this.f33372e, 500L);
    }

    public abstract void onBackDispatched();

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f33371d = false;
        try {
            requestWindowFeature(1);
            getWindow().setFlags(1024, 1024);
            getWindow().addFlags(512);
            m34372c();
            m34366a();
            C13197f1.m37677c(getWindow());
            if (Build.VERSION.SDK_INT >= 33) {
                registerBackInvokedDispatcher();
            }
        } catch (Exception e) {
            C13219q0.m37816b("MBBaseActivity", e.getMessage());
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        this.f33371d = true;
        super.onDestroy();
        try {
            OrientationEventListener orientationEventListener = this.f33369b;
            if (orientationEventListener != null) {
                orientationEventListener.disable();
                this.f33369b = null;
            }
            if (this.f33372e != null) {
                getWindow().getDecorView().removeCallbacks(this.f33372e);
            }
            if (Build.VERSION.SDK_INT >= 33) {
                unRegisterBackInvokedDispatcher();
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                C13219q0.m37816b("MBBaseActivity", e.getMessage());
            }
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        if (C13084b.f35793f) {
            return;
        }
        getNotchParams();
        m34372c();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        m34372c();
    }

    public void registerBackInvokedDispatcher() {
        try {
            C12706a c12706a = new C12706a();
            this.f33373f = c12706a;
            c12706a.m34815a(getWindow(), new C12651c());
        } catch (Throwable th) {
            C13219q0.m37816b("MBBaseActivity", th.getMessage());
        }
    }

    public abstract void setTopControllerPadding(int i, int i2, int i3, int i4, int i5);

    public void unRegisterBackInvokedDispatcher() {
        try {
            C12706a c12706a = this.f33373f;
            if (c12706a == null) {
                return;
            }
            c12706a.m34814a(getWindow());
        } catch (Throwable th) {
            C13219q0.m37816b("MBBaseActivity", th.getMessage());
        }
    }
}
