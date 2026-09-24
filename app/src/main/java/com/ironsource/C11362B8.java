package com.ironsource;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.webkit.WebView;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.B8 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11362B8 {

    /* JADX INFO: renamed from: a */
    private final String f23918a;

    /* JADX INFO: renamed from: b */
    private final String f23919b;

    /* JADX INFO: renamed from: c */
    private final String f23920c;

    /* JADX INFO: renamed from: d */
    private final String f23921d;

    /* JADX INFO: renamed from: e */
    private final Drawable f23922e;

    /* JADX INFO: renamed from: f */
    private final WebView f23923f;

    /* JADX INFO: renamed from: g */
    private final View f23924g;

    /* JADX INFO: renamed from: com.ironsource.B8$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        private final a f23927a;

        /* JADX INFO: renamed from: com.ironsource.B8$b$a */
        public static final class a {

            /* JADX INFO: renamed from: a */
            private final String f23928a;

            /* JADX INFO: renamed from: b */
            private final String f23929b;

            /* JADX INFO: renamed from: c */
            private final String f23930c;

            /* JADX INFO: renamed from: d */
            private final String f23931d;

            /* JADX INFO: renamed from: e */
            private final Result<Drawable> f23932e;

            /* JADX INFO: renamed from: f */
            private final Result<WebView> f23933f;

            /* JADX INFO: renamed from: g */
            private final View f23934g;

            /* JADX WARN: Multi-variable type inference failed */
            public a(String str, String str2, String str3, String str4, Result<? extends Drawable> result, Result<? extends WebView> result2, View privacyIcon) {
                Intrinsics.checkNotNullParameter(privacyIcon, "privacyIcon");
                this.f23928a = str;
                this.f23929b = str2;
                this.f23930c = str3;
                this.f23931d = str4;
                this.f23932e = result;
                this.f23933f = result2;
                this.f23934g = privacyIcon;
            }

            /* JADX INFO: renamed from: a */
            public final String m25447a() {
                return this.f23928a;
            }

            /* JADX INFO: renamed from: b */
            public final String m25448b() {
                return this.f23929b;
            }

            /* JADX INFO: renamed from: c */
            public final String m25449c() {
                return this.f23930c;
            }

            /* JADX INFO: renamed from: d */
            public final String m25450d() {
                return this.f23931d;
            }

            /* JADX INFO: renamed from: e */
            public final Result<Drawable> m25451e() {
                return this.f23932e;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return Intrinsics.areEqual(this.f23928a, aVar.f23928a) && Intrinsics.areEqual(this.f23929b, aVar.f23929b) && Intrinsics.areEqual(this.f23930c, aVar.f23930c) && Intrinsics.areEqual(this.f23931d, aVar.f23931d) && Intrinsics.areEqual(this.f23932e, aVar.f23932e) && Intrinsics.areEqual(this.f23933f, aVar.f23933f) && Intrinsics.areEqual(this.f23934g, aVar.f23934g);
            }

            /* JADX INFO: renamed from: f */
            public final Result<WebView> m25452f() {
                return this.f23933f;
            }

            /* JADX INFO: renamed from: g */
            public final View m25453g() {
                return this.f23934g;
            }

            /* JADX INFO: renamed from: h */
            public final C11362B8 m25454h() {
                Drawable drawable;
                String str = this.f23928a;
                String str2 = this.f23929b;
                String str3 = this.f23930c;
                String str4 = this.f23931d;
                Result<Drawable> result = this.f23932e;
                WebView webView = null;
                if (result != null) {
                    Object value = result.getValue();
                    if (Result.m44952isFailureimpl(value)) {
                        value = null;
                    }
                    drawable = (Drawable) value;
                } else {
                    drawable = null;
                }
                Result<WebView> result2 = this.f23933f;
                if (result2 != null) {
                    Object value2 = result2.getValue();
                    webView = (WebView) (Result.m44952isFailureimpl(value2) ? null : value2);
                }
                return new C11362B8(str, str2, str3, str4, drawable, webView, this.f23934g);
            }

            public int hashCode() {
                String str = this.f23928a;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.f23929b;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.f23930c;
                int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.f23931d;
                int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
                Result<Drawable> result = this.f23932e;
                int iM44951hashCodeimpl = (iHashCode4 + (result == null ? 0 : Result.m44951hashCodeimpl(result.getValue()))) * 31;
                Result<WebView> result2 = this.f23933f;
                return ((iM44951hashCodeimpl + (result2 != null ? Result.m44951hashCodeimpl(result2.getValue()) : 0)) * 31) + this.f23934g.hashCode();
            }

            /* JADX INFO: renamed from: i */
            public final String m25455i() {
                return this.f23929b;
            }

            /* JADX INFO: renamed from: j */
            public final String m25456j() {
                return this.f23930c;
            }

            /* JADX INFO: renamed from: k */
            public final String m25457k() {
                return this.f23931d;
            }

            /* JADX INFO: renamed from: l */
            public final Result<Drawable> m25458l() {
                return this.f23932e;
            }

            /* JADX INFO: renamed from: m */
            public final Result<WebView> m25459m() {
                return this.f23933f;
            }

            /* JADX INFO: renamed from: n */
            public final View m25460n() {
                return this.f23934g;
            }

            /* JADX INFO: renamed from: o */
            public final String m25461o() {
                return this.f23928a;
            }

            public String toString() {
                return "Data(title=" + this.f23928a + ", advertiser=" + this.f23929b + ", body=" + this.f23930c + ", cta=" + this.f23931d + ", icon=" + this.f23932e + ", media=" + this.f23933f + ", privacyIcon=" + this.f23934g + ")";
            }

            /* JADX INFO: renamed from: a */
            public final a m25446a(String str, String str2, String str3, String str4, Result<? extends Drawable> result, Result<? extends WebView> result2, View privacyIcon) {
                Intrinsics.checkNotNullParameter(privacyIcon, "privacyIcon");
                return new a(str, str2, str3, str4, result, result2, privacyIcon);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX INFO: renamed from: a */
            public static /* synthetic */ a m25445a(a aVar, String str, String str2, String str3, String str4, Result result, Result result2, View view, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = aVar.f23928a;
                }
                if ((i & 2) != 0) {
                    str2 = aVar.f23929b;
                }
                if ((i & 4) != 0) {
                    str3 = aVar.f23930c;
                }
                if ((i & 8) != 0) {
                    str4 = aVar.f23931d;
                }
                if ((i & 16) != 0) {
                    result = aVar.f23932e;
                }
                if ((i & 32) != 0) {
                    result2 = aVar.f23933f;
                }
                if ((i & 64) != 0) {
                    view = aVar.f23934g;
                }
                Result result3 = result2;
                View view2 = view;
                Result result4 = result;
                String str5 = str3;
                return aVar.m25446a(str, str2, str5, str4, result4, result3, view2);
            }
        }

        public b(a data) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.f23927a = data;
        }

        /* JADX INFO: renamed from: a */
        public final a m25443a() {
            return this.f23927a;
        }

        /* JADX INFO: renamed from: b */
        public final JSONObject m25444b() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            if (this.f23927a.m25461o() != null) {
                m25441a(jSONObject, "title");
            }
            if (this.f23927a.m25455i() != null) {
                m25441a(jSONObject, C11744X3.i.f26327F0);
            }
            if (this.f23927a.m25456j() != null) {
                m25441a(jSONObject, "body");
            }
            if (this.f23927a.m25457k() != null) {
                m25441a(jSONObject, "cta");
            }
            Result<Drawable> resultM25458l = this.f23927a.m25458l();
            if (resultM25458l != null) {
                m25442a(jSONObject, "icon", resultM25458l.getValue());
            }
            Result<WebView> resultM25459m = this.f23927a.m25459m();
            if (resultM25459m != null) {
                m25442a(jSONObject, "media", resultM25459m.getValue());
            }
            return jSONObject;
        }

        /* JADX INFO: renamed from: a */
        private static final void m25441a(JSONObject jSONObject, String str) throws JSONException {
            jSONObject.put(str, new JSONObject().put("success", true));
        }

        /* JADX INFO: renamed from: a */
        private static final <T> void m25442a(JSONObject jSONObject, String str, Object obj) throws JSONException {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("success", Result.m44953isSuccessimpl(obj));
            Throwable thM44949exceptionOrNullimpl = Result.m44949exceptionOrNullimpl(obj);
            if (thM44949exceptionOrNullimpl != null) {
                String message = thM44949exceptionOrNullimpl.getMessage();
                if (message == null) {
                    message = "unknown reason";
                }
                jSONObject2.put("reason", message);
            }
            Unit unit = Unit.INSTANCE;
            jSONObject.put(str, jSONObject2);
        }
    }

    public C11362B8(String str, String str2, String str3, String str4, Drawable drawable, WebView webView, View privacyIcon) {
        Intrinsics.checkNotNullParameter(privacyIcon, "privacyIcon");
        this.f23918a = str;
        this.f23919b = str2;
        this.f23920c = str3;
        this.f23921d = str4;
        this.f23922e = drawable;
        this.f23923f = webView;
        this.f23924g = privacyIcon;
    }

    /* JADX INFO: renamed from: a */
    public final String m25424a() {
        return this.f23918a;
    }

    /* JADX INFO: renamed from: b */
    public final String m25425b() {
        return this.f23919b;
    }

    /* JADX INFO: renamed from: c */
    public final String m25426c() {
        return this.f23920c;
    }

    /* JADX INFO: renamed from: d */
    public final String m25427d() {
        return this.f23921d;
    }

    /* JADX INFO: renamed from: e */
    public final Drawable m25428e() {
        return this.f23922e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11362B8)) {
            return false;
        }
        C11362B8 c11362b8 = (C11362B8) obj;
        return Intrinsics.areEqual(this.f23918a, c11362b8.f23918a) && Intrinsics.areEqual(this.f23919b, c11362b8.f23919b) && Intrinsics.areEqual(this.f23920c, c11362b8.f23920c) && Intrinsics.areEqual(this.f23921d, c11362b8.f23921d) && Intrinsics.areEqual(this.f23922e, c11362b8.f23922e) && Intrinsics.areEqual(this.f23923f, c11362b8.f23923f) && Intrinsics.areEqual(this.f23924g, c11362b8.f23924g);
    }

    /* JADX INFO: renamed from: f */
    public final WebView m25429f() {
        return this.f23923f;
    }

    /* JADX INFO: renamed from: g */
    public final View m25430g() {
        return this.f23924g;
    }

    /* JADX INFO: renamed from: h */
    public final String m25431h() {
        return this.f23919b;
    }

    public int hashCode() {
        String str = this.f23918a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f23919b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f23920c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f23921d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Drawable drawable = this.f23922e;
        int iHashCode5 = (iHashCode4 + (drawable == null ? 0 : drawable.hashCode())) * 31;
        WebView webView = this.f23923f;
        return ((iHashCode5 + (webView != null ? webView.hashCode() : 0)) * 31) + this.f23924g.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public final String m25432i() {
        return this.f23920c;
    }

    /* JADX INFO: renamed from: j */
    public final String m25433j() {
        return this.f23921d;
    }

    /* JADX INFO: renamed from: k */
    public final Drawable m25434k() {
        return this.f23922e;
    }

    /* JADX INFO: renamed from: l */
    public final WebView m25435l() {
        return this.f23923f;
    }

    /* JADX INFO: renamed from: m */
    public final View m25436m() {
        return this.f23924g;
    }

    /* JADX INFO: renamed from: n */
    public final String m25437n() {
        return this.f23918a;
    }

    public String toString() {
        return "ISNNativeAdData(title=" + this.f23918a + ", advertiser=" + this.f23919b + ", body=" + this.f23920c + ", cta=" + this.f23921d + ", icon=" + this.f23922e + ", mediaView=" + this.f23923f + ", privacyIcon=" + this.f23924g + ")";
    }

    /* JADX INFO: renamed from: a */
    public final C11362B8 m25423a(String str, String str2, String str3, String str4, Drawable drawable, WebView webView, View privacyIcon) {
        Intrinsics.checkNotNullParameter(privacyIcon, "privacyIcon");
        return new C11362B8(str, str2, str3, str4, drawable, webView, privacyIcon);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C11362B8 m25422a(C11362B8 c11362b8, String str, String str2, String str3, String str4, Drawable drawable, WebView webView, View view, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c11362b8.f23918a;
        }
        if ((i & 2) != 0) {
            str2 = c11362b8.f23919b;
        }
        if ((i & 4) != 0) {
            str3 = c11362b8.f23920c;
        }
        if ((i & 8) != 0) {
            str4 = c11362b8.f23921d;
        }
        if ((i & 16) != 0) {
            drawable = c11362b8.f23922e;
        }
        if ((i & 32) != 0) {
            webView = c11362b8.f23923f;
        }
        if ((i & 64) != 0) {
            view = c11362b8.f23924g;
        }
        WebView webView2 = webView;
        View view2 = view;
        Drawable drawable2 = drawable;
        String str5 = str3;
        return c11362b8.m25423a(str, str2, str5, str4, drawable2, webView2, view2);
    }

    /* JADX INFO: renamed from: com.ironsource.B8$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private final InterfaceC11664S8 f23925a;

        /* JADX INFO: renamed from: b */
        private final InterfaceC12141d1 f23926b;

        public a(InterfaceC11664S8 imageLoader, InterfaceC12141d1 adViewManagement) {
            Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
            Intrinsics.checkNotNullParameter(adViewManagement, "adViewManagement");
            this.f23925a = imageLoader;
            this.f23926b = adViewManagement;
        }

        /* JADX INFO: renamed from: b */
        private final Result<Drawable> m25439b(String str) {
            if (str == null) {
                return null;
            }
            return Result.m44945boximpl(this.f23925a.mo27341a(str));
        }

        /* JADX INFO: renamed from: a */
        public final b m25440a(Context activityContext, JSONObject json) {
            Intrinsics.checkNotNullParameter(activityContext, "activityContext");
            Intrinsics.checkNotNullParameter(json, "json");
            JSONObject jSONObjectOptJSONObject = json.optJSONObject("title");
            String strM25575b = jSONObjectOptJSONObject != null ? C11380C8.m25575b(jSONObjectOptJSONObject, "text") : null;
            JSONObject jSONObjectOptJSONObject2 = json.optJSONObject(C11744X3.i.f26327F0);
            String strM25575b2 = jSONObjectOptJSONObject2 != null ? C11380C8.m25575b(jSONObjectOptJSONObject2, "text") : null;
            JSONObject jSONObjectOptJSONObject3 = json.optJSONObject("body");
            String strM25575b3 = jSONObjectOptJSONObject3 != null ? C11380C8.m25575b(jSONObjectOptJSONObject3, "text") : null;
            JSONObject jSONObjectOptJSONObject4 = json.optJSONObject("cta");
            String strM25575b4 = jSONObjectOptJSONObject4 != null ? C11380C8.m25575b(jSONObjectOptJSONObject4, "text") : null;
            JSONObject jSONObjectOptJSONObject5 = json.optJSONObject("icon");
            String strM25575b5 = jSONObjectOptJSONObject5 != null ? C11380C8.m25575b(jSONObjectOptJSONObject5, "url") : null;
            JSONObject jSONObjectOptJSONObject6 = json.optJSONObject("media");
            String strM25575b6 = jSONObjectOptJSONObject6 != null ? C11380C8.m25575b(jSONObjectOptJSONObject6, "adViewId") : null;
            JSONObject jSONObjectOptJSONObject7 = json.optJSONObject(C11744X3.i.f26335J0);
            return new b(new b.a(strM25575b, strM25575b2, strM25575b3, strM25575b4, m25439b(strM25575b5), m25438a(strM25575b6), C12391nd.f31562a.m32826a(activityContext, jSONObjectOptJSONObject7 != null ? C11380C8.m25575b(jSONObjectOptJSONObject7, "url") : null, this.f23925a)));
        }

        /* JADX INFO: renamed from: a */
        private final Result<WebView> m25438a(String str) {
            if (str == null) {
                return null;
            }
            InterfaceC11434F8 interfaceC11434F8Mo31278a = this.f23926b.mo31278a(str);
            WebView presentingView = interfaceC11434F8Mo31278a != null ? interfaceC11434F8Mo31278a.getPresentingView() : null;
            if (presentingView == null) {
                Result.Companion companion = Result.INSTANCE;
                return Result.m44945boximpl(Result.m44946constructorimpl(ResultKt.createFailure(new Exception("missing adview for id: '" + str + "'"))));
            }
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m44945boximpl(Result.m44946constructorimpl(presentingView));
        }
    }
}
