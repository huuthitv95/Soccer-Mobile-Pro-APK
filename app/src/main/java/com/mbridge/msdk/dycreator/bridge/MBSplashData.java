package com.mbridge.msdk.dycreator.bridge;

import com.mbridge.msdk.dycreator.viewdata.base.InterfaceC12986a;
import com.mbridge.msdk.dycreator.wrapper.DyOption;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* JADX INFO: loaded from: classes5.dex */
public class MBSplashData implements InterfaceC12986a {

    /* JADX INFO: renamed from: a */
    private DyOption f35219a;

    /* JADX INFO: renamed from: b */
    private String f35220b;

    /* JADX INFO: renamed from: c */
    private String f35221c;

    /* JADX INFO: renamed from: d */
    private String f35222d;

    /* JADX INFO: renamed from: e */
    private String f35223e;

    /* JADX INFO: renamed from: f */
    private CampaignEx f35224f;

    /* JADX INFO: renamed from: g */
    private int f35225g;

    /* JADX INFO: renamed from: h */
    private int f35226h;

    /* JADX INFO: renamed from: i */
    private float f35227i;

    /* JADX INFO: renamed from: j */
    private float f35228j;

    /* JADX INFO: renamed from: k */
    private int f35229k = 0;

    public MBSplashData(DyOption dyOption) {
        this.f35219a = dyOption;
        this.f35224f = dyOption.getCampaignEx();
    }

    public String getAdClickText() {
        return this.f35221c;
    }

    public String getAppInfo() {
        return this.f35220b;
    }

    @Override // com.mbridge.msdk.dycreator.viewdata.base.InterfaceC12986a
    public CampaignEx getBindData() {
        return this.f35224f;
    }

    public int getClickType() {
        return this.f35229k;
    }

    public String getCountDownText() {
        return this.f35222d;
    }

    public DyOption getDyOption() {
        return this.f35219a;
    }

    @Override // com.mbridge.msdk.dycreator.viewdata.base.InterfaceC12986a
    public DyOption getEffectData() {
        return this.f35219a;
    }

    public int getLogoImage() {
        return this.f35226h;
    }

    public String getLogoText() {
        return this.f35223e;
    }

    public int getNoticeImage() {
        return this.f35225g;
    }

    public float getxInScreen() {
        return this.f35227i;
    }

    public float getyInScreen() {
        return this.f35228j;
    }

    public void setAdClickText(String str) {
        this.f35221c = str;
    }

    public void setAppInfo(String str) {
        this.f35220b = str;
    }

    public void setClickType(int i) {
        this.f35229k = i;
    }

    public void setCountDownText(String str) {
        this.f35222d = str;
    }

    public void setLogoImage(int i) {
        this.f35226h = i;
    }

    public void setLogoText(String str) {
        this.f35223e = str;
    }

    public void setNoticeImage(int i) {
        this.f35225g = i;
    }

    public void setxInScreen(float f) {
        this.f35227i = f;
    }

    public void setyInScreen(float f) {
        this.f35228j = f;
    }
}
