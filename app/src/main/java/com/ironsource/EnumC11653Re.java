package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.ironsource.Re */
/* JADX INFO: loaded from: classes6.dex */
public enum EnumC11653Re {
    Off(0),
    CurrentlyLoadedAds(1),
    CurrentlyLoadedAdsAndFullHistory(2);


    /* JADX INFO: renamed from: b */
    public static final a f25597b = new a(null);

    /* JADX INFO: renamed from: a */
    private final int f25602a;

    /* JADX INFO: renamed from: com.ironsource.Re$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0017  */
        /* JADX WARN: Code duplicated, block: B:12:0x001a A[RETURN] */
        /* JADX INFO: renamed from: a */
        public final EnumC11653Re m27398a(int i) {
            for (EnumC11653Re enumC11653Re : EnumC11653Re.values()) {
                if (enumC11653Re.f25602a == i) {
                    if (enumC11653Re == null) {
                        return EnumC11653Re.CurrentlyLoadedAds;
                    }
                    return enumC11653Re;
                }
            }
            enumC11653Re = null;
            if (enumC11653Re == null) {
                return EnumC11653Re.CurrentlyLoadedAds;
            }
            return enumC11653Re;
        }

        private a() {
        }
    }

    EnumC11653Re(int i) {
        this.f25602a = i;
    }

    /* JADX INFO: renamed from: b */
    public final int m27397b() {
        return this.f25602a;
    }
}
