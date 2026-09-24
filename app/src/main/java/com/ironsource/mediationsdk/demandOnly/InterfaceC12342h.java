package com.ironsource.mediationsdk.demandOnly;

import android.app.Activity;
import com.ironsource.InterfaceC12255j;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.mediationsdk.demandOnly.h */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC12342h extends InterfaceC12351q {

    /* JADX INFO: renamed from: com.ironsource.mediationsdk.demandOnly.h$a */
    public static abstract class a implements InterfaceC12342h {

        /* JADX INFO: renamed from: a */
        private final String f31156a;

        /* JADX INFO: renamed from: b */
        private final String f31157b;

        /* JADX INFO: renamed from: c */
        private final boolean f31158c;

        public a(String str, String str2, boolean z) {
            this.f31156a = str;
            this.f31157b = str2;
            this.f31158c = z;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.InterfaceC12351q
        /* JADX INFO: renamed from: a */
        public abstract IronSourceError mo32398a();

        @Override // com.ironsource.mediationsdk.demandOnly.InterfaceC12342h
        /* JADX INFO: renamed from: b */
        public String mo32395b() {
            return this.f31157b;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.InterfaceC12342h
        /* JADX INFO: renamed from: c */
        public boolean mo32396c() {
            return this.f31158c;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.InterfaceC12342h
        /* JADX INFO: renamed from: e */
        public String mo32397e() {
            return this.f31156a;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.mediationsdk.demandOnly.h$b */
    public static final class b extends a {

        /* JADX INFO: renamed from: d */
        private final String f31159d;

        /* JADX INFO: renamed from: e */
        private final Activity f31160e;

        /* JADX INFO: renamed from: f */
        private final ISDemandOnlyBannerLayout f31161f;

        public /* synthetic */ b(String str, Activity activity, String str2, ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, activity, str2, iSDemandOnlyBannerLayout, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? false : z);
        }

        @Override // com.ironsource.mediationsdk.demandOnly.InterfaceC12342h.a, com.ironsource.mediationsdk.demandOnly.InterfaceC12351q
        /* JADX INFO: renamed from: a */
        public IronSourceError mo32398a() {
            IronSourceError ironSourceErrorM32454a = new InterfaceC12351q.a(this.f31159d).m32454a(this);
            if (ironSourceErrorM32454a != null) {
                return ironSourceErrorM32454a;
            }
            return null;
        }

        /* JADX INFO: renamed from: f */
        public final Activity m32399f() {
            return this.f31160e;
        }

        /* JADX INFO: renamed from: g */
        public final ISDemandOnlyBannerLayout m32400g() {
            return this.f31161f;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String adFormat, Activity activity, String str, ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str2, boolean z) {
            super(str, str2, z);
            Intrinsics.checkNotNullParameter(adFormat, "adFormat");
            this.f31159d = adFormat;
            this.f31160e = activity;
            this.f31161f = iSDemandOnlyBannerLayout;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.mediationsdk.demandOnly.h$c */
    public static final class c {

        /* JADX INFO: renamed from: a */
        private String f31162a = "";

        /* JADX INFO: renamed from: b */
        private Activity f31163b;

        /* JADX INFO: renamed from: c */
        private String f31164c;

        /* JADX INFO: renamed from: d */
        private boolean f31165d;

        /* JADX INFO: renamed from: e */
        private String f31166e;

        /* JADX INFO: renamed from: f */
        private ISDemandOnlyBannerLayout f31167f;

        /* JADX INFO: renamed from: a */
        public final c m32404a(IronSource.EnumC12328a adFormat) {
            Intrinsics.checkNotNullParameter(adFormat, "adFormat");
            String string = adFormat.toString();
            Intrinsics.checkNotNullExpressionValue(string, "adFormat.toString()");
            this.f31162a = string;
            return this;
        }

        /* JADX INFO: renamed from: b */
        public final c m32408b(String str) {
            this.f31164c = str;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public final c m32402a(Activity activity) {
            this.f31163b = activity;
            return this;
        }

        /* JADX INFO: renamed from: b */
        public final d m32409b() {
            return new d(this.f31162a, this.f31163b, this.f31164c, this.f31166e, this.f31165d);
        }

        /* JADX INFO: renamed from: a */
        public final c m32403a(Activity activity, Activity activity2) {
            if (activity == null) {
                activity = activity2;
            }
            this.f31163b = activity;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public final c m32407a(boolean z) {
            this.f31165d = z;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public final c m32406a(String str) {
            this.f31166e = str;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public final c m32405a(ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout) {
            this.f31167f = iSDemandOnlyBannerLayout;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public final b m32401a() {
            return new b(this.f31162a, this.f31163b, this.f31164c, this.f31167f, this.f31166e, this.f31165d);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.mediationsdk.demandOnly.h$d */
    public static final class d extends a implements InterfaceC12255j {

        /* JADX INFO: renamed from: d */
        private final String f31168d;

        /* JADX INFO: renamed from: e */
        private final Activity f31169e;

        public /* synthetic */ d(String str, Activity activity, String str2, String str3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, activity, str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? false : z);
        }

        @Override // com.ironsource.mediationsdk.demandOnly.InterfaceC12342h.a, com.ironsource.mediationsdk.demandOnly.InterfaceC12351q
        /* JADX INFO: renamed from: a */
        public IronSourceError mo32398a() {
            IronSourceError ironSourceErrorM32455a = new InterfaceC12351q.b(this.f31168d).m32455a(this);
            if (ironSourceErrorM32455a != null) {
                return ironSourceErrorM32455a;
            }
            return null;
        }

        @Override // com.ironsource.InterfaceC12255j
        /* JADX INFO: renamed from: d */
        public Activity mo31773d() {
            return this.f31169e;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String adFormat, Activity activity, String str, String str2, boolean z) {
            super(str, str2, z);
            Intrinsics.checkNotNullParameter(adFormat, "adFormat");
            this.f31168d = adFormat;
            this.f31169e = activity;
        }
    }

    /* JADX INFO: renamed from: b */
    String mo32395b();

    /* JADX INFO: renamed from: c */
    boolean mo32396c();

    /* JADX INFO: renamed from: e */
    String mo32397e();
}
