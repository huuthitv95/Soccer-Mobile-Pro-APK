package com.ironsource;

import com.ironsource.mediationsdk.C12333d;
import com.ironsource.mediationsdk.demandOnly.InterfaceC12335a;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.m2 */
/* JADX INFO: loaded from: classes6.dex */
public final class C12315m2 {

    /* JADX INFO: renamed from: h */
    public static final b f30902h = new b(null);

    /* JADX INFO: renamed from: a */
    private final String f30903a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC12335a f30904b;

    /* JADX INFO: renamed from: c */
    private final C12434q2 f30905c;

    /* JADX INFO: renamed from: d */
    private final JSONObject f30906d;

    /* JADX INFO: renamed from: e */
    private final JSONObject f30907e;

    /* JADX INFO: renamed from: f */
    private final C12204g2 f30908f;

    /* JADX INFO: renamed from: g */
    private final C12452r2 f30909g;

    /* JADX INFO: renamed from: com.ironsource.m2$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private final JSONObject f30910a;

        /* JADX INFO: renamed from: b */
        private final String f30911b;

        /* JADX INFO: renamed from: c */
        private final String f30912c;

        /* JADX INFO: renamed from: d */
        private final InterfaceC12335a f30913d;

        /* JADX INFO: renamed from: e */
        private final C12434q2 f30914e;

        /* JADX INFO: renamed from: f */
        private final JSONObject f30915f;

        /* JADX INFO: renamed from: g */
        private final JSONObject f30916g;

        /* JADX INFO: renamed from: h */
        private final C12204g2 f30917h;

        /* JADX INFO: renamed from: i */
        private final C12452r2 f30918i;

        public a(JSONObject auctionData, String instanceId) {
            Intrinsics.checkNotNullParameter(auctionData, "auctionData");
            Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            this.f30910a = auctionData;
            this.f30911b = instanceId;
            JSONObject jSONObjectM32139a = m32139a(auctionData);
            this.f30912c = auctionData.optString("auctionId");
            InterfaceC12335a interfaceC12335aM32138a = m32138a(auctionData, jSONObjectM32139a);
            this.f30913d = interfaceC12335aM32138a;
            this.f30914e = m32142c(jSONObjectM32139a);
            this.f30915f = m32143d(jSONObjectM32139a);
            this.f30916g = m32141b(jSONObjectM32139a);
            this.f30917h = m32137a(interfaceC12335aM32138a, instanceId);
            this.f30918i = m32140b(interfaceC12335aM32138a, instanceId);
        }

        /* JADX INFO: renamed from: d */
        private final JSONObject m32143d(JSONObject jSONObject) {
            return jSONObject.optJSONObject("genericParams");
        }

        /* JADX INFO: renamed from: a */
        public final C12315m2 m32144a() {
            return new C12315m2(this.f30912c, this.f30913d, this.f30914e, this.f30915f, this.f30916g, this.f30917h, this.f30918i);
        }

        /* JADX INFO: renamed from: b */
        public final JSONObject m32145b() {
            return this.f30910a;
        }

        /* JADX INFO: renamed from: c */
        public final String m32146c() {
            return this.f30911b;
        }

        /* JADX INFO: renamed from: b */
        private final JSONObject m32141b(JSONObject jSONObject) {
            return jSONObject.optJSONObject("configurations");
        }

        /* JADX INFO: renamed from: c */
        private final C12434q2 m32142c(JSONObject jSONObject) {
            return new C12434q2(jSONObject);
        }

        /* JADX INFO: renamed from: b */
        private final C12452r2 m32140b(InterfaceC12335a interfaceC12335a, String str) {
            C12434q2 c12434q2Mo32355a = interfaceC12335a.mo32355a(str);
            if (c12434q2Mo32355a == null) {
                return null;
            }
            String strM33151k = c12434q2Mo32355a.m33151k();
            Intrinsics.checkNotNullExpressionValue(strM33151k, "it.serverData");
            return new C12452r2(strM33151k);
        }

        /* JADX INFO: renamed from: a */
        private final JSONObject m32139a(JSONObject jSONObject) {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("settings");
            return jSONObjectOptJSONObject == null ? new JSONObject() : jSONObjectOptJSONObject;
        }

        /* JADX INFO: renamed from: a */
        private final InterfaceC12335a m32138a(JSONObject jSONObject, JSONObject jSONObject2) {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject(C12333d.f31040d);
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(C12333d.f31044h);
            if (jSONArrayOptJSONArray != null) {
                IntRange intRangeUntil = RangesKt.until(0, jSONArrayOptJSONArray.length());
                ArrayList arrayList2 = new ArrayList();
                Iterator<Integer> it = intRangeUntil.iterator();
                while (it.hasNext()) {
                    int iNextInt = ((IntIterator) it).nextInt();
                    C12434q2 c12434q2 = new C12434q2(jSONArrayOptJSONArray.getJSONObject(iNextInt), iNextInt, jSONObjectOptJSONObject);
                    if (!c12434q2.m33154n()) {
                        c12434q2 = null;
                    }
                    if (c12434q2 != null) {
                        arrayList2.add(c12434q2);
                    }
                }
                arrayList.addAll(arrayList2);
            }
            return new InterfaceC12335a.a(arrayList);
        }

