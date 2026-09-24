package com.ironsource;

import android.app.Activity;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.t6 */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC12527t6 {

    /* JADX INFO: renamed from: com.ironsource.t6$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private final c f32438a;

        public a(c strategyType) {
            Intrinsics.checkNotNullParameter(strategyType, "strategyType");
            this.f32438a = strategyType;
        }

        /* JADX INFO: renamed from: a */
        public final c m33770a() {
            return this.f32438a;
        }

        /* JADX INFO: renamed from: b */
        public final c m33771b() {
            return this.f32438a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f32438a == ((a) obj).f32438a;
        }

        public int hashCode() {
            return this.f32438a.hashCode();
        }

        public String toString() {
            return "Config(strategyType=" + this.f32438a + ")";
        }

        /* JADX INFO: renamed from: a */
        public final a m33769a(c strategyType) {
            Intrinsics.checkNotNullParameter(strategyType, "strategyType");
            return new a(strategyType);
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ a m33768a(a aVar, c cVar, int i, Object obj) {
            if ((i & 1) != 0) {
                cVar = aVar.f32438a;
            }
            return aVar.m33769a(cVar);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.t6$b */
    public static final class b {

        /* JADX INFO: renamed from: com.ironsource.t6$b$a */
        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f32439a;

            static {
                int[] iArr = new int[c.values().length];
                try {
                    iArr[c.SINGLE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[c.PROGRESSIVE_ON_SHOW_SUCCESS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[c.PROGRESSIVE_ON_LOAD_SUCCESS.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f32439a = iArr;
            }
        }

        /* JADX INFO: renamed from: a */
        public final InterfaceC12527t6 m33772a(C12414p0 adTools, a config, InterfaceC12420p6 fullscreenAdUnitFactory, InterfaceC12456r6 fullscreenAdUnitListener, InterfaceC12474s6 listener) {
            Intrinsics.checkNotNullParameter(adTools, "adTools");
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(fullscreenAdUnitFactory, "fullscreenAdUnitFactory");
            Intrinsics.checkNotNullParameter(fullscreenAdUnitListener, "fullscreenAdUnitListener");
            Intrinsics.checkNotNullParameter(listener, "listener");
            int i = a.f32439a[config.m33771b().ordinal()];
            if (i == 1) {
                return new C11468H6(adTools, config, fullscreenAdUnitFactory, fullscreenAdUnitListener, listener);
            }
            if (i == 2) {
                return new C11342A6(adTools, fullscreenAdUnitFactory, fullscreenAdUnitListener, listener);
            }
            if (i == 3) {
                return new C12545u6(adTools, fullscreenAdUnitFactory, fullscreenAdUnitListener, listener);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.t6$c */
    public enum c {
        SINGLE("Single"),
        PROGRESSIVE_ON_SHOW_SUCCESS("OnShowSuccess"),
        PROGRESSIVE_ON_LOAD_SUCCESS("OnLoadSuccess");


        /* JADX INFO: renamed from: a */
        private final String f32444a;

        c(String str) {
            this.f32444a = str;
        }

        /* JADX INFO: renamed from: b */
        public final String m33774b() {
            return this.f32444a;
        }
    }

    /* JADX INFO: renamed from: a */
    void mo25268a(Activity activity);

    void loadAd();
}
