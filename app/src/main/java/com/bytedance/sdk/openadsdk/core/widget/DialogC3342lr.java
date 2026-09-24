package com.bytedance.sdk.openadsdk.core.widget;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.window.OnBackInvokedCallback;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.component.utils.C2729uq;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.p217di.C3191fi;
import com.bytedance.sdk.openadsdk.core.p217di.C3193ka;
import com.bytedance.sdk.openadsdk.core.p217di.C3195mj;
import com.bytedance.sdk.openadsdk.core.p217di.C3196ri;
import com.bytedance.sdk.openadsdk.utils.C3562ay;
import com.bytedance.sdk.openadsdk.utils.C3583qd;
import com.bytedance.sdk.openadsdk.utils.C3586sf;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.widget.lr */
/* JADX INFO: loaded from: classes3.dex */
public class DialogC3342lr extends Dialog {

    /* JADX INFO: renamed from: aw */
    private int f11736aw;
    private OnBackInvokedCallback bgr;

    /* JADX INFO: renamed from: co */
    private String f11737co;

    /* JADX INFO: renamed from: di */
    private C3196ri f11738di;

    /* JADX INFO: renamed from: fi */
    private C3196ri f11739fi;

    /* JADX INFO: renamed from: ik */
    private C3195mj f11740ik;
    private String jbs;

    /* JADX INFO: renamed from: ka */
    private C3195mj f11741ka;

    /* JADX INFO: renamed from: lr */
    private C3193ka f11742lr;

    /* JADX INFO: renamed from: mj */
    private final Context f11743mj;

    /* JADX INFO: renamed from: qt */
    private String f11744qt;

    /* JADX INFO: renamed from: ri */
    public lr f11745ri;

    /* JADX INFO: renamed from: sf */
    private String f11746sf;

    /* JADX INFO: renamed from: vr */
    private boolean f11747vr;
    private View xha;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.widget.lr$lr */
    public interface lr {
        /* JADX INFO: renamed from: lr */
        void mo10702lr();

        /* JADX INFO: renamed from: ri */
        void mo10703ri();
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.widget.lr$ri */
    private static class ri implements OnBackInvokedCallback {

        /* JADX INFO: renamed from: ri */
        private final WeakReference<DialogC3342lr> f11750ri;

        ri(DialogC3342lr dialogC3342lr) {
            this.f11750ri = new WeakReference<>(dialogC3342lr);
        }

        public void onBackInvoked() {
            DialogC3342lr dialogC3342lr = this.f11750ri.get();
            if (dialogC3342lr != null) {
                C2707ac.m10205ri("CustomCommonDialog", "onBackInvoked");
                dialogC3342lr.onBackPressed();
            }
        }
    }

    public DialogC3342lr(Context context) {
        super(context, C2729uq.m10301di(context, "tt_custom_dialog"));
        this.f11736aw = -1;
        this.f11747vr = false;
        this.f11743mj = context;
    }

    /* JADX INFO: renamed from: ik */
    private void m15011ik() {
        if (this.bgr == null || !C3562ay.m16368ri()) {
            return;
        }
        C2707ac.m10205ri("CustomCommonDialog", "isAtLeastT unregisterOnBackInvokedCallback");
        getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.bgr);
    }

