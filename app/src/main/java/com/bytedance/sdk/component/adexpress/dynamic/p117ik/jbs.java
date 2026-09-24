package com.bytedance.sdk.component.adexpress.dynamic.p117ik;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.C2490ka;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.AbstractC2412fi;
import com.bytedance.sdk.component.adexpress.dynamic.p117ik.p118ri.ViewOnTouchListenerC2458di;
import com.bytedance.sdk.component.adexpress.dynamic.p117ik.p118ri.ViewOnTouchListenerC2459fi;
import com.bytedance.sdk.component.adexpress.dynamic.p117ik.p118ri.ViewOnTouchListenerC2460ik;
import com.bytedance.sdk.component.adexpress.dynamic.p117ik.p118ri.ViewOnTouchListenerC2461ka;
import com.bytedance.sdk.component.adexpress.dynamic.p117ik.p118ri.ViewOnTouchListenerC2462lr;
import com.bytedance.sdk.component.adexpress.dynamic.p117ik.p118ri.ViewOnTouchListenerC2463mj;
import com.bytedance.sdk.component.adexpress.dynamic.p117ik.p118ri.ViewOnTouchListenerC2464ri;
import com.bytedance.sdk.component.adexpress.dynamic.p119ka.C2476qt;
import com.bytedance.sdk.component.adexpress.dynamic.p119ka.xha;
import com.bytedance.sdk.component.adexpress.p113di.C2370bu;
import com.bytedance.sdk.component.adexpress.p113di.C2372di;
import com.bytedance.sdk.component.adexpress.p113di.C2374fr;
import com.bytedance.sdk.component.adexpress.p113di.C2377ik;
import com.bytedance.sdk.component.adexpress.p113di.C2381nr;
import com.bytedance.sdk.component.adexpress.p125lr.C2500aw;
import com.google.common.base.Ascii;
import com.ironsource.C11366Bc;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* JADX INFO: loaded from: classes3.dex */
public class jbs extends FrameLayout implements InterfaceC2454mj {

    /* JADX INFO: renamed from: co */
    private C2500aw f6600co;

    /* JADX INFO: renamed from: di */
    private String f6601di;

    /* JADX INFO: renamed from: fi */
    private xha f6602fi;

    /* JADX INFO: renamed from: ik */
    private xha f6603ik;
    private int jbs;

    /* JADX INFO: renamed from: ka */
    private View f6604ka;

    /* JADX INFO: renamed from: lr */
    private AbstractC2412fi f6605lr;

    /* JADX INFO: renamed from: mj */
    private View.OnTouchListener f6606mj;

    /* JADX INFO: renamed from: qt */
    private boolean f6607qt;

    /* JADX INFO: renamed from: ri */
    private Context f6608ri;

    /* JADX INFO: renamed from: sf */
    private C2476qt f6609sf;
    private C2370bu xha;

    public jbs(Context context, AbstractC2412fi abstractC2412fi, xha xhaVar) {
        super(context);
        this.f6608ri = context;
        this.f6605lr = abstractC2412fi;
        this.f6603ik = xhaVar;
        xha();
    }

