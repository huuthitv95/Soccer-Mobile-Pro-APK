package com.chartboost.sdk.impl;

import android.content.Context;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.xb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4158xb {

    /* JADX INFO: renamed from: a */
    public static final Map f16934a = MapsKt.mapOf(TuplesKt.m43482to(EnumC3854jj.TIMESTAMP, b.f16936b), TuplesKt.m43482to(EnumC3854jj.CACHEBUSTING, c.f16937b), TuplesKt.m43482to(EnumC3854jj.ERRORCODE, d.f16938b), TuplesKt.m43482to(EnumC3854jj.REASON, e.f16939b), TuplesKt.m43482to(EnumC3854jj.LIMITADTRACKING, f.f16940b), TuplesKt.m43482to(EnumC3854jj.APPBUNDLE, g.f16941b), TuplesKt.m43482to(EnumC3854jj.OMIDPARTNER, h.f16942b));

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.xb$a */
    public static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C4092ub f16935b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C4092ub c4092ub) {
            super(1);
            this.f16935b = c4092ub;
        }

        /* JADX WARN: Code restructure failed: missing block: B:6:0x001f, code lost:
        
            r0 = (java.lang.String) r0.invoke(r1);
         */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.CharSequence invoke(kotlin.text.MatchResult r5) {
            /*
                r4 = this;
                java.lang.String r0 = "match"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                java.lang.String r5 = r5.getValue()
                com.chartboost.sdk.impl.jj$a r0 = com.chartboost.sdk.impl.EnumC3854jj.f14981c
                com.chartboost.sdk.impl.jj r0 = r0.m18292a(r5)
                if (r0 == 0) goto L48
                com.chartboost.sdk.impl.ub r1 = r4.f16935b
                java.util.Map r2 = com.chartboost.sdk.impl.AbstractC4158xb.m19949a()
                java.lang.Object r0 = r2.get(r0)
                kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
                if (r0 == 0) goto L41
                java.lang.Object r0 = r0.invoke(r1)
                java.lang.String r0 = (java.lang.String) r0
                if (r0 == 0) goto L41
                java.lang.String r1 = "UTF-8"
                java.lang.String r0 = java.net.URLEncoder.encode(r0, r1)     // Catch: java.io.UnsupportedEncodingException -> L2e
                goto L42
            L2e:
                r1 = move-exception
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "Failed to encode macro value: "
                r2.<init>(r3)
                r2.append(r0)
                java.lang.String r2 = r2.toString()
                com.chartboost.sdk.impl.C4048sb.m19410b(r2, r1)
                goto L42
            L41:
                r0 = 0
            L42:
                if (r0 != 0) goto L45
                r0 = r5
            L45:
                if (r0 == 0) goto L48
                r5 = r0
            L48:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.impl.AbstractC4158xb.a.invoke(kotlin.text.MatchResult):java.lang.CharSequence");
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.xb$b */
    public static final class b extends Lambda implements Function1 {

        /* JADX INFO: renamed from: b */
        public static final b f16936b = new b();

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(C4092ub context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return AbstractC4158xb.m19947a(context.m19582c());
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.xb$c */
    public static final class c extends Lambda implements Function1 {

        /* JADX INFO: renamed from: b */
        public static final c f16937b = new c();

        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(C4092ub context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return StringsKt.padStart(String.valueOf(context.m19581b()), 8, '0');
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.xb$d */
    public static final class d extends Lambda implements Function1 {

        /* JADX INFO: renamed from: b */
        public static final d f16938b = new d();

        public d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(C4092ub context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Integer numM19583d = context.m19583d();
            return String.valueOf(numM19583d != null ? numM19583d.intValue() : -1);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.xb$e */
    public static final class e extends Lambda implements Function1 {

        /* JADX INFO: renamed from: b */
        public static final e f16939b = new e();

        public e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(C4092ub context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Integer numM19586g = context.m19586g();
            return String.valueOf(numM19586g != null ? numM19586g.intValue() : -1);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.xb$f */
    /* JADX INFO: loaded from: classes9.dex */
    public static final class f extends Lambda implements Function1 {

        /* JADX INFO: renamed from: b */
        public static final f f16940b = new f();

        public f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(C4092ub context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return String.valueOf(context.m19584e());
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.xb$g */
    public static final class g extends Lambda implements Function1 {

        /* JADX INFO: renamed from: b */
        public static final g f16941b = new g();

        public g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(C4092ub context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return context.m19580a();
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.xb$h */
    public static final class h extends Lambda implements Function1 {

        /* JADX INFO: renamed from: b */
        public static final h f16942b = new h();

        public h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(C4092ub context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return context.m19585f();
        }
    }

    /* JADX INFO: renamed from: a */
    public static final C4092ub m19946a(Context context, C3665be openMeasurementManager, C4105v2 identity, Function1 block) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(openMeasurementManager, "openMeasurementManager");
        Intrinsics.checkNotNullParameter(identity, "identity");
        Intrinsics.checkNotNullParameter(block, "block");
        C4114vb c4114vb = new C4114vb(context, openMeasurementManager, identity);
        block.invoke(c4114vb);
        return c4114vb.m19693a();
    }

    /* JADX INFO: renamed from: a */
    public static final String m19947a(long j) {
        String str = Instant.ofEpochMilli(j).atZone(ZoneId.systemDefault()).format(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSXXX"));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    /* JADX INFO: renamed from: a */
    public static final String m19948a(String str, C4092ub context) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        return new Regex("\\[[A-Z0-9]+]").replace(str, new a(context));
    }
}
