package com.applovin.adview;

import android.R;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Insets;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowInsets;
import android.webkit.WebView;
import android.window.OnBackInvokedCallback;
import androidx.core.view.ViewCompat;
import com.applovin.impl.AbstractC1525d;
import com.applovin.impl.AbstractC1555g;
import com.applovin.impl.AbstractC1564g8;
import com.applovin.impl.AbstractC1568h2;
import com.applovin.impl.AbstractC1677p0;
import com.applovin.impl.AbstractC1701q7;
import com.applovin.impl.AbstractC1819y1;
import com.applovin.impl.C1511b5;
import com.applovin.impl.C1535e;
import com.applovin.impl.C1548f2;
import com.applovin.impl.C1576i0;
import com.applovin.impl.C1679p2;
import com.applovin.impl.C1831z4;
import com.applovin.impl.InterfaceC1668o1;
import com.applovin.impl.adview.activity.FullscreenAdService;
import com.applovin.impl.adview.activity.ServiceConnectionC1492a;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.p025ad.AbstractC1736b;
import com.applovin.impl.sdk.p025ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class AppLovinFullscreenActivity extends Activity implements InterfaceC1668o1 {

    /* JADX INFO: renamed from: m */
    private static final Set f914m = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: n */
    private static final Object f915n = new Object();
    public static C1679p2 parentInterstitialWrapper;

    /* JADX INFO: renamed from: a */
    private C1748l f916a;

    /* JADX INFO: renamed from: b */
    private AbstractC1819y1 f917b;

    /* JADX INFO: renamed from: c */
    private final AtomicBoolean f918c = new AtomicBoolean(true);

    /* JADX INFO: renamed from: d */
    private ServiceConnectionC1492a f919d;

    /* JADX INFO: renamed from: e */
    private C1477c f920e;

    /* JADX INFO: renamed from: f */
    private C1576i0 f921f;

    /* JADX INFO: renamed from: g */
    private long f922g;

    /* JADX INFO: renamed from: h */
    private boolean f923h;

    /* JADX INFO: renamed from: i */
    private boolean f924i;

    /* JADX INFO: renamed from: j */
    private boolean f925j;

    /* JADX INFO: renamed from: k */
    private boolean f926k;

    /* JADX INFO: renamed from: l */
    private boolean f927l;

    /* JADX INFO: renamed from: com.applovin.adview.AppLovinFullscreenActivity$a */
    class ViewOnApplyWindowInsetsListenerC1475a implements View.OnApplyWindowInsetsListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Boolean f928a;

        ViewOnApplyWindowInsetsListenerC1475a(Boolean bool) {
            this.f928a = bool;
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            if (this.f928a.booleanValue()) {
                AppLovinFullscreenActivity.this.m1744a(windowInsets);
            }
            if (!AppLovinFullscreenActivity.this.f927l) {
                Insets insets = windowInsets.getInsets(((Integer) AppLovinFullscreenActivity.this.f916a.m4801a(C1831z4.f4069w2)).intValue());
                view.setPadding(insets.left, insets.top, insets.right, insets.bottom);
                return windowInsets;
            }
            int iIntValue = ((Integer) AppLovinFullscreenActivity.this.f916a.m4801a(C1831z4.f4069w2)).intValue();
            Insets insets2 = windowInsets.getInsets(AppLovinFullscreenActivity.this.f926k ? iIntValue & (~WindowInsets.Type.displayCutout()) : iIntValue | WindowInsets.Type.displayCutout());
            view.setPadding(insets2.left, insets2.top, insets2.right, insets2.bottom);
            return windowInsets;
        }
    }

    /* JADX INFO: renamed from: com.applovin.adview.AppLovinFullscreenActivity$b */
    class C1476b implements AbstractC1819y1.g {
        C1476b() {
        }

        @Override // com.applovin.impl.AbstractC1819y1.g
        /* JADX INFO: renamed from: a */
        public void mo1754a(AbstractC1819y1 abstractC1819y1) {
            AppLovinFullscreenActivity.this.f917b = abstractC1819y1;
            abstractC1819y1.mo2091w();
        }

        @Override // com.applovin.impl.AbstractC1819y1.g
        /* JADX INFO: renamed from: a */
        public void mo1755a(String str, Throwable th) {
            AbstractC1736b abstractC1736bM3866f = AppLovinFullscreenActivity.parentInterstitialWrapper.m3866f();
            C1679p2.m3847a(abstractC1736bM3866f, AppLovinFullscreenActivity.parentInterstitialWrapper.m3864c(), str, th, AppLovinFullscreenActivity.this);
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("source", "createAppLovinFullscreenActivity");
            CollectionUtils.putStringIfValid("error_message", str, mapHashMap);
            CollectionUtils.putStringIfValid("top_main_method", th.toString(), mapHashMap);
            AppLovinFullscreenActivity.this.f916a.m4830g().m2526a(C1548f2.f1474F, abstractC1736bM3866f, mapHashMap);
        }
    }

    /* JADX INFO: renamed from: com.applovin.adview.AppLovinFullscreenActivity$c */
    private static class C1477c implements OnBackInvokedCallback {

        /* JADX INFO: renamed from: a */
        private final Runnable f931a;

        protected C1477c(Runnable runnable) {
            this.f931a = runnable;
        }

        public void onBackInvoked() {
            this.f931a.run();
        }
    }

    /* JADX INFO: renamed from: a */
    private void m1743a() {
        C1679p2 c1679p2;
        C1748l c1748l = this.f916a;
        if (c1748l == null || !((Boolean) c1748l.m4801a(C1831z4.f4093z2)).booleanValue() || (c1679p2 = parentInterstitialWrapper) == null || c1679p2.m3866f() == null) {
            return;
        }
        AbstractC1736b abstractC1736bM3866f = parentInterstitialWrapper.m3866f();
        List listM4541j = abstractC1736bM3866f.m4541j();
        if (CollectionUtils.isEmpty(listM4541j)) {
            return;
        }
        C1535e c1535e = (C1535e) listM4541j.get(0);
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putStringIfValid(jSONObject, "app_killed_postback_url", c1535e.m2450c());
        JsonUtils.putStringIfValid(jSONObject, "app_killed_postback_backup_url", c1535e.m2448a());
        this.f916a.m4851r0().m2215b(C1511b5.f1158P, jSONObject.toString());
        this.f916a.m4851r0().m2215b(C1511b5.f1156N, Long.valueOf(System.currentTimeMillis()));
        this.f916a.m4851r0().m2215b(C1511b5.f1159Q, CollectionUtils.toJsonString(AbstractC1568h2.m2787a((AppLovinAdImpl) abstractC1736bM3866f), JsonUtils.EMPTY_JSON));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m1744a(WindowInsets windowInsets) {
        AbstractC1677p0.a aVarM3794a = AbstractC1677p0.m3794a(windowInsets, this.f916a);
        AbstractC1677p0.a aVarM3805c = AbstractC1677p0.m3805c(windowInsets, this.f916a);
        AbstractC1677p0.a aVarM3801b = AbstractC1677p0.m3801b(windowInsets, this.f916a);
        String strM4077b = AbstractC1701q7.m4077b(this);
        AbstractC1677p0.m3798a(aVarM3794a, strM4077b);
        AbstractC1677p0.m3807c(aVarM3805c, strM4077b);
        AbstractC1677p0.m3803b(aVarM3801b, strM4077b);
        AbstractC1819y1 abstractC1819y1 = this.f917b;
        if (abstractC1819y1 != null) {
            abstractC1819y1.m5650a(aVarM3794a, aVarM3805c, aVarM3801b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m1746a(C1679p2 c1679p2) {
        boolean zM5671y = this.f917b.m5671y();
        boolean zM3868i = (c1679p2 == null || !zM5671y) ? false : c1679p2.m3868i();
        if (!zM3868i) {
            this.f917b.m5659d(false);
        }
        m1747a(this.f917b, zM5671y, zM3868i);
    }

    /* JADX INFO: renamed from: a */
    private void m1747a(AbstractC1819y1 abstractC1819y1, boolean z, boolean z2) {
        abstractC1819y1.mo2085a("activity_destroyed_by_app_relaunch");
        if (this.f916a != null) {
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("source", "onDestroyAppLovinFullScreenActivity");
            C1679p2 c1679p2 = parentInterstitialWrapper;
            AbstractC1736b abstractC1736bM3866f = c1679p2 != null ? c1679p2.m3866f() : null;
            mapHashMap.putAll(AbstractC1568h2.m2787a((AppLovinAdImpl) abstractC1736bM3866f));
            JSONObject jSONObject = new JSONObject();
            JsonUtils.putBoolean(jSONObject, "reshow_attempted", z);
            JsonUtils.putBoolean(jSONObject, "reshow_success", z2);
            if (abstractC1736bM3866f != null) {
                JsonUtils.putInt(jSONObject, "reshow_count", abstractC1736bM3866f.m4503R());
            }
            mapHashMap.put("details", jSONObject.toString());
            this.f916a.m4764E().m2682d(C1548f2.f1483J0, mapHashMap);
        }
        abstractC1819y1.mo2190r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m1748a(Long l) {
        this.f922g += l.longValue();
        this.f916a.m4851r0().m2215b(C1511b5.f1157O, Long.valueOf(this.f922g));
    }

    /* JADX INFO: renamed from: b */
    private void m1751b() {
        C1748l c1748l = this.f916a;
        if (c1748l == null || !((Boolean) c1748l.m4801a(C1831z4.f3673A2)).booleanValue()) {
            return;
        }
        final Long l = (Long) this.f916a.m4801a(C1831z4.f3681B2);
        this.f921f = C1576i0.m2852a(l.longValue(), true, this.f916a, new Runnable() { // from class: com.applovin.adview.AppLovinFullscreenActivity$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m1748a(l);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public void m1752c() {
        AbstractC1819y1 abstractC1819y1 = this.f917b;
        if (abstractC1819y1 != null) {
            abstractC1819y1.m5668q();
        }
        if (AbstractC1701q7.m4109g(getApplicationContext())) {
            super.onBackPressed();
        }
    }

    public void configureSystemUiBars(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f927l = z || z2 || z3;
        if (!AbstractC1677p0.m3804b() || !this.f927l) {
            getWindow().setFlags(1024, 1024);
            AbstractC1525d.m2249c(this);
            return;
        }
        this.f923h = z;
        this.f924i = z2;
        this.f925j = z3;
        this.f926k = z4;
        if (z3) {
            this.f923h = false;
            this.f924i = false;
        }
        getWindow().getAttributes().layoutInDisplayCutoutMode = 1;
        if (this.f923h) {
            AbstractC1525d.m2248b((Activity) this);
        } else {
            AbstractC1525d.m2252f(this);
        }
        if (this.f924i) {
            AbstractC1525d.m2244a((Activity) this);
        } else {
            AbstractC1525d.m2251e(this);
        }
    }

    @Override // com.applovin.impl.InterfaceC1668o1
    public void dismiss(String str) {
        if (AbstractC1677p0.m3814h() && this.f920e != null) {
            getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.f920e);
            this.f920e = null;
        }
        AbstractC1819y1 abstractC1819y1 = this.f917b;
        if (abstractC1819y1 != null) {
            abstractC1819y1.mo2085a(str);
        } else {
            finish();
        }
    }

    public boolean isAllowingAdRenderingWithinDisplayCutout() {
        return this.f926k;
    }

    public boolean isHidingNavigationBar() {
        return this.f924i;
    }

    public boolean isHidingStatusBar() {
        return this.f923h;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        m1752c();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        AbstractC1819y1 abstractC1819y1 = this.f917b;
        if (abstractC1819y1 != null) {
            abstractC1819y1.m5648a(configuration);
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null && parentInterstitialWrapper == null) {
            C1768p.m5169j("AppLovinFullscreenActivity", "Dismissing ad. Activity was destroyed while in background.");
            dismiss("activity_destroyed_while_in_background");
            return;
        }
        try {
            requestWindowFeature(1);
        } catch (Throwable th) {
            C1768p.m5164c("AppLovinFullscreenActivity", "Failed to request window feature", th);
        }
        getWindow().addFlags(16777216);
        getWindow().addFlags(128);
        View viewFindViewById = findViewById(R.id.content);
        viewFindViewById.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        if (TextUtils.isEmpty(getIntent().getStringExtra("com.applovin.interstitial.sdk_key"))) {
            C1679p2 c1679p2 = parentInterstitialWrapper;
            if (c1679p2 != null && c1679p2.m3866f() != null) {
                C1679p2.m3847a(parentInterstitialWrapper.m3866f(), parentInterstitialWrapper.m3864c(), "Empty SDK key", (Throwable) null, this);
            }
            finish();
            return;
        }
        this.f916a = AppLovinSdk.getInstance(this).m5807a();
        C1679p2 c1679p3 = parentInterstitialWrapper;
        AbstractC1736b abstractC1736bM3866f = c1679p3 != null ? c1679p3.m3866f() : null;
        Boolean bool = (Boolean) this.f916a.m4801a(C1831z4.f3731H4);
        if (abstractC1736bM3866f != null) {
            this.f923h = abstractC1736bM3866f.m4498O0();
            this.f924i = abstractC1736bM3866f.m4494M0();
            this.f925j = abstractC1736bM3866f.m4496N0();
            this.f926k = abstractC1736bM3866f.m4474B0();
            this.f927l = abstractC1736bM3866f.m4481F0();
        }
        if (AbstractC1677p0.m3804b() && (bool.booleanValue() || this.f927l)) {
            getWindow().setDecorFitsSystemWindows(false);
            viewFindViewById.setOnApplyWindowInsetsListener(new ViewOnApplyWindowInsetsListenerC1475a(bool));
            configureSystemUiBars(this.f923h, this.f924i, this.f925j, this.f926k);
        } else {
            viewFindViewById.setFitsSystemWindows(true);
            if (AbstractC1677p0.m3804b()) {
                AbstractC1564g8.m2754a(viewFindViewById, this.f916a);
            }
            configureSystemUiBars(this.f923h, this.f924i, this.f925j, this.f926k);
        }
        if (abstractC1736bM3866f != null) {
            AbstractC1555g.m2635a(abstractC1736bM3866f, this, this.f916a);
        }
        if (AbstractC1677p0.m3814h() && ((Boolean) this.f916a.m4801a(C1831z4.f3973k6)).booleanValue()) {
            this.f920e = new C1477c(new Runnable() { // from class: com.applovin.adview.AppLovinFullscreenActivity$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m1752c();
                }
            });
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.f920e);
        }
        m1743a();
        m1751b();
        Integer num = (Integer) this.f916a.m4801a(C1831z4.f3749J6);
        if (num.intValue() > 0) {
            synchronized (f915n) {
                Set set = f914m;
                set.add(this);
                AbstractC1701q7.m4052a("AppLovinFullscreenActivity", set.size(), num.intValue(), this.f916a.m4764E());
            }
        }
        C1679p2 c1679p4 = parentInterstitialWrapper;
        if (c1679p4 != null) {
            AbstractC1819y1.m5621a(c1679p4.m3866f(), parentInterstitialWrapper.m3863b(), parentInterstitialWrapper.m3864c(), parentInterstitialWrapper.m3865d(), parentInterstitialWrapper.m3867h(), this.f916a, this, new C1476b());
            return;
        }
        Intent intent = new Intent(this, (Class<?>) FullscreenAdService.class);
        ServiceConnectionC1492a serviceConnectionC1492a = new ServiceConnectionC1492a(this, this.f916a);
        this.f919d = serviceConnectionC1492a;
        bindService(intent, serviceConnectionC1492a, 1);
        if (AbstractC1677p0.m3812f()) {
            String str = this.f916a.m4847p0().getExtraParameters().get("disable_set_data_dir_suffix");
            if (StringUtils.isValidString(str) && Boolean.parseBoolean(str)) {
                return;
            }
            try {
                WebView.setDataDirectorySuffix(String.valueOf(Process.myPid()));
            } catch (Throwable unused) {
            }
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        C1748l c1748l = this.f916a;
        if (c1748l != null && ((Boolean) c1748l.m4801a(C1831z4.f4093z2)).booleanValue()) {
            this.f916a.m4851r0().m2214b(C1511b5.f1156N);
            this.f916a.m4851r0().m2214b(C1511b5.f1158P);
            this.f916a.m4851r0().m2214b(C1511b5.f1159Q);
        }
        if (this.f921f != null) {
            this.f916a.m4851r0().m2214b(C1511b5.f1157O);
            this.f921f.m2854a();
            this.f921f = null;
        }
        ServiceConnectionC1492a serviceConnectionC1492a = this.f919d;
        if (serviceConnectionC1492a != null) {
            try {
                unbindService(serviceConnectionC1492a);
            } catch (Throwable unused) {
            }
        }
        AbstractC1819y1 abstractC1819y1 = this.f917b;
        if (abstractC1819y1 != null) {
            if (abstractC1819y1.m5661g()) {
                this.f917b.mo2190r();
            } else {
                long jM5645a = this.f917b.m5645a();
                if (jM5645a >= 0) {
                    if (jM5645a == 0) {
                        this.f917b.m5659d(true);
                    }
                    final C1679p2 c1679p2 = parentInterstitialWrapper;
                    AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.adview.AppLovinFullscreenActivity$$ExternalSyntheticLambda4
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f$0.m1746a(c1679p2);
                        }
                    }, jM5645a);
                } else {
                    m1747a(this.f917b, false, false);
                }
            }
        }
        parentInterstitialWrapper = null;
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        AbstractC1819y1 abstractC1819y1 = this.f917b;
        if (abstractC1819y1 != null) {
            abstractC1819y1.m5646a(i, keyEvent);
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        AbstractC1819y1 abstractC1819y1 = this.f917b;
        if (abstractC1819y1 != null) {
            abstractC1819y1.mo2088s();
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        AbstractC1819y1 abstractC1819y1;
        try {
            super.onResume();
            if (this.f918c.get() || (abstractC1819y1 = this.f917b) == null) {
                return;
            }
            abstractC1819y1.mo2089t();
        } catch (IllegalArgumentException e) {
            this.f916a.m4782Q();
            if (C1768p.m5160a()) {
                this.f916a.m4782Q().m5172a("AppLovinFullscreenActivity", "Error was encountered in onResume().", e);
            }
            this.f916a.m4764E().m4329a("AppLovinFullscreenActivity", "onResume", e);
            dismiss("activity_on_resume_error");
        }
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        AbstractC1819y1 abstractC1819y1 = this.f917b;
        if (abstractC1819y1 != null) {
            abstractC1819y1.m5669u();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        if (this.f917b != null) {
            if (!this.f918c.getAndSet(false)) {
                this.f917b.mo2186b(z);
            }
            if (z) {
                configureSystemUiBars(this.f923h, this.f924i, this.f925j, this.f926k);
            }
        }
        super.onWindowFocusChanged(z);
    }

    public void setPresenter(AbstractC1819y1 abstractC1819y1) {
        this.f917b = abstractC1819y1;
    }
}
