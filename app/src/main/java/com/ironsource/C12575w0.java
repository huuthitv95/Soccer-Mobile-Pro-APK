package com.ironsource;

import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.w0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C12575w0 {

    /* JADX INFO: renamed from: a */
    private final String f32634a;

    /* JADX INFO: renamed from: b */
    private final List<NetworkSettings> f32635b;

    /* JADX INFO: renamed from: c */
    private final C12266ja f32636c;

    /* JADX WARN: Multi-variable type inference failed */
    public C12575w0(String str, List<? extends NetworkSettings> providerList, C12266ja publisherDataHolder) {
        Intrinsics.checkNotNullParameter(providerList, "providerList");
        Intrinsics.checkNotNullParameter(publisherDataHolder, "publisherDataHolder");
        this.f32634a = str;
        this.f32635b = providerList;
        this.f32636c = publisherDataHolder;
    }

    /* JADX INFO: renamed from: a */
    public final String m33990a() {
        return this.f32634a;
    }

    /* JADX INFO: renamed from: b */
    public final List<NetworkSettings> m33991b() {
        return this.f32635b;
    }

    /* JADX INFO: renamed from: c */
    public final C12266ja m33992c() {
        return this.f32636c;
    }

    /* JADX INFO: renamed from: d */
    public final List<NetworkSettings> m33993d() {
        return this.f32635b;
    }

    /* JADX INFO: renamed from: e */
    public final C12266ja m33994e() {
        return this.f32636c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12575w0)) {
            return false;
        }
        C12575w0 c12575w0 = (C12575w0) obj;
        return Intrinsics.areEqual(this.f32634a, c12575w0.f32634a) && Intrinsics.areEqual(this.f32635b, c12575w0.f32635b) && Intrinsics.areEqual(this.f32636c, c12575w0.f32636c);
    }

    /* JADX INFO: renamed from: f */
    public final String m33995f() {
        return this.f32634a;
    }

    public int hashCode() {
        String str = this.f32634a;
        return ((((str == null ? 0 : str.hashCode()) * 31) + this.f32635b.hashCode()) * 31) + this.f32636c.hashCode();
    }

    public String toString() {
        return "AdUnitCommonData(userId=" + this.f32634a + ", providerList=" + this.f32635b + ", publisherDataHolder=" + this.f32636c + ")";
    }

    /* JADX INFO: renamed from: a */
    public final C12575w0 m33989a(String str, List<? extends NetworkSettings> providerList, C12266ja publisherDataHolder) {
        Intrinsics.checkNotNullParameter(providerList, "providerList");
        Intrinsics.checkNotNullParameter(publisherDataHolder, "publisherDataHolder");
        return new C12575w0(str, providerList, publisherDataHolder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C12575w0 m33988a(C12575w0 c12575w0, String str, List list, C12266ja c12266ja, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c12575w0.f32634a;
        }
        if ((i & 2) != 0) {
            list = c12575w0.f32635b;
        }
        if ((i & 4) != 0) {
            c12266ja = c12575w0.f32636c;
        }
        return c12575w0.m33989a(str, list, c12266ja);
    }
}
