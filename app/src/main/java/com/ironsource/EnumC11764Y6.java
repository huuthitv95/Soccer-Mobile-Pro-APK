package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.ironsource.Y6 */
/* JADX INFO: loaded from: classes6.dex */
public enum EnumC11764Y6 {
    SendEvent(0),
    NativeController(1);


    /* JADX INFO: renamed from: b */
    public static final a f26585b = new a(null);

    /* JADX INFO: renamed from: a */
    private final int f26589a;

    /* JADX INFO: renamed from: com.ironsource.Y6$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0017  */
        /* JADX WARN: Code duplicated, block: B:12:0x001a A[RETURN] */
        /* JADX INFO: renamed from: a */
        public final EnumC11764Y6 m28014a(int i) {
            for (EnumC11764Y6 enumC11764Y6 : EnumC11764Y6.values()) {
                if (enumC11764Y6.m28013b() == i) {
                    if (enumC11764Y6 == null) {
                        return EnumC11764Y6.SendEvent;
                    }
                    return enumC11764Y6;
                }
            }
            enumC11764Y6 = null;
            if (enumC11764Y6 == null) {
                return EnumC11764Y6.SendEvent;
            }
            return enumC11764Y6;
        }

        private a() {
        }
    }

    EnumC11764Y6(int i) {
        this.f26589a = i;
    }

    /* JADX INFO: renamed from: b */
    public final int m28013b() {
        return this.f26589a;
    }
}
