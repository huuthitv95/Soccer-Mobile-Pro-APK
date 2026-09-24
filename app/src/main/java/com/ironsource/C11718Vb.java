package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.Vb */
/* JADX INFO: loaded from: classes6.dex */
public final class C11718Vb extends C11723W {

    /* JADX INFO: renamed from: s */
    private final String f26047s;

    /* JADX INFO: renamed from: t */
    private final List<NetworkSettings> f26048t;

    /* JADX INFO: renamed from: u */
    private final C11545Lb f26049u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C11718Vb(String str, List<? extends NetworkSettings> list, C11545Lb configs) {
        super(IronSource.EnumC12328a.NATIVE_AD, str, list, configs.m26417d(), configs.m26411b(), (int) (configs.m26415c() / ((long) 1000)), configs.m26410a(), configs.m26419f(), -1, new C11588O0(C11588O0.a.MANUAL, configs.m26417d().m33284j(), configs.m26417d().m33276b(), -1L), new C11498J0(-1L), configs.m26421h(), configs.m26422i(), configs.m26424k(), configs.m26423j(), false, 32768, null);
        Intrinsics.checkNotNullParameter(configs, "configs");
        this.f26047s = str;
        this.f26048t = list;
        this.f26049u = configs;
    }

    /* JADX INFO: renamed from: a */
    public final C11718Vb m27738a(String str, List<? extends NetworkSettings> list, C11545Lb configs) {
        Intrinsics.checkNotNullParameter(configs, "configs");
        return new C11718Vb(str, list, configs);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11718Vb)) {
            return false;
        }
        C11718Vb c11718Vb = (C11718Vb) obj;
        return Intrinsics.areEqual(this.f26047s, c11718Vb.f26047s) && Intrinsics.areEqual(this.f26048t, c11718Vb.f26048t) && Intrinsics.areEqual(this.f26049u, c11718Vb.f26049u);
    }

    public int hashCode() {
        String str = this.f26047s;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<NetworkSettings> list = this.f26048t;
        return ((iHashCode + (list != null ? list.hashCode() : 0)) * 31) + this.f26049u.hashCode();
    }

    @Override // com.ironsource.C11723W
    /* JADX INFO: renamed from: j */
    public List<NetworkSettings> mo27739j() {
        return this.f26048t;
    }

    @Override // com.ironsource.C11723W
    /* JADX INFO: renamed from: o */
    public String mo27740o() {
        return this.f26047s;
    }

    /* JADX INFO: renamed from: s */
    public final String m27741s() {
        return this.f26047s;
    }

    /* JADX INFO: renamed from: t */
    public final List<NetworkSettings> m27742t() {
        return this.f26048t;
    }

    public String toString() {
        return "NativeAdManagerData(userId=" + this.f26047s + ", providerList=" + this.f26048t + ", configs=" + this.f26049u + ")";
    }

    /* JADX INFO: renamed from: u */
    public final C11545Lb m27743u() {
        return this.f26049u;
    }

    /* JADX INFO: renamed from: v */
    public final C11545Lb m27744v() {
        return this.f26049u;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C11718Vb m27737a(C11718Vb c11718Vb, String str, List list, C11545Lb c11545Lb, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c11718Vb.f26047s;
        }
        if ((i & 2) != 0) {
            list = c11718Vb.f26048t;
        }
        if ((i & 4) != 0) {
            c11545Lb = c11718Vb.f26049u;
        }
        return c11718Vb.m27738a(str, list, c11545Lb);
    }
}
