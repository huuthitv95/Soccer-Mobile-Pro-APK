package com.mbridge.msdk.dycreator.baseview;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.dycreator.baseview.inter.InterBase;
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
public class MBImageView extends ImageView implements InterBase {

    /* JADX INFO: renamed from: a */
    private Map<String, Boolean> f34913a;

    /* JADX INFO: renamed from: b */
    private String f34914b;

    /* JADX INFO: renamed from: c */
    private Map<String, String> f34915c;

    /* JADX INFO: renamed from: com.mbridge.msdk.dycreator.baseview.MBImageView$1 */
    static /* synthetic */ class C129141 {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f34916a;

        static {
            int[] iArr = new int[EnumC12973c.values().length];
            f34916a = iArr;
            try {
                iArr[EnumC12973c.layout_width.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34916a[EnumC12973c.layout_height.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34916a[EnumC12973c.visibility.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public MBImageView(Context context, AttributeSet attributeSet) {
        super(context);
        this.f34914b = "";
        if (context != null && attributeSet != null) {
            try {
                this.f34915c = C12980c.m36402a(context, attributeSet);
            } catch (Exception e) {
                C13219q0.m37816b("MBImageView", e.getMessage());
                return;
            }
        }
        C12978a.m36384a(this, attributeSet);
        setLayoutParams(generateLayoutParams(context, attributeSet));
        C12980c.m36404a(this.f34915c, this);
    }

    public ViewGroup.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        HashMap<String, EnumC12973c> mapM36370c = C12972b.m36361a().m36370c();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            EnumC12973c enumC12973c = mapM36370c.get(attributeSet.getAttributeName(i));
            if (enumC12973c != null) {
                int i2 = C129141.f34916a[enumC12973c.ordinal()];
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
                } else if (i2 == 3) {
                    String attributeValue3 = attributeSet.getAttributeValue(i);
                    if (!TextUtils.isEmpty(attributeValue3)) {
                        if (attributeValue3.equals("invisible")) {
                            setVisibility(4);
                        } else if (attributeValue3.equalsIgnoreCase("gone")) {
                            setVisibility(8);
                        }
                    }
                }
            }
        }
        return layoutParams;
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getActionDes() {
        Map<String, String> map = this.f34915c;
        return (map == null || !map.containsKey("mbridgeAction")) ? "" : this.f34915c.get("mbridgeAction");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getBindDataDes() {
        Map<String, String> map = this.f34915c;
        return (map == null || !map.containsKey("mbridgeData")) ? "" : this.f34915c.get("mbridgeData");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getEffectDes() {
        Map<String, String> map = this.f34915c;
        return (map == null || !map.containsKey("mbridgeEffect")) ? "" : this.f34915c.get("mbridgeEffect");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getReportDes() {
        Map<String, String> map = this.f34915c;
        return (map == null || !map.containsKey("mbridgeReport")) ? "" : this.f34915c.get("mbridgeReport");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getStrategyDes() {
        Map<String, String> map = this.f34915c;
        return (map == null || !map.containsKey("mbridgeStrategy")) ? "" : this.f34915c.get("mbridgeStrategy");
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Map<String, Boolean> map = this.f34913a;
        if (map != null && map.containsKey("mbridgeAttached") && this.f34913a.get("mbridgeAttached").booleanValue()) {
            new C13150l.b("mbridgeAttached").m37405a().m37402b(this.f34914b);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Map<String, Boolean> map = this.f34913a;
        if (map != null && map.containsKey("mbridgeDetached") && this.f34913a.get("mbridgeDetached").booleanValue()) {
            new C13150l.b("mbridgeDetached").m37405a().m37402b(this.f34914b);
        }
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public void setDynamicReport(String str, CampaignEx campaignEx) {
        this.f34913a = C12980c.m36403a(str);
        if (campaignEx != null) {
            this.f34914b = campaignEx.getCampaignUnitId();
        }
    }
}
