package com.ironsource;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.P3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11609P3 {

    /* JADX INFO: renamed from: a */
    private final c f25339a;

    /* JADX INFO: renamed from: b */
    private final a f25340b;

    /* JADX INFO: renamed from: c */
    private final d f25341c;

    /* JADX INFO: renamed from: d */
    private final b f25342d;

    /* JADX INFO: renamed from: com.ironsource.P3$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private final g f25343a;

        /* JADX INFO: renamed from: b */
        private final c f25344b;

        /* JADX INFO: renamed from: c */
        private final b f25345c;

        /* JADX INFO: renamed from: d */
        private final d f25346d;

        /* JADX INFO: renamed from: com.ironsource.P3$a$a, reason: collision with other inner class name */
        public interface InterfaceC15510a {
            /* JADX INFO: renamed from: a */
            List<e> mo26835a();
        }

        /* JADX INFO: renamed from: com.ironsource.P3$a$b */
        public static final class b implements InterfaceC15510a {

            /* JADX INFO: renamed from: a */
            private final List<e> f25347a;

            /* JADX INFO: renamed from: b */
            private final Integer f25348b;

            /* JADX INFO: renamed from: c */
            private final Long f25349c;

            /* JADX INFO: renamed from: d */
            private final c.C15513c f25350d;

            /* JADX INFO: renamed from: e */
            private final Integer f25351e;

            /* JADX INFO: renamed from: f */
            private final Boolean f25352f;

            /* JADX INFO: renamed from: g */
            private final Long f25353g;

            /* JADX INFO: renamed from: h */
            private final Boolean f25354h;

            /* JADX INFO: renamed from: i */
            private final JSONObject f25355i;

            /* JADX INFO: renamed from: j */
            private final Boolean f25356j;

            /* JADX INFO: renamed from: k */
            private final Integer f25357k;

            /* JADX INFO: renamed from: l */
            private final Integer f25358l;

            /* JADX INFO: renamed from: m */
            private final Integer f25359m;

            /* JADX INFO: renamed from: n */
            private final f f25360n;

            public b() {
                this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
            }

            /* JADX INFO: renamed from: A */
            public final Boolean m26837A() {
                return this.f25354h;
            }

            /* JADX INFO: renamed from: B */
            public final Boolean m26838B() {
                return this.f25356j;
            }

            /* JADX INFO: renamed from: a */
            public final b m26839a(List<e> list, Integer num, Long l, c.C15513c c15513c, Integer num2, Boolean bool, Long l2, Boolean bool2, JSONObject jSONObject, Boolean bool3, Integer num3, Integer num4, Integer num5, f fVar) {
                return new b(list, num, l, c15513c, num2, bool, l2, bool2, jSONObject, bool3, num3, num4, num5, fVar);
            }

            /* JADX INFO: renamed from: b */
            public final List<e> m26840b() {
                return this.f25347a;
            }

            /* JADX INFO: renamed from: c */
            public final Boolean m26841c() {
                return this.f25356j;
            }

            /* JADX INFO: renamed from: d */
            public final Integer m26842d() {
                return this.f25357k;
            }

            /* JADX INFO: renamed from: e */
            public final Integer m26843e() {
                return this.f25358l;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return Intrinsics.areEqual(this.f25347a, bVar.f25347a) && Intrinsics.areEqual(this.f25348b, bVar.f25348b) && Intrinsics.areEqual(this.f25349c, bVar.f25349c) && Intrinsics.areEqual(this.f25350d, bVar.f25350d) && Intrinsics.areEqual(this.f25351e, bVar.f25351e) && Intrinsics.areEqual(this.f25352f, bVar.f25352f) && Intrinsics.areEqual(this.f25353g, bVar.f25353g) && Intrinsics.areEqual(this.f25354h, bVar.f25354h) && Intrinsics.areEqual(this.f25355i, bVar.f25355i) && Intrinsics.areEqual(this.f25356j, bVar.f25356j) && Intrinsics.areEqual(this.f25357k, bVar.f25357k) && Intrinsics.areEqual(this.f25358l, bVar.f25358l) && Intrinsics.areEqual(this.f25359m, bVar.f25359m) && Intrinsics.areEqual(this.f25360n, bVar.f25360n);
            }

            /* JADX INFO: renamed from: f */
            public final Integer m26844f() {
                return this.f25359m;
            }

            /* JADX INFO: renamed from: g */
            public final f m26845g() {
                return this.f25360n;
            }

            /* JADX INFO: renamed from: h */
            public final Integer m26846h() {
                return this.f25348b;
            }

            public int hashCode() {
                List<e> list = this.f25347a;
                int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
                Integer num = this.f25348b;
                int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
                Long l = this.f25349c;
                int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
                c.C15513c c15513c = this.f25350d;
                int iHashCode4 = (iHashCode3 + (c15513c == null ? 0 : c15513c.hashCode())) * 31;
                Integer num2 = this.f25351e;
                int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
                Boolean bool = this.f25352f;
                int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
                Long l2 = this.f25353g;
                int iHashCode7 = (iHashCode6 + (l2 == null ? 0 : l2.hashCode())) * 31;
                Boolean bool2 = this.f25354h;
                int iHashCode8 = (iHashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                JSONObject jSONObject = this.f25355i;
                int iHashCode9 = (iHashCode8 + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
                Boolean bool3 = this.f25356j;
                int iHashCode10 = (iHashCode9 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
                Integer num3 = this.f25357k;
                int iHashCode11 = (iHashCode10 + (num3 == null ? 0 : num3.hashCode())) * 31;
                Integer num4 = this.f25358l;
                int iHashCode12 = (iHashCode11 + (num4 == null ? 0 : num4.hashCode())) * 31;
                Integer num5 = this.f25359m;
                int iHashCode13 = (iHashCode12 + (num5 == null ? 0 : num5.hashCode())) * 31;
                f fVar = this.f25360n;
                return iHashCode13 + (fVar != null ? fVar.hashCode() : 0);
            }

            /* JADX INFO: renamed from: i */
            public final Long m26847i() {
                return this.f25349c;
            }

            /* JADX INFO: renamed from: j */
            public final c.C15513c m26848j() {
                return this.f25350d;
            }

            /* JADX INFO: renamed from: k */
            public final Integer m26849k() {
                return this.f25351e;
            }

            /* JADX INFO: renamed from: l */
            public final Boolean m26850l() {
                return this.f25352f;
            }

            /* JADX INFO: renamed from: m */
            public final Long m26851m() {
                return this.f25353g;
            }

            /* JADX INFO: renamed from: n */
            public final Boolean m26852n() {
                return this.f25354h;
            }

            /* JADX INFO: renamed from: o */
            public final JSONObject m26853o() {
                return this.f25355i;
            }

            /* JADX INFO: renamed from: p */
            public final JSONObject m26854p() {
                return this.f25355i;
            }

            /* JADX INFO: renamed from: q */
            public final Integer m26855q() {
                return this.f25359m;
            }

            /* JADX INFO: renamed from: r */
            public final Integer m26856r() {
                return this.f25358l;
            }

            /* JADX INFO: renamed from: s */
            public final Long m26857s() {
                return this.f25349c;
            }

            /* JADX INFO: renamed from: t */
            public final Integer m26858t() {
                return this.f25351e;
            }

            public String toString() {
                return "Banner(placements=" + this.f25347a + ", maxNumOfAdaptersToLoadOnStart=" + this.f25348b + ", atim=" + this.f25349c + ", events=" + this.f25350d + ", bannerInterval=" + this.f25351e + ", collectBiddingDataAsyncEnabled=" + this.f25352f + ", collectBiddingDataTimeout=" + this.f25353g + ", sharedManagersThread=" + this.f25354h + ", adUnits=" + this.f25355i + ", isOneFlow=" + this.f25356j + ", delayLoadFailure=" + this.f25357k + ", advancedLoading=" + this.f25358l + ", adapterTimeOutInSeconds=" + this.f25359m + ", providers=" + this.f25360n + ")";
            }

            /* JADX INFO: renamed from: u */
            public final Boolean m26859u() {
                return this.f25352f;
            }

            /* JADX INFO: renamed from: v */
            public final Long m26860v() {
                return this.f25353g;
            }

            /* JADX INFO: renamed from: w */
            public final Integer m26861w() {
                return this.f25357k;
            }

            /* JADX INFO: renamed from: x */
            public final c.C15513c m26862x() {
                return this.f25350d;
            }

            /* JADX INFO: renamed from: y */
            public final Integer m26863y() {
                return this.f25348b;
            }

            /* JADX INFO: renamed from: z */
            public final f m26864z() {
                return this.f25360n;
            }

            public b(List<e> list, Integer num, Long l, c.C15513c c15513c, Integer num2, Boolean bool, Long l2, Boolean bool2, JSONObject jSONObject, Boolean bool3, Integer num3, Integer num4, Integer num5, f fVar) {
                this.f25347a = list;
                this.f25348b = num;
                this.f25349c = l;
                this.f25350d = c15513c;
                this.f25351e = num2;
                this.f25352f = bool;
                this.f25353g = l2;
                this.f25354h = bool2;
                this.f25355i = jSONObject;
                this.f25356j = bool3;
                this.f25357k = num3;
                this.f25358l = num4;
                this.f25359m = num5;
                this.f25360n = fVar;
            }

            @Override // com.ironsource.C11609P3.a.InterfaceC15510a
            /* JADX INFO: renamed from: a */
            public List<e> mo26835a() {
                return this.f25347a;
            }

            public /* synthetic */ b(List list, Integer num, Long l, c.C15513c c15513c, Integer num2, Boolean bool, Long l2, Boolean bool2, JSONObject jSONObject, Boolean bool3, Integer num3, Integer num4, Integer num5, f fVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : c15513c, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : l2, (i & 128) != 0 ? null : bool2, (i & 256) != 0 ? null : jSONObject, (i & 512) != 0 ? null : bool3, (i & 1024) != 0 ? null : num3, (i & 2048) != 0 ? null : num4, (i & 4096) != 0 ? null : num5, (i & 8192) != 0 ? null : fVar);
            }
        }

        /* JADX INFO: renamed from: com.ironsource.P3$a$c */
        public static final class c implements InterfaceC15510a {

            /* JADX INFO: renamed from: a */
            private final List<e> f25361a;

            /* JADX INFO: renamed from: b */
            private final c.C15513c f25362b;

            /* JADX INFO: renamed from: c */
            private final Integer f25363c;

            /* JADX INFO: renamed from: d */
            private final Integer f25364d;

            /* JADX INFO: renamed from: e */
            private final Integer f25365e;

            /* JADX INFO: renamed from: f */
            private final Boolean f25366f;

            /* JADX INFO: renamed from: g */
            private final Long f25367g;

            /* JADX INFO: renamed from: h */
            private final Boolean f25368h;

            /* JADX INFO: renamed from: i */
            private final JSONObject f25369i;

            /* JADX INFO: renamed from: j */
            private final Integer f25370j;

            /* JADX INFO: renamed from: k */
            private final Integer f25371k;

            /* JADX INFO: renamed from: l */
            private final Boolean f25372l;

            /* JADX INFO: renamed from: m */
            private final Integer f25373m;

            /* JADX INFO: renamed from: n */
            private final Integer f25374n;

            /* JADX INFO: renamed from: o */
            private final f f25375o;

            public c() {
                this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
            }

            /* JADX INFO: renamed from: A */
            public final Integer m26866A() {
                return this.f25373m;
            }

            /* JADX INFO: renamed from: B */
            public final f m26867B() {
                return this.f25375o;
            }

            /* JADX INFO: renamed from: C */
            public final Boolean m26868C() {
                return this.f25368h;
            }

            /* JADX INFO: renamed from: D */
            public final Boolean m26869D() {
                return this.f25372l;
            }

            /* JADX INFO: renamed from: a */
            public final c m26870a(List<e> list, c.C15513c c15513c, Integer num, Integer num2, Integer num3, Boolean bool, Long l, Boolean bool2, JSONObject jSONObject, Integer num4, Integer num5, Boolean bool3, Integer num6, Integer num7, f fVar) {
                return new c(list, c15513c, num, num2, num3, bool, l, bool2, jSONObject, num4, num5, bool3, num6, num7, fVar);
            }

            /* JADX INFO: renamed from: b */
            public final List<e> m26871b() {
                return this.f25361a;
            }

            /* JADX INFO: renamed from: c */
            public final Integer m26872c() {
                return this.f25370j;
            }

            /* JADX INFO: renamed from: d */
            public final Integer m26873d() {
                return this.f25371k;
            }

            /* JADX INFO: renamed from: e */
            public final Boolean m26874e() {
                return this.f25372l;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return Intrinsics.areEqual(this.f25361a, cVar.f25361a) && Intrinsics.areEqual(this.f25362b, cVar.f25362b) && Intrinsics.areEqual(this.f25363c, cVar.f25363c) && Intrinsics.areEqual(this.f25364d, cVar.f25364d) && Intrinsics.areEqual(this.f25365e, cVar.f25365e) && Intrinsics.areEqual(this.f25366f, cVar.f25366f) && Intrinsics.areEqual(this.f25367g, cVar.f25367g) && Intrinsics.areEqual(this.f25368h, cVar.f25368h) && Intrinsics.areEqual(this.f25369i, cVar.f25369i) && Intrinsics.areEqual(this.f25370j, cVar.f25370j) && Intrinsics.areEqual(this.f25371k, cVar.f25371k) && Intrinsics.areEqual(this.f25372l, cVar.f25372l) && Intrinsics.areEqual(this.f25373m, cVar.f25373m) && Intrinsics.areEqual(this.f25374n, cVar.f25374n) && Intrinsics.areEqual(this.f25375o, cVar.f25375o);
            }

            /* JADX INFO: renamed from: f */
            public final Integer m26875f() {
                return this.f25373m;
            }

            /* JADX INFO: renamed from: g */
            public final Integer m26876g() {
                return this.f25374n;
            }

            /* JADX INFO: renamed from: h */
            public final f m26877h() {
                return this.f25375o;
            }

            public int hashCode() {
                List<e> list = this.f25361a;
                int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
                c.C15513c c15513c = this.f25362b;
                int iHashCode2 = (iHashCode + (c15513c == null ? 0 : c15513c.hashCode())) * 31;
                Integer num = this.f25363c;
                int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
                Integer num2 = this.f25364d;
                int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
                Integer num3 = this.f25365e;
                int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
                Boolean bool = this.f25366f;
                int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
                Long l = this.f25367g;
                int iHashCode7 = (iHashCode6 + (l == null ? 0 : l.hashCode())) * 31;
                Boolean bool2 = this.f25368h;
                int iHashCode8 = (iHashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                JSONObject jSONObject = this.f25369i;
                int iHashCode9 = (iHashCode8 + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
                Integer num4 = this.f25370j;
                int iHashCode10 = (iHashCode9 + (num4 == null ? 0 : num4.hashCode())) * 31;
                Integer num5 = this.f25371k;
                int iHashCode11 = (iHashCode10 + (num5 == null ? 0 : num5.hashCode())) * 31;
                Boolean bool3 = this.f25372l;
                int iHashCode12 = (iHashCode11 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
                Integer num6 = this.f25373m;
                int iHashCode13 = (iHashCode12 + (num6 == null ? 0 : num6.hashCode())) * 31;
                Integer num7 = this.f25374n;
                int iHashCode14 = (iHashCode13 + (num7 == null ? 0 : num7.hashCode())) * 31;
                f fVar = this.f25375o;
                return iHashCode14 + (fVar != null ? fVar.hashCode() : 0);
            }

            /* JADX INFO: renamed from: i */
            public final c.C15513c m26878i() {
                return this.f25362b;
            }

            /* JADX INFO: renamed from: j */
            public final Integer m26879j() {
                return this.f25363c;
            }

            /* JADX INFO: renamed from: k */
            public final Integer m26880k() {
                return this.f25364d;
            }

            /* JADX INFO: renamed from: l */
            public final Integer m26881l() {
                return this.f25365e;
            }

            /* JADX INFO: renamed from: m */
            public final Boolean m26882m() {
                return this.f25366f;
            }

            /* JADX INFO: renamed from: n */
            public final Long m26883n() {
                return this.f25367g;
            }

            /* JADX INFO: renamed from: o */
            public final Boolean m26884o() {
                return this.f25368h;
            }

            /* JADX INFO: renamed from: p */
            public final JSONObject m26885p() {
                return this.f25369i;
            }

            /* JADX INFO: renamed from: q */
            public final JSONObject m26886q() {
                return this.f25369i;
            }

            /* JADX INFO: renamed from: r */
            public final Integer m26887r() {
                return this.f25364d;
            }

            /* JADX INFO: renamed from: s */
            public final Integer m26888s() {
                return this.f25371k;
            }

            /* JADX INFO: renamed from: t */
            public final Integer m26889t() {
                return this.f25374n;
            }

            public String toString() {
                return "Interstitial(placements=" + this.f25361a + ", events=" + this.f25362b + ", maxNumOfAdaptersToLoadOnStart=" + this.f25363c + ", adapterTimeOutInSeconds=" + this.f25364d + ", delayLoadFailure=" + this.f25365e + ", collectBiddingDataAsyncEnabled=" + this.f25366f + ", collectBiddingDataTimeout=" + this.f25367g + ", sharedManagersThread=" + this.f25368h + ", adUnits=" + this.f25369i + ", expiredDurationInMinutes=" + this.f25370j + ", advancedLoading=" + this.f25371k + ", isOneFlow=" + this.f25372l + ", parallelLoad=" + this.f25373m + ", atim=" + this.f25374n + ", providers=" + this.f25375o + ")";
            }

            /* JADX INFO: renamed from: u */
            public final Boolean m26890u() {
                return this.f25366f;
            }

            /* JADX INFO: renamed from: v */
            public final Long m26891v() {
                return this.f25367g;
            }

            /* JADX INFO: renamed from: w */
            public final Integer m26892w() {
                return this.f25365e;
            }

            /* JADX INFO: renamed from: x */
            public final c.C15513c m26893x() {
                return this.f25362b;
            }

            /* JADX INFO: renamed from: y */
            public final Integer m26894y() {
                return this.f25370j;
            }

            /* JADX INFO: renamed from: z */
            public final Integer m26895z() {
                return this.f25363c;
            }

            public c(List<e> list, c.C15513c c15513c, Integer num, Integer num2, Integer num3, Boolean bool, Long l, Boolean bool2, JSONObject jSONObject, Integer num4, Integer num5, Boolean bool3, Integer num6, Integer num7, f fVar) {
                this.f25361a = list;
                this.f25362b = c15513c;
                this.f25363c = num;
                this.f25364d = num2;
                this.f25365e = num3;
                this.f25366f = bool;
                this.f25367g = l;
                this.f25368h = bool2;
                this.f25369i = jSONObject;
                this.f25370j = num4;
                this.f25371k = num5;
                this.f25372l = bool3;
                this.f25373m = num6;
                this.f25374n = num7;
                this.f25375o = fVar;
            }

            @Override // com.ironsource.C11609P3.a.InterfaceC15510a
            /* JADX INFO: renamed from: a */
            public List<e> mo26835a() {
                return this.f25361a;
            }

            public /* synthetic */ c(List list, c.C15513c c15513c, Integer num, Integer num2, Integer num3, Boolean bool, Long l, Boolean bool2, JSONObject jSONObject, Integer num4, Integer num5, Boolean bool3, Integer num6, Integer num7, f fVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : c15513c, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : num3, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : l, (i & 128) != 0 ? null : bool2, (i & 256) != 0 ? null : jSONObject, (i & 512) != 0 ? null : num4, (i & 1024) != 0 ? null : num5, (i & 2048) != 0 ? null : bool3, (i & 4096) != 0 ? null : num6, (i & 8192) != 0 ? null : num7, (i & 16384) != 0 ? null : fVar);
            }
        }

        /* JADX INFO: renamed from: com.ironsource.P3$a$d */
        public static final class d implements InterfaceC15510a {

            /* JADX INFO: renamed from: a */
            private final List<e> f25376a;

            /* JADX INFO: renamed from: b */
            private final c.C15513c f25377b;

            /* JADX INFO: renamed from: c */
            private final Boolean f25378c;

            /* JADX INFO: renamed from: d */
            private final Long f25379d;

            /* JADX INFO: renamed from: e */
            private final Boolean f25380e;

            /* JADX INFO: renamed from: f */
            private final JSONObject f25381f;

            /* JADX INFO: renamed from: g */
            private final Integer f25382g;

            /* JADX INFO: renamed from: h */
            private final Integer f25383h;

            /* JADX INFO: renamed from: i */
            private final Integer f25384i;

            /* JADX INFO: renamed from: j */
            private final Integer f25385j;

            /* JADX INFO: renamed from: k */
            private final Long f25386k;

            /* JADX INFO: renamed from: l */
            private final f f25387l;

            public d() {
                this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
            }

            /* JADX INFO: renamed from: a */
            public final d m26897a(List<e> list, c.C15513c c15513c, Boolean bool, Long l, Boolean bool2, JSONObject jSONObject, Integer num, Integer num2, Integer num3, Integer num4, Long l2, f fVar) {
                return new d(list, c15513c, bool, l, bool2, jSONObject, num, num2, num3, num4, l2, fVar);
            }

            /* JADX INFO: renamed from: b */
            public final List<e> m26898b() {
                return this.f25376a;
            }

            /* JADX INFO: renamed from: c */
            public final Integer m26899c() {
                return this.f25385j;
            }

            /* JADX INFO: renamed from: d */
            public final Long m26900d() {
                return this.f25386k;
            }

            /* JADX INFO: renamed from: e */
            public final f m26901e() {
                return this.f25387l;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return Intrinsics.areEqual(this.f25376a, dVar.f25376a) && Intrinsics.areEqual(this.f25377b, dVar.f25377b) && Intrinsics.areEqual(this.f25378c, dVar.f25378c) && Intrinsics.areEqual(this.f25379d, dVar.f25379d) && Intrinsics.areEqual(this.f25380e, dVar.f25380e) && Intrinsics.areEqual(this.f25381f, dVar.f25381f) && Intrinsics.areEqual(this.f25382g, dVar.f25382g) && Intrinsics.areEqual(this.f25383h, dVar.f25383h) && Intrinsics.areEqual(this.f25384i, dVar.f25384i) && Intrinsics.areEqual(this.f25385j, dVar.f25385j) && Intrinsics.areEqual(this.f25386k, dVar.f25386k) && Intrinsics.areEqual(this.f25387l, dVar.f25387l);
            }

            /* JADX INFO: renamed from: f */
            public final c.C15513c m26902f() {
                return this.f25377b;
            }

            /* JADX INFO: renamed from: g */
            public final Boolean m26903g() {
                return this.f25378c;
            }

            /* JADX INFO: renamed from: h */
            public final Long m26904h() {
                return this.f25379d;
            }

            public int hashCode() {
                List<e> list = this.f25376a;
                int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
                c.C15513c c15513c = this.f25377b;
                int iHashCode2 = (iHashCode + (c15513c == null ? 0 : c15513c.hashCode())) * 31;
                Boolean bool = this.f25378c;
                int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
                Long l = this.f25379d;
                int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
                Boolean bool2 = this.f25380e;
                int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                JSONObject jSONObject = this.f25381f;
                int iHashCode6 = (iHashCode5 + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
                Integer num = this.f25382g;
                int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
                Integer num2 = this.f25383h;
                int iHashCode8 = (iHashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
                Integer num3 = this.f25384i;
                int iHashCode9 = (iHashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
                Integer num4 = this.f25385j;
                int iHashCode10 = (iHashCode9 + (num4 == null ? 0 : num4.hashCode())) * 31;
                Long l2 = this.f25386k;
                int iHashCode11 = (iHashCode10 + (l2 == null ? 0 : l2.hashCode())) * 31;
                f fVar = this.f25387l;
                return iHashCode11 + (fVar != null ? fVar.hashCode() : 0);
            }

            /* JADX INFO: renamed from: i */
            public final Boolean m26905i() {
                return this.f25380e;
            }

            /* JADX INFO: renamed from: j */
            public final JSONObject m26906j() {
                return this.f25381f;
            }

            /* JADX INFO: renamed from: k */
            public final Integer m26907k() {
                return this.f25382g;
            }

            /* JADX INFO: renamed from: l */
            public final Integer m26908l() {
                return this.f25383h;
            }

            /* JADX INFO: renamed from: m */
            public final Integer m26909m() {
                return this.f25384i;
            }

            /* JADX INFO: renamed from: n */
            public final JSONObject m26910n() {
                return this.f25381f;
            }

            /* JADX INFO: renamed from: o */
            public final Integer m26911o() {
                return this.f25385j;
            }

            /* JADX INFO: renamed from: p */
            public final Integer m26912p() {
                return this.f25382g;
            }

            /* JADX INFO: renamed from: q */
            public final Long m26913q() {
                return this.f25386k;
            }

            /* JADX INFO: renamed from: r */
            public final Boolean m26914r() {
                return this.f25378c;
            }

            /* JADX INFO: renamed from: s */
            public final Long m26915s() {
                return this.f25379d;
            }

            /* JADX INFO: renamed from: t */
            public final Integer m26916t() {
                return this.f25383h;
            }

            public String toString() {
                return "NativeAd(placements=" + this.f25376a + ", events=" + this.f25377b + ", collectBiddingDataAsyncEnabled=" + this.f25378c + ", collectBiddingDataTimeout=" + this.f25379d + ", sharedManagersThread=" + this.f25380e + ", adUnits=" + this.f25381f + ", advancedLoading=" + this.f25382g + ", delayLoadFailure=" + this.f25383h + ", maxNumOfAdaptersToLoadOnStart=" + this.f25384i + ", adapterTimeOutInSeconds=" + this.f25385j + ", atim=" + this.f25386k + ", providers=" + this.f25387l + ")";
            }

            /* JADX INFO: renamed from: u */
            public final c.C15513c m26917u() {
                return this.f25377b;
            }

            /* JADX INFO: renamed from: v */
            public final Integer m26918v() {
                return this.f25384i;
            }

            /* JADX INFO: renamed from: w */
            public final f m26919w() {
                return this.f25387l;
            }

            /* JADX INFO: renamed from: x */
            public final Boolean m26920x() {
                return this.f25380e;
            }

            public d(List<e> list, c.C15513c c15513c, Boolean bool, Long l, Boolean bool2, JSONObject jSONObject, Integer num, Integer num2, Integer num3, Integer num4, Long l2, f fVar) {
                this.f25376a = list;
                this.f25377b = c15513c;
                this.f25378c = bool;
                this.f25379d = l;
                this.f25380e = bool2;
                this.f25381f = jSONObject;
                this.f25382g = num;
                this.f25383h = num2;
                this.f25384i = num3;
                this.f25385j = num4;
                this.f25386k = l2;
                this.f25387l = fVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX INFO: renamed from: a */
            public static /* synthetic */ d m26896a(d dVar, List list, c.C15513c c15513c, Boolean bool, Long l, Boolean bool2, JSONObject jSONObject, Integer num, Integer num2, Integer num3, Integer num4, Long l2, f fVar, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = dVar.f25376a;
                }
                if ((i & 2) != 0) {
                    c15513c = dVar.f25377b;
                }
                if ((i & 4) != 0) {
                    bool = dVar.f25378c;
                }
                if ((i & 8) != 0) {
                    l = dVar.f25379d;
                }
                if ((i & 16) != 0) {
                    bool2 = dVar.f25380e;
                }
                if ((i & 32) != 0) {
                    jSONObject = dVar.f25381f;
                }
                if ((i & 64) != 0) {
                    num = dVar.f25382g;
                }
                if ((i & 128) != 0) {
                    num2 = dVar.f25383h;
                }
                if ((i & 256) != 0) {
                    num3 = dVar.f25384i;
                }
                if ((i & 512) != 0) {
                    num4 = dVar.f25385j;
                }
                if ((i & 1024) != 0) {
                    l2 = dVar.f25386k;
                }
                if ((i & 2048) != 0) {
                    fVar = dVar.f25387l;
                }
                Long l3 = l2;
                f fVar2 = fVar;
                Integer num5 = num3;
                Integer num6 = num4;
                Integer num7 = num;
                Integer num8 = num2;
                Boolean bool3 = bool2;
                JSONObject jSONObject2 = jSONObject;
                return dVar.m26897a(list, c15513c, bool, l, bool3, jSONObject2, num7, num8, num5, num6, l3, fVar2);
            }

            @Override // com.ironsource.C11609P3.a.InterfaceC15510a
            /* JADX INFO: renamed from: a */
            public List<e> mo26835a() {
                return this.f25376a;
            }

            public /* synthetic */ d(List list, c.C15513c c15513c, Boolean bool, Long l, Boolean bool2, JSONObject jSONObject, Integer num, Integer num2, Integer num3, Integer num4, Long l2, f fVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : c15513c, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : l, (i & 16) != 0 ? null : bool2, (i & 32) != 0 ? null : jSONObject, (i & 64) != 0 ? null : num, (i & 128) != 0 ? null : num2, (i & 256) != 0 ? null : num3, (i & 512) != 0 ? null : num4, (i & 1024) != 0 ? null : l2, (i & 2048) != 0 ? null : fVar);
            }
        }

        /* JADX INFO: renamed from: com.ironsource.P3$a$e */
        public static final class e {

            /* JADX INFO: renamed from: a */
            private final Integer f25388a;

            /* JADX INFO: renamed from: b */
            private final String f25389b;

            /* JADX INFO: renamed from: c */
            private final Boolean f25390c;

            /* JADX INFO: renamed from: d */
            private final String f25391d;

            /* JADX INFO: renamed from: e */
            private final Integer f25392e;

            /* JADX INFO: renamed from: f */
            private final Boolean f25393f;

            /* JADX INFO: renamed from: g */
            private final C15511a f25394g;

            /* JADX INFO: renamed from: h */
            private final b f25395h;

            /* JADX INFO: renamed from: com.ironsource.P3$a$e$a, reason: collision with other inner class name */
            public static final class C15511a {

                /* JADX INFO: renamed from: a */
                private final Boolean f25396a;

                /* JADX INFO: renamed from: b */
                private final String f25397b;

                /* JADX INFO: renamed from: c */
                private final Integer f25398c;

                public C15511a() {
                    this(null, null, null, 7, null);
                }

                /* JADX INFO: renamed from: a */
                public final Boolean m26941a() {
                    return this.f25396a;
                }

                /* JADX INFO: renamed from: b */
                public final String m26942b() {
                    return this.f25397b;
                }

                /* JADX INFO: renamed from: c */
                public final Integer m26943c() {
                    return this.f25398c;
                }

                /* JADX INFO: renamed from: d */
                public final Boolean m26944d() {
                    return this.f25396a;
                }

                /* JADX INFO: renamed from: e */
                public final Integer m26945e() {
                    return this.f25398c;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C15511a)) {
                        return false;
                    }
                    C15511a c15511a = (C15511a) obj;
                    return Intrinsics.areEqual(this.f25396a, c15511a.f25396a) && Intrinsics.areEqual(this.f25397b, c15511a.f25397b) && Intrinsics.areEqual(this.f25398c, c15511a.f25398c);
                }

                /* JADX INFO: renamed from: f */
                public final String m26946f() {
                    return this.f25397b;
                }

                public int hashCode() {
                    Boolean bool = this.f25396a;
                    int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
                    String str = this.f25397b;
                    int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                    Integer num = this.f25398c;
                    return iHashCode2 + (num != null ? num.hashCode() : 0);
                }

                public String toString() {
                    return "Capping(enabled=" + this.f25396a + ", unit=" + this.f25397b + ", maxImpressions=" + this.f25398c + ")";
                }

                public C15511a(Boolean bool, String str, Integer num) {
                    this.f25396a = bool;
                    this.f25397b = str;
                    this.f25398c = num;
                }

                /* JADX INFO: renamed from: a */
                public final C15511a m26940a(Boolean bool, String str, Integer num) {
                    return new C15511a(bool, str, num);
                }

                /* JADX INFO: renamed from: a */
                public static /* synthetic */ C15511a m26939a(C15511a c15511a, Boolean bool, String str, Integer num, int i, Object obj) {
                    if ((i & 1) != 0) {
                        bool = c15511a.f25396a;
                    }
                    if ((i & 2) != 0) {
                        str = c15511a.f25397b;
                    }
                    if ((i & 4) != 0) {
                        num = c15511a.f25398c;
                    }
                    return c15511a.m26940a(bool, str, num);
                }

                public /* synthetic */ C15511a(Boolean bool, String str, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num);
                }
            }

            /* JADX INFO: renamed from: com.ironsource.P3$a$e$b */
            public static final class b {

                /* JADX INFO: renamed from: a */
                private final Boolean f25399a;

                /* JADX INFO: renamed from: b */
                private final Integer f25400b;

                /* JADX WARN: Multi-variable type inference failed */
                public b() {
                    this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                }

                /* JADX INFO: renamed from: a */
                public final Boolean m26949a() {
                    return this.f25399a;
                }

                /* JADX INFO: renamed from: b */
                public final Integer m26950b() {
                    return this.f25400b;
                }

                /* JADX INFO: renamed from: c */
                public final Boolean m26951c() {
                    return this.f25399a;
                }

                /* JADX INFO: renamed from: d */
                public final Integer m26952d() {
                    return this.f25400b;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof b)) {
                        return false;
                    }
                    b bVar = (b) obj;
                    return Intrinsics.areEqual(this.f25399a, bVar.f25399a) && Intrinsics.areEqual(this.f25400b, bVar.f25400b);
                }

                public int hashCode() {
                    Boolean bool = this.f25399a;
                    int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
                    Integer num = this.f25400b;
                    return iHashCode + (num != null ? num.hashCode() : 0);
                }

                public String toString() {
                    return "Pacing(enabled=" + this.f25399a + ", numOfSeconds=" + this.f25400b + ")";
                }

                public b(Boolean bool, Integer num) {
                    this.f25399a = bool;
                    this.f25400b = num;
                }

                /* JADX INFO: renamed from: a */
                public final b m26948a(Boolean bool, Integer num) {
                    return new b(bool, num);
                }

                public /* synthetic */ b(Boolean bool, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : num);
                }

                /* JADX INFO: renamed from: a */
                public static /* synthetic */ b m26947a(b bVar, Boolean bool, Integer num, int i, Object obj) {
                    if ((i & 1) != 0) {
                        bool = bVar.f25399a;
                    }
                    if ((i & 2) != 0) {
                        num = bVar.f25400b;
                    }
                    return bVar.m26948a(bool, num);
                }
            }

            public e() {
                this(null, null, null, null, null, null, null, null, 255, null);
            }

            /* JADX INFO: renamed from: a */
            public final Integer m26923a() {
                return this.f25388a;
            }

            /* JADX INFO: renamed from: b */
            public final String m26924b() {
                return this.f25389b;
            }

            /* JADX INFO: renamed from: c */
            public final Boolean m26925c() {
                return this.f25390c;
            }

            /* JADX INFO: renamed from: d */
            public final String m26926d() {
                return this.f25391d;
            }

            /* JADX INFO: renamed from: e */
            public final Integer m26927e() {
                return this.f25392e;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return Intrinsics.areEqual(this.f25388a, eVar.f25388a) && Intrinsics.areEqual(this.f25389b, eVar.f25389b) && Intrinsics.areEqual(this.f25390c, eVar.f25390c) && Intrinsics.areEqual(this.f25391d, eVar.f25391d) && Intrinsics.areEqual(this.f25392e, eVar.f25392e) && Intrinsics.areEqual(this.f25393f, eVar.f25393f) && Intrinsics.areEqual(this.f25394g, eVar.f25394g) && Intrinsics.areEqual(this.f25395h, eVar.f25395h);
            }

            /* JADX INFO: renamed from: f */
            public final Boolean m26928f() {
                return this.f25393f;
            }

            /* JADX INFO: renamed from: g */
            public final C15511a m26929g() {
                return this.f25394g;
            }

            /* JADX INFO: renamed from: h */
            public final b m26930h() {
                return this.f25395h;
            }

            public int hashCode() {
                Integer num = this.f25388a;
                int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
                String str = this.f25389b;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                Boolean bool = this.f25390c;
                int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
                String str2 = this.f25391d;
                int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
                Integer num2 = this.f25392e;
                int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
                Boolean bool2 = this.f25393f;
                int iHashCode6 = (iHashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                C15511a c15511a = this.f25394g;
                int iHashCode7 = (iHashCode6 + (c15511a == null ? 0 : c15511a.hashCode())) * 31;
                b bVar = this.f25395h;
                return iHashCode7 + (bVar != null ? bVar.hashCode() : 0);
            }

            /* JADX INFO: renamed from: i */
            public final C15511a m26931i() {
                return this.f25394g;
            }

            /* JADX INFO: renamed from: j */
            public final Boolean m26932j() {
                return this.f25393f;
            }

            /* JADX INFO: renamed from: k */
            public final b m26933k() {
                return this.f25395h;
            }

            /* JADX INFO: renamed from: l */
            public final Integer m26934l() {
                return this.f25388a;
            }

            /* JADX INFO: renamed from: m */
            public final String m26935m() {
                return this.f25389b;
            }

            /* JADX INFO: renamed from: n */
            public final Integer m26936n() {
                return this.f25392e;
            }

            /* JADX INFO: renamed from: o */
            public final String m26937o() {
                return this.f25391d;
            }

            /* JADX INFO: renamed from: p */
            public final Boolean m26938p() {
                return this.f25390c;
            }

            public String toString() {
                return "Placement(placementId=" + this.f25388a + ", placementName=" + this.f25389b + ", isDefault=" + this.f25390c + ", virtualItemName=" + this.f25391d + ", virtualItemCount=" + this.f25392e + ", delivery=" + this.f25393f + ", capping=" + this.f25394g + ", pacing=" + this.f25395h + ")";
            }

            public e(Integer num, String str, Boolean bool, String str2, Integer num2, Boolean bool2, C15511a c15511a, b bVar) {
                this.f25388a = num;
                this.f25389b = str;
                this.f25390c = bool;
                this.f25391d = str2;
                this.f25392e = num2;
                this.f25393f = bool2;
                this.f25394g = c15511a;
                this.f25395h = bVar;
            }

            /* JADX INFO: renamed from: a */
            public final e m26922a(Integer num, String str, Boolean bool, String str2, Integer num2, Boolean bool2, C15511a c15511a, b bVar) {
                return new e(num, str, bool, str2, num2, bool2, c15511a, bVar);
            }

            /* JADX INFO: renamed from: a */
            public static /* synthetic */ e m26921a(e eVar, Integer num, String str, Boolean bool, String str2, Integer num2, Boolean bool2, C15511a c15511a, b bVar, int i, Object obj) {
                if ((i & 1) != 0) {
                    num = eVar.f25388a;
                }
                if ((i & 2) != 0) {
                    str = eVar.f25389b;
                }
                if ((i & 4) != 0) {
                    bool = eVar.f25390c;
                }
                if ((i & 8) != 0) {
                    str2 = eVar.f25391d;
                }
                if ((i & 16) != 0) {
                    num2 = eVar.f25392e;
                }
                if ((i & 32) != 0) {
                    bool2 = eVar.f25393f;
                }
                if ((i & 64) != 0) {
                    c15511a = eVar.f25394g;
                }
                if ((i & 128) != 0) {
                    bVar = eVar.f25395h;
                }
                C15511a c15511a2 = c15511a;
                b bVar2 = bVar;
                Integer num3 = num2;
                Boolean bool3 = bool2;
                return eVar.m26922a(num, str, bool, str2, num3, bool3, c15511a2, bVar2);
            }

            public /* synthetic */ e(Integer num, String str, Boolean bool, String str2, Integer num2, Boolean bool2, C15511a c15511a, b bVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : bool2, (i & 64) != 0 ? null : c15511a, (i & 128) != 0 ? null : bVar);
            }
        }

        /* JADX INFO: renamed from: com.ironsource.P3$a$f */
        public static final class f {

            /* JADX INFO: renamed from: a */
            private final Boolean f25401a;

            /* JADX INFO: renamed from: b */
            private final Boolean f25402b;

            /* JADX WARN: Multi-variable type inference failed */
            public f() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            /* JADX INFO: renamed from: a */
            public final Boolean m26955a() {
                return this.f25401a;
            }

            /* JADX INFO: renamed from: b */
            public final Boolean m26956b() {
                return this.f25402b;
            }

            /* JADX INFO: renamed from: c */
            public final Boolean m26957c() {
                return this.f25401a;
            }

            /* JADX INFO: renamed from: d */
            public final Boolean m26958d() {
                return this.f25402b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof f)) {
                    return false;
                }
                f fVar = (f) obj;
                return Intrinsics.areEqual(this.f25401a, fVar.f25401a) && Intrinsics.areEqual(this.f25402b, fVar.f25402b);
            }

            public int hashCode() {
                Boolean bool = this.f25401a;
                int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
                Boolean bool2 = this.f25402b;
                return iHashCode + (bool2 != null ? bool2.hashCode() : 0);
            }

            public String toString() {
                return "Providers(parallelInit=" + this.f25401a + ", waitUntilAllProvidersFinishInit=" + this.f25402b + ")";
            }

            public f(Boolean bool, Boolean bool2) {
                this.f25401a = bool;
                this.f25402b = bool2;
            }

            /* JADX INFO: renamed from: a */
            public final f m26954a(Boolean bool, Boolean bool2) {
                return new f(bool, bool2);
            }

            /* JADX INFO: renamed from: a */
            public static /* synthetic */ f m26953a(f fVar, Boolean bool, Boolean bool2, int i, Object obj) {
                if ((i & 1) != 0) {
                    bool = fVar.f25401a;
                }
                if ((i & 2) != 0) {
                    bool2 = fVar.f25402b;
                }
                return fVar.m26954a(bool, bool2);
            }

            public /* synthetic */ f(Boolean bool, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2);
            }
        }

        /* JADX INFO: renamed from: com.ironsource.P3$a$g */
        public static final class g implements InterfaceC15510a {

            /* JADX INFO: renamed from: a */
            private final List<e> f25403a;

            /* JADX INFO: renamed from: b */
            private final Integer f25404b;

            /* JADX INFO: renamed from: c */
            private final Integer f25405c;

            /* JADX INFO: renamed from: d */
            private final Integer f25406d;

            /* JADX INFO: renamed from: e */
            private final Integer f25407e;

            /* JADX INFO: renamed from: f */
            private final Integer f25408f;

            /* JADX INFO: renamed from: g */
            private final Boolean f25409g;

            /* JADX INFO: renamed from: h */
            private final Long f25410h;

            /* JADX INFO: renamed from: i */
            private final Boolean f25411i;

            /* JADX INFO: renamed from: j */
            private final JSONObject f25412j;

            /* JADX INFO: renamed from: k */
            private final Integer f25413k;

            /* JADX INFO: renamed from: l */
            private final Boolean f25414l;

            /* JADX INFO: renamed from: m */
            private final Integer f25415m;

            /* JADX INFO: renamed from: n */
            private final Integer f25416n;

            /* JADX INFO: renamed from: o */
            private final f f25417o;

            public g() {
                this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
            }

            /* JADX INFO: renamed from: A */
            public final Integer m26960A() {
                return this.f25415m;
            }

            /* JADX INFO: renamed from: B */
            public final f m26961B() {
                return this.f25417o;
            }

            /* JADX INFO: renamed from: C */
            public final Boolean m26962C() {
                return this.f25411i;
            }

            /* JADX INFO: renamed from: D */
            public final Boolean m26963D() {
                return this.f25414l;
            }

            /* JADX INFO: renamed from: a */
            public final g m26964a(List<e> list, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Boolean bool, Long l, Boolean bool2, JSONObject jSONObject, Integer num6, Boolean bool3, Integer num7, Integer num8, f fVar) {
                return new g(list, num, num2, num3, num4, num5, bool, l, bool2, jSONObject, num6, bool3, num7, num8, fVar);
            }

            /* JADX INFO: renamed from: b */
            public final List<e> m26965b() {
                return this.f25403a;
            }

            /* JADX INFO: renamed from: c */
            public final JSONObject m26966c() {
                return this.f25412j;
            }

            /* JADX INFO: renamed from: d */
            public final Integer m26967d() {
                return this.f25413k;
            }

            /* JADX INFO: renamed from: e */
            public final Boolean m26968e() {
                return this.f25414l;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof g)) {
                    return false;
                }
                g gVar = (g) obj;
                return Intrinsics.areEqual(this.f25403a, gVar.f25403a) && Intrinsics.areEqual(this.f25404b, gVar.f25404b) && Intrinsics.areEqual(this.f25405c, gVar.f25405c) && Intrinsics.areEqual(this.f25406d, gVar.f25406d) && Intrinsics.areEqual(this.f25407e, gVar.f25407e) && Intrinsics.areEqual(this.f25408f, gVar.f25408f) && Intrinsics.areEqual(this.f25409g, gVar.f25409g) && Intrinsics.areEqual(this.f25410h, gVar.f25410h) && Intrinsics.areEqual(this.f25411i, gVar.f25411i) && Intrinsics.areEqual(this.f25412j, gVar.f25412j) && Intrinsics.areEqual(this.f25413k, gVar.f25413k) && Intrinsics.areEqual(this.f25414l, gVar.f25414l) && Intrinsics.areEqual(this.f25415m, gVar.f25415m) && Intrinsics.areEqual(this.f25416n, gVar.f25416n) && Intrinsics.areEqual(this.f25417o, gVar.f25417o);
            }

            /* JADX INFO: renamed from: f */
            public final Integer m26969f() {
                return this.f25415m;
            }

            /* JADX INFO: renamed from: g */
            public final Integer m26970g() {
                return this.f25416n;
            }

            /* JADX INFO: renamed from: h */
            public final f m26971h() {
                return this.f25417o;
            }

            public int hashCode() {
                List<e> list = this.f25403a;
                int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
                Integer num = this.f25404b;
                int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
                Integer num2 = this.f25405c;
                int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
                Integer num3 = this.f25406d;
                int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
                Integer num4 = this.f25407e;
                int iHashCode5 = (iHashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
                Integer num5 = this.f25408f;
                int iHashCode6 = (iHashCode5 + (num5 == null ? 0 : num5.hashCode())) * 31;
                Boolean bool = this.f25409g;
                int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
                Long l = this.f25410h;
                int iHashCode8 = (iHashCode7 + (l == null ? 0 : l.hashCode())) * 31;
                Boolean bool2 = this.f25411i;
                int iHashCode9 = (iHashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                JSONObject jSONObject = this.f25412j;
                int iHashCode10 = (iHashCode9 + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
                Integer num6 = this.f25413k;
                int iHashCode11 = (iHashCode10 + (num6 == null ? 0 : num6.hashCode())) * 31;
                Boolean bool3 = this.f25414l;
                int iHashCode12 = (iHashCode11 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
                Integer num7 = this.f25415m;
                int iHashCode13 = (iHashCode12 + (num7 == null ? 0 : num7.hashCode())) * 31;
                Integer num8 = this.f25416n;
                int iHashCode14 = (iHashCode13 + (num8 == null ? 0 : num8.hashCode())) * 31;
                f fVar = this.f25417o;
                return iHashCode14 + (fVar != null ? fVar.hashCode() : 0);
            }

            /* JADX INFO: renamed from: i */
            public final Integer m26972i() {
                return this.f25404b;
            }

            /* JADX INFO: renamed from: j */
            public final Integer m26973j() {
                return this.f25405c;
            }

            /* JADX INFO: renamed from: k */
            public final Integer m26974k() {
                return this.f25406d;
            }

            /* JADX INFO: renamed from: l */
            public final Integer m26975l() {
                return this.f25407e;
            }

            /* JADX INFO: renamed from: m */
            public final Integer m26976m() {
                return this.f25408f;
            }

            /* JADX INFO: renamed from: n */
            public final Boolean m26977n() {
                return this.f25409g;
            }

            /* JADX INFO: renamed from: o */
            public final Long m26978o() {
                return this.f25410h;
            }

            /* JADX INFO: renamed from: p */
            public final Boolean m26979p() {
                return this.f25411i;
            }

            /* JADX INFO: renamed from: q */
            public final JSONObject m26980q() {
                return this.f25412j;
            }

            /* JADX INFO: renamed from: r */
            public final Integer m26981r() {
                return this.f25405c;
            }

            /* JADX INFO: renamed from: s */
            public final Integer m26982s() {
                return this.f25407e;
            }

            /* JADX INFO: renamed from: t */
            public final Integer m26983t() {
                return this.f25416n;
            }

            public String toString() {
                return "Rewarded(placements=" + this.f25403a + ", maxNumOfAdaptersToLoadOnStart=" + this.f25404b + ", adapterTimeOutInSeconds=" + this.f25405c + ", loadRVInterval=" + this.f25406d + ", advancedLoading=" + this.f25407e + ", expiredDurationInMinutes=" + this.f25408f + ", collectBiddingDataAsyncEnabled=" + this.f25409g + ", collectBiddingDataTimeout=" + this.f25410h + ", sharedManagersThread=" + this.f25411i + ", adUnits=" + this.f25412j + ", delayLoadFailure=" + this.f25413k + ", isOneFlow=" + this.f25414l + ", parallelLoad=" + this.f25415m + ", atim=" + this.f25416n + ", providers=" + this.f25417o + ")";
            }

            /* JADX INFO: renamed from: u */
            public final Boolean m26984u() {
                return this.f25409g;
            }

            /* JADX INFO: renamed from: v */
            public final Long m26985v() {
                return this.f25410h;
            }

            /* JADX INFO: renamed from: w */
            public final Integer m26986w() {
                return this.f25413k;
            }

            /* JADX INFO: renamed from: x */
            public final Integer m26987x() {
                return this.f25408f;
            }

            /* JADX INFO: renamed from: y */
            public final Integer m26988y() {
                return this.f25406d;
            }

            /* JADX INFO: renamed from: z */
            public final Integer m26989z() {
                return this.f25404b;
            }

            public g(List<e> list, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Boolean bool, Long l, Boolean bool2, JSONObject jSONObject, Integer num6, Boolean bool3, Integer num7, Integer num8, f fVar) {
                this.f25403a = list;
                this.f25404b = num;
                this.f25405c = num2;
                this.f25406d = num3;
                this.f25407e = num4;
                this.f25408f = num5;
                this.f25409g = bool;
                this.f25410h = l;
                this.f25411i = bool2;
                this.f25412j = jSONObject;
                this.f25413k = num6;
                this.f25414l = bool3;
                this.f25415m = num7;
                this.f25416n = num8;
                this.f25417o = fVar;
            }

            @Override // com.ironsource.C11609P3.a.InterfaceC15510a
            /* JADX INFO: renamed from: a */
            public List<e> mo26835a() {
                return this.f25403a;
            }

            public /* synthetic */ g(List list, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Boolean bool, Long l, Boolean bool2, JSONObject jSONObject, Integer num6, Boolean bool3, Integer num7, Integer num8, f fVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : num3, (i & 16) != 0 ? null : num4, (i & 32) != 0 ? null : num5, (i & 64) != 0 ? null : bool, (i & 128) != 0 ? null : l, (i & 256) != 0 ? null : bool2, (i & 512) != 0 ? null : jSONObject, (i & 1024) != 0 ? null : num6, (i & 2048) != 0 ? null : bool3, (i & 4096) != 0 ? null : num7, (i & 8192) != 0 ? null : num8, (i & 16384) != 0 ? null : fVar);
            }
        }

        public a() {
            this(null, null, null, null, 15, null);
        }

        /* JADX INFO: renamed from: a */
        public final g m26826a() {
            return this.f25343a;
        }

        /* JADX INFO: renamed from: b */
        public final c m26828b() {
            return this.f25344b;
        }

        /* JADX INFO: renamed from: c */
        public final b m26829c() {
            return this.f25345c;
        }

        /* JADX INFO: renamed from: d */
        public final d m26830d() {
            return this.f25346d;
        }

        /* JADX INFO: renamed from: e */
        public final b m26831e() {
            return this.f25345c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f25343a, aVar.f25343a) && Intrinsics.areEqual(this.f25344b, aVar.f25344b) && Intrinsics.areEqual(this.f25345c, aVar.f25345c) && Intrinsics.areEqual(this.f25346d, aVar.f25346d);
        }

        /* JADX INFO: renamed from: f */
        public final c m26832f() {
            return this.f25344b;
        }

        /* JADX INFO: renamed from: g */
        public final d m26833g() {
            return this.f25346d;
        }

        /* JADX INFO: renamed from: h */
        public final g m26834h() {
            return this.f25343a;
        }

        public int hashCode() {
            g gVar = this.f25343a;
            int iHashCode = (gVar == null ? 0 : gVar.hashCode()) * 31;
            c cVar = this.f25344b;
            int iHashCode2 = (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
            b bVar = this.f25345c;
            int iHashCode3 = (iHashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
            d dVar = this.f25346d;
            return iHashCode3 + (dVar != null ? dVar.hashCode() : 0);
        }

        public String toString() {
            return "AdFormats(rewarded=" + this.f25343a + ", interstitial=" + this.f25344b + ", banner=" + this.f25345c + ", nativeAd=" + this.f25346d + ")";
        }

        public a(g gVar, c cVar, b bVar, d dVar) {
            this.f25343a = gVar;
            this.f25344b = cVar;
            this.f25345c = bVar;
            this.f25346d = dVar;
        }

        /* JADX INFO: renamed from: a */
        public final a m26827a(g gVar, c cVar, b bVar, d dVar) {
            return new a(gVar, cVar, bVar, dVar);
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ a m26825a(a aVar, g gVar, c cVar, b bVar, d dVar, int i, Object obj) {
            if ((i & 1) != 0) {
                gVar = aVar.f25343a;
            }
            if ((i & 2) != 0) {
                cVar = aVar.f25344b;
            }
            if ((i & 4) != 0) {
                bVar = aVar.f25345c;
            }
            if ((i & 8) != 0) {
                dVar = aVar.f25346d;
            }
            return aVar.m26827a(gVar, cVar, bVar, dVar);
        }

        public /* synthetic */ a(g gVar, c cVar, b bVar, d dVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : gVar, (i & 2) != 0 ? null : cVar, (i & 4) != 0 ? null : bVar, (i & 8) != 0 ? null : dVar);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.P3$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        private final Integer f25418a;

        /* JADX INFO: renamed from: b */
        private final String f25419b;

        /* JADX WARN: Multi-variable type inference failed */
        public b() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX INFO: renamed from: a */
        public final Integer m26992a() {
            return this.f25418a;
        }

        /* JADX INFO: renamed from: b */
        public final String m26993b() {
            return this.f25419b;
        }

        /* JADX INFO: renamed from: c */
        public final String m26994c() {
            return this.f25419b;
        }

        /* JADX INFO: renamed from: d */
        public final Integer m26995d() {
            return this.f25418a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.areEqual(this.f25418a, bVar.f25418a) && Intrinsics.areEqual(this.f25419b, bVar.f25419b);
        }

        public int hashCode() {
            Integer num = this.f25418a;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            String str = this.f25419b;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "AdQuality(initMode=" + this.f25418a + ", adqInitBlob=" + this.f25419b + ")";
        }

        public b(Integer num, String str) {
            this.f25418a = num;
            this.f25419b = str;
        }

        /* JADX INFO: renamed from: a */
        public final b m26991a(Integer num, String str) {
            return new b(num, str);
        }

        public /* synthetic */ b(Integer num, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str);
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ b m26990a(b bVar, Integer num, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                num = bVar.f25418a;
            }
            if ((i & 2) != 0) {
                str = bVar.f25419b;
            }
            return bVar.m26991a(num, str);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.P3$c */
    public static final class c {

        /* JADX INFO: renamed from: a */
        private final e f25420a;

        /* JADX INFO: renamed from: b */
        private final C15513c f25421b;

        /* JADX INFO: renamed from: c */
        private final h f25422c;

        /* JADX INFO: renamed from: d */
        private final f f25423d;

        /* JADX INFO: renamed from: e */
        private final a f25424e;

        /* JADX INFO: renamed from: f */
        private final b f25425f;

        /* JADX INFO: renamed from: g */
        private final g f25426g;

        /* JADX INFO: renamed from: h */
        private final d f25427h;

        /* JADX INFO: renamed from: i */
        private final Boolean f25428i;

        /* JADX INFO: renamed from: j */
        private final Boolean f25429j;

        /* JADX INFO: renamed from: com.ironsource.P3$c$a */
        public static final class a {

            /* JADX INFO: renamed from: a */
            private final String f25430a;

            /* JADX INFO: renamed from: b */
            private final String f25431b;

            /* JADX INFO: renamed from: c */
            private final String f25432c;

            /* JADX INFO: renamed from: d */
            private final Integer f25433d;

            /* JADX INFO: renamed from: e */
            private final Long f25434e;

            /* JADX INFO: renamed from: f */
            private final Integer f25435f;

            /* JADX INFO: renamed from: g */
            private final Boolean f25436g;

            /* JADX INFO: renamed from: h */
            private final Boolean f25437h;

            /* JADX INFO: renamed from: i */
            private final Integer f25438i;

            /* JADX INFO: renamed from: j */
            private final Boolean f25439j;

            /* JADX INFO: renamed from: k */
            private final C15512a f25440k;

            /* JADX INFO: renamed from: l */
            private final C15512a f25441l;

            /* JADX INFO: renamed from: m */
            private final C15512a f25442m;

            /* JADX INFO: renamed from: n */
            private final C15512a f25443n;

            /* JADX INFO: renamed from: com.ironsource.P3$c$a$a, reason: collision with other inner class name */
            public static final class C15512a {

                /* JADX INFO: renamed from: a */
                private final Boolean f25444a;

                /* JADX INFO: renamed from: b */
                private final Integer f25445b;

                /* JADX INFO: renamed from: c */
                private final Boolean f25446c;

                /* JADX INFO: renamed from: d */
                private final Integer f25447d;

                /* JADX INFO: renamed from: e */
                private final Integer f25448e;

                /* JADX INFO: renamed from: f */
                private final Boolean f25449f;

                /* JADX INFO: renamed from: g */
                private final Boolean f25450g;

                /* JADX INFO: renamed from: h */
                private final Integer f25451h;

                /* JADX INFO: renamed from: i */
                private final Integer f25452i;

                /* JADX INFO: renamed from: j */
                private final Boolean f25453j;

                public C15512a() {
                    this(null, null, null, null, null, null, null, null, null, null, 1023, null);
                }

                /* JADX INFO: renamed from: a */
                public final Boolean m27050a() {
                    return this.f25444a;
                }

                /* JADX INFO: renamed from: b */
                public final Boolean m27051b() {
                    return this.f25453j;
                }

                /* JADX INFO: renamed from: c */
                public final Integer m27052c() {
                    return this.f25445b;
                }

                /* JADX INFO: renamed from: d */
                public final Boolean m27053d() {
                    return this.f25446c;
                }

                /* JADX INFO: renamed from: e */
                public final Integer m27054e() {
                    return this.f25447d;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C15512a)) {
                        return false;
                    }
                    C15512a c15512a = (C15512a) obj;
                    return Intrinsics.areEqual(this.f25444a, c15512a.f25444a) && Intrinsics.areEqual(this.f25445b, c15512a.f25445b) && Intrinsics.areEqual(this.f25446c, c15512a.f25446c) && Intrinsics.areEqual(this.f25447d, c15512a.f25447d) && Intrinsics.areEqual(this.f25448e, c15512a.f25448e) && Intrinsics.areEqual(this.f25449f, c15512a.f25449f) && Intrinsics.areEqual(this.f25450g, c15512a.f25450g) && Intrinsics.areEqual(this.f25451h, c15512a.f25451h) && Intrinsics.areEqual(this.f25452i, c15512a.f25452i) && Intrinsics.areEqual(this.f25453j, c15512a.f25453j);
                }

                /* JADX INFO: renamed from: f */
                public final Integer m27055f() {
                    return this.f25448e;
                }

                /* JADX INFO: renamed from: g */
                public final Boolean m27056g() {
                    return this.f25449f;
                }

                /* JADX INFO: renamed from: h */
                public final Boolean m27057h() {
                    return this.f25450g;
                }

                public int hashCode() {
                    Boolean bool = this.f25444a;
                    int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
                    Integer num = this.f25445b;
                    int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
                    Boolean bool2 = this.f25446c;
                    int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                    Integer num2 = this.f25447d;
                    int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
                    Integer num3 = this.f25448e;
                    int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
                    Boolean bool3 = this.f25449f;
                    int iHashCode6 = (iHashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
                    Boolean bool4 = this.f25450g;
                    int iHashCode7 = (iHashCode6 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
                    Integer num4 = this.f25451h;
                    int iHashCode8 = (iHashCode7 + (num4 == null ? 0 : num4.hashCode())) * 31;
                    Integer num5 = this.f25452i;
                    int iHashCode9 = (iHashCode8 + (num5 == null ? 0 : num5.hashCode())) * 31;
                    Boolean bool5 = this.f25453j;
                    return iHashCode9 + (bool5 != null ? bool5.hashCode() : 0);
                }

                /* JADX INFO: renamed from: i */
                public final Integer m27058i() {
                    return this.f25451h;
                }

                /* JADX INFO: renamed from: j */
                public final Integer m27059j() {
                    return this.f25452i;
                }

                /* JADX INFO: renamed from: k */
                public final Integer m27060k() {
                    return this.f25447d;
                }

                /* JADX INFO: renamed from: l */
                public final Boolean m27061l() {
                    return this.f25453j;
                }

                /* JADX INFO: renamed from: m */
                public final Integer m27062m() {
                    return this.f25445b;
                }

                /* JADX INFO: renamed from: n */
                public final Boolean m27063n() {
                    return this.f25446c;
                }

                /* JADX INFO: renamed from: o */
                public final Boolean m27064o() {
                    return this.f25444a;
                }

                /* JADX INFO: renamed from: p */
                public final Integer m27065p() {
                    return this.f25451h;
                }

                /* JADX INFO: renamed from: q */
                public final Integer m27066q() {
                    return this.f25448e;
                }

                /* JADX INFO: renamed from: r */
                public final Integer m27067r() {
                    return this.f25452i;
                }

                /* JADX INFO: renamed from: s */
                public final Boolean m27068s() {
                    return this.f25449f;
                }

                /* JADX INFO: renamed from: t */
                public final Boolean m27069t() {
                    return this.f25450g;
                }

                public String toString() {
                    return "AdFormatAuction(programmatic=" + this.f25444a + ", minTimeBeforeFirstAuction=" + this.f25445b + ", objectPerWaterfall=" + this.f25446c + ", auctionRetryInterval=" + this.f25447d + ", timeToWaitBeforeAuction=" + this.f25448e + ", isAuctionOnShowStart=" + this.f25449f + ", isLoadWhileShow=" + this.f25450g + ", timeToDeleteOldWaterfallAfterAuction=" + this.f25451h + ", timeToWaitBeforeLoad=" + this.f25452i + ", enableAuctionFallback=" + this.f25453j + ")";
                }

                public C15512a(Boolean bool, Integer num, Boolean bool2, Integer num2, Integer num3, Boolean bool3, Boolean bool4, Integer num4, Integer num5, Boolean bool5) {
                    this.f25444a = bool;
                    this.f25445b = num;
                    this.f25446c = bool2;
                    this.f25447d = num2;
                    this.f25448e = num3;
                    this.f25449f = bool3;
                    this.f25450g = bool4;
                    this.f25451h = num4;
                    this.f25452i = num5;
                    this.f25453j = bool5;
                }

                /* JADX INFO: renamed from: a */
                public final C15512a m27049a(Boolean bool, Integer num, Boolean bool2, Integer num2, Integer num3, Boolean bool3, Boolean bool4, Integer num4, Integer num5, Boolean bool5) {
                    return new C15512a(bool, num, bool2, num2, num3, bool3, bool4, num4, num5, bool5);
                }

                /* JADX INFO: renamed from: a */
                public static /* synthetic */ C15512a m27048a(C15512a c15512a, Boolean bool, Integer num, Boolean bool2, Integer num2, Integer num3, Boolean bool3, Boolean bool4, Integer num4, Integer num5, Boolean bool5, int i, Object obj) {
                    if ((i & 1) != 0) {
                        bool = c15512a.f25444a;
                    }
                    if ((i & 2) != 0) {
                        num = c15512a.f25445b;
                    }
                    if ((i & 4) != 0) {
                        bool2 = c15512a.f25446c;
                    }
                    if ((i & 8) != 0) {
                        num2 = c15512a.f25447d;
                    }
                    if ((i & 16) != 0) {
                        num3 = c15512a.f25448e;
                    }
                    if ((i & 32) != 0) {
                        bool3 = c15512a.f25449f;
                    }
                    if ((i & 64) != 0) {
                        bool4 = c15512a.f25450g;
                    }
                    if ((i & 128) != 0) {
                        num4 = c15512a.f25451h;
                    }
                    if ((i & 256) != 0) {
                        num5 = c15512a.f25452i;
                    }
                    if ((i & 512) != 0) {
                        bool5 = c15512a.f25453j;
                    }
                    Integer num6 = num5;
                    Boolean bool6 = bool5;
                    Boolean bool7 = bool4;
                    Integer num7 = num4;
                    Integer num8 = num3;
                    Boolean bool8 = bool3;
                    return c15512a.m27049a(bool, num, bool2, num2, num8, bool8, bool7, num7, num6, bool6);
                }

                public /* synthetic */ C15512a(Boolean bool, Integer num, Boolean bool2, Integer num2, Integer num3, Boolean bool3, Boolean bool4, Integer num4, Integer num5, Boolean bool5, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : bool2, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : num3, (i & 32) != 0 ? null : bool3, (i & 64) != 0 ? null : bool4, (i & 128) != 0 ? null : num4, (i & 256) != 0 ? null : num5, (i & 512) != 0 ? null : bool5);
                }
            }

            public a() {
                this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
            }

            /* JADX INFO: renamed from: A */
            public final C15512a m27019A() {
                return this.f25440k;
            }

            /* JADX INFO: renamed from: B */
            public final Boolean m27020B() {
                return this.f25439j;
            }

            /* JADX INFO: renamed from: a */
            public final String m27022a() {
                return this.f25430a;
            }

            /* JADX INFO: renamed from: b */
            public final Boolean m27023b() {
                return this.f25439j;
            }

            /* JADX INFO: renamed from: c */
            public final C15512a m27024c() {
                return this.f25440k;
            }

            /* JADX INFO: renamed from: d */
            public final C15512a m27025d() {
                return this.f25441l;
            }

            /* JADX INFO: renamed from: e */
            public final C15512a m27026e() {
                return this.f25442m;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return Intrinsics.areEqual(this.f25430a, aVar.f25430a) && Intrinsics.areEqual(this.f25431b, aVar.f25431b) && Intrinsics.areEqual(this.f25432c, aVar.f25432c) && Intrinsics.areEqual(this.f25433d, aVar.f25433d) && Intrinsics.areEqual(this.f25434e, aVar.f25434e) && Intrinsics.areEqual(this.f25435f, aVar.f25435f) && Intrinsics.areEqual(this.f25436g, aVar.f25436g) && Intrinsics.areEqual(this.f25437h, aVar.f25437h) && Intrinsics.areEqual(this.f25438i, aVar.f25438i) && Intrinsics.areEqual(this.f25439j, aVar.f25439j) && Intrinsics.areEqual(this.f25440k, aVar.f25440k) && Intrinsics.areEqual(this.f25441l, aVar.f25441l) && Intrinsics.areEqual(this.f25442m, aVar.f25442m) && Intrinsics.areEqual(this.f25443n, aVar.f25443n);
            }

            /* JADX INFO: renamed from: f */
            public final C15512a m27027f() {
                return this.f25443n;
            }

            /* JADX INFO: renamed from: g */
            public final String m27028g() {
                return this.f25431b;
            }

            /* JADX INFO: renamed from: h */
            public final String m27029h() {
                return this.f25432c;
            }

            public int hashCode() {
                String str = this.f25430a;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.f25431b;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.f25432c;
                int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                Integer num = this.f25433d;
                int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
                Long l = this.f25434e;
                int iHashCode5 = (iHashCode4 + (l == null ? 0 : l.hashCode())) * 31;
                Integer num2 = this.f25435f;
                int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
                Boolean bool = this.f25436g;
                int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
                Boolean bool2 = this.f25437h;
                int iHashCode8 = (iHashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                Integer num3 = this.f25438i;
                int iHashCode9 = (iHashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
                Boolean bool3 = this.f25439j;
                int iHashCode10 = (iHashCode9 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
                C15512a c15512a = this.f25440k;
                int iHashCode11 = (iHashCode10 + (c15512a == null ? 0 : c15512a.hashCode())) * 31;
                C15512a c15512a2 = this.f25441l;
                int iHashCode12 = (iHashCode11 + (c15512a2 == null ? 0 : c15512a2.hashCode())) * 31;
                C15512a c15512a3 = this.f25442m;
                int iHashCode13 = (iHashCode12 + (c15512a3 == null ? 0 : c15512a3.hashCode())) * 31;
                C15512a c15512a4 = this.f25443n;
                return iHashCode13 + (c15512a4 != null ? c15512a4.hashCode() : 0);
            }

            /* JADX INFO: renamed from: i */
            public final Integer m27030i() {
                return this.f25433d;
            }

            /* JADX INFO: renamed from: j */
            public final Long m27031j() {
                return this.f25434e;
            }

            /* JADX INFO: renamed from: k */
            public final Integer m27032k() {
                return this.f25435f;
            }

            /* JADX INFO: renamed from: l */
            public final Boolean m27033l() {
                return this.f25436g;
            }

            /* JADX INFO: renamed from: m */
            public final Boolean m27034m() {
                return this.f25437h;
            }

            /* JADX INFO: renamed from: n */
            public final Integer m27035n() {
                return this.f25438i;
            }

            /* JADX INFO: renamed from: o */
            public final String m27036o() {
                return this.f25430a;
            }

            /* JADX INFO: renamed from: p */
            public final Integer m27037p() {
                return this.f25435f;
            }

            /* JADX INFO: renamed from: q */
            public final Long m27038q() {
                return this.f25434e;
            }

            /* JADX INFO: renamed from: r */
            public final Integer m27039r() {
                return this.f25433d;
            }

            /* JADX INFO: renamed from: s */
            public final String m27040s() {
                return this.f25431b;
            }

            /* JADX INFO: renamed from: t */
            public final C15512a m27041t() {
                return this.f25442m;
            }

            public String toString() {
                return "Auction(auctionData=" + this.f25430a + ", auctioneerURL=" + this.f25431b + ", extAuctioneerURL=" + this.f25432c + ", auctionTrials=" + this.f25433d + ", auctionTimeout=" + this.f25434e + ", auctionSavedHistory=" + this.f25435f + ", compressAuctionRequest=" + this.f25436g + ", compressAuctionResponse=" + this.f25437h + ", encryptionVersion=" + this.f25438i + ", tokenPerAdapter=" + this.f25439j + ", rewarded=" + this.f25440k + ", interstitial=" + this.f25441l + ", banner=" + this.f25442m + ", nativeAd=" + this.f25443n + ")";
            }

            /* JADX INFO: renamed from: u */
            public final Boolean m27042u() {
                return this.f25436g;
            }

            /* JADX INFO: renamed from: v */
            public final Boolean m27043v() {
                return this.f25437h;
            }

            /* JADX INFO: renamed from: w */
            public final Integer m27044w() {
                return this.f25438i;
            }

            /* JADX INFO: renamed from: x */
            public final String m27045x() {
                return this.f25432c;
            }

            /* JADX INFO: renamed from: y */
            public final C15512a m27046y() {
                return this.f25441l;
            }

            /* JADX INFO: renamed from: z */
            public final C15512a m27047z() {
                return this.f25443n;
            }

            public a(String str, String str2, String str3, Integer num, Long l, Integer num2, Boolean bool, Boolean bool2, Integer num3, Boolean bool3, C15512a c15512a, C15512a c15512a2, C15512a c15512a3, C15512a c15512a4) {
                this.f25430a = str;
                this.f25431b = str2;
                this.f25432c = str3;
                this.f25433d = num;
                this.f25434e = l;
                this.f25435f = num2;
                this.f25436g = bool;
                this.f25437h = bool2;
                this.f25438i = num3;
                this.f25439j = bool3;
                this.f25440k = c15512a;
                this.f25441l = c15512a2;
                this.f25442m = c15512a3;
                this.f25443n = c15512a4;
            }

            /* JADX INFO: renamed from: a */
            public final a m27021a(String str, String str2, String str3, Integer num, Long l, Integer num2, Boolean bool, Boolean bool2, Integer num3, Boolean bool3, C15512a c15512a, C15512a c15512a2, C15512a c15512a3, C15512a c15512a4) {
                return new a(str, str2, str3, num, l, num2, bool, bool2, num3, bool3, c15512a, c15512a2, c15512a3, c15512a4);
            }

            public /* synthetic */ a(String str, String str2, String str3, Integer num, Long l, Integer num2, Boolean bool, Boolean bool2, Integer num3, Boolean bool3, C15512a c15512a, C15512a c15512a2, C15512a c15512a3, C15512a c15512a4, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : l, (i & 32) != 0 ? null : num2, (i & 64) != 0 ? null : bool, (i & 128) != 0 ? null : bool2, (i & 256) != 0 ? null : num3, (i & 512) != 0 ? null : bool3, (i & 1024) != 0 ? null : c15512a, (i & 2048) != 0 ? null : c15512a2, (i & 4096) != 0 ? null : c15512a3, (i & 8192) != 0 ? null : c15512a4);
            }
        }

        /* JADX INFO: renamed from: com.ironsource.P3$c$b */
        public static final class b {

            /* JADX INFO: renamed from: a */
            private final Boolean f25454a;

            /* JADX INFO: renamed from: b */
            private final String f25455b;

            /* JADX INFO: renamed from: c */
            private final String f25456c;

            /* JADX INFO: renamed from: d */
            private final Boolean f25457d;

            /* JADX INFO: renamed from: e */
            private final Integer f25458e;

            /* JADX INFO: renamed from: f */
            private final Boolean f25459f;

            /* JADX INFO: renamed from: g */
            private final List<String> f25460g;

            public b() {
                this(null, null, null, null, null, null, null, 127, null);
            }

            /* JADX INFO: renamed from: a */
            public final Boolean m27072a() {
                return this.f25454a;
            }

            /* JADX INFO: renamed from: b */
            public final String m27073b() {
                return this.f25455b;
            }

            /* JADX INFO: renamed from: c */
            public final String m27074c() {
                return this.f25456c;
            }

            /* JADX INFO: renamed from: d */
            public final Boolean m27075d() {
                return this.f25457d;
            }

            /* JADX INFO: renamed from: e */
            public final Integer m27076e() {
                return this.f25458e;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return Intrinsics.areEqual(this.f25454a, bVar.f25454a) && Intrinsics.areEqual(this.f25455b, bVar.f25455b) && Intrinsics.areEqual(this.f25456c, bVar.f25456c) && Intrinsics.areEqual(this.f25457d, bVar.f25457d) && Intrinsics.areEqual(this.f25458e, bVar.f25458e) && Intrinsics.areEqual(this.f25459f, bVar.f25459f) && Intrinsics.areEqual(this.f25460g, bVar.f25460g);
            }

            /* JADX INFO: renamed from: f */
            public final Boolean m27077f() {
                return this.f25459f;
            }

            /* JADX INFO: renamed from: g */
            public final List<String> m27078g() {
                return this.f25460g;
            }

            /* JADX INFO: renamed from: h */
            public final Boolean m27079h() {
                return this.f25454a;
            }

            public int hashCode() {
                Boolean bool = this.f25454a;
                int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
                String str = this.f25455b;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.f25456c;
                int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                Boolean bool2 = this.f25457d;
                int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                Integer num = this.f25458e;
                int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
                Boolean bool3 = this.f25459f;
                int iHashCode6 = (iHashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
                List<String> list = this.f25460g;
                return iHashCode6 + (list != null ? list.hashCode() : 0);
            }

            /* JADX INFO: renamed from: i */
            public final Boolean m27080i() {
                return this.f25457d;
            }

            /* JADX INFO: renamed from: j */
            public final List<String> m27081j() {
                return this.f25460g;
            }

            /* JADX INFO: renamed from: k */
            public final String m27082k() {
                return this.f25456c;
            }

            /* JADX INFO: renamed from: l */
            public final String m27083l() {
                return this.f25455b;
            }

            /* JADX INFO: renamed from: m */
            public final Boolean m27084m() {
                return this.f25459f;
            }

            /* JADX INFO: renamed from: n */
            public final Integer m27085n() {
                return this.f25458e;
            }

            public String toString() {
                return "CrashReporter(enabled=" + this.f25454a + ", reporterURL=" + this.f25455b + ", reporterKeyword=" + this.f25456c + ", includeANR=" + this.f25457d + ", timeout=" + this.f25458e + ", setIgnoreDebugger=" + this.f25459f + ", keysToInclude=" + this.f25460g + ")";
            }

            public b(Boolean bool, String str, String str2, Boolean bool2, Integer num, Boolean bool3, List<String> list) {
                this.f25454a = bool;
                this.f25455b = str;
                this.f25456c = str2;
                this.f25457d = bool2;
                this.f25458e = num;
                this.f25459f = bool3;
                this.f25460g = list;
            }

            /* JADX INFO: renamed from: a */
            public final b m27071a(Boolean bool, String str, String str2, Boolean bool2, Integer num, Boolean bool3, List<String> list) {
                return new b(bool, str, str2, bool2, num, bool3, list);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX INFO: renamed from: a */
            public static /* synthetic */ b m27070a(b bVar, Boolean bool, String str, String str2, Boolean bool2, Integer num, Boolean bool3, List list, int i, Object obj) {
                if ((i & 1) != 0) {
                    bool = bVar.f25454a;
                }
                if ((i & 2) != 0) {
                    str = bVar.f25455b;
                }
                if ((i & 4) != 0) {
                    str2 = bVar.f25456c;
                }
                if ((i & 8) != 0) {
                    bool2 = bVar.f25457d;
                }
                if ((i & 16) != 0) {
                    num = bVar.f25458e;
                }
                if ((i & 32) != 0) {
                    bool3 = bVar.f25459f;
                }
                if ((i & 64) != 0) {
                    list = bVar.f25460g;
                }
                Boolean bool4 = bool3;
                List list2 = list;
                Integer num2 = num;
                String str3 = str2;
                return bVar.m27071a(bool, str, str3, bool2, num2, bool4, list2);
            }

            public /* synthetic */ b(Boolean bool, String str, String str2, Boolean bool2, Integer num, Boolean bool3, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : bool2, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : bool3, (i & 64) != 0 ? null : list);
            }
        }

        /* JADX INFO: renamed from: com.ironsource.P3$c$c, reason: collision with other inner class name */
        public static final class C15513c {

            /* JADX INFO: renamed from: a */
            private final Boolean f25461a;

            /* JADX INFO: renamed from: b */
            private final Boolean f25462b;

            /* JADX INFO: renamed from: c */
            private final Boolean f25463c;

            /* JADX INFO: renamed from: d */
            private final Integer f25464d;

            /* JADX INFO: renamed from: e */
            private final String f25465e;

            /* JADX INFO: renamed from: f */
            private final String f25466f;

            /* JADX INFO: renamed from: g */
            private final Integer f25467g;

            /* JADX INFO: renamed from: h */
            private final Integer f25468h;

            /* JADX INFO: renamed from: i */
            private final Integer f25469i;

            /* JADX INFO: renamed from: j */
            private final List<Integer> f25470j;

            /* JADX INFO: renamed from: k */
            private final List<Integer> f25471k;

            /* JADX INFO: renamed from: l */
            private final List<Integer> f25472l;

            /* JADX INFO: renamed from: m */
            private final List<Integer> f25473m;

            /* JADX INFO: renamed from: n */
            private final JSONObject f25474n;

            /* JADX INFO: renamed from: o */
            private final a f25475o;

            /* JADX INFO: renamed from: p */
            private final String f25476p;

            /* JADX INFO: renamed from: com.ironsource.P3$c$c$a */
            public static final class a {

                /* JADX INFO: renamed from: a */
                private final String f25477a;

                /* JADX INFO: renamed from: b */
                private final Boolean f25478b;

                /* JADX WARN: Multi-variable type inference failed */
                public a() {
                    this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                }

                /* JADX INFO: renamed from: a */
                public final String m27122a() {
                    return this.f25477a;
                }

                /* JADX INFO: renamed from: b */
                public final Boolean m27123b() {
                    return this.f25478b;
                }

                /* JADX INFO: renamed from: c */
                public final Boolean m27124c() {
                    return this.f25478b;
                }

                /* JADX INFO: renamed from: d */
                public final String m27125d() {
                    return this.f25477a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof a)) {
                        return false;
                    }
                    a aVar = (a) obj;
                    return Intrinsics.areEqual(this.f25477a, aVar.f25477a) && Intrinsics.areEqual(this.f25478b, aVar.f25478b);
                }

                public int hashCode() {
                    String str = this.f25477a;
                    int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                    Boolean bool = this.f25478b;
                    return iHashCode + (bool != null ? bool.hashCode() : 0);
                }

                public String toString() {
                    return "Pixel(pixelEventsUrl=" + this.f25477a + ", pixelEventsEnabled=" + this.f25478b + ")";
                }

                public a(String str, Boolean bool) {
                    this.f25477a = str;
                    this.f25478b = bool;
                }

                /* JADX INFO: renamed from: a */
                public final a m27121a(String str, Boolean bool) {
                    return new a(str, bool);
                }

                public /* synthetic */ a(String str, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bool);
                }

                /* JADX INFO: renamed from: a */
                public static /* synthetic */ a m27120a(a aVar, String str, Boolean bool, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = aVar.f25477a;
                    }
                    if ((i & 2) != 0) {
                        bool = aVar.f25478b;
                    }
                    return aVar.m27121a(str, bool);
                }
            }

            public C15513c() {
                this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65535, null);
            }

            /* JADX INFO: renamed from: A */
            public final a m27087A() {
                return this.f25475o;
            }

            /* JADX INFO: renamed from: B */
            public final Boolean m27088B() {
                return this.f25462b;
            }

            /* JADX INFO: renamed from: C */
            public final Boolean m27089C() {
                return this.f25461a;
            }

            /* JADX INFO: renamed from: D */
            public final String m27090D() {
                return this.f25466f;
            }

            /* JADX INFO: renamed from: E */
            public final String m27091E() {
                return this.f25465e;
            }

            /* JADX INFO: renamed from: F */
            public final List<Integer> m27092F() {
                return this.f25472l;
            }

            /* JADX INFO: renamed from: a */
            public final Boolean m27094a() {
                return this.f25461a;
            }

            /* JADX INFO: renamed from: b */
            public final List<Integer> m27095b() {
                return this.f25470j;
            }

            /* JADX INFO: renamed from: c */
            public final List<Integer> m27096c() {
                return this.f25471k;
            }

            /* JADX INFO: renamed from: d */
            public final List<Integer> m27097d() {
                return this.f25472l;
            }

            /* JADX INFO: renamed from: e */
            public final List<Integer> m27098e() {
                return this.f25473m;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C15513c)) {
                    return false;
                }
                C15513c c15513c = (C15513c) obj;
                return Intrinsics.areEqual(this.f25461a, c15513c.f25461a) && Intrinsics.areEqual(this.f25462b, c15513c.f25462b) && Intrinsics.areEqual(this.f25463c, c15513c.f25463c) && Intrinsics.areEqual(this.f25464d, c15513c.f25464d) && Intrinsics.areEqual(this.f25465e, c15513c.f25465e) && Intrinsics.areEqual(this.f25466f, c15513c.f25466f) && Intrinsics.areEqual(this.f25467g, c15513c.f25467g) && Intrinsics.areEqual(this.f25468h, c15513c.f25468h) && Intrinsics.areEqual(this.f25469i, c15513c.f25469i) && Intrinsics.areEqual(this.f25470j, c15513c.f25470j) && Intrinsics.areEqual(this.f25471k, c15513c.f25471k) && Intrinsics.areEqual(this.f25472l, c15513c.f25472l) && Intrinsics.areEqual(this.f25473m, c15513c.f25473m) && Intrinsics.areEqual(this.f25474n, c15513c.f25474n) && Intrinsics.areEqual(this.f25475o, c15513c.f25475o) && Intrinsics.areEqual(this.f25476p, c15513c.f25476p);
            }

            /* JADX INFO: renamed from: f */
            public final JSONObject m27099f() {
                return this.f25474n;
            }

            /* JADX INFO: renamed from: g */
            public final a m27100g() {
                return this.f25475o;
            }

            /* JADX INFO: renamed from: h */
            public final String m27101h() {
                return this.f25476p;
            }

            public int hashCode() {
                Boolean bool = this.f25461a;
                int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
                Boolean bool2 = this.f25462b;
                int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                Boolean bool3 = this.f25463c;
                int iHashCode3 = (iHashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
                Integer num = this.f25464d;
                int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
                String str = this.f25465e;
                int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.f25466f;
                int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
                Integer num2 = this.f25467g;
                int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
                Integer num3 = this.f25468h;
                int iHashCode8 = (iHashCode7 + (num3 == null ? 0 : num3.hashCode())) * 31;
                Integer num4 = this.f25469i;
                int iHashCode9 = (iHashCode8 + (num4 == null ? 0 : num4.hashCode())) * 31;
                List<Integer> list = this.f25470j;
                int iHashCode10 = (iHashCode9 + (list == null ? 0 : list.hashCode())) * 31;
                List<Integer> list2 = this.f25471k;
                int iHashCode11 = (iHashCode10 + (list2 == null ? 0 : list2.hashCode())) * 31;
                List<Integer> list3 = this.f25472l;
                int iHashCode12 = (iHashCode11 + (list3 == null ? 0 : list3.hashCode())) * 31;
                List<Integer> list4 = this.f25473m;
                int iHashCode13 = (iHashCode12 + (list4 == null ? 0 : list4.hashCode())) * 31;
                JSONObject jSONObject = this.f25474n;
                int iHashCode14 = (iHashCode13 + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
                a aVar = this.f25475o;
                int iHashCode15 = (iHashCode14 + (aVar == null ? 0 : aVar.hashCode())) * 31;
                String str3 = this.f25476p;
                return iHashCode15 + (str3 != null ? str3.hashCode() : 0);
            }

            /* JADX INFO: renamed from: i */
            public final Boolean m27102i() {
                return this.f25462b;
            }

            /* JADX INFO: renamed from: j */
            public final Boolean m27103j() {
                return this.f25463c;
            }

            /* JADX INFO: renamed from: k */
            public final Integer m27104k() {
                return this.f25464d;
            }

            /* JADX INFO: renamed from: l */
            public final String m27105l() {
                return this.f25465e;
            }

            /* JADX INFO: renamed from: m */
            public final String m27106m() {
                return this.f25466f;
            }

            /* JADX INFO: renamed from: n */
            public final Integer m27107n() {
                return this.f25467g;
            }

            /* JADX INFO: renamed from: o */
            public final Integer m27108o() {
                return this.f25468h;
            }

            /* JADX INFO: renamed from: p */
            public final Integer m27109p() {
                return this.f25469i;
            }

            /* JADX INFO: renamed from: q */
            public final String m27110q() {
                return this.f25476p;
            }

            /* JADX INFO: renamed from: r */
            public final Integer m27111r() {
                return this.f25467g;
            }

            /* JADX INFO: renamed from: s */
            public final Boolean m27112s() {
                return this.f25463c;
            }

            /* JADX INFO: renamed from: t */
            public final Integer m27113t() {
                return this.f25464d;
            }

            public String toString() {
                return "Events(sendUltraEvents=" + this.f25461a + ", sendEventsToggle=" + this.f25462b + ", eventsCompression=" + this.f25463c + ", eventsCompressionLevel=" + this.f25464d + ", serverEventsURL=" + this.f25465e + ", serverEventsType=" + this.f25466f + ", backupThreshold=" + this.f25467g + ", maxNumberOfEvents=" + this.f25468h + ", maxEventsPerBatch=" + this.f25469i + ", optOut=" + this.f25470j + ", optIn=" + this.f25471k + ", triggerEvents=" + this.f25472l + ", nonConnectivityEvents=" + this.f25473m + ", genericParams=" + this.f25474n + ", pixel=" + this.f25475o + ", abt=" + this.f25476p + ")";
            }

            /* JADX INFO: renamed from: u */
            public final JSONObject m27114u() {
                return this.f25474n;
            }

            /* JADX INFO: renamed from: v */
            public final Integer m27115v() {
                return this.f25469i;
            }

            /* JADX INFO: renamed from: w */
            public final Integer m27116w() {
                return this.f25468h;
            }

            /* JADX INFO: renamed from: x */
            public final List<Integer> m27117x() {
                return this.f25473m;
            }

            /* JADX INFO: renamed from: y */
            public final List<Integer> m27118y() {
                return this.f25471k;
            }

            /* JADX INFO: renamed from: z */
            public final List<Integer> m27119z() {
                return this.f25470j;
            }

            public C15513c(Boolean bool, Boolean bool2, Boolean bool3, Integer num, String str, String str2, Integer num2, Integer num3, Integer num4, List<Integer> list, List<Integer> list2, List<Integer> list3, List<Integer> list4, JSONObject jSONObject, a aVar, String str3) {
                this.f25461a = bool;
                this.f25462b = bool2;
                this.f25463c = bool3;
                this.f25464d = num;
                this.f25465e = str;
                this.f25466f = str2;
                this.f25467g = num2;
                this.f25468h = num3;
                this.f25469i = num4;
                this.f25470j = list;
                this.f25471k = list2;
                this.f25472l = list3;
                this.f25473m = list4;
                this.f25474n = jSONObject;
                this.f25475o = aVar;
                this.f25476p = str3;
            }

            /* JADX INFO: renamed from: a */
            public final C15513c m27093a(Boolean bool, Boolean bool2, Boolean bool3, Integer num, String str, String str2, Integer num2, Integer num3, Integer num4, List<Integer> list, List<Integer> list2, List<Integer> list3, List<Integer> list4, JSONObject jSONObject, a aVar, String str3) {
                return new C15513c(bool, bool2, bool3, num, str, str2, num2, num3, num4, list, list2, list3, list4, jSONObject, aVar, str3);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX INFO: renamed from: a */
            public static /* synthetic */ C15513c m27086a(C15513c c15513c, Boolean bool, Boolean bool2, Boolean bool3, Integer num, String str, String str2, Integer num2, Integer num3, Integer num4, List list, List list2, List list3, List list4, JSONObject jSONObject, a aVar, String str3, int i, Object obj) {
                Boolean bool4 = (i & 1) != 0 ? c15513c.f25461a : bool;
                return c15513c.m27093a(bool4, (i & 2) != 0 ? c15513c.f25462b : bool2, (i & 4) != 0 ? c15513c.f25463c : bool3, (i & 8) != 0 ? c15513c.f25464d : num, (i & 16) != 0 ? c15513c.f25465e : str, (i & 32) != 0 ? c15513c.f25466f : str2, (i & 64) != 0 ? c15513c.f25467g : num2, (i & 128) != 0 ? c15513c.f25468h : num3, (i & 256) != 0 ? c15513c.f25469i : num4, (i & 512) != 0 ? c15513c.f25470j : list, (i & 1024) != 0 ? c15513c.f25471k : list2, (i & 2048) != 0 ? c15513c.f25472l : list3, (i & 4096) != 0 ? c15513c.f25473m : list4, (i & 8192) != 0 ? c15513c.f25474n : jSONObject, (i & 16384) != 0 ? c15513c.f25475o : aVar, (i & 32768) != 0 ? c15513c.f25476p : str3);
            }

            public /* synthetic */ C15513c(Boolean bool, Boolean bool2, Boolean bool3, Integer num, String str, String str2, Integer num2, Integer num3, Integer num4, List list, List list2, List list3, List list4, JSONObject jSONObject, a aVar, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : bool3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : str, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : num2, (i & 128) != 0 ? null : num3, (i & 256) != 0 ? null : num4, (i & 512) != 0 ? null : list, (i & 1024) != 0 ? null : list2, (i & 2048) != 0 ? null : list3, (i & 4096) != 0 ? null : list4, (i & 8192) != 0 ? null : jSONObject, (i & 16384) != 0 ? null : aVar, (i & 32768) != 0 ? null : str3);
            }
        }

        /* JADX INFO: renamed from: com.ironsource.P3$c$d */
        public static final class d {

            /* JADX INFO: renamed from: a */
            private final Map<String, String> f25479a;

            /* JADX WARN: Multi-variable type inference failed */
            public d() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            /* JADX INFO: renamed from: a */
            public final Map<String, String> m27128a() {
                return this.f25479a;
            }

            /* JADX INFO: renamed from: b */
            public final Map<String, String> m27129b() {
                return this.f25479a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && Intrinsics.areEqual(this.f25479a, ((d) obj).f25479a);
            }

            public int hashCode() {
                Map<String, String> map = this.f25479a;
                if (map == null) {
                    return 0;
                }
                return map.hashCode();
            }

            public String toString() {
                return "External(mediationTypes=" + this.f25479a + ")";
            }

            public d(Map<String, String> map) {
                this.f25479a = map;
            }

            /* JADX INFO: renamed from: a */
            public final d m27127a(Map<String, String> map) {
                return new d(map);
            }

            public /* synthetic */ d(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : map);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX INFO: renamed from: a */
            public static /* synthetic */ d m27126a(d dVar, Map map, int i, Object obj) {
                if ((i & 1) != 0) {
                    map = dVar.f25479a;
                }
                return dVar.m27127a(map);
            }
        }

        /* JADX INFO: renamed from: com.ironsource.P3$c$e */
        public static final class e {

            /* JADX INFO: renamed from: a */
            private final Integer f25480a;

            /* JADX INFO: renamed from: b */
            private final Integer f25481b;

            /* JADX INFO: renamed from: c */
            private final Integer f25482c;

            /* JADX INFO: renamed from: d */
            private final Boolean f25483d;

            public e() {
                this(null, null, null, null, 15, null);
            }

            /* JADX INFO: renamed from: a */
            public final Integer m27132a() {
                return this.f25480a;
            }

            /* JADX INFO: renamed from: b */
            public final Integer m27133b() {
                return this.f25481b;
            }

            /* JADX INFO: renamed from: c */
            public final Integer m27134c() {
                return this.f25482c;
            }

            /* JADX INFO: renamed from: d */
            public final Boolean m27135d() {
                return this.f25483d;
            }

            /* JADX INFO: renamed from: e */
            public final Integer m27136e() {
                return this.f25482c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return Intrinsics.areEqual(this.f25480a, eVar.f25480a) && Intrinsics.areEqual(this.f25481b, eVar.f25481b) && Intrinsics.areEqual(this.f25482c, eVar.f25482c) && Intrinsics.areEqual(this.f25483d, eVar.f25483d);
            }

            /* JADX INFO: renamed from: f */
            public final Integer m27137f() {
                return this.f25481b;
            }

            /* JADX INFO: renamed from: g */
            public final Integer m27138g() {
                return this.f25480a;
            }

            /* JADX INFO: renamed from: h */
            public final Boolean m27139h() {
                return this.f25483d;
            }

            public int hashCode() {
                Integer num = this.f25480a;
                int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
                Integer num2 = this.f25481b;
                int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
                Integer num3 = this.f25482c;
                int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
                Boolean bool = this.f25483d;
                return iHashCode3 + (bool != null ? bool.hashCode() : 0);
            }

            public String toString() {
                return "Loggers(server=" + this.f25480a + ", publisher=" + this.f25481b + ", console=" + this.f25482c + ", shouldSendPublisherLogsOnUIThread=" + this.f25483d + ")";
            }

            public e(Integer num, Integer num2, Integer num3, Boolean bool) {
                this.f25480a = num;
                this.f25481b = num2;
                this.f25482c = num3;
                this.f25483d = bool;
            }

            /* JADX INFO: renamed from: a */
            public final e m27131a(Integer num, Integer num2, Integer num3, Boolean bool) {
                return new e(num, num2, num3, bool);
            }

            /* JADX INFO: renamed from: a */
            public static /* synthetic */ e m27130a(e eVar, Integer num, Integer num2, Integer num3, Boolean bool, int i, Object obj) {
                if ((i & 1) != 0) {
                    num = eVar.f25480a;
                }
                if ((i & 2) != 0) {
                    num2 = eVar.f25481b;
                }
                if ((i & 4) != 0) {
                    num3 = eVar.f25482c;
                }
                if ((i & 8) != 0) {
                    bool = eVar.f25483d;
                }
                return eVar.m27131a(num, num2, num3, bool);
            }

            public /* synthetic */ e(Integer num, Integer num2, Integer num3, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3, (i & 8) != 0 ? null : bool);
            }
        }

        /* JADX INFO: renamed from: com.ironsource.P3$c$f */
        public static final class f {

            /* JADX INFO: renamed from: a */
            private final String f25484a;

            /* JADX INFO: renamed from: b */
            private final String f25485b;

            /* JADX INFO: renamed from: c */
            private final JSONObject f25486c;

            public f() {
                this(null, null, null, 7, null);
            }

            /* JADX INFO: renamed from: a */
            public final String m27142a() {
                return this.f25484a;
            }

            /* JADX INFO: renamed from: b */
            public final String m27143b() {
                return this.f25485b;
            }

            /* JADX INFO: renamed from: c */
            public final JSONObject m27144c() {
                return this.f25486c;
            }

            /* JADX INFO: renamed from: d */
            public final JSONObject m27145d() {
                return this.f25486c;
            }

            /* JADX INFO: renamed from: e */
            public final String m27146e() {
                return this.f25485b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof f)) {
                    return false;
                }
                f fVar = (f) obj;
                return Intrinsics.areEqual(this.f25484a, fVar.f25484a) && Intrinsics.areEqual(this.f25485b, fVar.f25485b) && Intrinsics.areEqual(this.f25486c, fVar.f25486c);
            }

            /* JADX INFO: renamed from: f */
            public final String m27147f() {
                return this.f25484a;
            }

            public int hashCode() {
                String str = this.f25484a;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.f25485b;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                JSONObject jSONObject = this.f25486c;
                return iHashCode2 + (jSONObject != null ? jSONObject.hashCode() : 0);
            }

            public String toString() {
                return "Segment(name=" + this.f25484a + ", id=" + this.f25485b + ", custom=" + this.f25486c + ")";
            }

            public f(String str, String str2, JSONObject jSONObject) {
                this.f25484a = str;
                this.f25485b = str2;
                this.f25486c = jSONObject;
            }

            /* JADX INFO: renamed from: a */
            public final f m27141a(String str, String str2, JSONObject jSONObject) {
                return new f(str, str2, jSONObject);
            }

            /* JADX INFO: renamed from: a */
            public static /* synthetic */ f m27140a(f fVar, String str, String str2, JSONObject jSONObject, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = fVar.f25484a;
                }
                if ((i & 2) != 0) {
                    str2 = fVar.f25485b;
                }
                if ((i & 4) != 0) {
                    jSONObject = fVar.f25486c;
                }
                return fVar.m27141a(str, str2, jSONObject);
            }

            public /* synthetic */ f(String str, String str2, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : jSONObject);
            }
        }

        /* JADX INFO: renamed from: com.ironsource.P3$c$g */
        public static final class g {

            /* JADX INFO: renamed from: a */
            private final Boolean f25487a;

            /* JADX INFO: renamed from: b */
            private final a f25488b;

            /* JADX INFO: renamed from: c */
            private final Boolean f25489c;

            /* JADX INFO: renamed from: d */
            private final C15514c f25490d;

            /* JADX INFO: renamed from: e */
            private final List<String> f25491e;

            /* JADX INFO: renamed from: f */
            private final Integer f25492f;

            /* JADX INFO: renamed from: g */
            private final Boolean f25493g;

            /* JADX INFO: renamed from: h */
            private final b f25494h;

            /* JADX INFO: renamed from: com.ironsource.P3$c$g$a */
            public static final class a {

                /* JADX INFO: renamed from: a */
                private final String f25495a;

                /* JADX INFO: renamed from: b */
                private final String f25496b;

                /* JADX WARN: Multi-variable type inference failed */
                public a() {
                    this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                }

                /* JADX INFO: renamed from: a */
                public final String m27168a() {
                    return this.f25495a;
                }

                /* JADX INFO: renamed from: b */
                public final String m27169b() {
                    return this.f25496b;
                }

                /* JADX INFO: renamed from: c */
                public final String m27170c() {
                    return this.f25496b;
                }

                /* JADX INFO: renamed from: d */
                public final String m27171d() {
                    return this.f25495a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof a)) {
                        return false;
                    }
                    a aVar = (a) obj;
                    return Intrinsics.areEqual(this.f25495a, aVar.f25495a) && Intrinsics.areEqual(this.f25496b, aVar.f25496b);
                }

                public int hashCode() {
                    String str = this.f25495a;
                    int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                    String str2 = this.f25496b;
                    return iHashCode + (str2 != null ? str2.hashCode() : 0);
                }

                public String toString() {
                    return "ConsentView(pre=" + this.f25495a + ", post=" + this.f25496b + ")";
                }

                public a(String str, String str2) {
                    this.f25495a = str;
                    this.f25496b = str2;
                }

                /* JADX INFO: renamed from: a */
                public final a m27167a(String str, String str2) {
                    return new a(str, str2);
                }

                public /* synthetic */ a(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
                }

                /* JADX INFO: renamed from: a */
                public static /* synthetic */ a m27166a(a aVar, String str, String str2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = aVar.f25495a;
                    }
                    if ((i & 2) != 0) {
                        str2 = aVar.f25496b;
                    }
                    return aVar.m27167a(str, str2);
                }
            }

            /* JADX INFO: renamed from: com.ironsource.P3$c$g$b */
            public static final class b {

                /* JADX INFO: renamed from: a */
                private final JSONObject f25497a;

                /* JADX WARN: Multi-variable type inference failed */
                public b() {
                    this(null, 1, 0 == true ? 1 : 0);
                }

                /* JADX INFO: renamed from: a */
                public final JSONObject m27174a() {
                    return this.f25497a;
                }

                /* JADX INFO: renamed from: b */
                public final JSONObject m27175b() {
                    return this.f25497a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof b) && Intrinsics.areEqual(this.f25497a, ((b) obj).f25497a);
                }

                public int hashCode() {
                    JSONObject jSONObject = this.f25497a;
                    if (jSONObject == null) {
                        return 0;
                    }
                    return jSONObject.hashCode();
                }

                public String toString() {
                    return "EpConfig(traits=" + this.f25497a + ")";
                }

                public b(JSONObject jSONObject) {
                    this.f25497a = jSONObject;
                }

                /* JADX INFO: renamed from: a */
                public final b m27173a(JSONObject jSONObject) {
                    return new b(jSONObject);
                }

                public /* synthetic */ b(JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : jSONObject);
                }

                /* JADX INFO: renamed from: a */
                public static /* synthetic */ b m27172a(b bVar, JSONObject jSONObject, int i, Object obj) {
                    if ((i & 1) != 0) {
                        jSONObject = bVar.f25497a;
                    }
                    return bVar.m27173a(jSONObject);
                }
            }

            /* JADX INFO: renamed from: com.ironsource.P3$c$g$c, reason: collision with other inner class name */
            public static final class C15514c {

                /* JADX INFO: renamed from: a */
                private final Map<String, a> f25498a;

                /* JADX INFO: renamed from: com.ironsource.P3$c$g$c$a */
                public static final class a {

                    /* JADX INFO: renamed from: a */
                    private final List<String> f25499a;

                    /* JADX WARN: Multi-variable type inference failed */
                    public a() {
                        this(null, 1, 0 == true ? 1 : 0);
                    }

                    /* JADX INFO: renamed from: a */
                    public final List<String> m27182a() {
                        return this.f25499a;
                    }

                    /* JADX INFO: renamed from: b */
                    public final List<String> m27183b() {
                        return this.f25499a;
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof a) && Intrinsics.areEqual(this.f25499a, ((a) obj).f25499a);
                    }

                    public int hashCode() {
                        List<String> list = this.f25499a;
                        if (list == null) {
                            return 0;
                        }
                        return list.hashCode();
                    }

                    public String toString() {
                        return "Provider(skanIds=" + this.f25499a + ")";
                    }

                    public a(List<String> list) {
                        this.f25499a = list;
                    }

                    /* JADX INFO: renamed from: a */
                    public final a m27181a(List<String> list) {
                        return new a(list);
                    }

                    public /* synthetic */ a(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
                        this((i & 1) != 0 ? null : list);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX INFO: renamed from: a */
                    public static /* synthetic */ a m27180a(a aVar, List list, int i, Object obj) {
                        if ((i & 1) != 0) {
                            list = aVar.f25499a;
                        }
                        return aVar.m27181a(list);
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                public C15514c() {
                    this(null, 1, 0 == true ? 1 : 0);
                }

                /* JADX INFO: renamed from: a */
                public final Map<String, a> m27178a() {
                    return this.f25498a;
                }

                /* JADX INFO: renamed from: b */
                public final Map<String, a> m27179b() {
                    return this.f25498a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C15514c) && Intrinsics.areEqual(this.f25498a, ((C15514c) obj).f25498a);
                }

                public int hashCode() {
                    Map<String, a> map = this.f25498a;
                    if (map == null) {
                        return 0;
                    }
                    return map.hashCode();
                }

                public String toString() {
                    return "Skd(providers=" + this.f25498a + ")";
                }

                public C15514c(Map<String, a> map) {
                    this.f25498a = map;
                }

                /* JADX INFO: renamed from: a */
                public final C15514c m27177a(Map<String, a> map) {
                    return new C15514c(map);
                }

                public /* synthetic */ C15514c(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : map);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX INFO: renamed from: a */
                public static /* synthetic */ C15514c m27176a(C15514c c15514c, Map map, int i, Object obj) {
                    if ((i & 1) != 0) {
                        map = c15514c.f25498a;
                    }
                    return c15514c.m27177a(map);
                }
            }

            public g() {
                this(null, null, null, null, null, null, null, null, 255, null);
            }

            /* JADX INFO: renamed from: a */
            public final Boolean m27150a() {
                return this.f25487a;
            }

            /* JADX INFO: renamed from: b */
            public final a m27151b() {
                return this.f25488b;
            }

            /* JADX INFO: renamed from: c */
            public final Boolean m27152c() {
                return this.f25489c;
            }

            /* JADX INFO: renamed from: d */
            public final C15514c m27153d() {
                return this.f25490d;
            }

            /* JADX INFO: renamed from: e */
            public final List<String> m27154e() {
                return this.f25491e;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof g)) {
                    return false;
                }
                g gVar = (g) obj;
                return Intrinsics.areEqual(this.f25487a, gVar.f25487a) && Intrinsics.areEqual(this.f25488b, gVar.f25488b) && Intrinsics.areEqual(this.f25489c, gVar.f25489c) && Intrinsics.areEqual(this.f25490d, gVar.f25490d) && Intrinsics.areEqual(this.f25491e, gVar.f25491e) && Intrinsics.areEqual(this.f25492f, gVar.f25492f) && Intrinsics.areEqual(this.f25493g, gVar.f25493g) && Intrinsics.areEqual(this.f25494h, gVar.f25494h);
            }

            /* JADX INFO: renamed from: f */
            public final Integer m27155f() {
                return this.f25492f;
            }

            /* JADX INFO: renamed from: g */
            public final Boolean m27156g() {
                return this.f25493g;
            }

            /* JADX INFO: renamed from: h */
            public final b m27157h() {
                return this.f25494h;
            }

            public int hashCode() {
                Boolean bool = this.f25487a;
                int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
                a aVar = this.f25488b;
                int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
                Boolean bool2 = this.f25489c;
                int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                C15514c c15514c = this.f25490d;
                int iHashCode4 = (iHashCode3 + (c15514c == null ? 0 : c15514c.hashCode())) * 31;
                List<String> list = this.f25491e;
                int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
                Integer num = this.f25492f;
                int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
                Boolean bool3 = this.f25493g;
                int iHashCode7 = (iHashCode6 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
                b bVar = this.f25494h;
                return iHashCode7 + (bVar != null ? bVar.hashCode() : 0);
            }

            /* JADX INFO: renamed from: i */
            public final a m27158i() {
                return this.f25488b;
            }

            /* JADX INFO: renamed from: j */
            public final b m27159j() {
                return this.f25494h;
            }

            /* JADX INFO: renamed from: k */
            public final List<String> m27160k() {
                return this.f25491e;
            }

            /* JADX INFO: renamed from: l */
            public final Boolean m27161l() {
                return this.f25489c;
            }

            /* JADX INFO: renamed from: m */
            public final Boolean m27162m() {
                return this.f25493g;
            }

            /* JADX INFO: renamed from: n */
            public final Boolean m27163n() {
                return this.f25487a;
            }

            /* JADX INFO: renamed from: o */
            public final C15514c m27164o() {
                return this.f25490d;
            }

            /* JADX INFO: renamed from: p */
            public final Integer m27165p() {
                return this.f25492f;
            }

            public String toString() {
                return "Settings(sid=" + this.f25487a + ", consentView=" + this.f25488b + ", passAdditionalContextualSignals=" + this.f25489c + ", skd=" + this.f25490d + ", isp=" + this.f25491e + ", uaeh=" + this.f25492f + ", sharedThreadPool=" + this.f25493g + ", epConfig=" + this.f25494h + ")";
            }

            public g(Boolean bool, a aVar, Boolean bool2, C15514c c15514c, List<String> list, Integer num, Boolean bool3, b bVar) {
                this.f25487a = bool;
                this.f25488b = aVar;
                this.f25489c = bool2;
                this.f25490d = c15514c;
                this.f25491e = list;
                this.f25492f = num;
                this.f25493g = bool3;
                this.f25494h = bVar;
            }

            /* JADX INFO: renamed from: a */
            public final g m27149a(Boolean bool, a aVar, Boolean bool2, C15514c c15514c, List<String> list, Integer num, Boolean bool3, b bVar) {
                return new g(bool, aVar, bool2, c15514c, list, num, bool3, bVar);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX INFO: renamed from: a */
            public static /* synthetic */ g m27148a(g gVar, Boolean bool, a aVar, Boolean bool2, C15514c c15514c, List list, Integer num, Boolean bool3, b bVar, int i, Object obj) {
                if ((i & 1) != 0) {
                    bool = gVar.f25487a;
                }
                if ((i & 2) != 0) {
                    aVar = gVar.f25488b;
                }
                if ((i & 4) != 0) {
                    bool2 = gVar.f25489c;
                }
                if ((i & 8) != 0) {
                    c15514c = gVar.f25490d;
                }
                if ((i & 16) != 0) {
                    list = gVar.f25491e;
                }
                if ((i & 32) != 0) {
                    num = gVar.f25492f;
                }
                if ((i & 64) != 0) {
                    bool3 = gVar.f25493g;
                }
                if ((i & 128) != 0) {
                    bVar = gVar.f25494h;
                }
                Boolean bool4 = bool3;
                b bVar2 = bVar;
                List list2 = list;
                Integer num2 = num;
                return gVar.m27149a(bool, aVar, bool2, c15514c, list2, num2, bool4, bVar2);
            }

            public /* synthetic */ g(Boolean bool, a aVar, Boolean bool2, C15514c c15514c, List list, Integer num, Boolean bool3, b bVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : aVar, (i & 4) != 0 ? null : bool2, (i & 8) != 0 ? null : c15514c, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : bool3, (i & 128) != 0 ? null : bVar);
            }
        }

        /* JADX INFO: renamed from: com.ironsource.P3$c$h */
        public static final class h {

            /* JADX INFO: renamed from: a */
            private final List<String> f25500a;

            /* JADX INFO: renamed from: b */
            private final JSONObject f25501b;

            /* JADX INFO: renamed from: c */
            private final Boolean f25502c;

            /* JADX INFO: renamed from: d */
            private final Boolean f25503d;

            /* JADX INFO: renamed from: e */
            private final Boolean f25504e;

            public h() {
                this(null, null, null, null, null, 31, null);
            }

            /* JADX INFO: renamed from: a */
            public final List<String> m27186a() {
                return this.f25500a;
            }

            /* JADX INFO: renamed from: b */
            public final JSONObject m27187b() {
                return this.f25501b;
            }

            /* JADX INFO: renamed from: c */
            public final Boolean m27188c() {
                return this.f25502c;
            }

            /* JADX INFO: renamed from: d */
            public final Boolean m27189d() {
                return this.f25503d;
            }

            /* JADX INFO: renamed from: e */
            public final Boolean m27190e() {
                return this.f25504e;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof h)) {
                    return false;
                }
                h hVar = (h) obj;
                return Intrinsics.areEqual(this.f25500a, hVar.f25500a) && Intrinsics.areEqual(this.f25501b, hVar.f25501b) && Intrinsics.areEqual(this.f25502c, hVar.f25502c) && Intrinsics.areEqual(this.f25503d, hVar.f25503d) && Intrinsics.areEqual(this.f25504e, hVar.f25504e);
            }

            /* JADX INFO: renamed from: f */
            public final Boolean m27191f() {
                return this.f25503d;
            }

            /* JADX INFO: renamed from: g */
            public final Boolean m27192g() {
                return this.f25502c;
            }

            /* JADX INFO: renamed from: h */
            public final Boolean m27193h() {
                return this.f25504e;
            }

            public int hashCode() {
                List<String> list = this.f25500a;
                int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
                JSONObject jSONObject = this.f25501b;
                int iHashCode2 = (iHashCode + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
                Boolean bool = this.f25502c;
                int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
                Boolean bool2 = this.f25503d;
                int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                Boolean bool3 = this.f25504e;
                return iHashCode4 + (bool3 != null ? bool3.hashCode() : 0);
            }

            /* JADX INFO: renamed from: i */
            public final List<String> m27194i() {
                return this.f25500a;
            }

            /* JADX INFO: renamed from: j */
            public final JSONObject m27195j() {
                return this.f25501b;
            }

            public String toString() {
                return "Token(optInKeys=" + this.f25500a + ", tokenGenericParams=" + this.f25501b + ", compressToken=" + this.f25502c + ", compressExternalToken=" + this.f25503d + ", oneToken=" + this.f25504e + ")";
            }

            public h(List<String> list, JSONObject jSONObject, Boolean bool, Boolean bool2, Boolean bool3) {
                this.f25500a = list;
                this.f25501b = jSONObject;
                this.f25502c = bool;
                this.f25503d = bool2;
                this.f25504e = bool3;
            }

            /* JADX INFO: renamed from: a */
            public final h m27185a(List<String> list, JSONObject jSONObject, Boolean bool, Boolean bool2, Boolean bool3) {
                return new h(list, jSONObject, bool, bool2, bool3);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX INFO: renamed from: a */
            public static /* synthetic */ h m27184a(h hVar, List list, JSONObject jSONObject, Boolean bool, Boolean bool2, Boolean bool3, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = hVar.f25500a;
                }
                if ((i & 2) != 0) {
                    jSONObject = hVar.f25501b;
                }
                if ((i & 4) != 0) {
                    bool = hVar.f25502c;
                }
                if ((i & 8) != 0) {
                    bool2 = hVar.f25503d;
                }
                if ((i & 16) != 0) {
                    bool3 = hVar.f25504e;
                }
                Boolean bool4 = bool3;
                Boolean bool5 = bool;
                return hVar.m27185a(list, jSONObject, bool5, bool2, bool4);
            }

            public /* synthetic */ h(List list, JSONObject jSONObject, Boolean bool, Boolean bool2, Boolean bool3, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : jSONObject, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : bool2, (i & 16) != 0 ? null : bool3);
            }
        }

        public c() {
            this(null, null, null, null, null, null, null, null, null, null, 1023, null);
        }

        /* JADX INFO: renamed from: a */
        public final e m26997a() {
            return this.f25420a;
        }

        /* JADX INFO: renamed from: b */
        public final Boolean m26999b() {
            return this.f25429j;
        }

        /* JADX INFO: renamed from: c */
        public final C15513c m27000c() {
            return this.f25421b;
        }

        /* JADX INFO: renamed from: d */
        public final h m27001d() {
            return this.f25422c;
        }

        /* JADX INFO: renamed from: e */
        public final f m27002e() {
            return this.f25423d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.areEqual(this.f25420a, cVar.f25420a) && Intrinsics.areEqual(this.f25421b, cVar.f25421b) && Intrinsics.areEqual(this.f25422c, cVar.f25422c) && Intrinsics.areEqual(this.f25423d, cVar.f25423d) && Intrinsics.areEqual(this.f25424e, cVar.f25424e) && Intrinsics.areEqual(this.f25425f, cVar.f25425f) && Intrinsics.areEqual(this.f25426g, cVar.f25426g) && Intrinsics.areEqual(this.f25427h, cVar.f25427h) && Intrinsics.areEqual(this.f25428i, cVar.f25428i) && Intrinsics.areEqual(this.f25429j, cVar.f25429j);
        }

        /* JADX INFO: renamed from: f */
        public final a m27003f() {
            return this.f25424e;
        }

        /* JADX INFO: renamed from: g */
        public final b m27004g() {
            return this.f25425f;
        }

        /* JADX INFO: renamed from: h */
        public final g m27005h() {
            return this.f25426g;
        }

        public int hashCode() {
            e eVar = this.f25420a;
            int iHashCode = (eVar == null ? 0 : eVar.hashCode()) * 31;
            C15513c c15513c = this.f25421b;
            int iHashCode2 = (iHashCode + (c15513c == null ? 0 : c15513c.hashCode())) * 31;
            h hVar = this.f25422c;
            int iHashCode3 = (iHashCode2 + (hVar == null ? 0 : hVar.hashCode())) * 31;
            f fVar = this.f25423d;
            int iHashCode4 = (iHashCode3 + (fVar == null ? 0 : fVar.hashCode())) * 31;
            a aVar = this.f25424e;
            int iHashCode5 = (iHashCode4 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            b bVar = this.f25425f;
            int iHashCode6 = (iHashCode5 + (bVar == null ? 0 : bVar.hashCode())) * 31;
            g gVar = this.f25426g;
            int iHashCode7 = (iHashCode6 + (gVar == null ? 0 : gVar.hashCode())) * 31;
            d dVar = this.f25427h;
            int iHashCode8 = (iHashCode7 + (dVar == null ? 0 : dVar.hashCode())) * 31;
            Boolean bool = this.f25428i;
            int iHashCode9 = (iHashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.f25429j;
            return iHashCode9 + (bool2 != null ? bool2.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i */
        public final d m27006i() {
            return this.f25427h;
        }

        /* JADX INFO: renamed from: j */
        public final Boolean m27007j() {
            return this.f25428i;
        }

        /* JADX INFO: renamed from: k */
        public final a m27008k() {
            return this.f25424e;
        }

        /* JADX INFO: renamed from: l */
        public final b m27009l() {
            return this.f25425f;
        }

        /* JADX INFO: renamed from: m */
        public final C15513c m27010m() {
            return this.f25421b;
        }

        /* JADX INFO: renamed from: n */
        public final d m27011n() {
            return this.f25427h;
        }

        /* JADX INFO: renamed from: o */
        public final Boolean m27012o() {
            return this.f25429j;
        }

        /* JADX INFO: renamed from: p */
        public final e m27013p() {
            return this.f25420a;
        }

        /* JADX INFO: renamed from: q */
        public final f m27014q() {
            return this.f25423d;
        }

        /* JADX INFO: renamed from: r */
        public final g m27015r() {
            return this.f25426g;
        }

        /* JADX INFO: renamed from: s */
        public final h m27016s() {
            return this.f25422c;
        }

        /* JADX INFO: renamed from: t */
        public final Boolean m27017t() {
            return this.f25428i;
        }

        public String toString() {
            return "Application(loggers=" + this.f25420a + ", events=" + this.f25421b + ", token=" + this.f25422c + ", segment=" + this.f25423d + ", auction=" + this.f25424e + ", crashReporter=" + this.f25425f + ", settings=" + this.f25426g + ", external=" + this.f25427h + ", uuidEnabled=" + this.f25428i + ", integration=" + this.f25429j + ")";
        }

        public c(e eVar, C15513c c15513c, h hVar, f fVar, a aVar, b bVar, g gVar, d dVar, Boolean bool, Boolean bool2) {
            this.f25420a = eVar;
            this.f25421b = c15513c;
            this.f25422c = hVar;
            this.f25423d = fVar;
            this.f25424e = aVar;
            this.f25425f = bVar;
            this.f25426g = gVar;
            this.f25427h = dVar;
            this.f25428i = bool;
            this.f25429j = bool2;
        }

        /* JADX INFO: renamed from: a */
        public final c m26998a(e eVar, C15513c c15513c, h hVar, f fVar, a aVar, b bVar, g gVar, d dVar, Boolean bool, Boolean bool2) {
            return new c(eVar, c15513c, hVar, fVar, aVar, bVar, gVar, dVar, bool, bool2);
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ c m26996a(c cVar, e eVar, C15513c c15513c, h hVar, f fVar, a aVar, b bVar, g gVar, d dVar, Boolean bool, Boolean bool2, int i, Object obj) {
            if ((i & 1) != 0) {
                eVar = cVar.f25420a;
            }
            if ((i & 2) != 0) {
                c15513c = cVar.f25421b;
            }
            if ((i & 4) != 0) {
                hVar = cVar.f25422c;
            }
            if ((i & 8) != 0) {
                fVar = cVar.f25423d;
            }
            if ((i & 16) != 0) {
                aVar = cVar.f25424e;
            }
            if ((i & 32) != 0) {
                bVar = cVar.f25425f;
            }
            if ((i & 64) != 0) {
                gVar = cVar.f25426g;
            }
            if ((i & 128) != 0) {
                dVar = cVar.f25427h;
            }
            if ((i & 256) != 0) {
                bool = cVar.f25428i;
            }
            if ((i & 512) != 0) {
                bool2 = cVar.f25429j;
            }
            Boolean bool3 = bool;
            Boolean bool4 = bool2;
            g gVar2 = gVar;
            d dVar2 = dVar;
            a aVar2 = aVar;
            b bVar2 = bVar;
            return cVar.m26998a(eVar, c15513c, hVar, fVar, aVar2, bVar2, gVar2, dVar2, bool3, bool4);
        }

        public /* synthetic */ c(e eVar, C15513c c15513c, h hVar, f fVar, a aVar, b bVar, g gVar, d dVar, Boolean bool, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : eVar, (i & 2) != 0 ? null : c15513c, (i & 4) != 0 ? null : hVar, (i & 8) != 0 ? null : fVar, (i & 16) != 0 ? null : aVar, (i & 32) != 0 ? null : bVar, (i & 64) != 0 ? null : gVar, (i & 128) != 0 ? null : dVar, (i & 256) != 0 ? null : bool, (i & 512) != 0 ? null : bool2);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.P3$d */
    public static final class d {

        /* JADX INFO: renamed from: a */
        private final String f25505a;

        /* JADX WARN: Multi-variable type inference failed */
        public d() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX INFO: renamed from: a */
        public final String m27198a() {
            return this.f25505a;
        }

        /* JADX INFO: renamed from: b */
        public final String m27199b() {
            return this.f25505a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && Intrinsics.areEqual(this.f25505a, ((d) obj).f25505a);
        }

        public int hashCode() {
            String str = this.f25505a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "TestSuite(controllerUrl=" + this.f25505a + ")";
        }

        public d(String str) {
            this.f25505a = str;
        }

        /* JADX INFO: renamed from: a */
        public final d m27197a(String str) {
            return new d(str);
        }

        public /* synthetic */ d(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ d m27196a(d dVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = dVar.f25505a;
            }
            return dVar.m27197a(str);
        }
    }

    public C11609P3() {
        this(null, null, null, null, 15, null);
    }

    /* JADX INFO: renamed from: a */
    public final c m26816a() {
        return this.f25339a;
    }

    /* JADX INFO: renamed from: b */
    public final a m26818b() {
        return this.f25340b;
    }

    /* JADX INFO: renamed from: c */
    public final d m26819c() {
        return this.f25341c;
    }

    /* JADX INFO: renamed from: d */
    public final b m26820d() {
        return this.f25342d;
    }

    /* JADX INFO: renamed from: e */
    public final a m26821e() {
        return this.f25340b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11609P3)) {
            return false;
        }
        C11609P3 c11609p3 = (C11609P3) obj;
        return Intrinsics.areEqual(this.f25339a, c11609p3.f25339a) && Intrinsics.areEqual(this.f25340b, c11609p3.f25340b) && Intrinsics.areEqual(this.f25341c, c11609p3.f25341c) && Intrinsics.areEqual(this.f25342d, c11609p3.f25342d);
    }

    /* JADX INFO: renamed from: f */
    public final b m26822f() {
        return this.f25342d;
    }

    /* JADX INFO: renamed from: g */
    public final c m26823g() {
        return this.f25339a;
    }

    /* JADX INFO: renamed from: h */
    public final d m26824h() {
        return this.f25341c;
    }

    public int hashCode() {
        c cVar = this.f25339a;
        int iHashCode = (cVar == null ? 0 : cVar.hashCode()) * 31;
        a aVar = this.f25340b;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        d dVar = this.f25341c;
        int iHashCode3 = (iHashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        b bVar = this.f25342d;
        return iHashCode3 + (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "Configurations2(application=" + this.f25339a + ", adFormats=" + this.f25340b + ", testSuite=" + this.f25341c + ", adQuality=" + this.f25342d + ")";
    }

    public C11609P3(c cVar, a aVar, d dVar, b bVar) {
        this.f25339a = cVar;
        this.f25340b = aVar;
        this.f25341c = dVar;
        this.f25342d = bVar;
    }

    /* JADX INFO: renamed from: a */
    public final C11609P3 m26817a(c cVar, a aVar, d dVar, b bVar) {
        return new C11609P3(cVar, aVar, dVar, bVar);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C11609P3 m26815a(C11609P3 c11609p3, c cVar, a aVar, d dVar, b bVar, int i, Object obj) {
        if ((i & 1) != 0) {
            cVar = c11609p3.f25339a;
        }
        if ((i & 2) != 0) {
            aVar = c11609p3.f25340b;
        }
        if ((i & 4) != 0) {
            dVar = c11609p3.f25341c;
        }
        if ((i & 8) != 0) {
            bVar = c11609p3.f25342d;
        }
        return c11609p3.m26817a(cVar, aVar, dVar, bVar);
    }

    public /* synthetic */ C11609P3(c cVar, a aVar, d dVar, b bVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : cVar, (i & 2) != 0 ? null : aVar, (i & 4) != 0 ? null : dVar, (i & 8) != 0 ? null : bVar);
    }
}
