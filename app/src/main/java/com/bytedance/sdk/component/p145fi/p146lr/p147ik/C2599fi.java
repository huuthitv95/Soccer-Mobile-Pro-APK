package com.bytedance.sdk.component.p145fi.p146lr.p147ik;

import android.content.Context;
import com.bytedance.sdk.component.p145fi.InterfaceC2589ac;
import com.bytedance.sdk.component.p145fi.InterfaceC2590aw;
import com.bytedance.sdk.component.p145fi.InterfaceC2591bu;
import com.bytedance.sdk.component.p145fi.InterfaceC2592co;
import com.bytedance.sdk.component.p145fi.InterfaceC2595ik;
import com.bytedance.sdk.component.p145fi.InterfaceC2596ka;
import com.bytedance.sdk.component.p145fi.InterfaceC2597lr;
import com.bytedance.sdk.component.p145fi.InterfaceC2623nr;
import com.bytedance.sdk.component.p145fi.ihz;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: com.bytedance.sdk.component.fi.lr.ik.fi */
/* JADX INFO: loaded from: classes3.dex */
public class C2599fi implements InterfaceC2590aw {

    /* JADX INFO: renamed from: di */
    private InterfaceC2595ik f7255di;

    /* JADX INFO: renamed from: fi */
    private InterfaceC2623nr f7256fi;

    /* JADX INFO: renamed from: ik */
    private InterfaceC2596ka f7257ik;
    private ihz jbs;

    /* JADX INFO: renamed from: ka */
    private InterfaceC2591bu f7258ka;

    /* JADX INFO: renamed from: lr */
    private ExecutorService f7259lr;

    /* JADX INFO: renamed from: mj */
    private InterfaceC2589ac f7260mj;

    /* JADX INFO: renamed from: qt */
    private boolean f7261qt;

    /* JADX INFO: renamed from: ri */
    private InterfaceC2592co f7262ri;
    private InterfaceC2597lr xha;

    /* JADX INFO: renamed from: com.bytedance.sdk.component.fi.lr.ik.fi$ri */
    public static class ri {

        /* JADX INFO: renamed from: di */
        private InterfaceC2595ik f7263di;

        /* JADX INFO: renamed from: fi */
        private InterfaceC2623nr f7264fi;

        /* JADX INFO: renamed from: ik */
        private InterfaceC2596ka f7265ik;
        private ihz jbs;

        /* JADX INFO: renamed from: ka */
        private InterfaceC2591bu f7266ka;

        /* JADX INFO: renamed from: lr */
        private ExecutorService f7267lr;

        /* JADX INFO: renamed from: mj */
        private InterfaceC2589ac f7268mj;

        /* JADX INFO: renamed from: qt */
        private boolean f7269qt;

        /* JADX INFO: renamed from: ri */
        private InterfaceC2592co f7270ri;
        private InterfaceC2597lr xha;

        /* JADX INFO: renamed from: ri */
        public ri m9604ri(InterfaceC2589ac interfaceC2589ac) {
            this.f7268mj = interfaceC2589ac;
            return this;
        }

        /* JADX INFO: renamed from: ri */
        public ri m9605ri(ihz ihzVar) {
            this.jbs = ihzVar;
            return this;
        }

        /* JADX INFO: renamed from: ri */
        public ri m9606ri(InterfaceC2596ka interfaceC2596ka) {
            this.f7265ik = interfaceC2596ka;
            return this;
        }

        /* JADX INFO: renamed from: ri */
        public ri m9607ri(InterfaceC2597lr interfaceC2597lr) {
            this.xha = interfaceC2597lr;
            return this;
        }

        /* JADX INFO: renamed from: ri */
        public ri m9608ri(boolean z) {
            this.f7269qt = z;
            return this;
        }

        /* JADX INFO: renamed from: ri */
        public C2599fi m9609ri() {
            return new C2599fi(this);
        }
    }

    private C2599fi(ri riVar) {
        this.f7262ri = riVar.f7270ri;
        this.f7259lr = riVar.f7267lr;
        this.f7257ik = riVar.f7265ik;
        this.f7258ka = riVar.f7266ka;
        this.f7256fi = riVar.f7264fi;
        this.f7255di = riVar.f7263di;
        this.xha = riVar.xha;
        this.f7260mj = riVar.f7268mj;
        this.jbs = riVar.jbs;
        this.f7261qt = riVar.f7269qt;
    }

    /* JADX INFO: renamed from: ri */
    public static C2599fi m9595ri(Context context) {
        return new ri().m9609ri();
    }

    @Override // com.bytedance.sdk.component.p145fi.InterfaceC2590aw
    /* JADX INFO: renamed from: di */
    public ihz mo9555di() {
        return this.jbs;
    }

    @Override // com.bytedance.sdk.component.p145fi.InterfaceC2590aw
    /* JADX INFO: renamed from: fi */
    public InterfaceC2597lr mo9556fi() {
        return this.xha;
    }

    @Override // com.bytedance.sdk.component.p145fi.InterfaceC2590aw
    /* JADX INFO: renamed from: ik */
    public InterfaceC2596ka mo9557ik() {
        return this.f7257ik;
    }

    @Override // com.bytedance.sdk.component.p145fi.InterfaceC2590aw
    /* JADX INFO: renamed from: ka */
    public InterfaceC2595ik mo9558ka() {
        return this.f7255di;
    }

    @Override // com.bytedance.sdk.component.p145fi.InterfaceC2590aw
    /* JADX INFO: renamed from: lr */
    public InterfaceC2589ac mo9559lr() {
        return this.f7260mj;
    }

    @Override // com.bytedance.sdk.component.p145fi.InterfaceC2590aw
    /* JADX INFO: renamed from: ri */
    public ExecutorService mo9560ri() {
        return this.f7259lr;
    }

    @Override // com.bytedance.sdk.component.p145fi.InterfaceC2590aw
    public boolean xha() {
        return this.f7261qt;
    }
}
