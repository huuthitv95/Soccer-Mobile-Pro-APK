package com.mbridge.msdk.mbnative.listener;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.mbnative.report.C13340a;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.out.NativeListener;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: com.mbridge.msdk.mbnative.listener.a */
/* JADX INFO: compiled from: AdListenerProxy.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13339a implements NativeListener.NativeAdListener {

    /* JADX INFO: renamed from: a */
    private NativeListener.NativeAdListener f37014a;

    /* JADX INFO: renamed from: b */
    private boolean f37015b = false;

    /* JADX INFO: renamed from: c */
    private String f37016c;

    /* JADX INFO: renamed from: d */
    private Context f37017d;

    /* JADX INFO: renamed from: e */
    private boolean f37018e;

    public C13339a() {
    }

    /* JADX INFO: renamed from: a */
    public void m38557a(boolean z) {
        this.f37018e = z;
    }

    /* JADX INFO: renamed from: b */
    public void m38559b() {
        this.f37015b = true;
    }

    @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
    public void onAdClick(Campaign campaign) {
        NativeListener.NativeAdListener nativeAdListener = this.f37014a;
        if (nativeAdListener != null) {
            nativeAdListener.onAdClick(campaign);
        }
    }

    @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
    public void onAdFramesLoaded(List<Frame> list) {
        NativeListener.NativeAdListener nativeAdListener = this.f37014a;
        if (nativeAdListener != null) {
            nativeAdListener.onAdFramesLoaded(list);
        }
    }

    @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
    public void onAdLoadError(String str) {
        this.f37015b = false;
        NativeListener.NativeAdListener nativeAdListener = this.f37014a;
        if (nativeAdListener != null) {
            nativeAdListener.onAdLoadError(str);
            if (this.f37017d == null) {
                this.f37017d = C13008c.m36588n().m36542d();
            }
            if (TextUtils.isEmpty(this.f37016c)) {
                return;
            }
            C13340a.m38561a(this.f37017d, str, this.f37016c, this.f37018e, (CampaignEx) null);
        }
    }

    @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
    public void onAdLoaded(List<Campaign> list, int i) {
        CopyOnWriteArrayList copyOnWriteArrayList;
        try {
            this.f37015b = false;
            synchronized (list) {
                copyOnWriteArrayList = new CopyOnWriteArrayList(list);
            }
            if (this.f37014a != null) {
                if (copyOnWriteArrayList.size() > 0) {
                    this.f37014a.onAdLoaded(copyOnWriteArrayList, i);
                } else {
                    this.f37014a.onAdLoaded(list, i);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
    public void onLoggingImpression(int i) {
        NativeListener.NativeAdListener nativeAdListener = this.f37014a;
        if (nativeAdListener != null) {
            nativeAdListener.onLoggingImpression(i);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m38556a(String str) {
        this.f37016c = str;
    }

    public C13339a(NativeListener.NativeAdListener nativeAdListener) {
        this.f37014a = nativeAdListener;
    }

    /* JADX INFO: renamed from: a */
    public boolean m38558a() {
        return this.f37015b;
    }

    /* JADX INFO: renamed from: a */
    public void m38555a(CampaignEx campaignEx, String str) {
        this.f37015b = false;
        NativeListener.NativeAdListener nativeAdListener = this.f37014a;
        if (nativeAdListener != null) {
            nativeAdListener.onAdLoadError(str);
            if (this.f37017d == null) {
                this.f37017d = C13008c.m36588n().m36542d();
            }
            if (TextUtils.isEmpty(this.f37016c)) {
                return;
            }
            C13340a.m38561a(this.f37017d, str, this.f37016c, this.f37018e, campaignEx);
        }
    }
}
