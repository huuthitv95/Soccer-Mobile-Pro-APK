package com.ironsource.mediationsdk.demandOnly;

import com.ironsource.InterfaceC11437Fb;
import com.ironsource.InterfaceC12297l5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.mediationsdk.demandOnly.o */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC12349o extends InterfaceC12297l5<String> {

    /* JADX INFO: renamed from: com.ironsource.mediationsdk.demandOnly.o$a */
    public static final class a implements InterfaceC12349o {

        /* JADX INFO: renamed from: a */
        private final String f31211a;

        public a(String rowAdm) {
            Intrinsics.checkNotNullParameter(rowAdm, "rowAdm");
            this.f31211a = rowAdm;
        }

        @Override // com.ironsource.InterfaceC12297l5
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public String mo32055a() {
            return this.f31211a;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.InterfaceC12349o
        /* JADX INFO: renamed from: a */
        public <T> T mo32452a(InterfaceC11437Fb<String, T> mapper) {
            Intrinsics.checkNotNullParameter(mapper, "mapper");
            return mapper.mo25577a(this.f31211a);
        }
    }

    /* JADX INFO: renamed from: a */
    <T> T mo32452a(InterfaceC11437Fb<String, T> interfaceC11437Fb);
}
