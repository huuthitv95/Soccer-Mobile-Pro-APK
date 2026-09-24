package com.bytedance.sdk.openadsdk.p235ik;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.view.GravityCompat;
import com.bytedance.sdk.component.utils.C2729uq;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.p217di.C3191fi;
import com.bytedance.sdk.openadsdk.core.p217di.C3193ka;
import com.bytedance.sdk.openadsdk.core.p217di.C3194lr;
import com.bytedance.sdk.openadsdk.core.p217di.C3195mj;
import com.bytedance.sdk.openadsdk.core.p217di.xha;
import com.bytedance.sdk.openadsdk.utils.C3583qd;
import com.bytedance.sdk.openadsdk.utils.C3586sf;
import java.util.Locale;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.ik.co */
/* JADX INFO: loaded from: classes3.dex */
public class DialogC3374co extends Dialog {

    /* JADX INFO: renamed from: di */
    private C3193ka f11990di;

    /* JADX INFO: renamed from: fi */
    private C3195mj f11991fi;

    /* JADX INFO: renamed from: ik */
    private C3194lr f11992ik;

    /* JADX INFO: renamed from: ka */
    private C3195mj f11993ka;

    /* JADX INFO: renamed from: lr */
    private ri f11994lr;

    /* JADX INFO: renamed from: ri */
    private C3191fi f11995ri;
    private final C3386qt xha;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.ik.co$ri */
    public interface ri {
        /* JADX INFO: renamed from: ik */
        void mo11276ik();

        /* JADX INFO: renamed from: lr */
        void mo11277lr();

        /* JADX INFO: renamed from: ri */
        void mo11278ri();

        /* JADX INFO: renamed from: ri */
        void mo11279ri(int i, FilterWord filterWord, String str);
    }

    public DialogC3374co(Context context, C3386qt c3386qt) {
        super(context, C2729uq.m10301di(context, "tt_quick_option_dialog"));
        setCanceledOnTouchOutside(false);
        this.xha = c3386qt;
    }

    /* JADX INFO: renamed from: ik */
    private void m15263ik() {
        setCanceledOnTouchOutside(true);
        setCancelable(true);
        Window window = getWindow();
        if (window != null) {
            if (window.getDecorView() != null) {
                window.getDecorView().setPadding(0, 0, 0, 0);
            }
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.height = -2;
            window.setAttributes(attributes);
            window.setGravity(80);
        }
    }

