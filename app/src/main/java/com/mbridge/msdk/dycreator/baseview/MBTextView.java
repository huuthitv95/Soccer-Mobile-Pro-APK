package com.mbridge.msdk.dycreator.baseview;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.TextView;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.dycreator.baseview.inter.InterBase;
import com.mbridge.msdk.dycreator.baseview.inter.InterEffect;
import com.mbridge.msdk.dycreator.engine.C12972b;
import com.mbridge.msdk.dycreator.engine.EnumC12973c;
import com.mbridge.msdk.dycreator.utils.C12978a;
import com.mbridge.msdk.dycreator.utils.C12980c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.C13150l;
import com.mbridge.msdk.foundation.tools.C13219q0;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class MBTextView extends TextView implements InterBase, InterEffect {

    /* JADX INFO: renamed from: a */
    private boolean f34986a;
    public AttributeSet attrs;

    /* JADX INFO: renamed from: b */
    private Animator f34987b;

    /* JADX INFO: renamed from: c */
    private Map<String, String> f34988c;

    /* JADX INFO: renamed from: d */
    private Map<String, Boolean> f34989d;

    /* JADX INFO: renamed from: e */
    private String f34990e;

    /* JADX INFO: renamed from: com.mbridge.msdk.dycreator.baseview.MBTextView$1 */
    static /* synthetic */ class C129251 {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f34991a;

        static {
            int[] iArr = new int[EnumC12973c.values().length];
            f34991a = iArr;
            try {
                iArr[EnumC12973c.layout_width.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34991a[EnumC12973c.layout_height.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public MBTextView(Context context) {
        super(context);
        this.f34986a = false;
        this.f34990e = "";
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        HashMap mapM36368b = C12972b.m36361a().m36368b();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            EnumC12973c enumC12973c = (EnumC12973c) mapM36368b.get(attributeSet.getAttributeName(i));
            if (enumC12973c != null) {
                int i2 = C129251.f34991a[enumC12973c.ordinal()];
                if (i2 == 1) {
                    String attributeValue = attributeSet.getAttributeValue(i);
                    if (attributeValue.startsWith(InneractiveMediationDefs.GENDER_FEMALE) || attributeValue.startsWith(InneractiveMediationDefs.GENDER_MALE)) {
                        layoutParams.width = -1;
                    } else if (attributeValue.startsWith("wrap")) {
                        layoutParams.width = -2;
                    } else {
                        layoutParams.width = C12972b.m36361a().m36362a(attributeValue);
                    }
                } else if (i2 == 2) {
                    String attributeValue2 = attributeSet.getAttributeValue(i);
                    if (attributeValue2.startsWith(InneractiveMediationDefs.GENDER_FEMALE) || attributeValue2.startsWith(InneractiveMediationDefs.GENDER_MALE)) {
                        layoutParams.height = -1;
                    } else if (attributeValue2.startsWith("wrap")) {
                        layoutParams.height = -2;
                    } else {
                        layoutParams.height = C12972b.m36361a().m36362a(attributeValue2);
                    }
                }
            }
        }
        return layoutParams;
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getActionDes() {
        Map<String, String> map = this.f34988c;
        return (map == null || !map.containsKey("mbridgeAction")) ? "" : this.f34988c.get("mbridgeAction");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getBindDataDes() {
        Map<String, String> map = this.f34988c;
        return (map == null || !map.containsKey("mbridgeData")) ? "" : this.f34988c.get("mbridgeData");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getEffectDes() {
        Map<String, String> map = this.f34988c;
        return (map == null || !map.containsKey("mbridgeEffect")) ? "" : this.f34988c.get("mbridgeEffect");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getReportDes() {
        Map<String, String> map = this.f34988c;
        return (map == null || !map.containsKey("mbridgeReport")) ? "" : this.f34988c.get("mbridgeReport");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getStrategyDes() {
        Map<String, String> map = this.f34988c;
        return (map == null || !map.containsKey("mbridgeStrategy")) ? "" : this.f34988c.get("mbridgeStrategy");
    }

    @Override // android.view.View
    public boolean isFocused() {
        if (this.f34986a) {
            return true;
        }
        return super.isFocused();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Animator animator = this.f34987b;
        if (animator != null) {
            try {
                animator.start();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        Map<String, Boolean> map = this.f34989d;
        if (map != null && map.containsKey("mbridgeAttached") && this.f34989d.get("mbridgeAttached").booleanValue()) {
            new C13150l.b("mbridgeAttached").m37405a().m37402b(this.f34990e);
        }
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Animator animator = this.f34987b;
        if (animator != null) {
            try {
                animator.cancel();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        Map<String, Boolean> map = this.f34989d;
        if (map != null && map.containsKey("mbridgeDetached") && this.f34989d.get("mbridgeDetached").booleanValue()) {
            new C13150l.b("mbridgeDetached").m37405a().m37402b(this.f34990e);
        }
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterEffect
    public void setAnimator(Animator animator) {
        this.f34987b = animator;
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public void setDynamicReport(String str, CampaignEx campaignEx) {
        this.f34989d = C12980c.m36403a(str);
        if (campaignEx != null) {
            this.f34990e = campaignEx.getCampaignUnitId();
        }
    }

    public MBTextView(Context context, AttributeSet attributeSet) {
        super(context);
        this.f34986a = false;
        this.f34990e = "";
        this.attrs = attributeSet;
        try {
            this.f34988c = C12980c.m36402a(context, attributeSet);
            C12978a.m36384a(this, attributeSet);
            setLayoutParams(generateLayoutParams(attributeSet));
            C12980c.m36404a(this.f34988c, this);
        } catch (Exception e) {
            C13219q0.m37816b("TextView", e.getMessage());
        }
    }

    public MBTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f34986a = false;
        this.f34990e = "";
    }
}
