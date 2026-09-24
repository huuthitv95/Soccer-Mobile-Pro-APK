package com.mbridge.msdk.out.strategy.component;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.config.component.common.metrics.C12756b;
import com.mbridge.msdk.config.component.common.util.C12768a;
import com.mbridge.msdk.config.component.common.util.C12770c;
import com.mbridge.msdk.config.manager.C12907a;
import com.mbridge.msdk.config.manager.callback.InterfaceC12909b;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.same.C13088a;
import com.mbridge.msdk.foundation.same.image.C13100b;
import com.mbridge.msdk.foundation.tools.C13215o0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.mbbid.common.b$$ExternalSyntheticLambda0;
import com.mbridge.msdk.newinterstitial.out.NewInterstitialListener;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.RewardInfo;
import com.mbridge.msdk.video.p291bt.module.orglistener.InterfaceC13938g;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class BaseComponentStrategy {
    protected static final long DEFAULT_TIMEOUT_MS = 3000;
    protected static final Handler MAIN_HANDLER = new Handler(Looper.getMainLooper());
    protected static final String TAG = "BaseComponentStrategy";
    protected int adType;
    protected String bidToken;
    protected String extraData;
    protected InterfaceC12909b mComponentCallbackListener;
    protected NewInterstitialListener newInterstitialListener;
    protected String placementId;
    protected InterfaceC13938g rewardVideoListener;
    protected String unitId;
    protected String userId;
    protected boolean isReady = true;
    protected boolean isRewardPlusOpen = false;
    protected int isSilent = 0;
    protected Map<String, Object> developerSettingMap = new HashMap();
    protected volatile boolean isQuerying = false;
    protected volatile Looper triggerThreadLooper = null;

    /* JADX INFO: renamed from: com.mbridge.msdk.out.strategy.component.BaseComponentStrategy$1 */
    class C134441 implements InterfaceC12909b {
        C134441() {
        }

        /* JADX INFO: renamed from: lambda$onAdClose$1$com-mbridge-msdk-out-strategy-component-BaseComponentStrategy$1 */
        /* synthetic */ void m38956xfdc28320(MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
            InterfaceC13938g interfaceC13938g = BaseComponentStrategy.this.rewardVideoListener;
            if (interfaceC13938g != null) {
                interfaceC13938g.onAdClose(mBridgeIds, rewardInfo);
            }
        }

        /* JADX INFO: renamed from: lambda$onAdShow$0$com-mbridge-msdk-out-strategy-component-BaseComponentStrategy$1 */
        /* synthetic */ void m38957x60546702(MBridgeIds mBridgeIds) {
            InterfaceC13938g interfaceC13938g = BaseComponentStrategy.this.rewardVideoListener;
            if (interfaceC13938g != null) {
                interfaceC13938g.onAdShow(mBridgeIds);
            }
        }

        /* JADX INFO: renamed from: lambda$onEndCardShow$5$com-mbridge-msdk-out-strategy-component-BaseComponentStrategy$1 */
        /* synthetic */ void m38958x214ab4f7(MBridgeIds mBridgeIds) {
            InterfaceC13938g interfaceC13938g = BaseComponentStrategy.this.rewardVideoListener;
            if (interfaceC13938g != null) {
                interfaceC13938g.onEndcardShow(mBridgeIds);
            }
        }

        /* JADX INFO: renamed from: lambda$onLoadSuccess$8$com-mbridge-msdk-out-strategy-component-BaseComponentStrategy$1 */
        /* synthetic */ void m38959x9d9c83cf(MBridgeIds mBridgeIds) {
            InterfaceC13938g interfaceC13938g = BaseComponentStrategy.this.rewardVideoListener;
            if (interfaceC13938g != null) {
                interfaceC13938g.onLoadSuccess(mBridgeIds);
            }
        }

        /* JADX INFO: renamed from: lambda$onShowFail$2$com-mbridge-msdk-out-strategy-component-BaseComponentStrategy$1 */
        /* synthetic */ void m38960x32c92b3f(MBridgeIds mBridgeIds, String str) {
            InterfaceC13938g interfaceC13938g = BaseComponentStrategy.this.rewardVideoListener;
            if (interfaceC13938g != null) {
                interfaceC13938g.onShowFail(mBridgeIds, str);
            }
        }

        /* JADX INFO: renamed from: lambda$onVideoAdClicked$3$com-mbridge-msdk-out-strategy-component-BaseComponentStrategy$1 */
        /* synthetic */ void m38961xfd99df4e(MBridgeIds mBridgeIds) {
            InterfaceC13938g interfaceC13938g = BaseComponentStrategy.this.rewardVideoListener;
            if (interfaceC13938g != null) {
                interfaceC13938g.onVideoAdClicked(mBridgeIds);
            }
        }

        /* JADX INFO: renamed from: lambda$onVideoComplete$4$com-mbridge-msdk-out-strategy-component-BaseComponentStrategy$1 */
        /* synthetic */ void m38962xe446eba2(MBridgeIds mBridgeIds) {
            InterfaceC13938g interfaceC13938g = BaseComponentStrategy.this.rewardVideoListener;
            if (interfaceC13938g != null) {
                interfaceC13938g.onVideoComplete(mBridgeIds);
            }
        }

        /* JADX INFO: renamed from: lambda$onVideoLoadFail$6$com-mbridge-msdk-out-strategy-component-BaseComponentStrategy$1 */
        /* synthetic */ void m38963xbf2db0cf(MBridgeIds mBridgeIds, String str) {
            InterfaceC13938g interfaceC13938g = BaseComponentStrategy.this.rewardVideoListener;
            if (interfaceC13938g != null) {
                interfaceC13938g.onVideoLoadFail(mBridgeIds, str);
            }
        }

        /* JADX INFO: renamed from: lambda$onVideoLoadSuccess$7$com-mbridge-msdk-out-strategy-component-BaseComponentStrategy$1 */
        /* synthetic */ void m38964x84e3f68b(MBridgeIds mBridgeIds) {
            InterfaceC13938g interfaceC13938g = BaseComponentStrategy.this.rewardVideoListener;
            if (interfaceC13938g != null) {
                interfaceC13938g.onVideoLoadSuccess(mBridgeIds);
            }
        }

        @Override // com.mbridge.msdk.config.manager.callback.InterfaceC12909b
        public void onAdClose(final MBridgeIds mBridgeIds, final RewardInfo rewardInfo) {
            BaseComponentStrategy.this.threadConsistentCallback(new Runnable() { // from class: com.mbridge.msdk.out.strategy.component.BaseComponentStrategy$1$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m38956xfdc28320(mBridgeIds, rewardInfo);
                }
            });
            BaseComponentStrategy.this.sendApiEndMetrics(mBridgeIds, "adClose", 0);
        }

        public void onAdCloseWithIVReward(MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
        }

        @Override // com.mbridge.msdk.config.manager.callback.InterfaceC12909b
        public void onAdShow(final MBridgeIds mBridgeIds) {
            BaseComponentStrategy.this.threadConsistentCallback(new Runnable() { // from class: com.mbridge.msdk.out.strategy.component.BaseComponentStrategy$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m38957x60546702(mBridgeIds);
                }
            });
            BaseComponentStrategy.this.sendApiEndMetrics(mBridgeIds, "showResult", 1);
        }

        @Override // com.mbridge.msdk.config.manager.callback.InterfaceC12909b
        public void onEndCardShow(final MBridgeIds mBridgeIds) {
            BaseComponentStrategy.this.threadConsistentCallback(new Runnable() { // from class: com.mbridge.msdk.out.strategy.component.BaseComponentStrategy$1$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m38958x214ab4f7(mBridgeIds);
                }
            });
        }

        @Override // com.mbridge.msdk.config.manager.callback.InterfaceC12909b
        public void onLoadSuccess(final MBridgeIds mBridgeIds) {
            BaseComponentStrategy.this.threadConsistentCallback(new Runnable() { // from class: com.mbridge.msdk.out.strategy.component.BaseComponentStrategy$1$$ExternalSyntheticLambda7
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m38959x9d9c83cf(mBridgeIds);
                }
            });
        }

        @Override // com.mbridge.msdk.config.manager.callback.InterfaceC12909b
        public void onShowFail(final MBridgeIds mBridgeIds, final String str) {
            BaseComponentStrategy.this.threadConsistentCallback(new Runnable() { // from class: com.mbridge.msdk.out.strategy.component.BaseComponentStrategy$1$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m38960x32c92b3f(mBridgeIds, str);
                }
            });
            BaseComponentStrategy.this.sendApiEndMetrics(mBridgeIds, "showResult", 2);
        }

        @Override // com.mbridge.msdk.config.manager.callback.InterfaceC12909b
        public void onVideoAdClicked(final MBridgeIds mBridgeIds) {
            BaseComponentStrategy.this.threadConsistentCallback(new Runnable() { // from class: com.mbridge.msdk.out.strategy.component.BaseComponentStrategy$1$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m38961xfd99df4e(mBridgeIds);
                }
            });
        }

        @Override // com.mbridge.msdk.config.manager.callback.InterfaceC12909b
        public void onVideoComplete(final MBridgeIds mBridgeIds) {
            BaseComponentStrategy.this.threadConsistentCallback(new Runnable() { // from class: com.mbridge.msdk.out.strategy.component.BaseComponentStrategy$1$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m38962xe446eba2(mBridgeIds);
                }
            });
        }

        @Override // com.mbridge.msdk.config.manager.callback.InterfaceC12909b
        public void onVideoLoadFail(final MBridgeIds mBridgeIds, final String str) {
            BaseComponentStrategy.this.threadConsistentCallback(new Runnable() { // from class: com.mbridge.msdk.out.strategy.component.BaseComponentStrategy$1$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m38963xbf2db0cf(mBridgeIds, str);
                }
            });
            BaseComponentStrategy.this.sendApiEndMetrics(mBridgeIds, "loadEnd", 2);
        }

        @Override // com.mbridge.msdk.config.manager.callback.InterfaceC12909b
        public void onVideoLoadSuccess(final MBridgeIds mBridgeIds) {
            BaseComponentStrategy.this.threadConsistentCallback(new Runnable() { // from class: com.mbridge.msdk.out.strategy.component.BaseComponentStrategy$1$$ExternalSyntheticLambda8
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m38964x84e3f68b(mBridgeIds);
                }
            });
            BaseComponentStrategy.this.sendApiEndMetrics(mBridgeIds, "loadEnd", 1);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.out.strategy.component.BaseComponentStrategy$2 */
    class C134452 implements InterfaceC12909b {
        C134452() {
        }

        /* JADX INFO: renamed from: lambda$onAdClose$1$com-mbridge-msdk-out-strategy-component-BaseComponentStrategy$2 */
        /* synthetic */ void m38965xfdc28321(MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
            NewInterstitialListener newInterstitialListener = BaseComponentStrategy.this.newInterstitialListener;
            if (newInterstitialListener != null) {
                newInterstitialListener.onAdClose(mBridgeIds, rewardInfo);
            }
        }

        /* JADX INFO: renamed from: lambda$onAdShow$0$com-mbridge-msdk-out-strategy-component-BaseComponentStrategy$2 */
        /* synthetic */ void m38966x60546703(MBridgeIds mBridgeIds) {
            NewInterstitialListener newInterstitialListener = BaseComponentStrategy.this.newInterstitialListener;
            if (newInterstitialListener != null) {
                newInterstitialListener.onAdShow(mBridgeIds);
            }
        }

        /* JADX INFO: renamed from: lambda$onEndCardShow$5$com-mbridge-msdk-out-strategy-component-BaseComponentStrategy$2 */
        /* synthetic */ void m38967x214ab4f8(MBridgeIds mBridgeIds) {
            NewInterstitialListener newInterstitialListener = BaseComponentStrategy.this.newInterstitialListener;
            if (newInterstitialListener != null) {
                newInterstitialListener.onEndcardShow(mBridgeIds);
            }
        }

        /* JADX INFO: renamed from: lambda$onLoadSuccess$8$com-mbridge-msdk-out-strategy-component-BaseComponentStrategy$2 */
        /* synthetic */ void m38968x9d9c83d0(MBridgeIds mBridgeIds) {
            NewInterstitialListener newInterstitialListener = BaseComponentStrategy.this.newInterstitialListener;
            if (newInterstitialListener != null) {
                newInterstitialListener.onLoadCampaignSuccess(mBridgeIds);
            }
        }

        /* JADX INFO: renamed from: lambda$onShowFail$2$com-mbridge-msdk-out-strategy-component-BaseComponentStrategy$2 */
        /* synthetic */ void m38969x32c92b40(MBridgeIds mBridgeIds, String str) {
            NewInterstitialListener newInterstitialListener = BaseComponentStrategy.this.newInterstitialListener;
            if (newInterstitialListener != null) {
                newInterstitialListener.onShowFail(mBridgeIds, str);
            }
        }

        /* JADX INFO: renamed from: lambda$onVideoAdClicked$3$com-mbridge-msdk-out-strategy-component-BaseComponentStrategy$2 */
        /* synthetic */ void m38970xfd99df4f(MBridgeIds mBridgeIds) {
            NewInterstitialListener newInterstitialListener = BaseComponentStrategy.this.newInterstitialListener;
            if (newInterstitialListener != null) {
                newInterstitialListener.onAdClicked(mBridgeIds);
            }
        }

        /* JADX INFO: renamed from: lambda$onVideoComplete$4$com-mbridge-msdk-out-strategy-component-BaseComponentStrategy$2 */
        /* synthetic */ void m38971xe446eba3(MBridgeIds mBridgeIds) {
            NewInterstitialListener newInterstitialListener = BaseComponentStrategy.this.newInterstitialListener;
            if (newInterstitialListener != null) {
                newInterstitialListener.onVideoComplete(mBridgeIds);
            }
        }

        /* JADX INFO: renamed from: lambda$onVideoLoadFail$6$com-mbridge-msdk-out-strategy-component-BaseComponentStrategy$2 */
        /* synthetic */ void m38972xbf2db0d0(MBridgeIds mBridgeIds, String str) {
            NewInterstitialListener newInterstitialListener = BaseComponentStrategy.this.newInterstitialListener;
            if (newInterstitialListener != null) {
                newInterstitialListener.onResourceLoadFail(mBridgeIds, str);
            }
        }

        /* JADX INFO: renamed from: lambda$onVideoLoadSuccess$7$com-mbridge-msdk-out-strategy-component-BaseComponentStrategy$2 */
        /* synthetic */ void m38973x84e3f68c(MBridgeIds mBridgeIds) {
            NewInterstitialListener newInterstitialListener = BaseComponentStrategy.this.newInterstitialListener;
            if (newInterstitialListener != null) {
                newInterstitialListener.onResourceLoadSuccess(mBridgeIds);
            }
        }

        @Override // com.mbridge.msdk.config.manager.callback.InterfaceC12909b
        public void onAdClose(final MBridgeIds mBridgeIds, final RewardInfo rewardInfo) {
            BaseComponentStrategy.this.threadConsistentCallback(new Runnable() { // from class: com.mbridge.msdk.out.strategy.component.BaseComponentStrategy$2$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m38965xfdc28321(mBridgeIds, rewardInfo);
                }
            });
            BaseComponentStrategy.this.sendApiEndMetrics(mBridgeIds, "adClose", 0);
        }

        public void onAdCloseWithIVReward(MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
        }

        @Override // com.mbridge.msdk.config.manager.callback.InterfaceC12909b
        public void onAdShow(final MBridgeIds mBridgeIds) {
            BaseComponentStrategy.this.threadConsistentCallback(new Runnable() { // from class: com.mbridge.msdk.out.strategy.component.BaseComponentStrategy$2$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m38966x60546703(mBridgeIds);
                }
            });
            BaseComponentStrategy.this.sendApiEndMetrics(mBridgeIds, "showResult", 2);
        }

        @Override // com.mbridge.msdk.config.manager.callback.InterfaceC12909b
        public void onEndCardShow(final MBridgeIds mBridgeIds) {
            BaseComponentStrategy.this.threadConsistentCallback(new Runnable() { // from class: com.mbridge.msdk.out.strategy.component.BaseComponentStrategy$2$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m38967x214ab4f8(mBridgeIds);
                }
            });
        }

        @Override // com.mbridge.msdk.config.manager.callback.InterfaceC12909b
        public void onLoadSuccess(final MBridgeIds mBridgeIds) {
            BaseComponentStrategy.this.threadConsistentCallback(new Runnable() { // from class: com.mbridge.msdk.out.strategy.component.BaseComponentStrategy$2$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m38968x9d9c83d0(mBridgeIds);
                }
            });
        }

        @Override // com.mbridge.msdk.config.manager.callback.InterfaceC12909b
        public void onShowFail(final MBridgeIds mBridgeIds, final String str) {
            BaseComponentStrategy.this.threadConsistentCallback(new Runnable() { // from class: com.mbridge.msdk.out.strategy.component.BaseComponentStrategy$2$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m38969x32c92b40(mBridgeIds, str);
                }
            });
            BaseComponentStrategy.this.sendApiEndMetrics(mBridgeIds, "showResult", 2);
        }

        @Override // com.mbridge.msdk.config.manager.callback.InterfaceC12909b
        public void onVideoAdClicked(final MBridgeIds mBridgeIds) {
            BaseComponentStrategy.this.threadConsistentCallback(new Runnable() { // from class: com.mbridge.msdk.out.strategy.component.BaseComponentStrategy$2$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m38970xfd99df4f(mBridgeIds);
                }
            });
        }

        @Override // com.mbridge.msdk.config.manager.callback.InterfaceC12909b
        public void onVideoComplete(final MBridgeIds mBridgeIds) {
            BaseComponentStrategy.this.threadConsistentCallback(new Runnable() { // from class: com.mbridge.msdk.out.strategy.component.BaseComponentStrategy$2$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m38971xe446eba3(mBridgeIds);
                }
            });
        }

        @Override // com.mbridge.msdk.config.manager.callback.InterfaceC12909b
        public void onVideoLoadFail(final MBridgeIds mBridgeIds, final String str) {
            BaseComponentStrategy.this.threadConsistentCallback(new Runnable() { // from class: com.mbridge.msdk.out.strategy.component.BaseComponentStrategy$2$$ExternalSyntheticLambda7
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m38972xbf2db0d0(mBridgeIds, str);
                }
            });
            BaseComponentStrategy.this.sendApiEndMetrics(mBridgeIds, "loadEnd", 2);
        }

        @Override // com.mbridge.msdk.config.manager.callback.InterfaceC12909b
        public void onVideoLoadSuccess(final MBridgeIds mBridgeIds) {
            BaseComponentStrategy.this.threadConsistentCallback(new Runnable() { // from class: com.mbridge.msdk.out.strategy.component.BaseComponentStrategy$2$$ExternalSyntheticLambda8
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m38973x84e3f68c(mBridgeIds);
                }
            });
            BaseComponentStrategy.this.sendApiEndMetrics(mBridgeIds, "loadEnd", 1);
        }
    }

    public BaseComponentStrategy(String str, String str2, int i) {
        this.placementId = str;
        this.unitId = str2;
        this.adType = i;
        String str3 = i == 94 ? "rv_init" : i == 287 ? "iv_init" : "";
        if (!TextUtils.isEmpty(str3)) {
            sendApiCallEvent(C12770c.m35199a(), str3, null);
        }
        recordTriggerThread();
    }

    private InterfaceC12909b createInterstitialVideoListener() {
        return new C134452();
    }

    private InterfaceC12909b createRewardVideoListener() {
        return new C134441();
    }

    private void sendApiStartMetrics(String str, String str2, Map<String, Object> map) {
        String str3;
        try {
            if (str2.equals("c1") || str2.equals("c2") || str2.equals("c3")) {
                HashMap map2 = new HashMap();
                map2.put("context_id", str);
                HashMap map3 = new HashMap(map);
                map3.remove("sdk_context");
                map2.put("value", map3);
                if (str2.equals("c1")) {
                    str3 = "m_pipe_load_start";
                } else {
                    str3 = str2.equals("c2") ? "m_pipe_show_start" : "m_pipe_isready_start";
                }
                C12756b.m35099a(str3, map2);
            }
        } catch (Throwable th) {
            C13219q0.m37816b(TAG, th.getMessage());
        }
    }

    private void sendReadyEndMetrics(String str, Object obj, long j) {
        try {
            HashMap map = new HashMap();
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            map.put("context_id", str);
            map.put("result", Integer.valueOf(obj instanceof Boolean ? ((Boolean) obj).booleanValue() : false ? 1 : 2));
            map.put("duration", Long.valueOf(j));
            HashMap map2 = new HashMap();
            map2.put("placement_id", this.placementId);
            map2.put(MBridgeConstans.PROPERTIES_UNIT_ID, this.unitId);
            map2.put("ad_type", Integer.valueOf(this.adType));
            map.put("value", map2);
            C12756b.m35099a("m_pipe_isready_end", map);
        } catch (Throwable th) {
            C13219q0.m37816b(TAG, th.getMessage());
        }
    }

    public void clearBitmapCache() {
        C13100b.m37152a(C13008c.m36588n().m36542d()).m37153a();
    }

    public void clearVideoCache() {
        C13215o0.m37798b();
        sendApiCallEvent(C12770c.m35199a(), "c20", null);
    }

    public String getCreativeIdWithUnitId() {
        sendApiCallEvent(C12770c.m35199a(), "c18", null);
        if (C12907a.m36194c().m36200b().m36051b("creativeId") == null) {
            return "";
        }
        Object objM36051b = C12907a.m36194c().m36200b().m36051b("creativeId");
        if (!(objM36051b instanceof Map)) {
            return "";
        }
        Object obj = ((Map) objM36051b).get(this.unitId);
        return obj instanceof String ? (String) obj : "";
    }

    public String getRequestId() {
        sendApiCallEvent(C12770c.m35199a(), "c17", null);
        if (C12907a.m36194c().m36200b().m36051b("requestId") == null) {
            return "";
        }
        Object objM36051b = C12907a.m36194c().m36200b().m36051b("requestId");
        return objM36051b instanceof String ? (String) objM36051b : "";
    }

    protected synchronized boolean isReadyWithSyncWait(boolean z) {
        if (this.isQuerying) {
            return false;
        }
        try {
            this.isQuerying = true;
            long jCurrentTimeMillis = System.currentTimeMillis();
            C12768a c12768a = new C12768a();
            b$$ExternalSyntheticLambda0 b__externalsyntheticlambda0 = new b$$ExternalSyntheticLambda0(c12768a);
            HashMap map = new HashMap();
            map.put("callback", b__externalsyntheticlambda0);
            HashMap map2 = new HashMap();
            map2.put("bid_token", TextUtils.isEmpty(this.bidToken) ? "" : this.bidToken);
            map2.put("is_hb", Integer.valueOf(z ? 1 : 0));
            map2.put("sdk_context", map);
            String strM35199a = C12770c.m35199a();
            sendApiCallEvent(C12770c.m35199a(), "c3", map2);
            sendApiStartMetrics(strM35199a, "c3", map2);
            Map map3 = (Map) c12768a.m35184a(C12907a.f34885i);
            this.isQuerying = false;
            if (map3 != null) {
                Object obj = map3.get("ready_state");
                sendReadyEndMetrics(strM35199a, obj, System.currentTimeMillis() - jCurrentTimeMillis);
                if (obj instanceof Boolean) {
                    return ((Boolean) obj).booleanValue();
                }
            }
            return false;
        } catch (InterruptedException e) {
            C13219q0.m37817b(TAG, "isReadyWithSyncWait interrupted: " + e.getMessage(), e);
            return false;
        } catch (Exception e2) {
            C13219q0.m37817b(TAG, "isReadyWithSyncWait error: " + e2.getMessage(), e2);
            return false;
        }
    }

    public void playVideoMute(int i) {
        this.isSilent = i;
        this.developerSettingMap.put("mute_state", Integer.valueOf(i));
        sendApiCallEvent(C12770c.m35199a(), "c13", null);
    }

    protected void recordTriggerThread() {
        this.triggerThreadLooper = Looper.myLooper();
    }

    protected void sendApiCallEvent(String str, String str2, Map<String, Object> map) {
        try {
            Map<String, Object> map2 = new HashMap<>();
            map2.put("placement_id", this.placementId);
            map2.put(MBridgeConstans.PROPERTIES_UNIT_ID, this.unitId);
            map2.put("ad_type", Integer.valueOf(this.adType));
            map2.putAll(this.developerSettingMap);
            if (map != null && !map.isEmpty()) {
                map2.putAll(map);
            }
            if (!map2.containsKey("sdk_context")) {
                HashMap map3 = new HashMap();
                map3.put("callback", this.mComponentCallbackListener);
                map2.put("sdk_context", map3);
            }
            C12907a.m36194c().m36201b(str, str2, map2);
            sendApiStartMetrics(str, str2, map2);
        } catch (Exception e) {
            C13219q0.m37817b(TAG, "sendComponentEvent error: " + e.getMessage(), e);
        }
    }

    public void setAlertDialogText(String str, String str2, String str3, String str4) {
        try {
            HashMap map = new HashMap();
            map.put("title", str);
            map.put("content", str2);
            map.put("confirm", str3);
            map.put("cancel", str4);
            this.developerSettingMap.put("dialog_config", map);
            sendApiCallEvent(C12770c.m35199a(), "c14", map);
        } catch (Exception e) {
            C13219q0.m37817b(TAG, "BaseComponentStrategy setAlertDialogText error: " + e.getMessage(), e);
        }
    }

    public void setExtraInfo(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() <= 0) {
            return;
        }
        HashMap map = new HashMap();
        map.put("extra_info", jSONObject);
        this.developerSettingMap.put("extra_info", jSONObject);
        sendApiCallEvent(C12770c.m35199a(), "c16", map);
    }

    public void setIVRewardEnable(int i, int i2) {
        int i3 = i == C13088a.f35842H ? 2 : i;
        if (i == C13088a.f35843I) {
            i3 = 4;
        }
        HashMap map = new HashMap();
        map.put("ivReward_type", Integer.valueOf(i3));
        map.put("ivReward_value", Integer.valueOf(i2));
        this.developerSettingMap.put("iv_reward", map);
        sendApiCallEvent(C12770c.m35199a(), "c19", map);
    }

    public void setInterstitialVideoListener(NewInterstitialListener newInterstitialListener) {
        this.newInterstitialListener = newInterstitialListener;
        this.mComponentCallbackListener = createInterstitialVideoListener();
    }

    public void setRewardPlus(boolean z) {
        this.isRewardPlusOpen = z;
        this.developerSettingMap.put("reward_plus_open", Boolean.valueOf(z));
        HashMap map = new HashMap();
        map.put("reward_plus_open", Boolean.valueOf(z));
        sendApiCallEvent(C12770c.m35199a(), "c15", map);
    }

    @Deprecated
    public void setRewardVideoListener(NewInterstitialListener newInterstitialListener) {
        this.newInterstitialListener = newInterstitialListener;
        this.mComponentCallbackListener = createInterstitialVideoListener();
    }

    protected void threadConsistentCallback(Runnable runnable) {
        if (this.triggerThreadLooper == Looper.getMainLooper()) {
            MAIN_HANDLER.post(runnable);
        } else {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:18:0x0034  */
    public void sendApiEndMetrics(MBridgeIds mBridgeIds, String str, int i) {
        byte b;
        String str2;
        try {
            int iHashCode = str.hashCode();
            if (iHashCode != -1178337387) {
                if (iHashCode != 336615957) {
                    if (iHashCode == 740662650 && str.equals("showResult")) {
                        b = 1;
                    } else {
                        b = -1;
                    }
                } else if (str.equals("loadEnd")) {
                    b = 0;
                } else {
                    b = -1;
                }
            } else if (str.equals("adClose")) {
                b = 2;
            } else {
                b = -1;
            }
            String str3 = "";
            if (b == 0) {
                str2 = "m_pipe_load_end";
            } else if (b != 1) {
                str2 = b != 2 ? "" : "m_pipe_show_close";
            } else {
                str2 = "m_pipe_show_result";
            }
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            HashMap map = new HashMap();
            String contextId = mBridgeIds != null ? mBridgeIds.getContextId() : "";
            if (!TextUtils.isEmpty(contextId)) {
                str3 = contextId;
            }
            map.put("context_id", str3);
            map.put("result", Integer.valueOf(i));
            HashMap map2 = new HashMap();
            map2.put("placement_id", this.placementId);
            map2.put(MBridgeConstans.PROPERTIES_UNIT_ID, this.unitId);
            map2.put("ad_type", Integer.valueOf(this.adType));
            map.put("value", map2);
            C12756b.m35099a(str2, map);
        } catch (Throwable th) {
            C13219q0.m37816b(TAG, th.getMessage());
        }
    }

    public void setRewardVideoListener(InterfaceC13938g interfaceC13938g) {
        this.rewardVideoListener = interfaceC13938g;
        this.mComponentCallbackListener = createRewardVideoListener();
    }

    public void setIVRewardEnable(int i, double d) {
        int i2 = i == C13088a.f35842H ? 1 : i;
        if (i == C13088a.f35843I) {
            i2 = 3;
        }
        HashMap map = new HashMap();
        map.put("ivReward_type", Integer.valueOf(i2));
        map.put("ivReward_value", Double.valueOf(d));
        this.developerSettingMap.put("iv_reward", map);
        sendApiCallEvent(C12770c.m35199a(), "c19", map);
    }
}
