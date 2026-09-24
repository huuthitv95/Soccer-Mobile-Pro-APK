package com.mbridge.msdk.video.p291bt.module;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.iab.omid.library.mmadbridge.adsession.AdEvents;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.iab.omid.library.mmadbridge.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.mmadbridge.adsession.media.InteractionType;
import com.iab.omid.library.mmadbridge.adsession.media.MediaEvents;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.dycreator.baseview.cusview.SoundImageView;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.feedback.C13084b;
import com.mbridge.msdk.foundation.same.report.metrics.C13156d;
import com.mbridge.msdk.foundation.same.report.metrics.C13157e;
import com.mbridge.msdk.foundation.tools.C13182a1;
import com.mbridge.msdk.foundation.tools.C13203i0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13223s0;
import com.mbridge.msdk.foundation.tools.C13229v0;
import com.mbridge.msdk.mbsignalcommon.windvane.C13392f;
import com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener;
import com.mbridge.msdk.playercommon.PlayerErrorConstant;
import com.mbridge.msdk.playercommon.PlayerView;
import com.mbridge.msdk.video.p291bt.component.C13893d;
import com.mbridge.msdk.videocommon.download.C14202a;
import com.mbridge.msdk.videocommon.download.C14203b;
import com.mbridge.msdk.videocommon.setting.C14221a;
import com.mbridge.msdk.videocommon.setting.C14222b;
import com.mbridge.msdk.widget.FeedBackButton;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import java.io.File;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class MBridgeBTVideoView extends BTBaseView {

    /* JADX INFO: renamed from: P */
    private static boolean f39860P;

    /* JADX INFO: renamed from: Q */
    private static long f39861Q;

    /* JADX INFO: renamed from: A */
    private AdSession f39862A;

    /* JADX INFO: renamed from: B */
    private AdEvents f39863B;

    /* JADX INFO: renamed from: C */
    private MediaEvents f39864C;

    /* JADX INFO: renamed from: D */
    private C13925d f39865D;

    /* JADX INFO: renamed from: E */
    private int f39866E;

    /* JADX INFO: renamed from: F */
    private int f39867F;

    /* JADX INFO: renamed from: G */
    private boolean f39868G;

    /* JADX INFO: renamed from: H */
    private int f39869H;

    /* JADX INFO: renamed from: I */
    private int f39870I;

    /* JADX INFO: renamed from: J */
    private String f39871J;

    /* JADX INFO: renamed from: K */
    private boolean f39872K;

    /* JADX INFO: renamed from: L */
    private boolean f39873L;

    /* JADX INFO: renamed from: M */
    private boolean f39874M;

    /* JADX INFO: renamed from: N */
    private RelativeLayout f39875N;

    /* JADX INFO: renamed from: O */
    private ProgressBar f39876O;

    /* JADX INFO: renamed from: p */
    private PlayerView f39877p;

    /* JADX INFO: renamed from: q */
    private SoundImageView f39878q;

    /* JADX INFO: renamed from: r */
    private TextView f39879r;

    /* JADX INFO: renamed from: s */
    private View f39880s;

    /* JADX INFO: renamed from: t */
    private FeedBackButton f39881t;

    /* JADX INFO: renamed from: u */
    private ImageView f39882u;

    /* JADX INFO: renamed from: v */
    private WebView f39883v;

    /* JADX INFO: renamed from: w */
    private C14202a f39884w;

    /* JADX INFO: renamed from: x */
    private int f39885x;

    /* JADX INFO: renamed from: y */
    private int f39886y;

    /* JADX INFO: renamed from: z */
    private int f39887z;

    /* JADX INFO: renamed from: com.mbridge.msdk.video.bt.module.MBridgeBTVideoView$a */
    class ViewOnClickListenerC13922a implements View.OnClickListener {
        ViewOnClickListenerC13922a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            boolean zIsSilent = MBridgeBTVideoView.this.f39877p.isSilent();
            if (MBridgeBTVideoView.this.f39883v != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, BTBaseView.f39709n);
                    jSONObject.put("id", MBridgeBTVideoView.this.f39714d);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(CampaignEx.JSON_NATIVE_VIDEO_MUTE, MBridgeBTVideoView.this.f39866E);
                    jSONObject.put("data", jSONObject2);
                    C13392f.m38726a().m38728a(MBridgeBTVideoView.this.f39883v, "onPlayerMuteBtnClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    C13219q0.m37813a("OperateViews", "onPlayerMuteBtnClicked isMute = " + zIsSilent + " mute = " + MBridgeBTVideoView.this.f39866E);
                } catch (Exception e) {
                    C13893d.m41513c().m41456a(MBridgeBTVideoView.this.f39883v, e.getMessage());
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.bt.module.MBridgeBTVideoView$b */
    class ViewOnClickListenerC13923b implements View.OnClickListener {
        ViewOnClickListenerC13923b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (MBridgeBTVideoView.this.f39883v != null) {
                BTBaseView.m41515a(MBridgeBTVideoView.this.f39883v, "onPlayerCloseBtnClicked", MBridgeBTVideoView.this.f39714d);
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.bt.module.MBridgeBTVideoView$c */
    class ViewOnClickListenerC13924c implements View.OnClickListener {
        ViewOnClickListenerC13924c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (MBridgeBTVideoView.this.f39864C != null) {
                try {
                    MBridgeBTVideoView.this.f39864C.adUserInteraction(InteractionType.CLICK);
                    C13219q0.m37813a("omsdk", "btv adUserInteraction click");
                } catch (Exception e) {
                    C13219q0.m37816b("omsdk", e.getMessage());
                }
            }
            if (MBridgeBTVideoView.this.f39883v != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, BTBaseView.f39709n);
                    jSONObject.put("id", MBridgeBTVideoView.this.f39714d);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("x", String.valueOf(view.getX()));
                    jSONObject2.put("y", String.valueOf(view.getY()));
                    jSONObject.put("data", jSONObject2);
                    C13392f.m38726a().m38728a(MBridgeBTVideoView.this.f39883v, "onClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception unused) {
                    C13893d.m41513c().m41457a(MBridgeBTVideoView.this.f39883v, "onClicked", MBridgeBTVideoView.this.f39714d);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.bt.module.MBridgeBTVideoView$d */
    private static final class C13925d extends DefaultVideoPlayerStatusListener {

        /* JADX INFO: renamed from: a */
        private MBridgeBTVideoView f39891a;

        /* JADX INFO: renamed from: b */
        private WebView f39892b;

        /* JADX INFO: renamed from: c */
        private MediaEvents f39893c;

        /* JADX INFO: renamed from: d */
        private String f39894d;

        /* JADX INFO: renamed from: e */
        private String f39895e;

        /* JADX INFO: renamed from: f */
        private int f39896f;

        /* JADX INFO: renamed from: g */
        private int f39897g;

        /* JADX INFO: renamed from: h */
        private boolean f39898h;

        /* JADX INFO: renamed from: l */
        private int f39902l;

        /* JADX INFO: renamed from: m */
        private int f39903m;

        /* JADX INFO: renamed from: i */
        private boolean f39899i = false;

        /* JADX INFO: renamed from: j */
        private boolean f39900j = false;

        /* JADX INFO: renamed from: k */
        private boolean f39901k = false;

        /* JADX INFO: renamed from: n */
        private boolean f39904n = false;

        /* JADX INFO: renamed from: o */
        private boolean f39905o = false;

        public C13925d(MBridgeBTVideoView mBridgeBTVideoView, WebView webView, MediaEvents mediaEvents) {
            this.f39891a = mBridgeBTVideoView;
            this.f39892b = webView;
            this.f39893c = mediaEvents;
            if (mBridgeBTVideoView != null) {
                this.f39894d = mBridgeBTVideoView.f39714d;
                this.f39895e = mBridgeBTVideoView.f39713c;
            }
        }

        /* JADX INFO: renamed from: a */
        private void m41677a() {
            int i;
            MBridgeBTVideoView mBridgeBTVideoView;
            CampaignEx campaignEx;
            String str;
            if (!C13223s0.m37831a().m37842a("h_c_r_w_p_c", false) || (i = this.f39902l) == 100 || this.f39903m != 0 || this.f39904n || i == 0 || (mBridgeBTVideoView = this.f39891a) == null || (campaignEx = mBridgeBTVideoView.f39712b) == null) {
                return;
            }
            try {
                if (campaignEx.getAdType() == 94 || this.f39891a.f39712b.getAdType() == 287) {
                    str = this.f39891a.f39712b.getRequestId() + this.f39891a.f39712b.getId() + this.f39891a.f39712b.getVideoUrlEncode();
                } else {
                    str = this.f39891a.f39712b.getId() + this.f39891a.f39712b.getVideoUrlEncode() + this.f39891a.f39712b.getBidToken();
                }
                C14202a c14202aM42516a = C14203b.getInstance().m42516a(this.f39895e, str);
                if (c14202aM42516a != null) {
                    c14202aM42516a.m42473A();
                    this.f39904n = true;
                    if (MBridgeConstans.DEBUG) {
                        C13219q0.m37816b("DefaultVideoPlayerStatusListener", "CDRate is : 0  and start download when player create!");
                    }
                }
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    C13219q0.m37816b("DefaultVideoPlayerStatusListener", e.getMessage());
                }
            }
        }

        /* JADX INFO: renamed from: a */
        private void m41678a(int i, int i2) {
            int i3;
            int i4;
            String str;
            try {
                int i5 = this.f39902l;
                if (i5 == 100 || this.f39904n || i5 == 0 || (i3 = this.f39903m) < 0 || i < (i4 = (i2 * i3) / 100)) {
                    return;
                }
                if (this.f39891a.f39712b.getAdType() == 94 || this.f39891a.f39712b.getAdType() == 287) {
                    str = this.f39891a.f39712b.getRequestId() + this.f39891a.f39712b.getId() + this.f39891a.f39712b.getVideoUrlEncode();
                } else {
                    str = this.f39891a.f39712b.getId() + this.f39891a.f39712b.getVideoUrlEncode() + this.f39891a.f39712b.getBidToken();
                }
                C14202a c14202aM42516a = C14203b.getInstance().m42516a(this.f39895e, str);
                if (c14202aM42516a != null) {
                    c14202aM42516a.m42473A();
                    this.f39904n = true;
                    C13219q0.m37816b("DefaultVideoPlayerStatusListener", "CDRate is : " + i4 + " and start download !");
                }
            } catch (Exception e) {
                C13219q0.m37816b("DefaultVideoPlayerStatusListener", e.getMessage());
            }
        }

        /* JADX INFO: renamed from: b */
        public void m41679b(int i, int i2) {
            this.f39902l = i;
            this.f39903m = i2;
            m41677a();
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public void onBufferingEnd() {
            try {
                super.onBufferingEnd();
                if (this.f39893c == null || !this.f39905o) {
                    return;
                }
                C13219q0.m37816b("omsdk", "bt onBufferingEnd");
                this.f39905o = false;
                this.f39893c.bufferFinish();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public void onBufferingStart(String str) {
            try {
                C13219q0.m37816b("omsdk", "bt onBufferingStart1");
                super.onBufferingStart(str);
                if (this.f39893c != null) {
                    C13219q0.m37816b("omsdk", "bt onBufferingStart");
                    this.f39893c.bufferStart();
                    this.f39905o = true;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public void onBufferingTimeOut(String str) {
            try {
                if ((str.equals(PlayerErrorConstant.PREPARE_TIMEOUT) || str.equals(PlayerErrorConstant.PLAYERING_TIMEOUT)) && this.f39892b != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, BTBaseView.f39709n);
                        jSONObject.put("id", this.f39894d);
                        jSONObject.put("data", new JSONObject());
                        C13392f.m38726a().m38728a(this.f39892b, "onPlayerTimeout", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    } catch (Exception e) {
                        C13893d.m41513c().m41456a(this.f39892b, e.getMessage());
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public void onPlayCompleted() {
            super.onPlayCompleted();
            MBridgeBTVideoView mBridgeBTVideoView = this.f39891a;
            CampaignEx campaignEx = mBridgeBTVideoView.f39712b;
            if (campaignEx == null) {
                mBridgeBTVideoView.f39879r.setText("0");
            } else if (campaignEx.getVideoCompleteTime() > 0) {
                this.f39891a.f39879r.setText(C13203i0.m37707a(C13008c.m36588n().m36542d(), "mbridge_reward_video_view_reward_time_complete", TypedValues.Custom.S_STRING));
            } else {
                this.f39891a.f39879r.setText("0");
            }
            this.f39891a.f39877p.setClickable(false);
            WebView webView = this.f39892b;
            if (webView != null) {
                BTBaseView.m41515a(webView, "onPlayerFinish", this.f39894d);
            }
            MediaEvents mediaEvents = this.f39893c;
            if (mediaEvents != null) {
                mediaEvents.complete();
                C13219q0.m37813a("omsdk", "play:  videoEvents.complete()");
            }
            this.f39896f = this.f39897g;
            boolean unused = MBridgeBTVideoView.f39860P = true;
            this.f39891a.stop();
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public void onPlayError(String str) {
            super.onPlayError(str);
            if (this.f39892b != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, BTBaseView.f39710o);
                    jSONObject.put("id", this.f39894d);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("error", str);
                    jSONObject2.put("id", this.f39894d);
                    jSONObject.put("data", jSONObject2);
                    C13392f.m38726a().m38728a(this.f39892b, "onPlayerFailed", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e) {
                    C13893d.m41513c().m41456a(this.f39892b, e.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public void onPlayProgress(int i, int i2) {
            int videoCompleteTime;
            StringBuilder sb;
            String str;
            String string;
            super.onPlayProgress(i, i2);
            if (MBridgeBTVideoView.f39861Q == 0) {
                long unused = MBridgeBTVideoView.f39861Q = System.currentTimeMillis();
            }
            MBridgeBTVideoView mBridgeBTVideoView = this.f39891a;
            if (mBridgeBTVideoView.f39718h) {
                CampaignEx campaignEx = mBridgeBTVideoView.f39712b;
                if (campaignEx != null) {
                    videoCompleteTime = campaignEx.getVideoCompleteTime();
                    C13084b.m37036b().m37053b(this.f39891a.f39712b.getCampaignUnitId() + "_1", i);
                } else {
                    videoCompleteTime = 0;
                }
                if (videoCompleteTime > i2 || videoCompleteTime <= 0) {
                    videoCompleteTime = i2;
                }
                int i3 = videoCompleteTime <= 0 ? i2 - i : videoCompleteTime - i;
                if (i3 <= 0) {
                    string = videoCompleteTime <= 0 ? "0" : (String) this.f39891a.getContext().getResources().getText(C13203i0.m37707a(C13008c.m36588n().m36542d(), "mbridge_reward_video_view_reward_time_complete", TypedValues.Custom.S_STRING));
                } else {
                    if (videoCompleteTime <= 0) {
                        sb = new StringBuilder();
                        sb.append(i3);
                        str = "";
                    } else {
                        sb = new StringBuilder();
                        sb.append(i3);
                        str = (String) this.f39891a.getContext().getResources().getText(C13203i0.m37707a(C13008c.m36588n().m36542d(), "mbridge_reward_video_view_reward_time_left", TypedValues.Custom.S_STRING));
                    }
                    sb.append(str);
                    string = sb.toString();
                }
                CampaignEx campaignEx2 = this.f39891a.f39712b;
                if (campaignEx2 != null && campaignEx2.getUseSkipTime() == 1) {
                    int iMin = Math.min(this.f39891a.f39712b.getVst(), i2);
                    if (iMin >= videoCompleteTime || iMin < 0) {
                        int i4 = videoCompleteTime - i;
                        if (this.f39891a.f39712b.getAdType() == 287) {
                            if (i4 > 0) {
                                string = i4 + ((String) this.f39891a.getContext().getResources().getText(C13203i0.m37707a(C13008c.m36588n().m36542d(), "mbridge_reward_video_view_reward_time_left_skip_time", TypedValues.Custom.S_STRING)));
                            } else if (i4 == 0) {
                                this.f39891a.f39879r.setVisibility(4);
                            }
                        }
                    } else {
                        int i5 = iMin - i;
                        if (i5 > 0) {
                            string = i5 + ((String) this.f39891a.getContext().getResources().getText(C13203i0.m37707a(C13008c.m36588n().m36542d(), "mbridge_reward_video_view_reward_time_left_skip_time", TypedValues.Custom.S_STRING)));
                        } else if (this.f39891a.f39712b.getAdType() == 287 && i5 == 0) {
                            this.f39891a.f39879r.setVisibility(4);
                        }
                    }
                }
                this.f39891a.f39879r.setText(string);
            }
            this.f39897g = i2;
            this.f39896f = i;
            this.f39891a.f39876O.setMax(this.f39897g);
            this.f39891a.f39876O.setProgress(this.f39896f);
            if (this.f39892b != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, BTBaseView.f39709n);
                    jSONObject.put("id", this.f39894d);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("id", this.f39894d);
                    jSONObject2.put("progress", MBridgeBTVideoView.m41667b(i, i2));
                    jSONObject2.put("time", String.valueOf(i));
                    jSONObject2.put("duration", String.valueOf(i2));
                    jSONObject.put("data", jSONObject2);
                    C13392f.m38726a().m38728a(this.f39892b, "onPlayerProgressChanged", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e) {
                    C13893d.m41513c().m41456a(this.f39892b, e.getMessage());
                }
            }
            MediaEvents mediaEvents = this.f39893c;
            if (mediaEvents != null) {
                int i6 = (i * 100) / i2;
                int i7 = ((i + 1) * 100) / i2;
                if (i6 <= 25 && 25 < i7 && !this.f39899i) {
                    this.f39899i = true;
                    mediaEvents.firstQuartile();
                    C13219q0.m37813a("omsdk", "play:  videoEvents.firstQuartile()");
                } else if (i6 <= 50 && 50 < i7 && !this.f39900j) {
                    this.f39900j = true;
                    mediaEvents.midpoint();
                    C13219q0.m37813a("omsdk", "play:  videoEvents.midpoint()");
                } else if (i6 <= 75 && 75 < i7 && !this.f39901k) {
                    this.f39901k = true;
                    mediaEvents.thirdQuartile();
                    C13219q0.m37813a("omsdk", "play:  videoEvents.thirdQuartile()");
                }
            }
            m41678a(i, i2);
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public void onPlaySetDataSourceError(String str) {
            super.onPlaySetDataSourceError(str);
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public void onPlayStarted(int i) {
            super.onPlayStarted(i);
            if (!this.f39898h) {
                this.f39891a.f39876O.setMax(i);
                WebView webView = this.f39892b;
                if (webView != null) {
                    BTBaseView.m41515a(webView, "onPlayerPlay", this.f39894d);
                }
                this.f39898h = true;
                if (this.f39893c != null) {
                    try {
                        MBridgeBTVideoView mBridgeBTVideoView = this.f39891a;
                        this.f39893c.start(i, (mBridgeBTVideoView == null || mBridgeBTVideoView.f39877p == null) ? 0.0f : this.f39891a.f39877p.getVolume());
                        C13219q0.m37813a("omsdk", "play2: videoEvents.start()");
                    } catch (Exception e) {
                        C13219q0.m37816b("omsdk", e.getMessage());
                    }
                }
            }
            boolean unused = MBridgeBTVideoView.f39860P = false;
        }
    }

    public MBridgeBTVideoView(Context context) {
        super(context);
        this.f39885x = 0;
        this.f39886y = 0;
        this.f39887z = 0;
        this.f39866E = 2;
        this.f39868G = false;
        this.f39869H = 2;
        this.f39870I = 1;
        this.f39872K = false;
        this.f39873L = false;
        this.f39874M = false;
    }

    public MBridgeBTVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f39885x = 0;
        this.f39886y = 0;
        this.f39887z = 0;
        this.f39866E = 2;
        this.f39868G = false;
        this.f39869H = 2;
        this.f39870I = 1;
        this.f39872K = false;
        this.f39873L = false;
        this.f39874M = false;
    }

    /* JADX INFO: renamed from: a */
    private int m41662a(CampaignEx campaignEx) {
        if (campaignEx != null && campaignEx.getReady_rate() != -1) {
            return campaignEx.getReady_rate();
        }
        return C14222b.m42658b().m42661a(C13008c.m36588n().m36533b(), this.f39713c, false).m42758w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static String m41667b(int i, int i2) {
        if (i2 != 0) {
            try {
                return C13229v0.m37873a(Double.valueOf(i / i2)) + "";
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return i2 + "";
    }

    /* JADX INFO: renamed from: d */
    private void m41672d() {
        String str;
        if (this.f39712b.getAdType() == 94 || this.f39712b.getAdType() == 287) {
            str = this.f39712b.getRequestId() + this.f39712b.getId() + this.f39712b.getVideoUrlEncode();
        } else {
            str = this.f39712b.getId() + this.f39712b.getVideoUrlEncode() + this.f39712b.getBidToken();
        }
        C14202a c14202aM42516a = C14203b.getInstance().m42516a(this.f39713c, str);
        if (c14202aM42516a != null) {
            this.f39884w = c14202aM42516a;
        }
    }

    /* JADX INFO: renamed from: e */
    private boolean m41674e() {
        try {
            this.f39877p = (PlayerView) findViewById(findID("mbridge_vfpv"));
            this.f39878q = (SoundImageView) findViewById(findID("mbridge_sound_switch"));
            this.f39879r = (TextView) findViewById(findID("mbridge_tv_count"));
            this.f39880s = findViewById(findID("mbridge_rl_playing_close"));
            this.f39875N = (RelativeLayout) findViewById(findID("mbridge_top_control"));
            this.f39876O = (ProgressBar) findViewById(findID("mbridge_video_progress_bar"));
            this.f39877p.setIsBTVideo(true);
            this.f39881t = (FeedBackButton) findViewById(findID("mbridge_native_endcard_feed_btn"));
            this.f39882u = (ImageView) findViewById(findID("mbridge_iv_link"));
            return isNotNULL(this.f39877p, this.f39878q, this.f39879r, this.f39880s);
        } catch (Throwable th) {
            C13219q0.m37817b(BTBaseView.TAG, th.getMessage(), th);
            return false;
        }
    }

    private int getBufferTimeout() {
        int iM42653i = 5;
        try {
            C14221a c14221aM42670c = C14222b.m42658b().m42670c();
            if (c14221aM42670c == null) {
                C14222b.m42658b().m42660a();
            }
            iM42653i = c14221aM42670c != null ? (int) c14221aM42670c.m42653i() : 5;
            C13219q0.m37818c(BTBaseView.TAG, "MBridgeBaseView buffetTimeout:" + iM42653i);
            return iM42653i;
        } catch (Throwable th) {
            th.printStackTrace();
            return iM42653i;
        }
    }

    private int getCDRate() {
        return C14222b.m42658b().m42661a(C13008c.m36588n().m36533b(), this.f39713c, false).m42722g();
    }

    private String getPlayURL() {
        String videoUrlEncode = "";
        try {
            videoUrlEncode = this.f39712b.getVideoUrlEncode();
            C14202a c14202a = this.f39884w;
            if (c14202a != null) {
                String strM42505p = c14202a.m42505p();
                if (!C13182a1.m37596a(strM42505p) && new File(strM42505p).exists()) {
                    return strM42505p;
                }
            }
            return videoUrlEncode;
        } catch (Throwable th) {
            C13219q0.m37817b(BTBaseView.TAG, th.getMessage(), th);
            return videoUrlEncode;
        }
    }

    @Override // com.mbridge.msdk.video.p291bt.module.BTBaseView
    /* JADX INFO: renamed from: b */
    protected void mo41517b() {
        super.mo41517b();
        if (this.f39718h) {
            this.f39878q.setOnClickListener(new ViewOnClickListenerC13922a());
            this.f39880s.setOnClickListener(new ViewOnClickListenerC13923b());
            setOnClickListener(new ViewOnClickListenerC13924c());
        }
    }

    public AdEvents getAdEvents() {
        return this.f39863B;
    }

    public AdSession getAdSession() {
        return this.f39862A;
    }

    public int getMute() {
        return this.f39866E;
    }

    public MediaEvents getVideoEvents() {
        return this.f39864C;
    }

    @Override // com.mbridge.msdk.video.p291bt.module.BTBaseView
    public void init(Context context) {
        int iFindLayout = findLayout("mbridge_reward_videoview_item");
        if (C13203i0.m37709a(iFindLayout)) {
            this.f39716f.inflate(iFindLayout, this);
            boolean zM41674e = m41674e();
            this.f39718h = zM41674e;
            if (!zM41674e) {
                C13219q0.m37816b(BTBaseView.TAG, "MBridgeVideoView init fail");
            }
            mo41517b();
        }
        f39860P = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        View rootView;
        super.onAttachedToWindow();
        if (!this.f39874M) {
            this.f39869H = C13893d.m41513c().m41482g(this.f39713c);
        }
        View view = this.f39880s;
        if (view != null) {
            view.setVisibility(this.f39886y == 0 ? 8 : 0);
        }
        SoundImageView soundImageView = this.f39878q;
        if (soundImageView != null) {
            soundImageView.setVisibility(this.f39887z == 0 ? 8 : 0);
        }
        CampaignEx campaignEx = this.f39712b;
        if (campaignEx != null) {
            campaignEx.setCampaignUnitId(this.f39713c);
            C13084b.m37036b().m37046a(this.f39713c + "_1", this.f39712b);
        }
        TextView textView = this.f39879r;
        if (textView != null) {
            textView.setVisibility(this.f39885x != 0 ? 0 : 8);
            if (this.f39879r.getVisibility() == 0 && C13084b.m37036b().m37050a()) {
                C13084b.m37036b().m37048a(this.f39713c + "_1", this.f39881t);
            }
        }
        if (this.f39862A == null || (rootView = getRootView()) == null) {
            return;
        }
        this.f39862A.removeFriendlyObstruction(rootView);
    }

    @Override // com.mbridge.msdk.video.p291bt.module.BTBaseView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // com.mbridge.msdk.video.p291bt.module.BTBaseView
    public void onDestory() {
        try {
            if (this.f39877p != null) {
                AdSession adSession = this.f39862A;
                if (adSession != null) {
                    adSession.finish();
                }
                this.f39877p.setOnClickListener(null);
                this.f39877p.release();
                this.f39877p = null;
                if (!TextUtils.isEmpty(this.f39871J)) {
                    C13157e c13157e = new C13157e();
                    long jCurrentTimeMillis = f39861Q;
                    if (jCurrentTimeMillis != 0) {
                        jCurrentTimeMillis = System.currentTimeMillis() - f39861Q;
                    }
                    c13157e.m37501a("duration", Long.valueOf(jCurrentTimeMillis));
                    C13156d.m37475b().m37483a("2000146", this.f39712b, c13157e);
                }
            }
            SoundImageView soundImageView = this.f39878q;
            if (soundImageView != null) {
                soundImageView.setOnClickListener(null);
            }
            View view = this.f39880s;
            if (view != null) {
                view.setOnClickListener(null);
            }
            if (this.f39883v != null) {
                this.f39883v = null;
            }
            if (this.f39862A != null) {
                this.f39862A = null;
            }
            if (this.f39864C != null) {
                this.f39864C = null;
            }
            setOnClickListener(null);
        } catch (Throwable th) {
            C13219q0.m37813a(BTBaseView.TAG, th.getMessage());
        }
    }

    public void onPause() {
        PlayerView playerView = this.f39877p;
        if (playerView != null) {
            boolean zIsPlayIng = playerView.isPlayIng();
            this.f39873L = zIsPlayIng;
            this.f39877p.setIsBTVideoPlaying(zIsPlayIng);
            MediaEvents mediaEvents = this.f39864C;
            if (mediaEvents != null) {
                this.f39877p.setVideoEvents(mediaEvents);
            }
            this.f39877p.onPause();
        }
    }

    public void onResume() {
        PlayerView playerView = this.f39877p;
        if (playerView != null) {
            playerView.setDesk(true);
            this.f39877p.setIsCovered(false);
            if (this.f39873L) {
                this.f39877p.start(true);
            }
            this.f39877p.resumeOMSDK();
        }
    }

    public void onStop() {
        PlayerView playerView = this.f39877p;
        if (playerView != null) {
            playerView.setIsCovered(true);
        }
    }

    public void pause() {
        try {
            PlayerView playerView = this.f39877p;
            if (playerView != null) {
                playerView.pause();
                WebView webView = this.f39883v;
                if (webView != null) {
                    BTBaseView.m41515a(webView, "onPlayerPause", this.f39714d);
                }
            }
        } catch (Exception e) {
            C13219q0.m37817b(BTBaseView.TAG, e.getMessage(), e);
        }
    }

    public void play() {
        C13925d c13925d;
        try {
            if (this.f39874M) {
                if (this.f39868G) {
                    this.f39877p.playVideo(0);
                    this.f39868G = false;
                } else {
                    this.f39877p.start(false);
                }
                try {
                    MediaEvents mediaEvents = this.f39864C;
                    if (mediaEvents != null) {
                        mediaEvents.resume();
                        C13219q0.m37813a("omsdk", "btv play2:  videoEvents.resume()");
                    }
                } catch (Throwable th) {
                    C13219q0.m37813a(BTBaseView.TAG, th.getMessage());
                }
                WebView webView = this.f39883v;
                if (webView != null) {
                    BTBaseView.m41515a(webView, "onPlayerPlay", this.f39714d);
                    return;
                }
                return;
            }
            String playURL = getPlayURL();
            this.f39871J = playURL;
            this.f39877p.initVFPData(playURL, this.f39712b.getVideoUrlEncode(), this.f39865D);
            if (this.f39869H == 1) {
                playMute();
            } else {
                playUnMute();
            }
            try {
                if (this.f39863B != null) {
                    C13219q0.m37816b("omsdk", "bt impressionOccurred");
                    this.f39863B.impressionOccurred();
                }
            } catch (Throwable th2) {
                C13219q0.m37813a(BTBaseView.TAG, th2.getMessage());
            }
            if (!this.f39877p.playVideo() && (c13925d = this.f39865D) != null) {
                c13925d.onPlayError("play video failed");
            }
            this.f39874M = true;
            return;
        } catch (Exception e) {
            C13219q0.m37817b(BTBaseView.TAG, e.getMessage(), e);
        }
        C13219q0.m37817b(BTBaseView.TAG, e.getMessage(), e);
    }

    public boolean playMute() {
        try {
            PlayerView playerView = this.f39877p;
            if (playerView != null && this.f39883v != null) {
                playerView.closeSound();
                this.f39878q.setSoundStatus(false);
                this.f39866E = 1;
                try {
                    MediaEvents mediaEvents = this.f39864C;
                    if (mediaEvents != null) {
                        mediaEvents.volumeChange(0.0f);
                    }
                } catch (Exception e) {
                    C13219q0.m37813a("OMSDK", e.getMessage());
                }
                BTBaseView.m41515a(this.f39883v, "onPlayerMute", this.f39714d);
                return true;
            }
        } catch (Exception e2) {
            C13219q0.m37816b(BTBaseView.TAG, e2.getMessage());
        }
        return false;
    }

    public boolean playUnMute() {
        try {
            PlayerView playerView = this.f39877p;
            if (playerView == null || this.f39883v == null) {
                return false;
            }
            playerView.openSound();
            this.f39878q.setSoundStatus(true);
            this.f39866E = 2;
            try {
                MediaEvents mediaEvents = this.f39864C;
                if (mediaEvents != null) {
                    mediaEvents.volumeChange(1.0f);
                }
            } catch (Exception e) {
                C13219q0.m37813a("OMSDK", e.getMessage());
            }
            BTBaseView.m41515a(this.f39883v, "onUnmute", this.f39714d);
            return true;
        } catch (Exception e2) {
            C13219q0.m37816b(BTBaseView.TAG, e2.getMessage());
            return false;
        }
    }

    public void preLoadData() {
        m41672d();
        this.f39867F = getBufferTimeout();
        String playURL = getPlayURL();
        this.f39871J = playURL;
        if (this.f39718h && !TextUtils.isEmpty(playURL) && this.f39712b != null) {
            AdSession adSession = this.f39862A;
            if (adSession != null) {
                adSession.registerAdView(this.f39877p);
                AdSession adSession2 = this.f39862A;
                SoundImageView soundImageView = this.f39878q;
                FriendlyObstructionPurpose friendlyObstructionPurpose = FriendlyObstructionPurpose.OTHER;
                adSession2.addFriendlyObstruction(soundImageView, friendlyObstructionPurpose, null);
                this.f39862A.addFriendlyObstruction(this.f39879r, friendlyObstructionPurpose, null);
                this.f39862A.addFriendlyObstruction(this.f39880s, FriendlyObstructionPurpose.VIDEO_CONTROLS, null);
            }
            C13925d c13925d = new C13925d(this, this.f39883v, this.f39864C);
            this.f39865D = c13925d;
            c13925d.m41679b(m41662a(this.f39712b), getCDRate());
            this.f39877p.setDesk(false);
            this.f39877p.initBufferIngParam(this.f39867F);
            soundOperate(this.f39866E, -1, null);
        }
        f39860P = false;
    }

    public void resume() {
        try {
            PlayerView playerView = this.f39877p;
            if (playerView != null) {
                if (this.f39868G) {
                    playerView.playVideo(0);
                    this.f39868G = false;
                } else {
                    playerView.onResume();
                }
                try {
                    MediaEvents mediaEvents = this.f39864C;
                    if (mediaEvents != null) {
                        mediaEvents.resume();
                        C13219q0.m37813a("omsdk", "btv play3:  videoEvents.resume()");
                    }
                } catch (Throwable th) {
                    C13219q0.m37813a(BTBaseView.TAG, th.getMessage());
                }
                WebView webView = this.f39883v;
                if (webView != null) {
                    BTBaseView.m41515a(webView, "onPlayerResume", this.f39714d);
                }
            }
        } catch (Exception e) {
            C13219q0.m37816b(BTBaseView.TAG, e.getMessage());
        }
    }

    public void setAdEvents(AdEvents adEvents) {
        this.f39863B = adEvents;
    }

    public void setAdSession(AdSession adSession) {
        this.f39862A = adSession;
    }

    @Override // com.mbridge.msdk.video.p291bt.module.BTBaseView
    public void setCampaign(CampaignEx campaignEx) {
        super.setCampaign(campaignEx);
        if (campaignEx == null || campaignEx.getVideoCompleteTime() <= 0) {
            this.f39879r.setBackgroundResource(C13203i0.m37707a(C13008c.m36588n().m36542d(), "mbridge_reward_shape_progress", "drawable"));
            this.f39879r.setWidth(C13229v0.m37876a(C13008c.m36588n().m36542d(), 30.0f));
            return;
        }
        this.f39879r.setBackgroundResource(C13203i0.m37707a(C13008c.m36588n().m36542d(), "mbridge_reward_video_time_count_num_bg", "drawable"));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, C13229v0.m37876a(C13008c.m36588n().m36542d(), 30.0f));
        int iM37876a = C13229v0.m37876a(C13008c.m36588n().m36542d(), 5.0f);
        layoutParams.setMargins(iM37876a, 0, 0, 0);
        this.f39879r.setPadding(iM37876a, 0, iM37876a, 0);
        this.f39879r.setLayoutParams(layoutParams);
    }

    public void setCloseViewVisable(int i) {
        this.f39880s.setVisibility(i == 0 ? 4 : 0);
    }

    public void setCountDownTextViewVisable(int i) {
        this.f39879r.setVisibility(i == 0 ? 4 : 0);
    }

    public void setCreateWebView(WebView webView) {
        this.f39883v = webView;
    }

    public void setNotchPadding(int i, int i2, int i3, int i4) {
        if (i <= 0) {
            i = this.f39875N.getPaddingLeft();
        }
        if (i2 <= 0) {
            i2 = this.f39875N.getPaddingRight();
        }
        if (i3 <= 0) {
            i3 = this.f39875N.getPaddingTop();
        }
        if (i4 <= 0) {
            i4 = this.f39875N.getPaddingBottom();
        }
        C13219q0.m37816b(BTBaseView.TAG, "NOTCH BTVideoView " + String.format("%1s-%2s-%3s-%4s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)));
        this.f39875N.setPadding(i, i3, i2, i4);
    }

    public void setOrientation(int i) {
        this.f39870I = i;
    }

    public void setPlaybackParams(float f) {
        PlayerView playerView = this.f39877p;
        if (playerView != null) {
            playerView.setPlaybackParams(f);
        }
    }

    public void setProgressBarState(int i) {
        ProgressBar progressBar = this.f39876O;
        if (progressBar != null) {
            progressBar.setVisibility(i == 0 ? 8 : 0);
            CampaignEx campaignEx = this.f39712b;
            if (campaignEx == null || campaignEx.getProgressBarShow() != 1) {
                return;
            }
            this.f39876O.setVisibility(0);
        }
    }

    public void setShowClose(int i) {
        this.f39886y = i;
    }

    public void setShowMute(int i) {
        this.f39887z = i;
    }

    public void setShowTime(int i) {
        this.f39885x = i;
    }

    public void setSoundImageViewVisble(int i) {
        this.f39878q.setVisibility(i == 0 ? 4 : 0);
    }

    public void setVideoEvents(MediaEvents mediaEvents) {
        this.f39864C = mediaEvents;
        C13925d c13925d = this.f39865D;
        if (c13925d != null) {
            c13925d.f39893c = mediaEvents;
        }
        PlayerView playerView = this.f39877p;
        if (playerView != null) {
            playerView.setVideoEvents(mediaEvents);
        }
    }

    public void setVolume(float f, float f2) {
        PlayerView playerView = this.f39877p;
        if (playerView != null) {
            playerView.setVolume(f, f2);
        }
    }

    public void soundOperate(int i, int i2, String str) {
        if (this.f39718h) {
            this.f39866E = i;
            if (i == 1) {
                this.f39878q.setSoundStatus(false);
                this.f39877p.closeSound();
            } else if (i == 2) {
                this.f39878q.setSoundStatus(true);
                this.f39877p.openSound();
            }
            if (i2 == 1) {
                this.f39878q.setVisibility(8);
            } else if (i2 == 2) {
                this.f39878q.setVisibility(0);
            }
            MediaEvents mediaEvents = this.f39864C;
            if (mediaEvents != null) {
                try {
                    mediaEvents.volumeChange(this.f39877p.getVolume());
                } catch (Exception e) {
                    C13219q0.m37816b("omsdk", e.getMessage());
                }
            }
        }
    }

    public void stop() {
        try {
            PlayerView playerView = this.f39877p;
            if (playerView != null) {
                playerView.pause();
                this.f39877p.stop();
                this.f39868G = true;
                WebView webView = this.f39883v;
                if (webView != null) {
                    BTBaseView.m41515a(webView, "onPlayerStop", this.f39714d);
                }
            }
        } catch (Exception e) {
            C13219q0.m37817b(BTBaseView.TAG, e.getMessage(), e);
        }
    }
}