    public jbs(Context context, AbstractC2412fi abstractC2412fi, xha xhaVar, C2476qt c2476qt, C2500aw c2500aw) {
        super(context);
        this.f6608ri = context;
        this.f6605lr = abstractC2412fi;
        this.f6603ik = xhaVar;
        this.f6609sf = c2476qt;
        this.f6600co = c2500aw;
        xha();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jbs() {
        if (this.f6606mj != null) {
            setOnClickListener((View.OnClickListener) this.f6605lr.getDynamicClickListener());
            performClick();
            if (this.f6603ik.hpn()) {
                return;
            }
            setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: mj */
    private boolean m8436mj() {
        return (this.f6603ik.m8716qh() || TextUtils.equals("9", this.f6601di) || TextUtils.equals("16", this.f6601di) || TextUtils.equals("17", this.f6601di) || TextUtils.equals("18", this.f6601di) || TextUtils.equals("20", this.f6601di) || TextUtils.equals("29", this.f6601di) || TextUtils.equals("10", this.f6601di)) ? false : true;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: ri */
    private void m8438ri(ViewGroup viewGroup) {
        if (this.f6604ka == null) {
            return;
        }
        String str = this.f6601di;
        str.hashCode();
        byte b = -1;
        switch (str.hashCode()) {
            case 48:
                if (str.equals("0")) {
                    b = 0;
                }
                break;
            case 49:
                if (str.equals("1")) {
                    b = 1;
                }
                break;
            case 50:
                if (str.equals("2")) {
                    b = 2;
                }
                break;
            case 53:
                if (str.equals(CampaignEx.CLICKMODE_ON)) {
                    b = 3;
                }
                break;
            case 54:
                if (str.equals("6")) {
                    b = 4;
                }
                break;
            case 55:
                if (str.equals(C11366Bc.f23952e)) {
                    b = 5;
                }
                break;
            case 56:
                if (str.equals("8")) {
                    b = 6;
                }
                break;
            case 57:
                if (str.equals("9")) {
                    b = 7;
                }
                break;
            case 1567:
                if (str.equals("10")) {
                    b = 8;
                }
                break;
            case 1568:
                if (str.equals("11")) {
                    b = 9;
                }
                break;
            case 1569:
                if (str.equals("12")) {
                    b = 10;
                }
                break;
            case 1570:
                if (str.equals("13")) {
                    b = Ascii.f22503VT;
                }
                break;
            case 1571:
                if (str.equals("14")) {
                    b = Ascii.f22492FF;
                }
                break;
            case 1573:
                if (str.equals("16")) {
                    b = Ascii.f22490CR;
                }
                break;
            case 1574:
                if (str.equals("17")) {
                    b = Ascii.f22500SO;
                }
                break;
            case 1575:
                if (str.equals("18")) {
                    b = Ascii.f22499SI;
                }
                break;
            case 1598:
                if (str.equals("20")) {
                    b = Ascii.DLE;
                }
                break;
            case 1600:
                if (str.equals("22")) {
                    b = 17;
                }
                break;
            case 1601:
                if (str.equals("23")) {
                    b = Ascii.DC2;
                }
                break;
            case 1602:
                if (str.equals("24")) {
                    b = 19;
                }
                break;
            case 1603:
                if (str.equals("25")) {
                    b = Ascii.DC4;
                }
                break;
            case 1607:
                if (str.equals("29")) {
                    b = Ascii.NAK;
                }
                break;
        }
        switch (b) {
            case 0:
                this.f6606mj = new ViewOnTouchListenerC2459fi(this, this.jbs);
                setBackgroundColor(Color.parseColor("#80000000"));
                break;
            case 1:
            case 4:
                if (!this.f6603ik.gcp() || TextUtils.isEmpty(this.f6603ik.m8724tw())) {
                    setBackgroundColor(Color.parseColor("#80000000"));
                }
                this.f6606mj = new ViewOnTouchListenerC2458di(this);
                break;
            case 2:
            case 5:
                setBackgroundColor(Color.parseColor("#80000000"));
                this.f6606mj = new ViewOnTouchListenerC2462lr(this, this);
                break;
            case 3:
                if (!this.f6603ik.gcp() || TextUtils.isEmpty(this.f6603ik.m8724tw())) {
                    setBackgroundColor(Color.parseColor("#80000000"));
                } else {
                    setBackgroundColor(xha.m8692ri(this.f6603ik.m8724tw()));
                }
                this.f6606mj = new ViewOnTouchListenerC2460ik(this);
                this.f6604ka.setTag(2);
                break;
            case 6:
            case 9:
                this.f6605lr.setClipChildren(false);
                this.f6605lr.setClipChildren(false);
                ViewGroup viewGroup2 = (ViewGroup) this.f6605lr.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.setClipChildren(false);
                    viewGroup2.setClipToPadding(false);
                }
                this.f6606mj = new ViewOnTouchListenerC2458di(this);
                break;
            case 7:
            case 14:
                this.f6604ka.setTag(2);
                break;
            case 8:
                this.f6606mj = new ViewOnTouchListenerC2461ka(this, this.jbs, this.f6607qt);
                break;
            case 10:
                this.f6606mj = new ViewOnTouchListenerC2460ik(this);
                this.f6604ka.setTag(2);
                break;
            case 11:
            case 19:
                if (this.f6601di.equals("24") && C2490ka.m8810lr()) {
                    this.f6605lr.setClipChildren(false);
                    this.f6606mj = new ViewOnTouchListenerC2458di(this);
                } else {
                    this.f6606mj = new ViewOnTouchListenerC2459fi(this, this.jbs);
                }
                break;
            case 12:
                this.f6606mj = new ViewOnTouchListenerC2462lr(this, this);
                break;
            case 13:
                View view = this.f6604ka;
                if (view != null && (view instanceof C2381nr) && ((C2381nr) view).getShakeLayout() != null) {
                    ((C2381nr) this.f6604ka).getShakeLayout().setTag(2);
                }
                this.f6604ka.setTag(2);
                break;
            case 15:
                View view2 = this.f6604ka;
                if (view2 != null && (view2 instanceof C2374fr) && ((C2374fr) view2).getWriggleLayout() != null) {
                    ((C2374fr) this.f6604ka).getWriggleLayout().setTag(2);
                }
                this.f6604ka.setTag(2);
                break;
            case 16:
                this.f6606mj = new ViewOnTouchListenerC2464ri(this, this.jbs, viewGroup);
                break;
            case 17:
                if (!C2490ka.m8810lr()) {
                    this.f6606mj = new com.bytedance.sdk.component.adexpress.dynamic.p117ik.p118ri.xha(this, this.jbs, viewGroup);
                } else {
                    this.f6606mj = new ViewOnTouchListenerC2463mj(this, this.f6607qt);
                }
                break;
            case 18:
                if (C2490ka.m8810lr()) {
                    this.f6606mj = new ViewOnTouchListenerC2458di(this);
                }
                break;
            case 20:
                if (C2490ka.m8810lr()) {
                    this.f6606mj = new ViewOnTouchListenerC2463mj(this, this.f6607qt);
                }
                break;
            case 21:
                View view3 = this.f6604ka;
                if (view3 != null && (view3 instanceof C2372di) && ((C2372di) view3).getShakeView() != null) {
                    ((C2372di) this.f6604ka).getShakeView().setTag(2);
                }
                this.f6606mj = new ViewOnTouchListenerC2459fi(this, this.jbs);
                break;
        }
        View.OnTouchListener onTouchListener = this.f6606mj;
        if (onTouchListener != null) {
            setOnTouchListener(onTouchListener);
        }
        if (m8436mj()) {
            this.f6604ka.setTag(2);
            setOnClickListener((View.OnClickListener) this.f6605lr.getDynamicClickListener());
        }
    }

    /* JADX INFO: renamed from: ri */
    private boolean m8439ri(String str) {
        return TextUtils.equals(str, "24") || TextUtils.equals(str, "23") || TextUtils.equals(str, "25") || TextUtils.equals(str, "22") || TextUtils.equals(str, "1");
    }

    private void xha() {
        setBackgroundColor(0);
        setClipChildren(false);
        setClipToPadding(false);
        this.f6601di = this.f6603ik.m8707kt();
        this.jbs = this.f6603ik.tnn();
        this.f6607qt = this.f6603ik.m8716qh();
        xha xhaVarM8449ri = C2456qt.m8449ri(this.f6608ri, this.f6605lr, this.f6603ik, this.f6609sf, this.f6600co);
        this.f6602fi = xhaVarM8449ri;
        if (xhaVarM8449ri != null) {
            this.f6604ka = xhaVarM8449ri.mo8425ik();
            if (this.f6603ik.feb()) {
                setBackgroundColor(Color.parseColor("#50000000"));
            }
            if (TextUtils.equals(this.f6601di, "6")) {
                if (!this.f6603ik.gcp() || TextUtils.isEmpty(this.f6603ik.m8724tw())) {
                    this.xha = new C2370bu(this.f6608ri, Color.parseColor("#99000000"));
                } else {
                    this.xha = new C2370bu(this.f6608ri, xha.m8692ri(this.f6603ik.m8724tw()));
                }
                FrameLayout frameLayout = new FrameLayout(this.f6608ri);
                frameLayout.addView(this.xha, new FrameLayout.LayoutParams(-1, -1));
                frameLayout.setClipChildren(true);
                addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
                post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.ik.jbs.1
                    @Override // java.lang.Runnable
                    public void run() {
                        jbs.this.xha.m8207lr();
                    }
                });
            }
            if (m8439ri(this.f6601di) && C2490ka.m8810lr()) {
                int color = Color.parseColor("#99000000");
                if (this.f6603ik.gcp() && !TextUtils.isEmpty(this.f6603ik.m8724tw())) {
                    try {
                        color = xha.m8692ri(this.f6603ik.m8724tw());
                    } catch (Exception unused) {
                    }
                }
                View view = new View(this.f6608ri);
                view.setBackgroundColor(color);
                addView(view, new FrameLayout.LayoutParams(-1, -1));
            }
            addView(this.f6602fi.mo8425ik());
            m8438ri(this.f6602fi.mo8425ik());
            setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: di */
    public void m8440di() {
        if (this.f6604ka != null && TextUtils.equals(this.f6601di, "2")) {
            View view = this.f6604ka;
            if (view instanceof C2377ik) {
                ((C2377ik) view).m8230ka();
            }
        }
    }

    /* JADX INFO: renamed from: fi */
    public void m8441fi() {
        if (this.f6604ka != null && TextUtils.equals(this.f6601di, "2")) {
            View view = this.f6604ka;
            if (view instanceof C2377ik) {
                ((C2377ik) view).m8229ik();
            }
        }
    }

    /* JADX INFO: renamed from: ik */
    public void m8442ik() {
        xha xhaVar = this.f6602fi;
        if (xhaVar != null) {
            xhaVar.mo8428ri();
        }
    }

    /* JADX INFO: renamed from: ka */
    public void m8443ka() {
        xha xhaVar = this.f6602fi;
        if (xhaVar != null) {
            xhaVar.mo8427lr();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.p117ik.InterfaceC2454mj
    /* JADX INFO: renamed from: lr */
    public void mo8444lr() {
        if (m8436mj()) {
            setOnClickListener((View.OnClickListener) this.f6605lr.getDynamicClickListener());
            performClick();
            if (this.f6603ik.hpn()) {
                return;
            }
            setVisibility(8);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            xha xhaVar = this.f6602fi;
            if (xhaVar != null) {
                xhaVar.mo8427lr();
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f6606mj instanceof ViewOnTouchListenerC2460ik) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.p117ik.InterfaceC2454mj
    /* JADX INFO: renamed from: ri */
    public void mo8445ri() {
        if (!TextUtils.equals(this.f6601di, "6")) {
            if (TextUtils.equals(this.f6601di, "20")) {
                postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.ik.jbs.3
                    @Override // java.lang.Runnable
                    public void run() {
                        jbs.this.jbs();
                    }
                }, 400L);
                return;
            } else {
                jbs();
                return;
            }
        }
        C2370bu c2370bu = this.xha;
        if (c2370bu != null) {
            c2370bu.m8206ik();
            postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.ik.jbs.2
                @Override // java.lang.Runnable
                public void run() {
                    jbs.this.jbs();
                }
            }, 300L);
        }
    }
}
