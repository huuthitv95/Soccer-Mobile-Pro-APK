package com.bytedance.sdk.openadsdk.core.jbs;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.component.adexpress.p125lr.InterfaceC2505ka;
import com.bytedance.sdk.component.adexpress.p125lr.InterfaceC2513vr;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.ory;
import com.bytedance.sdk.openadsdk.core.p221ka.C3261lr;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.p235ik.C3377ik;
import com.bytedance.sdk.openadsdk.utils.C3583qd;
import com.bytedance.sdk.openadsdk.utils.dzy;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.jbs.ik */
/* JADX INFO: loaded from: classes3.dex */
public class C3232ik {

    /* JADX INFO: renamed from: di */
    private int f10839di;

    /* JADX INFO: renamed from: fi */
    private C3222ac f10840fi;

    /* JADX INFO: renamed from: ik */
    private ri f10841ik;
    private int jbs;

    /* JADX INFO: renamed from: ka */
    private InterfaceC2513vr f10842ka;

    /* JADX INFO: renamed from: lr */
    private final Context f10843lr;

    /* JADX INFO: renamed from: mj */
    private ScheduledFuture<?> f10844mj;

    /* JADX INFO: renamed from: ri */
    com.bytedance.sdk.openadsdk.core.model.wjv f10845ri;
    private int xha;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.jbs.ik$ik */
    interface ik {
        /* JADX INFO: renamed from: lr */
        void mo13636lr(String str);

        /* JADX INFO: renamed from: ri */
        void mo13637ri();

        /* JADX INFO: renamed from: ri */
        void mo13638ri(int i, int i2);

        /* JADX INFO: renamed from: ri */
        void mo13641ri(String str);
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.jbs.ik$lr */
    private static class lr implements Runnable {

        /* JADX INFO: renamed from: ri */
        ik f10847ri;

