package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.window.OnBackInvokedCallback;
import androidx.core.view.InputDeviceCompat;
import com.hbisoft.hbrecorder.Constants;
import com.ironsource.C11341A5;
import com.ironsource.C11455Gb;
import com.ironsource.C11561M9;
import com.ironsource.C11604Og;
import com.ironsource.C11703Ud;
import com.ironsource.C11744X3;
import com.ironsource.C12123c1;
import com.ironsource.C12273k;
import com.ironsource.C12282k8;
import com.ironsource.C12291l;
import com.ironsource.C12317m4;
import com.ironsource.C12422p8;
import com.ironsource.C12547u8;
import com.ironsource.C12613y2;
import com.ironsource.InterfaceC11546Lc;
import com.ironsource.InterfaceC12290kg;
import com.ironsource.InterfaceC12582w7;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;

/* JADX INFO: loaded from: classes6.dex */
public class ControllerActivity extends Activity implements InterfaceC11546Lc, InterfaceC12290kg {

    /* JADX INFO: renamed from: o */
    private static final String f31917o = "ControllerActivity";

    /* JADX INFO: renamed from: p */
    private static final int f31918p = 1;

    /* JADX INFO: renamed from: q */
    private static String f31919q = "removeWebViewContainerView | mContainer is null";

    /* JADX INFO: renamed from: r */
    private static String f31920r = "removeWebViewContainerView | view is null";

    /* JADX INFO: renamed from: a */
    private String f31921a;

    /* JADX INFO: renamed from: b */
    private C12513v f31922b;

    /* JADX INFO: renamed from: c */
    private RelativeLayout f31923c;

    /* JADX INFO: renamed from: d */
    private FrameLayout f31924d;

    /* JADX INFO: renamed from: e */
    private InterfaceC12582w7 f31925e;

    /* JADX INFO: renamed from: f */
    private OnBackInvokedCallback f31926f;

    /* JADX INFO: renamed from: h */
    private String f31928h;

    /* JADX INFO: renamed from: l */
    private C12123c1 f31932l;

    /* JADX INFO: renamed from: m */
    private boolean f31933m;

    /* JADX INFO: renamed from: n */
    private boolean f31934n;
    public int currentRequestedRotation = -1;

    /* JADX INFO: renamed from: g */
    private boolean f31927g = false;

    /* JADX INFO: renamed from: i */
    private Handler f31929i = new Handler();

    /* JADX INFO: renamed from: j */
    private final Runnable f31930j = new RunnableC12482a();

