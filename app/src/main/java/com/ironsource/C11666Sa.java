package com.ironsource;

import com.ironsource.mediationsdk.adquality.C12330a;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayAdSize;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.Sa */
/* JADX INFO: loaded from: classes6.dex */
public final class C11666Sa extends C12100ae {

    /* JADX INFO: renamed from: com.ironsource.Sa$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f25666a;

        static {
            int[] iArr = new int[LevelPlay.AdFormat.values().length];
            try {
                iArr[LevelPlay.AdFormat.REWARDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LevelPlay.AdFormat.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LevelPlay.AdFormat.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LevelPlay.AdFormat.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f25666a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11666Sa(C12100ae sdkConfig) {
        super(sdkConfig);
        Intrinsics.checkNotNullParameter(sdkConfig, "sdkConfig");
    }

    /* JADX INFO: renamed from: a */
    public final boolean m27464a(String adUnitId, LevelPlay.AdFormat adFormat) {
        Map<String, C12481sd.b> mapM33320a;
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        C12481sd.a aVar = m31110h().m31898d().m33319a().get(adFormat);
        return (aVar == null || (mapM33320a = aVar.m33320a()) == null || !mapM33320a.containsKey(adUnitId)) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC12527t6.a m27467b(LevelPlay.AdFormat adFormat, String adUnitId) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        return new InterfaceC12527t6.a(m27460a(adFormat, adUnitId));
    }