        public lr(ik ikVar) {
            this.f10847ri = ikVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            ik ikVar = this.f10847ri;
            if (ikVar != null) {
                ikVar.mo13638ri(107, 107);
            }
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.jbs.ik$ri */
    public static class ri implements InterfaceC2505ka<View>, C3230fi.lr {

        /* JADX INFO: renamed from: aw */
        private int f10848aw;
        private com.bytedance.sdk.component.adexpress.p125lr.xha bgr;

        /* JADX INFO: renamed from: co */
        private C3230fi f10849co;

        /* JADX INFO: renamed from: di */
        private final int f10850di;

        /* JADX INFO: renamed from: fi */
        private final Context f10851fi;

        /* JADX INFO: renamed from: ik */
        private TTDislikeDialogAbstract f10852ik;
        private com.bytedance.sdk.openadsdk.core.model.wjv jbs;

        /* JADX INFO: renamed from: ka */
        private String f10853ka;

        /* JADX INFO: renamed from: lr */
        private C3377ik f10854lr;

        /* JADX INFO: renamed from: mj */
        private FrameLayout f10855mj;

        /* JADX INFO: renamed from: qt */
        private final int f10856qt;

        /* JADX INFO: renamed from: ri */
        AtomicBoolean f10857ri = new AtomicBoolean(false);

        /* JADX INFO: renamed from: sf */
        private String f10858sf;

        /* JADX INFO: renamed from: vr */
        private PAGExpressAdWrapperListener f10859vr;
        private final int xha;

        public ri(Context context, com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, int i, int i2, String str, int i3) {
            this.f10858sf = str;
            if (wjvVar != null && wjvVar.vgs()) {
                this.f10858sf = "fullscreen_interstitial_ad";
            }
            this.f10851fi = context;
            this.f10850di = i;
            this.xha = i2;
            this.jbs = wjvVar;
            this.f10856qt = C3583qd.m16589lr(context, 3.0f);
            this.f10848aw = i3;
            m13665di();
        }

        /* JADX INFO: renamed from: di */
        private void m13665di() {
            FrameLayout frameLayout = new FrameLayout(this.f10851fi);
            this.f10855mj = frameLayout;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new FrameLayout.LayoutParams(this.f10850di, this.xha);
            }
            layoutParams.width = this.f10850di;
            layoutParams.height = this.xha;
            layoutParams.gravity = 17;
            this.f10855mj.setLayoutParams(layoutParams);
            C3230fi c3230fiM13669mj = m13669mj();
            this.f10855mj.addView(c3230fiM13669mj);
            View viewXha = xha();
            this.f10855mj.addView(viewXha);
            com.bytedance.sdk.openadsdk.core.model.wjv wjvVar = this.jbs;
            if (wjvVar != null && wjvVar.vgs()) {
                c3230fiM13669mj.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
                c3230fiM13669mj.m13639ri(((Activity) this.f10851fi).findViewById(com.bytedance.sdk.openadsdk.utils.slm.f13322zz), FriendlyObstructionPurpose.OTHER);
            }
            c3230fiM13669mj.m13639ri(viewXha, FriendlyObstructionPurpose.OTHER);
            Context context = this.f10851fi;
            if (context == null || !(context instanceof Activity)) {
                return;
            }
            View viewFindViewById = ((Activity) context).findViewById(com.bytedance.sdk.openadsdk.utils.slm.udw);
            if (viewFindViewById != null) {
                c3230fiM13669mj.m13639ri(viewFindViewById, FriendlyObstructionPurpose.OTHER);
            }
            View viewFindViewById2 = ((Activity) this.f10851fi).findViewById(com.bytedance.sdk.openadsdk.utils.slm.ugd);
            if (viewFindViewById2 != null) {
                c3230fiM13669mj.m13639ri(viewFindViewById2, FriendlyObstructionPurpose.OTHER);
            }
        }

        /* JADX INFO: renamed from: mj */
        private C3230fi m13669mj() {
            C3230fi c3230fiM13680lr = C3233ka.m13677ri().m13680lr();
            this.f10849co = c3230fiM13680lr;
            if (c3230fiM13680lr == null) {
                this.f10849co = new C3230fi(this.f10851fi);
            }
            C3233ka.m13677ri().m13679ik(this.f10849co);
            this.f10849co.m13640ri(this.jbs, this, this.f10858sf);
            this.f10849co.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            return this.f10849co;
        }

        private View xha() {
            PAGLogoView pAGLogoViewCreatePAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(this.f10851fi, this.jbs);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            com.bytedance.sdk.openadsdk.core.model.wjv wjvVar = this.jbs;
            if (wjvVar == null || !wjvVar.vgs()) {
                layoutParams.topMargin = this.f10856qt;
                layoutParams.leftMargin = this.f10856qt;
            } else {
                layoutParams.leftMargin = C3583qd.m16589lr(this.f10851fi, 20.0f);
                layoutParams.bottomMargin = C3583qd.m16589lr(this.f10851fi, 20.0f);
                layoutParams.gravity = 8388691;
            }
            pAGLogoViewCreatePAGLogoViewByMaterial.setLayoutParams(layoutParams);
            pAGLogoViewCreatePAGLogoViewByMaterial.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.jbs.ik.ri.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TTWebsiteActivity.m10758ri(ri.this.f10851fi, ri.this.jbs, ri.this.f10858sf);
                }
            });
            return pAGLogoViewCreatePAGLogoViewByMaterial;
        }

        @Override // com.bytedance.sdk.component.adexpress.p125lr.InterfaceC2505ka
        /* JADX INFO: renamed from: fi */
        public View mo8751fi() {
            return this.f10855mj;
        }

        @Override // com.bytedance.sdk.component.adexpress.p125lr.InterfaceC2505ka
        /* JADX INFO: renamed from: ik */
        public int mo8752ik() {
            return 5;
        }

        /* JADX INFO: renamed from: ka */
        public void m13671ka() {
            this.f10855mj = null;
            this.f10854lr = null;
            this.f10852ik = null;
            this.bgr = null;
            this.jbs = null;
            C3230fi c3230fi = this.f10849co;
            if (c3230fi != null) {
                c3230fi.slm();
                C3233ka.m13677ri().m13682ri(this.f10849co);
            }
            this.f10857ri.set(true);
        }

