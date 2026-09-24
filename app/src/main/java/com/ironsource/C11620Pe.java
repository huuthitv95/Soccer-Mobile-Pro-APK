package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.unity3d.mediation.C14640a;
import com.unity3d.mediation.LevelPlay;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.ironsource.Pe */
/* JADX INFO: loaded from: classes6.dex */
class C11620Pe implements InterfaceC11524K8, InterfaceC11524K8.a {

    /* JADX INFO: renamed from: c */
    private static final int f25540c = 1;

    /* JADX INFO: renamed from: a */
    private final Map<IronSource.EnumC12328a, Integer> f25541a = new HashMap();

    /* JADX INFO: renamed from: b */
    private final C11784Z9 f25542b = new C11784Z9();

    /* JADX INFO: renamed from: com.ironsource.Pe$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f25543a;

        static {
            int[] iArr = new int[IronSource.EnumC12328a.values().length];
            f25543a = iArr;
            try {
                iArr[IronSource.EnumC12328a.REWARDED_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f25543a[IronSource.EnumC12328a.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f25543a[IronSource.EnumC12328a.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f25543a[IronSource.EnumC12328a.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    C11620Pe() {
        for (IronSource.EnumC12328a enumC12328a : IronSource.EnumC12328a.values()) {
            m27260a(enumC12328a, 1);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m27260a(IronSource.EnumC12328a enumC12328a, int i) {
        this.f25541a.put(enumC12328a, Integer.valueOf(i));
        int i2 = a.f25543a[enumC12328a.ordinal()];
        if (i2 == 1) {
            this.f25542b.m28070d(i);
            return;
        }
        if (i2 == 2) {
            this.f25542b.m28068b(i);
        } else if (i2 == 3) {
            this.f25542b.m28067a(i);
        } else {
            if (i2 != 4) {
                return;
            }
            this.f25542b.m28069c(i);
        }
    }

    @Override // com.ironsource.InterfaceC11524K8.a
    /* JADX INFO: renamed from: b */
    public synchronized void mo26267b(IronSource.EnumC12328a enumC12328a) {
        if (enumC12328a == null) {
            return;
        }
        m27260a(enumC12328a, this.f25541a.get(enumC12328a).intValue() + 1);
    }

    @Override // com.ironsource.InterfaceC11524K8
    /* JADX INFO: renamed from: a */
    public synchronized int mo26265a(IronSource.EnumC12328a enumC12328a) {
        int iIntValue = -1;
        if (enumC12328a == null) {
            return -1;
        }
        Integer num = this.f25541a.get(enumC12328a);
        if (num != null) {
            iIntValue = num.intValue();
        }
        return iIntValue;
    }

    @Override // com.ironsource.InterfaceC11524K8
    /* JADX INFO: renamed from: a */
    public int mo26266a(LevelPlay.AdFormat adFormat) {
        if (adFormat == null) {
            return -1;
        }
        return mo26265a(C14640a.m43197a(adFormat)) - 1;
    }
}
