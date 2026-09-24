package com.applovin.impl;

import android.app.Activity;
import androidx.exifinterface.media.ExifInterface;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.facebook.internal.AnalyticsEvents;
import com.ironsource.C11540L6;
import com.ironsource.C11744X3;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.applovin.impl.e6 */
/* JADX INFO: loaded from: classes3.dex */
public class C1542e6 extends AbstractRunnableC1601k5 {

    /* JADX INFO: renamed from: g */
    private final C1748l f1431g;

    public C1542e6(C1748l c1748l) {
        super("TaskInitializeSdk", c1748l, true);
        this.f1431g = c1748l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m2504a(boolean z, C1706r2 c1706r2, Exception exc) {
        if (exc != null) {
            this.f1431g.m4764E().m4333a("license_validation", exc);
        }
        this.f1431g.m4853s0().m2603a(new C1797v6(this.f1431g, c1706r2, exc));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public /* synthetic */ void m2505e() {
        this.f1431g.m4789U().m3508a(this.f1431g.m4826e().m2145b());
    }

    /* JADX INFO: renamed from: f */
    private void m2506f() {
        if (this.f1431g.m4789U().m3513c()) {
            return;
        }
        Activity activityM4861w0 = this.f1431g.m4861w0();
        if (activityM4861w0 != null) {
            this.f1431g.m4789U().m3508a(activityM4861w0);
            return;
        }
        this.f1431g.m4764E().m2677a(C1548f2.f1485K0, this.f1970b + ":maybeInitializeAdapters()");
        this.f1431g.m4853s0().m2605a(new C1788u6(this.f1431g, true, "initializeAdapters", new Runnable() { // from class: com.applovin.impl.e6$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m2505e();
            }
        }), C1552f6.b.CORE, TimeUnit.SECONDS.toMillis(1L));
    }

    /* JADX INFO: renamed from: g */
    private void m2507g() {
        String str;
        String str2;
        boolean zM1880c = this.f1431g.m4849q0().m1880c();
        Map mapM4947p = this.f1431g.m4759B().m4947p();
        Map mapM4937M = this.f1431g.m4759B().m4937M();
        String strM5323a = zM1880c ? this.f1431g.m4759B().m4945f().m5323a() : "<Enable verbose logging to see the GAID to use for test devices - https://monetization-support.applovin.com/hc/en-us/articles/236114328-How-can-I-expose-verbose-logging-for-the-SDK>";
        if (zM1880c) {
            str = mapM4947p.get("idfv") + " (use this for test devices)";
        } else {
            str = "<Enable verbose logging to see the App Set ID to use for test devices - https://monetization-support.applovin.com/hc/en-us/articles/236114328-How-can-I-expose-verbose-logging-for-the-SDK>";
        }
        C1811x2 c1811x2 = new C1811x2();
        c1811x2.m5564a().m5570a("=====AppLovin SDK=====");
        c1811x2.m5570a("===SDK Versions===").m5571a("Version", AppLovinSdk.VERSION).m5571a("Plugin Version", this.f1431g.m4801a(C1831z4.f3794P3)).m5571a("Ad Review Version", C1585j.m2942b()).m5571a("OM SDK Version", this.f1431g.m4831g0().m3129c());
        c1811x2.m5570a("===Device Info===").m5571a("OS", AbstractC1701q7.m4096d()).m5571a(IronSourceConstants.TYPE_GAID, strM5323a).m5571a("App Set ID", str).m5571a(ExifInterface.TAG_MODEL, mapM4947p.get(C11540L6.f24899B)).m5571a("Locale", mapM4947p.get("locale")).m5571a("Emulator", mapM4947p.get("sim")).m5571a("Tablet", mapM4947p.get("is_tablet"));
        c1811x2.m5570a("===App Info===").m5571a("Application ID", mapM4937M.get("package_name")).m5571a("Target SDK", mapM4937M.get("target_sdk"));
        c1811x2.m5570a("===SDK Settings===").m5571a("SDK Key", this.f1431g.m4839k0()).m5571a("Mediation Provider", this.f1431g.m4794X()).m5571a("TG", C1684p7.m3889a(this.f1431g)).m5571a("MD", this.f1431g.m4801a(C1831z4.f4042t)).m5571a("Test Mode On", Boolean.valueOf(this.f1431g.m4857u0().m2928c())).m5571a("Verbose Logging On", Boolean.valueOf(zM1880c));
        c1811x2.m5570a("===Privacy States===\nPlease review AppLovin MAX documentation to be compliant with regional privacy policies.").m5570a(AbstractC1694q0.m3949a(m3080a()));
        c1811x2.m5570a("===MAX Terms and Privcay Policy Flow===");
        C1791v0 c1791v0M4864y = this.f1431g.m4864y();
        boolean zM5350j = c1791v0M4864y.m5350j();
        c1811x2.m5571a("Enabled", Boolean.valueOf(zM5350j));
        if (zM5350j) {
            AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography = this.f1431g.m4860w().getConsentFlowUserGeography();
            AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeographyM5344d = c1791v0M4864y.m5344d();
            AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography2 = AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR;
            String str3 = "Other";
            if (consentFlowUserGeography == consentFlowUserGeography2) {
                str2 = "GDPR";
            } else {
                str2 = consentFlowUserGeography == AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER ? "Other" : AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
            }
            c1811x2.m5571a("Consent Flow Geography", str2);
            if (AbstractC1701q7.m4092c(this.f1431g)) {
                if (consentFlowUserGeographyM5344d == consentFlowUserGeography2) {
                    str3 = "GDPR";
                } else if (consentFlowUserGeography != AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER) {
                    str3 = "None";
                }
                c1811x2.m5571a("Debug User Geography", str3);
            }
        }
        c1811x2.m5571a("Privacy Policy URI", c1791v0M4864y.m5346f()).m5571a("Terms of Service URI", c1791v0M4864y.m5348h());
        c1811x2.m5570a("===CMP (CONSENT MANAGEMENT PLATFORM)===").m5570a(this.f1431g.m4855t0().m2233i());
        c1811x2.m5564a();
        C1768p.m5166g("AppLovinSdk", c1811x2.toString());
    }

    /* JADX INFO: renamed from: h */
    private void m2508h() {
        Long l = (Long) this.f1431g.m4801a(C1831z4.f4082y);
        if (l.longValue() < 0) {
            return;
        }
        Boolean bool = (Boolean) C1521c5.m2201a(C1511b5.f1169i, Boolean.FALSE, C1748l.m4756p());
        Boolean bool2 = (Boolean) this.f1431g.m4801a(C1831z4.f4090z);
        if (!bool.booleanValue() || bool2.booleanValue()) {
            this.f1431g.m4781P().m3962a(l.longValue()).m5300a(this.f1431g.m4853s0().m2600a("lv_task"), new C1786u4.b() { // from class: com.applovin.impl.e6$$ExternalSyntheticLambda1
                @Override // com.applovin.impl.C1786u4.b
                /* JADX INFO: renamed from: a */
                public final void mo2509a(boolean z, Object obj, Object obj2) {
                    this.f$0.m2504a(z, (C1706r2) obj, (Exception) obj2);
                }
            });
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        C1768p c1768p;
        String str;
        StringBuilder sb;
        String str2 = AnalyticsEvents.PARAMETER_SHARE_OUTCOME_SUCCEEDED;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (C1768p.m5160a()) {
            this.f1971c.m5171a(this.f1970b, "Initializing AppLovin SDK v" + AppLovinSdk.VERSION + "...");
        }
        try {
            this.f1431g.m4771I().m4980b(m3080a());
            this.f1431g.m4771I().m4985e(m3080a());
            this.f1431g.m4853s0().m2604a((AbstractRunnableC1601k5) new C1611l5(this.f1431g), C1552f6.b.OTHER);
            this.f1431g.m4759B().m4943a0();
            this.f1431g.m4845n0().m5713c();
            this.f1431g.m4866z().m2563l();
            if (AbstractC1701q7.m4092c(this.f1431g)) {
                this.f1431g.m4803a();
            }
            this.f1431g.m4798Z0();
            m2507g();
            m2506f();
            this.f1431g.m4811a(true);
            m2508h();
            this.f1431g.m4833h0().m5071b();
            this.f1431g.m4840l().maybeFireAppKilledWhilePlayingAdPostback();
            if (((Boolean) this.f1431g.m4801a(C1831z4.f3705E2)).booleanValue()) {
                this.f1431g.m4797Z().maybeFireAppKilledWhilePlayingMediatedAdPostback();
            }
            this.f1431g.m4768G().maybeTrackAppOpenEvent();
            this.f1431g.m4757A().m2659a();
            if (((Boolean) this.f1431g.m4801a(C1831z4.f3809R2)).booleanValue()) {
                this.f1431g.m4867z0().m3706b();
            }
            if (((Boolean) this.f1431g.m4801a(C1831z4.f3871Z0)).booleanValue()) {
                this.f1431g.m4834i().m4635b();
            } else {
                this.f1431g.m4834i().m4637g();
            }
            if (this.f1431g.m4792W().m4196g() || (((Boolean) this.f1431g.m4801a(AbstractC1776t3.f3375w7)).booleanValue() && AbstractC1701q7.m4092c(this.f1431g) && this.f1431g.m4772I0())) {
                this.f1431g.m4792W().m4195e();
            }
            this.f1431g.m4831g0().m3132i();
            if (C1768p.m5160a()) {
                c1768p = this.f1971c;
                str = this.f1970b;
                sb = new StringBuilder();
                sb.append("AppLovin SDK ");
                sb.append(AppLovinSdk.VERSION);
                sb.append(" initialization ");
                if (!this.f1431g.m4763D0()) {
                    str2 = C11744X3.i.f26392t;
                }
                sb.append(str2);
                sb.append(" in ");
                sb.append(System.currentTimeMillis() - jCurrentTimeMillis);
                sb.append("ms");
                c1768p.m5171a(str, sb.toString());
            }
        } catch (Throwable th) {
            try {
                C1768p.m5164c("AppLovinSdk", "Failed to initialize SDK!", th);
                this.f1431g.m4811a(false);
                m3082a(th);
                if (((Boolean) this.f1431g.m4801a(C1831z4.f3948i)).booleanValue()) {
                    this.f1431g.m4833h0().m5068a();
                }
                if (((Boolean) this.f1431g.m4801a(C1831z4.f3939h)).booleanValue()) {
                    this.f1431g.m4791V0();
                }
                this.f1431g.m4831g0().m3132i();
                if (!C1768p.m5160a()) {
                    return;
                }
                c1768p = this.f1971c;
                str = this.f1970b;
                sb = new StringBuilder();
                sb.append("AppLovin SDK ");
                sb.append(AppLovinSdk.VERSION);
                sb.append(" initialization ");
                if (!this.f1431g.m4763D0()) {
                }
            } catch (Throwable th2) {
                this.f1431g.m4831g0().m3132i();
                if (C1768p.m5160a()) {
                    C1768p c1768p2 = this.f1971c;
                    String str3 = this.f1970b;
                    StringBuilder sb2 = new StringBuilder("AppLovin SDK ");
                    sb2.append(AppLovinSdk.VERSION);
                    sb2.append(" initialization ");
                    if (!this.f1431g.m4763D0()) {
                        str2 = C11744X3.i.f26392t;
                    }
                    sb2.append(str2);
                    sb2.append(" in ");
                    sb2.append(System.currentTimeMillis() - jCurrentTimeMillis);
                    sb2.append("ms");
                    c1768p2.m5171a(str3, sb2.toString());
                }
                throw th2;
            }
        }
    }
}
