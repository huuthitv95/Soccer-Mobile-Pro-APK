package com.ironsource;

import com.ironsource.mediationsdk.C12357j;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.ironsourceads.AdSize;
import java.util.Map;
import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.o1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C12397o1 {

    /* JADX INFO: renamed from: a */
    public static final C12397o1 f31578a = new C12397o1();

    /* JADX INFO: renamed from: com.ironsource.o1$a */
    public static final class a implements InterfaceC12415p1 {

        /* JADX INFO: renamed from: a */
        private final IronSource.EnumC12328a f31579a;

        public a(IronSource.EnumC12328a value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f31579a = value;
        }

        /* JADX INFO: renamed from: a */
        private final IronSource.EnumC12328a m32855a() {
            return this.f31579a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f31579a == ((a) obj).f31579a;
        }

        public int hashCode() {
            return this.f31579a.hashCode();
        }

        public String toString() {
            return "AdFormatEntity(value=" + this.f31579a + ")";
        }

        /* JADX INFO: renamed from: a */
        public final a m32857a(IronSource.EnumC12328a value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new a(value);
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ a m32856a(a aVar, IronSource.EnumC12328a enumC12328a, int i, Object obj) {
            if ((i & 1) != 0) {
                enumC12328a = aVar.f31579a;
            }
            return aVar.m32857a(enumC12328a);
        }

        @Override // com.ironsource.InterfaceC12415p1
        /* JADX INFO: renamed from: a */
        public void mo32858a(Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put("adUnit", Integer.valueOf(C12518sf.m33684c(this.f31579a)));
        }
    }

    /* JADX INFO: renamed from: com.ironsource.o1$b */
    public static final class b implements InterfaceC12415p1 {

        /* JADX INFO: renamed from: a */
        private final String f31580a;

        public b(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f31580a = value;
        }

        /* JADX INFO: renamed from: a */
        private final String m32860a() {
            return this.f31580a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.areEqual(this.f31580a, ((b) obj).f31580a);
        }

        public int hashCode() {
            return this.f31580a.hashCode();
        }

        public String toString() {
            return "AdIdentifier(value=" + this.f31580a + ")";
        }

        /* JADX INFO: renamed from: a */
        public final b m32861a(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new b(value);
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ b m32859a(b bVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = bVar.f31580a;
            }
            return bVar.m32861a(str);
        }

        @Override // com.ironsource.InterfaceC12415p1
        /* JADX INFO: renamed from: a */
        public void mo32858a(Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_IRONSOURCE_AD_OBJECT_ID, this.f31580a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.o1$c */
    public static final class c implements InterfaceC12415p1 {

        /* JADX INFO: renamed from: a */
        private final AdSize f31581a;

        public c(AdSize size) {
            Intrinsics.checkNotNullParameter(size, "size");
            this.f31581a = size;
        }

        /* JADX WARN: Code duplicated, block: B:25:0x004d  */
        @Override // com.ironsource.InterfaceC12415p1
        /* JADX INFO: renamed from: a */
        public void mo32858a(Map<String, Object> bundle) {
            int i;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            String sizeDescription = this.f31581a.getSizeDescription();
            int iHashCode = sizeDescription.hashCode();
            if (iHashCode != -96588539) {
                if (iHashCode != 72205083) {
                    if (iHashCode != 446888797) {
                        if (iHashCode == 1951953708 && sizeDescription.equals(C12357j.f31263a)) {
                            i = 1;
                        } else {
                            i = 0;
                        }
                    } else if (sizeDescription.equals(C12357j.f31266d)) {
                        i = 4;
                    } else {
                        i = 0;
                    }
                } else if (sizeDescription.equals(C12357j.f31264b)) {
                    i = 2;
                } else {
                    i = 0;
                }
            } else if (sizeDescription.equals(C12357j.f31269g)) {
                i = 3;
            } else {
                i = 0;
            }
            bundle.put(C12357j.f31270h, Integer.valueOf(i));
        }
    }

    /* JADX INFO: renamed from: com.ironsource.o1$d */
    public static final class d implements InterfaceC12415p1 {

        /* JADX INFO: renamed from: a */
        private final String f31582a;

        public d(String auctionId) {
            Intrinsics.checkNotNullParameter(auctionId, "auctionId");
            this.f31582a = auctionId;
        }

        /* JADX INFO: renamed from: a */
        private final String m32863a() {
            return this.f31582a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && Intrinsics.areEqual(this.f31582a, ((d) obj).f31582a);
        }

        public int hashCode() {
            return this.f31582a.hashCode();
        }

        public String toString() {
            return "AuctionId(auctionId=" + this.f31582a + ")";
        }

        /* JADX INFO: renamed from: a */
        public final d m32864a(String auctionId) {
            Intrinsics.checkNotNullParameter(auctionId, "auctionId");
            return new d(auctionId);
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ d m32862a(d dVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = dVar.f31582a;
            }
            return dVar.m32864a(str);
        }

        @Override // com.ironsource.InterfaceC12415p1
        /* JADX INFO: renamed from: a */
        public void mo32858a(Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put("auctionId", this.f31582a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.o1$e */
    public static final class e implements InterfaceC12415p1 {

        /* JADX INFO: renamed from: a */
        private final int f31583a;

        public e(int i) {
            this.f31583a = i;
        }

        /* JADX INFO: renamed from: a */
        private final int m32865a() {
            return this.f31583a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f31583a == ((e) obj).f31583a;
        }

        public int hashCode() {
            return this.f31583a;
        }

        public String toString() {
            return "DemandOnly(value=" + this.f31583a + ")";
        }

        /* JADX INFO: renamed from: a */
        public final e m32867a(int i) {
            return new e(i);
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ e m32866a(e eVar, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = eVar.f31583a;
            }
            return eVar.m32867a(i);
        }

        @Override // com.ironsource.InterfaceC12415p1
        /* JADX INFO: renamed from: a */
        public void mo32858a(Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_DEMAND_ONLY, Integer.valueOf(this.f31583a));
        }
    }

    /* JADX INFO: renamed from: com.ironsource.o1$f */
    public static final class f implements InterfaceC12415p1 {

        /* JADX INFO: renamed from: a */
        private final long f31584a;

        public f(long j) {
            this.f31584a = j;
        }

        /* JADX INFO: renamed from: a */
        private final long m32868a() {
            return this.f31584a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.f31584a == ((f) obj).f31584a;
        }

        public int hashCode() {
            return UByte$$ExternalSyntheticBackport0.m43485m(this.f31584a);
        }

        public String toString() {
            return "Duration(duration=" + this.f31584a + ")";
        }

        /* JADX INFO: renamed from: a */
        public final f m32870a(long j) {
            return new f(j);
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ f m32869a(f fVar, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = fVar.f31584a;
            }
            return fVar.m32870a(j);
        }

        @Override // com.ironsource.InterfaceC12415p1
        /* JADX INFO: renamed from: a */
        public void mo32858a(Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put("duration", Long.valueOf(this.f31584a));
        }
    }

    /* JADX INFO: renamed from: com.ironsource.o1$g */
    public static final class g implements InterfaceC12415p1 {

        /* JADX INFO: renamed from: a */
        private final String f31585a;

        public g(String dynamicSourceId) {
            Intrinsics.checkNotNullParameter(dynamicSourceId, "dynamicSourceId");
            this.f31585a = dynamicSourceId;
        }

        /* JADX INFO: renamed from: a */
        private final String m32872a() {
            return this.f31585a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && Intrinsics.areEqual(this.f31585a, ((g) obj).f31585a);
        }

        public int hashCode() {
            return this.f31585a.hashCode();
        }

        public String toString() {
            return "DynamicDemandSourceId(dynamicSourceId=" + this.f31585a + ")";
        }

        /* JADX INFO: renamed from: a */
        public final g m32873a(String dynamicSourceId) {
            Intrinsics.checkNotNullParameter(dynamicSourceId, "dynamicSourceId");
            return new g(dynamicSourceId);
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ g m32871a(g gVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = gVar.f31585a;
            }
            return gVar.m32873a(str);
        }

        @Override // com.ironsource.InterfaceC12415p1
        /* JADX INFO: renamed from: a */
        public void mo32858a(Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put("dynamicDemandSource", this.f31585a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.o1$h */
    public static final class h implements InterfaceC12415p1 {

        /* JADX INFO: renamed from: a */
        private final String f31586a;

        public h(String sourceId) {
            Intrinsics.checkNotNullParameter(sourceId, "sourceId");
            this.f31586a = sourceId;
        }

        /* JADX INFO: renamed from: a */
        private final String m32875a() {
            return this.f31586a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && Intrinsics.areEqual(this.f31586a, ((h) obj).f31586a);
        }

        public int hashCode() {
            return this.f31586a.hashCode();
        }

        public String toString() {
            return "DynamicSourceId(sourceId=" + this.f31586a + ")";
        }

        /* JADX INFO: renamed from: a */
        public final h m32876a(String sourceId) {
            Intrinsics.checkNotNullParameter(sourceId, "sourceId");
            return new h(sourceId);
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ h m32874a(h hVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = hVar.f31586a;
            }
            return hVar.m32876a(str);
        }

        @Override // com.ironsource.InterfaceC12415p1
        /* JADX INFO: renamed from: a */
        public void mo32858a(Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put("dynamicDemandSource", this.f31586a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.o1$i */
    public static final class i implements InterfaceC12415p1 {

        /* JADX INFO: renamed from: a */
        public static final i f31587a = new i();

        private i() {
        }

        @Override // com.ironsource.InterfaceC12415p1
        /* JADX INFO: renamed from: a */
        public void mo32858a(Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
        }
    }

    /* JADX INFO: renamed from: com.ironsource.o1$j */
    public static final class j implements InterfaceC12415p1 {

        /* JADX INFO: renamed from: a */
        private final int f31588a;

        public j(int i) {
            this.f31588a = i;
        }

        /* JADX INFO: renamed from: a */
        private final int m32877a() {
            return this.f31588a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && this.f31588a == ((j) obj).f31588a;
        }

        public int hashCode() {
            return this.f31588a;
        }

        public String toString() {
            return "ErrorCode(code=" + this.f31588a + ")";
        }

        /* JADX INFO: renamed from: a */
        public final j m32879a(int i) {
            return new j(i);
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ j m32878a(j jVar, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = jVar.f31588a;
            }
            return jVar.m32879a(i);
        }

        @Override // com.ironsource.InterfaceC12415p1
        /* JADX INFO: renamed from: a */
        public void mo32858a(Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put("errorCode", Integer.valueOf(this.f31588a));
        }
    }

    /* JADX INFO: renamed from: com.ironsource.o1$k */
    public static final class k implements InterfaceC12415p1 {

        /* JADX INFO: renamed from: a */
        private final String f31589a;

        public k(String str) {
            this.f31589a = str;
        }

        /* JADX INFO: renamed from: a */
        private final String m32881a() {
            return this.f31589a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && Intrinsics.areEqual(this.f31589a, ((k) obj).f31589a);
        }

        public int hashCode() {
            String str = this.f31589a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "ErrorReason(reason=" + this.f31589a + ")";
        }

        /* JADX INFO: renamed from: a */
        public final k m32882a(String str) {
            return new k(str);
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ k m32880a(k kVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = kVar.f31589a;
            }
            return kVar.m32882a(str);
        }

        @Override // com.ironsource.InterfaceC12415p1
        /* JADX INFO: renamed from: a */
        public void mo32858a(Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            String str = this.f31589a;
            if (str == null || str.length() == 0) {
                return;
            }
            bundle.put("reason", this.f31589a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.o1$l */
    public static final class l implements InterfaceC12415p1 {

        /* JADX INFO: renamed from: a */
        private final String f31590a;

        public l(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f31590a = value;
        }

        /* JADX INFO: renamed from: a */
        private final String m32884a() {
            return this.f31590a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && Intrinsics.areEqual(this.f31590a, ((l) obj).f31590a);
        }

        public int hashCode() {
            return this.f31590a.hashCode();
        }

        public String toString() {
            return "Ext1(value=" + this.f31590a + ")";
        }

        /* JADX INFO: renamed from: a */
        public final l m32885a(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new l(value);
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ l m32883a(l lVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = lVar.f31590a;
            }
            return lVar.m32885a(str);
        }

        @Override // com.ironsource.InterfaceC12415p1
        /* JADX INFO: renamed from: a */
        public void mo32858a(Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_EXT1, this.f31590a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.o1$m */
    public static final class m implements InterfaceC12415p1 {

        /* JADX INFO: renamed from: a */
        private final JSONObject f31591a;

        public m(JSONObject jSONObject) {
            this.f31591a = jSONObject;
        }

        /* JADX INFO: renamed from: a */
        private final JSONObject m32887a() {
            return this.f31591a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && Intrinsics.areEqual(this.f31591a, ((m) obj).f31591a);
        }

        public int hashCode() {
            JSONObject jSONObject = this.f31591a;
            if (jSONObject == null) {
                return 0;
            }
            return jSONObject.hashCode();
        }

        public String toString() {
            return "GenericParams(genericParams=" + this.f31591a + ")";
        }

        /* JADX INFO: renamed from: a */
        public final m m32888a(JSONObject jSONObject) {
            return new m(jSONObject);
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ m m32886a(m mVar, JSONObject jSONObject, int i, Object obj) {
            if ((i & 1) != 0) {
                jSONObject = mVar.f31591a;
            }
            return mVar.m32888a(jSONObject);
        }

        @Override // com.ironsource.InterfaceC12415p1
        /* JADX INFO: renamed from: a */
        public void mo32858a(Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            JSONObject jSONObject = this.f31591a;
            if (jSONObject == null) {
                return;
            }
            bundle.put("genericParams", jSONObject);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.o1$n */
    public static final class n implements InterfaceC12415p1 {

        /* JADX INFO: renamed from: a */
        private final int f31592a;

        public n(int i) {
            this.f31592a = i;
        }

        /* JADX INFO: renamed from: a */
        private final int m32889a() {
            return this.f31592a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && this.f31592a == ((n) obj).f31592a;
        }

        public int hashCode() {
            return this.f31592a;
        }

        public String toString() {
            return "InstanceType(instanceType=" + this.f31592a + ")";
        }

        /* JADX INFO: renamed from: a */
        public final n m32891a(int i) {
            return new n(i);
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ n m32890a(n nVar, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = nVar.f31592a;
            }
            return nVar.m32891a(i);
        }

        @Override // com.ironsource.InterfaceC12415p1
        /* JADX INFO: renamed from: a */
        public void mo32858a(Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put("instanceType", Integer.valueOf(this.f31592a));
        }
    }

    /* JADX INFO: renamed from: com.ironsource.o1$o */
    public static final class o implements InterfaceC12415p1 {

        /* JADX INFO: renamed from: a */
        private final int f31593a;

        public o(int i) {
            this.f31593a = i;
        }

        /* JADX INFO: renamed from: a */
        private final int m32892a() {
            return this.f31593a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && this.f31593a == ((o) obj).f31593a;
        }

        public int hashCode() {
            return this.f31593a;
        }

        public String toString() {
            return "MultipleAdObjects(value=" + this.f31593a + ")";
        }

        /* JADX INFO: renamed from: a */
        public final o m32894a(int i) {
            return new o(i);
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ o m32893a(o oVar, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = oVar.f31593a;
            }
            return oVar.m32894a(i);
        }

        @Override // com.ironsource.InterfaceC12415p1
        /* JADX INFO: renamed from: a */
        public void mo32858a(Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put("isMultipleAdObjects", Integer.valueOf(this.f31593a));
        }
    }

    /* JADX INFO: renamed from: com.ironsource.o1$p */
    public static final class p implements InterfaceC12415p1 {

        /* JADX INFO: renamed from: a */
        private final int f31594a;

        public p(int i) {
            this.f31594a = i;
        }

        /* JADX INFO: renamed from: a */
        private final int m32895a() {
            return this.f31594a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof p) && this.f31594a == ((p) obj).f31594a;
        }

        public int hashCode() {
            return this.f31594a;
        }

        public String toString() {
            return "OneFlow(value=" + this.f31594a + ")";
        }

        /* JADX INFO: renamed from: a */
        public final p m32897a(int i) {
            return new p(i);
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ p m32896a(p pVar, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = pVar.f31594a;
            }
            return pVar.m32897a(i);
        }

        @Override // com.ironsource.InterfaceC12415p1
        /* JADX INFO: renamed from: a */
        public void mo32858a(Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put("isOneFlow", Integer.valueOf(this.f31594a));
        }
    }

    /* JADX INFO: renamed from: com.ironsource.o1$q */
    public static final class q implements InterfaceC12415p1 {

        /* JADX INFO: renamed from: a */
        private final String f31595a;

        public q(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f31595a = value;
        }

        /* JADX INFO: renamed from: a */
        private final String m32899a() {
            return this.f31595a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof q) && Intrinsics.areEqual(this.f31595a, ((q) obj).f31595a);
        }

        public int hashCode() {
            return this.f31595a.hashCode();
        }

        public String toString() {
            return "Placement(value=" + this.f31595a + ")";
        }

        /* JADX INFO: renamed from: a */
        public final q m32900a(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new q(value);
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ q m32898a(q qVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = qVar.f31595a;
            }
            return qVar.m32900a(str);
        }

        @Override // com.ironsource.InterfaceC12415p1
        /* JADX INFO: renamed from: a */
        public void mo32858a(Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put("placement", this.f31595a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.o1$r */
    public static final class r implements InterfaceC12415p1 {

        /* JADX INFO: renamed from: a */
        private final int f31596a;

        public r(int i) {
            this.f31596a = i;
        }

        /* JADX INFO: renamed from: a */
        private final int m32901a() {
            return this.f31596a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r) && this.f31596a == ((r) obj).f31596a;
        }

        public int hashCode() {
            return this.f31596a;
        }

        public String toString() {
            return "Programmatic(programmatic=" + this.f31596a + ")";
        }

        /* JADX INFO: renamed from: a */
        public final r m32903a(int i) {
            return new r(i);
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ r m32902a(r rVar, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = rVar.f31596a;
            }
            return rVar.m32903a(i);
        }

        @Override // com.ironsource.InterfaceC12415p1
        /* JADX INFO: renamed from: a */
        public void mo32858a(Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_PROGRAMMATIC, Integer.valueOf(this.f31596a));
        }
    }

    /* JADX INFO: renamed from: com.ironsource.o1$s */
    public static final class s implements InterfaceC12415p1 {

        /* JADX INFO: renamed from: a */
        private final String f31597a;

        public s(String sourceName) {
            Intrinsics.checkNotNullParameter(sourceName, "sourceName");
            this.f31597a = sourceName;
        }

        /* JADX INFO: renamed from: a */
        private final String m32905a() {
            return this.f31597a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s) && Intrinsics.areEqual(this.f31597a, ((s) obj).f31597a);
        }

        public int hashCode() {
            return this.f31597a.hashCode();
        }

        public String toString() {
            return "Provider(sourceName=" + this.f31597a + ")";
        }

        /* JADX INFO: renamed from: a */
        public final s m32906a(String sourceName) {
            Intrinsics.checkNotNullParameter(sourceName, "sourceName");
            return new s(sourceName);
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ s m32904a(s sVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = sVar.f31597a;
            }
            return sVar.m32906a(str);
        }

        @Override // com.ironsource.InterfaceC12415p1
        /* JADX INFO: renamed from: a */
        public void mo32858a(Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_PROVIDER, this.f31597a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.o1$t */
    public static final class t implements InterfaceC12415p1 {

        /* JADX INFO: renamed from: a */
        private final int f31598a;

        public t(int i) {
            this.f31598a = i;
        }

        /* JADX INFO: renamed from: a */
        private final int m32907a() {
            return this.f31598a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof t) && this.f31598a == ((t) obj).f31598a;
        }

        public int hashCode() {
            return this.f31598a;
        }

        public String toString() {
            return "RewardAmount(value=" + this.f31598a + ")";
        }

        /* JADX INFO: renamed from: a */
        public final t m32909a(int i) {
            return new t(i);
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ t m32908a(t tVar, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = tVar.f31598a;
            }
            return tVar.m32909a(i);
        }

        @Override // com.ironsource.InterfaceC12415p1
        /* JADX INFO: renamed from: a */
        public void mo32858a(Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_REWARD_AMOUNT, Integer.valueOf(this.f31598a));
        }
    }

    /* JADX INFO: renamed from: com.ironsource.o1$u */
    public static final class u implements InterfaceC12415p1 {

        /* JADX INFO: renamed from: a */
        private final String f31599a;

        public u(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f31599a = value;
        }

        /* JADX INFO: renamed from: a */
        private final String m32911a() {
            return this.f31599a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof u) && Intrinsics.areEqual(this.f31599a, ((u) obj).f31599a);
        }

        public int hashCode() {
            return this.f31599a.hashCode();
        }

        public String toString() {
            return "RewardName(value=" + this.f31599a + ")";
        }

        /* JADX INFO: renamed from: a */
        public final u m32912a(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new u(value);
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ u m32910a(u uVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = uVar.f31599a;
            }
            return uVar.m32912a(str);
        }

        @Override // com.ironsource.InterfaceC12415p1
        /* JADX INFO: renamed from: a */
        public void mo32858a(Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_REWARD_NAME, this.f31599a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.o1$v */
    public static final class v implements InterfaceC12415p1 {

        /* JADX INFO: renamed from: a */
        private final String f31600a;

        public v(String version) {
            Intrinsics.checkNotNullParameter(version, "version");
            this.f31600a = version;
        }

        /* JADX INFO: renamed from: a */
        private final String m32914a() {
            return this.f31600a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof v) && Intrinsics.areEqual(this.f31600a, ((v) obj).f31600a);
        }

        public int hashCode() {
            return this.f31600a.hashCode();
        }

        public String toString() {
            return "SdkVersion(version=" + this.f31600a + ")";
        }

        /* JADX INFO: renamed from: a */
        public final v m32915a(String version) {
            Intrinsics.checkNotNullParameter(version, "version");
            return new v(version);
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ v m32913a(v vVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = vVar.f31600a;
            }
            return vVar.m32915a(str);
        }

        @Override // com.ironsource.InterfaceC12415p1
        /* JADX INFO: renamed from: a */
        public void mo32858a(Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, this.f31600a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.o1$w */
    public static final class w implements InterfaceC12415p1 {

        /* JADX INFO: renamed from: a */
        private final int f31601a;

        public w(int i) {
            this.f31601a = i;
        }

        /* JADX INFO: renamed from: a */
        private final int m32916a() {
            return this.f31601a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof w) && this.f31601a == ((w) obj).f31601a;
        }

        public int hashCode() {
            return this.f31601a;
        }

        public String toString() {
            return "SessionDepth(sessionDepth=" + this.f31601a + ")";
        }

        /* JADX INFO: renamed from: a */
        public final w m32918a(int i) {
            return new w(i);
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ w m32917a(w wVar, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = wVar.f31601a;
            }
            return wVar.m32918a(i);
        }

        @Override // com.ironsource.InterfaceC12415p1
        /* JADX INFO: renamed from: a */
        public void mo32858a(Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put("sessionDepth", Integer.valueOf(this.f31601a));
        }
    }

    /* JADX INFO: renamed from: com.ironsource.o1$x */
    public static final class x implements InterfaceC12415p1 {

        /* JADX INFO: renamed from: a */
        private final String f31602a;

        public x(String subProviderId) {
            Intrinsics.checkNotNullParameter(subProviderId, "subProviderId");
            this.f31602a = subProviderId;
        }

        /* JADX INFO: renamed from: a */
        private final String m32920a() {
            return this.f31602a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof x) && Intrinsics.areEqual(this.f31602a, ((x) obj).f31602a);
        }

        public int hashCode() {
            return this.f31602a.hashCode();
        }

        public String toString() {
            return "SubProviderId(subProviderId=" + this.f31602a + ")";
        }

        /* JADX INFO: renamed from: a */
        public final x m32921a(String subProviderId) {
            Intrinsics.checkNotNullParameter(subProviderId, "subProviderId");
            return new x(subProviderId);
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ x m32919a(x xVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = xVar.f31602a;
            }
            return xVar.m32921a(str);
        }

        @Override // com.ironsource.InterfaceC12415p1
        /* JADX INFO: renamed from: a */
        public void mo32858a(Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put("spId", this.f31602a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.o1$y */
    public static final class y implements InterfaceC12415p1 {

        /* JADX INFO: renamed from: a */
        private final String f31603a;

        public y(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f31603a = value;
        }

        /* JADX INFO: renamed from: a */
        private final String m32923a() {
            return this.f31603a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof y) && Intrinsics.areEqual(this.f31603a, ((y) obj).f31603a);
        }

        public int hashCode() {
            return this.f31603a.hashCode();
        }

        public String toString() {
            return "TransId(value=" + this.f31603a + ")";
        }

        /* JADX INFO: renamed from: a */
        public final y m32924a(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new y(value);
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ y m32922a(y yVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = yVar.f31603a;
            }
            return yVar.m32924a(str);
        }

        @Override // com.ironsource.InterfaceC12415p1
        /* JADX INFO: renamed from: a */
        public void mo32858a(Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_TRANS_ID, this.f31603a);
        }
    }

    private C12397o1() {
    }
}