    /* JADX INFO: renamed from: lr */
    private void m15012lr() {
        if (TextUtils.isEmpty(this.f11744qt)) {
            this.f11740ik.setVisibility(8);
        } else {
            this.f11740ik.setText(this.f11744qt);
            this.f11740ik.setVisibility(0);
        }
        if (!TextUtils.isEmpty(this.jbs)) {
            this.f11741ka.setText(this.jbs);
        }
        if (TextUtils.isEmpty(this.f11746sf)) {
            this.f11738di.setText(C2729uq.m10311ri(C3299nr.m14642ri(), "tt_postive_txt"));
        } else {
            this.f11738di.setText(this.f11746sf);
        }
        if (TextUtils.isEmpty(this.f11737co)) {
            this.f11739fi.setText(C2729uq.m10311ri(C3299nr.m14642ri(), "tt_negtive_txt"));
        } else {
            this.f11739fi.setText(this.f11737co);
        }
        int i = this.f11736aw;
        if (i != -1) {
            this.f11742lr.setImageResource(i);
            this.f11742lr.setVisibility(0);
        } else {
            this.f11742lr.setVisibility(8);
        }
        if (this.f11747vr) {
            this.xha.setVisibility(8);
            this.f11739fi.setVisibility(8);
        } else {
            this.f11739fi.setVisibility(0);
            this.xha.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: ri */
    private int m15013ri(float f) {
        return C3583qd.m16589lr(getContext(), f);
    }

    /* JADX INFO: renamed from: ri */
    private View m15014ri(Context context) {
        com.bytedance.sdk.openadsdk.core.p217di.xha xhaVar = new com.bytedance.sdk.openadsdk.core.p217di.xha(context);
        xhaVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        C3191fi c3191fi = new C3191fi(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        c3191fi.setMinimumWidth(m15013ri(260.0f));
        c3191fi.setPadding(0, m15013ri(32.0f), 0, 0);
        c3191fi.setBackground(C3586sf.m16645ri(context, "tt_custom_dialog_bg"));
        c3191fi.setOrientation(1);
        c3191fi.setLayoutParams(layoutParams);
        this.f11740ik = new C3195mj(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        layoutParams2.leftMargin = m15013ri(16.0f);
        layoutParams2.rightMargin = m15013ri(16.0f);
        layoutParams2.bottomMargin = m15013ri(16.0f);
        this.f11740ik.setGravity(17);
        this.f11740ik.setVisibility(0);
        this.f11740ik.setTextColor(Color.parseColor("#333333"));
        this.f11740ik.setTextSize(18.0f);
        this.f11740ik.setLayoutParams(layoutParams2);
        this.f11742lr = new C3193ka(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 17;
        layoutParams3.leftMargin = m15013ri(16.0f);
        layoutParams3.rightMargin = m15013ri(16.0f);
        layoutParams3.bottomMargin = m15013ri(10.0f);
        this.f11742lr.setMaxHeight(m15013ri(150.0f));
        this.f11742lr.setMaxWidth(m15013ri(150.0f));
        this.f11742lr.setVisibility(0);
        this.f11742lr.setLayoutParams(layoutParams3);
        this.f11741ka = new C3195mj(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.leftMargin = m15013ri(20.0f);
        layoutParams4.rightMargin = m15013ri(20.0f);
        this.f11741ka.setGravity(17);
        this.f11741ka.setLineSpacing(m15013ri(3.0f), 1.2f);
        this.f11741ka.setTextSize(18.0f);
        this.f11741ka.setTextColor(Color.parseColor("#000000"));
        this.f11741ka.setLayoutParams(layoutParams4);
        View view = new View(context);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, 1);
        layoutParams5.topMargin = m15013ri(32.0f);
        view.setBackgroundColor(Color.parseColor("#E4E4E4"));
        view.setLayoutParams(layoutParams5);
        C3191fi c3191fi2 = new C3191fi(context);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
        c3191fi2.setOrientation(0);
        c3191fi2.setLayoutParams(layoutParams6);
        C3196ri c3196ri = new C3196ri(context);
        this.f11739fi = c3196ri;
        c3196ri.setId(520093718);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(0, -2);
        layoutParams7.leftMargin = m15013ri(10.0f);
        layoutParams7.weight = 1.0f;
        this.f11739fi.setPadding(0, m15013ri(16.0f), 0, m15013ri(16.0f));
        this.f11739fi.setBackground(null);
        this.f11739fi.setGravity(17);
        this.f11739fi.setSingleLine(true);
        this.f11739fi.setTextColor(Color.parseColor("#999999"));
        this.f11739fi.setTextSize(16.0f);
        this.f11739fi.setLayoutParams(layoutParams7);
        this.xha = new View(context);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(1, -1);
        this.xha.setBackgroundColor(Color.parseColor("#E4E4E4"));
        this.xha.setLayoutParams(layoutParams8);
        this.f11738di = new C3196ri(context);
        this.f11739fi.setId(520093719);
        LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(0, -2);
        layoutParams9.rightMargin = m15013ri(10.0f);
        layoutParams9.weight = 1.0f;
        this.f11738di.setPadding(0, m15013ri(16.0f), 0, m15013ri(16.0f));
        this.f11738di.setBackground(null);
        this.f11738di.setGravity(17);
        this.f11738di.setSingleLine(true);
        this.f11738di.setTextColor(Color.parseColor("#38ADFF"));
        this.f11738di.setTextSize(16.0f);
        this.f11738di.setLayoutParams(layoutParams9);
        xhaVar.addView(c3191fi);
        c3191fi.addView(this.f11740ik);
        c3191fi.addView(this.f11742lr);
        c3191fi.addView(this.f11741ka);
        c3191fi.addView(view);
        c3191fi.addView(c3191fi2);
        c3191fi2.addView(this.f11739fi);
        c3191fi2.addView(this.xha);
        c3191fi2.addView(this.f11738di);
        return xhaVar;
    }

    /* JADX INFO: renamed from: ri */
    private void m15015ri() {
        this.f11738di.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.lr.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (DialogC3342lr.this.f11745ri != null) {
                    DialogC3342lr.this.f11745ri.mo10703ri();
                }
            }
        });
        this.f11739fi.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.lr.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (DialogC3342lr.this.f11745ri != null) {
                    DialogC3342lr.this.f11745ri.mo10702lr();
                }
            }
        });
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        m15011ik();
    }

    /* JADX INFO: renamed from: ik */
    public DialogC3342lr m15016ik(String str) {
        this.f11737co = str;
        return this;
    }

    /* JADX INFO: renamed from: lr */
    public DialogC3342lr m15017lr(String str) {
        this.f11746sf = str;
        return this;
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        C2707ac.m10205ri("CustomCommonDialog", "onBackPressed");
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(m15014ri(this.f11743mj));
        if (C3562ay.m16368ri()) {
            C2707ac.m10205ri("CustomCommonDialog", "isAtLeastT registerOnBackInvokedCallback");
            this.bgr = new ri(this);
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.bgr);
        }
        setCanceledOnTouchOutside(false);
        m15012lr();
        m15015ri();
    }

    /* JADX INFO: renamed from: ri */
    public DialogC3342lr m15018ri(lr lrVar) {
        this.f11745ri = lrVar;
        return this;
    }

    /* JADX INFO: renamed from: ri */
    public DialogC3342lr m15019ri(String str) {
        this.jbs = str;
        return this;
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        m15012lr();
    }
}
