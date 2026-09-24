package com.mbridge.msdk.dycreator.baseview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import com.mbridge.msdk.dycreator.baseview.inter.InterBase;
import com.mbridge.msdk.dycreator.utils.C12978a;
import com.mbridge.msdk.dycreator.utils.C12980c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.C13150l;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class MBButton extends Button implements InterBase {

    /* JADX INFO: renamed from: a */
    private Map<String, String> f34892a;

    /* JADX INFO: renamed from: b */
    private Map<String, Boolean> f34893b;

    /* JADX INFO: renamed from: c */
    private String f34894c;

    public MBButton(Context context) {
        super(context);
        this.f34894c = "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getActionDes() {
        Map<String, String> map = this.f34892a;
        return (map == null || !map.containsKey("mbridgeAction")) ? "" : this.f34892a.get("mbridgeAction");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getBindDataDes() {
        Map<String, String> map = this.f34892a;
        return (map == null || !map.containsKey("mbridgeData")) ? "" : this.f34892a.get("mbridgeData");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getEffectDes() {
        Map<String, String> map = this.f34892a;
        return (map == null || !map.containsKey("mbridgeEffect")) ? "" : this.f34892a.get("mbridgeEffect");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getReportDes() {
        Map<String, String> map = this.f34892a;
        return (map == null || !map.containsKey("mbridgeReport")) ? "" : this.f34892a.get("mbridgeReport");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getStrategyDes() {
        Map<String, String> map = this.f34892a;
        return (map == null || !map.containsKey("mbridgeStrategy")) ? "" : this.f34892a.get("mbridgeStrategy");
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Map<String, Boolean> map = this.f34893b;
        if (map != null && map.containsKey("mbridgeAttached") && this.f34893b.get("mbridgeAttached").booleanValue()) {
            new C13150l.b("mbridgeAttached").m37405a().m37402b(this.f34894c);
        }
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Map<String, Boolean> map = this.f34893b;
        if (map != null && map.containsKey("mbridgeDetached") && this.f34893b.get("mbridgeDetached").booleanValue()) {
            new C13150l.b("mbridgeDetached").m37405a().m37402b(this.f34894c);
        }
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public void setDynamicReport(String str, CampaignEx campaignEx) {
        this.f34893b = C12980c.m36403a(str);
        if (campaignEx != null) {
            this.f34894c = campaignEx.getCampaignUnitId();
        }
    }

    public MBButton(Context context, AttributeSet attributeSet) {
        super(context);
        this.f34894c = "";
        this.f34892a = C12980c.m36402a(context, attributeSet);
        C12978a.m36384a(this, attributeSet);
        C12980c.m36404a(this.f34892a, this);
    }

    public MBButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f34894c = "";
    }
}
