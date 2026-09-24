package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.impl.sdk.C1748l;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.C1846R;
import com.facebook.internal.AnalyticsEvents;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.applovin.impl.l7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractActivityC1613l7 extends AbstractActivityC1680p3 {

    /* JADX INFO: renamed from: a */
    private C1748l f2018a;

    /* JADX INFO: renamed from: b */
    private AbstractViewOnClickListenerC1784u2 f2019b;

    /* JADX INFO: renamed from: com.applovin.impl.l7$a */
    class a extends AbstractViewOnClickListenerC1784u2 {
        a(Context context) {
            super(context);
        }

        @Override // com.applovin.impl.AbstractViewOnClickListenerC1784u2
        /* JADX INFO: renamed from: b */
        protected int mo2125b() {
            return d.values().length;
        }

        @Override // com.applovin.impl.AbstractViewOnClickListenerC1784u2
        /* JADX INFO: renamed from: c */
        protected List mo2126c(int i) {
            return i == d.SETTINGS.ordinal() ? AbstractActivityC1613l7.this.m3148c() : AbstractActivityC1613l7.this.m3143a();
        }

        @Override // com.applovin.impl.AbstractViewOnClickListenerC1784u2
        /* JADX INFO: renamed from: d */
        protected int mo2127d(int i) {
            return i == d.SETTINGS.ordinal() ? e.values().length : c.values().length;
        }

        @Override // com.applovin.impl.AbstractViewOnClickListenerC1784u2
        /* JADX INFO: renamed from: e */
        protected C1775t2 mo2128e(int i) {
            return i == d.SETTINGS.ordinal() ? new C1813x4("SETTINGS") : new C1813x4("GDPR APPLICABILITY");
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.l7$b */
    class b implements AbstractViewOnClickListenerC1784u2.a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C1748l f2021a;

        b(C1748l c1748l) {
            this.f2021a = c1748l;
        }

        @Override // com.applovin.impl.AbstractViewOnClickListenerC1784u2.a
        /* JADX INFO: renamed from: a */
        public void mo2129a(C1608l2 c1608l2, C1775t2 c1775t2) {
            if (c1608l2.m3118b() == d.SETTINGS.ordinal()) {
                if (c1608l2.m3117a() == e.PRIVACY_POLICY_URL.ordinal()) {
                    if (this.f2021a.m4864y().m5346f() != null) {
                        AbstractC1664n7.m3685a(this.f2021a.m4864y().m5346f(), C1748l.m4756p(), this.f2021a);
                        return;
                    } else {
                        AbstractC1701q7.m4057a("Missing Privacy Policy URL", "You cannot use the AppLovin SDK's consent flow without defining a Privacy Policy URL", AbstractActivityC1613l7.this);
                        return;
                    }
                }
                if (c1608l2.m3117a() != e.TERMS_OF_SERVICE_URL.ordinal() || this.f2021a.m4864y().m5348h() == null) {
                    return;
                }
                AbstractC1664n7.m3685a(this.f2021a.m4864y().m5348h(), C1748l.m4756p(), this.f2021a);
            }
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.l7$c */
    private enum c {
        DESCRIPTION,
        CONSENT_FLOW_GEOGRAPHY,
        DEBUG_USER_GEOGRAPHY
    }

    /* JADX INFO: renamed from: com.applovin.impl.l7$d */
    private enum d {
        SETTINGS,
        GDPR_APPLICABILITY
    }

    /* JADX INFO: renamed from: com.applovin.impl.l7$e */
    private enum e {
        PRIVACY_POLICY_URL,
        TERMS_OF_SERVICE_URL
    }

    /* JADX INFO: renamed from: a */
    private C1775t2 m3142a(AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography, boolean z) {
        String str;
        C1775t2.b bVarM5234d = C1775t2.m5210a().m5234d("Consent Flow Geography");
        if (consentFlowUserGeography == AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR) {
            str = "GDPR";
        } else {
            str = consentFlowUserGeography == AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER ? "Other" : AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
        }
        return bVarM5234d.m5232c(str).m5230b(z).m5226a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public List m3143a() {
        ArrayList arrayList = new ArrayList(c.values().length);
        AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography = this.f2018a.m4860w().getConsentFlowUserGeography();
        AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeographyM5344d = this.f2018a.m4864y().m5344d();
        boolean z = AbstractC1701q7.m4092c(this.f2018a) && consentFlowUserGeographyM5344d != AppLovinSdkConfiguration.ConsentFlowUserGeography.UNKNOWN;
        arrayList.add(C1775t2.m5210a().m5234d("AppLovin determines whether the user is located in a GDPR region. If the user is in a GDPR region, the MAX SDK presents Google UMP.\n\nYou can test the flow on debug mode by overriding the region check by setting the debug user geography.").m5226a());
        arrayList.add(m3142a(consentFlowUserGeography, !z));
        arrayList.add(m3146b(consentFlowUserGeographyM5344d, z));
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    private C1775t2 m3145b() {
        boolean z = this.f2018a.m4864y().m5346f() != null;
        return C1775t2.m5210a().m5234d("Privacy Policy URL").m5221a(z ? C1846R.drawable.applovin_ic_check_mark_bordered : C1846R.drawable.applovin_ic_x_mark).m5227b(getColor(z ? C1846R.color.applovin_sdk_checkmarkColor : C1846R.color.applovin_sdk_xmarkColor)).m5225a(true).m5226a();
    }

    /* JADX INFO: renamed from: b */
    private C1775t2 m3146b(AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography, boolean z) {
        String str;
        C1775t2.b bVarM5234d = C1775t2.m5210a().m5234d("Debug User Geography");
        if (consentFlowUserGeography == AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR) {
            str = "GDPR";
        } else {
            str = consentFlowUserGeography == AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER ? "Other" : "None";
        }
        return bVarM5234d.m5232c(str).m5230b(z).m5226a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public List m3148c() {
        ArrayList arrayList = new ArrayList(e.values().length);
        arrayList.add(m3145b());
        arrayList.add(m3149d());
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    private C1775t2 m3149d() {
        C1775t2.b bVarM5234d = C1775t2.m5210a().m5234d("Terms of Service URL");
        if (this.f2018a.m4864y().m5348h() != null) {
            bVarM5234d.m5221a(C1846R.drawable.applovin_ic_check_mark_bordered);
            bVarM5234d.m5227b(getColor(C1846R.color.applovin_sdk_checkmarkColor));
            bVarM5234d.m5225a(true);
        } else {
            bVarM5234d.m5232c("None");
            bVarM5234d.m5225a(false);
        }
        return bVarM5234d.m5226a();
    }

    @Override // com.applovin.impl.AbstractActivityC1680p3
    protected C1748l getSdk() {
        return this.f2018a;
    }

    public void initialize(C1748l c1748l) {
        this.f2018a = c1748l;
        a aVar = new a(this);
        this.f2019b = aVar;
        aVar.m5278a(new b(c1748l));
        this.f2019b.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.AbstractActivityC1680p3, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1846R.layout.mediation_debugger_list_view);
        setTitle("MAX Terms and Privacy Policy Flow");
        ((ListView) findViewById(C1846R.id.listView)).setAdapter((ListAdapter) this.f2019b);
    }

    @Override // com.applovin.impl.AbstractActivityC1680p3, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        AbstractViewOnClickListenerC1784u2 abstractViewOnClickListenerC1784u2 = this.f2019b;
        if (abstractViewOnClickListenerC1784u2 != null) {
            abstractViewOnClickListenerC1784u2.m5278a((AbstractViewOnClickListenerC1784u2.a) null);
        }
    }
}
