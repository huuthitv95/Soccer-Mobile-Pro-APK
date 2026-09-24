package com.chartboost.sdk.impl;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.net.URL;
import java.security.InvalidParameterException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.yk */
/* JADX INFO: loaded from: classes3.dex */
public final class C4189yk {

    /* JADX INFO: renamed from: e */
    public static final b f17067e = new b(null);

    /* JADX INFO: renamed from: a */
    public final String f17068a;

    /* JADX INFO: renamed from: b */
    public final URL f17069b;

    /* JADX INFO: renamed from: c */
    public final String f17070c;

    /* JADX INFO: renamed from: d */
    public final String f17071d;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.yk$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final String f17072a;

        /* JADX INFO: renamed from: b */
        public String f17073b;

        /* JADX INFO: renamed from: c */
        public String f17074c;

        /* JADX INFO: renamed from: d */
        public String f17075d;

        /* JADX INFO: renamed from: e */
        public String f17076e;

        public a(String javascriptResourceUrl) {
            Intrinsics.checkNotNullParameter(javascriptResourceUrl, "javascriptResourceUrl");
            this.f17072a = javascriptResourceUrl;
            this.f17073b = CampaignEx.KEY_OMID;
        }

        /* JADX INFO: renamed from: a */
        public final a m20073a(String str) {
            this.f17073b = str;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public final C4189yk m20074a() {
            try {
                return new C4189yk(this);
            } catch (Exception unused) {
                return null;
            }
        }

        /* JADX INFO: renamed from: b */
        public final a m20075b(String str) {
            this.f17074c = str;
            return this;
        }

        /* JADX INFO: renamed from: b */
        public final String m20076b() {
            return this.f17073b;
        }

        /* JADX INFO: renamed from: c */
        public final a m20077c(String str) {
            this.f17075d = str;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public final String m20078c() {
            return this.f17072a;
        }

        /* JADX INFO: renamed from: d */
        public final String m20079d() {
            return this.f17074c;
        }

        /* JADX INFO: renamed from: e */
        public final String m20080e() {
            return this.f17076e;
        }

        /* JADX INFO: renamed from: f */
        public final String m20081f() {
            return this.f17075d;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.yk$b */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C4189yk m20082a(C4037s0 adVerification) {
            String strM18204b;
            Intrinsics.checkNotNullParameter(adVerification, "adVerification");
            C3846jb c3846jbM19368a = adVerification.m19368a();
            if (c3846jbM19368a == null || (strM18204b = c3846jbM19368a.m18204b()) == null) {
                return null;
            }
            a aVar = new a(strM18204b);
            String strM18203a = c3846jbM19368a.m18203a();
            if (strM18203a == null) {
                strM18203a = "";
            }
            a aVarM20073a = aVar.m20073a(strM18203a);
            String strM19369b = adVerification.m19369b();
            aVarM20073a.m20075b(strM19369b != null ? strM19369b : "").m20077c(adVerification.m19370c());
            return aVar.m20074a();
        }

        /* JADX INFO: renamed from: a */
        public final Set m20083a(List adVerifications) {
            Intrinsics.checkNotNullParameter(adVerifications, "adVerifications");
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it = adVerifications.iterator();
            while (it.hasNext()) {
                C4189yk c4189ykM20082a = C4189yk.f17067e.m20082a((C4037s0) it.next());
                if (c4189ykM20082a != null) {
                    linkedHashSet.add(c4189ykM20082a);
                }
            }
            return linkedHashSet;
        }
    }

    public C4189yk(a builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        if (!StringsKt.equals(CampaignEx.KEY_OMID, builder.m20076b(), true) || TextUtils.isEmpty(builder.m20078c())) {
            throw new InvalidParameterException("ViewabilityVendor cannot be created.");
        }
        this.f17068a = builder.m20079d();
        this.f17069b = new URL(builder.m20078c());
        this.f17070c = builder.m20081f();
        this.f17071d = builder.m20080e();
    }

    /* JADX INFO: renamed from: a */
    public final URL m20070a() {
        return this.f17069b;
    }

    /* JADX INFO: renamed from: b */
    public final String m20071b() {
        return this.f17068a;
    }

    /* JADX INFO: renamed from: c */
    public final String m20072c() {
        return this.f17070c;
    }
}
