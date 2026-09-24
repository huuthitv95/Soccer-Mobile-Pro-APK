package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.AdSize;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.ironsource.b3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C12107b3 implements InterfaceC12218gg {

    /* JADX INFO: renamed from: a */
    private final C12622yb f30080a;

    /* JADX INFO: renamed from: b */
    private final AdSize f30081b;

    /* JADX INFO: renamed from: com.ironsource.b3$a */
    static final class a extends Lambda implements Function0<IronSourceError> {

        /* JADX INFO: renamed from: a */
        public static final a f30082a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C12526t5.f32437a.m33743a("Load task config is null");
        }
    }

    /* JADX INFO: renamed from: com.ironsource.b3$b */
    static final class b extends Lambda implements Function0<IronSourceError> {

        /* JADX INFO: renamed from: a */
        public static final b f30083a = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C12526t5.f32437a.m33759l();
        }
    }

    public C12107b3(C12622yb c12622yb, AdSize adSize) {
        this.f30080a = c12622yb;
        this.f30081b = adSize;
    }

    @Override // com.ironsource.InterfaceC12218gg
    /* JADX INFO: renamed from: a */
    public void mo26555a() {
        mo26556a(this.f30080a != null, a.f30082a);
        mo26556a(this.f30081b != null, b.f30083a);
    }

    @Override // com.ironsource.InterfaceC12218gg
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void mo26556a(boolean z, Function0 function0) {
        InterfaceC12218gg.CC.$default$a(this, z, function0);
    }
}
