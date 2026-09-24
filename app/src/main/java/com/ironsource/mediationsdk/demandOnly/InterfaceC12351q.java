package com.ironsource.mediationsdk.demandOnly;

import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.mediationsdk.demandOnly.q */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC12351q {

    /* JADX INFO: renamed from: com.ironsource.mediationsdk.demandOnly.q$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private final String f31213a;

        public a(String adFormat) {
            Intrinsics.checkNotNullParameter(adFormat, "adFormat");
            this.f31213a = adFormat;
        }

        /* JADX INFO: renamed from: a */
        public final IronSourceError m32454a(InterfaceC12342h loadParams) {
            Intrinsics.checkNotNullParameter(loadParams, "loadParams");
            InterfaceC12342h.b bVar = (InterfaceC12342h.b) loadParams;
            if (bVar.m32399f() == null) {
                return new IronSourceError(1060, this.f31213a + " was initialized and loaded without Activity");
            }
            if (bVar.m32400g() == null) {
                return new IronSourceError(510, "Missing banner layout");
            }
            if (bVar.m32400g().isDestroyed()) {
                return new IronSourceError(510, "Banner layout is destroyed");
            }
            ISBannerSize size = bVar.m32400g().getSize();
            if (size == null) {
                return new IronSourceError(510, "Missing banner size");
            }
            if ("CUSTOM" == size.getDescription() && (size.getHeight() <= 0 || size.getWidth() <= 0)) {
                return new IronSourceError(510, "Unsupported banner size. Height and width must be bigger than 0");
            }
            if (bVar.mo32397e() == null) {
                return new IronSourceError(510, "Missing instance Id");
            }
            String strMo32395b = bVar.mo32395b();
            if ((strMo32395b == null || strMo32395b.length() == 0) && loadParams.mo32396c()) {
                return new IronSourceError(510, "Missing adm");
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.mediationsdk.demandOnly.q$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        private final String f31214a;

        public b(String adFormat) {
            Intrinsics.checkNotNullParameter(adFormat, "adFormat");
            this.f31214a = adFormat;
        }

        /* JADX INFO: renamed from: a */
        public final IronSourceError m32455a(InterfaceC12342h.d loadParams) {
            Intrinsics.checkNotNullParameter(loadParams, "loadParams");
            if (loadParams.mo31773d() == null) {
                return new IronSourceError(1060, this.f31214a + " was initialized and loaded without Activity");
            }
            if (loadParams.mo32397e() == null) {
                return new IronSourceError(510, "Missing instance Id");
            }
            String strMo32395b = loadParams.mo32395b();
            if ((strMo32395b == null || strMo32395b.length() == 0) && loadParams.mo32396c()) {
                return new IronSourceError(510, "Missing adm");
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    IronSourceError mo32398a();
}
