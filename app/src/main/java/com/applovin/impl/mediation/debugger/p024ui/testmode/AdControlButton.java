package com.applovin.impl.mediation.debugger.p024ui.testmode;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.applovin.impl.C1478a;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.C1846R;

/* JADX INFO: loaded from: classes3.dex */
public class AdControlButton extends RelativeLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    private final GradientDrawable f2254a;

    /* JADX INFO: renamed from: b */
    private final Button f2255b;

    /* JADX INFO: renamed from: c */
    private final C1478a f2256c;

    /* JADX INFO: renamed from: d */
    private EnumC1650b f2257d;

    /* JADX INFO: renamed from: e */
    private MaxAdFormat f2258e;

    /* JADX INFO: renamed from: f */
    private InterfaceC1649a f2259f;

    /* JADX INFO: renamed from: com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton$a */
    public interface InterfaceC1649a {
        void onClick(AdControlButton adControlButton);
    }

    /* JADX INFO: renamed from: com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton$b */
    public enum EnumC1650b {
        LOAD,
        LOADING,
        SHOW
    }

    public AdControlButton(Context context) {
        this(context, null, 0);
    }

    public AdControlButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AdControlButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.f2254a = gradientDrawable;
        Button button = new Button(getContext());
        this.f2255b = button;
        C1478a c1478a = new C1478a(getContext(), 20, R.attr.progressBarStyleSmall);
        this.f2256c = c1478a;
        EnumC1650b enumC1650b = EnumC1650b.LOAD;
        this.f2257d = enumC1650b;
        setBackgroundColor(0);
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1, 17));
        button.setOnClickListener(this);
        frameLayout.addView(button, new FrameLayout.LayoutParams(-1, -1, 17));
        gradientDrawable.setCornerRadius(20.0f);
        button.setBackground(gradientDrawable);
        m3451a();
        c1478a.setColor(-1);
        addView(c1478a, new FrameLayout.LayoutParams(-1, -1, 17));
        m3453c(enumC1650b);
    }

    /* JADX INFO: renamed from: a */
    private int m3450a(EnumC1650b enumC1650b) {
        if (EnumC1650b.LOAD != enumC1650b && EnumC1650b.LOADING != enumC1650b) {
            return getContext().getColor(C1846R.color.applovin_sdk_adControlbutton_brightBlueColor);
        }
        return getContext().getColor(C1846R.color.applovin_sdk_brand_color);
    }

    /* JADX INFO: renamed from: a */
    private void m3451a() {
        this.f2255b.setTextColor(new ColorStateList(new int[][]{new int[]{R.attr.state_pressed}, new int[0]}, new int[]{getContext().getColor(C1846R.color.applovin_sdk_highlightTextColor), -1}));
    }

    /* JADX INFO: renamed from: b */
    private String m3452b(EnumC1650b enumC1650b) {
        if (EnumC1650b.LOAD == enumC1650b) {
            return "Load";
        }
        return EnumC1650b.LOADING == enumC1650b ? "" : "Show";
    }

    /* JADX INFO: renamed from: c */
    private void m3453c(EnumC1650b enumC1650b) {
        if (EnumC1650b.LOADING == enumC1650b) {
            setEnabled(false);
            this.f2256c.m1758a();
        } else {
            setEnabled(true);
            this.f2256c.m1759b();
        }
        this.f2255b.setText(m3452b(enumC1650b));
        this.f2254a.setColor(m3450a(enumC1650b));
    }

    public EnumC1650b getControlState() {
        return this.f2257d;
    }

    public MaxAdFormat getFormat() {
        return this.f2258e;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        InterfaceC1649a interfaceC1649a = this.f2259f;
        if (interfaceC1649a != null) {
            interfaceC1649a.onClick(this);
        }
    }

    public void setControlState(EnumC1650b enumC1650b) {
        if (this.f2257d != enumC1650b) {
            m3453c(enumC1650b);
        }
        this.f2257d = enumC1650b;
    }

    public void setFormat(MaxAdFormat maxAdFormat) {
        this.f2258e = maxAdFormat;
    }

    public void setOnClickListener(InterfaceC1649a interfaceC1649a) {
        this.f2259f = interfaceC1649a;
    }
}