        @Override // com.bytedance.sdk.openadsdk.core.jbs.C3230fi.lr
        /* JADX INFO: renamed from: lr */
        public void mo11533lr() {
            if (this.bgr != null) {
                com.bytedance.sdk.component.adexpress.p125lr.bgr bgrVar = new com.bytedance.sdk.component.adexpress.p125lr.bgr();
                bgrVar.m8968ri(true);
                bgrVar.m8963ri(C3583qd.m16581ik(this.f10851fi, this.f10850di));
                bgrVar.m8955lr(C3583qd.m16581ik(this.f10851fi, this.xha));
                this.bgr.mo8982ri(this.f10855mj, bgrVar);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.jbs.C3230fi.lr
        /* JADX INFO: renamed from: ri */
        public View mo11534ri() {
            FrameLayout frameLayout = this.f10855mj;
            if (frameLayout == null) {
                return null;
            }
            return (View) frameLayout.getParent();
        }

        @Override // com.bytedance.sdk.openadsdk.core.jbs.C3230fi.lr
        /* JADX INFO: renamed from: ri */
        public void mo11535ri(int i, int i2) {
            com.bytedance.sdk.component.adexpress.p125lr.xha xhaVar = this.bgr;
            if (xhaVar != null) {
                xhaVar.mo8981ri(i, "render fail");
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.jbs.C3230fi.lr
        /* JADX INFO: renamed from: ri */
        public void mo11536ri(View view, int i) {
            PAGExpressAdWrapperListener pAGExpressAdWrapperListener = this.f10859vr;
            if (pAGExpressAdWrapperListener != null) {
                pAGExpressAdWrapperListener.onAdClicked();
            }
        }

        @Override // com.bytedance.sdk.component.adexpress.p125lr.InterfaceC2505ka
        /* JADX INFO: renamed from: ri */
        public void mo8759ri(com.bytedance.sdk.component.adexpress.p125lr.xha xhaVar) {
            com.bytedance.sdk.openadsdk.core.model.wjv wjvVar;
            if (this.f10857ri.get()) {
                return;
            }
            if (this.f10851fi == null || (wjvVar = this.jbs) == null) {
                xhaVar.mo8981ri(106, "material null");
                return;
            }
            this.bgr = xhaVar;
            if (TextUtils.isEmpty(wjvVar.rko())) {
                xhaVar.mo8981ri(106, "dsp data is null");
            } else {
                this.f10849co.m13635ac();
            }
        }

        /* JADX INFO: renamed from: ri */
        public void m13672ri(TTDislikeDialogAbstract tTDislikeDialogAbstract) {
            com.bytedance.sdk.openadsdk.core.model.wjv wjvVar;
            if (tTDislikeDialogAbstract != null && (wjvVar = this.jbs) != null) {
                tTDislikeDialogAbstract.setMaterialMeta(wjvVar.yjg(), this.jbs.m14409ib());
            }
            this.f10852ik = tTDislikeDialogAbstract;
        }

        /* JADX INFO: renamed from: ri */
        public void m13673ri(PAGExpressAdWrapperListener pAGExpressAdWrapperListener) {
            this.f10859vr = pAGExpressAdWrapperListener;
        }

        /* JADX INFO: renamed from: ri */
        public void m13674ri(ory oryVar) {
            if (oryVar instanceof C3377ik) {
                this.f10854lr = (C3377ik) oryVar;
            }
        }

        /* JADX INFO: renamed from: ri */
        public void m13675ri(String str) {
            this.f10853ka = str;
        }
    }

    public C3232ik(Context context, C3222ac c3222ac, com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, String str) {
        this.f10845ri = wjvVar;
        this.f10843lr = context;
        this.f10840fi = c3222ac;
        m13657ri(c3222ac);
        this.f10841ik = new ri(context, wjvVar, this.f10839di, this.xha, str, this.jbs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ik */
    public void m13653ik() {
        try {
            ScheduledFuture<?> scheduledFuture = this.f10844mj;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                return;
            }
            this.f10844mj.cancel(false);
            this.f10844mj = null;
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ri */
    private void m13657ri(C3222ac c3222ac) {
        com.bytedance.sdk.openadsdk.core.model.wjv wjvVar = this.f10845ri;
        if (wjvVar != null && wjvVar.vgs()) {
            this.f10839di = -1;
            this.xha = -1;
            return;
        }
        C3236nr c3236nrM13836ri = C3261lr.m13836ri(c3222ac.getExpectExpressWidth(), c3222ac.getExpectExpressHeight());
        this.jbs = c3236nrM13836ri.f10867ri;
        if (c3222ac.getExpectExpressWidth() <= 0 || c3222ac.getExpectExpressHeight() <= 0) {
            int iM16580ik = C3583qd.m16580ik(this.f10843lr);
            this.f10839di = iM16580ik;
            this.xha = Float.valueOf(iM16580ik / c3236nrM13836ri.f10866lr).intValue();
        } else {
            this.f10839di = C3583qd.m16589lr(this.f10843lr, c3222ac.getExpectExpressWidth());
            this.xha = C3583qd.m16589lr(this.f10843lr, c3222ac.getExpectExpressHeight());
        }
        int i = this.f10839di;
        if (i <= 0 || i <= C3583qd.m16580ik(this.f10843lr)) {
            return;
        }
        float fM16580ik = C3583qd.m16580ik(this.f10843lr) / this.f10839di;
        this.f10839di = C3583qd.m16580ik(this.f10843lr);
        this.xha = Float.valueOf(this.xha * fM16580ik).intValue();
    }

    /* JADX INFO: renamed from: lr */
    public void m13658lr() {
        ri riVar = this.f10841ik;
        if (riVar != null) {
            riVar.m13671ka();
            this.f10841ik = null;
        }
        m13653ik();
        this.f10842ka = null;
        this.f10840fi = null;
    }

    /* JADX INFO: renamed from: ri */
    public void m13659ri() {
        com.bytedance.sdk.openadsdk.core.model.wjv wjvVar = this.f10845ri;
        if (wjvVar != null && wjvVar.vgs()) {
            this.f10844mj = dzy.m16408ri().schedule(new lr(this.f10841ik.f10849co), C3299nr.m14639ka().dzy(), TimeUnit.MILLISECONDS);
        }
        ri riVar = this.f10841ik;
        if (riVar == null) {
            InterfaceC2513vr interfaceC2513vr = this.f10842ka;
            if (interfaceC2513vr != null) {
                interfaceC2513vr.mo9010a_(106);
                return;
            }
            return;
        }
        riVar.mo8759ri(new com.bytedance.sdk.component.adexpress.p125lr.xha() { // from class: com.bytedance.sdk.openadsdk.core.jbs.ik.1
            @Override // com.bytedance.sdk.component.adexpress.p125lr.xha
            /* JADX INFO: renamed from: ri */
            public void mo8981ri(int i, String str) {
                if (C3232ik.this.f10842ka != null) {
                    C3232ik.this.f10842ka.mo9010a_(106);
                }
                C3232ik.this.m13653ik();
            }

            @Override // com.bytedance.sdk.component.adexpress.p125lr.xha
            /* JADX INFO: renamed from: ri */
            public void mo8982ri(View view, com.bytedance.sdk.component.adexpress.p125lr.bgr bgrVar) {
                if (C3232ik.this.f10840fi == null || view == null) {
                    if (C3232ik.this.f10842ka != null) {
                        C3232ik.this.f10842ka.mo9010a_(106);
                    }
                } else if (C3232ik.this.f10842ka != null) {
                    C3232ik.this.f10842ka.mo9011ri(C3232ik.this.f10841ik, bgrVar);
                }
                C3232ik.this.m13653ik();
            }
        });
        View viewMo8751fi = this.f10841ik.mo8751fi();
        this.f10840fi.removeView(viewMo8751fi);
        if (viewMo8751fi.getParent() != null) {
            ((ViewGroup) viewMo8751fi.getParent()).removeView(viewMo8751fi);
        }
        this.f10840fi.addView(viewMo8751fi, new ViewGroup.LayoutParams(-1, -1));
    }

    /* JADX INFO: renamed from: ri */
    public void m13660ri(InterfaceC2513vr interfaceC2513vr) {
        this.f10842ka = interfaceC2513vr;
    }

    /* JADX INFO: renamed from: ri */
    public void m13661ri(TTDislikeDialogAbstract tTDislikeDialogAbstract) {
        ri riVar = this.f10841ik;
        if (riVar != null) {
            riVar.m13672ri(tTDislikeDialogAbstract);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m13662ri(PAGExpressAdWrapperListener pAGExpressAdWrapperListener) {
        ri riVar = this.f10841ik;
        if (riVar != null) {
            riVar.m13673ri(pAGExpressAdWrapperListener);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m13663ri(ory oryVar) {
        ri riVar = this.f10841ik;
        if (riVar != null) {
            riVar.m13674ri(oryVar);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m13664ri(String str) {
        ri riVar = this.f10841ik;
        if (riVar != null) {
            riVar.m13675ri(str);
        }
    }
}
