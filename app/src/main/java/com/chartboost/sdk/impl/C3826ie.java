package com.chartboost.sdk.impl;

import android.os.Build;
import com.chartboost.sdk.privacy.model.COPPA;
import com.chartboost.sdk.privacy.model.DataUseConsent;
import com.ironsource.C11744X3;
import com.ironsource.C11794a2;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.SequencesKt;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.JsonElementBuildersKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectBuilder;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.ie */
/* JADX INFO: loaded from: classes3.dex */
public final class C3826ie {

    /* JADX INFO: renamed from: d */
    public static final a f14663d = new a(null);

    /* JADX INFO: renamed from: a */
    public final C3690cg f14664a;

    /* JADX INFO: renamed from: b */
    public final C4190z f14665b;

    /* JADX INFO: renamed from: c */
    public final C3665be f14666c;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.ie$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.ie$b */
    public static final class b extends Lambda implements Function1 {

        /* JADX INFO: renamed from: b */
        public static final b f14667b = new b();

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(MatchResult it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return StringsKt.toIntOrNull(it.getValue());
        }
    }

    public C3826ie(C3690cg requestBodyFields, C4190z c4190z, C3665be c3665be) {
        Intrinsics.checkNotNullParameter(requestBodyFields, "requestBodyFields");
        this.f14664a = requestBodyFields;
        this.f14665b = c4190z;
        this.f14666c = c3665be;
    }

    /* JADX INFO: renamed from: a */
    public final C3841j6 m18003a(C3958o9 c3958o9) {
        return new C3841j6(c3958o9.m18897d(), c3958o9.m18898e());
    }

    /* JADX INFO: renamed from: a */
    public final C3883l2 m18004a() {
        return new C3883l2(m18011e(), m18008b(), m18010d(), m18013g(), 0, m18012f());
    }

    /* JADX INFO: renamed from: a */
    public final List m18005a(int i, int i2) {
        return CollectionsKt.listOf(new C4063t4(Integer.valueOf(i), Integer.valueOf(i2)));
    }

