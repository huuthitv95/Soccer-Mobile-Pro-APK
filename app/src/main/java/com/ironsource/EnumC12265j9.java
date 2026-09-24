package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.ironsource.j9 */
/* JADX INFO: loaded from: classes6.dex */
public enum EnumC12265j9 {
    APP_ACTIVITY(0),
    DIRECT_INTENT(1);


    /* JADX INFO: renamed from: b */
    public static final a f30689b = new a(null);

    /* JADX INFO: renamed from: a */
    private final int f30693a;

    /* JADX INFO: renamed from: com.ironsource.j9$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0017  */
        /* JADX WARN: Code duplicated, block: B:12:0x001a A[RETURN] */
        /* JADX INFO: renamed from: a */
        public final EnumC12265j9 m31871a(int i) {
            for (EnumC12265j9 enumC12265j9 : EnumC12265j9.values()) {
                if (enumC12265j9.m31870b() == i) {
                    if (enumC12265j9 == null) {
                        return EnumC12265j9.APP_ACTIVITY;
                    }
                    return enumC12265j9;
                }
            }
            enumC12265j9 = null;
            if (enumC12265j9 == null) {
                return EnumC12265j9.APP_ACTIVITY;
            }
            return enumC12265j9;
        }

        private a() {
        }
    }

    EnumC12265j9(int i) {
        this.f30693a = i;
    }

    /* JADX INFO: renamed from: b */
    public final int m31870b() {
        return this.f30693a;
    }
}
