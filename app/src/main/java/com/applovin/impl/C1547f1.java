package com.applovin.impl;

import android.R;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.core.net.MailTo;
import androidx.webkit.internal.AssetHelper;
import com.applovin.creative.MaxCreativeDebuggerActivity;
import com.applovin.creative.MaxCreativeDebuggerDisplayedAdActivity;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.p025ad.AbstractC1736b;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.C1846R;
import com.ironsource.C11540L6;
import com.ironsource.C11744X3;
import com.unity3d.ads.core.domain.AndroidInitializeBoldSDK;
import com.vungle.ads.internal.protos.Sdk;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.applovin.impl.f1 */
/* JADX INFO: loaded from: classes3.dex */
public class C1547f1 implements C1658n1.a {

    /* JADX INFO: renamed from: m */
    private static WeakReference f1446m;

    /* JADX INFO: renamed from: n */
    private static final AtomicBoolean f1447n = new AtomicBoolean();

    /* JADX INFO: renamed from: a */
    private final C1748l f1448a;

    /* JADX INFO: renamed from: b */
    private final Context f1449b;

    /* JADX INFO: renamed from: c */
    private final Map f1450c;

    /* JADX INFO: renamed from: e */
    private final C1537e1 f1452e;

    /* JADX INFO: renamed from: g */
    private C1658n1 f1454g;

    /* JADX INFO: renamed from: h */
    private C1593j7 f1455h;

    /* JADX INFO: renamed from: i */
    private int f1456i;

    /* JADX INFO: renamed from: j */
    private boolean f1457j;

    /* JADX INFO: renamed from: k */
    private long f1458k;

    /* JADX INFO: renamed from: l */
    private boolean f1459l;

    /* JADX INFO: renamed from: d */
    private final Object f1451d = new Object();

    /* JADX INFO: renamed from: f */
    private WeakReference f1453f = new WeakReference(null);

    /* JADX INFO: renamed from: com.applovin.impl.f1$a */
    class a extends LinkedHashMap {
        a(int i) {
            super(i);
        }

        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry entry) {
            return size() > 10;
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.f1$b */
    class b extends AbstractC1505b {
        b() {
        }

        @Override // com.applovin.impl.AbstractC1505b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (activity instanceof MaxCreativeDebuggerActivity) {
                C1768p.m5166g("AppLovinSdk", "Started Creative Debugger");
                if (!C1547f1.this.m2551h() || C1547f1.f1446m.get() != activity) {
                    MaxCreativeDebuggerActivity maxCreativeDebuggerActivity = (MaxCreativeDebuggerActivity) activity;
                    WeakReference unused = C1547f1.f1446m = new WeakReference(maxCreativeDebuggerActivity);
                    maxCreativeDebuggerActivity.m2343a(C1547f1.this.f1452e, C1547f1.this.f1448a.m4826e());
                }
                C1547f1.f1447n.set(false);
            }
        }