    /* JADX INFO: renamed from: ka */
    private void m15265ka() {
        setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.bytedance.sdk.openadsdk.ik.co.5
            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(DialogInterface dialogInterface) {
                if (DialogC3374co.this.f11994lr != null) {
                    DialogC3374co.this.f11994lr.mo11276ik();
                }
            }
        });
    }

    /* JADX INFO: renamed from: ri */
    private C3191fi m15267ri(Context context) {
        C3191fi c3191fi = new C3191fi(context);
        c3191fi.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        c3191fi.setOrientation(1);
        c3191fi.setBackground(C3586sf.m16645ri(context, "tt_dislike_dialog_bg"));
        xha xhaVar = new xha(context);
        xhaVar.setLayoutParams(new LinearLayout.LayoutParams(-1, C3583qd.m16589lr(context, 48.0f)));
        this.f11990di = new C3193ka(context);
        int iM16589lr = C3583qd.m16589lr(context, 24.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iM16589lr, iM16589lr);
        layoutParams.addRule(16);
        layoutParams.addRule(11);
        int iM16589lr2 = C3583qd.m16589lr(context, 10.0f);
        layoutParams.topMargin = iM16589lr2;
        layoutParams.rightMargin = iM16589lr2;
        this.f11990di.setLayoutParams(layoutParams);
        this.f11990di.setClickable(true);
        this.f11990di.setFocusable(true);
        this.f11990di.setImageDrawable(C3586sf.m16645ri(context, "tt_titlebar_close_seletor"));
        C3195mj c3195mj = new C3195mj(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(16);
        layoutParams2.topMargin = C3583qd.m16589lr(context, 12.0f);
        c3195mj.setLayoutParams(layoutParams2);
        c3195mj.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        c3195mj.setGravity(17);
        c3195mj.setSingleLine(true);
        c3195mj.setText(C2729uq.m10311ri(context, "tt_other_reason"));
        c3195mj.setTextColor(Color.parseColor("#161823"));
        c3195mj.setTextSize(15.0f);
        c3195mj.setTypeface(Typeface.defaultFromStyle(0));
        View view = new View(context);
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, C3583qd.m16589lr(context, 0.5f)));
        view.setBackgroundColor(Color.argb(51, 22, 24, 35));
        C3191fi c3191fi2 = new C3191fi(context);
        c3191fi2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        c3191fi2.setOrientation(1);
        C3194lr c3194lr = new C3194lr(context);
        this.f11992ik = c3194lr;
        c3194lr.setFilters(new InputFilter[]{new InputFilter.LengthFilter(200), new InputFilter.AllCaps()});
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.leftMargin = C3583qd.m16589lr(context, 16.0f);
        layoutParams3.rightMargin = C3583qd.m16589lr(context, 16.0f);
        layoutParams3.topMargin = C3583qd.m16589lr(context, 11.5f);
        this.f11992ik.setLayoutParams(layoutParams3);
        this.f11992ik.setLines(4);
        this.f11992ik.setGravity(48);
        this.f11992ik.setTextSize(15.0f);
        this.f11992ik.setTextColor(Color.rgb(22, 24, 35));
        this.f11992ik.setHintTextColor(Color.parseColor("#57161823"));
        this.f11992ik.setBackground(null);
        this.f11992ik.setImeOptions(268435456);
        C3191fi c3191fi3 = new C3191fi(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        int iM16589lr3 = C3583qd.m16589lr(context, 16.0f);
        int iM16589lr4 = C3583qd.m16589lr(context, 17.0f);
        c3191fi3.setPadding(iM16589lr3, iM16589lr4, iM16589lr3, iM16589lr4);
        c3191fi3.setLayoutParams(layoutParams4);
        c3191fi3.setOrientation(0);
        this.f11993ka = new C3195mj(context);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(0, -2);
        layoutParams5.weight = 1.0f;
        layoutParams5.gravity = GravityCompat.START;
        this.f11993ka.setLayoutParams(layoutParams5);
        this.f11993ka.setText(String.format("0%s", "/200"));
        this.f11993ka.setGravity(GravityCompat.START);
        this.f11993ka.setTextColor(Color.parseColor("#57161823"));
        this.f11993ka.setTextSize(15.0f);
        this.f11991fi = new C3195mj(context);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams6.gravity = GravityCompat.END;
        this.f11991fi.setLayoutParams(layoutParams6);
        this.f11991fi.setTextSize(14.0f);
        this.f11991fi.setTextColor(-1);
        this.f11991fi.setVisibility(0);
        this.f11991fi.setSingleLine(true);
        int iM16589lr5 = C3583qd.m16589lr(context, 27.0f);
        int iM16589lr6 = C3583qd.m16589lr(context, 5.0f);
        this.f11991fi.setPadding(iM16589lr5, iM16589lr6, iM16589lr5, iM16589lr6);
        int iM16589lr7 = C3583qd.m16589lr(context, 6.0f);
        GradientDrawable gradientDrawable = new GradientDrawable();
        float f = iM16589lr7;
        gradientDrawable.setCornerRadius(f);
        int iRgb = Color.rgb(254, 44, 85);
        gradientDrawable.setColor(iRgb);
        gradientDrawable.setAlpha(102);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius(f);
        gradientDrawable2.setColor(iRgb);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_enabled}, gradientDrawable2);
        stateListDrawable.addState(new int[0], gradientDrawable);
        this.f11991fi.setBackground(stateListDrawable);
        this.f11991fi.setText(C2729uq.m10311ri(context, "tt_done"));
        this.f11991fi.setEnabled(false);
        c3191fi.addView(xhaVar);
        c3191fi.addView(view);
        c3191fi.addView(c3191fi2);
        xhaVar.addView(this.f11990di);
        xhaVar.addView(c3195mj);
        c3191fi2.addView(this.f11992ik);
        c3191fi2.addView(c3191fi3);
        c3191fi3.addView(this.f11993ka);
        c3191fi3.addView(this.f11991fi);
        return c3191fi;
    }

    /* JADX INFO: renamed from: ri */
    private void m15269ri(View view) {
        m15270ri((EditText) this.f11992ik);
        C3386qt c3386qt = this.xha;
        if (c3386qt != null) {
            String strXha = c3386qt.xha();
            if (!TextUtils.isEmpty(strXha)) {
                this.f11992ik.setText(strXha);
                this.f11993ka.setText(String.format(Locale.getDefault(), "%d%s", Integer.valueOf(strXha.length()), "/200"));
            }
            this.f11991fi.setEnabled(!TextUtils.isEmpty(strXha));
        }
        this.f11991fi.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.ik.co.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                String string = DialogC3374co.this.f11992ik.getText().toString();
                if (DialogC3374co.this.f11994lr != null) {
                    DialogC3374co.this.f11994lr.mo11279ri(4, C3386qt.f12042ri, string);
                }
                DialogC3374co.this.dismiss();
            }
        });
        this.f11990di.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.ik.co.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                if (DialogC3374co.this.f11994lr != null) {
                    DialogC3374co.this.f11994lr.mo11277lr();
                }
                DialogC3374co.this.dismiss();
            }
        });
        this.f11992ik.addTextChangedListener(new TextWatcher() { // from class: com.bytedance.sdk.openadsdk.ik.co.3
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                C3195mj c3195mj;
                int iRound = Math.round(charSequence.length());
                DialogC3374co.this.f11993ka.setText(iRound + "/200");
                boolean z = true;
                if (iRound <= 0) {
                    c3195mj = DialogC3374co.this.f11991fi;
                    if (DialogC3374co.this.xha == null || TextUtils.isEmpty(DialogC3374co.this.xha.xha())) {
                        z = false;
                    }
                } else if (DialogC3374co.this.f11991fi.isEnabled()) {
                    return;
                } else {
                    c3195mj = DialogC3374co.this.f11991fi;
                }
                c3195mj.setEnabled(z);
            }
        });
    }

    /* JADX INFO: renamed from: ri */
    public static void m15270ri(EditText editText) {
        editText.setFilters(new InputFilter[]{new InputFilter() { // from class: com.bytedance.sdk.openadsdk.ik.co.4
            @Override // android.text.InputFilter
            public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                while (i < i2) {
                    int type = Character.getType(charSequence.charAt(i));
                    if (type == 19 || type == 28) {
                        return "";
                    }
                    i++;
                }
                return null;
            }
        }, new InputFilter.LengthFilter(200)});
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        m15271lr();
        super.dismiss();
    }

    /* JADX INFO: renamed from: lr */
    public void m15271lr() {
        InputMethodManager inputMethodManager;
        C3194lr c3194lr = this.f11992ik;
        if (c3194lr == null || (inputMethodManager = (InputMethodManager) c3194lr.getContext().getSystemService("input_method")) == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(this.f11995ri.getWindowToken(), 0);
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C3191fi c3191fiM15267ri = m15267ri(C3299nr.m14642ri());
        this.f11995ri = c3191fiM15267ri;
        setContentView(c3191fiM15267ri);
        m15269ri(this.f11995ri);
        m15263ik();
        m15272ri();
        m15265ka();
    }

    /* JADX INFO: renamed from: ri */
    public void m15272ri() {
        C3194lr c3194lr = this.f11992ik;
        if (c3194lr == null) {
            return;
        }
        c3194lr.requestFocus();
        Window window = getWindow();
        if (window != null) {
            window.setSoftInputMode(5);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m15273ri(wjv wjvVar) {
        C3386qt c3386qt = this.xha;
        if (c3386qt != null) {
            c3386qt.m15329ri(wjvVar);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m15274ri(ri riVar) {
        this.f11994lr = riVar;
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        ri riVar = this.f11994lr;
        if (riVar != null) {
            riVar.mo11278ri();
        }
    }
}
