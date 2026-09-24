package com.chartboost.sdk.view;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.chartboost.sdk.Chartboost;
import com.chartboost.sdk.impl.AbstractC3969ok;
import com.chartboost.sdk.impl.C3678c4;
import com.chartboost.sdk.impl.C3920mg;
import com.chartboost.sdk.impl.C4048sb;
import com.chartboost.sdk.impl.C4112v9;
import com.chartboost.sdk.impl.InterfaceC4068t9;
import com.chartboost.sdk.impl.InterfaceC4096uf;
import com.hbisoft.hbrecorder.Constants;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m43474d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b$\u0010\tJ\u0019\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\tJ\u000f\u0010\f\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\f\u0010\tJ\u000f\u0010\r\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\r\u0010\tJ\u0017\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\tJ\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0016\u0010\tJ\u0017\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001d\u0010\tJ\u000f\u0010\u001e\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001e\u0010\u0015J\u000f\u0010\u001f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001f\u0010\tJ\u000f\u0010 \u001a\u00020\u0005H\u0002¢\u0006\u0004\b \u0010\tR\u0018\u0010#\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\"¨\u0006%"}, m43475d2 = {"Lcom/chartboost/sdk/view/CBImpressionActivity;", "Landroid/app/Activity;", "Lcom/chartboost/sdk/impl/t9;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", Constants.ON_START_KEY, "()V", "onResume", "onPause", "onDestroy", "onBackPressed", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "onAttachedToWindow", "", "isActivityHardwareAccelerated", "()Z", "finishActivity", "Lcom/chartboost/sdk/impl/ok;", "view", "attachViewToActivity", "(Lcom/chartboost/sdk/impl/ok;)V", "getActivity", "()Lcom/chartboost/sdk/view/CBImpressionActivity;", "setFullscreen", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "a", "c", "Lcom/chartboost/sdk/impl/v9;", "Lcom/chartboost/sdk/impl/v9;", "presenter", "<init>", "ChartboostMonetization-9.11.1_productionRelease"}, m43476k = 1, m43477mv = {1, 9, 0})
public final class CBImpressionActivity extends Activity implements InterfaceC4068t9 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public C4112v9 presenter;

    /* JADX INFO: renamed from: a */
    public final void m20267a() {
        if (this.presenter == null) {
            if (!Chartboost.isSdkStarted()) {
                C4048sb.m19411b("Cannot start Chartboost activity due to SDK not being initialized.", (Throwable) null, 2, (Object) null);
                finish();
                return;
            }
            C3678c4 c3678c4 = C3678c4.f13658b;
            InterfaceC4096uf interfaceC4096ufMo18660a = c3678c4.m17032l().mo18660a();
            Object obj = c3678c4.mo17019a().mo18988b().get();
            Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
            this.presenter = new C4112v9(this, interfaceC4096ufMo18660a, (C3920mg) obj, c3678c4.mo17024d().mo18326j());
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4068t9
    public void attachViewToActivity(AbstractC3969ok view) {
        Intrinsics.checkNotNullParameter(view, "view");
        try {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
            addContentView(view, new FrameLayout.LayoutParams(-1, -1));
        } catch (Exception e) {
            C4048sb.m19407a("Cannot attach view to activity", e);
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m20268b() {
        Intent intent = getIntent();
        if (intent != null) {
            return intent.getBooleanExtra("isChartboost", false);
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final void m20269c() {
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4068t9
    public void finishActivity() {
        finish();
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4068t9
    public CBImpressionActivity getActivity() {
        return this;
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4068t9
    public boolean isActivityHardwareAccelerated() {
        View decorView;
        Window window = getWindow();
        if (window == null || (decorView = window.getDecorView()) == null) {
            return false;
        }
        return decorView.isHardwareAccelerated();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C4112v9 c4112v9 = this.presenter;
        if (c4112v9 != null) {
            c4112v9.m19680h();
        }
    }

    @Override // android.app.Activity
    @Deprecated(message = "Deprecated in Java")
    public void onBackPressed() {
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        C4112v9 c4112v9 = this.presenter;
        if (c4112v9 != null) {
            c4112v9.m19674b();
        }
        super.onConfigurationChanged(newConfig);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        m20269c();
        if (!m20268b()) {
            C4048sb.m19411b("This activity cannot be called from outside chartboost SDK", (Throwable) null, 2, (Object) null);
            finish();
            return;
        }
        requestWindowFeature(1);
        getWindow().setWindowAnimations(0);
        m20267a();
        C4112v9 c4112v9 = this.presenter;
        if (c4112v9 != null) {
            c4112v9.m19675c();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        C4112v9 c4112v9 = this.presenter;
        if (c4112v9 != null) {
            c4112v9.m19676d();
        }
        this.presenter = null;
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        C4112v9 c4112v9 = this.presenter;
        if (c4112v9 != null) {
            c4112v9.m19677e();
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        m20267a();
        C4112v9 c4112v9 = this.presenter;
        if (c4112v9 != null) {
            c4112v9.m19678f();
        }
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        C4112v9 c4112v9 = this.presenter;
        if (c4112v9 != null) {
            c4112v9.m19679g();
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4068t9
    public void setFullscreen() {
        try {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                Window window = getWindow();
                if (window != null) {
                    window.setDecorFitsSystemWindows(true);
                    WindowInsetsController insetsController = window.getInsetsController();
                    if (insetsController != null) {
                        insetsController.hide(WindowInsets.Type.statusBars() | WindowInsets.Type.navigationBars());
                        insetsController.setSystemBarsBehavior(2);
                    }
                }
            } else {
                Window window2 = getWindow();
                View decorView = window2 != null ? window2.getDecorView() : null;
                if (decorView != null) {
                    decorView.setSystemUiVisibility(3846);
                }
            }
            if (i >= 28) {
                Window window3 = getWindow();
                WindowManager.LayoutParams attributes = window3 != null ? window3.getAttributes() : null;
                if (attributes == null) {
                    return;
                }
                attributes.layoutInDisplayCutoutMode = 1;
            }
        } catch (Exception e) {
            C4048sb.m19407a("Cannot set view to fullscreen", e);
        }
    }
}
