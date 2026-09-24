package com.bytedance.sdk.openadsdk.core.bgr.p198lr;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Message;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.bykv.p028vk.openvk.p049ri.p050ri.p051lr.p053ka.C1977ri;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC1999ik;
import com.bytedance.sdk.component.utils.C2729uq;
import com.bytedance.sdk.component.utils.igq;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.widget.tan;
import com.bytedance.sdk.openadsdk.p172ac.C2751lr;
import com.bytedance.sdk.openadsdk.utils.C3583qd;
import com.bytedance.sdk.openadsdk.utils.C3586sf;
import com.bytedance.sdk.openadsdk.utils.slm;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.bgr.lr.ka */
/* JADX INFO: loaded from: classes3.dex */
public class C3123ka extends C3121fi {
    private int aac;
    private final Rect ajz;
    private SeekBar bnj;
    private final Rect che;

    /* JADX INFO: renamed from: eb */
    private float f10116eb;

    /* JADX INFO: renamed from: fe */
    private TextView f10117fe;
    private ImageView feb;
    private boolean gcp;
    private final tan hpn;
    private ColorStateList hws;

    /* JADX INFO: renamed from: id */
    private float f10118id;

    /* JADX INFO: renamed from: ig */
    private ImageView f10119ig;
    private float iph;

    /* JADX INFO: renamed from: jc */
    private TextView f10120jc;
    private float jxw;

    /* JADX INFO: renamed from: kt */
    private TextView f10121kt;
    private final int luy;

    /* JADX INFO: renamed from: nd */
    private int f10122nd;

    /* JADX INFO: renamed from: nh */
    private final Rect f10123nh;

    /* JADX INFO: renamed from: pc */
    private float f10124pc;

    /* JADX INFO: renamed from: pu */
    private final Rect f10125pu;

    /* JADX INFO: renamed from: pv */
    private TextView f10126pv;

    /* JADX INFO: renamed from: qd */
    private View f10127qd;

    /* JADX INFO: renamed from: qh */
    private boolean f10128qh;
    private final View.OnTouchListener qmx;
    private final igq rzk;
    private ColorStateList saa;
    private TextView siy;
    private TextView srn;

    /* JADX INFO: renamed from: ta */
    private View f10129ta;
    private ImageView tnn;

    /* JADX INFO: renamed from: tw */
    private int f10130tw;

    /* JADX INFO: renamed from: ud */
    private final int f10131ud;

    /* JADX INFO: renamed from: vt */
    private ColorStateList f10132vt;
    private TextView whw;

    /* JADX INFO: renamed from: xe */
    private int f10133xe;

    /* JADX INFO: renamed from: xm */
    private ImageView f10134xm;
    private final Rect yjm;

    /* JADX INFO: renamed from: zb */
    private int f10135zb;

    /* JADX INFO: renamed from: zk */
    private int f10136zk;
    private View zyn;

