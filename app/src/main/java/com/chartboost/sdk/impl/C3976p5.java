package com.chartboost.sdk.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.p5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3976p5 {

    /* JADX INFO: renamed from: e */
    public static final a f15784e = new a(null);

    /* JADX INFO: renamed from: a */
    public final C3928n1 f15785a;

    /* JADX INFO: renamed from: b */
    public final String f15786b;

    /* JADX INFO: renamed from: c */
    public final boolean f15787c;

    /* JADX INFO: renamed from: d */
    public final List f15788d;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.p5$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C3976p5 m19026a(JSONObject jSONObject) {
            String str = null;
            if (jSONObject == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("click");
            if (jSONArrayOptJSONArray != null) {
                int length = jSONArrayOptJSONArray.length();
                for (int i = 0; i < length; i++) {
                    String strOptString = jSONArrayOptJSONArray.optString(i);
                    if (strOptString != null) {
                        Intrinsics.checkNotNull(strOptString);
                        if (StringsKt.isBlank(strOptString)) {
                            strOptString = null;
                        }
                        if (strOptString != null) {
                            arrayList.add(strOptString);
                        }
                    }
                }
            }
            C3928n1 c3928n1M18702a = C3928n1.f15415d.m18702a(jSONObject.optJSONObject("app_install_button"));
            String strOptString2 = jSONObject.optString("button_html");
            Intrinsics.checkNotNull(strOptString2);
            if (!StringsKt.isBlank(strOptString2) && !Intrinsics.areEqual(strOptString2, AbstractJsonLexerKt.NULL)) {
                str = strOptString2;
            }
            return new C3976p5(c3928n1M18702a, str, jSONObject.optBoolean("show_on_endcard", false), arrayList);
        }
    }

    public C3976p5(C3928n1 c3928n1, String str, boolean z, List clickTrackers) {
        Intrinsics.checkNotNullParameter(clickTrackers, "clickTrackers");
        this.f15785a = c3928n1;
        this.f15786b = str;
        this.f15787c = z;
        this.f15788d = clickTrackers;
    }

    /* JADX INFO: renamed from: a */
    public final C3928n1 m19023a() {
        return this.f15785a;
    }

    /* JADX INFO: renamed from: b */
    public final String m19024b() {
        return this.f15786b;
    }

    /* JADX INFO: renamed from: c */
    public final List m19025c() {
        return this.f15788d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3976p5)) {
            return false;
        }
        C3976p5 c3976p5 = (C3976p5) obj;
        return Intrinsics.areEqual(this.f15785a, c3976p5.f15785a) && Intrinsics.areEqual(this.f15786b, c3976p5.f15786b) && this.f15787c == c3976p5.f15787c && Intrinsics.areEqual(this.f15788d, c3976p5.f15788d);
    }

    public int hashCode() {
        C3928n1 c3928n1 = this.f15785a;
        int iHashCode = (c3928n1 == null ? 0 : c3928n1.hashCode()) * 31;
        String str = this.f15786b;
        return ((((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + UByte$$ExternalSyntheticBackport0.m43487m(this.f15787c)) * 31) + this.f15788d.hashCode();
    }

    public String toString() {
        return "CtaConfig(appInstallButton=" + this.f15785a + ", buttonHtml=" + this.f15786b + ", showOnEndcard=" + this.f15787c + ", clickTrackers=" + this.f15788d + ")";
    }
}
