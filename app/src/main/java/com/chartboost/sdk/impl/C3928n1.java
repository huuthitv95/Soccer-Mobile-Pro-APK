package com.chartboost.sdk.impl;

import java.net.URL;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.n1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3928n1 {

    /* JADX INFO: renamed from: d */
    public static final a f15415d = new a(null);

    /* JADX INFO: renamed from: a */
    public final URL f15416a;

    /* JADX INFO: renamed from: b */
    public final String f15417b;

    /* JADX INFO: renamed from: c */
    public final String f15418c;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.n1$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C3928n1 m18702a(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            String strOptString = jSONObject.optString("icon");
            Intrinsics.checkNotNull(strOptString);
            if (StringsKt.isBlank(strOptString) || Intrinsics.areEqual(strOptString, AbstractJsonLexerKt.NULL)) {
                strOptString = null;
            }
            URL url = strOptString != null ? new URL(strOptString) : null;
            String strOptString2 = jSONObject.optString("title");
            if (Intrinsics.areEqual(strOptString2, AbstractJsonLexerKt.NULL)) {
                strOptString2 = null;
            }
            if (strOptString2 == null) {
                strOptString2 = "";
            }
            String strOptString3 = jSONObject.optString("button_text", "Get");
            String str = Intrinsics.areEqual(strOptString3, AbstractJsonLexerKt.NULL) ? null : strOptString3;
            return new C3928n1(url, strOptString2, str != null ? str : "Get");
        }
    }

    public C3928n1(URL url, String title, String buttonText) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        this.f15416a = url;
        this.f15417b = title;
        this.f15418c = buttonText;
    }

    /* JADX INFO: renamed from: a */
    public final String m18699a() {
        return this.f15418c;
    }

    /* JADX INFO: renamed from: b */
    public final URL m18700b() {
        return this.f15416a;
    }

    /* JADX INFO: renamed from: c */
    public final String m18701c() {
        return this.f15417b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3928n1)) {
            return false;
        }
        C3928n1 c3928n1 = (C3928n1) obj;
        return Intrinsics.areEqual(this.f15416a, c3928n1.f15416a) && Intrinsics.areEqual(this.f15417b, c3928n1.f15417b) && Intrinsics.areEqual(this.f15418c, c3928n1.f15418c);
    }

    public int hashCode() {
        URL url = this.f15416a;
        return ((((url == null ? 0 : url.hashCode()) * 31) + this.f15417b.hashCode()) * 31) + this.f15418c.hashCode();
    }

    public String toString() {
        return "AppInstallButton(iconUrl=" + this.f15416a + ", title=" + this.f15417b + ", buttonText=" + this.f15418c + ")";
    }
}
