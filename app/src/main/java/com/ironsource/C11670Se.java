package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.sdk.controller.FeaturesManager;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.Se */
/* JADX INFO: loaded from: classes6.dex */
public final class C11670Se implements InterfaceC11542L8, InterfaceC11542L8.a {

    /* JADX INFO: renamed from: a */
    private Map<String, C12610y> f25701a = new LinkedHashMap();

    /* JADX INFO: renamed from: b */
    private final C12268jc f25702b = new C12268jc();

    /* JADX INFO: renamed from: c */
    private final ReadWriteLock f25703c = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: com.ironsource.Se$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f25704a;

        static {
            int[] iArr = new int[EnumC11653Re.values().length];
            try {
                iArr[EnumC11653Re.CurrentlyLoadedAdsAndFullHistory.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC11653Re.CurrentlyLoadedAds.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC11653Re.Off.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f25704a = iArr;
        }
    }

    /* JADX INFO: renamed from: b */
    private final void m27480b() {
        C11637Qe configuration = FeaturesManager.getInstance().getSessionHistoryConfig();
        C12268jc c12268jc = this.f25702b;
        Intrinsics.checkNotNullExpressionValue(configuration, "configuration");
        c12268jc.m31887a(mo26360a(configuration));
        this.f25702b.m31886a(mo26359a());
    }

    @Override // com.ironsource.InterfaceC11542L8.a
    /* JADX INFO: renamed from: a */
    public void mo26362a(AbstractC11687Te historyRecord) {
        Intrinsics.checkNotNullParameter(historyRecord, "historyRecord");
        this.f25703c.writeLock().lock();
        try {
            C11605P c11605pM27534a = historyRecord.m27534a();
            String strValueOf = String.valueOf(c11605pM27534a != null ? c11605pM27534a.m26787b() : null);
            Map<String, C12610y> map = this.f25701a;
            C12610y c12610y = map.get(strValueOf);
            if (c12610y == null) {
                c12610y = new C12610y();
                map.put(strValueOf, c12610y);
            }
            c12610y.mo26047a(historyRecord.m27535a(new C11789Ze()));
            this.f25703c.writeLock().unlock();
            m27480b();
        } catch (Throwable th) {
            this.f25703c.writeLock().unlock();
            throw th;
        }
    }

    @Override // com.ironsource.InterfaceC11542L8
    /* JADX INFO: renamed from: a */
    public JSONObject mo26361a(EnumC12137cf mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f25703c.readLock().lock();
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<String, C12610y> entry : this.f25701a.entrySet()) {
                String key = entry.getKey();
                JSONObject jSONObjectMo26046a = entry.getValue().mo26046a(mode);
                if (jSONObjectMo26046a.length() > 0) {
                    jSONObject.put(key, jSONObjectMo26046a);
                }
            }
            this.f25703c.readLock().unlock();
            return jSONObject;
        } catch (Throwable th) {
            this.f25703c.readLock().unlock();
            throw th;
        }
    }

    @Override // com.ironsource.InterfaceC11542L8
    /* JADX INFO: renamed from: a */
    public int mo26358a(IronSource.EnumC12328a adFormat) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        this.f25703c.readLock().lock();
        try {
            C12610y c12610y = this.f25701a.get(adFormat.toString());
            return c12610y != null ? c12610y.m34198a() : 0;
        } finally {
            this.f25703c.readLock().unlock();
        }
    }

    @Override // com.ironsource.InterfaceC11542L8
    /* JADX INFO: renamed from: a */
    public List<String> mo26359a() {
        this.f25703c.readLock().lock();
        try {
            Map<String, C12610y> map = this.f25701a;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, C12610y> entry : map.entrySet()) {
                if (entry.getValue().m34200b()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            return CollectionsKt.toList(linkedHashMap.keySet());
        } finally {
            this.f25703c.readLock().unlock();
        }
    }

    @Override // com.ironsource.InterfaceC11542L8
    /* JADX INFO: renamed from: a */
    public Map<String, JSONObject> mo26360a(C11637Qe configuration) {
        Map<String, JSONObject> mapMutableMapOf;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f25703c.readLock().lock();
        try {
            int i = a.f25704a[configuration.m27304a().ordinal()];
            if (i == 1) {
                mapMutableMapOf = MapsKt.mutableMapOf(TuplesKt.m43482to(C11540L6.f25033z1, mo26361a(EnumC12137cf.FullHistory)), TuplesKt.m43482to(C11540L6.f24898A1, mo26361a(EnumC12137cf.CurrentlyLoadedAds)));
            } else if (i == 2) {
                mapMutableMapOf = MapsKt.mutableMapOf(TuplesKt.m43482to(C11540L6.f24898A1, mo26361a(EnumC12137cf.CurrentlyLoadedAds)));
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                mapMutableMapOf = MapsKt.emptyMap();
            }
            this.f25703c.readLock().unlock();
            return mapMutableMapOf;
        } catch (Throwable th) {
            this.f25703c.readLock().unlock();
            throw th;
        }
    }
}
