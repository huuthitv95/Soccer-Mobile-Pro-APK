package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.m9 */
/* JADX INFO: loaded from: classes6.dex */
public enum EnumC12322m9 {
    NonBidder(1),
    Bidder(2),
    NotSupported(-1);


    /* JADX INFO: renamed from: b */
    public static final a f30962b = new a(null);

    /* JADX INFO: renamed from: a */
    private final int f30967a;

    /* JADX INFO: renamed from: com.ironsource.m9$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0017  */
        /* JADX WARN: Code duplicated, block: B:12:0x001a A[RETURN] */
        /* JADX INFO: renamed from: a */
        public final EnumC12322m9 m32220a(int i) {
            for (EnumC12322m9 enumC12322m9 : EnumC12322m9.values()) {
                if (enumC12322m9.f30967a == i) {
                    if (enumC12322m9 == null) {
                        return EnumC12322m9.NotSupported;
                    }
                    return enumC12322m9;
                }
            }
            enumC12322m9 = null;
            if (enumC12322m9 == null) {
                return EnumC12322m9.NotSupported;
            }
            return enumC12322m9;
        }

        private a() {
        }
    }

    EnumC12322m9(int i) {
        this.f30967a = i;
    }

    /* JADX INFO: renamed from: b */
    public final int m32218b() {
        return this.f30967a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m32219b(EnumC12322m9 instanceType) {
        Intrinsics.checkNotNullParameter(instanceType, "instanceType");
        return instanceType.m32218b() == this.f30967a;
    }
}
