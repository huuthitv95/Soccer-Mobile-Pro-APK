package com.chartboost.sdk.impl;

import android.content.Context;
import com.iab.omid.library.chartboost.Omid;
import com.iab.omid.library.chartboost.ScriptInjector;
import com.iab.omid.library.chartboost.adsession.Partner;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.mc */
/* JADX INFO: loaded from: classes3.dex */
public final class C3916mc implements InterfaceC4013qk {

    /* JADX INFO: renamed from: d */
    public static final a f15345d = new a(null);

    /* JADX INFO: renamed from: a */
    public final Partner f15346a;

    /* JADX INFO: renamed from: b */
    public boolean f15347b;

    /* JADX INFO: renamed from: c */
    public final C3939nc f15348c;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.mc$a */
    /* JADX INFO: loaded from: classes9.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C3916mc(Context applicationContext, C4097ug sharedPrefsHelper, C3713dg resourcesLoader) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(sharedPrefsHelper, "sharedPrefsHelper");
        Intrinsics.checkNotNullParameter(resourcesLoader, "resourcesLoader");
        Partner partnerCreatePartner = Partner.createPartner("Chartboost", "9.11.1");
        Intrinsics.checkNotNullExpressionValue(partnerCreatePartner, "createPartner(...)");
        this.f15346a = partnerCreatePartner;
        this.f15347b = true;
        this.f15348c = new C3939nc(sharedPrefsHelper, resourcesLoader);
        Omid.activate(applicationContext);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4013qk
    /* JADX INFO: renamed from: a */
    public Partner mo18637a() {
        return this.f15346a;
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4013qk
    /* JADX INFO: renamed from: a */
    public String mo18638a(String adResponseHtml) {
        Intrinsics.checkNotNullParameter(adResponseHtml, "adResponseHtml");
        if (mo18641b()) {
            try {
                String strInjectScriptContentIntoHtml = ScriptInjector.injectScriptContentIntoHtml(mo18642c(), adResponseHtml);
                Intrinsics.checkNotNull(strInjectScriptContentIntoHtml);
                return strInjectScriptContentIntoHtml;
            } catch (Throwable unused) {
            }
        }
        return adResponseHtml;
    }

    /* JADX INFO: renamed from: a */
    public String m18639a(String adResponseHtml, String scriptUrl) {
        Intrinsics.checkNotNullParameter(adResponseHtml, "adResponseHtml");
        Intrinsics.checkNotNullParameter(scriptUrl, "scriptUrl");
        if (mo18641b()) {
            String str = "<script src=\"" + scriptUrl + "\"></script>";
            try {
                String strInjectScriptContentIntoHtml = ScriptInjector.injectScriptContentIntoHtml("cfc10ccaf0724c4cbc6122cf51421f03", adResponseHtml);
                Intrinsics.checkNotNull(strInjectScriptContentIntoHtml);
                String strReplace$default = StringsKt.replace$default(strInjectScriptContentIntoHtml, "<script type=\"text/javascript\">cfc10ccaf0724c4cbc6122cf51421f03</script>", str, false, 4, (Object) null);
                if (!Intrinsics.areEqual(strReplace$default, strInjectScriptContentIntoHtml)) {
                    return strReplace$default;
                }
            } catch (Throwable unused) {
                C4048sb.m19411b("failed to inject script URL into HTML.", (Throwable) null, 2, (Object) null);
            }
        }
        return adResponseHtml;
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4013qk
    /* JADX INFO: renamed from: a */
    public String mo18640a(String adResponseHtml, Set set) {
        Intrinsics.checkNotNullParameter(adResponseHtml, "adResponseHtml");
        if (set != null && adResponseHtml.length() != 0) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                String string = ((C4189yk) it.next()).m20070a().toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                adResponseHtml = m18639a(adResponseHtml, string);
            }
        }
        return adResponseHtml;
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4013qk
    /* JADX INFO: renamed from: b */
    public boolean mo18641b() {
        return this.f15347b;
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4013qk
    /* JADX INFO: renamed from: c */
    public String mo18642c() {
        return this.f15348c.m18779a();
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4013qk
    public boolean isActive() {
        return mo18641b() && Omid.isActive();
    }
}
