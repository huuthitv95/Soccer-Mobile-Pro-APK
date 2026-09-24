package com.mbridge.msdk.dycreator.baseview;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
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
public class MBFrameLayout extends FrameLayout implements InterBase, InterEffect {

    /* JADX INFO: renamed from: a */
    private Animator f34900a;

    /* JADX INFO: renamed from: b */
    private Map<String, String> f34901b;

    /* JADX INFO: renamed from: c */
    private Map<String, Boolean> f34902c;

    /* JADX INFO: renamed from: d */
    private String f34903d;

    /* JADX INFO: renamed from: com.mbridge.msdk.dycreator.baseview.MBFrameLayout$1 */
    static /* synthetic */ class C129111 {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f34904a;

        static {
            int[] iArr = new int[EnumC12973c.values().length];
            f34904a = iArr;
            try {
                iArr[EnumC12973c.layout_width.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34904a[EnumC12973c.layout_height.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34904a[EnumC12973c.layout_gravity.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f34904a[EnumC12973c.layout_marginLeft.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f34904a[EnumC12973c.layout_margin.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public MBFrameLayout(Context context, AttributeSet attributeSet) {
        super(context);
        this.f34903d = "";
        try {
            this.f34901b = C12980c.m36402a(context, attributeSet);
            C12978a.m36384a(this, attributeSet);
            setLayoutParams(generateLayoutParams(attributeSet));
            C12980c.m36404a(this.f34901b, this);
        } catch (Exception e) {
            C13219q0.m37816b("MBFrameLayout", e.getMessage());
        }
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getActionDes() {
        Map<String, String> map = this.f34901b;
        return (map == null || !map.containsKey("mbridgeAction")) ? "" : this.f34901b.get("mbridgeAction");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getBindDataDes() {
        Map<String, String> map = this.f34901b;
        return (map == null || !map.containsKey("mbridgeData")) ? "" : this.f34901b.get("mbridgeData");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getEffectDes() {
        Map<String, String> map = this.f34901b;
        return (map == null || !map.containsKey("mbridgeEffect")) ? "" : this.f34901b.get("mbridgeEffect");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getReportDes() {
        Map<String, String> map = this.f34901b;
        return (map == null || !map.containsKey("mbridgeReport")) ? "" : this.f34901b.get("mbridgeReport");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getStrategyDes() {
        Map<String, String> map = this.f34901b;
        return (map == null || !map.containsKey("mbridgeStrategy")) ? "" : this.f34901b.get("mbridgeStrategy");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        try {
            Animator animator = this.f34900a;
            if (animator != null) {
                animator.start();
            }
        } catch (Exception e) {
            C13219q0.m37816b("MBFrameLayout", e.getMessage());
        }
        Map<String, Boolean> map = this.f34902c;
        if (map != null && map.containsKey("mbridgeAttached") && this.f34902c.get("mbridgeAttached").booleanValue()) {
            new C13150l.b("mbridgeAttached").m37405a().m37402b(this.f34903d);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            Animator animator = this.f34900a;
            if (animator != null) {
                animator.cancel();
            }
        } catch (Exception e) {
            C13219q0.m37816b("MBFrameLayout", e.getMessage());
        }
        Map<String, Boolean> map = this.f34902c;
        if (map != null && map.containsKey("mbridgeDetached") && this.f34902c.get("mbridgeDetached").booleanValue()) {
            new C13150l.b("mbridgeDetached").m37405a().m37402b(this.f34903d);
        }
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterEffect
    public void setAnimator(Animator animator) {
        this.f34900a = animator;
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public void setDynamicReport(String str, CampaignEx campaignEx) {
        this.f34902c = C12980c.m36403a(str);
        if (campaignEx != null) {
            this.f34903d = campaignEx.getCampaignUnitId();
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, 0);
        HashMap mapM36368b = C12972b.m36361a().m36368b();
        layoutParams.width = -2;
        layoutParams.height = -2;
        int attributeCount = attributeSet.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            EnumC12973c enumC12973c = (EnumC12973c) mapM36368b.get(attributeSet.getAttributeName(i));
            if (enumC12973c != null) {
                int i2 = C129111.f34904a[enumC12973c.ordinal()];
                if (i2 == 1) {
                    String attributeValue = attributeSet.getAttributeValue(i);
                    if (attributeValue.startsWith(InneractiveMediationDefs.GENDER_FEMALE) || attributeValue.startsWith(InneractiveMediationDefs.GENDER_MALE)) {
                        layoutParams.width = -1;
                    } else if (attributeValue.startsWith("w")) {
                        layoutParams.width = -2;
                    } else {
                        layoutParams.width = C12972b.m36361a().m36362a(attributeValue);
                    }
                } else if (i2 == 2) {
                    String attributeValue2 = attributeSet.getAttributeValue(i);
                    if (attributeValue2.startsWith(InneractiveMediationDefs.GENDER_FEMALE) || attributeValue2.startsWith(InneractiveMediationDefs.GENDER_MALE)) {
                        layoutParams.width = -1;
                    } else if (attributeValue2.startsWith("w")) {
                        layoutParams.width = -2;
                    } else {
                        layoutParams.height = C12972b.m36361a().m36362a(attributeValue2);
                    }
                } else if (i2 == 3) {
                    layoutParams.gravity = C12972b.m36361a().m36367b(attributeSet.getAttributeValue(i));
                } else if (i2 == 4) {
                    layoutParams.leftMargin = C12972b.m36361a().m36362a(attributeSet.getAttributeValue(i));
                } else if (i2 == 5) {
                    int iM36362a = C12972b.m36361a().m36362a(attributeSet.getAttributeValue(i));
                    layoutParams.setMargins(iM36362a, iM36362a, iM36362a, iM36362a);
                }
            }
        }
        return layoutParams;
    }
}
