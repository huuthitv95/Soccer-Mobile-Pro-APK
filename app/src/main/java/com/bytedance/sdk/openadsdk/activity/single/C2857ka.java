package com.bytedance.sdk.openadsdk.activity.single;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p060fi.AbstractC1993lr;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p061ik.C1996ik;
import com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.component.utils.C2722lr;
import com.bytedance.sdk.component.utils.C2729uq;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.component.reward.p188ri.C3023sf;
import com.bytedance.sdk.openadsdk.component.reward.top.C3060ik;
import com.bytedance.sdk.openadsdk.component.reward.top.InterfaceC3061lr;
import com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2;
import com.bytedance.sdk.openadsdk.component.reward.view.C3071lr;
import com.bytedance.sdk.openadsdk.component.reward.view.C3072mj;
import com.bytedance.sdk.openadsdk.component.reward.view.C3074ri;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.C3331uq;
import com.bytedance.sdk.openadsdk.core.C3332vr;
import com.bytedance.sdk.openadsdk.core.bgr.p195fi.C3113ri;
import com.bytedance.sdk.openadsdk.core.bgr.p199ri.C3126lr;
import com.bytedance.sdk.openadsdk.core.jbs.p220ri.C3239lr;
import com.bytedance.sdk.openadsdk.core.model.C3279dw;
import com.bytedance.sdk.openadsdk.core.model.C3281fr;
import com.bytedance.sdk.openadsdk.core.model.C3282ik;
import com.bytedance.sdk.openadsdk.core.model.C3283ka;
import com.bytedance.sdk.openadsdk.core.model.C3287oh;
import com.bytedance.sdk.openadsdk.core.model.C3289ri;
import com.bytedance.sdk.openadsdk.core.model.C3293su;
import com.bytedance.sdk.openadsdk.core.model.igq;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.p190aw.C3097ka;
import com.bytedance.sdk.openadsdk.core.p200co.jbs.C3154ri;
import com.bytedance.sdk.openadsdk.core.p200co.xha.InterfaceC3186ka;
import com.bytedance.sdk.openadsdk.core.p217di.C3192ik;
import com.bytedance.sdk.openadsdk.core.p217di.C3195mj;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.p236ka.C3414ik;
import com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri;
import com.bytedance.sdk.openadsdk.utils.C3583qd;
import com.bytedance.sdk.openadsdk.utils.dzy;
import com.bytedance.sdk.openadsdk.wjv.C3606fi;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.activity.single.ka */
/* JADX INFO: loaded from: classes3.dex */
public class C2857ka extends AbstractC2854ik implements Handler.Callback {
    private boolean aac;

    /* JADX INFO: renamed from: ac */
    private final boolean f8315ac;

    /* JADX INFO: renamed from: aw */
    private final AtomicBoolean f8316aw;

    /* JADX INFO: renamed from: ay */
    private boolean f8317ay;
    private final HashSet<String> bgr;
    private long bnj;

    /* JADX INFO: renamed from: bu */
    private final HashSet<Integer> f8318bu;

    /* JADX INFO: renamed from: co */
    private final boolean f8319co;

    /* JADX INFO: renamed from: di */
    private final RecyclerView f8320di;

    /* JADX INFO: renamed from: dw */
    private boolean f8321dw;
    private int dzy;

    /* JADX INFO: renamed from: fe */
    private JSONObject f8322fe;
    private FrameLayout feb;

    /* JADX INFO: renamed from: fr */
    private int f8323fr;
    private boolean gcp;
    private AbstractC2859mj hcw;

    /* JADX INFO: renamed from: ig */
    private boolean f8324ig;
    private int igq;
    private boolean ihz;
    private final TopLayoutDislike2 jbs;

    /* JADX INFO: renamed from: jc */
    private JSONObject f8325jc;

    /* JADX INFO: renamed from: kt */
    private boolean f8326kt;

    /* JADX INFO: renamed from: mj */
    private final LinearLayoutManager f8327mj;

    /* JADX INFO: renamed from: nd */
    private boolean f8328nd;

    /* JADX INFO: renamed from: nr */
    private final PAGLogoView f8329nr;

    /* JADX INFO: renamed from: oh */
    private C2858lr.fi f8330oh;
    private int ory;

    /* JADX INFO: renamed from: pv */
    private C2853fi f8331pv;

    /* JADX INFO: renamed from: qd */
    private C3281fr.ri f8332qd;

    /* JADX INFO: renamed from: qh */
    private di f8333qh;

    /* JADX INFO: renamed from: qt */
    private final Handler f8334qt;
    private Message rzk;

    /* JADX INFO: renamed from: sf */
    private final FrameLayout f8335sf;
    private boolean siy;
    private final boolean slm;
    private int srn;

    /* JADX INFO: renamed from: su */
    private boolean f8336su;

    /* JADX INFO: renamed from: ta */
    private long f8337ta;
    private final ArrayList<Message> tan;
    private JSONObject tnn;

    /* JADX INFO: renamed from: tw */
    private View f8338tw;

    /* JADX INFO: renamed from: uq */
    private int f8339uq;

    /* JADX INFO: renamed from: vr */
    private final boolean f8340vr;
    private boolean whw;
    private int wjv;

    /* JADX INFO: renamed from: xd */
    private int f8341xd;
    private final ri xha;

    /* JADX INFO: renamed from: xm */
    private boolean f8342xm;

    /* JADX INFO: renamed from: zb */
    private long f8343zb;

    /* JADX INFO: renamed from: zf */
    private boolean f8344zf;
    private boolean zyn;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.activity.single.ka$di */
    public static abstract class di implements Runnable {

        /* JADX INFO: renamed from: fi */
        private long f8382fi;

        /* JADX INFO: renamed from: ik */
        private long f8383ik;

        /* JADX INFO: renamed from: ka */
        private long f8384ka;

        /* JADX INFO: renamed from: lr */
        private final long f8385lr;

        /* JADX INFO: renamed from: ri */
        private final Handler f8386ri = new Handler(Looper.getMainLooper());

        public di(long j) {
            this.f8385lr = j;
        }

        /* JADX INFO: renamed from: di */
        public long m10895di() {
            long jElapsedRealtime;
            long j;
            if (this.f8383ik > this.f8382fi) {
                jElapsedRealtime = this.f8385lr - (SystemClock.elapsedRealtime() - this.f8383ik);
                j = this.f8384ka;
            } else {
                jElapsedRealtime = this.f8385lr;
                j = this.f8384ka;
            }
            long j2 = jElapsedRealtime - j;
            if (j2 < 0) {
                return 0L;
            }
            return j2;
        }

        /* JADX INFO: renamed from: fi */
        public void m10896fi() {
            this.f8386ri.postDelayed(this, this.f8385lr);
            this.f8383ik = SystemClock.elapsedRealtime();
        }

        /* JADX INFO: renamed from: ik */
        public void m10897ik() {
            long j = this.f8385lr - this.f8384ka;
            if (j < 0) {
                return;
            }
            this.f8386ri.removeCallbacks(this);
            this.f8386ri.postDelayed(this, j);
            this.f8383ik = SystemClock.elapsedRealtime();
        }

        /* JADX INFO: renamed from: ka */
        public void m10898ka() {
            this.f8386ri.removeCallbacks(this);
        }

        /* JADX INFO: renamed from: lr */
        public void m10899lr() {
            this.f8386ri.removeCallbacks(this);
            if (this.f8382fi > this.f8383ik) {
                return;
            }
            this.f8384ka += SystemClock.elapsedRealtime() - this.f8383ik;
            this.f8382fi = SystemClock.elapsedRealtime();
        }

        /* JADX INFO: renamed from: ri */
        public abstract void mo10892ri();