    public C3123ka(Context context, ViewGroup viewGroup, boolean z, int i, wjv wjvVar, InterfaceC1999ik interfaceC1999ik, boolean z2) {
        super(context, viewGroup, z, i, wjvVar, interfaceC1999ik, z2);
        this.rzk = new igq(this);
        this.f10128qh = false;
        this.gcp = false;
        this.f10130tw = 0;
        this.f10122nd = 0;
        this.f10135zb = 0;
        this.aac = 0;
        this.f10133xe = 0;
        this.yjm = new Rect();
        this.ajz = new Rect();
        this.f10136zk = 0;
        this.qmx = new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.core.bgr.lr.ka.7
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 2) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                } else if (actionMasked == 3) {
                    view.getParent().requestDisallowInterceptTouchEvent(false);
                }
                return false;
            }
        };
        this.f10123nh = new Rect();
        this.f10125pu = new Rect();
        this.che = new Rect();
        this.f10066su = C3299nr.m14642ri().getApplicationContext();
        m12840ka(z2);
        this.f10055ik = viewGroup;
        this.ihz = z;
        tan tanVar = new tan(this);
        this.hpn = tanVar;
        tanVar.m15114ri(this.ihz);
        DisplayMetrics displayMetrics = this.f10066su.getResources().getDisplayMetrics();
        this.luy = displayMetrics.widthPixels;
        this.f10131ud = displayMetrics.heightPixels;
        this.f10047ay = i;
        this.hcw = interfaceC1999ik;
        this.f10053fr = wjvVar;
        m12839ka(8);
        mo12853ri(context, this.f10055ik);
        mo12838ka();
        m12831co();
    }

    /* JADX INFO: renamed from: fi */
    private void m12954fi(boolean z) {
        if (z) {
            m12955fr();
        } else {
            m12957su();
        }
    }

    /* JADX INFO: renamed from: fr */
    private void m12955fr() {
        DisplayMetrics displayMetrics = this.f10066su.getResources().getDisplayMetrics();
        TextView textView = this.whw;
        if (textView != null) {
            this.f10118id = textView.getTextSize();
            this.whw.setTextSize(2, 14.0f);
            ColorStateList textColors = this.whw.getTextColors();
            this.hws = textColors;
            if (textColors != null) {
                this.whw.setTextColor(-1);
            }
            this.jxw = this.whw.getAlpha();
            this.whw.setAlpha(0.85f);
            this.whw.setShadowLayer(0.0f, C3583qd.m16589lr(this.f10066su, 0.5f), C3583qd.m16589lr(this.f10066su, 0.5f), C2729uq.xha(this.f10066su, "tt_b2000000"));
            ViewGroup.LayoutParams layoutParams = this.whw.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                this.f10123nh.set(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                C3583qd.m16613ri(this.whw, (int) TypedValue.applyDimension(1, 16.0f, displayMetrics), this.f10123nh.top, (int) TypedValue.applyDimension(1, 14.0f, displayMetrics), this.f10123nh.bottom);
            }
        }
        TextView textView2 = this.siy;
        if (textView2 != null) {
            this.f10116eb = textView2.getTextSize();
            this.siy.setTextSize(2, 14.0f);
            ColorStateList textColors2 = this.siy.getTextColors();
            this.f10132vt = textColors2;
            if (textColors2 != null) {
                this.siy.setTextColor(-1);
            }
            this.iph = this.siy.getAlpha();
            this.siy.setAlpha(0.85f);
            this.siy.setShadowLayer(0.0f, C3583qd.m16589lr(this.f10066su, 0.5f), C3583qd.m16589lr(this.f10066su, 0.5f), C2729uq.xha(this.f10066su, "tt_b2000000"));
            ViewGroup.LayoutParams layoutParams2 = this.siy.getLayoutParams();
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                this.f10125pu.set(marginLayoutParams2.leftMargin, marginLayoutParams2.topMargin, marginLayoutParams2.rightMargin, marginLayoutParams2.bottomMargin);
                C3583qd.m16613ri(this.siy, (int) TypedValue.applyDimension(1, 14.0f, displayMetrics), this.f10125pu.top, this.f10125pu.right, this.f10125pu.bottom);
            }
        }
        ImageView imageView = this.f10134xm;
        if (imageView != null) {
            ViewGroup.LayoutParams layoutParams3 = imageView.getLayoutParams();
            if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                this.che.set(marginLayoutParams3.leftMargin, marginLayoutParams3.topMargin, marginLayoutParams3.rightMargin, marginLayoutParams3.bottomMargin);
                C3583qd.m16613ri(this.f10134xm, this.che.left, this.che.top, (int) TypedValue.applyDimension(1, 16.0f, displayMetrics), this.che.bottom);
            }
        }
        ImageView imageView2 = this.f10134xm;
        if (imageView2 != null) {
            imageView2.setImageDrawable(C2729uq.m10303ik(this.f10066su, "tt_shrink_fullscreen"));
        }
        TextView textView3 = this.f10120jc;
        if (textView3 != null) {
            ColorStateList textColors3 = textView3.getTextColors();
            this.saa = textColors3;
            if (textColors3 != null) {
                this.f10120jc.setTextColor(-1);
            }
            this.f10124pc = this.f10120jc.getAlpha();
            this.f10120jc.setAlpha(0.85f);
            ViewGroup.LayoutParams layoutParams4 = this.f10120jc.getLayoutParams();
            if (layoutParams4 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams4;
                this.ajz.set(marginLayoutParams4.leftMargin, marginLayoutParams4.topMargin, marginLayoutParams4.rightMargin, marginLayoutParams4.bottomMargin);
                C3583qd.m16613ri(this.f10120jc, (int) TypedValue.applyDimension(1, 1.0f, displayMetrics), this.f10125pu.top, this.f10125pu.right, this.f10125pu.bottom);
            }
        }
        View view = this.f10127qd;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams5 = view.getLayoutParams();
            this.f10136zk = layoutParams5.height;
            layoutParams5.height = (int) TypedValue.applyDimension(1, 49.0f, displayMetrics);
            this.f10127qd.setLayoutParams(layoutParams5);
            this.f10127qd.setBackgroundResource(C2729uq.m10305ka(this.f10066su, "tt_shadow_fullscreen_top"));
        }
        m12844lr(false, true);
    }

    /* JADX INFO: renamed from: su */
    private void m12957su() {
        TextView textView = this.whw;
        if (textView != null) {
            textView.setTextSize(0, this.f10118id);
            ColorStateList colorStateList = this.hws;
            if (colorStateList != null) {
                this.whw.setTextColor(colorStateList);
            }
            this.whw.setAlpha(this.jxw);
            this.whw.setShadowLayer(C3583qd.m16589lr(this.f10066su, 1.0f), 0.0f, 0.0f, C2729uq.xha(this.f10066su, "tt_72000000"));
            C3583qd.m16613ri(this.whw, this.f10123nh.left, this.f10123nh.top, this.f10123nh.right, this.f10123nh.bottom);
        }
        TextView textView2 = this.siy;
        if (textView2 != null) {
            textView2.setTextSize(0, this.f10116eb);
            ColorStateList colorStateList2 = this.f10132vt;
            if (colorStateList2 != null) {
                this.siy.setTextColor(colorStateList2);
            }
            this.siy.setAlpha(this.iph);
            this.siy.setShadowLayer(C3583qd.m16589lr(this.f10066su, 1.0f), 0.0f, 0.0f, C2729uq.xha(this.f10066su, "tt_72000000"));
            C3583qd.m16613ri(this.siy, this.f10125pu.left, this.f10125pu.top, this.f10125pu.right, this.f10125pu.bottom);
        }
        ImageView imageView = this.f10134xm;
        if (imageView != null) {
            C3583qd.m16613ri(imageView, this.che.left, this.che.top, this.che.right, this.che.bottom);
        }
        ImageView imageView2 = this.f10134xm;
        if (imageView2 != null) {
            imageView2.setImageDrawable(C2729uq.m10303ik(this.f10066su, "tt_enlarge_video"));
        }
        TextView textView3 = this.f10120jc;
        if (textView3 != null) {
            ColorStateList colorStateList3 = this.saa;
            if (colorStateList3 != null) {
                textView3.setTextColor(colorStateList3);
            }
            this.f10120jc.setAlpha(this.f10124pc);
            C3583qd.m16613ri(this.f10120jc, this.f10125pu.left, this.f10125pu.top, this.f10125pu.right, this.f10125pu.bottom);
        }
        View view = this.f10127qd;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = this.f10136zk;
            this.f10127qd.setLayoutParams(layoutParams);
            this.f10127qd.setBackground(C3586sf.m16645ri(this.f10066su, "tt_video_black_desc_gradient"));
        }
        m12844lr(false, true);
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p198lr.C3121fi
    /* JADX INFO: renamed from: di */
    public void mo12832di() {
        this.rzk.removeMessages(1);
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p198lr.C3121fi
    /* JADX INFO: renamed from: fi */
    public void mo12833fi() {
        this.rzk.removeMessages(1);
        this.rzk.sendMessageDelayed(this.rzk.obtainMessage(1), 2000L);
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p198lr.C3121fi
    /* JADX INFO: renamed from: ik */
    public void mo12837ik(boolean z) {
        TextView textView;
        TextView textView2;
        int i;
        if (this.srn != null) {
            if (!this.ihz) {
                textView = this.srn;
                if (z) {
                    i = 0;
                } else {
                    textView2 = textView;
                }
                C3583qd.m16612ri((View) textView, i);
            }
            textView2 = this.srn;
            textView = textView2;
            i = 8;
            C3583qd.m16612ri((View) textView, i);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p198lr.C3121fi
    public void jbs() {
        this.bnj.setProgress(0);
        this.bnj.setSecondaryProgress(0);
        this.siy.setText(C2729uq.m10311ri(this.f10066su, "tt_00_00"));
        this.whw.setText(C2729uq.m10311ri(this.f10066su, "tt_00_00"));
        m12839ka(8);
        if (m12829ay()) {
            this.f10056ka.setVisibility(8);
        }
        if (this.f10058mj != null) {
            this.f10058mj.setImageDrawable(null);
        }
        m12839ka(8);
        C3583qd.m16612ri(this.f10129ta, 8);
        C3583qd.m16612ri(this.f10063qt, 8);
        C3583qd.m16612ri((View) this.f10065sf, 8);
        C3583qd.m16612ri(this.f10049co, 8);
        C3583qd.m16612ri((View) this.f10046aw, 8);
        C3583qd.m16612ri((View) this.bgr, 8);
        C3583qd.m16612ri((View) this.f10068vr, 8);
        if (this.igq != null) {
            this.igq.m14994ri(true);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p198lr.C3121fi
    /* JADX INFO: renamed from: ka */
    protected void mo12838ka() {
        super.mo12838ka();
        this.hpn.m15113ri(this.f10055ik);
        C3583qd.m16612ri((View) this.f10119ig, (this.ihz || (this.f10047ay & 1) == 1) ? 8 : 0);
        this.f10119ig.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.bgr.lr.ka.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (C3123ka.this.slm()) {
                    C3123ka.this.f10070zf.mo6408ik(C3123ka.this, view);
                }
            }
        });
        C3583qd.m16612ri((View) this.f10126pv, (!this.ihz || (this.f10047ay & 2) == 2) ? 0 : 8);
        this.f10126pv.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.bgr.lr.ka.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (C3123ka.this.slm()) {
                    C3123ka.this.f10070zf.mo6409ka(C3123ka.this, view);
                }
            }
        });
        this.feb.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.bgr.lr.ka.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (C3123ka.this.slm()) {
                    C3123ka.this.f10070zf.mo6407fi(C3123ka.this, view);
                }
            }
        });
        this.tnn.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.bgr.lr.ka.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                C3123ka.this.m12844lr(false, true);
                C3123ka.this.mo12846mj();
                C3123ka.this.xha();
                C3123ka.this.slm();
            }
        });
        this.f10134xm.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.bgr.lr.ka.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (C3123ka.this.slm()) {
                    C3123ka.this.f10070zf.mo6413lr(C3123ka.this, view);
                }
            }
        });
        this.bnj.setThumbOffset(0);
        this.bnj.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.bytedance.sdk.openadsdk.core.bgr.lr.ka.6
            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                if (C3123ka.this.slm()) {
                    C3123ka.this.f10070zf.mo6415ri(C3123ka.this, i, z);
                }
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStartTrackingTouch(SeekBar seekBar) {
                if (!C3123ka.this.f10128qh && C3123ka.this.f10066su != null) {
                    seekBar.setThumb(C3586sf.m16645ri(C3299nr.m14642ri(), "tt_seek_thumb_press"));
                }
                if (C3123ka.this.slm()) {
                    seekBar.setThumbOffset(0);
                    C3123ka.this.f10070zf.mo6410lr(C3123ka.this, seekBar.getProgress());
                }
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStopTrackingTouch(SeekBar seekBar) {
                if (!C3123ka.this.f10128qh && C3123ka.this.f10066su != null) {
                    seekBar.setThumb(C3586sf.m16645ri(C3299nr.m14642ri(), "tt_seek_thumb_normal"));
                }
                if (C3123ka.this.slm()) {
                    seekBar.setThumbOffset(0);
                    C3123ka.this.f10070zf.mo6414ri(C3123ka.this, seekBar.getProgress());
                }
            }
        });
        this.bnj.setOnTouchListener(this.qmx);
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p198lr.C3121fi
    /* JADX INFO: renamed from: lr */
    public void mo12842lr(ViewGroup viewGroup) {
        if (viewGroup == null || this.f10055ik == null || !(this.f10055ik.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        this.f10128qh = false;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f10055ik.getLayoutParams();
        marginLayoutParams.width = this.f10135zb;
        marginLayoutParams.height = this.aac;
        marginLayoutParams.leftMargin = this.f10122nd;
        marginLayoutParams.topMargin = this.f10130tw;
        this.f10055ik.setLayoutParams(marginLayoutParams);
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.addRule(3, this.f10133xe);
            viewGroup.setLayoutParams(layoutParams2);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            C3583qd.m16613ri(viewGroup, this.yjm.left, this.yjm.top, this.yjm.right, this.yjm.bottom);
        }
        mo12843lr(true);
        this.f10134xm.setImageDrawable(C2729uq.m10303ik(this.f10066su, "tt_enlarge_video"));
        this.bnj.setThumb(C3586sf.m16645ri(this.f10066su, "tt_seek_thumb_normal"));
        this.bnj.setThumbOffset(0);
        C1977ri.m6209ri((View) this.f10055ik, true);
        m12954fi(this.f10128qh);
        C3583qd.m16612ri(this.f10127qd, 8);
        if ((this.f10047ay & 2) == 2) {
            C3583qd.m16612ri((View) this.f10126pv, 0);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p198lr.C3121fi
    /* JADX INFO: renamed from: lr */
    public void mo12843lr(boolean z) {
        int i = mo12848qt() ? this.f10131ud : this.f10048bu;
        int iM16589lr = mo12848qt() ? this.luy : this.f10059nr;
        if (this.f10045ac <= 0 || this.tan <= 0 || i <= 0) {
            return;
        }
        if (!ihz() && !mo12848qt() && (this.f10047ay & 8) != 8) {
            iM16589lr = C3583qd.m16589lr(this.f10066su, 228.0f);
        }
        int i2 = (int) (this.f10045ac * ((i * 1.0f) / this.tan));
        if (i2 > iM16589lr) {
            i = (int) (this.tan * ((iM16589lr * 1.0f) / this.f10045ac));
        } else {
            iM16589lr = i2;
        }
        if (!z && !mo12848qt()) {
            i = this.f10048bu;
            iM16589lr = this.f10059nr;
        }
        this.f10056ka.mo6280ri(i, iM16589lr);
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p198lr.C3121fi
    /* JADX INFO: renamed from: lr */
    public boolean mo12845lr(int i) {
        SeekBar seekBar = this.bnj;
        return seekBar != null && i > seekBar.getSecondaryProgress();
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p198lr.C3121fi
    /* JADX INFO: renamed from: mj */
    public void mo12846mj() {
        C3583qd.m16579fi(this.f10050di);
        C3583qd.m16579fi(this.zyn);
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p198lr.C3121fi, com.bytedance.sdk.openadsdk.core.widget.C3333ac.lr
    /* JADX INFO: renamed from: qt */
    public boolean mo12848qt() {
        return this.f10128qh;
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p198lr.C3121fi, com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC2000lr
    /* JADX INFO: renamed from: ri */
    public void mo6403ri() {
        mo12861ri(false, this.ihz);
        tan();
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p198lr.C3121fi
    /* JADX INFO: renamed from: ri */
    public void mo12849ri(int i) {
        View view = this.f10129ta;
        if (view == null || view.getVisibility() != 0) {
            this.bnj.setProgress(i);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p198lr.C3121fi
    /* JADX INFO: renamed from: ri */
    public void mo12851ri(long j) {
        this.whw.setText(C1977ri.m6208ri(j));
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p198lr.C3121fi
    /* JADX INFO: renamed from: ri */
    public void mo12852ri(long j, long j2) {
        this.siy.setText(C1977ri.m6208ri(j2));
        this.whw.setText(C1977ri.m6208ri(j));
        this.bnj.setProgress(C1977ri.m6207ri(j, j2));
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p198lr.C3121fi
    /* JADX INFO: renamed from: ri */
    protected void mo12853ri(Context context, View view) {
        super.mo12853ri(context, view);
        this.f10126pv = (TextView) view.findViewById(slm.yjg);
        this.f10119ig = (ImageView) view.findViewById(slm.amj);
        this.f10127qd = view.findViewById(slm.f13269fn);
        this.feb = (ImageView) view.findViewById(slm.f13314xh);
        this.srn = (TextView) view.findViewById(slm.bfa);
        this.f10120jc = (TextView) view.findViewById(slm.f13304tq);
        this.f10121kt = (TextView) view.findViewById(slm.f13280jg);
        this.zyn = view.findViewById(slm.smj);
        this.tnn = (ImageView) view.findViewById(slm.rbz);
        TextView textView = (TextView) view.findViewById(slm.eqw);
        this.f10117fe = textView;
        textView.setText(C2729uq.m10311ri(context, "tt_video_retry_des_txt"));
        this.bnj = (SeekBar) view.findViewById(slm.klz);
        this.siy = (TextView) view.findViewById(slm.tyz);
        this.whw = (TextView) view.findViewById(slm.tyc);
        this.f10129ta = view.findViewById(slm.f13303tn);
        this.f10134xm = (ImageView) view.findViewById(slm.lau);
        this.jbs = view.findViewById(slm.f13281jm);
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p198lr.C3121fi, com.bytedance.sdk.component.utils.igq.InterfaceC2719ri
    /* JADX INFO: renamed from: ri */
    public void mo6180ri(Message message) {
        if (message.what != 1) {
            return;
        }
        mo12864sf();
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p198lr.C3121fi, com.bytedance.sdk.openadsdk.core.widget.tan.InterfaceC3355ri
    /* JADX INFO: renamed from: ri */
    public void mo12855ri(View view, boolean z) {
        if (mo12848qt()) {
            String str = new SimpleDateFormat("HH:mm", Locale.getDefault()).format(new Date());
            if (this.f10053fr != null && !TextUtils.isEmpty(this.f10053fr.m14559xh())) {
                mo12860ri(this.f10053fr.m14559xh());
            }
            this.f10121kt.setText(str);
        } else {
            mo12860ri("");
            this.f10121kt.setText("");
        }
        if (this.f10051dw) {
            return;
        }
        mo12837ik(this.ihz && !this.f10128qh);
        if (slm()) {
            this.f10070zf.mo6419ri(this, view, true, this.f10050di.getVisibility() != 0);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p198lr.C3121fi
    /* JADX INFO: renamed from: ri */
    public void mo12856ri(ViewGroup viewGroup) {
        if (viewGroup != null && (this.f10055ik.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            this.f10128qh = true;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f10055ik.getLayoutParams();
            this.f10122nd = marginLayoutParams.leftMargin;
            this.f10130tw = marginLayoutParams.topMargin;
            this.f10135zb = marginLayoutParams.width;
            this.aac = marginLayoutParams.height;
            marginLayoutParams.width = -1;
            marginLayoutParams.height = -1;
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.leftMargin = 0;
            this.f10055ik.setLayoutParams(marginLayoutParams);
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            if (layoutParams instanceof RelativeLayout.LayoutParams) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                int[] rules = layoutParams2.getRules();
                this.f10133xe = rules.length > 0 ? rules[3] : 0;
                layoutParams2.addRule(3, 0);
                viewGroup.setLayoutParams(layoutParams2);
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
                this.yjm.set(marginLayoutParams2.leftMargin, marginLayoutParams2.topMargin, marginLayoutParams2.rightMargin, marginLayoutParams2.bottomMargin);
                C3583qd.m16613ri(viewGroup, 0, 0, 0, 0);
            }
            mo12843lr(true);
            this.f10134xm.setImageDrawable(C2729uq.m10303ik(this.f10066su, "tt_shrink_video"));
            this.bnj.setThumb(C3586sf.m16645ri(this.f10066su, "tt_seek_thumb_fullscreen_selector"));
            this.bnj.setThumbOffset(0);
            C1977ri.m6209ri((View) this.f10055ik, false);
            m12954fi(this.f10128qh);
            C3583qd.m16612ri(this.f10127qd, 8);
            if (!this.ihz) {
                C3583qd.m16612ri((View) this.f10119ig, 8);
                C3583qd.m16612ri((View) this.f10126pv, 8);
            } else if ((this.f10047ay & 1) == 1) {
                C3583qd.m16612ri((View) this.f10119ig, 8);
            }
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.sdk.openadsdk.core.bgr.p198lr.C3121fi
    /* JADX INFO: renamed from: ri */
    public void mo12958ri(wjv wjvVar, WeakReference<Context> weakReference, boolean z) {
        String strM14535tq;
        String strM10311ri;
        if (wjvVar == null) {
            return;
        }
        m12854ri(this.f10055ik, C3299nr.m14642ri());
        mo12861ri(false, this.ihz);
        C3583qd.m16612ri(this.f10063qt, 0);
        C3583qd.m16612ri((View) this.f10065sf, 0);
        C3583qd.m16612ri(this.f10049co, 0);
        if (this.f10065sf != null && this.f10053fr != null && this.f10053fr.m14389eu() != null && this.f10053fr.m14389eu().m6357qt() != null) {
            C2751lr.m10463lr().m10472ri(this.f10053fr.m14389eu().m6357qt(), this.f10053fr.m14389eu().m6345ik(), this.f10053fr.m14389eu().m6351lr(), this.f10065sf, this.f10053fr);
        }
        if (!TextUtils.isEmpty(wjvVar.tpb())) {
            strM14535tq = wjvVar.tpb();
        } else if (TextUtils.isEmpty(wjvVar.m14559xh())) {
            strM14535tq = !TextUtils.isEmpty(wjvVar.m14535tq()) ? wjvVar.m14535tq() : "";
        } else {
            strM14535tq = wjvVar.m14559xh();
        }
        if (this.f10053fr != null && this.f10053fr.m14391fb() != null && this.f10053fr.m14391fb().m14220ri() != null) {
            C3583qd.m16612ri((View) this.f10046aw, 0);
            C3583qd.m16612ri((View) this.bgr, 4);
            if (this.f10046aw != null) {
                C2751lr.m10463lr().m10470ri(this.f10053fr.m14391fb(), this.f10046aw, wjvVar);
                this.f10046aw.setOnClickListener(this.f10060oh);
                this.f10046aw.setOnTouchListener(this.f10060oh);
            }
        } else if (!TextUtils.isEmpty(strM14535tq)) {
            C3583qd.m16612ri((View) this.f10046aw, 4);
            C3583qd.m16612ri((View) this.bgr, 0);
            if (this.bgr != null) {
                this.bgr.setText(strM14535tq.substring(0, 1));
                this.bgr.setOnClickListener(this.f10060oh);
                this.bgr.setOnTouchListener(this.f10060oh);
            }
        }
        if (this.f10068vr != null && !TextUtils.isEmpty(strM14535tq)) {
            this.f10068vr.setText(strM14535tq);
        }
        C3583qd.m16612ri((View) this.f10068vr, 0);
        C3583qd.m16612ri((View) this.slm, 0);
        int iAdz = wjvVar.adz();
        if (iAdz != 4) {
            strM10311ri = iAdz != 5 ? C2729uq.m10311ri(this.f10066su, "tt_video_mobile_go_detail") : C2729uq.m10311ri(this.f10066su, "tt_video_dial_phone");
        } else {
            strM10311ri = C2729uq.m10311ri(this.f10066su, "tt_video_download_apk");
        }
        if (this.slm != null) {
            this.slm.setText(strM10311ri);
            this.slm.setOnClickListener(this.f10060oh);
            this.slm.setOnTouchListener(this.f10060oh);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p198lr.C3121fi, com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p062ka.InterfaceC2000lr
    /* JADX INFO: renamed from: ri */
    public /* bridge */ /* synthetic */ void mo6405ri(wjv wjvVar, WeakReference weakReference, boolean z) {
        mo12958ri(wjvVar, (WeakReference<Context>) weakReference, z);
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p198lr.C3121fi
    /* JADX INFO: renamed from: ri */
    public void mo12860ri(String str) {
        TextView textView = this.srn;
        if (textView != null) {
            textView.setText(str);
        }
        TextView textView2 = this.f10120jc;
        if (textView2 != null) {
            textView2.setText(str);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p198lr.C3121fi
    /* JADX INFO: renamed from: ri */
    public void mo12861ri(boolean z, boolean z2) {
        C3583qd.m16612ri(this.f10129ta, 8);
        C3583qd.m16612ri(this.f10127qd, 8);
        C3583qd.m16612ri((View) this.f10052fi, 8);
        if (!this.ihz && !this.f10128qh) {
            C3583qd.m16612ri((View) this.f10119ig, 8);
            if ((this.f10047ay & 2) != 2) {
                C3583qd.m16612ri((View) this.f10126pv, 8);
            }
        } else if ((this.f10047ay & 1) == 1) {
            C3583qd.m16612ri((View) this.f10119ig, 8);
        }
        if (z2) {
            C3583qd.m16612ri((View) this.f10119ig, 8);
            C3583qd.m16612ri((View) this.f10126pv, 8);
        }
        mo12837ik(false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p198lr.C3121fi
    /* JADX INFO: renamed from: ri */
    public void mo12862ri(boolean z, boolean z2, boolean z3) {
        C3583qd.m16612ri(this.f10129ta, 0);
        if (this.f10128qh) {
            C3583qd.m16612ri(this.f10127qd, 0);
            C3583qd.m16612ri((View) this.f10120jc, 0);
        } else if (z3) {
            C3583qd.m16612ri(this.f10127qd, 8);
        }
        C3583qd.m16612ri((View) this.f10052fi, (!z || this.f10050di.getVisibility() == 0) ? 8 : 0);
        if (!this.ihz && !this.f10128qh) {
            if ((this.f10047ay & 1) != 1 && !z3) {
                C3583qd.m16612ri((View) this.f10119ig, 0);
            }
            C3583qd.m16612ri((View) this.f10126pv, z3 ? 8 : 0);
        }
        C3583qd.m16612ri((View) this.siy, 0);
        C3583qd.m16612ri((View) this.whw, 0);
        C3583qd.m16612ri((View) this.bnj, 0);
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p198lr.C3121fi, com.bytedance.sdk.openadsdk.core.widget.C3333ac.lr
    /* JADX INFO: renamed from: sf */
    public void mo12864sf() {
        mo12861ri(true, false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.p198lr.C3121fi
    public void xha() {
        C3583qd.m16577di(this.f10050di);
        C3583qd.m16577di(this.xha);
        C3583qd.m16579fi(this.zyn);
        if (this.f10058mj != null && this.f10053fr != null && this.f10053fr.m14389eu() != null && this.f10053fr.m14389eu().m6357qt() != null) {
            C3583qd.m16577di(this.f10058mj);
            C2751lr.m10463lr().m10472ri(this.f10053fr.m14389eu().m6357qt(), this.f10053fr.m14389eu().m6345ik(), this.f10053fr.m14389eu().m6351lr(), this.f10058mj, this.f10053fr);
        }
        if (this.f10052fi.getVisibility() == 0) {
            C3583qd.m16612ri((View) this.f10052fi, 8);
        }
    }
}
