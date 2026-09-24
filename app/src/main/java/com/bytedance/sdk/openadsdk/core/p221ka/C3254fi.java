package com.bytedance.sdk.openadsdk.core.p221ka;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.p090di.InterfaceC2249ik;
import com.bytedance.sdk.openadsdk.core.model.C3294uq;
import com.bytedance.sdk.openadsdk.p252ri.p258ri.InterfaceC3514lr;
import com.bytedance.sdk.openadsdk.utils.C3583qd;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.ka.fi */
/* JADX INFO: loaded from: classes3.dex */
public class C3254fi {

    /* JADX INFO: renamed from: di */
    private final C3253di.lr f10950di;

    /* JADX INFO: renamed from: lr */
    private C3253di f10954lr;

    /* JADX INFO: renamed from: mj */
    private final C3253di.ri f10955mj;

    /* JADX INFO: renamed from: ri */
    private C3294uq f10956ri;
    private final View.OnAttachStateChangeListener xha;

    /* JADX INFO: renamed from: ik */
    private List<C3263ri> f10952ik = new ArrayList();

    /* JADX INFO: renamed from: ka */
    private final String f10953ka = "BannerSwiperManager";

    /* JADX INFO: renamed from: fi */
    private int f10951fi = -1;

    public C3254fi(C3294uq c3294uq, Context context, int i, int i2) {
        C3253di.lr lrVar = new C3253di.lr() { // from class: com.bytedance.sdk.openadsdk.core.ka.fi.1
            @Override // com.bytedance.sdk.openadsdk.core.p221ka.C3253di.lr
            /* JADX INFO: renamed from: ri */
            public void mo13775ri(boolean z) {
                try {
                    if (z) {
                        C3254fi.this.m13784ka();
                    } else {
                        C3254fi.this.m13780ik();
                    }
                } catch (Throwable unused) {
                }
            }
        };
        this.f10950di = lrVar;
        View.OnAttachStateChangeListener onAttachStateChangeListener = new View.OnAttachStateChangeListener() { // from class: com.bytedance.sdk.openadsdk.core.ka.fi.2
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                C3254fi.this.m13779fi();
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                if (C3254fi.this.f10952ik != null && !C3254fi.this.f10952ik.isEmpty()) {
                    for (int i3 = 0; i3 < C3254fi.this.f10952ik.size(); i3++) {
                        ((C3263ri) C3254fi.this.f10952ik.get(i3)).m13868di();
                    }
                }
                C3254fi.this.f10951fi = -1;
                if (C3254fi.this.f10954lr != null) {
                    C3254fi.this.f10954lr.m7504ka();
                }
            }
        };
        this.xha = onAttachStateChangeListener;
        C3253di.ri riVar = new C3253di.ri() { // from class: com.bytedance.sdk.openadsdk.core.ka.fi.3
            @Override // com.bytedance.sdk.openadsdk.core.p221ka.C3253di.ri
            /* JADX INFO: renamed from: ri */
            public void mo13776ri(boolean z) {
                if (z) {
                    C3254fi.this.m13784ka();
                } else {
                    C3254fi.this.m13780ik();
                }
            }
        };
        this.f10955mj = riVar;
        this.f10956ri = c3294uq;
        C3253di c3253di = new C3253di(context);
        this.f10954lr = c3253di;
        c3253di.addOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f10954lr.setSwiperWindowFocusChangedListener(lrVar);
        this.f10954lr.setSwiperVisibleChangeListener(riVar);
        m13794ri(context, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: fi */
    public void m13779fi() {
        if (this.f10956ri == null) {
            this.f10956ri = new C3294uq();
        }
        this.f10954lr.m7513ri(TextUtils.equals(this.f10956ri.m14327ri(), "vertical") ? 1 : 0).m7515ri("dot").m7499ik(false).m7503ka(this.f10956ri.m14323ka() == 1).m7516ri(this.f10956ri.m14324lr() == 1).m7497ik(this.f10956ri.jbs()).m7494fi(this.f10956ri.m14326qt() == 1).m7502ka(this.f10956ri.m14325mj()).m7509lr(this.f10956ri.m14322ik() == 1).m7510mj(this.f10956ri.m14321fi()).jbs(this.f10956ri.m14320di()).xha(this.f10956ri.xha());
        this.f10954lr.setOnPageChangeListener(new InterfaceC2249ik() { // from class: com.bytedance.sdk.openadsdk.core.ka.fi.4
            @Override // com.bytedance.adsdk.ugeno.p090di.InterfaceC2249ik
            /* JADX INFO: renamed from: ri */
            public void mo7471ri(boolean z, int i) {
                if (i == 1 || i == 2) {
                    C3254fi.this.m13791lr(-1);
                } else if (i == 0) {
                    C3254fi c3254fi = C3254fi.this;
                    c3254fi.m13793ri(c3254fi.f10951fi);
                }
            }

            @Override // com.bytedance.adsdk.ugeno.p090di.InterfaceC2249ik
            /* JADX INFO: renamed from: ri */
            public void mo7472ri(boolean z, int i, float f, int i2) {
            }

            @Override // com.bytedance.adsdk.ugeno.p090di.InterfaceC2249ik
            /* JADX INFO: renamed from: ri */
            public void mo7473ri(boolean z, int i, int i2, boolean z2, boolean z3) {
                C3254fi.this.m13781ik(i);
                C3254fi.this.f10951fi = i;
                C3254fi.this.m13793ri(i);
                C3254fi.this.m13791lr(i);
            }
        });
        m13787lr(this.f10952ik);
        this.f10954lr.m7500ik();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ik */
    public void m13780ik() {
        C3253di c3253di;
        C3294uq c3294uq = this.f10956ri;
        if (c3294uq != null && c3294uq.m14324lr() == 1 && (c3253di = this.f10954lr) != null) {
            c3253di.m7491di();
        }
        if (this.f10951fi >= 0) {
            m13791lr(-1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ik */
    public void m13781ik(int i) {
        C3263ri c3263ri;
        try {
            int i2 = this.f10951fi;
            if (i2 != -1 && i2 != i && (c3263ri = this.f10952ik.get(i2)) != null) {
                c3263ri.m13871ka();
                c3263ri.m13873mj();
            }
            C3263ri c3263ri2 = this.f10952ik.get(i);
            if (c3263ri2 != null) {
                c3263ri2.m13869fi();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ka */
    public void m13784ka() {
        C3253di c3253di;
        C3294uq c3294uq = this.f10956ri;
        if (c3294uq != null && c3294uq.m14324lr() == 1 && (c3253di = this.f10954lr) != null) {
            c3253di.m7495fi();
        }
        int i = this.f10951fi;
        if (i >= 0) {
            m13793ri(i);
            m13791lr(this.f10951fi);
        }
    }

    /* JADX INFO: renamed from: lr */
    private void m13787lr(List<C3263ri> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            this.f10954lr.m7514ri(list.get(i).m13874ri());
        }
    }

    /* JADX INFO: renamed from: lr */
    public View m13790lr() {
        return this.f10954lr;
    }

    /* JADX INFO: renamed from: lr */
    public void m13791lr(int i) {
        C3263ri c3263ri;
        for (int i2 = 0; i2 < this.f10952ik.size(); i2++) {
            try {
                if (i2 != i && (c3263ri = this.f10952ik.get(i2)) != null) {
                    c3263ri.jbs();
                }
            } catch (Throwable th) {
                th.getMessage();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m13792ri() {
        if (this.f10954lr != null) {
            try {
                List<C3263ri> list = this.f10952ik;
                if (list != null && !list.isEmpty()) {
                    for (int i = 0; i < this.f10952ik.size(); i++) {
                        this.f10952ik.get(i).xha();
                    }
                }
                this.f10951fi = -1;
                this.f10954lr.m7504ka();
                this.f10954lr.setSwiperWindowFocusChangedListener(null);
                this.f10954lr.setSwiperVisibleChangeListener(null);
                this.f10954lr.removeOnAttachStateChangeListener(this.xha);
                this.f10954lr = null;
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m13793ri(final int i) {
        C3263ri c3263ri;
        try {
            final int size = this.f10952ik.size();
            if (i < size && (c3263ri = this.f10952ik.get(i)) != null) {
                c3263ri.m13878ri(new InterfaceC3514lr() { // from class: com.bytedance.sdk.openadsdk.core.ka.fi.5
                    @Override // com.bytedance.sdk.openadsdk.p252ri.p258ri.InterfaceC3514lr
                    /* JADX INFO: renamed from: ri */
                    public void mo13796ri() {
                        int i2 = i + 1;
                        if (i2 >= size) {
                            return;
                        }
                        C3254fi.this.m13793ri(i2);
                    }
                });
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    /* JADX INFO: renamed from: ri */
    protected void m13794ri(Context context, float f, float f2) {
        int iM16589lr = C3583qd.m16589lr(context, f);
        int iM16589lr2 = C3583qd.m16589lr(context, f2);
        ViewGroup.LayoutParams layoutParams = this.f10954lr.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(iM16589lr, iM16589lr2);
        }
        layoutParams.width = iM16589lr;
        layoutParams.height = iM16589lr2;
        this.f10954lr.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: ri */
    public void m13795ri(List<C3263ri> list) {
        this.f10952ik = list;
    }
}
