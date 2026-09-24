package com.ironsource;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.u4 */
/* JADX INFO: loaded from: classes6.dex */
public enum EnumC12543u4 {
    IADS("iads"),
    UADS("uads"),
    SHARED("shared"),
    NONE("none");


    /* JADX INFO: renamed from: b */
    public static final a f32537b = new a(null);

    /* JADX INFO: renamed from: a */
    private final String f32543a;

    /* JADX INFO: renamed from: com.ironsource.u4$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x001b  */
        /* JADX WARN: Code duplicated, block: B:12:0x001e A[RETURN] */
        @JvmStatic
        /* JADX INFO: renamed from: a */
        public final EnumC12543u4 m33883a(String str) {
            for (EnumC12543u4 enumC12543u4 : EnumC12543u4.values()) {
                if (Intrinsics.areEqual(enumC12543u4.m33882b(), str)) {
                    if (enumC12543u4 == null) {
                        return EnumC12543u4.NONE;
                    }
                    return enumC12543u4;
                }
            }
            enumC12543u4 = null;
            if (enumC12543u4 == null) {
                return EnumC12543u4.NONE;
            }
            return enumC12543u4;
        }

        private a() {
        }
    }

    EnumC12543u4(String str) {
        this.f32543a = str;
    }

    /* JADX INFO: renamed from: b */
    public final String m33882b() {
        return this.f32543a;
    }

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final EnumC12543u4 m33880a(String str) {
        return f32537b.m33883a(str);
    }
}