        @Override // java.lang.Runnable
        public void run() {
            mo10892ri();
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.activity.single.ka$fi */
    private static abstract class fi extends RecyclerView.ViewHolder {
        public fi(View view) {
            super(view);
        }

        /* JADX INFO: renamed from: ri */
        public abstract void mo10900ri(C2857ka c2857ka, ka kaVar, int i);
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.activity.single.ka$ik */
    private static class ik extends fi {

        /* JADX INFO: renamed from: ri */
        private final TextView f8387ri;

        public ik(View view) {
            super(view);
            C3195mj c3195mj = new C3195mj(view.getContext());
            this.f8387ri = c3195mj;
            c3195mj.setTextColor(Color.parseColor("#99FFFFFF"));
            c3195mj.setTextSize(14.0f);
            c3195mj.setGravity(17);
            c3195mj.setPadding(0, 24, 0, 24);
            ((FrameLayout) view).addView(c3195mj, new FrameLayout.LayoutParams(-1, -2));
        }

        @Override // com.bytedance.sdk.openadsdk.activity.single.C2857ka.fi
        /* JADX INFO: renamed from: ri */
        public void mo10900ri(C2857ka c2857ka, ka kaVar, int i) {
            this.f8387ri.setText(kaVar.f8388ik);
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.activity.single.ka$ka */
    private static class ka {

        /* JADX INFO: renamed from: ik */
        public String f8388ik;

        /* JADX INFO: renamed from: lr */
        public wjv f8389lr;

        /* JADX INFO: renamed from: ri */
        public int f8390ri = 0;

        public ka(wjv wjvVar) {
            this.f8389lr = wjvVar;
        }

        public ka(String str) {
            this.f8388ik = str;
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.activity.single.ka$lr */
    private static class lr extends fi {

        /* JADX INFO: renamed from: ik */
        private AbstractC2860ri f8391ik;

        /* JADX INFO: renamed from: lr */
        private final C3071lr f8392lr;

        /* JADX INFO: renamed from: ri */
        private final ri f8393ri;

        public lr(ri riVar, View view) {
            super(view);
            this.f8393ri = riVar;
            this.f8392lr = (C3071lr) view;
        }

        /* JADX INFO: renamed from: ri */
        private boolean m10902ri(AbstractC2859mj abstractC2859mj, wjv wjvVar) {
            C3287oh c3287ohM14575zv;
            if (abstractC2859mj.hcw() && (c3287ohM14575zv = abstractC2859mj.f8468di.m14575zv()) != null) {
                C3287oh c3287ohM14575zv2 = wjvVar.m14575zv();
                if (TextUtils.equals(c3287ohM14575zv.m14230ri(), c3287ohM14575zv2.m14230ri()) && TextUtils.equals(c3287ohM14575zv.m14229lr(), c3287ohM14575zv2.m14229lr()) && abstractC2859mj.mo11015oh()) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: ri */
        public AbstractC2859mj m10903ri() {
            return this.f8391ik;
        }

        @Override // com.bytedance.sdk.openadsdk.activity.single.C2857ka.fi
        /* JADX INFO: renamed from: ri */
        public void mo10900ri(C2857ka c2857ka, ka kaVar, int i) {
            int bindingAdapterPosition = getBindingAdapterPosition();
            Activity activity = c2857ka.f8301ri;
            if (C2722lr.m10243ri(activity)) {
                return;
            }
            wjv wjvVar = kaVar.f8389lr;
            AbstractC2860ri abstractC2860ri = this.f8391ik;
            if (abstractC2860ri != null) {
                if (m10902ri(abstractC2860ri, wjvVar)) {
                    this.f8391ik.mo11018ri(wjvVar, bindingAdapterPosition, i);
                } else {
                    this.f8393ri.m10917ri(this, false);
                }
            }
            C2858lr c2858lr = c2857ka.f8299ka;
            if (this.f8391ik == null) {
                this.f8391ik = wjvVar.m14472qa() ? new xha(c2858lr, wjvVar, bindingAdapterPosition, i, false) : new C2852di(c2858lr, wjvVar, bindingAdapterPosition, i, false);
            }
            C2858lr.fi fiVar = new C2858lr.fi(1, null);
            fiVar.f8430ka = c2857ka.f8321dw;
            this.f8391ik.m11012lr(activity, fiVar);
            this.f8393ri.m10918ri(this.f8391ik);
            C3072mj c3072mjMo10791ri = this.f8391ik.mo10791ri();
            if (c3072mjMo10791ri == null) {
                return;
            }
            ViewParent parent = c3072mjMo10791ri.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(c3072mjMo10791ri);
            }
            if (!c2857ka.f8340vr) {
                float fM14433kl = wjvVar.m14433kl();
                if (fM14433kl > 0.0f) {
                    this.f8392lr.setWidthAndHeightRatio(fM14433kl);
                } else {
                    this.f8392lr.setWidthOrHeightInParentRatio(0.8f);
                }
            }
            this.f8392lr.m12293ri(c3072mjMo10791ri, new FrameLayout.LayoutParams(-1, -1));
            this.f8392lr.setScene(this.f8391ik);
        }

        /* JADX INFO: renamed from: ri */
        public void m10904ri(boolean z) {
            AbstractC2860ri abstractC2860ri = this.f8391ik;
            if (abstractC2860ri == null) {
                return;
            }
            abstractC2860ri.m11001di(z);
            this.f8391ik.tan();
            if (!z) {
                this.f8391ik = null;
            }
            this.f8392lr.m12292ri();
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.activity.single.ka$ri */
    private static class ri extends RecyclerView.Adapter<fi> {

        /* JADX INFO: renamed from: fi */
        private boolean f8394fi;

        /* JADX INFO: renamed from: ik */
        private final C2857ka f8395ik;

        /* JADX INFO: renamed from: ka */
        private boolean f8396ka;

        /* JADX INFO: renamed from: ri */
        private final ArrayList<ka> f8398ri = new ArrayList<>();

        /* JADX INFO: renamed from: lr */
        private final ArrayList<AbstractC2859mj> f8397lr = new ArrayList<>();

        public ri(C2857ka c2857ka, List<wjv> list) {
            this.f8395ik = c2857ka;
            for (int i = 0; i < list.size(); i++) {
                wjv wjvVar = list.get(i);
                if (wjvVar != null && c2857ka != null) {
                    wjvVar.m14413ig(c2857ka.f8297fi);
                }
                this.f8398ri.add(new ka(wjvVar));
            }
        }

        /* JADX INFO: renamed from: lr */
        private boolean m10905lr(AbstractC2859mj abstractC2859mj) {
            return abstractC2859mj != null && abstractC2859mj.hcw();
        }

        /* JADX INFO: renamed from: fi */
        public List<wjv> m10906fi() {
            ArrayList arrayList = new ArrayList();
            for (ka kaVar : this.f8398ri) {
                if (kaVar.f8390ri == 0) {
                    arrayList.add(kaVar.f8389lr);
                }
            }
            return arrayList;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            if (this.f8394fi) {
                return Integer.MAX_VALUE;
            }
            return this.f8398ri.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            ka kaVar = this.f8398ri.get(i % this.f8398ri.size());
            if (kaVar.f8390ri != 0) {
                return -1;
            }
            C3287oh c3287ohM14575zv = kaVar.f8389lr.m14575zv();
            if (c3287ohM14575zv == null) {
                return 1;
            }
            return (c3287ohM14575zv.m14230ri() + c3287ohM14575zv.m14229lr()).hashCode();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: ik, reason: merged with bridge method [inline-methods] */
        public void onViewRecycled(fi fiVar) {
            super.onViewRecycled(fiVar);
            if (fiVar instanceof lr) {
                lr lrVar = (lr) fiVar;
                AbstractC2860ri abstractC2860ri = lrVar.f8391ik;
                if (!this.f8395ik.f8315ac) {
                    m10917ri(lrVar, false);
                    return;
                }
                boolean zM10905lr = m10905lr(abstractC2860ri);
                if (abstractC2860ri != null) {
                    m10917ri(lrVar, zM10905lr);
                }
            }
        }

        /* JADX INFO: renamed from: ik */
        public boolean m10908ik() {
            return this.f8394fi;
        }

        /* JADX INFO: renamed from: ka */
        public int m10909ka() {
            return this.f8396ka ? this.f8398ri.size() - 1 : this.f8398ri.size();
        }

        /* JADX INFO: renamed from: lr */
        public ArrayList<AbstractC2859mj> m10910lr() {
            return this.f8397lr;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: lr, reason: merged with bridge method [inline-methods] */
        public void onViewDetachedFromWindow(fi fiVar) {
            AbstractC2860ri abstractC2860ri;
            super.onViewDetachedFromWindow(fiVar);
            if (!(fiVar instanceof lr) || (abstractC2860ri = ((lr) fiVar).f8391ik) == null) {
                return;
            }
            abstractC2860ri.mo10787ay().ihz.tnn();
        }

        /* JADX INFO: renamed from: ri */
        public int m10912ri() {
            int itemCount = getItemCount();
            return this.f8396ka ? itemCount - 1 : itemCount;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
        public fi onCreateViewHolder(ViewGroup viewGroup, int i) {
            if (i == -1) {
                C3192ik c3192ik = new C3192ik(viewGroup.getContext());
                c3192ik.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                return new ik(c3192ik);
            }
            C3071lr c3071lr = new C3071lr(viewGroup.getContext(), this.f8395ik.slm, this.f8395ik.f8340vr, C3583qd.m16589lr(viewGroup.getContext(), 10.0f));
            c3071lr.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            return new lr(this, c3071lr);
        }

        /* JADX INFO: renamed from: ri */
        public void m10914ri(int i, int i2) {
            if (this.f8394fi) {
                return;
            }
            this.f8394fi = true;
            if (i < 0) {
                i = 0;
            }
            int size = this.f8398ri.size();
            notifyItemRangeInserted(size, (Integer.MAX_VALUE - i2) - (size - i));
            notifyItemRangeInserted(0, i2 - i);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
        public void onViewAttachedToWindow(fi fiVar) {
            super.onViewAttachedToWindow(fiVar);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(fi fiVar, int i) {
            if (i >= this.f8398ri.size()) {
                i %= this.f8398ri.size();
            }
            fiVar.mo10900ri(this.f8395ik, this.f8398ri.get(i), i);
        }

        /* JADX INFO: renamed from: ri */
        public void m10917ri(lr lrVar, boolean z) {
            if (lrVar.f8391ik == null) {
                return;
            }
            this.f8397lr.remove(lrVar.f8391ik);
            lrVar.m10904ri(z);
        }

        /* JADX INFO: renamed from: ri */
        public void m10918ri(AbstractC2859mj abstractC2859mj) {
            this.f8397lr.add(abstractC2859mj);
        }

        /* JADX INFO: renamed from: ri */
        public void m10919ri(String str) {
            int size = this.f8398ri.size();
            ka kaVar = size > 0 ? this.f8398ri.get(size - 1) : null;
            boolean zIsEmpty = TextUtils.isEmpty(str);
            if (kaVar == null || kaVar.f8390ri != 1) {
                if (zIsEmpty) {
                    return;
                }
                this.f8398ri.add(new ka(str));
                notifyItemInserted(size);
                this.f8396ka = true;
                return;
            }
            if (!zIsEmpty) {
                kaVar.f8388ik = str;
                notifyItemChanged(size - 1);
            } else {
                this.f8398ri.remove(kaVar);
                notifyItemRemoved(size - 1);
                this.f8396ka = false;
            }
        }

        /* JADX INFO: renamed from: ri */
        public void m10920ri(List<wjv> list) {
            C2857ka c2857ka;
            int size = this.f8398ri.size();
            if (this.f8396ka) {
                size--;
            }
            for (int i = 0; i < list.size(); i++) {
                wjv wjvVar = list.get(i);
                if (wjvVar != null && (c2857ka = this.f8395ik) != null) {
                    wjvVar.m14413ig(c2857ka.f8297fi);
                }
                this.f8398ri.add(size + i, new ka(wjvVar));
                wjvVar.m14574zp();
            }
            notifyItemRangeInserted(size, list.size());
        }
    }

    public C2857ka(final Activity activity, final wjv wjvVar, final C2858lr c2858lr) {
        C3281fr c3281frM14258qt;
        super(activity, wjvVar, c2858lr);
        this.f8334qt = new Handler(Looper.getMainLooper(), this);
        boolean z = false;
        this.f8316aw = new AtomicBoolean(false);
        this.bgr = new HashSet<>();
        this.f8318bu = new HashSet<>();
        this.tan = new ArrayList<>();
        this.f8339uq = 5;
        this.wjv = 3;
        this.ory = -1;
        int i = 1;
        this.f8330oh = new C2858lr.fi(1, null);
        boolean z2 = wjvVar.m14453nd() == 44;
        this.f8340vr = z2;
        boolean zM14472qa = wjvVar.m14472qa();
        this.f8319co = zM14472qa;
        this.slm = C3023sf.m12016ri(activity, wjvVar) == 1;
        C3192ik c3192ik = new C3192ik(activity) { // from class: com.bytedance.sdk.openadsdk.activity.single.ka.1
            @Override // android.view.ViewGroup, android.view.View
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                C2857ka.this.tnn = null;
                try {
                    return super.dispatchTouchEvent(motionEvent);
                } catch (Exception unused) {
                    return false;
                }
            }
        };
        this.f8335sf = c3192ik;
        if (Build.VERSION.SDK_INT >= 35) {
            c3192ik.setFitsSystemWindows(true);
        }
        activity.setContentView(c3192ik);
        this.f8297fi = String.valueOf(activity.hashCode());
        C3289ri c3289riM14428ka = wjvVar.m14428ka();
        if (c3289riM14428ka != null && (c3281frM14258qt = c3289riM14428ka.m14258qt()) != null) {
            this.f8324ig = c3281frM14258qt.m14134vr();
            this.f8332qd = c3281frM14258qt.m14125di();
            int iMax = Math.max(0, c3281frM14258qt.jbs());
            this.f8341xd = iMax;
            this.dzy = iMax;
            this.f8344zf = c3281frM14258qt.bgr();
            this.f8336su = c3281frM14258qt.m14133sf();
            this.f8323fr = c3281frM14258qt.m14130mj();
            this.f8325jc = c3281frM14258qt.m14124co();
            this.f8317ay = c3281frM14258qt.m14131qt();
            this.ihz = c3281frM14258qt.m14132ri();
            this.f8326kt = this.f8323fr > 0;
            this.f8339uq = c3281frM14258qt.m14128ka();
            this.wjv = c3281frM14258qt.m14126fi();
            this.tnn = c3281frM14258qt.m14129lr();
            this.f8322fe = c3281frM14258qt.m14127ik();
            if (!this.f8336su) {
                this.f8324ig = false;
            }
        }
        if (zM14472qa) {
            int iM14572zk = wjvVar.m14572zk();
            this.igq = (int) ((1.0f - (Math.max(0, Math.min(100, iM14572zk < 0 ? C3299nr.m14639ka().m14883su(String.valueOf(wjvVar.m14545ur())).f11586di : iM14572zk)) / 100.0f)) * this.f8341xd);
        }
        RecyclerView recyclerView = new RecyclerView(activity);
        this.f8320di = recyclerView;
        C3281fr.ri riVar = this.f8332qd;
        if (riVar != null) {
            int iM14143ik = riVar.m14143ik();
            int iM14144ka = this.f8332qd.m14144ka();
            if (iM14143ik > 0 || iM14144ka > 0) {
                recyclerView.setPadding(C3583qd.m16589lr(activity, iM14143ik), 0, C3583qd.m16589lr(activity, iM14144ka), 0);
            }
            int iM14145lr = this.f8332qd.m14145lr();
            int iM14146ri = this.f8332qd.m14146ri();
            int iM14142fi = this.f8332qd.m14142fi();
            if (iM14145lr > 0 || iM14142fi > 0 || iM14146ri > 0) {
                final int iM16589lr = C3583qd.m16589lr(activity, iM14145lr);
                final int iM16589lr2 = C3583qd.m16589lr(activity, iM14146ri);
                final int iM16589lr3 = C3583qd.m16589lr(activity, iM14142fi);
                recyclerView.addItemDecoration(new RecyclerView.ItemDecoration() { // from class: com.bytedance.sdk.openadsdk.activity.single.ka.11
                    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
                    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView2, RecyclerView.State state) {
                        int childAdapterPosition = recyclerView2.getChildAdapterPosition(view);
                        int itemCount = recyclerView2.getAdapter().getItemCount();
                        if (childAdapterPosition == 0) {
                            rect.top = iM16589lr;
                        } else {
                            rect.top = iM16589lr3 / 2;
                        }
                        if (childAdapterPosition == itemCount - 1) {
                            rect.bottom = iM16589lr2;
                        } else {
                            rect.bottom = iM16589lr3 / 2;
                        }
                    }
                });
            }
        }
        c3192ik.addView(recyclerView, new FrameLayout.LayoutParams(-1, -1));
        TopLayoutDislike2 topLayoutDislike2 = new TopLayoutDislike2(activity);
        this.jbs = topLayoutDislike2;
        c3192ik.addView(topLayoutDislike2, new FrameLayout.LayoutParams(-1, -2));
        topLayoutDislike2.load(wjvVar);
        topLayoutDislike2.setShowDislike(true);
        topLayoutDislike2.setShowSound(true);
        boolean zM14834bu = C3299nr.m14639ka().m14834bu(String.valueOf(wjvVar.m14545ur()));
        this.f8321dw = zM14834bu;
        topLayoutDislike2.setSoundMute(zM14834bu);
        topLayoutDislike2.setListener(new InterfaceC3061lr() { // from class: com.bytedance.sdk.openadsdk.activity.single.ka.12
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.InterfaceC3061lr
            /* JADX INFO: renamed from: ik */
            public void mo10616ik(View view) {
                c2858lr.xha();
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.InterfaceC3061lr
            /* JADX INFO: renamed from: ka */
            public void mo10617ka(View view) {
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.InterfaceC3061lr
            /* JADX INFO: renamed from: lr */
            public void mo10618lr(View view) {
                if (C2857ka.this.hcw != null) {
                    C2857ka.this.hcw.mo10768e_();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.InterfaceC3061lr
            /* JADX INFO: renamed from: ri */
            public void mo10619ri(View view) {
                C3097ka c3097kaM14188ri;
                wjv wjvVar2 = wjvVar;
                C3414ik.m15565ri("skip", wjvVar2, wjvVar2.m14394fi(), (Map<String, Object>) null);
                C3283ka c3283kaM14473qc = wjvVar.m14473qc();
                if (c3283kaM14473qc != null && (c3097kaM14188ri = c3283kaM14473qc.m14188ri()) != null) {
                    c3097kaM14188ri.m12467di(0L);
                    c3097kaM14188ri.m12469fi(0L);
                }
                C2857ka.this.m10850fr();
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.InterfaceC3061lr
            /* JADX INFO: renamed from: ri */
            public void mo10620ri(View view, String str) {
                if (C2857ka.this.hcw != null) {
                    C2857ka.this.hcw.mo10773ri(str);
                    C2857ka c2857ka = C2857ka.this;
                    c2857ka.f8321dw = !c2857ka.f8321dw;
                }
            }
        });
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(activity, i, z) { // from class: com.bytedance.sdk.openadsdk.activity.single.ka.13
            @Override // androidx.recyclerview.widget.LinearLayoutManager
            protected void calculateExtraLayoutSpace(RecyclerView.State state, int[] iArr) {
                super.calculateExtraLayoutSpace(state, iArr);
                int height = C2857ka.this.f8320di.getHeight();
                iArr[0] = height;
                iArr[1] = height;
            }
        };
        this.f8327mj = linearLayoutManager;
        recyclerView.setLayoutManager(linearLayoutManager);
        ri riVar2 = new ri(this, wjvVar.lsq());
        this.xha = riVar2;
        recyclerView.setAdapter(riVar2);
        if (!this.f8326kt && !this.f8317ay) {
            riVar2.m10919ri(C2729uq.m10311ri(activity, "tt_list_end_tip"));
        }
        if (z2) {
            new PagerSnapHelper().attachToRecyclerView(recyclerView);
        } else if (this.f8336su) {
            new C3074ri().attachToRecyclerView(recyclerView);
        }
        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.ka.14

            /* JADX INFO: renamed from: fi */
            private int f8356fi;

            /* JADX INFO: renamed from: ik */
            private final Rect f8357ik = new Rect();

            /* JADX INFO: renamed from: ka */
            private int f8358ka = -1;

            /* JADX WARN: Code duplicated, block: B:22:0x006d  */
            /* JADX WARN: Code duplicated, block: B:24:0x007b  */
            /* JADX WARN: Code duplicated, block: B:26:0x0083  */
            /* JADX WARN: Code duplicated, block: B:29:0x008e  */
            /* JADX WARN: Code duplicated, block: B:37:0x0090 A[SYNTHETIC] */
            /* JADX INFO: renamed from: ri */
            private void m10889ri() {
                int iM10909ka;
                View viewFindViewByPosition;
                RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
                lr lrVar;
                if (C2857ka.this.ihz && (iM10909ka = C2857ka.this.xha.m10909ka()) != 0) {
                    int iFindFirstVisibleItemPosition = C2857ka.this.f8327mj.findFirstVisibleItemPosition();
                    int iFindLastVisibleItemPosition = C2857ka.this.f8327mj.findLastVisibleItemPosition();
                    if (iFindLastVisibleItemPosition % iM10909ka > this.f8358ka) {
                        for (int i2 = iFindFirstVisibleItemPosition; i2 <= iFindLastVisibleItemPosition; i2++) {
                            int i3 = i2 % iM10909ka;
                            if (i3 > this.f8358ka) {
                                if ((i2 == iFindFirstVisibleItemPosition || i2 == iFindLastVisibleItemPosition) && (viewFindViewByPosition = C2857ka.this.f8327mj.findViewByPosition(i2)) != null) {
                                    this.f8357ik.setEmpty();
                                    viewFindViewByPosition.getGlobalVisibleRect(this.f8357ik);
                                    int height = viewFindViewByPosition.getHeight();
                                    if (height > 0 && (this.f8357ik.height() * 1.0f) / height >= 0.5f) {
                                        viewHolderFindViewHolderForAdapterPosition = C2857ka.this.f8320di.findViewHolderForAdapterPosition(i2);
                                        if (viewHolderFindViewHolderForAdapterPosition instanceof lr) {
                                            lrVar = (lr) viewHolderFindViewHolderForAdapterPosition;
                                            if (lrVar.f8391ik != null) {
                                                lrVar.f8391ik.mo10585zb();
                                            }
                                        }
                                        if (i3 > this.f8358ka) {
                                            this.f8358ka = i3;
                                        }
                                    }
                                } else {
                                    viewHolderFindViewHolderForAdapterPosition = C2857ka.this.f8320di.findViewHolderForAdapterPosition(i2);
                                    if (viewHolderFindViewHolderForAdapterPosition instanceof lr) {
                                        lrVar = (lr) viewHolderFindViewHolderForAdapterPosition;
                                        if (lrVar.f8391ik != null) {
                                            lrVar.f8391ik.mo10585zb();
                                        }
                                    }
                                    if (i3 > this.f8358ka) {
                                        this.f8358ka = i3;
                                    }
                                }
                            }
                        }
                    }
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView2, int i2) {
                super.onScrollStateChanged(recyclerView2, i2);
                if (C2722lr.m10243ri(activity)) {
                    return;
                }
                int iFindFirstCompletelyVisibleItemPosition = C2857ka.this.f8327mj.findFirstCompletelyVisibleItemPosition();
                C2857ka.this.f8327mj.findFirstVisibleItemPosition();
                int iFindLastVisibleItemPosition = C2857ka.this.f8327mj.findLastVisibleItemPosition();
                if (iFindFirstCompletelyVisibleItemPosition < 0) {
                    return;
                }
                if (i2 == 0 && iFindFirstCompletelyVisibleItemPosition != C2857ka.this.ory) {
                    boolean z3 = iFindFirstCompletelyVisibleItemPosition == C2857ka.this.srn;
                    C2857ka c2857ka = C2857ka.this;
                    c2857ka.m10872ri(iFindFirstCompletelyVisibleItemPosition, c2857ka.f8324ig && z3);
                    if (C2857ka.this.f8324ig && !z3 && C2857ka.this.f8344zf) {
                        C2857ka.this.f8324ig = false;
                    }
                    if (C2857ka.this.f8333qh != null) {
                        C2857ka.this.f8333qh.m10898ka();
                        C2857ka.this.f8333qh = null;
                    }
                }
                if (i2 == 0) {
                    C2857ka.this.srn = -1;
                }
                if (!C2857ka.this.f8326kt || C2857ka.this.f8323fr <= 0 || iFindLastVisibleItemPosition < C2857ka.this.xha.m10912ri() - C2857ka.this.f8323fr) {
                    return;
                }
                C2857ka.this.m10884uq();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView2, int i2, int i3) {
                super.onScrolled(recyclerView2, i2, i3);
                if (i3 == 0 || C2722lr.m10243ri(activity)) {
                    return;
                }
                m10889ri();
                int iFindLastVisibleItemPosition = C2857ka.this.f8327mj.findLastVisibleItemPosition();
                if (i3 > 0 && C2857ka.this.f8326kt && C2857ka.this.f8323fr > 0 && iFindLastVisibleItemPosition >= C2857ka.this.xha.m10912ri() - C2857ka.this.f8323fr) {
                    C2857ka.this.m10884uq();
                }
                if (this.f8356fi != iFindLastVisibleItemPosition) {
                    this.f8356fi = iFindLastVisibleItemPosition;
                    if (!C2857ka.this.f8318bu.isEmpty() && C2857ka.this.f8318bu.contains(Integer.valueOf(iFindLastVisibleItemPosition))) {
                        C2857ka.this.f8318bu.remove(Integer.valueOf(iFindLastVisibleItemPosition));
                        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = recyclerView2.findViewHolderForAdapterPosition(iFindLastVisibleItemPosition);
                        if (viewHolderFindViewHolderForAdapterPosition instanceof lr) {
                            lr lrVar = (lr) viewHolderFindViewHolderForAdapterPosition;
                            lrVar.f8391ik.m11003fi(true);
                            lrVar.f8391ik.igq();
                            return;
                        }
                        return;
                    }
                    if (C2857ka.this.whw) {
                        C2857ka.this.whw = false;
                        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition2 = recyclerView2.findViewHolderForAdapterPosition(iFindLastVisibleItemPosition);
                        if (viewHolderFindViewHolderForAdapterPosition2 instanceof lr) {
                            lr lrVar2 = (lr) viewHolderFindViewHolderForAdapterPosition2;
                            if (lrVar2.f8391ik instanceof AbstractC2860ri) {
                                lrVar2.f8391ik.m11003fi(true);
                                lrVar2.f8391ik.m11048su();
                            }
                        }
                    }
                }
            }
        });
        hcw();
        final int iIhz = ihz();
        recyclerView.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.ka.15
            @Override // java.lang.Runnable
            public void run() {
                if (C2722lr.m10243ri(activity)) {
                    return;
                }
                C2857ka.this.m10872ri(iIhz, true);
            }
        });
        PAGLogoView pAGLogoViewCreatePAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(activity, wjvVar);
        this.f8329nr = pAGLogoViewCreatePAGLogoViewByMaterial;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 83;
        layoutParams.leftMargin = C3583qd.m16589lr(activity, 16.0f);
        c3192ik.addView(pAGLogoViewCreatePAGLogoViewByMaterial, layoutParams);
        pAGLogoViewCreatePAGLogoViewByMaterial.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.ka.16
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Context context = view.getContext();
                wjv wjvVar2 = wjvVar;
                TTWebsiteActivity.m10758ri(context, wjvVar2, wjvVar2.m14394fi());
            }
        });
        this.f8315ac = C3606fi.m16703ri("draw_feed_item_reuse", 0) == 1;
    }

    /* JADX INFO: renamed from: ay */
    private void m10843ay() {
        dzy.m16411ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.ka.4
            @Override // java.lang.Runnable
            public void run() {
                if (C2722lr.m10243ri(C2857ka.this.f8301ri)) {
                    return;
                }
                C2857ka.this.f8316aw.set(false);
                if (!C2857ka.this.f8317ay) {
                    C2857ka.this.xha.m10919ri(C2729uq.m10311ri(C3299nr.m14642ri(), "tt_list_end_tip"));
                } else {
                    C2857ka.this.xha.m10919ri("");
                    C2857ka.this.wjv();
                }
            }
        });
    }

    /* JADX INFO: renamed from: dw */
    private void m10848dw() {
        if (this.tnn == null) {
            return;
        }
        new C3154ri(this.f8301ri).m13169ri(this.tnn, C3239lr.m13705lr(), this.f8322fe, new InterfaceC3186ka() { // from class: com.bytedance.sdk.openadsdk.activity.single.ka.8
            @Override // com.bytedance.sdk.openadsdk.core.p200co.xha.InterfaceC3186ka
            /* JADX INFO: renamed from: ri */
            public void mo10893ri(int i, String str) {
                C2857ka.this.f8328nd = true;
            }

            @Override // com.bytedance.sdk.openadsdk.core.p200co.xha.InterfaceC3186ka
            /* JADX INFO: renamed from: ri */
            public void mo10894ri(AbstractViewOnTouchListenerC2318ik<View> abstractViewOnTouchListenerC2318ik) {
                View viewM7879sf = abstractViewOnTouchListenerC2318ik.m7879sf();
                ViewGroup viewGroup = (ViewGroup) viewM7879sf.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(viewM7879sf);
                }
                C2857ka.this.f8338tw = viewM7879sf;
                if (C2857ka.this.feb != null) {
                    C2857ka.this.feb.addView(viewM7879sf, new FrameLayout.LayoutParams(-1, -1));
                }
            }
        });
    }

    private void dzy() {
        if (this.aac) {
            this.f8343zb = System.currentTimeMillis();
        }
        this.f8334qt.removeMessages(1);
        di diVar = this.f8333qh;
        if (diVar != null) {
            diVar.m10899lr();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: fr */
    public void m10850fr() {
        C2853fi c2853fi = this.f8331pv;
        if (c2853fi == null || !c2853fi.wjv()) {
            this.f8299ka.xha();
            return;
        }
        m10859lr(this.f8331pv);
        this.f8335sf.removeView(this.f8320di);
        this.jbs.setVisibility(8);
        this.f8329nr.setVisibility(8);
    }

    private void hcw() {
        C3281fr c3281frM14258qt;
        C3289ri c3289riM14428ka = this.f8300lr.m14428ka();
        if (c3289riM14428ka == null || (c3281frM14258qt = c3289riM14428ka.m14258qt()) == null || TextUtils.isEmpty(c3281frM14258qt.xha())) {
            return;
        }
        this.f8331pv = new C2853fi(this.f8299ka, this.f8300lr, -1, 1, false, false, true);
    }

    private void igq() {
        AbstractC2859mj abstractC2859mj;
        if (!this.f8319co || this.f8299ka.m10927bu() || (abstractC2859mj = this.hcw) == null) {
            return;
        }
        abstractC2859mj.bnj();
    }

    private int ihz() {
        if (!this.f8317ay || this.xha.m10908ik() || this.f8316aw.get() || this.f8326kt) {
            return 0;
        }
        int iM10865ri = m10865ri(this.ory, this.xha.m10909ka(), LockFreeTaskQueueCore.MAX_CAPACITY_MASK);
        this.xha.m10914ri(this.ory, iM10865ri);
        if (this.ory < 0) {
            this.f8320di.scrollToPosition(iM10865ri);
            return iM10865ri;
        }
        this.ory = iM10865ri;
        return iM10865ri;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ik */
    public void m10852ik(AbstractC2859mj abstractC2859mj) {
        AbstractC2859mj abstractC2859mj2 = this.hcw;
        if (abstractC2859mj != abstractC2859mj2) {
            return;
        }
        if (this.f8324ig) {
            if (this.ory < this.xha.m10912ri() - 1) {
                int i = this.ory + 1;
                this.srn = i;
                if (this.f8340vr) {
                    this.f8320di.smoothScrollToPosition(i);
                } else {
                    m10858lr(i);
                }
            } else {
                this.srn = 0;
                this.f8320di.scrollToPosition(0);
                this.f8320di.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.ka.7
                    @Override // java.lang.Runnable
                    public void run() {
                        if (C2722lr.m10243ri(C2857ka.this.f8301ri)) {
                            return;
                        }
                        C2857ka c2857ka = C2857ka.this;
                        c2857ka.m10872ri(c2857ka.srn, true);
                    }
                });
            }
        } else if (this.gcp) {
            abstractC2859mj2.mo10788ik();
        } else {
            abstractC2859mj2.mo10772pv();
        }
        this.f8333qh = null;
        this.gcp = false;
    }

    /* JADX INFO: renamed from: lr */
    private void m10858lr(int i) {
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
        int iFindFirstVisibleItemPosition = this.f8327mj.findFirstVisibleItemPosition();
        int iFindLastVisibleItemPosition = this.f8327mj.findLastVisibleItemPosition();
        if (i < iFindFirstVisibleItemPosition) {
            this.f8320di.smoothScrollToPosition(i);
            return;
        }
        if (i > iFindLastVisibleItemPosition) {
            this.f8320di.smoothScrollToPosition(this.srn);
            return;
        }
        int i2 = i - iFindFirstVisibleItemPosition;
        int childCount = this.f8320di.getChildCount();
        if (i2 <= 0 || i2 >= childCount || (viewHolderFindViewHolderForAdapterPosition = this.f8320di.findViewHolderForAdapterPosition(i - 1)) == null) {
            return;
        }
        this.f8320di.smoothScrollBy(0, viewHolderFindViewHolderForAdapterPosition.itemView.getBottom());
    }

    /* JADX INFO: renamed from: lr */
    private void m10859lr(AbstractC2859mj abstractC2859mj) {
        for (AbstractC2859mj abstractC2859mj2 : this.xha.m10910lr()) {
            if (abstractC2859mj2 != abstractC2859mj) {
                abstractC2859mj2.mo10795ri(this.hcw, abstractC2859mj, this.f8330oh);
            }
        }
        C2853fi c2853fi = this.f8331pv;
        if (c2853fi != null && c2853fi != abstractC2859mj) {
            c2853fi.mo10795ri(this.hcw, abstractC2859mj, this.f8330oh);
        }
        AbstractC2859mj abstractC2859mj3 = this.hcw;
        this.hcw = abstractC2859mj;
        if (abstractC2859mj3 != null) {
            abstractC2859mj3.f8467co = false;
            abstractC2859mj3.bgr();
            abstractC2859mj3.mo10770ka();
        }
        abstractC2859mj.f8467co = true;
        abstractC2859mj.m11012lr(this.f8301ri, new C2858lr.fi(1, null));
        C3072mj c3072mjMo10791ri = abstractC2859mj.mo10791ri();
        if (c3072mjMo10791ri.getVisibility() != 0) {
            c3072mjMo10791ri.setVisibility(0);
        }
        if (c3072mjMo10791ri.getParent() == null) {
            this.f8335sf.addView(c3072mjMo10791ri, new FrameLayout.LayoutParams(-1, -1));
        }
        this.f8299ka.m10940lr(abstractC2859mj);
        if (abstractC2859mj.mo10769f_() != this.f8321dw) {
            abstractC2859mj.mo10773ri("card_sync");
        }
    }

    /* JADX INFO: renamed from: oh */
    private boolean m10863oh() {
        FrameLayout frameLayout = this.feb;
        return (frameLayout == null || frameLayout.getParent() == null) ? false : true;
    }

    private void ory() {
        if (this.feb != null || this.tnn == null || this.f8328nd) {
            return;
        }
        this.zyn = true;
        this.feb = new C3192ik(this.f8301ri) { // from class: com.bytedance.sdk.openadsdk.activity.single.ka.9
            @Override // android.view.ViewGroup, android.view.View
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                C2857ka.this.f8334qt.removeMessages(4);
                C2857ka.this.f8334qt.sendEmptyMessage(4);
                try {
                    return super.dispatchTouchEvent(motionEvent);
                } catch (Exception unused) {
                    return false;
                }
            }
        };
        View view = this.f8338tw;
        if (view != null && view.getParent() == null) {
            this.feb.addView(this.f8338tw, new FrameLayout.LayoutParams(-1, -1));
        }
        this.f8335sf.addView(this.feb, new FrameLayout.LayoutParams(-1, -1));
        this.f8334qt.sendEmptyMessageDelayed(4, ((long) this.wjv) * 1000);
        AbstractC2859mj abstractC2859mj = this.hcw;
        if (abstractC2859mj instanceof AbstractC2860ri) {
            ((AbstractC2860ri) abstractC2859mj).m11049zf();
        }
        dzy();
    }

    /* JADX INFO: renamed from: ri */
    private static int m10865ri(int i, int i2, int i3) {
        if (i < 0) {
            i = 0;
        }
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = i3 + i4;
            if (i5 % i2 == i) {
                return i5;
            }
            int i6 = i3 - i4;
            if (i6 % i2 == i) {
                return i6;
            }
        }
        return i3;
    }

    /* JADX INFO: renamed from: ri */
    private void m10870ri(int i, int i2, boolean z) {
        String str;
        if (i < 0 || i2 < 0 || i == i2) {
            return;
        }
        if (z) {
            str = "auto_down";
        } else {
            str = i2 > i ? "down" : "up";
        }
        final String str2 = str;
        final long jElapsedRealtime = (SystemClock.elapsedRealtime() - this.f8337ta) / 1000;
        List<wjv> listM10906fi = this.xha.m10906fi();
        final int size = i % listM10906fi.size();
        final int size2 = i2 % listM10906fi.size();
        wjv wjvVar = listM10906fi.get(size);
        C3414ik.m15532ri(System.currentTimeMillis(), wjvVar, wjvVar.m14394fi(), "slide", new C3527ri() { // from class: com.bytedance.sdk.openadsdk.activity.single.ka.5
            @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
            /* JADX INFO: renamed from: ri */
            public JSONObject mo10798ri() {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(TypedValues.TransitionType.S_FROM, size + 1);
                    jSONObject.put("to", size2 + 1);
                    jSONObject.put("direction", str2);
                    jSONObject.put("click_user_remaining", jElapsedRealtime);
                    return jSONObject;
                } catch (Exception unused) {
                    return null;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public void m10871ri(int i, String str) {
        this.f8326kt = false;
        m10843ay();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public void m10872ri(int i, boolean z) {
        int i2;
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = this.f8320di.findViewHolderForAdapterPosition(i);
        if (viewHolderFindViewHolderForAdapterPosition == null || !(viewHolderFindViewHolderForAdapterPosition instanceof lr) || (i2 = this.ory) == i) {
            return;
        }
        m10870ri(i2, i, z);
        this.ory = i;
        this.f8337ta = SystemClock.elapsedRealtime();
        AbstractC2859mj abstractC2859mjM10903ri = ((lr) viewHolderFindViewHolderForAdapterPosition).m10903ri();
        if (abstractC2859mjM10903ri == null) {
            return;
        }
        m10859lr(abstractC2859mjM10903ri);
        this.bgr.add(abstractC2859mjM10903ri.f8468di.m14392fe());
        if (this.f8326kt && this.f8323fr > 0 && this.ory >= this.xha.m10912ri() - this.f8323fr) {
            m10884uq();
        }
        AbstractC2860ri abstractC2860riMo10799aw = mo10799aw();
        if (abstractC2860riMo10799aw == null) {
            this.whw = true;
            return;
        }
        if (!this.f8340vr && this.f8327mj.findLastVisibleItemPosition() >= this.ory + 1) {
            abstractC2860riMo10799aw.m11003fi(true);
        }
        this.f8318bu.add(Integer.valueOf(this.ory + 1));
        abstractC2860riMo10799aw.m11048su();
        this.whw = false;
    }

    /* JADX INFO: renamed from: ri */
    private void m10878ri(final C3289ri c3289ri) {
        C3281fr c3281frM14258qt = c3289ri.m14258qt();
        if (c3281frM14258qt != null) {
            this.f8325jc = c3281frM14258qt.m14124co();
            this.f8326kt = c3281frM14258qt.m14122aw();
        }
        if (!this.f8340vr) {
            for (wjv wjvVar : c3289ri.m14252ka()) {
                if (wjvVar.m14389eu() != null && wjv.m14332fi(wjvVar)) {
                    C3126lr c3126lrM14345ri = wjv.m14345ri(CacheDirFactory.getICacheDir(wjvVar.m14476qf()).mo6274ri(), wjvVar);
                    c3126lrM14345ri.m6328ri("material_meta", wjvVar);
                    c3126lrM14345ri.m6328ri("ad_slot", wjvVar.m14388eb());
                    C3113ri.m12651ri(c3126lrM14345ri, new AbstractC1993lr() { // from class: com.bytedance.sdk.openadsdk.activity.single.ka.2
                        @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p060fi.InterfaceC1994ri.ri
                        /* JADX INFO: renamed from: ri */
                        public void mo6289ri(C1996ik c1996ik, int i) {
                        }

                        @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p060fi.InterfaceC1994ri.ri
                        /* JADX INFO: renamed from: ri */
                        public void mo6290ri(C1996ik c1996ik, int i, String str) {
                        }
                    });
                }
            }
        }
        dzy.m16411ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.ka.3
            @Override // java.lang.Runnable
            public void run() {
                if (C2722lr.m10243ri(C2857ka.this.f8301ri)) {
                    return;
                }
                C2857ka.this.f8316aw.set(false);
                C2857ka.this.xha.m10919ri("");
                C2857ka.this.xha.m10920ri(c3289ri.m14252ka());
                C2857ka.this.wjv();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public void m10879ri(C3289ri c3289ri, C3282ik c3282ik) {
        this.f8326kt = false;
        if (c3289ri.m14252ka() != null && !c3289ri.m14252ka().isEmpty()) {
            m10878ri(c3289ri);
            return;
        }
        c3282ik.m14181ri(-3);
        c3282ik.m14175ik(1);
        C3282ik.m14172ri(c3282ik);
        m10843ay();
    }

    /* JADX INFO: renamed from: su */
    private void m10882su() {
        FrameLayout frameLayout = this.feb;
        if (frameLayout == null) {
            return;
        }
        ViewParent parent = frameLayout.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.feb);
        }
        this.feb = null;
        AbstractC2859mj abstractC2859mj = this.hcw;
        if (abstractC2859mj instanceof AbstractC2860ri) {
            ((AbstractC2860ri) abstractC2859mj).m11040dw();
        }
        m10886xd();
        Message message = this.rzk;
        if (message != null) {
            handleMessage(message);
            this.rzk = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: uq */
    public void m10884uq() {
        if (this.f8316aw.compareAndSet(false, true)) {
            AdSlot adSlotM14388eb = this.f8300lr.m14388eb();
            igq igqVar = new igq();
            igqVar.f11276di = true;
            if (this.f8300lr.sez() != null || this.f8300lr.m14575zv() != null) {
                igqVar.jbs = 2;
            }
            igqVar.xha = this.f8325jc;
            this.xha.m10919ri(C2729uq.m10311ri(this.f8301ri, "tt_loading_more"));
            C3299nr.m14638ik().mo12638ri(adSlotM14388eb, igqVar, this.f8300lr.m14404go(), new C3331uq() { // from class: com.bytedance.sdk.openadsdk.activity.single.ka.17
                @Override // com.bytedance.sdk.openadsdk.core.C3331uq, com.bytedance.sdk.openadsdk.core.wjv.InterfaceC3358ri
                /* JADX INFO: renamed from: ri */
                public void mo10890ri(int i, String str) {
                    C2857ka.this.m10871ri(i, str);
                }

                @Override // com.bytedance.sdk.openadsdk.core.C3331uq, com.bytedance.sdk.openadsdk.core.wjv.InterfaceC3358ri
                /* JADX INFO: renamed from: ri */
                public void mo10891ri(C3289ri c3289ri, C3282ik c3282ik) {
                    C2857ka.this.m10879ri(c3289ri, c3282ik);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void wjv() {
        if (this.f8326kt) {
            return;
        }
        if (this.f8317ay) {
            ihz();
        } else {
            dzy.m16411ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.ka.18
                @Override // java.lang.Runnable
                public void run() {
                    if (C2722lr.m10243ri(C2857ka.this.f8301ri)) {
                        return;
                    }
                    C2857ka.this.xha.m10919ri(C2729uq.m10311ri(C3299nr.m14642ri(), "tt_list_end_tip"));
                }
            });
        }
    }

    /* JADX INFO: renamed from: xd */
    private void m10886xd() {
        if (this.f8343zb != 0) {
            AbstractC2859mj abstractC2859mj = this.hcw;
            if (abstractC2859mj != null && C3279dw.m14092lr(abstractC2859mj.f8468di)) {
                int iCurrentTimeMillis = this.f8341xd - ((int) ((System.currentTimeMillis() - this.f8343zb) / 1000));
                this.f8341xd = iCurrentTimeMillis;
                if (iCurrentTimeMillis < 0) {
                    this.f8341xd = 0;
                }
            }
            this.f8343zb = 0L;
        }
        if (this.f8341xd >= 0) {
            this.f8334qt.removeMessages(1);
            this.f8334qt.sendEmptyMessage(1);
        }
        di diVar = this.f8333qh;
        if (diVar != null) {
            diVar.m10897ik();
        }
    }

    /* JADX INFO: renamed from: zf */
    private void m10887zf() {
        if (this.zyn || this.tnn == null) {
            return;
        }
        this.f8334qt.removeMessages(3);
        this.f8334qt.sendEmptyMessageDelayed(3, ((long) this.f8339uq) * 1000);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2854ik
    /* JADX INFO: renamed from: ac, reason: merged with bridge method [inline-methods] */
    public AbstractC2860ri mo10799aw() {
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = this.f8320di.findViewHolderForAdapterPosition(this.ory + 1);
        if (!(viewHolderFindViewHolderForAdapterPosition instanceof lr)) {
            return null;
        }
        AbstractC2859mj abstractC2859mjM10903ri = ((lr) viewHolderFindViewHolderForAdapterPosition).m10903ri();
        if (abstractC2859mjM10903ri instanceof AbstractC2860ri) {
            return (AbstractC2860ri) abstractC2859mjM10903ri;
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2854ik
    /* JADX INFO: renamed from: bu */
    public void mo10800bu() {
        super.mo10800bu();
        this.aac = true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2854ik
    /* JADX INFO: renamed from: co */
    public C3060ik mo10801co() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2854ik
    /* JADX INFO: renamed from: fi */
    public boolean mo10803fi() {
        return this.f8321dw;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (this.f8342xm) {
            this.tan.add(this.f8334qt.obtainMessage(message.what, message.arg1, message.arg2, message.obj));
            return false;
        }
        int i = message.what;
        if (i == 1) {
            int i2 = this.f8341xd;
            if (i2 > 0) {
                if (i2 <= this.igq) {
                    igq();
                }
                int i3 = this.dzy;
                int i4 = (int) ((((double) (i3 - this.f8341xd)) * 100.0d) / ((double) i3));
                TopLayoutDislike2 topLayoutDislike2 = this.jbs;
                StringBuilder sb = new StringBuilder();
                int i5 = this.f8341xd;
                this.f8341xd = i5 - 1;
                sb.append(i5);
                sb.append(CmcdData.Factory.STREAMING_FORMAT_SS);
                topLayoutDislike2.setCountDownFor1InN(sb.toString(), i4);
                if (this.f8341xd >= 0) {
                    this.f8334qt.removeMessages(message.what);
                    this.f8334qt.sendEmptyMessageDelayed(message.what, 1000L);
                }
            } else {
                igq();
                if (mo10805ka()) {
                    this.jbs.showSkipButton();
                } else {
                    this.jbs.showCloseButton();
                }
            }
        } else if (i == 3) {
            ory();
        } else if (i == 4) {
            m10882su();
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2854ik
    /* JADX INFO: renamed from: ik */
    public void mo10804ik() {
        super.mo10804ik();
        this.f8342xm = true;
        AbstractC2859mj abstractC2859mj = this.hcw;
        if (abstractC2859mj != null) {
            abstractC2859mj.bgr();
        }
        dzy();
        this.gcp = this.f8333qh != null;
        this.f8334qt.removeMessages(3);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2854ik
    /* JADX INFO: renamed from: ka */
    public boolean mo10805ka() {
        return this.f8331pv != null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2854ik
    /* JADX INFO: renamed from: lr */
    public void mo10806lr() {
        super.mo10806lr();
        this.f8342xm = false;
        this.aac = false;
        AbstractC2859mj abstractC2859mj = this.hcw;
        if (abstractC2859mj != null && !this.gcp) {
            abstractC2859mj.mo10788ik();
        }
        if (this.bnj == 0) {
            this.bnj = SystemClock.elapsedRealtime();
        }
        m10886xd();
        m10887zf();
        Iterator<Message> it = this.tan.iterator();
        while (it.hasNext()) {
            handleMessage(it.next());
        }
        this.tan.clear();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2854ik
    /* JADX INFO: renamed from: lr */
    public void mo10807lr(Activity activity) {
        super.mo10807lr(activity);
        C3583qd.m16608ri(activity);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2854ik
    /* JADX INFO: renamed from: lr */
    public void mo10808lr(AbstractC2859mj abstractC2859mj, int i) {
        AbstractC2859mj abstractC2859mj2 = this.hcw;
        if (abstractC2859mj != abstractC2859mj2) {
            return;
        }
        if (i == 2) {
            dzy();
            return;
        }
        if (i == 1) {
            if (!m10863oh()) {
                m10886xd();
                return;
            }
            AbstractC2859mj abstractC2859mj3 = this.hcw;
            if (abstractC2859mj3 instanceof AbstractC2860ri) {
                ((AbstractC2860ri) abstractC2859mj3).m11049zf();
                return;
            }
            return;
        }
        if (i == 3 || i == 4) {
            try {
                abstractC2859mj2.mo10787ay().ihz.m12145oh();
            } catch (Throwable th) {
                C2707ac.m10197ik("CardsLayoutManager", th);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2854ik
    /* JADX INFO: renamed from: mj */
    public int mo10809mj() {
        return this.f8341xd;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2854ik
    /* JADX INFO: renamed from: nr */
    public void mo10810nr() {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2854ik
    /* JADX INFO: renamed from: qt */
    public int mo10811qt() {
        return this.bgr.size();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2854ik
    /* JADX INFO: renamed from: ri */
    public void mo10814ri(int i) {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2854ik
    /* JADX INFO: renamed from: ri */
    public void mo10816ri(Activity activity) {
        super.mo10816ri(activity);
        AbstractC2859mj abstractC2859mj = this.hcw;
        if (abstractC2859mj != null) {
            abstractC2859mj.m11011lr(activity);
        }
        C2853fi c2853fi = this.f8331pv;
        if (c2853fi != null) {
            c2853fi.tan();
        }
        Iterator<AbstractC2859mj> it = this.xha.m10910lr().iterator();
        while (it.hasNext()) {
            it.next().tan();
        }
        this.f8334qt.removeCallbacksAndMessages(null);
        di diVar = this.f8333qh;
        if (diVar != null) {
            diVar.m10898ka();
            this.f8333qh = null;
        }
        AbstractC2859mj abstractC2859mj2 = this.hcw;
        if (abstractC2859mj2 == null || abstractC2859mj2.mo10796uq() || this.f8300lr.m14367bl()) {
            return;
        }
        C3332vr.m14978lr().post(new C2858lr.ik(this.f8300lr));
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2854ik
    /* JADX INFO: renamed from: ri */
    public void mo10817ri(Bundle bundle) {
        super.mo10817ri(bundle);
        m10848dw();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2854ik
    /* JADX INFO: renamed from: ri */
    public void mo10818ri(View view) {
        super.mo10818ri(view);
        if (view.getParent() != null) {
            return;
        }
        view.setVisibility(4);
        this.f8335sf.addView(view, 0);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2854ik
    /* JADX INFO: renamed from: ri */
    public void mo10822ri(final AbstractC2859mj abstractC2859mj, AbstractC2859mj abstractC2859mj2, C2858lr.fi fiVar) {
        long jM14298ka;
        if (abstractC2859mj != this.hcw) {
            return;
        }
        if (abstractC2859mj.mo11004fr() || C3279dw.m14092lr(abstractC2859mj.f8468di)) {
            jM14298ka = 500;
        } else {
            C3293su c3293suDob = abstractC2859mj.f8468di.dob();
            jM14298ka = c3293suDob != null ? ((long) c3293suDob.m14298ka()) * 1000 : 0L;
        }
        di diVar = this.f8333qh;
        if (diVar != null) {
            diVar.m10898ka();
        }
        di diVar2 = new di(Math.max(500L, jM14298ka)) { // from class: com.bytedance.sdk.openadsdk.activity.single.ka.6
            @Override // com.bytedance.sdk.openadsdk.activity.single.C2857ka.di
            /* JADX INFO: renamed from: ri */
            public void mo10892ri() {
                if (C2722lr.m10243ri(C2857ka.this.f8301ri)) {
                    return;
                }
                C2857ka.this.m10852ik(abstractC2859mj);
            }
        };
        this.f8333qh = diVar2;
        diVar2.m10896fi();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2854ik
    /* JADX INFO: renamed from: ri */
    public void mo10826ri(Map<String, Object> map, AbstractC2859mj abstractC2859mj, float f, float f2) {
        Object jSONObject = map.get("pag_json_data");
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (jSONObject instanceof JSONObject) {
            try {
                C3072mj c3072mjMo10791ri = abstractC2859mj.mo10791ri();
                ((JSONObject) jSONObject).put("width", c3072mjMo10791ri.getWidth());
                ((JSONObject) jSONObject).put("height", c3072mjMo10791ri.getHeight());
                int i = abstractC2859mj.f8473qt;
                int i2 = 1;
                ((JSONObject) jSONObject).put("click_feed_top", i == this.f8327mj.findFirstVisibleItemPosition() ? 1 : 0);
                JSONObject jSONObject2 = (JSONObject) jSONObject;
                if (i != this.xha.m10909ka()) {
                    i2 = 0;
                }
                jSONObject2.put("click_on_final", i2);
                ((JSONObject) jSONObject).put("click_countdown_remaining", this.f8341xd);
                ((JSONObject) jSONObject).put("click_user_remaining", i == this.ory ? (SystemClock.elapsedRealtime() - this.f8337ta) / 1000 : 0L);
                map.put("pag_json_data", jSONObject.toString());
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2854ik
    /* JADX INFO: renamed from: ri */
    public void mo10827ri(boolean z) {
        super.mo10827ri(z);
        AbstractC2859mj abstractC2859mj = this.hcw;
        if (abstractC2859mj != null) {
            abstractC2859mj.mo10789ik(z);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2854ik
    /* JADX INFO: renamed from: ri */
    public boolean mo10828ri(AbstractC2859mj abstractC2859mj, int i) {
        C2853fi c2853fi = this.f8331pv;
        return c2853fi != null && c2853fi == abstractC2859mj;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2854ik
    /* JADX INFO: renamed from: sf */
    public AbstractC2859mj mo10829sf() {
        return this.hcw;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2854ik
    public void slm() {
        if (this.siy) {
            return;
        }
        this.siy = true;
        final long jElapsedRealtime = SystemClock.elapsedRealtime() - this.bnj;
        C3414ik.m15532ri(System.currentTimeMillis(), this.f8300lr, this.f8300lr.m14394fi(), "first_ad_loaded", new C3527ri() { // from class: com.bytedance.sdk.openadsdk.activity.single.ka.10
            @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
            /* JADX INFO: renamed from: lr */
            public JSONObject mo10797lr() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", jElapsedRealtime);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2854ik
    public void tan() {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.AbstractC2854ik
    /* JADX INFO: renamed from: vr */
    public List<wjv> mo10830vr() {
        return this.xha.m10906fi();
    }
}
