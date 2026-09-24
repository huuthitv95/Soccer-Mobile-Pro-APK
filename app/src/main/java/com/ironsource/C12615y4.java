package com.ironsource;

import android.content.Context;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.y4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C12615y4 implements InterfaceC12564v7 {

    /* JADX INFO: renamed from: com.ironsource.y4$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f33205a;

        static {
            int[] iArr = new int[EnumC12543u4.values().length];
            try {
                iArr[EnumC12543u4.IADS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC12543u4.UADS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC12543u4.SHARED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC12543u4.NONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f33205a = iArr;
        }
    }

    @Override // com.ironsource.InterfaceC12564v7
    /* JADX INFO: renamed from: a */
    public InterfaceC11340A4 mo33933a(Context context, EnumC12543u4 source) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(source, "source");
        int i = a.f33205a[source.ordinal()];
        if (i == 1) {
            return new C12597x4(context, "supersonic_shared_preferen");
        }
        if (i == 2) {
            return new C12597x4(context, "unityads-installinfo");
        }
        if (i == 3) {
            return new C12597x4(context, C12633z4.f33242c);
        }
        if (i == 4) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
