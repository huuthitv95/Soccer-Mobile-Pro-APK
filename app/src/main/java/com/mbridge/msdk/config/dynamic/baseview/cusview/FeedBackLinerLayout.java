package com.mbridge.msdk.config.dynamic.baseview.cusview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.mbridge.msdk.config.dynamic.baseview.ComponentLinearLayout;
import com.mbridge.msdk.config.dynamic.baseview.inter.InterfaceC12876b;
import com.mbridge.msdk.config.dynamic.utils.C12904f;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.tools.C13203i0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13229v0;
import com.mbridge.msdk.widget.FeedbackRadioGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class FeedBackLinerLayout extends ComponentLinearLayout implements InterfaceC12876b {

    /* JADX INFO: renamed from: a */
    private FeedbackRadioGroup f34561a;

    /* JADX INFO: renamed from: b */
    private String f34562b;

    /* JADX INFO: renamed from: c */
    private Map<String, Object> f34563c;

    /* JADX INFO: renamed from: d */
    private FeedBackLinerLayout f34564d;

    /* JADX INFO: renamed from: com.mbridge.msdk.config.dynamic.baseview.cusview.FeedBackLinerLayout$b */
    private static class C12871b {

        /* JADX INFO: renamed from: a */
        int f34565a;

        /* JADX INFO: renamed from: b */
        ColorStateList f34566b;

        /* JADX INFO: renamed from: c */
        int f34567c;

        /* JADX INFO: renamed from: d */
        int f34568d;

        /* JADX INFO: renamed from: e */
        int f34569e;

        private C12871b() {
        }
    }

    public FeedBackLinerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f34563c = new HashMap();
        this.f34564d = this;
    }

    /* JADX INFO: renamed from: a */
    private FeedbackRadioGroup m35933a() {
        Context contextM36542d = C13008c.m36588n().m36542d();
        if (contextM36542d == null) {
            Log.w("FeedBackLinerLayout", "Context is null");
            return null;
        }
        try {
            FeedbackRadioGroup feedbackRadioGroup = new FeedbackRadioGroup(contextM36542d);
            this.f34561a = feedbackRadioGroup;
            feedbackRadioGroup.setOrientation(0);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(0, C13229v0.m37876a(contextM36542d, 4.0f), 0, 0);
            this.f34561a.setLayoutParams(layoutParams);
            m35937a(this.f34561a, contextM36542d);
            return this.f34561a;
        } catch (Exception e) {
            Log.e("FeedBackLinerLayout", "Error creating FeedbackRadioGroup", e);
            return null;
        }
    }

    private void setupRadioButtonClickListener(final RadioButton radioButton) {
        radioButton.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.config.dynamic.baseview.cusview.FeedBackLinerLayout$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m35935a(radioButton, view);
            }
        });
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.inter.InterfaceC12876b
    public Map<String, Object> getOutData() {
        Object tag;
        if (TextUtils.isEmpty(this.f34562b) || (tag = getTag()) == null) {
            return null;
        }
        HashMap map = new HashMap();
        map.put(String.valueOf(tag), this.f34563c);
        return map;
    }

    public void init(List<Object> list) {
        if (list == null) {
            Log.w("FeedBackLinerLayout", "FBK configuration is null");
            return;
        }
        try {
            removeAllViews();
            FeedbackRadioGroup feedbackRadioGroupM35933a = m35933a();
            if (feedbackRadioGroupM35933a == null) {
                Log.w("FeedBackLinerLayout", "Failed to create FeedbackRadioGroup");
                return;
            }
            feedbackRadioGroupM35933a.setTag("feedback_group");
            m35938a(feedbackRadioGroupM35933a, list);
            addView(feedbackRadioGroupM35933a);
        } catch (Exception e) {
            Log.e("FeedBackLinerLayout", "Error initializing FeedBackLinerLayout", e);
        }
    }

    public void setOutDataScope(String str) {
        this.f34562b = str;
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentLinearLayout, com.mbridge.msdk.config.dynamic.baseview.inter.InterfaceC12875a
    public void setXmlData(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        if (String.valueOf(map.get("clickable")).equals("true")) {
            setViewClickListener();
        }
        if (map.get("saveContent") instanceof String) {
            setOutDataScope("saveContent");
        }
        Object obj = map.get("data");
        if (obj instanceof List) {
            init((List) obj);
        }
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentLinearLayout, com.mbridge.msdk.config.dynamic.baseview.inter.InterfaceC12875a
    public void updateBindData(String str, Object obj) {
        if (obj instanceof List) {
            init((List) obj);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m35937a(FeedbackRadioGroup feedbackRadioGroup, Context context) {
        try {
            int iM37707a = C13203i0.m37707a(context, "mbridge_cm_feedback_choice_btn_bg", "drawable");
            if (iM37707a != 0) {
                feedbackRadioGroup.setBackgroundResource(iM37707a);
            }
            int iM37876a = C13229v0.m37876a(context, 8.0f);
            feedbackRadioGroup.setPadding(iM37876a, iM37876a, iM37876a, iM37876a);
        } catch (Exception e) {
            Log.w("FeedBackLinerLayout", "Error setting up RadioGroup style", e);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m35938a(FeedbackRadioGroup feedbackRadioGroup, List<Object> list) {
        RadioButton radioButtonM35930a;
        if (feedbackRadioGroup == null) {
            Log.w("FeedBackLinerLayout", "RadioGroup is null");
            return;
        }
        Context contextM36542d = C13008c.m36588n().m36542d();
        if (list != null && !list.isEmpty() && contextM36542d != null) {
            try {
                C12871b c12871bM35932a = m35932a(contextM36542d);
                float size = 1.0f / list.size();
                for (int i = 0; i < list.size(); i++) {
                    String strValueOf = String.valueOf(list.get(i));
                    if (!TextUtils.isEmpty(strValueOf) && (radioButtonM35930a = m35930a(contextM36542d, strValueOf, c12871bM35932a, size)) != null) {
                        feedbackRadioGroup.addView(radioButtonM35930a);
                    }
                }
                return;
            } catch (Exception e) {
                Log.e("FeedBackLinerLayout", "Error adding RadioButtons to RadioGroup", e);
                return;
            }
        }
        Log.w("FeedBackLinerLayout", "Invalid parameters for adding RadioButtons");
    }

    /* JADX INFO: renamed from: a */
    private C12871b m35932a(Context context) {
        C12871b c12871b = new C12871b();
        try {
            c12871b.f34565a = C13203i0.m37707a(context, "mbridge_cm_feedback_choice_btn_bg", "drawable");
            int iM37707a = C13203i0.m37707a(context, "mbridge_cm_feedback_rb_text_color_color_list", "color");
            Resources resourcesM37708a = C13203i0.m37708a(context);
            if (resourcesM37708a != null && iM37707a != 0) {
                try {
                    c12871b.f34566b = resourcesM37708a.getColorStateList(iM37707a);
                } catch (Exception e) {
                    Log.w("FeedBackLinerLayout", "Error loading color state list", e);
                }
            }
            c12871b.f34567c = C13229v0.m37876a(context, 8.0f);
            c12871b.f34568d = C13229v0.m37876a(context, 4.0f);
            c12871b.f34569e = C13229v0.m37912c(context, 14.0f);
        } catch (Exception e2) {
            Log.w("FeedBackLinerLayout", "Error creating RadioButton style", e2);
        }
        return c12871b;
    }

    /* JADX INFO: renamed from: a */
    private RadioButton m35930a(Context context, String str, C12871b c12871b, float f) {
        try {
            RadioButton radioButton = new RadioButton(context);
            radioButton.setText(str);
            radioButton.setTag(str);
            m35936a(radioButton, c12871b);
            radioButton.setLayoutParams(m35931a(c12871b, f));
            setupRadioButtonClickListener(radioButton);
            return radioButton;
        } catch (Exception e) {
            Log.e("FeedBackLinerLayout", "Error creating RadioButton for text: " + str, e);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m35936a(RadioButton radioButton, C12871b c12871b) {
        try {
            ColorStateList colorStateList = c12871b.f34566b;
            if (colorStateList != null) {
                radioButton.setTextColor(colorStateList);
                radioButton.setButtonTintList(c12871b.f34566b);
            }
            int i = c12871b.f34567c;
            radioButton.setPadding(i, i, i, i);
            radioButton.setCompoundDrawablePadding(c12871b.f34567c / 2);
            radioButton.setEllipsize(TextUtils.TruncateAt.END);
            radioButton.setSingleLine(true);
            radioButton.setTextSize(0, c12871b.f34569e);
        } catch (Exception e) {
            Log.w("FeedBackLinerLayout", "Error applying RadioButton style", e);
        }
    }

    /* JADX INFO: renamed from: a */
    private RadioGroup.LayoutParams m35931a(C12871b c12871b, float f) {
        RadioGroup.LayoutParams layoutParams = new RadioGroup.LayoutParams(-1, -2);
        layoutParams.weight = f;
        int i = c12871b.f34568d;
        int i2 = i / 2;
        layoutParams.setMargins(i, i2, i, i2);
        return layoutParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m35935a(RadioButton radioButton, View view) {
        if (TextUtils.isEmpty(this.f34562b)) {
            return;
        }
        m35934a(radioButton);
        HashMap map = new HashMap();
        map.put("property", this.f34563c);
        C12904f.m36164a(this.xmlView, "feedbackItemView", map);
    }

    /* JADX INFO: renamed from: a */
    private void m35934a(RadioButton radioButton) {
        if (TextUtils.isEmpty(this.f34562b) || radioButton == null) {
            return;
        }
        try {
            CharSequence text = radioButton.getText();
            if (text instanceof String) {
                String strValueOf = String.valueOf(text);
                if (this.f34563c.containsKey("selectedContents")) {
                    Object obj = this.f34563c.get("selectedContents");
                    if (obj instanceof List) {
                        List list = (List) obj;
                        list.clear();
                        list.add(strValueOf);
                        return;
                    }
                    return;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(strValueOf);
                this.f34563c.put("selectedContents", arrayList);
            }
        } catch (Throwable th) {
            C13219q0.m37817b("FeedBackLinerLayout", th.getMessage(), th);
        }
    }
}