        /* JADX INFO: renamed from: a */
        private final C12204g2 m32137a(InterfaceC12335a interfaceC12335a, String str) {
            C12434q2 c12434q2Mo32355a = interfaceC12335a.mo32355a(str);
            if (c12434q2Mo32355a == null) {
                return null;
            }
            C12204g2 c12204g2 = new C12204g2();
            c12204g2.m31517a(c12434q2Mo32355a.m33142b());
            c12204g2.m31521c(c12434q2Mo32355a.m33148h());
            c12204g2.m31519b(c12434q2Mo32355a.m33147g());
            return c12204g2;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m2$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final Object m32148a(JSONObject auctionData, String instanceId) {
            Intrinsics.checkNotNullParameter(auctionData, "auctionData");
            Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            return m32147a(new a(auctionData, instanceId).m32144a(), instanceId);
        }

        private b() {
        }

        /* JADX INFO: renamed from: a */
        private final Object m32147a(C12315m2 c12315m2, String str) {
            String strM32129b = c12315m2.m32129b();
            if (strM32129b != null && strM32129b.length() != 0) {
                if (c12315m2.m32136i()) {
                    Result.Companion companion = Result.INSTANCE;
                    return Result.m44946constructorimpl(ResultKt.createFailure(new C11782Z7(C12526t5.f32437a.m33753f())));
                }
                C12434q2 c12434q2M32127a = c12315m2.m32127a(str);
                if (c12434q2M32127a == null) {
                    Result.Companion companion2 = Result.INSTANCE;
                    return Result.m44946constructorimpl(ResultKt.createFailure(new C11782Z7(C12526t5.f32437a.m33757j())));
                }
                String strM33151k = c12434q2M32127a.m33151k();
                if (strM33151k != null && strM33151k.length() != 0) {
                    Result.Companion companion3 = Result.INSTANCE;
                    return Result.m44946constructorimpl(c12315m2);
                }
                Result.Companion companion4 = Result.INSTANCE;
                return Result.m44946constructorimpl(ResultKt.createFailure(new C11782Z7(C12526t5.f32437a.m33752e())));
            }
            Result.Companion companion5 = Result.INSTANCE;
            return Result.m44946constructorimpl(ResultKt.createFailure(new C11782Z7(C12526t5.f32437a.m33756i())));
        }
    }

    public C12315m2(String str, InterfaceC12335a waterfall, C12434q2 genericNotifications, JSONObject jSONObject, JSONObject jSONObject2, C12204g2 c12204g2, C12452r2 c12452r2) {
        Intrinsics.checkNotNullParameter(waterfall, "waterfall");
        Intrinsics.checkNotNullParameter(genericNotifications, "genericNotifications");
        this.f30903a = str;
        this.f30904b = waterfall;
        this.f30905c = genericNotifications;
        this.f30906d = jSONObject;
        this.f30907e = jSONObject2;
        this.f30908f = c12204g2;
        this.f30909g = c12452r2;
    }

    /* JADX INFO: renamed from: a */
    public final String m32128a() {
        C12452r2 c12452r2 = this.f30909g;
        if (c12452r2 != null) {
            return c12452r2.m33214d();
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final String m32129b() {
        return this.f30903a;
    }

    /* JADX INFO: renamed from: c */
    public final C12204g2 m32130c() {
        return this.f30908f;
    }

    /* JADX INFO: renamed from: d */
    public final JSONObject m32131d() {
        return this.f30907e;
    }

    /* JADX INFO: renamed from: e */
    public final C12434q2 m32132e() {
        return this.f30905c;
    }

    /* JADX INFO: renamed from: f */
    public final JSONObject m32133f() {
        return this.f30906d;
    }

    /* JADX INFO: renamed from: g */
    public final C12452r2 m32134g() {
        return this.f30909g;
    }

    /* JADX INFO: renamed from: h */
    public final InterfaceC12335a m32135h() {
        return this.f30904b;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m32136i() {
        return this.f30904b.isEmpty();
    }

    /* JADX INFO: renamed from: a */
    public final C12434q2 m32127a(String providerName) {
        Intrinsics.checkNotNullParameter(providerName, "providerName");
        return m32126a(this.f30904b, providerName);
    }

    /* JADX INFO: renamed from: a */
    private final C12434q2 m32126a(InterfaceC12335a interfaceC12335a, String str) {
        return interfaceC12335a.mo32355a(str);
    }
}
