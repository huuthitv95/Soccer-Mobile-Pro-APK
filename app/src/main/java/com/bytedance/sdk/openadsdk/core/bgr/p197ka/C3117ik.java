package com.bytedance.sdk.openadsdk.core.bgr.p197ka;

import com.bykv.p028vk.openvk.p049ri.p050ri.p051lr.p052ik.C1973ka;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.InterfaceC2004ri;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p061ik.C1998ri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.bgr.ka.ik */
/* JADX INFO: loaded from: classes3.dex */
public class C3117ik extends C1973ka {

    /* JADX INFO: renamed from: ka */
    private final ri f9979ka;

    /* JADX INFO: renamed from: ri */
    private final List<lr> f9981ri = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: lr */
    private int f9980lr = 1;

    /* JADX INFO: renamed from: ik */
    private int f9978ik = 1;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.bgr.ka.ik$lr */
    public interface lr extends InterfaceC2004ri.ri {
        /* JADX INFO: renamed from: ri */
        void mo12699ri(int i, int i2);
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.bgr.ka.ik$ri */
    private class ri implements InterfaceC2004ri.ri {
        private ri() {
        }

        @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.InterfaceC2004ri.ri
        /* JADX INFO: renamed from: fi */
        public void mo6422fi(InterfaceC2004ri interfaceC2004ri) {
            Iterator it = C3117ik.this.f9981ri.iterator();
            while (it.hasNext()) {
                ((lr) it.next()).mo6422fi(interfaceC2004ri);
            }
        }

        @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.InterfaceC2004ri.ri
        /* JADX INFO: renamed from: ik */
        public void mo6423ik(InterfaceC2004ri interfaceC2004ri) {
            Iterator it = C3117ik.this.f9981ri.iterator();
            while (it.hasNext()) {
                ((lr) it.next()).mo6423ik(interfaceC2004ri);
            }
        }

        @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.InterfaceC2004ri.ri
        /* JADX INFO: renamed from: ka */
        public void mo6424ka(InterfaceC2004ri interfaceC2004ri) {
            Iterator it = C3117ik.this.f9981ri.iterator();
            while (it.hasNext()) {
                ((lr) it.next()).mo6424ka(interfaceC2004ri);
            }
        }

        @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.InterfaceC2004ri.ri
        /* JADX INFO: renamed from: lr */
        public void mo6425lr(InterfaceC2004ri interfaceC2004ri) {
            Iterator it = C3117ik.this.f9981ri.iterator();
            while (it.hasNext()) {
                ((lr) it.next()).mo6425lr(interfaceC2004ri);
            }
        }

        @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.InterfaceC2004ri.ri
        /* JADX INFO: renamed from: lr */
        public void mo6426lr(InterfaceC2004ri interfaceC2004ri, int i) {
            Iterator it = C3117ik.this.f9981ri.iterator();
            while (it.hasNext()) {
                ((lr) it.next()).mo6426lr(interfaceC2004ri, i);
            }
        }

        @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.InterfaceC2004ri.ri
        /* JADX INFO: renamed from: ri */
        public void mo6427ri(InterfaceC2004ri interfaceC2004ri) {
            C3117ik.m12697ri(C3117ik.this);
            if (C3117ik.this.f9978ik > C3117ik.this.f9980lr) {
                Iterator it = C3117ik.this.f9981ri.iterator();
                while (it.hasNext()) {
                    ((lr) it.next()).mo6427ri(interfaceC2004ri);
                }
            } else {
                Iterator it2 = C3117ik.this.f9981ri.iterator();
                while (it2.hasNext()) {
                    ((lr) it2.next()).mo12699ri(C3117ik.this.f9978ik, C3117ik.this.f9980lr);
                }
                C3117ik.this.jbs();
            }
        }

        @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.InterfaceC2004ri.ri
        /* JADX INFO: renamed from: ri */
        public void mo6428ri(InterfaceC2004ri interfaceC2004ri, int i) {
            Iterator it = C3117ik.this.f9981ri.iterator();
            while (it.hasNext()) {
                ((lr) it.next()).mo6428ri(interfaceC2004ri, i);
            }
        }

