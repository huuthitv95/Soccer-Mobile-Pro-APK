package com.bytedance.sdk.openadsdk.core.bgr.p199ri;

import android.app.Activity;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.os.Message;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import com.bykv.p028vk.openvk.p049ri.p050ri.p051lr.p053ka.C1977ri;
import com.bykv.p028vk.openvk.p049ri.p050ri.p051lr.p054lr.C1978ri;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.InterfaceC2004ri;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p059di.TextureViewSurfaceTextureListenerC1990ka;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p061ik.C1996ik;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p061ik.C1998ri;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC1999ik;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC2000lr;
import com.bytedance.sdk.component.utils.igq;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.bgr.p197ka.C3117ik;
import com.bytedance.sdk.openadsdk.core.bgr.p198lr.C3121fi;
import com.bytedance.sdk.openadsdk.core.bgr.p198lr.InterfaceC3125ri;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.p190aw.C3090di;
import com.bytedance.sdk.openadsdk.core.widget.C3333ac;
import com.bytedance.sdk.openadsdk.p175ay.C2896ri;
import com.bytedance.sdk.openadsdk.p230di.C3366lr;
import com.bytedance.sdk.openadsdk.p230di.C3367ri;
import com.bytedance.sdk.openadsdk.p236ka.p237fi.p238lr.C3412vr;
import com.bytedance.sdk.openadsdk.p236ka.p237fi.p239ri.C3413ri;
import com.bytedance.sdk.openadsdk.p236ka.p243ri.C3435lr;
import com.bytedance.sdk.openadsdk.p236ka.xha;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.bgr.ri.ri */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3127ri implements InterfaceC1999ik, igq.InterfaceC2719ri, InterfaceC3125ri {

    /* JADX INFO: renamed from: ay */
    protected boolean f10147ay;

    /* JADX INFO: renamed from: di */
    protected C3117ik f10150di;

    /* JADX INFO: renamed from: dw */
    protected boolean f10151dw;
    private long dzy;

    /* JADX INFO: renamed from: fi */
    protected SurfaceTexture f10152fi;

    /* JADX INFO: renamed from: fr */
    protected final ViewGroup f10153fr;
    protected InterfaceC1999ik.ri igq;
    protected boolean ihz;

    /* JADX INFO: renamed from: ka */
    protected SurfaceHolder f10156ka;

    /* JADX INFO: renamed from: mj */
    protected final wjv f10158mj;

    /* JADX INFO: renamed from: oh */
    protected long f10160oh;
    protected long ory;

    /* JADX INFO: renamed from: sf */
    protected final Context f10165sf;
    protected boolean slm;

    /* JADX INFO: renamed from: su */
    protected WeakReference<InterfaceC1999ik.lr> f10166su;
    protected C3126lr wjv;
    protected C3121fi xha;

    /* JADX INFO: renamed from: zf */
    protected C3090di f10170zf;

    /* JADX INFO: renamed from: ri */
    protected String f10164ri = "TTAD.VideoController";

    /* JADX INFO: renamed from: lr */
    protected final int f10157lr = 100;

    /* JADX INFO: renamed from: ik */
    protected final igq f10155ik = new igq(Looper.getMainLooper(), this);
    protected long jbs = 0;

    /* JADX INFO: renamed from: qt */
    protected long f10163qt = 0;

    /* JADX INFO: renamed from: co */
    protected final List<Runnable> f10149co = new ArrayList();

    /* JADX INFO: renamed from: aw */
    protected boolean f10146aw = false;
    protected boolean bgr = false;

    /* JADX INFO: renamed from: vr */
    protected boolean f10168vr = true;

    /* JADX INFO: renamed from: bu */
    protected boolean f10148bu = false;

    /* JADX INFO: renamed from: nr */
    protected boolean f10159nr = false;
    protected boolean tan = false;

    /* JADX INFO: renamed from: ac */
    protected AtomicBoolean f10145ac = new AtomicBoolean(false);

    /* JADX INFO: renamed from: uq */
    protected boolean f10167uq = true;
    protected boolean hcw = false;

    /* JADX INFO: renamed from: xd */
    protected Runnable f10169xd = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bgr.ri.ri.1
        @Override // java.lang.Runnable
        public void run() {
            Boolean.valueOf(AbstractC3127ri.this.f10146aw);
            AbstractC3127ri.this.m12962ac();
        }
    };

    /* JADX INFO: renamed from: pv */
    private long f10161pv = 0;

    /* JADX INFO: renamed from: ig */
    private boolean f10154ig = true;

    /* JADX INFO: renamed from: qd */
    private int f10162qd = 1;
    private final AtomicBoolean srn = new AtomicBoolean(false);

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.bgr.ri.ri$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {

        /* JADX INFO: renamed from: ri */
        static final /* synthetic */ int[] f10175ri;

        static {
            int[] iArr = new int[C3333ac.ri.values().length];
            f10175ri = iArr;
            try {
                iArr[C3333ac.ri.PAUSE_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10175ri[C3333ac.ri.RELEASE_VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10175ri[C3333ac.ri.START_VIDEO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public AbstractC3127ri(Context context, wjv wjvVar, ViewGroup viewGroup) {
        this.f10158mj = wjvVar;
        this.f10165sf = context;
        this.f10153fr = viewGroup;
        this.f10164ri += hashCode();
    }

    private void dzy() {
        C3121fi c3121fi = this.xha;
        if (c3121fi != null) {
            c3121fi.m12839ka(0);
            this.xha.mo12861ri(false, false);
            this.xha.mo12837ik(false);
            this.xha.mo12833fi();
            this.xha.xha();
        }
    }

    /* JADX INFO: renamed from: ik */
    private boolean m12960ik(int i) {
        return this.xha.mo12845lr(i);
    }

    /* JADX INFO: renamed from: ri */
    private void m12961ri(long j, boolean z) {
        if (this.f10150di == null) {
            return;
        }
        if (z) {
            dzy();
        }
        this.f10150di.m6178ri(j);
    }

    private boolean slm() {
        C3121fi c3121fi = this.xha;
        if (c3121fi != null) {
            return c3121fi.m12828aw() instanceof TextureViewSurfaceTextureListenerC1990ka;
        }
        return false;
    }

    /* JADX INFO: renamed from: ac */
    protected void m12962ac() {
        this.f10155ik.postAtFrontOfQueue(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bgr.ri.ri.2
            @Override // java.lang.Runnable
            public void run() {
                if (AbstractC3127ri.this.f10150di != null) {
                    Boolean.valueOf(AbstractC3127ri.this.f10146aw);
                    AbstractC3127ri.this.f10150di.m6176qt();
                }
            }
        });
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC1999ik
    /* JADX INFO: renamed from: aw */
    public boolean mo6371aw() {
        return this.bgr;
    }

    /* JADX INFO: renamed from: ay */
    public boolean m12963ay() {
        return this.slm;
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC1999ik
    public final boolean bgr() {
        return this.f10147ay;
    }

    /* JADX INFO: renamed from: bu */
    public long m12964bu() {
        return this.ory;
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC1999ik
    /* JADX INFO: renamed from: di */
    public long mo6373di() {
        return this.jbs;
    }

    /* JADX INFO: renamed from: dw */
    protected final void m12965dw() {
        this.hcw = true;
        C3412vr.ri riVar = new C3412vr.ri();
        riVar.m15466lr(mo6373di());
        riVar.m15463ka(jbs() / ((long) hcw()));
        riVar.m15459ik(xha());
        riVar.m15472ri(m12964bu());
        C3413ri.m15492ri(this.xha, riVar);
    }

    /* JADX INFO: renamed from: fi */
    public final void m12966fi(long j) {
        this.jbs = j;
        this.f10163qt = Math.max(this.f10163qt, j);
        C3121fi c3121fi = this.xha;
        if (c3121fi != null) {
            c3121fi.mo6403ri();
        }
        C3117ik c3117ik = this.f10150di;
        if (c3117ik != null) {
            c3117ik.m6185ri(true, this.jbs, this.slm);
        }
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC2001ri
    /* JADX INFO: renamed from: fi */
    public final void mo6407fi(InterfaceC2000lr interfaceC2000lr, View view) {
        mo12949ri(interfaceC2000lr, view, false);
    }

    /* JADX INFO: renamed from: fi */
    public void m12967fi(boolean z) {
        this.f10167uq = z;
    }

    /* JADX INFO: renamed from: fr */
    public boolean mo12775fr() {
        return this.f10154ig;
    }

    public int hcw() {
        return this.f10162qd;
    }

    public final boolean igq() {
        C3117ik c3117ik = this.f10150di;
        return c3117ik != null && c3117ik.mo6167di();
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC1999ik
    /* JADX INFO: renamed from: ihz, reason: merged with bridge method [inline-methods] */
    public final C3121fi mo6372co() {
        return this.xha;
    }

    /* JADX INFO: renamed from: ik */
    public void m12968ik(long j) {
        this.f10161pv = j;
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC2001ri
    /* JADX INFO: renamed from: ik */
    public final void mo6408ik(InterfaceC2000lr interfaceC2000lr, View view) {
        C3121fi c3121fi = this.xha;
        if (c3121fi != null) {
            c3121fi.jbs();
        }
        mo6384ri(true, 3);
    }

    /* JADX INFO: renamed from: ik */
    protected void m12969ik(boolean z) {
        this.tan = z;
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC1999ik
    public final long jbs() {
        C3117ik c3117ik = this.f10150di;
        if (c3117ik == null) {
            return 0L;
        }
        return c3117ik.mo6165bu();
    }

    /* JADX INFO: renamed from: ka */
    public void m12970ka(long j) {
        this.f10160oh = j;
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC2001ri
    /* JADX INFO: renamed from: ka */
    public final void mo6409ka(InterfaceC2000lr interfaceC2000lr, View view) {
        if (!this.tan) {
            mo6384ri(true, 3);
            return;
        }
        m12969ik(false);
        C3121fi c3121fi = this.xha;
        if (c3121fi != null) {
            c3121fi.mo12842lr(this.f10153fr);
        }
        m12981ri(1);
    }

    /* JADX INFO: renamed from: ka */
    public final void m12971ka(boolean z) {
        this.f10154ig = z;
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC1999ik
    /* JADX INFO: renamed from: lr */
    public final void mo6377lr() {
        C3117ik c3117ik = this.f10150di;
        if (c3117ik != null) {
            c3117ik.m6188sf();
        }
        if (this.ihz || !this.f10145ac.get()) {
            return;
        }
        m12965dw();
    }

    /* JADX INFO: renamed from: lr */
    public void m12972lr(int i) {
        this.f10162qd = i;
    }

    /* JADX INFO: renamed from: lr */
    public void m12973lr(long j) {
        this.jbs = j;
        this.f10163qt = Math.max(this.f10163qt, j);
    }

    /* JADX INFO: renamed from: lr */
    public void m12974lr(C1996ik c1996ik) {
        C3126lr c3126lr = (C3126lr) c1996ik;
        this.wjv = c3126lr;
        this.slm = c3126lr.m6331sf();
        c1996ik.m6316ka(String.valueOf(this.f10158mj.m14545ur()));
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC2001ri
    /* JADX INFO: renamed from: lr */
    public final void mo6410lr(InterfaceC2000lr interfaceC2000lr, int i) {
        C3121fi c3121fi = this.xha;
        if (c3121fi != null) {
            c3121fi.mo12832di();
        }
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC2001ri
    /* JADX INFO: renamed from: lr */
    public void mo6411lr(InterfaceC2000lr interfaceC2000lr, SurfaceTexture surfaceTexture) {
        this.f10146aw = false;
        C3117ik c3117ik = this.f10150di;
        if (c3117ik != null) {
            c3117ik.m6184ri(false);
        }
        this.f10152fi = null;
        tan();
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC2001ri
    /* JADX INFO: renamed from: lr */
    public void mo6412lr(InterfaceC2000lr interfaceC2000lr, SurfaceHolder surfaceHolder) {
        this.f10146aw = false;
        this.f10156ka = null;
        C3117ik c3117ik = this.f10150di;
        if (c3117ik != null) {
            c3117ik.m6184ri(false);
        }
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC2001ri
    /* JADX INFO: renamed from: lr */
    public final void mo6413lr(InterfaceC2000lr interfaceC2000lr, View view) {
        m12975lr(interfaceC2000lr, view, false, false);
    }

    /* JADX INFO: renamed from: lr */
    public final void m12975lr(InterfaceC2000lr interfaceC2000lr, View view, boolean z, boolean z2) {
        m12969ik(!this.tan);
        Context context = this.f10165sf;
        if (context != null && (context instanceof Activity)) {
            if (this.tan) {
                m12981ri(z ? 8 : 0);
                C3121fi c3121fi = this.xha;
                if (c3121fi != null) {
                    c3121fi.mo12856ri(this.f10153fr);
                    this.xha.mo12837ik(false);
                }
            } else {
                m12981ri(1);
                C3121fi c3121fi2 = this.xha;
                if (c3121fi2 != null) {
                    c3121fi2.mo12842lr(this.f10153fr);
                    this.xha.mo12837ik(false);
                }
            }
            WeakReference<InterfaceC1999ik.lr> weakReference = this.f10166su;
            InterfaceC1999ik.lr lrVar = weakReference != null ? weakReference.get() : null;
            if (lrVar != null) {
                lrVar.mo6396ri(this.tan);
            }
        }
    }

    /* JADX INFO: renamed from: lr */
    protected final void m12976lr(xha xhaVar) {
        this.hcw = true;
        C3412vr.ri riVar = new C3412vr.ri();
        riVar.m15466lr(mo6373di());
        riVar.m15463ka(jbs() / ((long) hcw()));
        riVar.m15459ik(xha());
        riVar.m15462ka(mo6378mj());
        riVar.m15472ri(m12964bu());
        riVar.m15460ik(this.f10151dw);
        C3413ri.m15486lr(this.xha, riVar, xhaVar);
    }

    /* JADX INFO: renamed from: lr */
    protected void m12977lr(Runnable runnable) {
        this.f10149co.add(runnable);
    }

    /* JADX INFO: renamed from: lr */
    public final void m12978lr(boolean z) {
        this.bgr = z;
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC1999ik
    /* JADX INFO: renamed from: mj */
    public final int mo6378mj() {
        C3117ik c3117ik = this.f10150di;
        if (c3117ik == null) {
            return 0;
        }
        return c3117ik.slm();
    }

    /* JADX INFO: renamed from: nr */
    protected void m12979nr() {
        if (this.f10150di == null) {
            return;
        }
        if (slm()) {
            SurfaceTexture surfaceTexture = this.f10152fi;
            if (surfaceTexture == null || surfaceTexture == this.f10150di.m6163ac()) {
                return;
            }
            this.f10150di.m6179ri(this.f10152fi);
            return;
        }
        SurfaceHolder surfaceHolder = this.f10156ka;
        if (surfaceHolder == null || surfaceHolder == this.f10150di.tan()) {
            return;
        }
        this.f10150di.m6181ri(this.f10156ka);
    }

    /* JADX INFO: renamed from: oh */
    public final long m12980oh() {
        return mo6373di() + xha();
    }

    protected final void ory() {
        this.hcw = true;
        C3413ri.m15496ri(this.f10158mj, this.xha, this.wjv);
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC1999ik
    /* JADX INFO: renamed from: qt */
    public final int mo6379qt() {
        return C1977ri.m6207ri(this.f10163qt, this.f10160oh);
    }

    /* JADX INFO: renamed from: ri */
    public final void m12981ri(int i) {
        Context context = this.f10165sf;
        if (context == null) {
            return;
        }
        boolean z = i == 0 || i == 8;
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            try {
                activity.setRequestedOrientation(i);
            } catch (Throwable unused) {
            }
            if (z) {
                activity.getWindow().clearFlags(1024);
            } else {
                activity.getWindow().setFlags(1024, 1024);
            }
        }
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC1999ik
    /* JADX INFO: renamed from: ri */
    public void mo6381ri(long j) {
        this.ory = j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: renamed from: ri */
    public void m12982ri(long j, long j2) {
        if (!this.srn.get() && C3367ri.m15193ri().m15204ik() && (j * 1.0d) / j2 > 0.3d) {
            this.srn.set(true);
            if (this.f10158mj != null) {
                C3366lr.m15165ri().m15173ri("videoPercent30", this.f10158mj);
            }
        }
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC1999ik
    /* JADX INFO: renamed from: ri */
    public void mo6382ri(SurfaceTexture surfaceTexture) {
        this.f10151dw = true;
    }

    @Override // com.bytedance.sdk.component.utils.igq.InterfaceC2719ri
    /* JADX INFO: renamed from: ri */
    public void mo6180ri(Message message) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: renamed from: ri */
    public final void m12983ri(C1998ri c1998ri) {
        this.hcw = true;
        C3412vr.ri riVar = new C3412vr.ri();
        riVar.m15459ik(xha());
        riVar.m15463ka(jbs() / ((long) hcw()));
        riVar.m15466lr(mo6373di());
        riVar.m15473ri(c1998ri);
        C3413ri.m15481ik(mo6372co(), riVar);
    }

    /* JADX INFO: renamed from: ri */
    public void mo12948ri(InterfaceC1999ik.ka kaVar) {
    }

    /* JADX INFO: renamed from: ri */
    public final void m12984ri(InterfaceC1999ik.lr lrVar) {
        this.f10166su = new WeakReference<>(lrVar);
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC1999ik
    /* JADX INFO: renamed from: ri */
    public final void mo6383ri(InterfaceC1999ik.ri riVar) {
        this.igq = riVar;
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC2001ri
    /* JADX INFO: renamed from: ri */
    public final void mo6414ri(InterfaceC2000lr interfaceC2000lr, int i) {
        if (this.f10150di == null) {
            return;
        }
        m12961ri(this.dzy, m12960ik(i));
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC2001ri
    /* JADX INFO: renamed from: ri */
    public final void mo6415ri(InterfaceC2000lr interfaceC2000lr, int i, boolean z) {
        if (this.f10165sf == null) {
            return;
        }
        long j = this.f10160oh;
        long j2 = (long) (((((long) i) * j) * 1.0f) / 100.0f);
        if (j > 0) {
            this.dzy = (int) j2;
        } else {
            this.dzy = 0L;
        }
        C3121fi c3121fi = this.xha;
        if (c3121fi != null) {
            c3121fi.mo12851ri(this.dzy);
        }
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC2001ri
    /* JADX INFO: renamed from: ri */
    public void mo6416ri(InterfaceC2000lr interfaceC2000lr, SurfaceTexture surfaceTexture) {
        this.f10146aw = true;
        this.f10152fi = surfaceTexture;
        C3117ik c3117ik = this.f10150di;
        if (c3117ik != null) {
            c3117ik.m6179ri(surfaceTexture);
            this.f10150di.m6184ri(this.f10146aw);
        }
        tan();
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC2001ri
    /* JADX INFO: renamed from: ri */
    public void mo6417ri(InterfaceC2000lr interfaceC2000lr, SurfaceHolder surfaceHolder) {
        this.f10146aw = true;
        this.f10156ka = surfaceHolder;
        C3117ik c3117ik = this.f10150di;
        if (c3117ik == null) {
            return;
        }
        c3117ik.m6181ri(surfaceHolder);
        tan();
    }

    /* JADX INFO: renamed from: ri */
    public void mo12949ri(InterfaceC2000lr interfaceC2000lr, View view, boolean z) {
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC2001ri
    /* JADX INFO: renamed from: ri */
    public final void mo6419ri(InterfaceC2000lr interfaceC2000lr, View view, boolean z, boolean z2) {
        if (this.f10168vr) {
            mo6377lr();
        }
        if (z && !this.f10168vr && !m12988su()) {
            this.xha.m12844lr(!igq(), false);
            this.xha.mo12862ri(z2, true, false);
        }
        C3117ik c3117ik = this.f10150di;
        if (c3117ik == null || !c3117ik.mo6167di()) {
            this.xha.mo12832di();
        } else {
            this.xha.mo12832di();
            this.xha.mo12833fi();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p198lr.InterfaceC3125ri
    /* JADX INFO: renamed from: ri */
    public final void mo12959ri(C3333ac.ri riVar, String str) {
        int i = AnonymousClass4.f10175ri[riVar.ordinal()];
        if (i == 1) {
            mo6377lr();
            return;
        }
        if (i == 2) {
            mo6376ka();
        } else {
            if (i != 3) {
                return;
            }
            mo6375ik();
            this.f10148bu = false;
            this.f10159nr = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: renamed from: ri */
    public final void m12985ri(xha xhaVar) {
        boolean z = false;
        if (this.f10145ac.compareAndSet(false, true)) {
            this.hcw = true;
            C3090di c3090di = this.f10170zf;
            if (c3090di != null) {
                c3090di.m12404ri(jbs(), m12963ay());
            }
            C3412vr.ri riVar = new C3412vr.ri();
            riVar.m15474ri(mo12775fr());
            riVar.m15463ka(jbs());
            C3117ik c3117ik = this.f10150di;
            if (c3117ik != null && c3117ik.bgr()) {
                z = true;
            }
            riVar.m15467lr(z);
            C3413ri.m15491ri(C3299nr.m14642ri(), this.xha, riVar, xhaVar);
        }
    }

    /* JADX INFO: renamed from: ri */
    protected void m12986ri(Runnable runnable) {
        if (this.xha.m12865uq() && this.f10146aw) {
            runnable.run();
        } else {
            m12977lr(runnable);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m12987ri(boolean z) {
        this.f10168vr = z;
        C3121fi c3121fi = this.xha;
        if (c3121fi != null) {
            c3121fi.m12840ka(z);
        }
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC1999ik
    /* JADX INFO: renamed from: ri */
    public final void mo6385ri(final boolean z, String str) {
        this.slm = z;
        C3117ik c3117ik = this.f10150di;
        if (c3117ik != null) {
            c3117ik.m6172lr(z);
            C3413ri.m15494ri(this.xha, z, str);
        }
        if (this.f10170zf != null) {
            if (C1978ri.m6210ri()) {
                this.f10170zf.m12408ri(z);
            } else {
                this.f10155ik.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bgr.ri.ri.3
                    @Override // java.lang.Runnable
                    public void run() {
                        AbstractC3127ri.this.f10170zf.m12408ri(z);
                    }
                });
            }
        }
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC1999ik
    /* JADX INFO: renamed from: ri */
    public boolean mo6386ri(float f) {
        C3117ik c3117ik = this.f10150di;
        if (c3117ik != null) {
            return c3117ik.m6187ri(f);
        }
        return false;
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC1999ik
    /* JADX INFO: renamed from: ri */
    public boolean mo6387ri(C1996ik c1996ik) {
        return false;
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC1999ik
    /* JADX INFO: renamed from: sf */
    public InterfaceC2004ri mo6388sf() {
        return this.f10150di;
    }

    /* JADX INFO: renamed from: su */
    public final boolean m12988su() {
        C3117ik c3117ik = this.f10150di;
        return c3117ik == null || c3117ik.mo6173lr();
    }

    protected void tan() {
        if (this.f10149co.isEmpty()) {
            return;
        }
        Iterator it = new ArrayList(this.f10149co).iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.f10149co.clear();
    }

    /* JADX INFO: renamed from: uq */
    public boolean m12989uq() {
        return this.f10168vr;
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC1999ik
    /* JADX INFO: renamed from: vr */
    public boolean mo6389vr() {
        return true;
    }

    public boolean wjv() {
        return this.f10148bu;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: renamed from: xd */
    public final void m12990xd() {
        C3435lr.m15671ri(C2896ri.m11142ri(this.f10158mj.m14400fn(), true, this.f10158mj), 5, this.f10158mj.m14533tn());
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC1999ik
    public final long xha() {
        C3117ik c3117ik = this.f10150di;
        if (c3117ik == null) {
            return 0L;
        }
        return c3117ik.m6189vr();
    }

    /* JADX INFO: renamed from: zf */
    protected final void m12991zf() {
        this.hcw = true;
        C3412vr.ri riVar = new C3412vr.ri();
        riVar.m15466lr(mo6373di());
        riVar.m15463ka(jbs() / ((long) hcw()));
        riVar.m15459ik(xha());
        C3413ri.m15485lr(mo6372co(), riVar);
    }
}