    /* JADX INFO: renamed from: c */
    public final List<C12533tc> m27470c(LevelPlay.AdFormat adFormat) {
        Map<String, C12481sd.b> mapM33320a;
        Set<String> setKeySet;
        List<C12533tc> listDistinct;
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        C12481sd.a aVar = m31110h().m31898d().m33319a().get(adFormat);
        if (aVar != null && (mapM33320a = aVar.m33320a()) != null && (setKeySet = mapM33320a.keySet()) != null) {
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(setKeySet, 10));
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                arrayList.add(m27471d(adFormat, (String) it.next()));
            }
            List listFlatten = CollectionsKt.flatten(arrayList);
            if (listFlatten != null && (listDistinct = CollectionsKt.distinct(listFlatten)) != null) {
                return listDistinct;
            }
        }
        return CollectionsKt.emptyList();
    }

    /* JADX INFO: renamed from: d */
    public final List<C12533tc> m27471d(LevelPlay.AdFormat adFormat, String adUnitId) {
        Map<String, C12481sd.b> mapM33320a;
        C12481sd.b bVar;
        List<String> listM33321a;
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        C12481sd.a aVar = m31110h().m31898d().m33319a().get(adFormat);
        if (aVar == null || (mapM33320a = aVar.m33320a()) == null || (bVar = mapM33320a.get(adUnitId)) == null || (listM33321a = bVar.m33321a()) == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listM33321a.iterator();
        while (it.hasNext()) {
            C12533tc c12533tc = m31110h().m31899e().m34061a().get((String) it.next());
            if (c12533tc != null) {
                arrayList.add(c12533tc);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: j */
    public final String m27472j() {
        return m31110h().m31895a().m26719b().m25377c().m26050a();
    }

    /* JADX INFO: renamed from: k */
    public final List<LevelPlayAdSize> m27473k() {
        List<String> listM27495a = m31110h().m31895a().m26720c().m27493b().m27495a();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM27495a, 10));
        Iterator<T> it = listM27495a.iterator();
        while (it.hasNext()) {
            arrayList.add(LevelPlayAdSize.Companion.createAdSize$mediationsdk_release((String) it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: l */
    public final float m27474l() {
        return m31110h().m31895a().m26720c().m27493b().m27496b();
    }

    /* JADX INFO: renamed from: m */
    public final boolean m27475m() {
        C12330a c12330aM26601a = m31106d().m26133c().m26601a();
        return c12330aM26601a != null && c12330aM26601a.m32253b();
    }

    /* JADX INFO: renamed from: n */
    public final boolean m27476n() {
        return m31110h().m31895a().m26719b().m25379e();
    }

    /* JADX INFO: renamed from: b */
    public final C12197fd m27466b(C12461rb tools) {
        Intrinsics.checkNotNullParameter(tools, "tools");
        return new C12197fd(tools, m31110h().m31895a().m26718a());
    }

    /* JADX INFO: renamed from: b */
    public final long m27465b(LevelPlay.AdFormat adFormat) {
        C12538u.d dVarM33829b;
        Long lM33836d;
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        C12538u c12538u = m31110h().m31895a().m26718a().get(adFormat);
        long jLongValue = (c12538u == null || (dVarM33829b = c12538u.m33829b()) == null || (lM33836d = dVarM33829b.m33836d()) == null) ? 60L : lM33836d.longValue();
        return jLongValue > 0 ? TimeUnit.MINUTES.toMillis(jLongValue) : jLongValue;
    }

    /* JADX INFO: renamed from: a */
    public final C11649Ra.a m27461a(String adUnitId) {
        long jM27498d;
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        C11675T2 c11675t2M26720c = m31110h().m31895a().m26720c();
        C11675T2.b bVar = c11675t2M26720c.m27492a().get(adUnitId);
        int iM27497c = bVar != null ? bVar.m27497c() : c11675t2M26720c.m27493b().m27497c();
        boolean zM27499e = bVar != null ? bVar.m27499e() : c11675t2M26720c.m27493b().m27499e();
        if (bVar != null) {
            jM27498d = bVar.m27498d();
        } else {
            jM27498d = c11675t2M26720c.m27493b().m27498d();
        }
        return new C11649Ra.a(zM27499e, iM27497c, jM27498d);
    }

    /* JADX INFO: renamed from: a */
    public final List<String> m27463a(LevelPlay.AdFormat adFormat) {
        Map<String, C12481sd.b> mapM33320a;
        Set<String> setKeySet;
        List<String> list;
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        C12481sd.a aVar = m31110h().m31898d().m33319a().get(adFormat);
        return (aVar == null || (mapM33320a = aVar.m33320a()) == null || (setKeySet = mapM33320a.keySet()) == null || (list = CollectionsKt.toList(setKeySet)) == null) ? CollectionsKt.emptyList() : list;
    }

    /* JADX INFO: renamed from: a */
    public final C12557v0 m27462a(C12461rb tools) {
        Intrinsics.checkNotNullParameter(tools, "tools");
        return new C12557v0(tools, m31110h().m31895a().m26718a());
    }

    /* JADX INFO: renamed from: a */
    private final InterfaceC12527t6.c m27460a(LevelPlay.AdFormat adFormat, String str) {
        C12538u.d dVarM33829b;
        C12409od c12409odM33839g;
        Map<String, C12538u.d> mapM33828a;
        C12538u.d dVar;
        C12409od c12409odM33839g2;
        boolean z = adFormat == LevelPlay.AdFormat.REWARDED;
        C12538u c12538u = m31110h().m31895a().m26718a().get(adFormat);
        InterfaceC12527t6.c cVarM32970a = null;
        InterfaceC12527t6.c cVarM32970a2 = (c12538u == null || (mapM33828a = c12538u.m33828a()) == null || (dVar = mapM33828a.get(str)) == null || (c12409odM33839g2 = dVar.m33839g()) == null) ? null : c12409odM33839g2.m32970a();
        if (c12538u != null && (dVarM33829b = c12538u.m33829b()) != null && (c12409odM33839g = dVarM33829b.m33839g()) != null) {
            cVarM32970a = c12409odM33839g.m32970a();
        }
        if (cVarM32970a2 == null) {
            cVarM32970a2 = cVarM32970a;
        }
        if (cVarM32970a2 != null) {
            return cVarM32970a2;
        }
        if (z) {
            return InterfaceC12527t6.c.PROGRESSIVE_ON_SHOW_SUCCESS;
        }
        return InterfaceC12527t6.c.SINGLE;
    }

    /* JADX INFO: renamed from: c */
    public final C12135cd m27469c(LevelPlay.AdFormat adFormat, String str) {
        C12135cd c12135cdM27379a;
        C11435F9 c11435f9M25463a;
        String str2;
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        int i = a.f25666a[adFormat.ordinal()];
        if (i == 1) {
            C11652Rd c11652RdM26606f = m31106d().m26133c().m26606f();
            if (c11652RdM26606f == null || (c12135cdM27379a = c11652RdM26606f.m27379a(str)) == null) {
                return null;
            }
            Intrinsics.checkNotNullExpressionValue(c12135cdM27379a, "getRewardedVideoPlacement(placementName)");
            return new C12135cd(c12135cdM27379a.m32813b(), c12135cdM27379a.m32814c(), c12135cdM27379a.m32815d(), c12135cdM27379a.m31269f(), c12135cdM27379a.m31268e(), c12135cdM27379a.m32811a());
        }
        if (i == 2) {
            C11363B9 c11363b9M26604d = m31106d().m26133c().m26604d();
            if (c11363b9M26604d == null || (c11435f9M25463a = c11363b9M26604d.m25463a(str)) == null) {
                return null;
            }
            Intrinsics.checkNotNullExpressionValue(c11435f9M25463a, "getInterstitialPlacement(placementName)");
            return new C12135cd(c11435f9M25463a);
        }
        if (i == 3) {
            C11692U2 c11692u2M26603c = m31106d().m26133c().m26603c();
            if (c11692u2M26603c != null) {
                C12161e3 c12161e3M27556a = c11692u2M26603c.m27556a(str);
                if (c12161e3M27556a == null) {
                    c12161e3M27556a = c11692u2M26603c.m27565i();
                    str2 = "config.defaultBannerPlacement";
                } else {
                    str2 = "config.getBannerPlacemen…ig.defaultBannerPlacement";
                }
                Intrinsics.checkNotNullExpressionValue(c12161e3M27556a, str2);
                return new C12135cd(c12161e3M27556a);
            }
            throw new IllegalStateException("Error getting " + adFormat + " configurations");
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        C11545Lb c11545LbM26605e = m31106d().m26133c().m26605e();
        if (c11545LbM26605e != null && str != null) {
            C11735Wb c11735WbM26403a = c11545LbM26605e.m26403a(str);
            if (c11735WbM26403a == null) {
                c11735WbM26403a = c11545LbM26605e.m26418e();
            }
            if (c11735WbM26403a != null) {
                return new C12135cd(c11735WbM26403a);
            }
        }
        throw new IllegalStateException("Error getting " + adFormat + " configurations");
    }

    /* JADX INFO: renamed from: c */
    public final C11439Fd m27468c(C12461rb tools) {
        Intrinsics.checkNotNullParameter(tools, "tools");
        C12538u c12538u = m31110h().m31895a().m26718a().get(LevelPlay.AdFormat.REWARDED);
        return new C11439Fd(tools, c12538u != null ? c12538u.m33828a() : null, c12538u != null ? c12538u.m33830c() : null);
    }
}
