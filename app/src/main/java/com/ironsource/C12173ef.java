package com.ironsource;

import android.content.Context;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.ef */
/* JADX INFO: loaded from: classes6.dex */
public final class C12173ef implements InterfaceC11357B3 {

    /* JADX INFO: renamed from: d */
    public static final a f30317d = new a(null);

    /* JADX INFO: renamed from: e */
    public static final int f30318e = -1;

    /* JADX INFO: renamed from: f */
    public static final long f30319f = -1;

    /* JADX INFO: renamed from: a */
    private final Context f30320a;

    /* JADX INFO: renamed from: b */
    private final String f30321b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC11488I8 f30322c;

    /* JADX INFO: renamed from: com.ironsource.ef$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C12173ef(Context context, String baseName, InterfaceC11488I8 sdkSharedPref) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(baseName, "baseName");
        Intrinsics.checkNotNullParameter(sdkSharedPref, "sdkSharedPref");
        this.f30320a = context;
        this.f30321b = baseName;
        this.f30322c = sdkSharedPref;
    }

    @Override // com.ironsource.InterfaceC11357B3
    /* JADX INFO: renamed from: a */
    public void mo25395a(String identifier, int i) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        this.f30322c.mo26077a(this.f30320a, new C12199ff(identifier, this.f30321b + ".show_count_show_counter").m31512a(), i);
    }

    @Override // com.ironsource.InterfaceC11357B3
    /* JADX INFO: renamed from: b */
    public Long mo25397b(String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        return m31378a(Long.valueOf(this.f30322c.mo26080b(this.f30320a, new C12199ff(identifier, this.f30321b + ".pacing_last_show_time").m31512a(), -1L)));
    }

    @Override // com.ironsource.InterfaceC11357B3
    /* JADX INFO: renamed from: c */
    public Integer mo25399c(String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        return m31377a(Integer.valueOf(this.f30322c.mo26079b(this.f30320a, new C12199ff(identifier, this.f30321b + ".show_count_show_counter").m31512a(), -1)));
    }

    @Override // com.ironsource.InterfaceC11357B3
    /* JADX INFO: renamed from: a */
    public void mo25396a(String identifier, long j) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        this.f30322c.mo26078a(this.f30320a, new C12199ff(identifier, this.f30321b + ".pacing_last_show_time").m31512a(), j);
    }

    @Override // com.ironsource.InterfaceC11357B3
    /* JADX INFO: renamed from: b */
    public void mo25398b(String identifier, long j) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        this.f30322c.mo26078a(this.f30320a, new C12199ff(identifier, this.f30321b + ".show_count_threshold").m31512a(), j);
    }

    public /* synthetic */ C12173ef(Context context, String str, InterfaceC11488I8 interfaceC11488I8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, (i & 4) != 0 ? new C12643ze() : interfaceC11488I8);
    }

    @Override // com.ironsource.InterfaceC11357B3
    /* JADX INFO: renamed from: a */
    public Long mo25394a(String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        return m31378a(Long.valueOf(this.f30322c.mo26080b(this.f30320a, new C12199ff(identifier, this.f30321b + ".show_count_threshold").m31512a(), -1L)));
    }

    /* JADX INFO: renamed from: a */
    private final Long m31378a(Long l) {
        if (l != null && l.longValue() == -1) {
            return null;
        }
        return l;
    }

    /* JADX INFO: renamed from: a */
    private final Integer m31377a(Integer num) {
        if (num != null && num.intValue() == -1) {
            return null;
        }
        return num;
    }
}
