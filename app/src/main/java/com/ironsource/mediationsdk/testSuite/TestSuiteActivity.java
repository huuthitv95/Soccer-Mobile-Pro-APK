package com.ironsource.mediationsdk.testSuite;

import android.app.Activity;
import android.graphics.Insets;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowInsets;
import android.widget.RelativeLayout;
import android.window.OnBackInvokedCallback;
import com.ironsource.C11477Hf;
import com.ironsource.C11567Mf;
import com.ironsource.C12317m4;
import com.ironsource.C12626yf;
import com.ironsource.InterfaceC11631Q8;
import com.ironsource.mediationsdk.logger.IronLog;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class TestSuiteActivity extends Activity implements InterfaceC11631Q8 {

    /* JADX INFO: renamed from: a */
    private RelativeLayout f31459a;

    /* JADX INFO: renamed from: b */
    private C11567Mf f31460b;

    /* JADX INFO: renamed from: c */
    private C11477Hf f31461c;

    /* JADX INFO: renamed from: d */
    private OnBackInvokedCallback f31462d;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static final WindowInsets m32697a(View view, WindowInsets insets) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(insets, "insets");
        Insets insets2 = insets.getInsets(WindowInsets.Type.systemBars());
        Intrinsics.checkNotNullExpressionValue(insets2, "insets.getInsets(WindowInsets.Type.systemBars())");
        view.setPadding(0, insets2.top, 0, insets2.bottom);
        return insets;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final void m32700b() {
    }

    /* JADX INFO: renamed from: c */
    private final String m32702c() {
        Bundle extras;
        if (getIntent() == null || getIntent().getExtras() == null || (extras = getIntent().getExtras()) == null) {
            return null;
        }
        return extras.getString("controllerUrl");
    }

    /* JADX INFO: renamed from: d */
    private final JSONObject m32703d() {
        String strM34249b = new C12626yf().m34249b(this);
        if (strM34249b != null) {
            try {
                if (strM34249b.length() != 0) {
                    return new JSONObject(strM34249b);
                }
            } catch (Exception unused) {
                return new JSONObject();
            }
        }
        return new JSONObject();
    }

    /* JADX INFO: renamed from: e */
    private final RelativeLayout.LayoutParams m32704e() {
        return new RelativeLayout.LayoutParams(-1, -1);
    }

    /* JADX INFO: renamed from: f */
    private final void m32705f() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedCallback = this.f31462d) == null) {
            return;
        }
        try {
            getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(onBackInvokedCallback);
            this.f31462d = null;
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error("Failed to unregister OnBackInvokedCallback: " + e);
        }
    }

    /* JADX INFO: renamed from: g */
    private final void m32706g() {
        if (Build.VERSION.SDK_INT >= 35) {
            RelativeLayout relativeLayout = this.f31459a;
            RelativeLayout relativeLayout2 = null;
            if (relativeLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContainer");
                relativeLayout = null;
            }
            relativeLayout.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.ironsource.mediationsdk.testSuite.TestSuiteActivity$$ExternalSyntheticLambda1
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    return TestSuiteActivity.m32697a(view, windowInsets);
                }
            });
            RelativeLayout relativeLayout3 = this.f31459a;
            if (relativeLayout3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContainer");
            } else {
                relativeLayout2 = relativeLayout3;
            }
            relativeLayout2.requestApplyInsets();
        }
    }

    public final RelativeLayout getContainer() {
        RelativeLayout relativeLayout = this.f31459a;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mContainer");
        return null;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
    }

    @Override // com.ironsource.InterfaceC11631Q8
    public void onClosed() {
        runOnUiThread(new Runnable() { // from class: com.ironsource.mediationsdk.testSuite.TestSuiteActivity$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                TestSuiteActivity.m32699a(this.f$0);
            }
        });
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        RelativeLayout relativeLayout = new RelativeLayout(this);
        this.f31459a = relativeLayout;
        setContentView(relativeLayout, m32704e());
        m32706g();
        C11567Mf c11567Mf = new C11567Mf(this, this, m32703d(), m32702c());
        this.f31460b = c11567Mf;
        C11477Hf c11477Hf = new C11477Hf(c11567Mf);
        this.f31461c = c11477Hf;
        c11477Hf.m26017d();
        RelativeLayout relativeLayout2 = this.f31459a;
        C11567Mf c11567Mf2 = null;
        if (relativeLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContainer");
            relativeLayout2 = null;
        }
        C11567Mf c11567Mf3 = this.f31460b;
        if (c11567Mf3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mWebViewWrapper");
        } else {
            c11567Mf2 = c11567Mf3;
        }
        relativeLayout2.addView(c11567Mf2.m26573d(), m32704e());
        m32698a();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        m32705f();
        C11477Hf c11477Hf = this.f31461c;
        C11567Mf c11567Mf = null;
        if (c11477Hf == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mNativeBridge");
            c11477Hf = null;
        }
        c11477Hf.m26016a();
        RelativeLayout relativeLayout = this.f31459a;
        if (relativeLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContainer");
            relativeLayout = null;
        }
        relativeLayout.removeAllViews();
        C11567Mf c11567Mf2 = this.f31460b;
        if (c11567Mf2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mWebViewWrapper");
        } else {
            c11567Mf = c11567Mf2;
        }
        c11567Mf.m26569a();
        super.onDestroy();
    }

    @Override // com.ironsource.InterfaceC11631Q8
    public void onUIReady() {
        runOnUiThread(new Runnable() { // from class: com.ironsource.mediationsdk.testSuite.TestSuiteActivity$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                TestSuiteActivity.m32701b(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final void m32701b(TestSuiteActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        C11567Mf c11567Mf = this$0.f31460b;
        C11567Mf c11567Mf2 = null;
        if (c11567Mf == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mWebViewWrapper");
            c11567Mf = null;
        }
        if (c11567Mf.m26572c().getParent() == null) {
            RelativeLayout relativeLayout = this$0.f31459a;
            if (relativeLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContainer");
                relativeLayout = null;
            }
            C11567Mf c11567Mf3 = this$0.f31460b;
            if (c11567Mf3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mWebViewWrapper");
                c11567Mf3 = null;
            }
            relativeLayout.removeView(c11567Mf3.m26573d());
            RelativeLayout relativeLayout2 = this$0.f31459a;
            if (relativeLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContainer");
                relativeLayout2 = null;
            }
            C11567Mf c11567Mf4 = this$0.f31460b;
            if (c11567Mf4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mWebViewWrapper");
                c11567Mf4 = null;
            }
            relativeLayout2.addView(c11567Mf4.m26572c(), this$0.m32704e());
            C11567Mf c11567Mf5 = this$0.f31460b;
            if (c11567Mf5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mWebViewWrapper");
            } else {
                c11567Mf2 = c11567Mf5;
            }
            c11567Mf2.m26571b();
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m32698a() {
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedCallback onBackInvokedCallback = new OnBackInvokedCallback() { // from class: com.ironsource.mediationsdk.testSuite.TestSuiteActivity$$ExternalSyntheticLambda2
                public final void onBackInvoked() {
                    TestSuiteActivity.m32700b();
                }
            };
            this.f31462d = onBackInvokedCallback;
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, onBackInvokedCallback);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static final void m32699a(TestSuiteActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }
}