        @Override // com.applovin.impl.AbstractC1505b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (activity instanceof MaxCreativeDebuggerActivity) {
                C1768p.m5166g("AppLovinSdk", "Creative Debugger destroyed");
                WeakReference unused = C1547f1.f1446m = null;
            }
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.f1$c */
    class c implements AbstractC1525d.b {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Object f1462a;

        c(Object obj) {
            this.f1462a = obj;
        }

        @Override // com.applovin.impl.AbstractC1525d.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo2130a(MaxCreativeDebuggerDisplayedAdActivity maxCreativeDebuggerDisplayedAdActivity) {
            maxCreativeDebuggerDisplayedAdActivity.m3836a(new C1705r1(this.f1462a, C1547f1.this.f1448a.m4773J().m5146b()), C1547f1.this.f1448a);
            C1547f1.f1447n.set(false);
        }
    }

    public C1547f1(C1748l c1748l) {
        this.f1448a = c1748l;
        Context contextM4756p = C1748l.m4756p();
        this.f1449b = contextM4756p;
        this.f1450c = new a(10);
        this.f1452e = new C1537e1(contextM4756p);
    }

    /* JADX INFO: renamed from: a */
    private Bundle m2533a(Object obj) {
        this.f1448a.m4782Q();
        if (C1768p.m5160a()) {
            this.f1448a.m4782Q().m5171a("CreativeDebuggerService", "Retrieving Ad Review info for ad: " + obj);
        }
        String strM4033a = AbstractC1701q7.m4033a(obj);
        Bundle bundleM2945a = this.f1448a.m4838k().m2945a(strM4033a);
        this.f1448a.m4782Q();
        if (C1768p.m5160a()) {
            this.f1448a.m4782Q().m5171a("CreativeDebuggerService", "Serve id: " + strM4033a);
        }
        this.f1448a.m4782Q();
        if (C1768p.m5160a()) {
            this.f1448a.m4782Q().m5171a("CreativeDebuggerService", "Public data: " + bundleM2945a);
        }
        if (bundleM2945a == null) {
            return null;
        }
        for (String str : bundleM2945a.keySet()) {
            Object obj2 = bundleM2945a.get(str);
            bundleM2945a.remove(str);
            BundleUtils.put(StringUtils.toHumanReadableString(str), obj2, bundleM2945a);
        }
        return bundleM2945a;
    }

    /* JADX INFO: renamed from: a */
    private View m2534a(final FrameLayout frameLayout, Activity activity) {
        View view;
        int iDpToPx = AppLovinSdkUtils.dpToPx(activity, 40);
        int i = iDpToPx / 10;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iDpToPx, iDpToPx, 8388629);
        layoutParams.setMargins(i, i, i, i);
        try {
            ImageButton imageButton = new ImageButton(activity);
            imageButton.setImageDrawable(activity.getResources().getDrawable(C1846R.drawable.applovin_ic_white_small));
            imageButton.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageButton.setPadding(i, i, i, i * 2);
            view = imageButton;
        } catch (Throwable unused) {
            Button button = new Button(activity);
            button.setText("ⓘ");
            button.setTextColor(-1);
            button.setAllCaps(false);
            button.setTextSize(2, 20.0f);
            button.setPadding(0, 0, 0, 0);
            view = button;
        }
        view.setLayoutParams(layoutParams);
        view.setBackground(m2550f());
        if (this.f1457j) {
            view.setOnTouchListener(new View.OnTouchListener() { // from class: com.applovin.impl.f1$$ExternalSyntheticLambda4
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    return this.f$0.m2539a(frameLayout, view2, motionEvent);
                }
            });
        } else {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.f1$$ExternalSyntheticLambda5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f$0.m2536a(view2);
                }
            });
        }
        view.setElevation(AppLovinSdkUtils.dpToPx(activity, 5));
        return view;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m2536a(View view) {
        m2564n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m2537a(View view, FrameLayout frameLayout) {
        if (view.getParent() != null || this.f1453f.get() == null) {
            return;
        }
        frameLayout.addView(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m2538a(View view, FrameLayout frameLayout, ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (this.f1458k <= 0 || !this.f1457j) {
            m2543b(view, frameLayout);
        } else {
            view.setVisibility(4);
        }
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ boolean m2539a(FrameLayout frameLayout, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f1458k = SystemClock.elapsedRealtime();
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.f1$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m2552i();
                }
            }, TimeUnit.SECONDS.toMillis(10L));
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (view.getVisibility() == 0) {
                this.f1458k = 0L;
                m2564n();
            } else {
                m2543b(view, frameLayout);
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    private String m2542b(Object obj) {
        String strM1833T;
        if (obj instanceof AbstractC1736b) {
            strM1833T = ((AbstractC1736b) obj).getMediationServeId();
        } else {
            strM1833T = obj instanceof AbstractC1482a3 ? ((AbstractC1482a3) obj).m1833T() : null;
        }
        return StringUtils.isValidString(strM1833T) ? strM1833T : UUID.randomUUID().toString();
    }

    /* JADX INFO: renamed from: b */
    private void m2543b(View view, FrameLayout frameLayout) {
        if (this.f1457j) {
            view.setOnTouchListener(null);
            this.f1458k = 0L;
        }
        frameLayout.removeView(view);
        this.f1453f = new WeakReference(null);
    }

    /* JADX INFO: renamed from: c */
    private boolean m2546c(Object obj) {
        MaxAdFormat format;
        if (obj instanceof AbstractC1736b) {
            format = ((AbstractC1736b) obj).getAdZone().m5263d();
        } else {
            format = obj instanceof AbstractC1482a3 ? ((AbstractC1482a3) obj).getFormat() : null;
        }
        return format != null && format.isFullscreenAd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public void m2548e() {
        if (m2561g() && this.f1453f.get() == null && !m2551h()) {
            Activity activityM2145b = this.f1448a.m4826e().m2145b();
            if (activityM2145b == null) {
                this.f1448a.m4782Q();
                if (C1768p.m5160a()) {
                    this.f1448a.m4782Q().m5174b("AppLovinSdk", "Failed to display Creative Debugger button");
                }
            } else {
                View viewFindViewById = activityM2145b.findViewById(R.id.content);
                if (viewFindViewById instanceof FrameLayout) {
                    final FrameLayout frameLayout = (FrameLayout) viewFindViewById;
                    final View viewM2534a = m2534a(frameLayout, activityM2145b);
                    frameLayout.addView(viewM2534a);
                    AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                    alphaAnimation.setDuration(150L);
                    viewM2534a.startAnimation(alphaAnimation);
                    final ViewTreeObserver viewTreeObserver = viewFindViewById.getViewTreeObserver();
                    final ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.applovin.impl.f1$$ExternalSyntheticLambda0
                        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                        public final void onGlobalLayout() {
                            this.f$0.m2537a(viewM2534a, frameLayout);
                        }
                    };
                    viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
                    AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.f1$$ExternalSyntheticLambda1
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f$0.m2538a(viewM2534a, frameLayout, viewTreeObserver, onGlobalLayoutListener);
                        }
                    }, TimeUnit.SECONDS.toMillis(5L));
                    this.f1453f = new WeakReference(viewM2534a);
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    private void m2549e(Object obj) {
        C1768p.m5166g("AppLovinSdk", "Starting Creative Debugger for current fullscreen ad...");
        AbstractC1525d.m2246a(this.f1449b, MaxCreativeDebuggerDisplayedAdActivity.class, this.f1448a.m4826e(), new c(obj));
    }

    /* JADX INFO: renamed from: f */
    private Drawable m2550f() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.rgb(5, Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE, 170));
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(1);
        gradientDrawable2.setColor(Color.rgb(2, 98, 127));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, gradientDrawable2);
        stateListDrawable.addState(new int[0], gradientDrawable);
        return stateListDrawable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public boolean m2551h() {
        WeakReference weakReference = f1446m;
        return (weakReference == null || weakReference.get() == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m2552i() {
        long seconds = TimeUnit.MILLISECONDS.toSeconds(SystemClock.elapsedRealtime() - this.f1458k);
        if (this.f1458k == 0 || seconds < 10) {
            return;
        }
        this.f1448a.m4764E().m2677a(C1548f2.f1523d, "showingMediationDebuggerFromHoldingCreativeDebuggerButton");
        this.f1448a.m4796Y0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m2553j() {
        this.f1456i = 0;
    }

    /* JADX INFO: renamed from: m */
    private void m2554m() {
        this.f1448a.m4826e().m2144a(new b());
    }

    /* JADX INFO: renamed from: a */
    public String m2555a(C1705r1 c1705r1) {
        C1811x2 c1811x2 = new C1811x2();
        c1811x2.m5574b("Ad Info:\n");
        AbstractC1482a3 abstractC1482a3M4162e = c1705r1.m4162e();
        AbstractC1736b abstractC1736bM4160c = c1705r1.m4160c();
        if (abstractC1482a3M4162e != null) {
            c1811x2.m5567a(abstractC1482a3M4162e);
        } else if (abstractC1736bM4160c != null) {
            c1811x2.m5571a(AndroidInitializeBoldSDK.MSG_NETWORK, "APPLOVIN").m5568a(abstractC1736bM4160c).m5573b(abstractC1736bM4160c);
        }
        c1811x2.m5569a(this.f1448a);
        c1811x2.m5571a("Epoch Timestamp (ms)", Long.valueOf(c1705r1.m4159b()));
        C1811x2 c1811x3 = new C1811x2();
        Map mapM4933G = this.f1448a.m4759B().m4933G();
        c1811x3.m5571a("Platform", "fireos".equals(mapM4933G.get(C11540L6.f24917H)) ? "Fire OS" : C11744X3.f26142d).m5571a("OS Version", Build.VERSION.RELEASE).m5571a("Device", String.format("%s %s (%s)", Build.BRAND, Build.MODEL, Build.DEVICE)).m5571a("App Package Name", this.f1449b.getPackageName()).m5571a("App Version", mapM4933G.get("app_version")).m5571a("App Version Code", mapM4933G.get("app_version_code")).m5571a("User ID", this.f1448a.m4865y0().m3898e() != null ? this.f1448a.m4865y0().m3898e() : "None");
        c1811x2.m5570a("\nApp Info:").m5570a(c1811x3.toString());
        C1811x2 c1811x4 = new C1811x2();
        c1811x4.m5571a("AppLovin SDK Version", AppLovinSdk.VERSION).m5571a("Plugin Version", this.f1448a.m4801a(C1831z4.f3794P3)).m5571a("AppLovin Random Token", this.f1448a.m4837j0()).m5571a("Ad Review Version", C1585j.m2942b()).m5565a(m2533a(c1705r1.m4157a())).m5571a("MD", this.f1448a.m4801a(C1831z4.f4042t));
        c1811x2.m5570a("\nDebug Info:\n").m5570a(AbstractC1804w4.m5542b(c1811x4.toString(), AbstractC1701q7.m4020a(this.f1448a), AbstractC1804w4.a.V2, this.f1448a));
        return c1811x2.toString();
    }

    @Override // com.applovin.impl.C1658n1.a
    /* JADX INFO: renamed from: a */
    public void mo2556a() {
        int i = this.f1456i;
        if (i % 2 == 1) {
            this.f1456i = i + 1;
        }
        if (this.f1456i / 2 == 2) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.f1$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m2548e();
                }
            });
            this.f1456i = 0;
            this.f1455h.m3023a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.io.Serializable, java.lang.Object[]] */
    /* JADX INFO: renamed from: a */
    public void m2557a(C1705r1 c1705r1, Context context, boolean z) {
        String strM2555a = m2555a(c1705r1);
        C1811x2 c1811x2 = new C1811x2();
        if (z) {
            c1811x2.m5574b("Please describe the issue you had with this ad:\n\n\n\n");
        }
        c1811x2.m5574b(strM2555a);
        String strM2558b = m2558b(c1705r1);
        if (strM2558b != null) {
            c1811x2.m5570a("\nBid Response:\n");
            c1811x2.m5570a(strM2558b);
        }
        String str = c1705r1.m4160c() != null ? "AppLovin Ad Report" : "MAX Ad Report";
        Intent intentCreateChooser = Intent.createChooser(new Intent("android.intent.action.SEND").setType(AssetHelper.DEFAULT_MIME_TYPE).putExtra("android.intent.extra.SUBJECT", str).putExtra("android.intent.extra.TEXT", c1811x2.toString()).setPackage(null), "Share Ad Report");
        if (!z) {
            context.startActivity(intentCreateChooser);
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse(MailTo.MAILTO_SCHEME)).putExtra("android.intent.extra.SUBJECT", str).putExtra("android.intent.extra.TEXT", c1811x2.toString()).setPackage("com.google.android.gm");
            String str2 = this.f1448a.m4847p0().getExtraParameters().get("creative_debugger_email_recipients");
            if (StringUtils.isValidString(str2)) {
                intent.putExtra("android.intent.extra.EMAIL", (Serializable) CollectionUtils.explode(str2).toArray());
            }
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            context.startActivity(intentCreateChooser);
        }
    }

    /* JADX INFO: renamed from: b */
    public String m2558b(C1705r1 c1705r1) {
        AbstractC1736b abstractC1736bM4160c = c1705r1.m4160c();
        AbstractC1482a3 abstractC1482a3M4162e = c1705r1.m4162e();
        if (abstractC1736bM4160c == null) {
            if (abstractC1482a3M4162e != null) {
                return abstractC1482a3M4162e.m1819E();
            }
            return null;
        }
        return "json_v3!" + Base64.encodeToString(abstractC1736bM4160c.getOriginalFullResponse().toString().getBytes(), 2);
    }

    @Override // com.applovin.impl.C1658n1.a
    /* JADX INFO: renamed from: b */
    public void mo2559b() {
        if (this.f1456i == 0) {
            this.f1455h = C1593j7.m3012a(TimeUnit.SECONDS.toMillis(3L), this.f1448a, new Runnable() { // from class: com.applovin.impl.f1$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m2553j();
                }
            });
        }
        int i = this.f1456i;
        if (i % 2 == 0) {
            this.f1456i = i + 1;
        }
    }

    /* JADX INFO: renamed from: d */
    public void m2560d(Object obj) {
        if (m2561g() && obj != null) {
            if (!AbstractC1821y3.m5701a(obj) || m2546c(obj)) {
                String strM2542b = m2542b(obj);
                synchronized (this.f1451d) {
                    C1705r1 c1705r1 = (C1705r1) this.f1450c.get(strM2542b);
                    if (c1705r1 != null) {
                        c1705r1.m4158a(obj);
                    } else {
                        this.f1450c.put(strM2542b, new C1705r1(obj, System.currentTimeMillis()));
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public boolean m2561g() {
        return ((Boolean) this.f1448a.m4801a(C1831z4.f3986m1)).booleanValue() && this.f1448a.m4847p0().isCreativeDebuggerEnabled();
    }

    /* JADX INFO: renamed from: k */
    public void m2562k() {
        C1658n1 c1658n1 = this.f1454g;
        if (c1658n1 != null) {
            c1658n1.m3618b();
        }
    }

    /* JADX INFO: renamed from: l */
    public void m2563l() {
        if (m2561g()) {
            this.f1457j = ((Boolean) this.f1448a.m4801a(C1831z4.f3995n1)).booleanValue();
            if (this.f1454g == null) {
                this.f1454g = new C1658n1(this.f1448a, this);
            }
            this.f1454g.m3617a();
        }
    }

    /* JADX INFO: renamed from: n */
    public void m2564n() {
        ArrayList arrayList;
        if (m2551h() || !f1447n.compareAndSet(false, true)) {
            C1768p.m5167h("AppLovinSdk", "Creative Debugger is already showing");
            return;
        }
        Object objM5142a = this.f1448a.m4773J().m5142a();
        if (objM5142a != null) {
            m2549e(objM5142a);
            return;
        }
        synchronized (this.f1451d) {
            arrayList = new ArrayList(this.f1450c.values());
        }
        Collections.reverse(arrayList);
        this.f1452e.m2455a(arrayList, this.f1448a);
        if (!this.f1459l) {
            m2554m();
            this.f1459l = true;
        }
        C1768p.m5166g("AppLovinSdk", "Starting Creative Debugger...");
        AbstractC1525d.m2245a(this.f1449b, MaxCreativeDebuggerActivity.class);
    }
}
