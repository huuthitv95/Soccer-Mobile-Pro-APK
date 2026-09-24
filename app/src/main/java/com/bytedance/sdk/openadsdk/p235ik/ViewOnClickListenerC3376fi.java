package com.bytedance.sdk.openadsdk.p235ik;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.component.utils.C2729uq;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.p217di.C3191fi;
import com.bytedance.sdk.openadsdk.core.p217di.C3195mj;
import com.bytedance.sdk.openadsdk.utils.C3583qd;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.ik.fi */
/* JADX INFO: loaded from: classes3.dex */
public class ViewOnClickListenerC3376fi extends C3191fi implements View.OnClickListener, C3386qt.ik {

    /* JADX INFO: renamed from: di */
    private StateListDrawable f12005di;

    /* JADX INFO: renamed from: fi */
    private FilterWord f12006fi;

    /* JADX INFO: renamed from: ka */
    private final C3386qt f12007ka;
    private final int xha;

    /* JADX INFO: renamed from: ri */
    public static FilterWord f12004ri = new FilterWord("100:1", "GOOD");

    /* JADX INFO: renamed from: lr */
    public static FilterWord f12003lr = new FilterWord("100:2", "NOT_BAD");

    /* JADX INFO: renamed from: ik */
    public static FilterWord f12002ik = new FilterWord("100:3", "BAD");

    public ViewOnClickListenerC3376fi(Context context, int i, C3386qt c3386qt) {
        super(context);
        this.xha = i;
        this.f12007ka = c3386qt;
        if (c3386qt != null) {
            c3386qt.m15330ri(this);
        }
        m15281ri(i);
        m15280ri();
        m15279lr();
    }

    /* JADX INFO: renamed from: lr */
    private void m15279lr() {
        C3195mj c3195mj = new C3195mj(getContext());
        c3195mj.setTextSize(this.f12007ka.jbs() ? 40 : 30);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        layoutParams.setMargins(0, C3583qd.m16589lr(getContext(), 12.0f), 0, C3583qd.m16589lr(getContext(), this.f12007ka.jbs() ? 8.0f : 4.0f));
        addView(c3195mj, layoutParams);
        C3387ri c3387ri = new C3387ri(getContext());
        c3387ri.setTextSize(this.f12007ka.jbs() ? 17 : 12);
        c3387ri.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        c3387ri.setMaxLines(1);
        c3387ri.setSingleLine();
        c3387ri.setGravity(17);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 1;
        layoutParams2.setMargins(0, 0, 0, C3583qd.m16589lr(getContext(), 12.0f));
        addView(c3387ri, layoutParams2);
        int i = this.xha;
        if (i == 1) {
            c3195mj.setText("😍");
            c3387ri.setText(C2729uq.m10311ri(getContext(), "tt_good"));
        } else if (i == 2) {
            c3387ri.setText(C2729uq.m10311ri(getContext(), "tt_not_bad"));
            c3195mj.setText("😐");
        } else {
            if (i != 3) {
                return;
            }
            c3387ri.setText(C2729uq.m10311ri(getContext(), "tt_bad"));
            c3195mj.setText("😡");
        }
    }

    /* JADX INFO: renamed from: ri */
    private void m15280ri() {
        if (this.f12005di == null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(C3583qd.m16589lr(getContext(), 12.0f));
            gradientDrawable.setColor(Color.parseColor("#F8F8F8"));
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setStroke(C3583qd.m16589lr(getContext(), 2.0f), Color.parseColor("#FE2C55"));
            gradientDrawable2.setCornerRadius(C3583qd.m16589lr(getContext(), 12.0f));
            gradientDrawable2.setColor(Color.parseColor("#12FE2C55"));
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f12005di = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_selected}, gradientDrawable2);
            this.f12005di.addState(new int[0], gradientDrawable);
        }
        setBackground(this.f12005di);
        setSelected(false);
        setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.weight = 1.0f;
        setLayoutParams(layoutParams);
        setOnClickListener(this);
    }

    /* JADX INFO: renamed from: ri */
    private void m15281ri(int i) {
        if (i == 1) {
            this.f12006fi = f12004ri;
        } else if (i == 2) {
            this.f12006fi = f12003lr;
        } else {
            if (i != 3) {
                return;
            }
            this.f12006fi = f12002ik;
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (isSelected()) {
            this.f12007ka.m15328ri(C3386qt.f12042ri);
        } else {
            this.f12007ka.m15328ri(this.f12006fi);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.p235ik.C3386qt.ik
    /* JADX INFO: renamed from: ri */
    public void mo15282ri(FilterWord filterWord) {
        FilterWord filterWord2;
        if (filterWord == null || (filterWord2 = this.f12006fi) == null) {
            return;
        }
        setSelected(filterWord.equals(filterWord2));
    }
}
