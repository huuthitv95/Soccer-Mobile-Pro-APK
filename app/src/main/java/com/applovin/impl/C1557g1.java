package com.applovin.impl;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabColorSchemeParams;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.browser.customtabs.CustomTabsService;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import androidx.browser.customtabs.CustomTabsSession;
import com.applovin.impl.adview.C1488a;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.applovin.impl.sdk.p025ad.AbstractC1736b;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.sdk.C1846R;
import com.facebook.internal.AnalyticsEvents;
import com.ironsource.C11744X3;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: com.applovin.impl.g1 */
/* JADX INFO: loaded from: classes3.dex */
public class C1557g1 {

    /* JADX INFO: renamed from: a */
    private final C1748l f1643a;

    /* JADX INFO: renamed from: b */
    private CustomTabsClient f1644b;

    /* JADX INFO: renamed from: com.applovin.impl.g1$a */
    class a extends CustomTabsServiceConnection {
        a() {
        }

        @Override // androidx.browser.customtabs.CustomTabsServiceConnection
        public void onCustomTabsServiceConnected(ComponentName componentName, CustomTabsClient customTabsClient) {
            C1557g1.this.f1643a.m4782Q();
            if (C1768p.m5160a()) {
                C1557g1.this.f1643a.m4782Q().m5171a("CustomTabsManager", "Connection successful: " + componentName);
            }
            C1557g1.this.f1644b = customTabsClient;
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            C1557g1.this.f1643a.m4782Q();
            if (C1768p.m5160a()) {
                C1557g1.this.f1643a.m4782Q().m5171a("CustomTabsManager", "Service disconnected: " + componentName);
            }
            C1557g1.this.f1644b = null;
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.g1$b */
    private class b extends CustomTabsCallback {

        /* JADX INFO: renamed from: a */
        private final WeakReference f1646a;

        public b(C1488a c1488a) {
            this.f1646a = new WeakReference(c1488a);
        }

        @Override // androidx.browser.customtabs.CustomTabsCallback
        public void onNavigationEvent(int i, Bundle bundle) {
            C1488a c1488a = (C1488a) this.f1646a.get();
            if (c1488a == null) {
                C1557g1.this.f1643a.m4782Q();
                if (C1768p.m5160a()) {
                    C1557g1.this.f1643a.m4782Q().m5174b("CustomTabsManager", "Unable to track navigation event (" + i + "). Controller is null.");
                }
                return;
            }
            AbstractC1736b abstractC1736bM1968g = c1488a.m1968g();
            if (abstractC1736bM1968g == null) {
                C1557g1.this.f1643a.m4782Q();
                if (C1768p.m5160a()) {
                    C1557g1.this.f1643a.m4782Q().m5174b("CustomTabsManager", "Unable to track navigation event (" + i + "). No ad specified.");
                    return;
                }
                return;
            }
            switch (i) {
                case 1:
                    if (abstractC1736bM1968g.shouldCustomTabsTrackEvents()) {
                        C1557g1.this.f1643a.m4840l().trackCustomTabsNavigationStarted(abstractC1736bM1968g);
                    }
                    break;
                case 2:
                    if (abstractC1736bM1968g.shouldCustomTabsTrackEvents()) {
                        C1557g1.this.f1643a.m4840l().trackCustomTabsNavigationFinished(abstractC1736bM1968g);
                    }
                    break;
                case 3:
                    if (abstractC1736bM1968g.shouldCustomTabsTrackEvents()) {
                        C1557g1.this.f1643a.m4840l().trackCustomTabsNavigationFailed(abstractC1736bM1968g);
                    }
                    break;
                case 4:
                    if (abstractC1736bM1968g.shouldCustomTabsTrackEvents()) {
                        C1557g1.this.f1643a.m4840l().trackCustomTabsNavigationAborted(abstractC1736bM1968g);
                    }
                    break;
                case 5:
                    if (abstractC1736bM1968g.shouldCustomTabsTrackEvents()) {
                        C1557g1.this.f1643a.m4840l().trackCustomTabsTabShown(abstractC1736bM1968g);
                    }
                    AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.custom_tabs_shown"), null);
                    AbstractC1793v2.m5433c(c1488a.m1966e(), abstractC1736bM1968g, c1488a.m1970i());
                    break;
                case 6:
                    if (abstractC1736bM1968g.shouldCustomTabsTrackEvents()) {
                        C1557g1.this.f1643a.m4840l().trackCustomTabsTabHidden(abstractC1736bM1968g);
                    }
                    AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.custom_tabs_hidden"), null);
                    AbstractC1793v2.m5365a(c1488a.m1966e(), abstractC1736bM1968g, c1488a.m1970i());
                    break;
                default:
                    C1557g1.this.f1643a.m4782Q();
                    if (C1768p.m5160a()) {
                        C1557g1.this.f1643a.m4782Q().m5171a("CustomTabsManager", "Unknown navigation event: " + i);
                    }
                    break;
            }
        }

        @Override // androidx.browser.customtabs.CustomTabsCallback
        public void onRelationshipValidationResult(int i, Uri uri, boolean z, Bundle bundle) {
            C1557g1.this.f1643a.m4782Q();
            if (C1768p.m5160a()) {
                C1768p c1768pM4782Q = C1557g1.this.f1643a.m4782Q();
                StringBuilder sb = new StringBuilder("Validation ");
                sb.append(z ? AnalyticsEvents.PARAMETER_SHARE_OUTCOME_SUCCEEDED : C11744X3.i.f26392t);
                sb.append(" for session-URL relation(");
                sb.append(i);
                sb.append("), requestedOrigin(");
                sb.append(uri);
                sb.append(")");
                c1768pM4782Q.m5171a("CustomTabsManager", sb.toString());
            }
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.g1$c */
    private class c extends CustomTabsCallback {

        /* JADX INFO: renamed from: a */
        private final WeakReference f1648a;

        public c(AppLovinNativeAdImpl appLovinNativeAdImpl) {
            this.f1648a = new WeakReference(appLovinNativeAdImpl);
        }

        @Override // androidx.browser.customtabs.CustomTabsCallback
        public void onNavigationEvent(int i, Bundle bundle) {
            AppLovinNativeAdImpl appLovinNativeAdImpl = (AppLovinNativeAdImpl) this.f1648a.get();
            if (appLovinNativeAdImpl == null) {
                C1557g1.this.f1643a.m4782Q();
                if (C1768p.m5160a()) {
                    C1557g1.this.f1643a.m4782Q().m5174b("CustomTabsManager", "Unable to track navigation event (" + i + "). Native ad is null.");
                }
                return;
            }
            switch (i) {
                case 1:
                    if (appLovinNativeAdImpl.shouldCustomTabsTrackEvents()) {
                        C1557g1.this.f1643a.m4840l().trackNativeAdCustomTabsNavigationStarted(appLovinNativeAdImpl);
                    }
                    break;
                case 2:
                    if (appLovinNativeAdImpl.shouldCustomTabsTrackEvents()) {
                        C1557g1.this.f1643a.m4840l().trackNativeAdCustomTabsNavigationFinished(appLovinNativeAdImpl);
                    }
                    break;
                case 3:
                    if (appLovinNativeAdImpl.shouldCustomTabsTrackEvents()) {
                        C1557g1.this.f1643a.m4840l().trackNativeAdCustomTabsNavigationFailed(appLovinNativeAdImpl);
                    }
                    break;
                case 4:
                    if (appLovinNativeAdImpl.shouldCustomTabsTrackEvents()) {
                        C1557g1.this.f1643a.m4840l().trackNativeAdCustomTabsNavigationAborted(appLovinNativeAdImpl);
                    }
                    break;
                case 5:
                    if (appLovinNativeAdImpl.shouldCustomTabsTrackEvents()) {
                        C1557g1.this.f1643a.m4840l().trackNativeAdCustomTabsTabShown(appLovinNativeAdImpl);
                    }
                    AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.custom_tabs_shown"), null);
                    break;
                case 6:
                    if (appLovinNativeAdImpl.shouldCustomTabsTrackEvents()) {
                        C1557g1.this.f1643a.m4840l().trackNativeAdCustomTabsTabHidden(appLovinNativeAdImpl);
                    }
                    AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.custom_tabs_hidden"), null);
                    break;
                default:
                    C1557g1.this.f1643a.m4782Q();
                    if (C1768p.m5160a()) {
                        C1557g1.this.f1643a.m4782Q().m5171a("CustomTabsManager", "Unknown navigation event: " + i);
                    }
                    break;
            }
        }

        @Override // androidx.browser.customtabs.CustomTabsCallback
        public void onRelationshipValidationResult(int i, Uri uri, boolean z, Bundle bundle) {
            C1557g1.this.f1643a.m4782Q();
            if (C1768p.m5160a()) {
                C1768p c1768pM4782Q = C1557g1.this.f1643a.m4782Q();
                StringBuilder sb = new StringBuilder("Validation ");
                sb.append(z ? AnalyticsEvents.PARAMETER_SHARE_OUTCOME_SUCCEEDED : C11744X3.i.f26392t);
                sb.append(" for session-URL relation(");
                sb.append(i);
                sb.append("), requestedOrigin(");
                sb.append(uri);
                sb.append(")");
                c1768pM4782Q.m5171a("CustomTabsManager", sb.toString());
            }
        }
    }

    public C1557g1(C1748l c1748l) {
        this.f1643a = c1748l;
    }

    /* JADX INFO: renamed from: a */
    private CustomTabsIntent m2643a(C1488a c1488a, Activity activity) {
        AbstractC1736b abstractC1736bM1968g = c1488a.m1968g();
        return m2644a(abstractC1736bM1968g != null ? abstractC1736bM1968g.getCustomTabsSettings() : null, abstractC1736bM1968g != null ? abstractC1736bM1968g.getCustomTabsHeaders() : Bundle.EMPTY, c1488a.m1969h(), activity);
    }

    /* JADX INFO: renamed from: a */
    private CustomTabsIntent m2644a(C1567h1 c1567h1, Bundle bundle, CustomTabsSession customTabsSession, Activity activity) {
        this.f1643a.m4782Q();
        if (C1768p.m5160a()) {
            this.f1643a.m4782Q().m5171a("CustomTabsManager", "Creating Custom Tabs intent");
        }
        CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder(customTabsSession);
        if (((Boolean) this.f1643a.m4801a(C1831z4.f3956i7)).booleanValue()) {
            builder.setStartAnimations(activity, C1846R.anim.applovin_slide_up_animation, C1846R.anim.applovin_slide_down_animation);
            builder.setExitAnimations(activity, C1846R.anim.applovin_slide_up_animation, C1846R.anim.applovin_slide_down_animation);
        }
        if (c1567h1 != null) {
            Integer numM2782h = c1567h1.m2782h();
            if (numM2782h != null) {
                builder.setDefaultColorSchemeParams(new CustomTabColorSchemeParams.Builder().setToolbarColor(numM2782h.intValue()).build());
            }
            Integer numM2775a = c1567h1.m2775a();
            if (numM2775a != null) {
                builder.setColorSchemeParams(2, new CustomTabColorSchemeParams.Builder().setToolbarColor(numM2775a.intValue()).build());
            }
            Boolean boolM2783i = c1567h1.m2783i();
            if (boolM2783i != null) {
                builder.setUrlBarHidingEnabled(boolM2783i.booleanValue());
            }
            Boolean boolM2781g = c1567h1.m2781g();
            if (boolM2781g != null) {
                builder.setShowTitle(boolM2781g.booleanValue());
            }
            Boolean boolM2777c = c1567h1.m2777c();
            if (boolM2777c != null) {
                builder.setInstantAppsEnabled(boolM2777c.booleanValue());
            }
            Integer numM2780f = c1567h1.m2780f();
            if (numM2780f != null) {
                builder.setShareState(numM2780f.intValue());
            }
        }
        CustomTabsIntent customTabsIntentBuild = builder.build();
        if (c1567h1 != null) {
            String strM2778d = c1567h1.m2778d();
            if (strM2778d != null) {
                customTabsIntentBuild.intent.putExtra("android.intent.extra.REFERRER", Uri.parse(strM2778d));
            }
            if (!bundle.isEmpty()) {
                customTabsIntentBuild.intent.putExtra("com.android.browser.headers", bundle);
            }
        }
        return customTabsIntentBuild;
    }

    /* JADX INFO: renamed from: a */
    private CustomTabsIntent m2645a(AppLovinNativeAdImpl appLovinNativeAdImpl, Activity activity) {
        return m2644a(appLovinNativeAdImpl.getCustomTabsSettings(), appLovinNativeAdImpl.getCustomTabsHeaders(), appLovinNativeAdImpl.getCustomTabsSession(), activity);
    }

    /* JADX INFO: renamed from: a */
    private void m2647a(Uri uri, Activity activity) {
        if (((Boolean) this.f1643a.m4801a(C1831z4.f3965j7)).booleanValue()) {
            AbstractC1664n7.m3685a(uri, activity, this.f1643a);
        }
        AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.custom_tabs_failure"), CollectionUtils.map("url", uri));
    }

    /* JADX INFO: renamed from: a */
    private void m2648a(CustomTabsSession customTabsSession, AbstractC1736b abstractC1736b) {
        if (abstractC1736b == null || !abstractC1736b.isCustomTabsClientWarmupEnabled()) {
            return;
        }
        m2651a(abstractC1736b.getCustomTabsSettings(), customTabsSession);
    }

    /* JADX INFO: renamed from: a */
    private void m2649a(CustomTabsSession customTabsSession, AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (appLovinNativeAdImpl == null || !appLovinNativeAdImpl.isCustomTabsClientWarmupEnabled()) {
            return;
        }
        m2651a(appLovinNativeAdImpl.getCustomTabsSettings(), customTabsSession);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m2650a(C1488a c1488a, Activity activity, Uri uri) {
        m2643a(c1488a, activity).launchUrl(activity, uri);
    }

    /* JADX INFO: renamed from: a */
    private void m2651a(final C1567h1 c1567h1, final CustomTabsSession customTabsSession) {
        m2655a("client warmup", new Runnable() { // from class: com.applovin.impl.g1$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m2656b(c1567h1, customTabsSession);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m2652a(AppLovinNativeAdImpl appLovinNativeAdImpl, Activity activity, Uri uri) {
        m2645a(appLovinNativeAdImpl, activity).launchUrl(activity, uri);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006e A[DONT_GENERATE] */
    /* JADX INFO: renamed from: a */
    private void m2653a(LinkedList linkedList) {
        boolean zBindCustomTabsService = false;
        try {
            zBindCustomTabsService = CustomTabsClient.bindCustomTabsService(C1748l.m4756p(), (String) linkedList.poll(), new a());
            if (!zBindCustomTabsService) {
                this.f1643a.m4782Q();
                if (C1768p.m5160a()) {
                    this.f1643a.m4782Q().m5174b("CustomTabsManager", "Custom Tabs service not available");
                }
            }
            if (zBindCustomTabsService || linkedList.isEmpty()) {
                return;
            }
            this.f1643a.m4782Q();
            if (C1768p.m5160a()) {
            }
        } catch (Throwable th) {
            try {
                this.f1643a.m4782Q();
                if (C1768p.m5160a()) {
                    this.f1643a.m4782Q().m5172a("CustomTabsManager", "Failed to bind to service", th);
                }
            } finally {
                if (!zBindCustomTabsService && !linkedList.isEmpty()) {
                    this.f1643a.m4782Q();
                    if (C1768p.m5160a()) {
                        this.f1643a.m4782Q().m5171a("CustomTabsManager", "Retrying with next package name...");
                    }
                    m2653a(linkedList);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m2654a(List list, CustomTabsSession customTabsSession) {
        this.f1643a.m4782Q();
        if (C1768p.m5160a()) {
            this.f1643a.m4782Q().m5171a("CustomTabsManager", "Warming up URLs: " + list);
        }
        String str = (String) list.remove(0);
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            Bundle bundle = new Bundle();
            bundle.putParcelable(CustomTabsService.KEY_URL, Uri.parse(str2));
            arrayList.add(bundle);
        }
        boolean zMayLaunchUrl = customTabsSession.mayLaunchUrl(Uri.parse(str), null, arrayList);
        this.f1643a.m4782Q();
        if (C1768p.m5160a()) {
            this.f1643a.m4782Q().m5171a("CustomTabsManager", "Warmup for URLs ".concat(zMayLaunchUrl ? AnalyticsEvents.PARAMETER_SHARE_OUTCOME_SUCCEEDED : C11744X3.i.f26392t));
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m2655a(String str, Runnable runnable) {
        try {
            this.f1643a.m4782Q();
            if (C1768p.m5160a()) {
                this.f1643a.m4782Q().m5171a("CustomTabsManager", "Running operation: " + str);
            }
            runnable.run();
            this.f1643a.m4782Q();
            if (!C1768p.m5160a()) {
                return true;
            }
            this.f1643a.m4782Q().m5171a("CustomTabsManager", "Finished operation: " + str);
            return true;
        } catch (Throwable th) {
            this.f1643a.m4782Q();
            if (C1768p.m5160a()) {
                this.f1643a.m4782Q().m5172a("CustomTabsManager", "Failed to run operation: " + str, th);
            }
            this.f1643a.m4764E().m4329a("CustomTabsManager", str, th);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public /* synthetic */ void m2656b(C1567h1 c1567h1, CustomTabsSession customTabsSession) {
        this.f1644b.warmup(0L);
        if (c1567h1 == null) {
            return;
        }
        Integer numM2779e = c1567h1.m2779e();
        String strM2776b = c1567h1.m2776b();
        if (numM2779e == null || TextUtils.isEmpty(strM2776b)) {
            return;
        }
        if (customTabsSession == null) {
            this.f1643a.m4782Q();
            if (C1768p.m5160a()) {
                this.f1643a.m4782Q().m5174b("CustomTabsManager", "Cannot validate session-URL relation because the session is null");
                return;
            }
            return;
        }
        this.f1643a.m4782Q();
        if (C1768p.m5160a()) {
            this.f1643a.m4782Q().m5171a("CustomTabsManager", "Validating session-URL relation: " + numM2779e + " with digital asset link: " + strM2776b);
        }
        customTabsSession.validateRelationship(numM2779e.intValue(), Uri.parse(strM2776b), null);
    }

    /* JADX INFO: renamed from: a */
    public CustomTabsSession m2657a(C1488a c1488a) {
        if (this.f1644b == null) {
            this.f1643a.m4782Q();
            if (C1768p.m5160a()) {
                this.f1643a.m4782Q().m5171a("CustomTabsManager", "Custom Tabs service is not connected, cannot start session");
            }
            return null;
        }
        this.f1643a.m4782Q();
        if (C1768p.m5160a()) {
            this.f1643a.m4782Q().m5171a("CustomTabsManager", "Starting Custom Tabs session");
        }
        try {
            CustomTabsSession customTabsSessionNewSession = this.f1644b.newSession(new b(c1488a));
            m2648a(customTabsSessionNewSession, c1488a.m1968g());
            return customTabsSessionNewSession;
        } catch (Exception e) {
            this.f1643a.m4782Q();
            if (C1768p.m5160a()) {
                this.f1643a.m4782Q().m5172a("CustomTabsManager", "Failed to create Custom Tabs session", e);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public CustomTabsSession m2658a(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (this.f1644b == null) {
            this.f1643a.m4782Q();
            if (C1768p.m5160a()) {
                this.f1643a.m4782Q().m5171a("CustomTabsManager", "Custom Tabs service is not connected, cannot start session");
            }
            return null;
        }
        this.f1643a.m4782Q();
        if (C1768p.m5160a()) {
            this.f1643a.m4782Q().m5171a("CustomTabsManager", "Starting Custom Tabs session");
        }
        try {
            CustomTabsSession customTabsSessionNewSession = this.f1644b.newSession(new c(appLovinNativeAdImpl));
            m2649a(customTabsSessionNewSession, appLovinNativeAdImpl);
            return customTabsSessionNewSession;
        } catch (Exception e) {
            this.f1643a.m4782Q();
            if (C1768p.m5160a()) {
                this.f1643a.m4782Q().m5172a("CustomTabsManager", "Failed to create Custom Tabs session", e);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m2659a() {
        if (((Boolean) this.f1643a.m4801a(C1831z4.f3929f7)).booleanValue() && this.f1644b == null) {
            String packageName = CustomTabsClient.getPackageName(C1748l.m4756p(), this.f1643a.m4821c(C1831z4.f3938g7), true);
            String packageName2 = CustomTabsClient.getPackageName(C1748l.m4756p(), null);
            LinkedList linkedList = new LinkedList();
            if (((Boolean) this.f1643a.m4801a(C1831z4.f3947h7)).booleanValue()) {
                CollectionUtils.addUniqueObjectIfExists(packageName2, linkedList);
                CollectionUtils.addUniqueObjectIfExists(packageName, linkedList);
            } else {
                CollectionUtils.addUniqueObjectIfExists(packageName, linkedList);
                CollectionUtils.addUniqueObjectIfExists(packageName2, linkedList);
            }
            if (!linkedList.isEmpty()) {
                m2653a(linkedList);
                return;
            }
            this.f1643a.m4782Q();
            if (C1768p.m5160a()) {
                this.f1643a.m4782Q().m5174b("CustomTabsManager", "Unable to find a supported Custom Tabs package name");
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m2660a(final Uri uri, final C1488a c1488a, final Activity activity) {
        if (c1488a.m1969h() == null) {
            this.f1643a.m4782Q();
            if (C1768p.m5160a()) {
                this.f1643a.m4782Q().m5174b("CustomTabsManager", "Unable to launch URL in Custom Tabs. No Custom Tabs session found.");
            }
            m2647a(uri, activity);
            return;
        }
        if (m2655a("launch uri", new Runnable() { // from class: com.applovin.impl.g1$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m2650a(c1488a, activity, uri);
            }
        })) {
            this.f1643a.m4846o0().pauseForClick();
            return;
        }
        this.f1643a.m4782Q();
        if (C1768p.m5160a()) {
            this.f1643a.m4782Q().m5174b("CustomTabsManager", "Opening in Custom Tabs failed: " + uri);
        }
        m2647a(uri, activity);
    }

    /* JADX INFO: renamed from: a */
    public boolean m2661a(final Uri uri, final AppLovinNativeAdImpl appLovinNativeAdImpl, final Activity activity) {
        if (appLovinNativeAdImpl.getCustomTabsSession() == null) {
            this.f1643a.m4782Q();
            if (C1768p.m5160a()) {
                this.f1643a.m4782Q().m5174b("CustomTabsManager", "Unable to launch URL in Custom Tabs. No Custom Tabs session found.");
            }
            m2647a(uri, activity);
            return false;
        }
        boolean zM2655a = m2655a("launch uri", new Runnable() { // from class: com.applovin.impl.g1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m2652a(appLovinNativeAdImpl, activity, uri);
            }
        });
        if (zM2655a) {
            this.f1643a.m4846o0().pauseForClick();
            return zM2655a;
        }
        this.f1643a.m4782Q();
        if (C1768p.m5160a()) {
            this.f1643a.m4782Q().m5174b("CustomTabsManager", "Opening in Custom Tabs failed: " + uri);
        }
        m2647a(uri, activity);
        return zM2655a;
    }

    /* JADX INFO: renamed from: b */
    public void m2662b(final List list, final CustomTabsSession customTabsSession) {
        if (list.isEmpty()) {
            return;
        }
        if (customTabsSession != null) {
            m2655a("warmup urls", new Runnable() { // from class: com.applovin.impl.g1$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m2654a(list, customTabsSession);
                }
            });
            return;
        }
        this.f1643a.m4782Q();
        if (C1768p.m5160a()) {
            this.f1643a.m4782Q().m5171a("CustomTabsManager", "Custom Tabs session is null, cannot warmup urls");
        }
    }
}
