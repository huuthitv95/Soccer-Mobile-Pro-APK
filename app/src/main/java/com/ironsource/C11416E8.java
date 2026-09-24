package com.ironsource;

import android.view.View;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.E8 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11416E8 {

    /* JADX INFO: renamed from: a */
    private C11344A8 f24243a;

    /* JADX INFO: renamed from: b */
    private View f24244b;

    /* JADX INFO: renamed from: c */
    private View f24245c;

    /* JADX INFO: renamed from: d */
    private View f24246d;

    /* JADX INFO: renamed from: e */
    private View f24247e;

    /* JADX INFO: renamed from: f */
    private View f24248f;

    /* JADX INFO: renamed from: g */
    private View f24249g;

    /* JADX INFO: renamed from: h */
    private View f24250h;

    /* JADX INFO: renamed from: i */
    private a f24251i;

    /* JADX INFO: renamed from: com.ironsource.E8$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo25696a(b bVar);

        /* JADX INFO: renamed from: a */
        void mo25697a(C12394ng c12394ng);
    }

    /* JADX INFO: renamed from: com.ironsource.E8$b */
    public enum b {
        Title("title"),
        Advertiser(C11744X3.i.f26327F0),
        Body("body"),
        Cta("cta"),
        Icon("icon"),
        Container("container"),
        PrivacyIcon(C11744X3.i.f26335J0);


        /* JADX INFO: renamed from: a */
        private final String f24260a;

        b(String str) {
            this.f24260a = str;
        }

        /* JADX INFO: renamed from: b */
        public final String m25699b() {
            return this.f24260a;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.E8$c */
    public static final class c implements C11344A8.a {
        c() {
        }

        @Override // com.ironsource.C11344A8.a
        /* JADX INFO: renamed from: a */
        public void mo25294a(C12394ng viewVisibilityParams) {
            Intrinsics.checkNotNullParameter(viewVisibilityParams, "viewVisibilityParams");
            a aVarM25691n = C11416E8.this.m25691n();
            if (aVarM25691n != null) {
                aVarM25691n.mo25697a(viewVisibilityParams);
            }
        }
    }

    public C11416E8(C11344A8 containerView, View view, View view2, View view3, View view4, View view5, View view6, View privacyIconView) {
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(privacyIconView, "privacyIconView");
        this.f24243a = containerView;
        this.f24244b = view;
        this.f24245c = view2;
        this.f24246d = view3;
        this.f24247e = view4;
        this.f24248f = view5;
        this.f24249g = view6;
        this.f24250h = privacyIconView;
        m25666r();
        m25667s();
    }

    /* JADX INFO: renamed from: r */
    private final void m25666r() {
        m25664a(this, this.f24244b, b.Title);
        m25664a(this, this.f24245c, b.Advertiser);
        m25664a(this, this.f24247e, b.Body);
        m25664a(this, this.f24249g, b.Cta);
        m25664a(this, this.f24246d, b.Icon);
        m25664a(this, this.f24243a, b.Container);
        m25664a(this, this.f24250h, b.PrivacyIcon);
    }

    /* JADX INFO: renamed from: s */
    private final void m25667s() {
        this.f24243a.setListener$mediationsdk_release(new c());
    }

    /* JADX INFO: renamed from: a */
    public final C11344A8 m25668a() {
        return this.f24243a;
    }

    /* JADX INFO: renamed from: b */
    public final View m25673b() {
        return this.f24244b;
    }

    /* JADX INFO: renamed from: c */
    public final View m25675c() {
        return this.f24245c;
    }

    /* JADX INFO: renamed from: d */
    public final View m25677d() {
        return this.f24246d;
    }

    /* JADX INFO: renamed from: e */
    public final View m25679e() {
        return this.f24247e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11416E8)) {
            return false;
        }
        C11416E8 c11416e8 = (C11416E8) obj;
        return Intrinsics.areEqual(this.f24243a, c11416e8.f24243a) && Intrinsics.areEqual(this.f24244b, c11416e8.f24244b) && Intrinsics.areEqual(this.f24245c, c11416e8.f24245c) && Intrinsics.areEqual(this.f24246d, c11416e8.f24246d) && Intrinsics.areEqual(this.f24247e, c11416e8.f24247e) && Intrinsics.areEqual(this.f24248f, c11416e8.f24248f) && Intrinsics.areEqual(this.f24249g, c11416e8.f24249g) && Intrinsics.areEqual(this.f24250h, c11416e8.f24250h);
    }

    /* JADX INFO: renamed from: f */
    public final View m25681f() {
        return this.f24248f;
    }

    /* JADX INFO: renamed from: g */
    public final View m25683g() {
        return this.f24249g;
    }

    /* JADX INFO: renamed from: h */
    public final View m25685h() {
        return this.f24250h;
    }

    public int hashCode() {
        int iHashCode = this.f24243a.hashCode() * 31;
        View view = this.f24244b;
        int iHashCode2 = (iHashCode + (view == null ? 0 : view.hashCode())) * 31;
        View view2 = this.f24245c;
        int iHashCode3 = (iHashCode2 + (view2 == null ? 0 : view2.hashCode())) * 31;
        View view3 = this.f24246d;
        int iHashCode4 = (iHashCode3 + (view3 == null ? 0 : view3.hashCode())) * 31;
        View view4 = this.f24247e;
        int iHashCode5 = (iHashCode4 + (view4 == null ? 0 : view4.hashCode())) * 31;
        View view5 = this.f24248f;
        int iHashCode6 = (iHashCode5 + (view5 == null ? 0 : view5.hashCode())) * 31;
        View view6 = this.f24249g;
        return ((iHashCode6 + (view6 != null ? view6.hashCode() : 0)) * 31) + this.f24250h.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public final View m25686i() {
        return this.f24245c;
    }

    /* JADX INFO: renamed from: j */
    public final View m25687j() {
        return this.f24247e;
    }

    /* JADX INFO: renamed from: k */
    public final C11344A8 m25688k() {
        return this.f24243a;
    }

    /* JADX INFO: renamed from: l */
    public final View m25689l() {
        return this.f24249g;
    }

    /* JADX INFO: renamed from: m */
    public final View m25690m() {
        return this.f24246d;
    }

    /* JADX INFO: renamed from: n */
    public final a m25691n() {
        return this.f24251i;
    }

    /* JADX INFO: renamed from: o */
    public final View m25692o() {
        return this.f24248f;
    }

    /* JADX INFO: renamed from: p */
    public final View m25693p() {
        return this.f24250h;
    }

    /* JADX INFO: renamed from: q */
    public final View m25694q() {
        return this.f24244b;
    }

    /* JADX INFO: renamed from: t */
    public final JSONObject m25695t() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("title", this.f24244b != null).put(C11744X3.i.f26327F0, this.f24245c != null).put("body", this.f24247e != null).put("cta", this.f24249g != null).put("media", this.f24248f != null).put("icon", this.f24246d != null);
        Intrinsics.checkNotNullExpressionValue(jSONObjectPut, "JSONObject()\n        .pu…\"icon\", iconView != null)");
        return jSONObjectPut;
    }

    public String toString() {
        return "ISNNativeAdViewHolder(containerView=" + this.f24243a + ", titleView=" + this.f24244b + ", advertiserView=" + this.f24245c + ", iconView=" + this.f24246d + ", bodyView=" + this.f24247e + ", mediaView=" + this.f24248f + ", ctaView=" + this.f24249g + ", privacyIconView=" + this.f24250h + ")";
    }

    /* JADX INFO: renamed from: a */
    public final C11416E8 m25669a(C11344A8 containerView, View view, View view2, View view3, View view4, View view5, View view6, View privacyIconView) {
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(privacyIconView, "privacyIconView");
        return new C11416E8(containerView, view, view2, view3, view4, view5, view6, privacyIconView);
    }

    /* JADX INFO: renamed from: b */
    public final void m25674b(View view) {
        this.f24247e = view;
    }

    /* JADX INFO: renamed from: c */
    public final void m25676c(View view) {
        this.f24249g = view;
    }

    /* JADX INFO: renamed from: d */
    public final void m25678d(View view) {
        this.f24246d = view;
    }

    /* JADX INFO: renamed from: e */
    public final void m25680e(View view) {
        this.f24248f = view;
    }

    /* JADX INFO: renamed from: f */
    public final void m25682f(View view) {
        Intrinsics.checkNotNullParameter(view, "<set-?>");
        this.f24250h = view;
    }

    /* JADX INFO: renamed from: g */
    public final void m25684g(View view) {
        this.f24244b = view;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C11416E8 m25663a(C11416E8 c11416e8, C11344A8 c11344a8, View view, View view2, View view3, View view4, View view5, View view6, View view7, int i, Object obj) {
        if ((i & 1) != 0) {
            c11344a8 = c11416e8.f24243a;
        }
        if ((i & 2) != 0) {
            view = c11416e8.f24244b;
        }
        if ((i & 4) != 0) {
            view2 = c11416e8.f24245c;
        }
        if ((i & 8) != 0) {
            view3 = c11416e8.f24246d;
        }
        if ((i & 16) != 0) {
            view4 = c11416e8.f24247e;
        }
        if ((i & 32) != 0) {
            view5 = c11416e8.f24248f;
        }
        if ((i & 64) != 0) {
            view6 = c11416e8.f24249g;
        }
        if ((i & 128) != 0) {
            view7 = c11416e8.f24250h;
        }
        View view8 = view6;
        View view9 = view7;
        View view10 = view4;
        View view11 = view5;
        return c11416e8.m25669a(c11344a8, view, view2, view3, view10, view11, view8, view9);
    }

    /* JADX INFO: renamed from: a */
    public final void m25671a(C11344A8 c11344a8) {
        Intrinsics.checkNotNullParameter(c11344a8, "<set-?>");
        this.f24243a = c11344a8;
    }

    /* JADX INFO: renamed from: a */
    public final void m25670a(View view) {
        this.f24245c = view;
    }

    /* JADX INFO: renamed from: a */
    public final void m25672a(a aVar) {
        this.f24251i = aVar;
    }

    /* JADX INFO: renamed from: a */
    private static final void m25664a(final C11416E8 c11416e8, View view, final b bVar) {
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.ironsource.E8$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C11416E8.m25665a(this.f$0, bVar, view2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static final void m25665a(C11416E8 this$0, b viewName, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(viewName, "$viewName");
        a aVar = this$0.f24251i;
        if (aVar != null) {
            aVar.mo25696a(viewName);
        }
    }

    public /* synthetic */ C11416E8(C11344A8 c11344a8, View view, View view2, View view3, View view4, View view5, View view6, View view7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c11344a8, (i & 2) != 0 ? null : view, (i & 4) != 0 ? null : view2, (i & 8) != 0 ? null : view3, (i & 16) != 0 ? null : view4, (i & 32) != 0 ? null : view5, (i & 64) != 0 ? null : view6, view7);
    }
}
