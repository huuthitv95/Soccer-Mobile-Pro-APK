package com.mbridge.msdk.reward.adapter;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: com.mbridge.msdk.reward.adapter.d */
/* JADX INFO: compiled from: RewardVideoCampaignState.java */
/* JADX INFO: loaded from: classes7.dex */
public class C13610d {

    /* JADX INFO: renamed from: a */
    private CopyOnWriteArrayList<CampaignEx> f37702a;

    /* JADX INFO: renamed from: b */
    private CampaignEx f37703b;

    /* JADX INFO: renamed from: c */
    private boolean f37704c = false;

    /* JADX INFO: renamed from: d */
    private int f37705d = 0;

    /* JADX INFO: renamed from: e */
    private int f37706e = 0;

    /* JADX INFO: renamed from: f */
    private int f37707f = 0;

    /* JADX INFO: renamed from: g */
    private int f37708g = 0;

    /* JADX INFO: renamed from: h */
    private int f37709h = 0;

    /* JADX INFO: renamed from: a */
    public void m39142a(CampaignEx campaignEx) {
        if (campaignEx != null) {
            this.f37703b = campaignEx;
            this.f37705d = campaignEx.getSecondRequestIndex();
            this.f37706e = campaignEx.getSecondShowIndex();
            this.f37707f = campaignEx.getFilterCallBackState();
            this.f37709h = campaignEx.getFilterAdsShowCallState();
            this.f37708g = campaignEx.getFilterAdsVideoCallState();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m39143a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
        this.f37702a = copyOnWriteArrayList;
    }

    /* JADX INFO: renamed from: a */
    public void m39144a(boolean z) {
        this.f37704c = z;
    }

    /* JADX INFO: renamed from: a */
    public boolean m39145a() {
        return this.f37705d == 1 && this.f37704c;
    }

    /* JADX INFO: renamed from: b */
    public CopyOnWriteArrayList<CampaignEx> m39146b() {
        return this.f37702a;
    }

    /* JADX INFO: renamed from: c */
    public int m39147c() {
        return this.f37708g;
    }

    /* JADX INFO: renamed from: d */
    public int m39148d() {
        return this.f37707f;
    }

    /* JADX INFO: renamed from: e */
    public boolean m39149e() {
        return this.f37704c;
    }
}
