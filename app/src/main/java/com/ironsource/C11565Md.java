package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.ironsource.Md */
/* JADX INFO: loaded from: classes6.dex */
public final class C11565Md implements InterfaceC12218gg {

    /* JADX INFO: renamed from: a */
    private final C12622yb f25166a;

    /* JADX INFO: renamed from: com.ironsource.Md$a */
    static final class a extends Lambda implements Function0<IronSourceError> {

        /* JADX INFO: renamed from: a */
        public static final a f25167a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C12526t5.f32437a.m33751d("Load task config is null");
        }
    }

    public C11565Md(C12622yb c12622yb) {
        this.f25166a = c12622yb;
    }

    @Override // com.ironsource.InterfaceC12218gg
    /* JADX INFO: renamed from: a */
    public void mo26555a() {
        mo26556a(this.f25166a != null, a.f25167a);
    }

    @Override // com.ironsource.InterfaceC12218gg
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void mo26556a(boolean z, Function0 function0) {
        InterfaceC12218gg.CC.$default$a(this, z, function0);
    }
}
