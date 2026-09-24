package com.applovin.impl;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.C1846R;
import com.facebook.internal.AnalyticsEvents;
import com.ironsource.C11794a2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.UByte$$ExternalSyntheticBackport0;

/* JADX INFO: renamed from: com.applovin.impl.q3 */
/* JADX INFO: loaded from: classes3.dex */
public class C1697q3 extends AbstractViewOnClickListenerC1784u2 implements AppLovinCommunicatorSubscriber, C1506b0.a {

    /* JADX INFO: renamed from: A */
    private List f2603A;

    /* JADX INFO: renamed from: B */
    private List f2604B;

    /* JADX INFO: renamed from: C */
    private List f2605C;

    /* JADX INFO: renamed from: D */
    private List f2606D;

    /* JADX INFO: renamed from: e */
    private C1748l f2607e;

    /* JADX INFO: renamed from: f */
    private List f2608f;

    /* JADX INFO: renamed from: g */
    private List f2609g;

    /* JADX INFO: renamed from: h */
    private List f2610h;

    /* JADX INFO: renamed from: i */
    private List f2611i;

    /* JADX INFO: renamed from: j */
    private String f2612j;

    /* JADX INFO: renamed from: k */
    private String f2613k;

    /* JADX INFO: renamed from: l */
    private String f2614l;

    /* JADX INFO: renamed from: m */
    private boolean f2615m;

    /* JADX INFO: renamed from: n */
    private final StringBuilder f2616n;

    /* JADX INFO: renamed from: o */
    private final AtomicBoolean f2617o;

    /* JADX INFO: renamed from: p */
    private boolean f2618p;

    /* JADX INFO: renamed from: q */
    private List f2619q;

    /* JADX INFO: renamed from: r */
    private List f2620r;

    /* JADX INFO: renamed from: s */
    private List f2621s;

    /* JADX INFO: renamed from: t */
    private List f2622t;

    /* JADX INFO: renamed from: u */
    private List f2623u;

    /* JADX INFO: renamed from: v */
    private List f2624v;

    /* JADX INFO: renamed from: w */
    private List f2625w;

    /* JADX INFO: renamed from: x */
    private List f2626x;

    /* JADX INFO: renamed from: y */
    private List f2627y;

    /* JADX INFO: renamed from: z */
    private List f2628z;

    /* JADX INFO: renamed from: com.applovin.impl.q3$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f2629a;

        static {
            int[] iArr = new int[C1506b0.b.values().length];
            f2629a = iArr;
            try {
                iArr[C1506b0.b.APP_DETAILS_NOT_FOUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2629a[C1506b0.b.INVALID_DEVELOPER_URI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2629a[C1506b0.b.APPADSTXT_NOT_FOUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2629a[C1506b0.b.MISSING_APPLOVIN_ENTRIES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2629a[C1506b0.b.MISSING_NON_APPLOVIN_ENTRIES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.q3$b */
    public enum b {
        AD_UNITS,
        SELECT_LIVE_NETWORKS,
        SELECT_TEST_MODE_NETWORKS,
        INITIALIZATION_AD_UNITS,
        COUNT
    }

    /* JADX INFO: renamed from: com.applovin.impl.q3$c */
    private enum c {
        SUCCESS,
        WARNING,
        ERROR
    }

    /* JADX INFO: renamed from: com.applovin.impl.q3$d */
    public enum d {
        CMP,
        NETWORK_CONSENT_STATUSES,
        DO_NOT_SELL,
        COUNT
    }

    /* JADX INFO: renamed from: com.applovin.impl.q3$e */
    public enum e {
        APP_INFO,
        MAX,
        PRIVACY,
        ADS,
        EVENTS,
        INCOMPLETE_NETWORKS,
        COMPLETED_NETWORKS,
        MISSING_NETWORKS,
        COUNT
    }

    public C1697q3(Context context) {
        super(context);
        this.f2616n = new StringBuilder("");
        this.f2617o = new AtomicBoolean();
        this.f2619q = new ArrayList();
        this.f2620r = new ArrayList();
        this.f2621s = new ArrayList();
        this.f2622t = new ArrayList();
        this.f2623u = new ArrayList();
        this.f2624v = new ArrayList();
        this.f2625w = new ArrayList();
        this.f2626x = new ArrayList();
        this.f2627y = new ArrayList();
        this.f2628z = new ArrayList();
        this.f2603A = new ArrayList();
        this.f2604B = new ArrayList();
        this.f2605C = new ArrayList();
        this.f2606D = new ArrayList();
    }

