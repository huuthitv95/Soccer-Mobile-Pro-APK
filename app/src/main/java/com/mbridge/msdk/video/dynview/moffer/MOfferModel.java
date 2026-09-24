package com.mbridge.msdk.video.dynview.moffer;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.work.WorkRequest;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.image.C13100b;
import com.mbridge.msdk.foundation.same.image.InterfaceC13101c;
import com.mbridge.msdk.foundation.same.net.utils.C13119b;
import com.mbridge.msdk.foundation.same.net.utils.C13121d;
import com.mbridge.msdk.foundation.same.net.wrapper.C13126e;
import com.mbridge.msdk.foundation.same.report.metrics.C13154c;
import com.mbridge.msdk.foundation.same.report.metrics.C13156d;
import com.mbridge.msdk.foundation.same.report.metrics.C13157e;
import com.mbridge.msdk.foundation.tools.C13185b1;
import com.mbridge.msdk.foundation.tools.C13188c1;
import com.mbridge.msdk.foundation.tools.C13203i0;
import com.mbridge.msdk.foundation.tools.C13211m0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13229v0;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.setting.C13636h;
import com.mbridge.msdk.system.NoProGuard;
import com.mbridge.msdk.tracker.network.C13837g;
import com.mbridge.msdk.video.dynview.endcard.expose.OnItemExposeListener;
import com.mbridge.msdk.video.dynview.listener.InterfaceC13954g;
import com.mbridge.msdk.video.dynview.p292ui.C13975b;
import com.mbridge.msdk.video.dynview.request.C13970a;
import com.mbridge.msdk.video.dynview.request.C13972b;
import com.mbridge.msdk.video.dynview.request.abs.AbstractC13971a;
import com.mbridge.msdk.video.dynview.widget.MBridgeRelativeLayout;
import com.mbridge.msdk.video.dynview.widget.ObservableScrollView;
import com.mbridge.msdk.video.module.listener.InterfaceC14058a;
import com.mbridge.msdk.videocommon.view.RoundImageView;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class MOfferModel implements NoProGuard {
    private static final String MOF_LOAD_RESULT_CODE_OFFER_LESS_THAN_5 = "12930014";
    private static final String MOF_LOAD_RESULT_FAILED = "2";
    private static final String MOF_LOAD_RESULT_SUCCESS = "1";
    private static final String TAG = "MOfferModel";
    private int admf;
    private int admftm;
    private List<Integer> cacheImpressionReportList;
    private List<Integer> cacheOnlyImpressionReportList;
    private boolean isShowMoreOffer;
    private CampaignUnit mCampaignUnit;
    private Context mContext;
    private LinearLayout mLinearLayout;
    private CampaignEx mMainOfferCampaignEx;
    private InterfaceC13954g mMoreOfferLayoutListener;
    private InterfaceC14058a mNotifyListener;
    private ObservableScrollView mObservableScrollView;
    private C13126e mParam;
    private String mRid;
    private String mUnitId;
    private MBridgeRelativeLayout viewMofferLayout;
    private final String VALUE_MOF_TYPE = "1";
    private final String VALUE_H5_TYPE = "1";
    private final String VALUE_MOF = "1";
    private final String VALUE_COUNTRY_CODE = "CN";
    private final String VALUE_MOF_VER = "1";
    private final String VALUE_OFF_SET = "0";
    private final String VALUE_CATEGORY = "0";
    private final String VALUE_ONLY_IMPRESSION = "1";
    private final String VALUE_PING_MODE = "1";
    private final String VALUE_HTTP_REQ = "2";
    private final String VALUE_AD_NUM = "20";
    private final String VALUE_TNUM = "20";
    private final String VALUE_API_VERSION = "2.3";
    private final String VALUE_DEFAULT_VIDEO_TEMP_ID = "404";

    /* JADX INFO: renamed from: K */
    private final String f39995K = CampaignEx.JSON_KEY_AD_K;
    private final String MOF_TEST_UID = "mof_testuid";
    private final String MCC = "mcc";
    private final String MOF_UID = "mof_uid";
    private final String MNC = "mnc";
    private final String RV_TID = "rv_tid";
    private final String EC_ID = "ecid";
    private final String TP_LGP = "tplgp";
    private final String V_FMD5 = "v_fmd5";
    private final String I_FMD5 = "i_fmd5";
    private final String APP_ID = "app_id";
    private final String SIGN = "sign";
    private final String PARENT_UNIT = "parent_unit";

    /* JADX INFO: renamed from: E */
    private final String f39994E = "e";
    private final String MOF_TYPE = "mof_type";
    private final String H5_TYPE = "h5_type";
    private final String MOF = "mof";
    private final String COUNTRY_CODE = "country_code";
    private final String MOF_VER = "mof_ver";
    private final String CRT_CID = "crt_cid";
    private final String CRT_RID = "crt_rid";
    private final String H5_T = "h5_t";
    private final String MOF_T = "mof_t";
    private final String MOF_DATA = "mof_data";
    private final String OFFER_ID = "offer_id";
    private final String OFF_SET = TypedValues.CycleType.S_WAVE_OFFSET;
    private final String CATEGORY = "category";
    private final String ONLY_IMPRESSION = "only_impression";
    private final String PING_MODE = "ping_mode";
    private final String HTTP_REQ = "http_req";
    private final String AD_NUM = "ad_num";
    private final String TNUM = "tnum";
    private final String API_VERSION = "api_version";
    private final String MOF_DOMAIN = "mof_domain";
    private final String PARENT_ID = "parent_id";
    private final String MOF_PARENT_ID = "mof_parent_id";
    private final String MOF_CALLBACK_DATE = "mcd";
    private final String UC_PARENT_UNIT = "uc_parent_unit";
    private final String DEFAULT_PATH_V3 = "/openapi/ad/v3";
    private final String PARENT_EXCHANGE = "parent_exchange";
    private final String PARENT_AD_TYPE = "parent_ad_type";
    private final String PARENT_TEMPLATE_ID = "parent_template_id";
    private final String ONE_ID = "oneId";
    private final String DY_VIEW = "dy_view";
    private final String MORE_OFFER_DEFAULT_UNIT_ID = "117361";
    private final String MORE_OFFER_DEFAULT_APP_ID = "92762";
    private final String MORE_OFFER_DEFAULT_APP_KEY = "936dcbdd57fe235fd7cf61c2e93da3c4";
    private final String MORE_OFFER_LOAD_SUCCESS = "more offer load success";
    private final String MORE_OFFER_LOAD_FAILED = "more offer load failed";
    private final String MORE_OFFER_SHOW = "more offer show";
    private final String MORE_OFFER_CLICK = "more offer click";
    private final String MORE_OFFER_SHOW_FAILED = "more offer show fail";
    private final String UNIT_ID = MBridgeConstans.PROPERTIES_UNIT_ID;
    private final String R_ID = "r_id";
    private final int DO_ACTION_IMPRESSION = 0;
    private final int DO_ACTION_ONLY_IMPRESSION = 1;
    private volatile boolean hasReportMoreOfferLoad = false;
    private volatile boolean hasReportMoreOfferShow = false;
    private int bitmapSuccessCount = 0;
    private List<Integer> mImpressionId = new ArrayList();
    private int mControlShowSize = 0;
    private boolean isOnlyImpShow = false;
    private boolean mHasReportMofScenes = false;
    private boolean mIsRetry = false;
    private int mFromType = 0;
    private OnItemExposeListener onItemExposeListener = new C13956a();
    private InterfaceC13967c mMoreOfferShowCallBack = new C13957b();

    /* JADX INFO: renamed from: com.mbridge.msdk.video.dynview.moffer.MOfferModel$a */
    class C13956a implements OnItemExposeListener {
        C13956a() {
        }

        @Override // com.mbridge.msdk.video.dynview.endcard.expose.OnItemExposeListener
        public void onItemViewFirstVisible() {
            if (MOfferModel.this.viewMofferLayout == null || !MOfferModel.this.isOnlyImpShow) {
                return;
            }
            if (MOfferModel.this.viewMofferLayout.getVisibility() == 0) {
                try {
                    C13970a.m41816a(MOfferModel.this.mCampaignUnit, 0, 1, "117361");
                    return;
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
            }
            if (MOfferModel.this.cacheOnlyImpressionReportList == null) {
                MOfferModel.this.cacheOnlyImpressionReportList = new ArrayList();
            }
            MOfferModel.this.cacheOnlyImpressionReportList.add(0);
        }

        @Override // com.mbridge.msdk.video.dynview.endcard.expose.OnItemExposeListener
        public void onItemViewVisible(boolean z, int i) {
            if (MOfferModel.this.viewMofferLayout == null) {
                return;
            }
            if (MOfferModel.this.viewMofferLayout.getVisibility() != 0) {
                if (MOfferModel.this.cacheImpressionReportList == null) {
                    MOfferModel.this.cacheImpressionReportList = new ArrayList();
                }
                if (MOfferModel.this.cacheImpressionReportList.contains(Integer.valueOf(i))) {
                    return;
                }
                MOfferModel.this.cacheImpressionReportList.add(Integer.valueOf(i));
                return;
            }
            if (!MOfferModel.this.hasReportMoreOfferShow) {
                C13970a.m41815a(MOfferModel.this.mMainOfferCampaignEx, C13008c.m36588n().m36542d(), "more offer show", MOfferModel.this.mUnitId, MOfferModel.this.mRid);
                MOfferModel.this.hasReportMoreOfferShow = true;
            }
            try {
                C13970a.m41816a(MOfferModel.this.mCampaignUnit, i, 0, "117361");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.dynview.moffer.MOfferModel$b */
    class C13957b implements InterfaceC13967c {
        C13957b() {
        }

        @Override // com.mbridge.msdk.video.dynview.moffer.InterfaceC13967c
        /* JADX INFO: renamed from: a */
        public void mo41783a(List<View> list) {
            TextView textView;
            if (MOfferModel.this.viewMofferLayout == null || (textView = (TextView) MOfferModel.this.viewMofferLayout.findViewById(MOfferModel.this.findID("mbridge_reward_end_card_like_tv"))) == null) {
                return;
            }
            textView.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.dynview.moffer.MOfferModel$c */
    class C13958c extends AbstractC13971a {
        C13958c() {
        }

        @Override // com.mbridge.msdk.video.dynview.request.abs.AbstractC13971a
        /* JADX INFO: renamed from: a */
        public void mo41784a(int i, String str) {
            if (MOfferModel.this.mParam == null) {
                C13965a.m41789a().m41799b();
                return;
            }
            try {
                MOfferModel mOfferModel = MOfferModel.this;
                mOfferModel.mUnitId = mOfferModel.mParam.m37243a().get(MBridgeConstans.PROPERTIES_UNIT_ID);
                MOfferModel mOfferModel2 = MOfferModel.this;
                mOfferModel2.mRid = mOfferModel2.mParam.m37243a().get("r_id");
                if (!MOfferModel.this.hasReportMoreOfferLoad) {
                    C13970a.m41815a(MOfferModel.this.mMainOfferCampaignEx, C13008c.m36588n().m36542d(), "more offer load failed errorCode:" + i + "errorMsg:" + str, MOfferModel.this.mUnitId, MOfferModel.this.mRid);
                    MOfferModel.this.hasReportMoreOfferLoad = true;
                }
                C13157e c13157e = new C13157e();
                c13157e.m37501a("result", "2");
                c13157e.m37501a(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, i + "");
                if (MOfferModel.this.mIsRetry) {
                    c13157e.m37501a("retry", "1");
                }
                C13156d.m37475b().m37483a("m_mof_req_result", MOfferModel.this.mMainOfferCampaignEx, c13157e);
                C13965a.m41789a().m41799b();
            } catch (Exception e) {
                C13219q0.m37816b(MOfferModel.TAG, e.getMessage());
                C13965a.m41789a().m41799b();
            }
        }

        @Override // com.mbridge.msdk.video.dynview.request.abs.AbstractC13971a
        /* JADX INFO: renamed from: a */
        public void mo41785a(List<C13837g> list, CampaignUnit campaignUnit) {
            if (MOfferModel.this.mParam == null || campaignUnit == null) {
                C13965a.m41789a().m41799b();
                return;
            }
            try {
                MOfferModel mOfferModel = MOfferModel.this;
                mOfferModel.mUnitId = mOfferModel.mParam.m37243a().get(MBridgeConstans.PROPERTIES_UNIT_ID);
                MOfferModel mOfferModel2 = MOfferModel.this;
                mOfferModel2.mRid = mOfferModel2.mParam.m37243a().get("r_id");
                if (campaignUnit.getAds() == null || campaignUnit.getAds().size() < 5) {
                    if (!MOfferModel.this.hasReportMoreOfferLoad) {
                        C13970a.m41815a(MOfferModel.this.mMainOfferCampaignEx, C13008c.m36588n().m36542d(), "more offer load failed errorCode: -999 errorMsg: The campaign quantity less than 5.", MOfferModel.this.mUnitId, MOfferModel.this.mRid);
                        MOfferModel.this.hasReportMoreOfferLoad = true;
                    }
                    C13157e c13157e = new C13157e();
                    c13157e.m37501a("result", "2");
                    c13157e.m37501a(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, MOfferModel.MOF_LOAD_RESULT_CODE_OFFER_LESS_THAN_5);
                    if (MOfferModel.this.mIsRetry) {
                        c13157e.m37501a("retry", "1");
                    }
                    C13156d.m37475b().m37483a("m_mof_req_result", MOfferModel.this.mMainOfferCampaignEx, c13157e);
                    C13965a.m41789a().m41799b();
                    return;
                }
                MOfferModel.this.mCampaignUnit = campaignUnit;
                if (MOfferModel.this.admf > 0 && MOfferModel.this.admftm == 1) {
                    MOfferModel.this.doControllableImpOnRequest();
                }
                if (!MOfferModel.this.hasReportMoreOfferLoad) {
                    C13970a.m41815a(MOfferModel.this.mMainOfferCampaignEx, C13008c.m36588n().m36542d(), "more offer load success", MOfferModel.this.mUnitId, MOfferModel.this.mRid);
                    MOfferModel.this.hasReportMoreOfferLoad = true;
                }
                C13157e c13157e2 = new C13157e();
                c13157e2.m37501a("result", "1");
                if (MOfferModel.this.mIsRetry) {
                    c13157e2.m37501a("retry", "1");
                }
                C13156d.m37475b().m37483a("m_mof_req_result", MOfferModel.this.mMainOfferCampaignEx, c13157e2);
                MOfferModel.this.createMoreOfferView();
            } catch (Exception e) {
                C13219q0.m37816b(MOfferModel.TAG, e.getMessage());
                C13965a.m41789a().m41799b();
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.dynview.moffer.MOfferModel$d */
    class C13959d implements InterfaceC13966b {
        C13959d() {
        }

        @Override // com.mbridge.msdk.video.dynview.moffer.InterfaceC13966b
        /* JADX INFO: renamed from: a */
        public void mo41786a() {
            try {
                if (MOfferModel.this.cacheImpressionReportList != null) {
                    for (int i = 0; i < MOfferModel.this.cacheImpressionReportList.size(); i++) {
                        if (!MOfferModel.this.hasReportMoreOfferShow) {
                            C13970a.m41815a(MOfferModel.this.mMainOfferCampaignEx, MOfferModel.this.mContext, "more offer show", MOfferModel.this.mUnitId, MOfferModel.this.mRid);
                            MOfferModel.this.hasReportMoreOfferShow = true;
                        }
                        C13970a.m41816a(MOfferModel.this.mCampaignUnit, ((Integer) MOfferModel.this.cacheImpressionReportList.get(i)).intValue(), 0, "117361");
                    }
                }
                if (!MOfferModel.this.isOnlyImpShow && MOfferModel.this.cacheOnlyImpressionReportList != null) {
                    for (int i2 = 0; i2 < MOfferModel.this.cacheOnlyImpressionReportList.size(); i2++) {
                        C13970a.m41816a(MOfferModel.this.mCampaignUnit, ((Integer) MOfferModel.this.cacheOnlyImpressionReportList.get(i2)).intValue(), 1, "117361");
                    }
                }
                MOfferModel.this.release();
            } catch (Exception e) {
                C13219q0.m37816b(MOfferModel.TAG, e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.dynview.moffer.MOfferModel$e */
    class C13960e implements InterfaceC13968d {
        C13960e() {
        }

        @Override // com.mbridge.msdk.video.dynview.moffer.InterfaceC13968d
        /* JADX INFO: renamed from: a */
        public void mo41787a() {
            if (MOfferModel.this.viewMofferLayout != null && MOfferModel.this.viewMofferLayout.getVisibility() != 0) {
                C13970a.m41815a(MOfferModel.this.mMainOfferCampaignEx, MOfferModel.this.mContext, "more offer show fail", MOfferModel.this.mUnitId, MOfferModel.this.mRid);
            }
            MOfferModel.this.release();
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.dynview.moffer.MOfferModel$f */
    class ViewOnTouchListenerC13961f implements View.OnTouchListener {
        ViewOnTouchListenerC13961f() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() != 1) {
                return false;
            }
            MOfferModel.this.checkViewVisiableState();
            return false;
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.dynview.moffer.MOfferModel$g */
    class ViewOnClickListenerC13962g implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f40002a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ View f40003b;

        ViewOnClickListenerC13962g(int i, View view) {
            this.f40002a = i;
            this.f40003b = view;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CampaignEx campaignEx;
            try {
                if (MOfferModel.this.mCampaignUnit == null || MOfferModel.this.mCampaignUnit.ads == null || MOfferModel.this.mCampaignUnit.ads.size() <= 0 || (campaignEx = MOfferModel.this.mCampaignUnit.ads.get(this.f40002a)) == null) {
                    return;
                }
                if (MOfferModel.this.mNotifyListener != null) {
                    MOfferModel mOfferModel = MOfferModel.this;
                    mOfferModel.callBackClick(mOfferModel.mNotifyListener);
                }
                campaignEx.setLocalRequestId(MOfferModel.this.mCampaignUnit.getLocalRequestId());
                C13970a.m41815a(MOfferModel.this.mMainOfferCampaignEx, C13008c.m36588n().m36542d(), "more offer click", MOfferModel.this.mUnitId, MOfferModel.this.mRid);
                C13970a.m41814a(C13008c.m36588n().m36542d(), campaignEx, MOfferModel.this.mUnitId, this.f40003b);
            } catch (Exception e) {
                C13219q0.m37816b(MOfferModel.TAG, e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.dynview.moffer.MOfferModel$h */
    class C13963h implements InterfaceC13101c {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ RoundImageView f40005a;

        C13963h(RoundImageView roundImageView) {
            this.f40005a = roundImageView;
        }

        @Override // com.mbridge.msdk.foundation.same.image.InterfaceC13101c
        public void onFailedLoad(String str, String str2) {
        }

        @Override // com.mbridge.msdk.foundation.same.image.InterfaceC13101c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            try {
                if (this.f40005a != null && bitmap != null && !bitmap.isRecycled()) {
                    this.f40005a.setBorderRadius(13);
                    this.f40005a.setImageBitmap(bitmap);
                }
                MOfferModel.access$2208(MOfferModel.this);
                if (MOfferModel.this.isShowMoreOffer || MOfferModel.this.bitmapSuccessCount < 5 || MOfferModel.this.mMoreOfferShowCallBack == null) {
                    return;
                }
                MOfferModel.this.isShowMoreOffer = true;
                MOfferModel.this.mMoreOfferShowCallBack.mo41783a(null);
            } catch (Exception e) {
                C13219q0.m37816b(MOfferModel.TAG, e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.dynview.moffer.MOfferModel$i */
    class ViewOnClickListenerC13964i implements View.OnClickListener {
        ViewOnClickListenerC13964i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (MOfferModel.this.mObservableScrollView != null) {
                if (MOfferModel.this.mObservableScrollView.getVisibility() == 0) {
                    MOfferModel.this.mObservableScrollView.setVisibility(8);
                } else {
                    MOfferModel.this.mObservableScrollView.setVisibility(0);
                }
            }
            try {
                new C13975b().m41856c(MOfferModel.this.mLinearLayout, 300L);
            } catch (Exception e) {
                C13219q0.m37816b(MOfferModel.TAG, e.getMessage());
            }
        }
    }

    static /* synthetic */ int access$2208(MOfferModel mOfferModel) {
        int i = mOfferModel.bitmapSuccessCount;
        mOfferModel.bitmapSuccessCount = i + 1;
        return i;
    }

    private void addLikeTextView() {
        TextView textView;
        MBridgeRelativeLayout mBridgeRelativeLayout = this.viewMofferLayout;
        if (mBridgeRelativeLayout == null || (textView = (TextView) mBridgeRelativeLayout.findViewById(findID("mbridge_reward_end_card_like_tv"))) == null) {
            return;
        }
        textView.setTextColor(Color.parseColor("#FF000000"));
        textView.setTextSize(10.0f);
        if (C13211m0.m37763p(C13008c.m36588n().m36542d()).contains("zh")) {
            textView.setEms(1);
            textView.getLayoutParams().width = C13229v0.m37876a(C13008c.m36588n().m36542d(), 30.0f);
            textView.setText("猜你喜欢");
        } else {
            textView.setText("Just\nfor\nYou");
        }
        textView.setOnClickListener(new ViewOnClickListenerC13964i());
    }

    private View buildItemView(int i) {
        C13154c c13154cM37478a;
        Context context = this.mContext;
        if (context == null) {
            return null;
        }
        View viewInflate = LayoutInflater.from(this.mContext).inflate(C13203i0.m37707a(context, "mbridge_reward_end_card_more_offer_item", "layout"), (ViewGroup) null, false);
        int iM37707a = C13203i0.m37707a(this.mContext, "mbridge_reward_end_card_item_iv", "id");
        if (viewInflate == null) {
            return null;
        }
        setOfferData(this.mCampaignUnit.getAds(), i, (RoundImageView) viewInflate.findViewById(iM37707a), (TextView) viewInflate.findViewById(C13203i0.m37707a(this.mContext, "mbridge_reward_end_card_item_title_tv", "id")));
        CampaignEx campaignEx = this.mCampaignUnit.getAds().get(0);
        C13157e c13157e = new C13157e();
        c13157e.m37501a("adtp", 295);
        if (TextUtils.isEmpty(campaignEx.getBidToken())) {
            c13157e.m37501a(CampaignEx.JSON_KEY_HB, 0);
        } else {
            c13157e.m37501a(CampaignEx.JSON_KEY_HB, 1);
        }
        if (TextUtils.isEmpty(this.mCampaignUnit.getLocalRequestId())) {
            c13154cM37478a = C13156d.m37475b().m37478a(false, campaignEx.getBidToken(), c13157e, campaignEx, this.mUnitId);
        } else {
            campaignEx.setLocalRequestId(this.mCampaignUnit.getLocalRequestId());
            c13154cM37478a = C13156d.m37475b().m37489b(this.mCampaignUnit.getLocalRequestId());
        }
        C13185b1.m37632a(viewInflate, c13154cM37478a.m37463t(), campaignEx.getLocalAllowTrackClick());
        this.mCampaignUnit.setLocalRequestId(c13154cM37478a.m37463t());
        viewInflate.setOnClickListener(new ViewOnClickListenerC13962g(i, viewInflate));
        return viewInflate;
    }

    private void buildRequestParams(CampaignEx campaignEx) {
        String strM39527k;
        String str;
        if (campaignEx == null) {
            return;
        }
        this.mParam = new C13126e();
        String campaignUnitId = campaignEx.getCampaignUnitId();
        String id = campaignEx.getId();
        String requestIdNotice = campaignEx.getRequestIdNotice();
        campaignEx.getRequestId();
        String strM37645a = C13188c1.m37645a(campaignEx.getendcard_url(), "mof_testuid");
        if (TextUtils.isEmpty(strM37645a)) {
            strM37645a = C13188c1.m37645a(campaignEx.getendcard_url(), "mof_uid");
        }
        String strM36533b = C13008c.m36588n().m36533b();
        try {
            strM39527k = (TextUtils.isEmpty(strM36533b) || C13636h.m39706b().m39718d(strM36533b) == null) ? "CN" : C13636h.m39706b().m39718d(strM36533b).m39527k();
        } catch (Exception unused) {
        }
        String strM37645a2 = C13188c1.m37645a(campaignEx.getendcard_url(), "mcc");
        String strM37645a3 = C13188c1.m37645a(campaignEx.getendcard_url(), "mnc");
        String strM37645a4 = C13188c1.m37645a(campaignEx.getendcard_url(), "rv_tid");
        String strM37645a5 = campaignEx.getendcard_url().contains("ecid") ? C13188c1.m37645a(campaignEx.getendcard_url(), "ecid") : String.valueOf(campaignEx.getEcTemplateId());
        String str2 = strM37645a;
        String strM37645a6 = C13188c1.m37645a(campaignEx.getendcard_url(), "tplgp");
        String str3 = strM39527k;
        String strM37645a7 = C13188c1.m37645a(campaignEx.getendcard_url(), "v_fmd5");
        String strM37645a8 = C13188c1.m37645a(campaignEx.getendcard_url(), "i_fmd5");
        C13119b.m37209a(this.mParam, "app_id", C13008c.m36588n().m36533b());
        C13119b.m37209a(this.mParam, "sign", SameMD5.getMD5(strM36533b + C13008c.m36588n().m36538c()));
        String str4 = "";
        C13119b.m37209a(this.mParam, "r_id", TextUtils.isEmpty(requestIdNotice) ? "" : requestIdNotice);
        C13119b.m37209a(this.mParam, "e", Arrays.toString(new String[]{id}));
        C13119b.m37209a(this.mParam, "mof_type", "1");
        C13119b.m37209a(this.mParam, "h5_type", "1");
        C13119b.m37209a(this.mParam, "mof", "1");
        C13119b.m37209a(this.mParam, "country_code", TextUtils.isEmpty(str3) ? "CN" : str3);
        C13119b.m37209a(this.mParam, "mof_ver", "1");
        this.mParam.m37245a("parent_exchange", "");
        int adType = campaignEx.getAdType();
        if (adType == 94) {
            str4 = "rewarded_video";
        } else if (adType == 287) {
            str4 = "interstitial_video";
        }
        this.mParam.m37245a("parent_ad_type", str4);
        this.mParam.m37245a("oneId", campaignEx.getReq_ext_data());
        if (TextUtils.isEmpty(strM37645a5)) {
            this.mParam.m37245a("parent_template_id", "404");
        } else {
            this.mParam.m37245a("parent_template_id", strM37645a5);
        }
        if (TextUtils.isEmpty(str2)) {
            C13119b.m37209a(this.mParam, "uc_parent_unit", campaignUnitId);
        } else {
            C13119b.m37209a(this.mParam, "parent_unit", campaignUnitId);
        }
        C13119b.m37209a(this.mParam, "mnc", strM37645a3);
        C13119b.m37209a(this.mParam, "mcc", strM37645a2);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("crt_cid", id);
            jSONObject.put("crt_rid", requestIdNotice);
            jSONObject.put("rv_tid", strM37645a4);
            jSONObject.put("ecid", strM37645a5);
            jSONObject.put("tplgp", strM37645a6);
            jSONObject.put("v_fmd5", strM37645a7);
            jSONObject.put("i_fmd5", strM37645a8);
            jSONObject.put("h5_t", 1);
            jSONObject.put("mof_t", 1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        C13119b.m37209a(this.mParam, "mof_data", jSONObject.toString());
        C13119b.m37209a(this.mParam, "offer_id", id);
        C13119b.m37209a(this.mParam, TypedValues.CycleType.S_WAVE_OFFSET, "0");
        C13119b.m37209a(this.mParam, "category", "0");
        C13119b.m37209a(this.mParam, "only_impression", "1");
        C13119b.m37209a(this.mParam, "ping_mode", "1");
        C13119b.m37209a(this.mParam, "http_req", "2");
        C13119b.m37209a(this.mParam, "ad_num", "20");
        C13119b.m37209a(this.mParam, "tnum", "20");
        C13119b.m37209a(this.mParam, "api_version", "2.3");
        if (TextUtils.isEmpty(str2)) {
            C13119b.m37209a(this.mParam, "app_id", "92762");
            C13119b.m37209a(this.mParam, "sign", SameMD5.getMD5("92762936dcbdd57fe235fd7cf61c2e93da3c4"));
            str = "117361";
        } else {
            str = str2;
        }
        C13119b.m37209a(this.mParam, MBridgeConstans.PROPERTIES_UNIT_ID, str);
        C13119b.m37209a(this.mParam, "dy_view", "1");
    }

    private void buildScrollViewGroup() {
        if (this.mContext == null || this.viewMofferLayout == null || this.mMainOfferCampaignEx == null) {
            return;
        }
        this.mLinearLayout = new LinearLayout(this.mContext);
        this.mLinearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
        this.mLinearLayout.setOrientation(0);
        this.mLinearLayout.setGravity(17);
        for (int i = 0; i < this.mCampaignUnit.ads.size(); i++) {
            View viewBuildItemView = buildItemView(i);
            if (viewBuildItemView != null) {
                this.mLinearLayout.addView(viewBuildItemView);
            }
        }
        this.mObservableScrollView.addView(this.mLinearLayout);
        this.mObservableScrollView.setOnTouchListener(new ViewOnTouchListenerC13961f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void callBackClick(InterfaceC14058a interfaceC14058a) {
        if (interfaceC14058a == null) {
            return;
        }
        interfaceC14058a.mo41600a(128, "");
    }

    private void createMoreOfferList() {
        MBridgeRelativeLayout mBridgeRelativeLayout = this.viewMofferLayout;
        if (mBridgeRelativeLayout == null) {
            return;
        }
        this.mObservableScrollView = (ObservableScrollView) mBridgeRelativeLayout.findViewById(findID("mbridge_moreoffer_hls"));
        buildScrollViewGroup();
        addLikeTextView();
        showView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void createMoreOfferView() {
        CampaignUnit campaignUnit = this.mCampaignUnit;
        if (campaignUnit == null || this.mContext == null || campaignUnit.getAds() == null || this.mCampaignUnit.getAds().size() == 0) {
            return;
        }
        setMoreOfferLayoutCallBack();
        createMoreOfferList();
    }

    private void doAdmfContorl() {
        JSONObject jSONObject;
        try {
            CampaignEx campaignEx = this.mMainOfferCampaignEx;
            if (campaignEx != null && !TextUtils.isEmpty(campaignEx.getMoreOfferJsonData())) {
                JSONObject jSONObject2 = new JSONObject(this.mMainOfferCampaignEx.getMoreOfferJsonData());
                int i = this.mFromType;
                if (i != 1) {
                    jSONObject = i != 2 ? null : jSONObject2.getJSONObject(CampaignEx.ENDCARD_URL);
                } else {
                    jSONObject = jSONObject2.getJSONObject("template_url");
                }
                if (jSONObject == null) {
                    return;
                }
                if (jSONObject.has(MBridgeConstans.DYNAMIC_VIEW_MORE_OFFER_ADMFTM)) {
                    this.admftm = jSONObject.getInt(MBridgeConstans.DYNAMIC_VIEW_MORE_OFFER_ADMFTM);
                }
                if (jSONObject.has(MBridgeConstans.DYNAMIC_VIEW_MORE_OFFER_ADMF)) {
                    this.admf = jSONObject.getInt(MBridgeConstans.DYNAMIC_VIEW_MORE_OFFER_ADMF);
                }
            }
        } catch (Exception e) {
            C13219q0.m37816b(TAG, e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doControllableImpOnRequest() {
        CampaignUnit campaignUnit = this.mCampaignUnit;
        if (campaignUnit == null) {
            return;
        }
        try {
            C13970a.m41816a(campaignUnit, 0, 1, "117361");
            this.isOnlyImpShow = true;
            if (this.mCampaignUnit.getAds() == null) {
                return;
            }
            int size = this.mCampaignUnit.getAds().size();
            if (this.admf >= size) {
                this.admf = size;
            }
            if (this.mImpressionId == null) {
                this.mImpressionId = new ArrayList();
            }
            for (int i = 0; i < this.admf; i++) {
                if (!this.mImpressionId.contains(Integer.valueOf(i))) {
                    C13970a.m41816a(this.mCampaignUnit, i, 0, "117361");
                    this.mImpressionId.add(Integer.valueOf(i));
                }
            }
        } catch (Exception e) {
            C13219q0.m37816b(TAG, e.getMessage());
        }
    }

    private void doControllableImpOnShow(int i) {
        CampaignUnit campaignUnit = this.mCampaignUnit;
        if (campaignUnit == null || campaignUnit.getAds() == null) {
            return;
        }
        try {
            int size = this.mCampaignUnit.getAds().size();
            if (this.mControlShowSize == 0) {
                this.mControlShowSize = this.admf + i;
            }
            if (this.mControlShowSize >= size) {
                this.mControlShowSize = size;
            }
            while (i < this.mControlShowSize) {
                if (!this.mImpressionId.contains(Integer.valueOf(i))) {
                    C13970a.m41816a(this.mCampaignUnit, i, 0, "117361");
                    this.mImpressionId.add(Integer.valueOf(i));
                }
                i++;
            }
        } catch (Exception e) {
            C13219q0.m37816b(TAG, e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int findID(String str) {
        return C13203i0.m37707a(C13008c.m36588n().m36542d(), str, "id");
    }

    private void initData() {
        CampaignEx campaignEx = this.mMainOfferCampaignEx;
        if (campaignEx == null || this.mContext == null) {
            return;
        }
        buildRequestParams(campaignEx);
        if (this.mParam == null) {
            return;
        }
        C13972b c13972b = new C13972b(this.mContext);
        C13958c c13958c = new C13958c();
        String str = C13121d.m37226h().f36017Z;
        if (!TextUtils.isEmpty(this.mMainOfferCampaignEx.getReq_ext_data())) {
            try {
                JSONObject jSONObject = new JSONObject(this.mMainOfferCampaignEx.getReq_ext_data());
                String strOptString = jSONObject.optString("mof_domain");
                if (!TextUtils.isEmpty(strOptString)) {
                    str = strOptString + "/openapi/ad/v3";
                }
                String strOptString2 = jSONObject.optString("parent_id");
                if (!TextUtils.isEmpty(strOptString2)) {
                    C13119b.m37209a(this.mParam, "mof_parent_id", strOptString2);
                }
                String strOptString3 = jSONObject.optString("oneId");
                if (!TextUtils.isEmpty(strOptString3)) {
                    C13119b.m37209a(this.mParam, "oneId", strOptString3);
                }
                String strOptString4 = jSONObject.optString("mcd");
                if (!TextUtils.isEmpty(strOptString4)) {
                    C13119b.m37209a(this.mParam, "mcd", strOptString4);
                }
                c13958c.setUnitId(this.mMainOfferCampaignEx.getCampaignUnitId());
            } catch (Exception e) {
                C13219q0.m37816b(TAG, e.getMessage());
                str = C13121d.m37226h().f36017Z;
            }
        }
        String str2 = str;
        C13157e c13157e = new C13157e();
        if (this.mIsRetry) {
            c13157e.m37501a("retry", "1");
        }
        C13156d.m37475b().m37483a("m_mof_initiate", this.mMainOfferCampaignEx, c13157e);
        c13972b.getLoadOrSetting(1, str2, this.mParam, c13958c, true, "more_offer", WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS);
        doAdmfContorl();
    }

    private void initView() {
        Context context = this.mContext;
        if (context == null) {
            return;
        }
        this.viewMofferLayout = (MBridgeRelativeLayout) LayoutInflater.from(this.mContext).inflate(C13203i0.m37707a(context, "mbridge_reward_more_offer_view", "layout"), (ViewGroup) null, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void release() {
        List<Integer> list = this.cacheImpressionReportList;
        if (list != null) {
            list.clear();
            this.cacheImpressionReportList = null;
        }
        List<Integer> list2 = this.cacheOnlyImpressionReportList;
        if (list2 != null) {
            list2.clear();
            this.cacheOnlyImpressionReportList = null;
        }
    }

    private void setCallbackForLogicVisibleView(View view, int i) {
        if (view == null) {
            return;
        }
        try {
            Rect rect = new Rect();
            boolean globalVisibleRect = view.getGlobalVisibleRect(rect);
            boolean z = rect.width() > view.getMeasuredWidth() / 5;
            if (!globalVisibleRect || !z) {
                if (this.admf != 0) {
                    doControllableImpOnShow(i);
                    return;
                }
                return;
            }
            List<Integer> list = this.mImpressionId;
            if (list != null && this.onItemExposeListener != null && !list.contains(Integer.valueOf(i))) {
                this.mImpressionId.add(Integer.valueOf(i));
                this.onItemExposeListener.onItemViewVisible(true, i);
            }
        } catch (Exception e) {
            C13219q0.m37816b(TAG, e.getMessage());
        }
    }

    private void setMoreOfferLayoutCallBack() {
        MBridgeRelativeLayout mBridgeRelativeLayout = this.viewMofferLayout;
        if (mBridgeRelativeLayout == null) {
            return;
        }
        mBridgeRelativeLayout.setMoreOfferCacheReportCallBack(new C13959d());
        this.viewMofferLayout.setMoreOfferShowFailedCallBack(new C13960e());
    }

    private void setOfferData(List<CampaignEx> list, int i, RoundImageView roundImageView, TextView textView) {
        CampaignEx campaignEx;
        if (roundImageView == null || textView == null || list == null || this.mContext == null || this.mMainOfferCampaignEx == null || list.size() <= 0 || (campaignEx = list.get(i)) == null) {
            return;
        }
        roundImageView.setImageDrawable(null);
        C13100b.m37152a(this.mContext).m37155a(campaignEx.getIconUrl(), new C13963h(roundImageView));
        if (TextUtils.isEmpty(campaignEx.getAppName())) {
            return;
        }
        String strM37645a = C13188c1.m37645a(this.mMainOfferCampaignEx.getendcard_url(), "mof_textmod");
        if (TextUtils.isEmpty(strM37645a) || !strM37645a.equals("1")) {
            textView.setVisibility(8);
        } else {
            textView.setText(campaignEx.getAppName());
        }
    }

    public void buildMofferAd(CampaignEx campaignEx) {
        Context contextM36542d = C13008c.m36588n().m36542d();
        this.mContext = contextM36542d;
        if (contextM36542d == null) {
            return;
        }
        this.mMainOfferCampaignEx = campaignEx;
        initView();
        initData();
    }

    public void checkViewVisiableState() {
        if (this.mLinearLayout == null) {
            return;
        }
        for (int i = 0; i < this.mLinearLayout.getChildCount(); i++) {
            try {
                setCallbackForLogicVisibleView(this.mLinearLayout.getChildAt(i), i);
            } catch (Exception e) {
                C13219q0.m37816b(TAG, e.getMessage());
                return;
            }
        }
    }

    public long getECParentTemplateCode() {
        try {
            C13126e c13126e = this.mParam;
            String str = c13126e != null ? c13126e.m37243a().get("parent_template_id") : "";
            if (TextUtils.isEmpty(str)) {
                return 404L;
            }
            return Long.parseLong(str);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
            return 404L;
        }
    }

    public CampaignEx getmMainOfferCampaignEx() {
        return this.mMainOfferCampaignEx;
    }

    public void mofDestroy() {
        if (this.mMoreOfferLayoutListener != null) {
            this.mMoreOfferLayoutListener = null;
        }
        if (this.onItemExposeListener != null) {
            this.onItemExposeListener = null;
        }
        if (this.mMoreOfferShowCallBack != null) {
            this.mMoreOfferShowCallBack = null;
        }
        if (this.mNotifyListener != null) {
            this.mNotifyListener = null;
        }
    }

    public void setFromType(int i) {
        this.mFromType = i;
    }

    public void setIsRetry(boolean z) {
        this.mIsRetry = z;
    }

    public void setMoreOfferListener(InterfaceC13954g interfaceC13954g, InterfaceC14058a interfaceC14058a) {
        this.mMoreOfferLayoutListener = interfaceC13954g;
        this.mNotifyListener = interfaceC14058a;
    }

    public void showView() {
        CampaignUnit campaignUnit;
        InterfaceC13954g interfaceC13954g = this.mMoreOfferLayoutListener;
        if (interfaceC13954g == null) {
            return;
        }
        MBridgeRelativeLayout mBridgeRelativeLayout = this.viewMofferLayout;
        if (mBridgeRelativeLayout == null || (campaignUnit = this.mCampaignUnit) == null) {
            interfaceC13954g.mo41781a(-1, "more Offer create fail");
            return;
        }
        interfaceC13954g.mo41782a(mBridgeRelativeLayout, campaignUnit);
        if (!this.isOnlyImpShow) {
            C13970a.m41816a(this.mCampaignUnit, 0, 1, "117361");
        }
        if (this.mHasReportMofScenes) {
            return;
        }
        C13157e c13157e = new C13157e();
        c13157e.m37501a("scene", this.mFromType + "");
        C13156d.m37475b().m37483a("m_mof_scenes", this.mMainOfferCampaignEx, c13157e);
    }
}
