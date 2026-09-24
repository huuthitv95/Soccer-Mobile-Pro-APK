package com.mbridge.msdk.foundation.feedback.bean;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.mbridge.msdk.click.C12684c;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.feedback.C13084b;
import com.mbridge.msdk.foundation.feedback.InterfaceC13083a;
import com.mbridge.msdk.foundation.tools.C13203i0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13229v0;
import com.mbridge.msdk.setting.C13630b;
import com.mbridge.msdk.setting.C13635g;
import com.mbridge.msdk.setting.C13636h;
import com.mbridge.msdk.widget.FeedBackButton;
import com.mbridge.msdk.widget.FeedbackRadioGroup;
import com.mbridge.msdk.widget.dialog.InterfaceC14235b;
import com.mbridge.msdk.widget.dialog.MBFeedBackDialog;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.feedback.bean.a */
/* JADX INFO: compiled from: FeedBackBtnBean.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13085a {

    /* JADX INFO: renamed from: A */
    private static int f35798A = -1;

    /* JADX INFO: renamed from: B */
    private static String f35799B;

    /* JADX INFO: renamed from: b */
    private String f35801b;

    /* JADX INFO: renamed from: c */
    private CampaignEx f35802c;

    /* JADX INFO: renamed from: e */
    private FeedBackButton f35804e;

    /* JADX INFO: renamed from: f */
    private String f35805f;

    /* JADX INFO: renamed from: i */
    private String f35808i;

    /* JADX INFO: renamed from: j */
    private MBFeedBackDialog f35809j;

    /* JADX INFO: renamed from: k */
    private Dialog f35810k;

    /* JADX INFO: renamed from: l */
    private JSONArray f35811l;

    /* JADX INFO: renamed from: q */
    private int f35816q;

    /* JADX INFO: renamed from: r */
    private List<g> f35817r;

    /* JADX INFO: renamed from: u */
    private int f35820u;

    /* JADX INFO: renamed from: a */
    private float f35800a = 1.0f;

    /* JADX INFO: renamed from: d */
    private String f35803d = "";

    /* JADX INFO: renamed from: g */
    private float f35806g = -1.0f;

    /* JADX INFO: renamed from: h */
    private int f35807h = -1;

    /* JADX INFO: renamed from: m */
    private int f35812m = -1;

    /* JADX INFO: renamed from: n */
    private int f35813n = -1;

    /* JADX INFO: renamed from: o */
    private int f35814o = -1;

    /* JADX INFO: renamed from: p */
    private int f35815p = -1;

    /* JADX INFO: renamed from: s */
    private int f35818s = C13229v0.m37876a(C13008c.m36588n().m36542d(), 20.0f);

    /* JADX INFO: renamed from: t */
    private String f35819t = "";

    /* JADX INFO: renamed from: v */
    private InterfaceC14235b f35821v = new a();

    /* JADX INFO: renamed from: w */
    private int f35822w = f35798A;

    /* JADX INFO: renamed from: x */
    private int f35823x = -1;

    /* JADX INFO: renamed from: y */
    private int f35824y = -1;

    /* JADX INFO: renamed from: z */
    private int f35825z = -1;

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.feedback.bean.a$a */
    /* JADX INFO: compiled from: FeedBackBtnBean.java */
    class a implements InterfaceC14235b {
        a() {
        }

        @Override // com.mbridge.msdk.widget.dialog.InterfaceC14235b
        /* JADX INFO: renamed from: a */
        public void mo37091a() {
            C13085a.this.m37073m();
        }

        @Override // com.mbridge.msdk.widget.dialog.InterfaceC14235b
        /* JADX INFO: renamed from: b */
        public void mo37092b() {
            C13085a.this.m37072l();
        }

        @Override // com.mbridge.msdk.widget.dialog.InterfaceC14235b
        /* JADX INFO: renamed from: c */
        public void mo37093c() {
            C13085a.this.m37074n();
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.feedback.bean.a$b */
    /* JADX INFO: compiled from: FeedBackBtnBean.java */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C13085a.this.m37090p();
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.feedback.bean.a$c */
    /* JADX INFO: compiled from: FeedBackBtnBean.java */
    class c implements InterfaceC14235b {
        c() {
        }

        @Override // com.mbridge.msdk.widget.dialog.InterfaceC14235b
        /* JADX INFO: renamed from: a */
        public void mo37091a() {
            C13085a.this.m37073m();
        }

        @Override // com.mbridge.msdk.widget.dialog.InterfaceC14235b
        /* JADX INFO: renamed from: b */
        public void mo37092b() {
            C13085a.this.m37072l();
        }

        @Override // com.mbridge.msdk.widget.dialog.InterfaceC14235b
        /* JADX INFO: renamed from: c */
        public void mo37093c() {
            C13085a.this.m37074n();
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.feedback.bean.a$d */
    /* JADX INFO: compiled from: FeedBackBtnBean.java */
    class d implements CompoundButton.OnCheckedChangeListener {
        d() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (z) {
                String unused = C13085a.f35799B = (String) compoundButton.getText();
            }
            if (C13085a.this.f35809j != null) {
                C13085a.this.f35809j.setCancelButtonClickable(!TextUtils.isEmpty(C13085a.f35799B));
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.feedback.bean.a$e */
    /* JADX INFO: compiled from: FeedBackBtnBean.java */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (C13085a.this.f35810k == null || !C13085a.this.f35810k.isShowing()) {
                    return;
                }
                C13085a.this.f35810k.dismiss();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.feedback.bean.a$f */
    /* JADX INFO: compiled from: FeedBackBtnBean.java */
    class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C13085a.this.m37090p();
        }
    }

    public C13085a(String str) {
        this.f35817r = new ArrayList();
        this.f35808i = str;
        if (this.f35817r == null) {
            this.f35817r = new ArrayList();
        }
        m37069d();
        m37071e();
        m37066c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public void m37072l() {
        C13084b.m37036b().m37042a(this.f35808i, 1, 4, f35799B, this.f35803d);
        List<g> list = this.f35817r;
        if (list != null) {
            for (g gVar : list) {
                if (gVar != null) {
                    gVar.mo37092b();
                }
            }
        }
        m37075o();
        f35799B = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public void m37073m() {
        C13084b.m37036b().m37042a(this.f35808i, 0, 4, f35799B, this.f35803d);
        List<g> list = this.f35817r;
        if (list != null) {
            for (g gVar : list) {
                if (gVar != null) {
                    gVar.mo37091a();
                }
            }
        }
        f35799B = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public void m37074n() {
        C13084b.m37036b().m37042a(this.f35808i, 0, 4, f35799B, this.f35803d);
        Context contextM36546f = C13008c.m36588n().m36546f();
        if (contextM36546f == null) {
            contextM36546f = C13008c.m36588n().m36542d();
        }
        List<g> list = this.f35817r;
        if (list != null) {
            for (g gVar : list) {
                if (gVar != null) {
                    gVar.mo37091a();
                }
            }
        }
        m37060a(contextM36546f);
        f35799B = "";
    }

    /* JADX INFO: renamed from: o */
    private void m37075o() {
        if (TextUtils.isEmpty(this.f35819t)) {
            return;
        }
        try {
            Activity activityM37038a = C13084b.m37036b().m37038a(C13008c.m36588n().m36542d());
            if (activityM37038a != null) {
                View viewInflate = LayoutInflater.from(activityM37038a).inflate(C13203i0.m37707a(activityM37038a, "mbridge_cm_feedback_notice_layout", "layout"), (ViewGroup) null);
                Dialog dialog = new Dialog(activityM37038a, 3);
                this.f35810k = dialog;
                dialog.requestWindowFeature(1);
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                Window window = this.f35810k.getWindow();
                layoutParams.copyFrom(window.getAttributes());
                layoutParams.width = -2;
                layoutParams.height = -2;
                this.f35810k.setContentView(viewInflate);
                this.f35810k.show();
                window.setAttributes(layoutParams);
                viewInflate.postDelayed(new e(), 2000L);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: f */
    public void m37084f() {
        FeedBackButton feedBackButton = this.f35804e;
        if (feedBackButton != null) {
            feedBackButton.setOnClickListener(null);
            this.f35804e.setVisibility(8);
            ViewGroup viewGroup = (ViewGroup) this.f35804e.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.f35804e);
            }
        }
        MBFeedBackDialog mBFeedBackDialog = this.f35809j;
        if (mBFeedBackDialog != null) {
            mBFeedBackDialog.cancel();
            this.f35809j.setListener(null);
        }
        this.f35809j = null;
        this.f35817r = null;
        this.f35804e = null;
        this.f35821v = null;
    }

    /* JADX INFO: renamed from: g */
    public void m37085g() {
        MBFeedBackDialog mBFeedBackDialog = this.f35809j;
        if (mBFeedBackDialog == null || !mBFeedBackDialog.isShowing()) {
            return;
        }
        this.f35809j.cancel();
    }

    /* JADX INFO: renamed from: h */
    public CampaignEx m37086h() {
        return this.f35802c;
    }

    /* JADX INFO: renamed from: i */
    public FeedBackButton m37087i() {
        if (this.f35804e == null) {
            m37071e();
        }
        return this.f35804e;
    }

    /* JADX INFO: renamed from: j */
    public int m37088j() {
        return this.f35816q;
    }

    /* JADX INFO: renamed from: k */
    public int m37089k() {
        return this.f35820u;
    }

    /* JADX INFO: renamed from: p */
    public void m37090p() {
        try {
            C13084b.m37036b().m37042a(this.f35808i, 0, 1, f35799B, this.f35803d);
            Activity activityM37038a = C13084b.m37036b().m37038a(C13008c.m36588n().m36542d());
            MBFeedBackDialog mBFeedBackDialog = this.f35809j;
            if (mBFeedBackDialog == null || mBFeedBackDialog.getContext() != activityM37038a) {
                m37066c();
            }
            Context contextM36542d = C13008c.m36588n().m36542d();
            FeedBackButton feedBackButton = this.f35804e;
            if (feedBackButton != null) {
                contextM36542d = feedBackButton.getContext();
            }
            boolean zM37051a = C13084b.m37036b().m37051a(this.f35808i, contextM36542d, this.f35809j);
            m37059a(zM37051a ? 2 : 3);
            if (zM37051a) {
                return;
            }
            m37060a(contextM36542d);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: c */
    private void m37066c() {
        try {
            if (C13084b.m37036b().m37038a(C13008c.m36588n().m36542d()) != null) {
                C13635g c13635gM39718d = C13636h.m39706b().m39718d(C13008c.m36588n().m36533b());
                if (c13635gM39718d == null) {
                    c13635gM39718d = C13636h.m39706b().m39708a();
                }
                C13630b.b bVarM39386A = c13635gM39718d.m39386A();
                if (bVarM39386A == null) {
                    C13219q0.m37818c("", "feedback fbk is null");
                    return;
                }
                m37069d();
                this.f35809j = new MBFeedBackDialog(C13084b.m37036b().m37038a(C13008c.m36588n().m36542d()), this.f35821v);
                FeedbackRadioGroup feedbackRadioGroupM37056a = m37056a(bVarM39386A);
                this.f35809j.setCancelText(bVarM39386A.m39600d());
                this.f35809j.setConfirmText(bVarM39386A.m39597a());
                this.f35809j.setPrivacyText(bVarM39386A.m39599c());
                this.f35819t = bVarM39386A.m39601e();
                this.f35809j.setTitle(bVarM39386A.m39602f());
                this.f35809j.setContent(feedbackRadioGroupM37056a);
                this.f35809j.setCancelButtonClickable(!TextUtils.isEmpty(f35799B));
                m37063a(feedbackRadioGroupM37056a, bVarM39386A);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: d */
    private void m37069d() {
        if (this.f35821v == null) {
            this.f35821v = new c();
        }
    }

    /* JADX INFO: renamed from: e */
    private void m37071e() {
        Context contextM36542d = C13008c.m36588n().m36542d();
        if (contextM36542d != null) {
            try {
                FeedBackButton feedBackButton = new FeedBackButton(contextM36542d);
                this.f35804e = feedBackButton;
                int i = 8;
                if (this.f35822w != 8) {
                    i = 0;
                }
                feedBackButton.setVisibility(i);
                this.f35804e.setOnClickListener(new b());
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m37081b(String str) {
        this.f35803d = str;
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.feedback.bean.a$g */
    /* JADX INFO: compiled from: FeedBackBtnBean.java */
    public static class g implements InterfaceC14235b {

        /* JADX INFO: renamed from: a */
        private InterfaceC13083a f35832a;

        /* JADX INFO: renamed from: b */
        private String f35833b;

        public g(String str, InterfaceC13083a interfaceC13083a) {
            this.f35832a = interfaceC13083a;
            this.f35833b = str;
        }

        @Override // com.mbridge.msdk.widget.dialog.InterfaceC14235b
        /* JADX INFO: renamed from: a */
        public void mo37091a() {
            C13084b.f35793f = false;
            InterfaceC13083a interfaceC13083a = this.f35832a;
            if (interfaceC13083a != null) {
                interfaceC13083a.close();
            }
        }

        @Override // com.mbridge.msdk.widget.dialog.InterfaceC14235b
        /* JADX INFO: renamed from: b */
        public void mo37092b() {
            C13084b.f35793f = false;
            InterfaceC13083a interfaceC13083a = this.f35832a;
            if (interfaceC13083a != null) {
                interfaceC13083a.mo34412a(C13085a.f35799B);
            }
        }

        @Override // com.mbridge.msdk.widget.dialog.InterfaceC14235b
        /* JADX INFO: renamed from: c */
        public void mo37093c() {
            InterfaceC13083a interfaceC13083a = this.f35832a;
            if (interfaceC13083a != null) {
                interfaceC13083a.close();
            }
        }

        /* JADX INFO: renamed from: a */
        public void m37094a(int i) {
            if (this.f35832a == null || i != 2) {
                return;
            }
            C13084b.f35793f = true;
            this.f35832a.mo34411a();
        }
    }

    /* JADX INFO: renamed from: b */
    private void m37064b() {
        FeedBackButton feedBackButton = this.f35804e;
        if (feedBackButton != null) {
            int i = this.f35824y;
            if (i > -1) {
                feedBackButton.setX(i);
            }
            int i2 = this.f35825z;
            if (i2 > -1) {
                this.f35804e.setY(i2);
            }
            float f2 = this.f35800a;
            if (f2 >= 0.0f) {
                this.f35804e.setAlpha(f2);
                this.f35804e.setEnabled(this.f35800a != 0.0f);
            }
            ViewGroup.LayoutParams layoutParams = this.f35804e.getLayoutParams();
            int i3 = this.f35823x;
            if (i3 > 0) {
                this.f35804e.setWidth(i3);
                if (layoutParams != null) {
                    layoutParams.width = this.f35823x;
                }
            }
            int i4 = this.f35807h;
            if (i4 > 0) {
                this.f35804e.setHeight(i4);
                if (layoutParams != null) {
                    layoutParams.height = this.f35807h;
                }
            }
            if (layoutParams != null) {
                this.f35804e.setLayoutParams(layoutParams);
            }
            try {
                if (!TextUtils.isEmpty(this.f35805f)) {
                    this.f35804e.setTextColor(Color.parseColor(this.f35805f));
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            float f3 = this.f35806g;
            if (f3 > 0.0f) {
                this.f35804e.setTextSize(f3);
            }
            JSONArray jSONArray = this.f35811l;
            if (jSONArray != null && jSONArray.length() == 4) {
                Context contextM36542d = C13008c.m36588n().m36542d();
                this.f35804e.setPadding(C13229v0.m37876a(contextM36542d, (float) this.f35811l.optDouble(0)), C13229v0.m37876a(contextM36542d, (float) this.f35811l.optDouble(1)), C13229v0.m37876a(contextM36542d, (float) this.f35811l.optDouble(2)), C13229v0.m37876a(contextM36542d, (float) this.f35811l.optDouble(3)));
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            int i5 = this.f35818s;
            if (i5 > 0) {
                gradientDrawable.setCornerRadius(i5);
            }
            if (!TextUtils.isEmpty(this.f35801b)) {
                gradientDrawable.setColor(Color.parseColor(this.f35801b));
            } else {
                gradientDrawable.setColor(Color.parseColor(FeedBackButton.FEEDBACK_BTN_BACKGROUND_COLOR_STR));
            }
            this.f35804e.setBackground(gradientDrawable);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m37078a(g gVar) {
        if (this.f35817r == null) {
            this.f35817r = new ArrayList();
        }
        this.f35817r.add(gVar);
    }

    /* JADX INFO: renamed from: d */
    public void m37083d(int i) {
        this.f35822w = i;
        FeedBackButton feedBackButton = this.f35804e;
        if (feedBackButton != null) {
            feedBackButton.setVisibility(i);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m37077a(CampaignEx campaignEx) {
        this.f35802c = campaignEx;
    }

    /* JADX INFO: renamed from: a */
    private void m37059a(int i) {
        if (i == 2) {
            C13084b.m37036b().m37042a(this.f35808i, 0, 2, f35799B, this.f35803d);
        } else {
            C13084b.m37036b().m37042a(this.f35808i, 0, 3, f35799B, this.f35803d);
        }
        List<g> list = this.f35817r;
        if (list != null) {
            for (g gVar : list) {
                if (gVar != null) {
                    gVar.m37094a(i);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m37060a(Context context) {
        if (context != null) {
            try {
                C12684c.m34661e(context, C13229v0.m37883a(this.f35802c));
            } catch (Exception unused) {
                C12684c.m34659c(context, C13229v0.m37883a(this.f35802c));
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private FeedbackRadioGroup m37056a(C13630b.b bVar) {
        JSONArray jSONArrayM39598b = bVar.m39598b();
        Context contextM36542d = C13008c.m36588n().m36542d();
        if (jSONArrayM39598b == null || jSONArrayM39598b.length() <= 0 || contextM36542d == null) {
            return null;
        }
        FeedbackRadioGroup feedbackRadioGroup = new FeedbackRadioGroup(contextM36542d);
        feedbackRadioGroup.setOrientation(0);
        return feedbackRadioGroup;
    }

    /* JADX INFO: renamed from: a */
    private void m37063a(FeedbackRadioGroup feedbackRadioGroup, C13630b.b bVar) {
        ColorStateList colorStateList;
        JSONArray jSONArrayM39598b = bVar.m39598b();
        Context contextM36542d = C13008c.m36588n().m36542d();
        if (jSONArrayM39598b == null || jSONArrayM39598b.length() <= 0 || contextM36542d == null) {
            return;
        }
        C13203i0.m37707a(contextM36542d, "mbridge_cm_feedback_choice_btn_bg", "drawable");
        Resources resourcesM37708a = C13203i0.m37708a(contextM36542d);
        int iM37707a = C13203i0.m37707a(contextM36542d, "mbridge_cm_feedback_rb_text_color_color_list", "color");
        if (resourcesM37708a != null) {
            try {
                colorStateList = resourcesM37708a.getColorStateList(iM37707a);
            } catch (Exception e2) {
                e2.printStackTrace();
                colorStateList = null;
            }
        } else {
            colorStateList = null;
        }
        int iM37876a = C13229v0.m37876a(contextM36542d, 1.0f);
        int iM37876a2 = C13229v0.m37876a(contextM36542d, 1.0f);
        int iM37876a3 = C13229v0.m37876a(contextM36542d, 1.0f);
        for (int i = 0; i < jSONArrayM39598b.length(); i++) {
            String strOptString = jSONArrayM39598b.optString(i);
            RadioButton radioButton = new RadioButton(contextM36542d);
            radioButton.setButtonTintList(colorStateList);
            radioButton.setText(strOptString);
            if (colorStateList != null) {
                radioButton.setTextColor(colorStateList);
            }
            radioButton.setCompoundDrawablePadding(iM37876a);
            radioButton.setPadding(iM37876a, iM37876a2, iM37876a, iM37876a2);
            radioButton.setEllipsize(TextUtils.TruncateAt.END);
            RadioGroup.LayoutParams layoutParams = new RadioGroup.LayoutParams(-1, -2);
            int i2 = iM37876a3 / 4;
            layoutParams.setMargins(iM37876a3, i2, iM37876a3, i2);
            m37061a(radioButton);
            feedbackRadioGroup.addView(radioButton, layoutParams);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m37082c(int i) {
        this.f35820u = i;
    }

    /* JADX INFO: renamed from: b */
    public void m37080b(int i) {
        this.f35816q = i;
    }

    /* JADX INFO: renamed from: a */
    private void m37061a(RadioButton radioButton) {
        if (radioButton != null) {
            radioButton.setOnCheckedChangeListener(new d());
        }
    }

    /* JADX INFO: renamed from: a */
    public void m37079a(FeedBackButton feedBackButton) {
        FeedBackButton feedBackButton2 = this.f35804e;
        if (feedBackButton2 != null) {
            feedBackButton2.setVisibility(8);
        }
        if (feedBackButton != null) {
            feedBackButton.setAlpha(this.f35800a);
            feedBackButton.setEnabled(this.f35800a != 0.0f);
            feedBackButton.setVisibility(this.f35822w != 8 ? 0 : 8);
            this.f35804e = feedBackButton;
            CampaignEx campaignEx = this.f35802c;
            if (campaignEx != null && !campaignEx.isDynamicView()) {
                m37064b();
            }
            feedBackButton.setOnClickListener(new f());
        }
    }

    /* JADX INFO: renamed from: a */
    public void m37076a(int i, int i2, int i3, int i4, int i5, float f2, String str, String str2, float f3, JSONArray jSONArray) {
        if (i > -1) {
            this.f35824y = i;
        }
        if (i2 > -1) {
            this.f35825z = i2;
        }
        if (i3 > -1) {
            this.f35823x = i3;
        }
        if (i4 > -1) {
            this.f35807h = i4;
        }
        if (f3 > -1.0f) {
            this.f35806g = f3;
        }
        if (jSONArray != null) {
            this.f35811l = jSONArray;
        }
        this.f35805f = str;
        this.f35801b = str2;
        this.f35800a = f2;
        this.f35818s = i5;
        m37064b();
    }
}