    /* JADX INFO: renamed from: A */
    private void m3964A() {
        StringBuilder sb = new StringBuilder("\n========== MEDIATION DEBUGGER ==========");
        sb.append("\n========== APP INFO ==========");
        sb.append("\nDev Build - " + AbstractC1701q7.m4092c(this.f2607e));
        sb.append("\nTest Mode - ".concat(this.f2607e.m4857u0().m2928c() ? "enabled" : C11794a2.f26724e));
        sb.append("\nTarget SDK - " + this.f2607e.m4759B().m4933G().get("target_sdk"));
        sb.append("\n========== MAX ==========");
        String str = AppLovinSdk.VERSION;
        String str2 = (String) this.f2607e.m4801a(C1831z4.f3794P3);
        String strM2942b = C1585j.m2942b();
        sb.append("\nSDK Version - " + str);
        StringBuilder sb2 = new StringBuilder("\nPlugin Version - ");
        if (!StringUtils.isValidString(str2)) {
            str2 = "None";
        }
        sb2.append(str2);
        sb.append(sb2.toString());
        StringBuilder sb3 = new StringBuilder("\nAd Review Version - ");
        if (!StringUtils.isValidString(strM2942b)) {
            strM2942b = "Disabled";
        }
        sb3.append(strM2942b);
        sb.append(sb3.toString());
        if (this.f2607e.m4774J0()) {
            String strM4032a = AbstractC1701q7.m4032a(this.f2607e.m4847p0());
            StringBuilder sb4 = new StringBuilder("\nUnity Version - ");
            sb4.append(StringUtils.isValidString(strM4032a) ? strM4032a : "None");
            sb.append(sb4.toString());
        }
        sb.append("\n========== PRIVACY ==========");
        sb.append(AbstractC1694q0.m3949a(this.f3399a));
        sb.append(this.f2607e.m4864y().m5345e());
        sb.append("\n========== CMP (CONSENT MANAGEMENT PLATFORM) ==========");
        sb.append(this.f2607e.m4855t0().m2233i());
        sb.append("\n========== NETWORK CONSENT STATUSES ==========");
        Iterator it = m3993d().iterator();
        while (it.hasNext()) {
            sb.append(((C1533d7) it.next()).m2424e());
        }
        sb.append("\n========== NETWORKS ==========");
        Iterator it2 = this.f2620r.iterator();
        while (it2.hasNext()) {
            m3973a(sb, ((C1559g3) it2.next()).m2707j());
        }
        Iterator it3 = this.f2619q.iterator();
        while (it3.hasNext()) {
            m3973a(sb, ((C1559g3) it3.next()).m2707j());
        }
        sb.append("\n========== AD UNITS ==========");
        Iterator it4 = this.f2609g.iterator();
        while (it4.hasNext()) {
            m3973a(sb, ((C1656n) it4.next()).m3611e());
        }
        sb.append("\n========== END ==========");
        C1768p.m5166g("MediationDebuggerListAdapter", sb.toString());
        this.f2616n.append(sb.toString());
    }

