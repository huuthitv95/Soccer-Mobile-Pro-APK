package com.ironsource;

import android.content.Context;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.xe */
/* JADX INFO: loaded from: classes6.dex */
public final class C12607xe implements InterfaceC12589we {

    /* JADX INFO: renamed from: a */
    private final InterfaceC11488I8 f33181a;

    /* JADX INFO: renamed from: com.ironsource.xe$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final a f33182a = new a();

        /* JADX INFO: renamed from: b */
        public static final String f33183b = "sessionNumber";

        /* JADX INFO: renamed from: c */
        public static final String f33184c = "firstSessionTimestamp";

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C12607xe() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.ironsource.InterfaceC12625ye
    /* JADX INFO: renamed from: a */
    public void mo34177a(Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f33181a.mo26077a(context, a.f33183b, i);
    }

    @Override // com.ironsource.InterfaceC12625ye
    /* JADX INFO: renamed from: b */
    public int mo34178b(Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.f33181a.mo26079b(context, a.f33183b, i);
    }

    public C12607xe(InterfaceC11488I8 sdkSharedPref) {
        Intrinsics.checkNotNullParameter(sdkSharedPref, "sdkSharedPref");
        this.f33181a = sdkSharedPref;
    }

    @Override // com.ironsource.InterfaceC12154de
    /* JADX INFO: renamed from: a */
    public long mo31327a(Context context, long j) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.f33181a.mo26080b(context, "firstSessionTimestamp", j);
    }

    @Override // com.ironsource.InterfaceC12154de
    /* JADX INFO: renamed from: b */
    public void mo31328b(Context context, long j) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f33181a.mo26078a(context, "firstSessionTimestamp", j);
    }

    public /* synthetic */ C12607xe(InterfaceC11488I8 interfaceC11488I8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C12643ze() : interfaceC11488I8);
    }
}