    /* JADX INFO: renamed from: a */
    public final List m18006a(String str) {
        if (str != null && !StringsKt.isBlank(str)) {
            List list = SequencesKt.toList(SequencesKt.mapNotNull(Regex.findAll$default(new Regex("(?<!\\d)-?\\d+"), str, 0, 2, null), b.f14667b));
            if (!list.isEmpty()) {
                return list;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final JsonObject m18007a(C4139we c4139we) {
        JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
        List<DataUseConsent> listM19799i = c4139we.m19799i();
        if (listM19799i != null) {
            for (DataUseConsent dataUseConsent : listM19799i) {
                if (!Intrinsics.areEqual(dataUseConsent.getPrivacyStandardName(), COPPA.COPPA_STANDARD)) {
                    JsonElementBuildersKt.put(jsonObjectBuilder, dataUseConsent.getPrivacyStandardName(), dataUseConsent.getConsent().toString());
                }
            }
        }
        return jsonObjectBuilder.build();
    }

    /* JADX INFO: renamed from: b */
    public final C3905m1 m18008b() {
        C3690cg c3690cg = this.f14664a;
        return new C3905m1(c3690cg.f13727h, c3690cg.f13725f);
    }

    /* JADX INFO: renamed from: c */
    public final C3676c2 m18009c() {
        AbstractC3628a0 abstractC3628a0M20084a;
        C4190z c4190z = this.f14665b;
        if (c4190z == null || (abstractC3628a0M20084a = c4190z.m20084a()) == null || !Intrinsics.areEqual(abstractC3628a0M20084a, AbstractC3628a0.a.f13428g)) {
            return null;
        }
        Integer numM20088e = this.f14665b.m20088e();
        Integer numM20085b = this.f14665b.m20085b();
        String strM16771b = abstractC3628a0M20084a.m16771b();
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase = strM16771b.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return new C3676c2(numM20088e, numM20085b, new C3722e2(lowerCase));
    }

    /* JADX INFO: renamed from: d */
    public final C3772g6 m18010d() {
        C3958o9 c3958o9M17187c = this.f14664a.m17187c();
        Integer numValueOf = Integer.valueOf(c3958o9M17187c.m18899f().m18685b());
        String strM20065a = C4187yi.f17062b.m20065a();
        Integer numM17189e = this.f14664a.m17189e();
        C3690cg c3690cg = this.f14664a;
        String str = c3690cg.f13730k;
        String str2 = c3690cg.f13720a;
        String str3 = Build.VERSION.RELEASE;
        Integer numValueOf2 = Integer.valueOf(c3690cg.m17185b().m17857a());
        Integer numValueOf3 = Integer.valueOf(this.f14664a.m17185b().m17859c());
        C3690cg c3690cg2 = this.f14664a;
        String str4 = c3690cg2.f13723d;
        String str5 = c3690cg2.f13733n;
        Integer numValueOf4 = Integer.valueOf(c3690cg2.m17191g().m18279d().m19428c());
        String strM18894a = c3958o9M17187c.m18894a();
        Intrinsics.checkNotNull(c3958o9M17187c);
        return new C3772g6(numValueOf, strM20065a, numM17189e, str, str2, C11744X3.f26142d, str3, numValueOf2, numValueOf3, (Float) null, str4, str5, numValueOf4, strM18894a, m18003a(c3958o9M17187c), 512, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: renamed from: e */
    public final List m18011e() {
        AbstractC3628a0 abstractC3628a0M20084a;
        C4190z c4190z = this.f14665b;
        if (c4190z == null || (abstractC3628a0M20084a = c4190z.m20084a()) == null) {
            return CollectionsKt.emptyList();
        }
        return CollectionsKt.listOf(new C4046s9(Intrinsics.areEqual(abstractC3628a0M20084a, AbstractC3628a0.a.f13428g) ? m18009c() : null, (Intrinsics.areEqual(abstractC3628a0M20084a, AbstractC3628a0.b.f13429g) || Intrinsics.areEqual(abstractC3628a0M20084a, AbstractC3628a0.c.f13430g)) ? m18014h() : null, "Chartboost-Android-SDK", this.f14664a.f13726g, Integer.valueOf(abstractC3628a0M20084a.m16774e() ? 1 : 0), this.f14665b.m20087d(), 1));
    }

    /* JADX INFO: renamed from: f */
    public final C3873kf m18012f() {
        C4139we c4139we = this.f14664a.f13737r;
        Integer numM19794d = c4139we.m19794d();
        Integer numM19795e = c4139we.m19795e();
        String strM19796f = c4139we.m19796f();
        if (strM19796f == null || StringsKt.isBlank(strM19796f) || Intrinsics.areEqual(strM19796f, C11794a2.f26725f)) {
            strM19796f = null;
        }
        String str = strM19796f;
        String strM19792b = c4139we.m19792b();
        List listM18006a = m18006a(c4139we.m19791a());
        Intrinsics.checkNotNull(c4139we);
        return new C3873kf(numM19794d, numM19795e, str, strM19792b, listM18006a, m18007a(c4139we));
    }

    /* JADX INFO: renamed from: g */
    public final C4165xi m18013g() {
        C4139we c4139we = this.f14664a.f13737r;
        String strM19798h = c4139we.m19798h();
        Integer numM19793c = c4139we.m19793c();
        Integer numValueOf = Integer.valueOf(numM19793c != null ? numM19793c.intValue() : 0);
        C4190z c4190z = this.f14665b;
        return new C4165xi(strM19798h, new C4209zi(numValueOf, Integer.valueOf(c4190z != null ? c4190z.m20086c() : 0), Long.valueOf(this.f14664a.m17192h().m19431b())));
    }

    /* JADX INFO: renamed from: h */
    public final C4056sj m18014h() {
        AbstractC3628a0 abstractC3628a0M20084a;
        C4190z c4190z = this.f14665b;
        if (c4190z == null || (abstractC3628a0M20084a = c4190z.m20084a()) == null) {
            return null;
        }
        if (!Intrinsics.areEqual(abstractC3628a0M20084a, AbstractC3628a0.b.f13429g) && !Intrinsics.areEqual(abstractC3628a0M20084a, AbstractC3628a0.c.f13430g)) {
            return null;
        }
        int iM17859c = this.f14664a.m17185b().m17859c();
        int iM17857a = this.f14664a.m17185b().m17857a();
        Integer numValueOf = Integer.valueOf(iM17859c);
        Integer numValueOf2 = Integer.valueOf(iM17857a);
        List listM18005a = m18005a(iM17859c, iM17857a);
        String strM16771b = abstractC3628a0M20084a.m16771b();
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase = strM16771b.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return new C4056sj(numValueOf, numValueOf2, 5, listM18005a, new C3648ak(lowerCase));
    }
}