    /* JADX INFO: renamed from: k */
    final RelativeLayout.LayoutParams f31931k = new RelativeLayout.LayoutParams(-1, -1);

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.ControllerActivity$a */
    class RunnableC12482a implements Runnable {
        RunnableC12482a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ControllerActivity.this.getWindow().getDecorView().setSystemUiVisibility(SDKUtils.getActivityUIFlags(ControllerActivity.this.f31927g));
        }
    }

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.ControllerActivity$b */
    class ViewOnSystemUiVisibilityChangeListenerC12483b implements View.OnSystemUiVisibilityChangeListener {
        ViewOnSystemUiVisibilityChangeListenerC12483b() {
        }

        @Override // android.view.View.OnSystemUiVisibilityChangeListener
        public void onSystemUiVisibilityChange(int i) {
            if ((i & InputDeviceCompat.SOURCE_TOUCHSCREEN) == 0) {
                ControllerActivity controllerActivity = ControllerActivity.this;
                controllerActivity.f31929i.removeCallbacks(controllerActivity.f31930j);
                ControllerActivity controllerActivity2 = ControllerActivity.this;
                controllerActivity2.f31929i.postDelayed(controllerActivity2.f31930j, 500L);
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.ControllerActivity$c */
    class RunnableC12484c implements Runnable {
        RunnableC12484c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ControllerActivity.this.getWindow().addFlags(128);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.ControllerActivity$d */
    class RunnableC12485d implements Runnable {
        RunnableC12485d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ControllerActivity.this.getWindow().clearFlags(128);
        }
    }

    /* JADX INFO: renamed from: b */
    private boolean m33330b(String str) {
        return (TextUtils.isEmpty(str) || str.equals(Integer.toString(1))) ? false : true;
    }

    /* JADX INFO: renamed from: c */
    private void m33331c() {
        String str = f31917o;
        Logger.m33642i(str, "clearWebviewController");
        C12513v c12513v = this.f31922b;
        if (c12513v == null) {
            Logger.m33642i(str, "clearWebviewController, null");
            return;
        }
        c12513v.m33563a(C12513v.v.Gone);
        this.f31922b.m33546F();
        this.f31922b.m33547G();
        this.f31922b.m33578g(this.f31928h, "onDestroy");
    }

    /* JADX INFO: renamed from: d */
    private void m33332d() {
        Intent intent = getIntent();
        m33328a(intent.getStringExtra(C11744X3.i.f26316A), intent.getIntExtra(C11744X3.i.f26318B, 0));
    }

    /* JADX INFO: renamed from: e */
    private boolean m33333e() {
        return this.f31921a == null;
    }

    /* JADX INFO: renamed from: f */
    private void m33334f() {
        runOnUiThread(new RunnableC12484c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public /* synthetic */ void m33335g() {
        Logger.m33642i(f31917o, "OnBackInvokedCallback");
        if (C12613y2.m34201a().m34202a(this)) {
            return;
        }
        super.onBackPressed();
    }

    /* JADX INFO: renamed from: h */
    private void m33336h() {
        if (Build.VERSION.SDK_INT < 33 || this.f31926f == null) {
            return;
        }
        try {
            getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.f31926f);
            Logger.m33642i(f31917o, "OnBackInvokedCallback unregistered");
            this.f31926f = null;
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error("Failed to unregister OnBackInvokedCallback: " + e);
        }
    }

    /* JADX INFO: renamed from: i */
    private void m33337i() {
        ViewGroup viewGroup;
        try {
            if (this.f31923c == null) {
                throw new Exception(f31919q);
            }
            ViewGroup viewGroup2 = (ViewGroup) this.f31924d.getParent();
            View viewM33324a = m33324a(viewGroup2);
            if (viewM33324a == null) {
                throw new Exception(f31920r);
            }
            if (isFinishing() && (viewGroup = (ViewGroup) viewM33324a.getParent()) != null) {
                viewGroup.removeView(viewM33324a);
            }
            viewGroup2.removeView(this.f31924d);
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            C12547u8.m33895a(C11703Ud.f25980s, new C12422p8().m33061a(C11341A5.f23788A, e.getMessage()).m33062a());
            Logger.m33642i(f31917o, "removeWebViewContainerView fail " + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: j */
    private void m33338j() {
        int iMo27880L = this.f31925e.mo27880L(this);
        String str = f31917o;
        Logger.m33642i(str, "setInitiateLandscapeOrientation");
        if (iMo27880L == 0) {
            Logger.m33642i(str, "ROTATION_0");
            setRequestedOrientation(0);
            return;
        }
        if (iMo27880L == 2) {
            Logger.m33642i(str, "ROTATION_180");
            setRequestedOrientation(8);
        } else if (iMo27880L == 3) {
            Logger.m33642i(str, "ROTATION_270 Right Landscape");
            setRequestedOrientation(8);
        } else if (iMo27880L != 1) {
            Logger.m33642i(str, "No Rotation");
        } else {
            Logger.m33642i(str, "ROTATION_90 Left Landscape");
            setRequestedOrientation(0);
        }
    }

    /* JADX INFO: renamed from: k */
    private void m33339k() {
        int iMo27880L = this.f31925e.mo27880L(this);
        String str = f31917o;
        Logger.m33642i(str, "setInitiatePortraitOrientation");
        if (iMo27880L == 0) {
            Logger.m33642i(str, "ROTATION_0");
            setRequestedOrientation(1);
            return;
        }
        if (iMo27880L == 2) {
            Logger.m33642i(str, "ROTATION_180");
            setRequestedOrientation(9);
        } else if (iMo27880L == 1) {
            Logger.m33642i(str, "ROTATION_270 Right Landscape");
            setRequestedOrientation(1);
        } else if (iMo27880L != 3) {
            Logger.m33642i(str, "No Rotation");
        } else {
            Logger.m33642i(str, "ROTATION_90 Left Landscape");
            setRequestedOrientation(1);
        }
    }

    @Override // com.ironsource.InterfaceC11546Lc
    public boolean onBackButtonPressed() {
        onBackPressed();
        return true;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        Logger.m33642i(f31917o, "onBackPressed");
        if (C12613y2.m34201a().m34202a(this)) {
            return;
        }
        super.onBackPressed();
    }

    @Override // com.ironsource.InterfaceC11546Lc
    public void onCloseRequested() {
        finish();
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f31925e = C11455Gb.m25891U().mo25842a();
        try {
            new C12291l(this).mo31915a();
            new C12273k(this).mo31915a();
            C12513v c12513v = (C12513v) C11561M9.m26506b((Context) this).mo26512a().m33428k();
            this.f31922b = c12513v;
            c12513v.m33587s().setId(1);
            this.f31922b.m33553a((InterfaceC11546Lc) this);
            this.f31922b.m33555a((InterfaceC12290kg) this);
            Intent intent = getIntent();
            this.f31928h = intent.getStringExtra(C11744X3.i.f26378m);
            this.f31927g = intent.getBooleanExtra(C11744X3.i.f26396v, false);
            this.f31921a = intent.getStringExtra("adViewId");
            this.f31933m = false;
            this.f31934n = intent.getBooleanExtra(C11744X3.i.f26405z0, false);
            if (this.f31927g) {
                getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new ViewOnSystemUiVisibilityChangeListenerC12483b());
                runOnUiThread(this.f31930j);
            }
            RelativeLayout relativeLayout = new RelativeLayout(this);
            this.f31923c = relativeLayout;
            setContentView(relativeLayout, this.f31931k);
            this.f31924d = m33325a(this.f31921a);
            if (this.f31923c.findViewById(1) == null && this.f31924d.getParent() != null) {
                finish();
            }
            m33332d();
            this.f31923c.addView(this.f31924d, this.f31931k);
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
            finish();
        }
        m33326a();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        String str = f31917o;
        Logger.m33642i(str, "onDestroy");
        m33336h();
        m33337i();
        if (this.f31933m) {
            return;
        }
        Logger.m33642i(str, "onDestroy | destroyedFromBackground");
        m33331c();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4 && this.f31922b.m33593y()) {
            this.f31922b.m33592x();
            return true;
        }
        if (this.f31927g && (i == 25 || i == 24)) {
            this.f31929i.removeCallbacks(this.f31930j);
            this.f31929i.postDelayed(this.f31930j, 500L);
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // com.ironsource.InterfaceC11546Lc
    public void onOrientationChanged(String str, int i) {
        m33328a(str, i);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        Logger.m33642i(f31917o, "onPause, isFinishing=" + isFinishing());
        C12511t.m33487a(this);
        C12513v c12513v = this.f31922b;
        if (c12513v != null) {
            c12513v.mo33403a((Context) this);
            if (!this.f31934n) {
                this.f31922b.m33545E();
            }
            this.f31922b.m33572b(false, C11744X3.i.f26354Z);
            this.f31922b.m33578g(this.f31928h, "onPause");
        }
        if (isFinishing()) {
            this.f31933m = true;
            m33331c();
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        Logger.m33642i(f31917o, "onResume");
        C12513v c12513v = this.f31922b;
        if (c12513v != null) {
            c12513v.mo33420b(this);
            if (!this.f31934n) {
                this.f31922b.m33549I();
            }
            this.f31922b.m33572b(true, C11744X3.i.f26354Z);
            this.f31922b.m33578g(this.f31928h, "onResume");
        }
        C12511t.m33489b(this);
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        Logger.m33642i(f31917o, Constants.ON_START_KEY);
        C12513v c12513v = this.f31922b;
        if (c12513v != null) {
            c12513v.m33578g(this.f31928h, Constants.ON_START_KEY);
        }
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        Logger.m33642i(f31917o, "onStop");
        C12513v c12513v = this.f31922b;
        if (c12513v != null) {
            c12513v.m33578g(this.f31928h, "onStop");
        }
    }

    @Override // android.app.Activity
    protected void onUserLeaveHint() {
        super.onUserLeaveHint();
        Logger.m33642i(f31917o, "onUserLeaveHint");
        C12513v c12513v = this.f31922b;
        if (c12513v != null) {
            c12513v.m33578g(this.f31928h, "onUserLeaveHint");
        }
    }

    @Override // com.ironsource.InterfaceC12290kg
    public void onVideoEnded() {
        toggleKeepScreen(false);
    }

    @Override // com.ironsource.InterfaceC12290kg
    public void onVideoPaused() {
        toggleKeepScreen(false);
    }

    @Override // com.ironsource.InterfaceC12290kg
    public void onVideoResumed() {
        toggleKeepScreen(true);
    }

    @Override // com.ironsource.InterfaceC12290kg
    public void onVideoStarted() {
        toggleKeepScreen(true);
    }

    @Override // com.ironsource.InterfaceC12290kg
    public void onVideoStopped() {
        toggleKeepScreen(false);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (this.f31927g && z) {
            runOnUiThread(this.f31930j);
        }
    }

    @Override // android.app.Activity
    public void setRequestedOrientation(int i) {
        if (this.currentRequestedRotation != i) {
            Logger.m33642i(f31917o, "Rotation: Req = " + i + " Curr = " + this.currentRequestedRotation);
            this.currentRequestedRotation = i;
            super.setRequestedOrientation(i);
        }
    }

    public void toggleKeepScreen(boolean z) {
        if (z) {
            m33334f();
        } else {
            m33329b();
        }
    }

    /* JADX INFO: renamed from: a */
    private void m33326a() {
        if (Build.VERSION.SDK_INT >= 33) {
            this.f31926f = new OnBackInvokedCallback() { // from class: com.ironsource.sdk.controller.ControllerActivity$$ExternalSyntheticLambda0
                public final void onBackInvoked() {
                    this.f$0.m33335g();
                }
            };
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.f31926f);
        }
    }

    /* JADX INFO: renamed from: b */
    private void m33329b() {
        runOnUiThread(new RunnableC12485d());
    }

    /* JADX INFO: renamed from: a */
    private FrameLayout m33325a(String str) {
        if (!m33330b(str)) {
            return this.f31922b.m33587s();
        }
        return C11604Og.m26776a(getApplicationContext(), C12282k8.m31929a().mo31278a(str).getPresentingView());
    }

    /* JADX INFO: renamed from: a */
    private void m33328a(String str, int i) {
        if (str != null) {
            if (C11744X3.i.f26320C.equalsIgnoreCase(str)) {
                m33338j();
                return;
            }
            if (C11744X3.i.f26322D.equalsIgnoreCase(str)) {
                m33339k();
                return;
            }
            if (C11744X3.i.f26328G.equalsIgnoreCase(str)) {
                if (this.f31925e.mo27932x(this)) {
                    setRequestedOrientation(1);
                }
            } else if (getRequestedOrientation() == -1) {
                setRequestedOrientation(4);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private View m33324a(ViewGroup viewGroup) {
        if (m33333e()) {
            return viewGroup.findViewById(1);
        }
        return C12282k8.m31929a().mo31278a(this.f31921a).getPresentingView();
    }
}