    /* JADX INFO: renamed from: a */
    private c m3965a(C1506b0.b bVar) {
        int i = a.f2629a[bVar.ordinal()];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            return c.ERROR;
        }
        return i != 5 ? c.ERROR : c.WARNING;
    }

    /* JADX INFO: renamed from: a */
    private C1775t2 m3966a(String str) {
        C1775t2.b bVarM5210a = C1775t2.m5210a();
        if (!this.f2607e.m4857u0().m2928c()) {
            bVarM5210a.m5222a(this.f3399a);
        }
        C1775t2.b bVarM5234d = bVarM5210a.m5234d((StringUtils.isValidString(str) ? "" : "Select ").concat("Live Network"));
        if (this.f2607e.m4857u0().m2928c()) {
            str = "Enable";
        }
        return bVarM5234d.m5232c(str).m5231c(-16776961).m5224a("Ad loads are not supported while Test Mode is enabled. Please restart the app and make sure your GAID has not been enabled for test mode and that you are not on an emulator.").m5225a(true).m5226a();
    }

    /* JADX INFO: renamed from: a */
    private C1775t2 m3967a(String str, c cVar) {
        int i;
        int color;
        if (cVar == c.SUCCESS) {
            i = C1846R.drawable.applovin_ic_check_mark_bordered;
            color = this.f3399a.getColor(C1846R.color.applovin_sdk_checkmarkColor);
        } else if (cVar == c.WARNING) {
            i = C1846R.drawable.applovin_ic_warning;
            color = this.f3399a.getColor(C1846R.color.applovin_sdk_warningColor);
        } else {
            i = C1846R.drawable.applovin_ic_x_mark;
            color = this.f3399a.getColor(C1846R.color.applovin_sdk_xmarkColor);
        }
        return C1775t2.m5210a().m5234d("app-ads.txt").m5221a(i).m5227b(color).m5229b("app-ads.txt").m5224a(str).m5225a(true).m5226a();
    }

    /* JADX INFO: renamed from: a */
    private C1775t2 m3968a(boolean z) {
        return C1775t2.m5210a().m5234d("Java 8").m5221a(z ? C1846R.drawable.applovin_ic_check_mark_bordered : C1846R.drawable.applovin_ic_x_mark).m5227b(this.f3399a.getColor(z ? C1846R.color.applovin_sdk_checkmarkColor : C1846R.color.applovin_sdk_xmarkColor)).m5229b("Upgrade to Java 8").m5224a("For optimal performance, please enable Java 8 support. This will be required in a future SDK release. See: https://support.axon.ai/en/max/android/overview/integration").m5225a(!z).m5226a();
    }

    /* JADX INFO: renamed from: a */
    private String m3969a(C1506b0.b bVar, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            str = "app-ads.txt URL";
        }
        int i = a.f2629a[bVar.ordinal()];
        if (i == 1) {
            return "Could not retrieve app details from the Play Store for this package name. Check back once this app has been published on the Play Store.";
        }
        if (i == 2) {
            return "Unable to find a valid developer URL from the Play Store listing.";
        }
        if (i == 3) {
            return "Unable to find app-ads.txt file or parse entries of the file at " + str + ".\n\nFor more information, please visit Account -> App-Ads.txt Info at:\nhttps://dash.applovin.com/o/account?r=2#app_ads_txt";
        }
        if (i != 4) {
            if (i != 5) {
                return "";
            }
            return "Text file at " + str + " is missing some of the suggested lines.\n\nFor more information, please visit Account -> App-Ads.txt Info at:\nhttps://dash.applovin.com/o/account?r=2#app_ads_txt";
        }
        return "Text file at " + str + " is missing the required AppLovin line:\n\n" + str2 + "\n\nFor more information, please visit Account -> App-Ads.txt Info at:\nhttps://dash.applovin.com/o/account?r=2#app_ads_txt";
    }

    /* JADX INFO: renamed from: a */
    private String m3970a(List list, boolean z) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (z) {
            for (C1802w2 c1802w2 : this.f2622t) {
                if (list.equals(c1802w2.m5505b())) {
                    return c1802w2.m5504a();
                }
            }
            for (C1802w2 c1802w3 : this.f2623u) {
                if (list.equals(c1802w3.m5505b())) {
                    return c1802w3.m5504a();
                }
            }
        } else {
            for (C1559g3 c1559g3 : this.f2624v) {
                if (list.equals(c1559g3.m2718u())) {
                    return c1559g3.m2704g();
                }
            }
        }
        return UByte$$ExternalSyntheticBackport0.m43493m((CharSequence) ",", (Iterable) list);
    }

    /* JADX INFO: renamed from: a */
    private List m3971a(String str, String str2) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(C1775t2.m5210a().m5234d("View Ad Units (" + this.f2609g.size() + ")").m5222a(this.f3399a).m5225a(true).m5226a());
        arrayList.add(m3966a(str));
        arrayList.add(m3974b(str2));
        if (!this.f2610h.isEmpty()) {
            arrayList.add(C1775t2.m5210a().m5234d("Selective Init Ad Units (" + this.f2610h.size() + ")").m5222a(this.f3399a).m5225a(true).m5226a());
        }
        arrayList.add(C1775t2.m5210a().m5234d("Test Mode Enabled").m5232c(String.valueOf(this.f2607e.m4857u0().m2928c())).m5226a());
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    private List m3972a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C1510b4((C1559g3) it.next(), this.f3399a));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    private void m3973a(StringBuilder sb, String str) {
        String string = sb.toString();
        if (string.length() + str.length() >= ((Integer) this.f2607e.m4801a(C1831z4.f4026r)).intValue()) {
            C1768p.m5166g("MediationDebuggerListAdapter", string);
            this.f2616n.append(string);
            sb.setLength(1);
        }
        sb.append(str);
    }

    /* JADX INFO: renamed from: b */
    private C1775t2 m3974b(String str) {
        C1775t2.b bVarM5210a = C1775t2.m5210a();
        if (this.f2607e.m4857u0().m2928c()) {
            bVarM5210a.m5222a(this.f3399a);
        }
        C1775t2.b bVarM5234d = bVarM5210a.m5234d((StringUtils.isValidString(str) ? "" : "Select ").concat("Test Mode Network"));
        if (!this.f2607e.m4857u0().m2928c()) {
            str = "Enable";
        }
        return bVarM5234d.m5232c(str).m5231c(-16776961).m5224a("Please re-launch the app to enable test mode. This will allow the selection of test mode networks.").m5225a(true).m5226a();
    }

    /* JADX INFO: renamed from: b */
    private C1775t2 m3975b(String str, String str2) {
        C1775t2.b bVarM5234d = C1775t2.m5210a().m5234d(str);
        if (StringUtils.isValidString(str2)) {
            bVarM5234d.m5232c(str2);
        } else {
            bVarM5234d.m5221a(C1846R.drawable.applovin_ic_x_mark);
            bVarM5234d.m5227b(this.f3399a.getColor(C1846R.color.applovin_sdk_xmarkColor));
        }
        return bVarM5234d.m5226a();
    }

    /* JADX INFO: renamed from: b */
    private void m3976b(List list) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1666o c1666oM3612f = ((C1656n) it.next()).m3612f();
            Iterator it2 = c1666oM3612f.m3711a().iterator();
            while (it2.hasNext()) {
                hashSet.add(((C1604k8) it2.next()).m3097b());
            }
            Iterator it3 = c1666oM3612f.m3715e().iterator();
            while (it3.hasNext()) {
                hashSet2.add(((C1604k8) it3.next()).m3097b());
            }
        }
        this.f2622t = new ArrayList(hashSet);
        this.f2623u = new ArrayList(hashSet2);
        Collections.sort(this.f2622t);
        Collections.sort(this.f2623u);
    }

    /* JADX INFO: renamed from: c */
    private void m3977c(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1559g3 c1559g3 = (C1559g3) it.next();
            if (!c1559g3.m2694G()) {
                if (c1559g3.m2714q() == C1559g3.a.INCOMPLETE_INTEGRATION || c1559g3.m2714q() == C1559g3.a.INVALID_INTEGRATION) {
                    this.f2619q.add(c1559g3);
                } else if (c1559g3.m2714q() == C1559g3.a.COMPLETE) {
                    this.f2620r.add(c1559g3);
                } else if (c1559g3.m2714q() == C1559g3.a.MISSING) {
                    this.f2621s.add(c1559g3);
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    private void m3978d(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1559g3 c1559g3 = (C1559g3) it.next();
            if (c1559g3.m2722y() == C1559g3.b.READY) {
                this.f2624v.add(c1559g3);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    private C1775t2 m3979e() {
        String string;
        C1775t2.b bVarM5234d = C1775t2.m5210a().m5234d("Ad Review Version");
        String strM2942b = C1585j.m2942b();
        if (StringUtils.isValidString(strM2942b)) {
            String strM2940a = C1585j.m2940a();
            if (!StringUtils.isValidString(strM2940a) || strM2940a.equals(this.f2607e.m4839k0())) {
                string = null;
            } else {
                StringBuilder sb = new StringBuilder("MAX Ad Review integrated with wrong SDK key. Please check that your ");
                sb.append(this.f2607e.m4774J0() ? "SDK key is downloaded" : "Gradle plugin snippet is integrated");
                sb.append(" from the correct account.");
                string = sb.toString();
            }
        } else {
            string = "Integrating MAX Ad review is OPTIONAL. This feature gives developers unprecedented transparency into the creatives the users see in their apps.";
        }
        if (string != null) {
            bVarM5234d.m5229b("MAX Ad Review").m5224a(string).m5221a(C1846R.drawable.applovin_ic_x_mark).m5227b(this.f3399a.getColor(C1846R.color.applovin_sdk_xmarkColor)).m5225a(true);
        } else {
            bVarM5234d.m5232c(strM2942b);
        }
        return bVarM5234d.m5226a();
    }

    /* JADX INFO: renamed from: g */
    private List m3980g() {
        boolean zM2928c = this.f2607e.m4857u0().m2928c();
        List listM2927b = this.f2607e.m4857u0().m2927b();
        return zM2928c ? m3971a((String) null, m3970a(listM2927b, false)) : m3971a(m3970a(listM2927b, true), (String) null);
    }

    /* JADX INFO: renamed from: j */
    private List m3981j() {
        ArrayList arrayList = new ArrayList(7);
        PackageInfo packageInfoM4023a = AbstractC1701q7.m4023a(this.f3399a, 0);
        String str = packageInfoM4023a != null ? packageInfoM4023a.versionName : null;
        arrayList.add(C1775t2.m5210a().m5234d("Package Name").m5232c(this.f3399a.getPackageName()).m5226a());
        C1775t2.b bVarM5234d = C1775t2.m5210a().m5234d("App Version");
        if (!StringUtils.isValidString(str)) {
            str = "None";
        }
        arrayList.add(bVarM5234d.m5232c(str).m5226a());
        arrayList.add(C1775t2.m5210a().m5234d("OS").m5232c(AbstractC1701q7.m4096d()).m5226a());
        arrayList.add(C1775t2.m5210a().m5234d("Account").m5232c(StringUtils.isValidString(this.f2614l) ? this.f2614l : "None").m5226a());
        arrayList.add(C1775t2.m5210a().m5234d("Mediation Provider").m5232c(StringUtils.isValidString(this.f2607e.m4794X()) ? this.f2607e.m4794X() : "None").m5226a());
        arrayList.add(C1775t2.m5210a().m5234d("OM SDK Version").m5232c(this.f2607e.m4831g0().m3129c()).m5226a());
        arrayList.add(m3968a(C1748l.m4716H0()));
        return arrayList;
    }

    /* JADX INFO: renamed from: l */
    private C1775t2 m3982l() {
        String strM2229d = this.f2607e.m4855t0().m2229d();
        boolean zIsValidString = StringUtils.isValidString(strM2229d);
        boolean zIsValidString2 = StringUtils.isValidString(this.f2607e.m4855t0().m2234j());
        C1775t2.b bVarM5234d = C1775t2.m5211a(C1775t2.c.DETAIL).m5234d("CMP (Consent Management Platform)");
        if (!zIsValidString) {
            strM2229d = zIsValidString2 ? AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN : "None";
        }
        C1775t2.b bVarM5232c = bVarM5234d.m5232c(strM2229d);
        if (this.f2615m) {
            bVarM5232c.m5225a(true);
            if (zIsValidString2) {
                bVarM5232c.m5222a(this.f3399a);
            } else {
                bVarM5232c.m5229b("TC Data Not Found");
                bVarM5232c.m5224a("By January 16, 2024, if you use Google AdMob or Google Ad Manager, you must also use a Google-certified CMP. Test your app in EEA and UK regions to ensure that this warning doesn't appear in those regions.\n\nFor more details, see:\nhttps://support.google.com/admob/answer/13554116");
                boolean z = this.f2607e.m4860w().getConsentFlowUserGeography() == AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR;
                bVarM5232c.m5221a(z ? C1846R.drawable.applovin_ic_x_mark : C1846R.drawable.applovin_ic_warning);
                bVarM5232c.m5227b(this.f3399a.getColor(z ? C1846R.color.applovin_sdk_xmarkColor : C1846R.color.applovin_sdk_warningColor));
            }
        }
        return bVarM5232c.m5226a();
    }

    /* JADX INFO: renamed from: m */
    private C1775t2 m3983m() {
        return C1775t2.m5210a().m5234d("MAX Terms and Privacy Policy Flow").m5222a(this.f3399a).m5225a(true).m5226a();
    }

    /* JADX INFO: renamed from: n */
    private List m3984n() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(C1775t2.m5210a().m5234d("View Axon Events").m5222a(this.f3399a).m5225a(true).m5226a());
        return arrayList;
    }

    /* JADX INFO: renamed from: o */
    private C1775t2 m3985o() {
        boolean zHasSupportedCmp = this.f2607e.m4854t().hasSupportedCmp();
        return C1775t2.m5210a().m5234d("Google UMP SDK").m5221a(zHasSupportedCmp ? C1846R.drawable.applovin_ic_check_mark_bordered : C1846R.drawable.applovin_ic_x_mark).m5227b(this.f3399a.getColor(zHasSupportedCmp ? C1846R.color.applovin_sdk_checkmarkColor : C1846R.color.applovin_sdk_xmarkColor)).m5229b("Google UMP SDK").m5224a("In order to use MAX Terms and Privacy Policy Flow, you must add the Google User Messaging Platform SDK as a dependency.\n\nFor more details, see:\nhttps://support.axon.ai/en/max/android/overview/terms-and-privacy-policy-flow").m5225a(!zHasSupportedCmp).m5226a();
    }

    /* JADX INFO: renamed from: r */
    private List m3986r() {
        ArrayList arrayList = new ArrayList(7);
        arrayList.add(C1775t2.m5210a().m5234d("SDK Version").m5232c(AppLovinSdk.VERSION).m5226a());
        String str = (String) this.f2607e.m4801a(C1831z4.f3794P3);
        C1775t2.b bVarM5234d = C1775t2.m5210a().m5234d("Plugin Version");
        if (!StringUtils.isValidString(str)) {
            str = "None";
        }
        arrayList.add(bVarM5234d.m5232c(str).m5226a());
        arrayList.add(m3979e());
        if (this.f2607e.m4774J0()) {
            String strM4032a = AbstractC1701q7.m4032a(this.f2607e.m4847p0());
            arrayList.add(m3975b("Unity Version", StringUtils.isValidString(strM4032a) ? strM4032a : "None"));
        }
        if (this.f2607e.m4864y().m5350j()) {
            arrayList.add(m3983m());
            arrayList.add(m3985o());
            return arrayList;
        }
        if (this.f2607e.m4864y().m5352l()) {
            arrayList.add(m3989v());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: s */
    private C1775t2 m3987s() {
        return C1775t2.m5210a().m5234d("Network Consent Statuses").m5222a(this.f3399a).m5225a(true).m5226a();
    }

    /* JADX INFO: renamed from: t */
    private List m3988t() {
        ArrayList arrayList = new ArrayList(d.COUNT.ordinal());
        arrayList.add(m3982l());
        if (StringUtils.isValidString(this.f2607e.m4855t0().m2234j())) {
            arrayList.add(m3987s());
        } else {
            arrayList.add(new C1777t4(AbstractC1694q0.m3953b(), false, this.f3399a));
        }
        arrayList.add(new C1777t4(AbstractC1694q0.m3948a(), true, this.f3399a));
        return arrayList;
    }

    /* JADX INFO: renamed from: v */
    private C1775t2 m3989v() {
        return C1775t2.m5210a().m5234d("Terms Flow").m5221a(C1846R.drawable.applovin_ic_x_mark).m5227b(this.f3399a.getColor(C1846R.color.applovin_sdk_xmarkColor)).m5229b("Terms Flow has been replaced").m5224a(this.f2607e.m4864y().m5347g()).m5225a(true).m5226a();
    }

    @Override // com.applovin.impl.C1506b0.a
    /* JADX INFO: renamed from: a */
    public void mo2061a(C1506b0.b bVar, String str) {
        if (bVar != C1506b0.b.APP_DETAILS_NOT_FOUND) {
            this.f2626x.add(m3967a(m3969a(bVar, str, null), m3965a(bVar)));
            m5280c();
        } else {
            this.f2607e.m4782Q();
            if (C1768p.m5160a()) {
                this.f2607e.m4782Q().m5171a("MediationDebuggerListAdapter", "Could not retrieve app details for this package name; app-ads.txt row will not show on the mediation debugger.");
            }
        }
    }

    @Override // com.applovin.impl.C1506b0.a
    /* JADX INFO: renamed from: a */
    public void mo2062a(C1826z c1826z, String str) {
        String strM3969a;
        c cVarM3965a;
        c cVar;
        String str2;
        List<C1479a0> listM2055a = C1506b0.m2055a(c1826z, this.f2611i);
        if (listM2055a.isEmpty()) {
            str2 = "All required entries found at " + str + ".";
            cVar = c.SUCCESS;
        } else {
            C1479a0 c1479a0 = null;
            for (C1479a0 c1479a1 : listM2055a) {
                this.f2607e.m4782Q();
                if (C1768p.m5160a()) {
                    this.f2607e.m4782Q().m5174b("MediationDebuggerListAdapter", str + " is missing a required entry: " + c1479a1.m1766d());
                }
                if (c1479a1.m1769g()) {
                    c1479a0 = c1479a1;
                }
            }
            if (c1479a0 != null) {
                C1506b0.b bVar = C1506b0.b.MISSING_APPLOVIN_ENTRIES;
                strM3969a = m3969a(bVar, str, c1479a0.m1766d());
                cVarM3965a = m3965a(bVar);
            } else {
                C1506b0.b bVar2 = C1506b0.b.MISSING_NON_APPLOVIN_ENTRIES;
                strM3969a = m3969a(bVar2, str, null);
                cVarM3965a = m3965a(bVar2);
            }
            String str3 = strM3969a;
            cVar = cVarM3965a;
            str2 = str3;
        }
        this.f2626x.add(m3967a(str2, cVar));
        m5280c();
    }

    /* JADX INFO: renamed from: a */
    public void m3990a(List list, List list2, List list3, List list4, String str, String str2, String str3, boolean z, C1748l c1748l) {
        this.f2607e = c1748l;
        this.f2608f = list;
        this.f2609g = list2;
        this.f2610h = list3;
        this.f2611i = list4;
        this.f2612j = str;
        this.f2613k = str2;
        this.f2614l = str3;
        this.f2615m = z;
        if (list != null && this.f2617o.compareAndSet(false, true)) {
            c1748l.m4782Q();
            if (C1768p.m5160a()) {
                c1748l.m4782Q().m5171a("MediationDebuggerListAdapter", "Populating networks...");
            }
            m3977c(list);
            m3976b(list2);
            m3978d(this.f2620r);
            this.f2625w.addAll(m3981j());
            this.f2626x.addAll(m3986r());
            this.f2627y.addAll(m3988t());
            this.f2628z.addAll(m3980g());
            this.f2603A.addAll(m3984n());
            this.f2604B = m3972a(this.f2619q);
            this.f2605C = m3972a(this.f2620r);
            this.f2606D = m3972a(this.f2621s);
            ArrayList arrayList = new ArrayList(3);
            arrayList.add("privacy_setting_updated");
            arrayList.add("network_sdk_version_updated");
            arrayList.add("live_networks_updated");
            arrayList.add("test_mode_networks_updated");
            AppLovinCommunicator.getInstance(this.f3399a).subscribe(this, arrayList);
            m3964A();
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.q3$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.notifyDataSetChanged();
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public boolean m3991a(C1775t2 c1775t2) {
        if (c1775t2.mo2748k() == null) {
            return false;
        }
        return "MAX Terms and Privacy Policy Flow".equals(c1775t2.mo2748k().toString());
    }

    @Override // com.applovin.impl.AbstractViewOnClickListenerC1784u2
    /* JADX INFO: renamed from: b */
    protected int mo2125b() {
        return e.COUNT.ordinal();
    }

    /* JADX INFO: renamed from: b */
    public void m3992b(boolean z) {
        this.f2618p = z;
    }

    @Override // com.applovin.impl.AbstractViewOnClickListenerC1784u2
    /* JADX INFO: renamed from: c */
    protected List mo2126c(int i) {
        if (i == e.APP_INFO.ordinal()) {
            return this.f2625w;
        }
        if (i == e.MAX.ordinal()) {
            return this.f2626x;
        }
        if (i == e.PRIVACY.ordinal()) {
            return this.f2627y;
        }
        if (i == e.ADS.ordinal()) {
            return this.f2628z;
        }
        if (i == e.EVENTS.ordinal()) {
            return this.f2603A;
        }
        if (i == e.INCOMPLETE_NETWORKS.ordinal()) {
            return this.f2604B;
        }
        return i == e.COMPLETED_NETWORKS.ordinal() ? this.f2605C : this.f2606D;
    }

    @Override // com.applovin.impl.AbstractViewOnClickListenerC1784u2
    /* JADX INFO: renamed from: d */
    protected int mo2127d(int i) {
        if (i == e.APP_INFO.ordinal()) {
            return this.f2625w.size();
        }
        if (i == e.MAX.ordinal()) {
            return this.f2626x.size();
        }
        if (i == e.PRIVACY.ordinal()) {
            return this.f2627y.size();
        }
        if (i == e.ADS.ordinal()) {
            return this.f2628z.size();
        }
        if (i == e.EVENTS.ordinal()) {
            if (this.f2607e.m4768G().isAxonEventTracked()) {
                return this.f2603A.size();
            }
            return 0;
        }
        if (i == e.INCOMPLETE_NETWORKS.ordinal()) {
            return this.f2604B.size();
        }
        return i == e.COMPLETED_NETWORKS.ordinal() ? this.f2605C.size() : this.f2606D.size();
    }

    /* JADX INFO: renamed from: d */
    public List m3993d() {
        ArrayList<C1533d7> arrayList = new ArrayList();
        Iterator it = this.f2608f.iterator();
        while (it.hasNext()) {
            arrayList.add(((C1559g3) it.next()).m2717t());
        }
        String strM2235k = this.f2607e.m4855t0().m2235k();
        if (strM2235k != null) {
            String strM2227c = this.f2607e.m4855t0().m2227c();
            for (C1533d7 c1533d7 : arrayList) {
                if (c1533d7.m2425f() == C1533d7.a.TCF_VENDOR && c1533d7.m2423d() != null) {
                    c1533d7.m2420a(Boolean.valueOf(AbstractC1553f7.m2621a(strM2235k, c1533d7.m2423d().intValue() - 1)));
                } else if (c1533d7.m2425f() == C1533d7.a.ATP_NETWORK && c1533d7.m2423d() != null) {
                    c1533d7.m2420a(AbstractC1553f7.m2619a(c1533d7.m2423d().intValue(), strM2227c));
                }
            }
        } else {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((C1533d7) it2.next()).m2420a(null);
            }
        }
        return arrayList;
    }

    @Override // com.applovin.impl.AbstractViewOnClickListenerC1784u2
    /* JADX INFO: renamed from: e */
    protected C1775t2 mo2128e(int i) {
        if (i == e.APP_INFO.ordinal()) {
            return new C1813x4("APP INFO");
        }
        if (i == e.MAX.ordinal()) {
            return new C1813x4("MAX");
        }
        if (i == e.PRIVACY.ordinal()) {
            return new C1813x4("PRIVACY");
        }
        if (i == e.ADS.ordinal()) {
            return new C1813x4("ADS");
        }
        if (i == e.EVENTS.ordinal()) {
            return new C1813x4("EVENTS");
        }
        if (i == e.INCOMPLETE_NETWORKS.ordinal()) {
            return new C1813x4("INCOMPLETE SDK INTEGRATIONS");
        }
        return i == e.COMPLETED_NETWORKS.ordinal() ? new C1813x4("COMPLETED SDK INTEGRATIONS") : new C1813x4("MISSING SDK INTEGRATIONS");
    }

    /* JADX INFO: renamed from: f */
    public List m3994f() {
        return this.f2609g;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "MediationDebuggerListAdapter";
    }

    /* JADX INFO: renamed from: h */
    public String m3995h() {
        return this.f2613k;
    }

    /* JADX INFO: renamed from: i */
    public String m3996i() {
        return this.f2612j;
    }

    /* JADX INFO: renamed from: k */
    public List m3997k() {
        return this.f2622t;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("privacy_setting_updated".equals(appLovinCommunicatorMessage.getTopic())) {
            this.f2627y = m3988t();
            m5280c();
            return;
        }
        if ("network_sdk_version_updated".equals(appLovinCommunicatorMessage.getTopic())) {
            this.f2604B = m3972a(this.f2619q);
            this.f2605C = m3972a(this.f2620r);
            m5280c();
        } else if ("live_networks_updated".equals(appLovinCommunicatorMessage.getTopic())) {
            this.f2628z = m3971a(m3970a((List) appLovinCommunicatorMessage.getMessageData().getStringArrayList("live_networks"), true), (String) null);
            m5280c();
        } else if ("test_mode_networks_updated".equals(appLovinCommunicatorMessage.getTopic())) {
            this.f2628z = m3971a((String) null, m3970a((List) appLovinCommunicatorMessage.getMessageData().getStringArrayList("test_mode_networks"), false));
            m5280c();
        }
    }

    /* JADX INFO: renamed from: p */
    public List m3998p() {
        return this.f2610h;
    }

    /* JADX INFO: renamed from: q */
    public String m3999q() {
        return this.f2616n.toString();
    }

    public String toString() {
        return "MediationDebuggerListAdapter{isInitialized=" + this.f2617o.get() + "}";
    }

    /* JADX INFO: renamed from: u */
    public C1748l m4000u() {
        return this.f2607e;
    }

    /* JADX INFO: renamed from: w */
    public List m4001w() {
        return this.f2624v;
    }

    /* JADX INFO: renamed from: x */
    public List m4002x() {
        return this.f2623u;
    }

    /* JADX INFO: renamed from: y */
    public boolean m4003y() {
        return this.f2618p;
    }

    /* JADX INFO: renamed from: z */
    public boolean m4004z() {
        return this.f2617o.get();
    }
}
