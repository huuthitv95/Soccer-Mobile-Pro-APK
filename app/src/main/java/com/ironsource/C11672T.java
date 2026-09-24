package com.ironsource;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.T */
/* JADX INFO: loaded from: classes6.dex */
public final class C11672T implements InterfaceC11622Q, InterfaceC11622Q.a {

    /* JADX INFO: renamed from: a */
    private final ReadWriteLock f25705a;

    /* JADX INFO: renamed from: b */
    private final Map<String, C11605P> f25706b;

    /* JADX WARN: Multi-variable type inference failed */
    public C11672T() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.ironsource.InterfaceC11622Q
    /* JADX INFO: renamed from: a */
    public C11605P mo27262a(String adId) {
        Intrinsics.checkNotNullParameter(adId, "adId");
        this.f25705a.readLock().lock();
        try {
            return this.f25706b.get(adId);
        } finally {
            this.f25705a.readLock().unlock();
        }
    }

    public C11672T(ReadWriteLock readWriteLock) {
        Intrinsics.checkNotNullParameter(readWriteLock, "readWriteLock");
        this.f25705a = readWriteLock;
        this.f25706b = new LinkedHashMap();
    }

    @Override // com.ironsource.InterfaceC11622Q
    /* JADX INFO: renamed from: a */
    public List<C11605P> mo27263a() {
        this.f25705a.readLock().lock();
        List<C11605P> list = CollectionsKt.toList(this.f25706b.values());
        this.f25705a.readLock().unlock();
        return list;
    }

    public /* synthetic */ C11672T(ReadWriteLock readWriteLock, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ReentrantReadWriteLock() : readWriteLock);
    }

    @Override // com.ironsource.InterfaceC11622Q.a
    /* JADX INFO: renamed from: a */
    public void mo27264a(C11605P adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f25705a.writeLock().lock();
        try {
            if (this.f25706b.get(adInfo.m26788c()) == null) {
                this.f25706b.put(adInfo.m26788c(), adInfo);
            }
        } finally {
            this.f25705a.writeLock().unlock();
        }
    }

    @Override // com.ironsource.InterfaceC11622Q.a
    /* JADX INFO: renamed from: a */
    public void mo27266a(JSONObject json, EnumC12396o0 adStatus, String adId) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(adStatus, "adStatus");
        Intrinsics.checkNotNullParameter(adId, "adId");
        this.f25705a.writeLock().lock();
        try {
            C11605P c11605p = this.f25706b.get(adId);
            if (c11605p == null) {
                return;
            }
            String bundleId = json.optString("bundleId");
            Intrinsics.checkNotNullExpressionValue(bundleId, "bundleId");
            if (bundleId.length() > 0) {
                c11605p.m26786a(bundleId);
            }
            String dynamicDemandSourceId = json.optString("dynamicDemandSource");
            Intrinsics.checkNotNullExpressionValue(dynamicDemandSourceId, "dynamicDemandSourceId");
            if (dynamicDemandSourceId.length() > 0) {
                c11605p.m26784a(EnumC11630Q7.f25555b.m27295a(dynamicDemandSourceId));
            }
            c11605p.m26785a(adStatus);
        } finally {
            this.f25705a.writeLock().unlock();
        }
    }

    @Override // com.ironsource.InterfaceC11622Q.a
    /* JADX INFO: renamed from: a */
    public void mo27265a(EnumC12396o0 adStatus, String adId) {
        Intrinsics.checkNotNullParameter(adStatus, "adStatus");
        Intrinsics.checkNotNullParameter(adId, "adId");
        this.f25705a.writeLock().lock();
        try {
            C11605P c11605p = this.f25706b.get(adId);
            if (c11605p == null) {
                return;
            }
            c11605p.m26785a(adStatus);
            c11605p.m26783a(System.currentTimeMillis() / 1000.0d);
        } finally {
            this.f25705a.writeLock().unlock();
        }
    }
}