        @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.InterfaceC2004ri.ri
        /* JADX INFO: renamed from: ri */
        public void mo6429ri(InterfaceC2004ri interfaceC2004ri, int i, int i2) {
            Iterator it = C3117ik.this.f9981ri.iterator();
            while (it.hasNext()) {
                ((lr) it.next()).mo6429ri(interfaceC2004ri, i, i2);
            }
        }

        @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.InterfaceC2004ri.ri
        /* JADX INFO: renamed from: ri */
        public void mo6430ri(InterfaceC2004ri interfaceC2004ri, int i, int i2, int i3) {
            Iterator it = C3117ik.this.f9981ri.iterator();
            while (it.hasNext()) {
                ((lr) it.next()).mo6430ri(interfaceC2004ri, i, i2, i3);
            }
        }

        @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.InterfaceC2004ri.ri
        /* JADX INFO: renamed from: ri */
        public void mo6431ri(InterfaceC2004ri interfaceC2004ri, long j) {
            Iterator it = C3117ik.this.f9981ri.iterator();
            while (it.hasNext()) {
                ((lr) it.next()).mo6431ri(interfaceC2004ri, j);
            }
        }

        @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.InterfaceC2004ri.ri
        /* JADX INFO: renamed from: ri */
        public void mo6432ri(InterfaceC2004ri interfaceC2004ri, long j, long j2) {
            Iterator it = C3117ik.this.f9981ri.iterator();
            while (it.hasNext()) {
                ((lr) it.next()).mo6432ri(interfaceC2004ri, j, j2);
            }
        }

        @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.InterfaceC2004ri.ri
        /* JADX INFO: renamed from: ri */
        public void mo6433ri(InterfaceC2004ri interfaceC2004ri, C1998ri c1998ri) {
            Iterator it = C3117ik.this.f9981ri.iterator();
            while (it.hasNext()) {
                ((lr) it.next()).mo6433ri(interfaceC2004ri, c1998ri);
            }
        }

        @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.InterfaceC2004ri.ri
        /* JADX INFO: renamed from: ri */
        public void mo6434ri(InterfaceC2004ri interfaceC2004ri, boolean z) {
            Iterator it = C3117ik.this.f9981ri.iterator();
            while (it.hasNext()) {
                ((lr) it.next()).mo6434ri(interfaceC2004ri, z);
            }
        }
    }

    public C3117ik() {
        ri riVar = new ri();
        this.f9979ka = riVar;
        super.mo6183ri(riVar);
        m6177ri(500);
    }

    /* JADX INFO: renamed from: ri */
    static /* synthetic */ int m12697ri(C3117ik c3117ik) {
        int i = c3117ik.f9978ik;
        c3117ik.f9978ik = i + 1;
        return i;
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p051lr.p052ik.C1973ka
    /* JADX INFO: renamed from: bu */
    public long mo6165bu() {
        return super.mo6165bu() * ((long) this.f9980lr);
    }

    public int ihz() {
        return this.f9978ik;
    }

    /* JADX INFO: renamed from: ik */
    public void m12698ik(int i) {
        this.f9980lr = Math.max(1, i);
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p051lr.p052ik.C1973ka
    /* JADX INFO: renamed from: nr */
    public long mo6175nr() {
        long jMo6175nr = super.mo6175nr();
        return this.f9980lr == 1 ? jMo6175nr : jMo6175nr + (((long) (this.f9978ik - 1)) * super.mo6165bu());
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p051lr.p052ik.C1973ka
    /* JADX INFO: renamed from: ri */
    public void mo6183ri(InterfaceC2004ri.ri riVar) {
        if (!(riVar instanceof lr)) {
            super.mo6183ri(riVar);
        } else {
            if (this.f9981ri.contains(riVar)) {
                return;
            }
            this.f9981ri.add((lr) riVar);
        }
    }
}
