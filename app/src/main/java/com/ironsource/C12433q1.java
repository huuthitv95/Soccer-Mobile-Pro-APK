package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.q1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C12433q1 implements InterfaceC12451r1 {

    /* JADX INFO: renamed from: a */
    private final IronSource.EnumC12328a f31740a;

    /* JADX INFO: renamed from: com.ironsource.q1$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f31741a;

        static {
            int[] iArr = new int[IronSource.EnumC12328a.values().length];
            try {
                iArr[IronSource.EnumC12328a.INTERSTITIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IronSource.EnumC12328a.REWARDED_VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IronSource.EnumC12328a.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f31741a = iArr;
        }
    }

    public C12433q1(IronSource.EnumC12328a adFormat) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        this.f31740a = adFormat;
    }

    @Override // com.ironsource.InterfaceC12451r1
    /* JADX INFO: renamed from: a */
    public InterfaceC12469s1 mo33137a(InterfaceC12379n1 eventBaseData) {
        Intrinsics.checkNotNullParameter(eventBaseData, "eventBaseData");
        int i = a.f31741a[this.f31740a.ordinal()];
        if (i == 1) {
            return new C11345A9(eventBaseData);
        }
        if (i == 2) {
            return new C11636Qd(eventBaseData);
        }
        if (i == 3) {
            return new C11641R2(eventBaseData);
        }
        throw new IllegalArgumentException("Unsupported ad format: " + this.f31740a);
    }
}
